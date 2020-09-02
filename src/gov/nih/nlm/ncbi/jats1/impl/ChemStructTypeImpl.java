/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.BreakType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.DefListType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.ListType;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
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
 * An implementation of the model object '<em><b>Chem Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getChemStructElements <em>Chem Struct Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ChemStructTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChemStructTypeImpl extends MinimalEObjectImpl.Container implements ChemStructType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChemStructTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getChemStructType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.CHEM_STRUCT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getChemStructElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getChemStructType_ChemStructElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltTextType> getAltText() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_AltText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongDescType> getLongDesc() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_LongDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BreakType> getBreak() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Break());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabelType> getLabel() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefListType> getDefList() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_DefList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListType> getList() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getChemStructElements().list(Jats1Package.eINSTANCE.getChemStructType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CHEM_STRUCT_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CHEM_STRUCT_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CHEM_STRUCT_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CHEM_STRUCT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case Jats1Package.CHEM_STRUCT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__CHEM_STRUCT_ELEMENTS:
				return ((InternalEList<?>)getChemStructElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__ALT_TEXT:
				return ((InternalEList<?>)getAltText()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__LONG_DESC:
				return ((InternalEList<?>)getLongDesc()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__DEF_LIST:
				return ((InternalEList<?>)getDefList()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.CHEM_STRUCT_TYPE__SUP:
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
			case Jats1Package.CHEM_STRUCT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.CHEM_STRUCT_TYPE__CHEM_STRUCT_ELEMENTS:
				if (coreType) return getChemStructElements();
				return ((FeatureMap.Internal)getChemStructElements()).getWrapper();
			case Jats1Package.CHEM_STRUCT_TYPE__ALT_TEXT:
				return getAltText();
			case Jats1Package.CHEM_STRUCT_TYPE__LONG_DESC:
				return getLongDesc();
			case Jats1Package.CHEM_STRUCT_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.CHEM_STRUCT_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.CHEM_STRUCT_TYPE__URI:
				return getUri();
			case Jats1Package.CHEM_STRUCT_TYPE__BREAK:
				return getBreak();
			case Jats1Package.CHEM_STRUCT_TYPE__BOLD:
				return getBold();
			case Jats1Package.CHEM_STRUCT_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.CHEM_STRUCT_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.CHEM_STRUCT_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.CHEM_STRUCT_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.CHEM_STRUCT_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.CHEM_STRUCT_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.CHEM_STRUCT_TYPE__SC:
				return getSc();
			case Jats1Package.CHEM_STRUCT_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.CHEM_STRUCT_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.CHEM_STRUCT_TYPE__RUBY:
				return getRuby();
			case Jats1Package.CHEM_STRUCT_TYPE__LABEL:
				return getLabel();
			case Jats1Package.CHEM_STRUCT_TYPE__DEF_LIST:
				return getDefList();
			case Jats1Package.CHEM_STRUCT_TYPE__LIST:
				return getList();
			case Jats1Package.CHEM_STRUCT_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.CHEM_STRUCT_TYPE__MATH:
				return getMath();
			case Jats1Package.CHEM_STRUCT_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.CHEM_STRUCT_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.CHEM_STRUCT_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.CHEM_STRUCT_TYPE__ARRAY:
				return getArray();
			case Jats1Package.CHEM_STRUCT_TYPE__CODE:
				return getCode();
			case Jats1Package.CHEM_STRUCT_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.CHEM_STRUCT_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.CHEM_STRUCT_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.CHEM_STRUCT_TYPE__FN:
				return getFn();
			case Jats1Package.CHEM_STRUCT_TYPE__TARGET:
				return getTarget();
			case Jats1Package.CHEM_STRUCT_TYPE__XREF:
				return getXref();
			case Jats1Package.CHEM_STRUCT_TYPE__SUB:
				return getSub();
			case Jats1Package.CHEM_STRUCT_TYPE__SUP:
				return getSup();
			case Jats1Package.CHEM_STRUCT_TYPE__ACTUATE:
				return getActuate();
			case Jats1Package.CHEM_STRUCT_TYPE__BASE:
				return getBase();
			case Jats1Package.CHEM_STRUCT_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.CHEM_STRUCT_TYPE__HREF:
				return getHref();
			case Jats1Package.CHEM_STRUCT_TYPE__ID:
				return getId();
			case Jats1Package.CHEM_STRUCT_TYPE__LANG:
				return getLang();
			case Jats1Package.CHEM_STRUCT_TYPE__ROLE:
				return getRole();
			case Jats1Package.CHEM_STRUCT_TYPE__SHOW:
				return getShow();
			case Jats1Package.CHEM_STRUCT_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.CHEM_STRUCT_TYPE__TITLE:
				return getTitle();
			case Jats1Package.CHEM_STRUCT_TYPE__TYPE:
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
			case Jats1Package.CHEM_STRUCT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__CHEM_STRUCT_ELEMENTS:
				((FeatureMap.Internal)getChemStructElements()).set(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ALT_TEXT:
				getAltText().clear();
				getAltText().addAll((Collection<? extends AltTextType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LONG_DESC:
				getLongDesc().clear();
				getLongDesc().addAll((Collection<? extends LongDescType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends BreakType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__DEF_LIST:
				getDefList().clear();
				getDefList().addAll((Collection<? extends DefListType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__HREF:
				setHref((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TYPE:
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
			case Jats1Package.CHEM_STRUCT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__CHEM_STRUCT_ELEMENTS:
				getChemStructElements().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ALT_TEXT:
				getAltText().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LONG_DESC:
				getLongDesc().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__BREAK:
				getBreak().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LABEL:
				getLabel().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__DEF_LIST:
				getDefList().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LIST:
				getList().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ACTUATE:
				unsetActuate();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SHOW:
				unsetShow();
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Jats1Package.CHEM_STRUCT_TYPE__TYPE:
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
			case Jats1Package.CHEM_STRUCT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__CHEM_STRUCT_ELEMENTS:
				return !getChemStructElements().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__ALT_TEXT:
				return !getAltText().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__LONG_DESC:
				return !getLongDesc().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__BREAK:
				return !getBreak().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__LABEL:
				return !getLabel().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__DEF_LIST:
				return !getDefList().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__LIST:
				return !getList().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.CHEM_STRUCT_TYPE__ACTUATE:
				return isSetActuate();
			case Jats1Package.CHEM_STRUCT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CHEM_STRUCT_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.CHEM_STRUCT_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Jats1Package.CHEM_STRUCT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CHEM_STRUCT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CHEM_STRUCT_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Jats1Package.CHEM_STRUCT_TYPE__SHOW:
				return isSetShow();
			case Jats1Package.CHEM_STRUCT_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.CHEM_STRUCT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Jats1Package.CHEM_STRUCT_TYPE__TYPE:
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
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
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
		result.append(')');
		return result.toString();
	}

} //ChemStructTypeImpl
