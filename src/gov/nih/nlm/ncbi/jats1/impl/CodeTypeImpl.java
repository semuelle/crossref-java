/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExecutableType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.IndexTermRangeEndType;
import gov.nih.nlm.ncbi.jats1.IndexTermType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MilestoneEndType;
import gov.nih.nlm.ncbi.jats1.MilestoneStartType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OrientationType11;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PositionType10;
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

import org.w3.xml._1998.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getCodeElements <em>Code Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getCodeType <em>Code Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getCodeVersion <em>Code Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getLanguageVersion <em>Language Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CodeTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeTypeImpl extends MinimalEObjectImpl.Container implements CodeType {
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
	 * The default value of the '{@link #getCodeType() <em>Code Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeType()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeType() <em>Code Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeType()
	 * @generated
	 * @ordered
	 */
	protected String codeType = CODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeVersion() <em>Code Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeVersion() <em>Code Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeVersion()
	 * @generated
	 * @ordered
	 */
	protected String codeVersion = CODE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutableType EXECUTABLE_EDEFAULT = ExecutableType.NO;

	/**
	 * The cached value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected ExecutableType executable = EXECUTABLE_EDEFAULT;

	/**
	 * This is true if the Executable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executableESet;

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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageVersion() <em>Language Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageVersion() <em>Language Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageVersion()
	 * @generated
	 * @ordered
	 */
	protected String languageVersion = LANGUAGE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType11 ORIENTATION_EDEFAULT = OrientationType11.PORTRAIT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType11 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getPlatforms() <em>Platforms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected String platforms = PLATFORMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PositionType10 POSITION_EDEFAULT = PositionType10.FLOAT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType10 position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

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
	protected CodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCodeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.CODE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCodeElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getCodeType_CodeElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getCodeElements().list(Jats1Package.eINSTANCE.getCodeType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeType() {
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeType(String newCodeType) {
		String oldCodeType = codeType;
		codeType = newCodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__CODE_TYPE, oldCodeType, codeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeVersion() {
		return codeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeVersion(String newCodeVersion) {
		String oldCodeVersion = codeVersion;
		codeVersion = newCodeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__CODE_VERSION, oldCodeVersion, codeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutableType getExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutable(ExecutableType newExecutable) {
		ExecutableType oldExecutable = executable;
		executable = newExecutable == null ? EXECUTABLE_EDEFAULT : newExecutable;
		boolean oldExecutableESet = executableESet;
		executableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__EXECUTABLE, oldExecutable, executable, !oldExecutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExecutable() {
		ExecutableType oldExecutable = executable;
		boolean oldExecutableESet = executableESet;
		executable = EXECUTABLE_EDEFAULT;
		executableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CODE_TYPE__EXECUTABLE, oldExecutable, EXECUTABLE_EDEFAULT, oldExecutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExecutable() {
		return executableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguageVersion() {
		return languageVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguageVersion(String newLanguageVersion) {
		String oldLanguageVersion = languageVersion;
		languageVersion = newLanguageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__LANGUAGE_VERSION, oldLanguageVersion, languageVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType11 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType11 newOrientation) {
		OrientationType11 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrientation() {
		OrientationType11 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CODE_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
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
	public String getPlatforms() {
		return platforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatforms(String newPlatforms) {
		String oldPlatforms = platforms;
		platforms = newPlatforms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__PLATFORMS, oldPlatforms, platforms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionType10 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PositionType10 newPosition) {
		PositionType10 oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		boolean oldPositionESet = positionESet;
		positionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__POSITION, oldPosition, position, !oldPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosition() {
		PositionType10 oldPosition = position;
		boolean oldPositionESet = positionESet;
		position = POSITION_EDEFAULT;
		positionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CODE_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.CODE_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CODE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CODE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__CODE_ELEMENTS:
				return ((InternalEList<?>)getCodeElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.CODE_TYPE__SUP:
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
			case Jats1Package.CODE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.CODE_TYPE__CODE_ELEMENTS:
				if (coreType) return getCodeElements();
				return ((FeatureMap.Internal)getCodeElements()).getWrapper();
			case Jats1Package.CODE_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.CODE_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.CODE_TYPE__URI:
				return getUri();
			case Jats1Package.CODE_TYPE__BOLD:
				return getBold();
			case Jats1Package.CODE_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.CODE_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.CODE_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.CODE_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.CODE_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.CODE_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.CODE_TYPE__SC:
				return getSc();
			case Jats1Package.CODE_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.CODE_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.CODE_TYPE__RUBY:
				return getRuby();
			case Jats1Package.CODE_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.CODE_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.CODE_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.CODE_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.CODE_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.CODE_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.CODE_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.CODE_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.CODE_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.CODE_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.CODE_TYPE__FN:
				return getFn();
			case Jats1Package.CODE_TYPE__TARGET:
				return getTarget();
			case Jats1Package.CODE_TYPE__XREF:
				return getXref();
			case Jats1Package.CODE_TYPE__SUB:
				return getSub();
			case Jats1Package.CODE_TYPE__SUP:
				return getSup();
			case Jats1Package.CODE_TYPE__BASE:
				return getBase();
			case Jats1Package.CODE_TYPE__CODE_TYPE:
				return getCodeType();
			case Jats1Package.CODE_TYPE__CODE_VERSION:
				return getCodeVersion();
			case Jats1Package.CODE_TYPE__EXECUTABLE:
				return getExecutable();
			case Jats1Package.CODE_TYPE__ID:
				return getId();
			case Jats1Package.CODE_TYPE__LANG:
				return getLang();
			case Jats1Package.CODE_TYPE__LANGUAGE:
				return getLanguage();
			case Jats1Package.CODE_TYPE__LANGUAGE_VERSION:
				return getLanguageVersion();
			case Jats1Package.CODE_TYPE__ORIENTATION:
				return getOrientation();
			case Jats1Package.CODE_TYPE__PLATFORMS:
				return getPlatforms();
			case Jats1Package.CODE_TYPE__POSITION:
				return getPosition();
			case Jats1Package.CODE_TYPE__SPACE:
				return getSpace();
			case Jats1Package.CODE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CODE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.CODE_TYPE__CODE_ELEMENTS:
				((FeatureMap.Internal)getCodeElements()).set(newValue);
				return;
			case Jats1Package.CODE_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.CODE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__CODE_TYPE:
				setCodeType((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__CODE_VERSION:
				setCodeVersion((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__EXECUTABLE:
				setExecutable((ExecutableType)newValue);
				return;
			case Jats1Package.CODE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.CODE_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__LANGUAGE_VERSION:
				setLanguageVersion((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__ORIENTATION:
				setOrientation((OrientationType11)newValue);
				return;
			case Jats1Package.CODE_TYPE__PLATFORMS:
				setPlatforms((String)newValue);
				return;
			case Jats1Package.CODE_TYPE__POSITION:
				setPosition((PositionType10)newValue);
				return;
			case Jats1Package.CODE_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case Jats1Package.CODE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CODE_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.CODE_TYPE__CODE_ELEMENTS:
				getCodeElements().clear();
				return;
			case Jats1Package.CODE_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.CODE_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.CODE_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.CODE_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.CODE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.CODE_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.CODE_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.CODE_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.CODE_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.CODE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.CODE_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.CODE_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.CODE_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.CODE_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.CODE_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.CODE_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.CODE_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.CODE_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.CODE_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.CODE_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.CODE_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.CODE_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.CODE_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.CODE_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.CODE_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.CODE_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.CODE_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.CODE_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.CODE_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.CODE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__CODE_TYPE:
				setCodeType(CODE_TYPE_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__CODE_VERSION:
				setCodeVersion(CODE_VERSION_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__EXECUTABLE:
				unsetExecutable();
				return;
			case Jats1Package.CODE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__LANGUAGE_VERSION:
				setLanguageVersion(LANGUAGE_VERSION_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case Jats1Package.CODE_TYPE__PLATFORMS:
				setPlatforms(PLATFORMS_EDEFAULT);
				return;
			case Jats1Package.CODE_TYPE__POSITION:
				unsetPosition();
				return;
			case Jats1Package.CODE_TYPE__SPACE:
				unsetSpace();
				return;
			case Jats1Package.CODE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.CODE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.CODE_TYPE__CODE_ELEMENTS:
				return !getCodeElements().isEmpty();
			case Jats1Package.CODE_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.CODE_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.CODE_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.CODE_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.CODE_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.CODE_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.CODE_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.CODE_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.CODE_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.CODE_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.CODE_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.CODE_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.CODE_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.CODE_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.CODE_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.CODE_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.CODE_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.CODE_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.CODE_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.CODE_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.CODE_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.CODE_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.CODE_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.CODE_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.CODE_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.CODE_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.CODE_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.CODE_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.CODE_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.CODE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CODE_TYPE__CODE_TYPE:
				return CODE_TYPE_EDEFAULT == null ? codeType != null : !CODE_TYPE_EDEFAULT.equals(codeType);
			case Jats1Package.CODE_TYPE__CODE_VERSION:
				return CODE_VERSION_EDEFAULT == null ? codeVersion != null : !CODE_VERSION_EDEFAULT.equals(codeVersion);
			case Jats1Package.CODE_TYPE__EXECUTABLE:
				return isSetExecutable();
			case Jats1Package.CODE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.CODE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.CODE_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Jats1Package.CODE_TYPE__LANGUAGE_VERSION:
				return LANGUAGE_VERSION_EDEFAULT == null ? languageVersion != null : !LANGUAGE_VERSION_EDEFAULT.equals(languageVersion);
			case Jats1Package.CODE_TYPE__ORIENTATION:
				return isSetOrientation();
			case Jats1Package.CODE_TYPE__PLATFORMS:
				return PLATFORMS_EDEFAULT == null ? platforms != null : !PLATFORMS_EDEFAULT.equals(platforms);
			case Jats1Package.CODE_TYPE__POSITION:
				return isSetPosition();
			case Jats1Package.CODE_TYPE__SPACE:
				return isSetSpace();
			case Jats1Package.CODE_TYPE__SPECIFIC_USE:
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
		result.append(", codeType: ");
		result.append(codeType);
		result.append(", codeVersion: ");
		result.append(codeVersion);
		result.append(", executable: ");
		if (executableESet) result.append(executable); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", language: ");
		result.append(language);
		result.append(", languageVersion: ");
		result.append(languageVersion);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", platforms: ");
		result.append(platforms);
		result.append(", position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //CodeTypeImpl
