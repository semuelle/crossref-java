/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AddrLineType;
import gov.nih.nlm.ncbi.jats1.AffType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.BreakType;
import gov.nih.nlm.ncbi.jats1.CityType;
import gov.nih.nlm.ncbi.jats1.CountryType;
import gov.nih.nlm.ncbi.jats1.EmailType;
import gov.nih.nlm.ncbi.jats1.ExtLinkType;
import gov.nih.nlm.ncbi.jats1.FaxType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.InlineSupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PhoneType;
import gov.nih.nlm.ncbi.jats1.PostalCodeType;
import gov.nih.nlm.ncbi.jats1.RelatedArticleType;
import gov.nih.nlm.ncbi.jats1.RelatedObjectType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StateType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.TargetType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aff Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getAffElements <em>Aff Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getBreak <em>Break</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getRid <em>Rid</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AffTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffTypeImpl extends MinimalEObjectImpl.Container implements AffType {
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
	protected AffTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getAffType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.AFF_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAffElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getAffType_AffElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddrLineType> getAddrLine() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_AddrLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CityType> getCity() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_City());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountryType> getCountry() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Country());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FaxType> getFax() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Fax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhoneType> getPhone() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Phone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostalCodeType> getPostalCode() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_PostalCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateType> getState() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_State());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailType> getEmail() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Email());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtLinkType> getExtLink() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_ExtLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriType> getUri() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Uri());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArticleType> getRelatedArticle() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_RelatedArticle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObjectType> getRelatedObject() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_RelatedObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BreakType> getBreak() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Break());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabelType> getLabel() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Xref());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getAffElements().list(Jats1Package.eINSTANCE.getAffType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AFF_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AFF_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AFF_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AFF_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AFF_TYPE__RID, oldRid, rid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.AFF_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.AFF_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__AFF_ELEMENTS:
				return ((InternalEList<?>)getAffElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__ADDR_LINE:
				return ((InternalEList<?>)getAddrLine()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__CITY:
				return ((InternalEList<?>)getCity()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__FAX:
				return ((InternalEList<?>)getFax()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__PHONE:
				return ((InternalEList<?>)getPhone()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__POSTAL_CODE:
				return ((InternalEList<?>)getPostalCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__EXT_LINK:
				return ((InternalEList<?>)getExtLink()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__RELATED_ARTICLE:
				return ((InternalEList<?>)getRelatedArticle()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__RELATED_OBJECT:
				return ((InternalEList<?>)getRelatedObject()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__BREAK:
				return ((InternalEList<?>)getBreak()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__XREF:
				return ((InternalEList<?>)getXref()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.AFF_TYPE__SUP:
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
			case Jats1Package.AFF_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.AFF_TYPE__AFF_ELEMENTS:
				if (coreType) return getAffElements();
				return ((FeatureMap.Internal)getAffElements()).getWrapper();
			case Jats1Package.AFF_TYPE__ADDR_LINE:
				return getAddrLine();
			case Jats1Package.AFF_TYPE__CITY:
				return getCity();
			case Jats1Package.AFF_TYPE__COUNTRY:
				return getCountry();
			case Jats1Package.AFF_TYPE__FAX:
				return getFax();
			case Jats1Package.AFF_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.AFF_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.AFF_TYPE__PHONE:
				return getPhone();
			case Jats1Package.AFF_TYPE__POSTAL_CODE:
				return getPostalCode();
			case Jats1Package.AFF_TYPE__STATE:
				return getState();
			case Jats1Package.AFF_TYPE__EMAIL:
				return getEmail();
			case Jats1Package.AFF_TYPE__EXT_LINK:
				return getExtLink();
			case Jats1Package.AFF_TYPE__URI:
				return getUri();
			case Jats1Package.AFF_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.AFF_TYPE__RELATED_ARTICLE:
				return getRelatedArticle();
			case Jats1Package.AFF_TYPE__RELATED_OBJECT:
				return getRelatedObject();
			case Jats1Package.AFF_TYPE__BREAK:
				return getBreak();
			case Jats1Package.AFF_TYPE__BOLD:
				return getBold();
			case Jats1Package.AFF_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.AFF_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.AFF_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.AFF_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.AFF_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.AFF_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.AFF_TYPE__SC:
				return getSc();
			case Jats1Package.AFF_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.AFF_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.AFF_TYPE__RUBY:
				return getRuby();
			case Jats1Package.AFF_TYPE__LABEL:
				return getLabel();
			case Jats1Package.AFF_TYPE__FN:
				return getFn();
			case Jats1Package.AFF_TYPE__TARGET:
				return getTarget();
			case Jats1Package.AFF_TYPE__XREF:
				return getXref();
			case Jats1Package.AFF_TYPE__SUB:
				return getSub();
			case Jats1Package.AFF_TYPE__SUP:
				return getSup();
			case Jats1Package.AFF_TYPE__BASE:
				return getBase();
			case Jats1Package.AFF_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.AFF_TYPE__ID:
				return getId();
			case Jats1Package.AFF_TYPE__LANG:
				return getLang();
			case Jats1Package.AFF_TYPE__RID:
				return getRid();
			case Jats1Package.AFF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.AFF_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.AFF_TYPE__AFF_ELEMENTS:
				((FeatureMap.Internal)getAffElements()).set(newValue);
				return;
			case Jats1Package.AFF_TYPE__ADDR_LINE:
				getAddrLine().clear();
				getAddrLine().addAll((Collection<? extends AddrLineType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends CityType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CountryType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__FAX:
				getFax().clear();
				getFax().addAll((Collection<? extends FaxType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__PHONE:
				getPhone().clear();
				getPhone().addAll((Collection<? extends PhoneType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends PostalCodeType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends StateType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends EmailType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__EXT_LINK:
				getExtLink().clear();
				getExtLink().addAll((Collection<? extends ExtLinkType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends UriType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				getRelatedArticle().addAll((Collection<? extends RelatedArticleType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends RelatedObjectType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__BREAK:
				getBreak().clear();
				getBreak().addAll((Collection<? extends BreakType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.AFF_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.AFF_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.AFF_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.AFF_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.AFF_TYPE__RID:
				setRid((List<String>)newValue);
				return;
			case Jats1Package.AFF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.AFF_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.AFF_TYPE__AFF_ELEMENTS:
				getAffElements().clear();
				return;
			case Jats1Package.AFF_TYPE__ADDR_LINE:
				getAddrLine().clear();
				return;
			case Jats1Package.AFF_TYPE__CITY:
				getCity().clear();
				return;
			case Jats1Package.AFF_TYPE__COUNTRY:
				getCountry().clear();
				return;
			case Jats1Package.AFF_TYPE__FAX:
				getFax().clear();
				return;
			case Jats1Package.AFF_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.AFF_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.AFF_TYPE__PHONE:
				getPhone().clear();
				return;
			case Jats1Package.AFF_TYPE__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case Jats1Package.AFF_TYPE__STATE:
				getState().clear();
				return;
			case Jats1Package.AFF_TYPE__EMAIL:
				getEmail().clear();
				return;
			case Jats1Package.AFF_TYPE__EXT_LINK:
				getExtLink().clear();
				return;
			case Jats1Package.AFF_TYPE__URI:
				getUri().clear();
				return;
			case Jats1Package.AFF_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.AFF_TYPE__RELATED_ARTICLE:
				getRelatedArticle().clear();
				return;
			case Jats1Package.AFF_TYPE__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Jats1Package.AFF_TYPE__BREAK:
				getBreak().clear();
				return;
			case Jats1Package.AFF_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.AFF_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.AFF_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.AFF_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.AFF_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.AFF_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.AFF_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.AFF_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.AFF_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.AFF_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.AFF_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.AFF_TYPE__LABEL:
				getLabel().clear();
				return;
			case Jats1Package.AFF_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.AFF_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.AFF_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.AFF_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.AFF_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.AFF_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.AFF_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.AFF_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.AFF_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.AFF_TYPE__RID:
				setRid(RID_EDEFAULT);
				return;
			case Jats1Package.AFF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.AFF_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.AFF_TYPE__AFF_ELEMENTS:
				return !getAffElements().isEmpty();
			case Jats1Package.AFF_TYPE__ADDR_LINE:
				return !getAddrLine().isEmpty();
			case Jats1Package.AFF_TYPE__CITY:
				return !getCity().isEmpty();
			case Jats1Package.AFF_TYPE__COUNTRY:
				return !getCountry().isEmpty();
			case Jats1Package.AFF_TYPE__FAX:
				return !getFax().isEmpty();
			case Jats1Package.AFF_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.AFF_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.AFF_TYPE__PHONE:
				return !getPhone().isEmpty();
			case Jats1Package.AFF_TYPE__POSTAL_CODE:
				return !getPostalCode().isEmpty();
			case Jats1Package.AFF_TYPE__STATE:
				return !getState().isEmpty();
			case Jats1Package.AFF_TYPE__EMAIL:
				return !getEmail().isEmpty();
			case Jats1Package.AFF_TYPE__EXT_LINK:
				return !getExtLink().isEmpty();
			case Jats1Package.AFF_TYPE__URI:
				return !getUri().isEmpty();
			case Jats1Package.AFF_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.AFF_TYPE__RELATED_ARTICLE:
				return !getRelatedArticle().isEmpty();
			case Jats1Package.AFF_TYPE__RELATED_OBJECT:
				return !getRelatedObject().isEmpty();
			case Jats1Package.AFF_TYPE__BREAK:
				return !getBreak().isEmpty();
			case Jats1Package.AFF_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.AFF_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.AFF_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.AFF_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.AFF_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.AFF_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.AFF_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.AFF_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.AFF_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.AFF_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.AFF_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.AFF_TYPE__LABEL:
				return !getLabel().isEmpty();
			case Jats1Package.AFF_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.AFF_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.AFF_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.AFF_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.AFF_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.AFF_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.AFF_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.AFF_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.AFF_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.AFF_TYPE__RID:
				return RID_EDEFAULT == null ? rid != null : !RID_EDEFAULT.equals(rid);
			case Jats1Package.AFF_TYPE__SPECIFIC_USE:
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

} //AffTypeImpl
