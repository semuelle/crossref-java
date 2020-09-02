/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AltTextType;
import gov.nih.nlm.ncbi.jats1.AttribType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType;
import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LongDescType;
import gov.nih.nlm.ncbi.jats1.MilestoneEndType;
import gov.nih.nlm.ncbi.jats1.MilestoneStartType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OrientationType10;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PermissionsType;
import gov.nih.nlm.ncbi.jats1.PositionType7;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.UriType;

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

import org.w3.xml._1998.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preformat Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getPreformatElements <em>Preformat Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getLongDesc <em>Long Desc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getPreformatType <em>Preformat Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PreformatTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreformatTypeImpl extends MinimalEObjectImpl.Container implements PreformatType {
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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType10 ORIENTATION_EDEFAULT = OrientationType10.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType10 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PositionType7 POSITION_EDEFAULT = PositionType7.FLOAT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType7 position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

	/**
	 * The default value of the '{@link #getPreformatType() <em>Preformat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreformatType()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFORMAT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreformatType() <em>Preformat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreformatType()
	 * @generated
	 * @ordered
	 */
	protected String preformatType = PREFORMAT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.PRESERVE;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

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
	protected PreformatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPreformatType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.PREFORMAT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPreformatElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getPreformatType_PreformatElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltTextType> getAltText() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_AltText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongDescType> getLongDesc() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_LongDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttribType> getAttrib() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Attrib());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PermissionsType> getPermissions() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Permissions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getPreformatElements().list(Jats1Package.eINSTANCE.getPreformatType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType10 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType10 newOrientation) {
		OrientationType10 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType10 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.PREFORMAT_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionType7 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PositionType7 newPosition) {
		PositionType7 oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosition() {
		PositionType7 oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.PREFORMAT_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPosition() {
		return positionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreformatType() {
		return preformatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreformatType(String newPreformatType) {
		String oldPreformatType = preformatType;
		preformatType = newPreformatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__PREFORMAT_TYPE, oldPreformatType, preformatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.PREFORMAT_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpace() {
		return spaceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PREFORMAT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PREFORMAT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_ELEMENTS:
				return ((InternalEList<?>)getPreformatElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__ALT_TEXT:
				return ((InternalEList<?>)getAltText()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__LONG_DESC:
				return ((InternalEList<?>)getLongDesc()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__ATTRIB:
				return ((InternalEList<?>)getAttrib()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.PREFORMAT_TYPE__SUP:
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
			case Jats1Package.PREFORMAT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_ELEMENTS:
				if (coreType) return getPreformatElements();
				return ((FeatureMap.Internal)getPreformatElements()).getWrapper();
			case Jats1Package.PREFORMAT_TYPE__ALT_TEXT:
				return getAltText();
			case Jats1Package.PREFORMAT_TYPE__LONG_DESC:
				return getLongDesc();
			case Jats1Package.PREFORMAT_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.PREFORMAT_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.PREFORMAT_TYPE__URI:
				return getUri();
			case Jats1Package.PREFORMAT_TYPE__ATTRIB:
				return getAttrib();
			case Jats1Package.PREFORMAT_TYPE__PERMISSIONS:
				return getPermissions();
			case Jats1Package.PREFORMAT_TYPE__BOLD:
				return getBold();
			case Jats1Package.PREFORMAT_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.PREFORMAT_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.PREFORMAT_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.PREFORMAT_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.PREFORMAT_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.PREFORMAT_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.PREFORMAT_TYPE__SC:
				return getSc();
			case Jats1Package.PREFORMAT_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.PREFORMAT_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.PREFORMAT_TYPE__RUBY:
				return getRuby();
			case Jats1Package.PREFORMAT_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.PREFORMAT_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.PREFORMAT_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.PREFORMAT_TYPE__SUB:
				return getSub();
			case Jats1Package.PREFORMAT_TYPE__SUP:
				return getSup();
			case Jats1Package.PREFORMAT_TYPE__BASE:
				return getBase();
			case Jats1Package.PREFORMAT_TYPE__ID:
				return getId();
			case Jats1Package.PREFORMAT_TYPE__LANG:
				return getLang();
			case Jats1Package.PREFORMAT_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.PREFORMAT_TYPE__POSITION:
				return getPosition();
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_TYPE:
				return getPreformatType();
			case Jats1Package.PREFORMAT_TYPE__SPACE:
				return getSpace();
			case Jats1Package.PREFORMAT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PREFORMAT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_ELEMENTS:
				((FeatureMap.Internal)getPreformatElements()).set(newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ALT_TEXT:
				getAltText().clear();
				getAltText().addAll((Collection<? extends AltTextType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__LONG_DESC:
				getLongDesc().clear();
				getLongDesc().addAll((Collection<? extends LongDescType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ATTRIB:
				getAttrib().clear();
				getAttrib().addAll((Collection<? extends AttribType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends PermissionsType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__ORIENTATION:
				setOrientation((OrientationType10)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__POSITION:
				setPosition((PositionType7)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_TYPE:
				setPreformatType((String)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case Jats1Package.PREFORMAT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PREFORMAT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_ELEMENTS:
				getPreformatElements().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__ALT_TEXT:
				getAltText().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__LONG_DESC:
				getLongDesc().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__ATTRIB:
				getAttrib().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__PERMISSIONS:
				getPermissions().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.PREFORMAT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PREFORMAT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.PREFORMAT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.PREFORMAT_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.PREFORMAT_TYPE__POSITION:
				unsetPosition();
				return;
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_TYPE:
				setPreformatType(PREFORMAT_TYPE_EDEFAULT);
				return;
			case Jats1Package.PREFORMAT_TYPE__SPACE:
				unsetSpace();
				return;
			case Jats1Package.PREFORMAT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PREFORMAT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_ELEMENTS:
				return !getPreformatElements().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__ALT_TEXT:
				return !getAltText().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__LONG_DESC:
				return !getLongDesc().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__ATTRIB:
				return !getAttrib().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__PERMISSIONS:
				return !getPermissions().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.PREFORMAT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PREFORMAT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.PREFORMAT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.PREFORMAT_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.PREFORMAT_TYPE__POSITION:
				return isSetPosition();
			case Jats1Package.PREFORMAT_TYPE__PREFORMAT_TYPE:
				return PREFORMAT_TYPE_EDEFAULT == null ? preformatType != null : !PREFORMAT_TYPE_EDEFAULT.equals(preformatType);
			case Jats1Package.PREFORMAT_TYPE__SPACE:
				return isSetSpace();
			case Jats1Package.PREFORMAT_TYPE__SPECIFIC_USE:
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
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(", preformatType: ");
		result.append(preformatType);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //PreformatTypeImpl
