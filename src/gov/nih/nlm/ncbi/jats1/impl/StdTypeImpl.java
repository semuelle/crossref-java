/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.DayType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.MonthType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.PubIdType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.SourceType;
import gov.nih.nlm.ncbi.jats1.StdOrganizationType;
import gov.nih.nlm.ncbi.jats1.StdType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.UnderlineType;
import gov.nih.nlm.ncbi.jats1.YearType;

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
 * An implementation of the model object '<em><b>Std Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getStdElements <em>Std Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getStdOrganization <em>Std Organization</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StdTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StdTypeImpl extends MinimalEObjectImpl.Container implements StdType {
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
	protected StdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getStdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.STD_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStdElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getStdType_StdElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DayType> getDay() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Day());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonthType> getMonth() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Month());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PubIdType> getPubId() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_PubId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceType> getSource() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Source());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StdOrganizationType> getStdOrganization() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_StdOrganization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YearType> getYear() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Year());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getStdElements().list(Jats1Package.eINSTANCE.getStdType_Sup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STD_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STD_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STD_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STD_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STD_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.STD_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__STD_ELEMENTS:
				return ((InternalEList<?>)getStdElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__DAY:
				return ((InternalEList<?>)getDay()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__MONTH:
				return ((InternalEList<?>)getMonth()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__PUB_ID:
				return ((InternalEList<?>)getPubId()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__STD_ORGANIZATION:
				return ((InternalEList<?>)getStdOrganization()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__YEAR:
				return ((InternalEList<?>)getYear()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.STD_TYPE__SUP:
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
			case Jats1Package.STD_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.STD_TYPE__STD_ELEMENTS:
				if (coreType) return getStdElements();
				return ((FeatureMap.Internal)getStdElements()).getWrapper();
			case Jats1Package.STD_TYPE__BOLD:
				return getBold();
			case Jats1Package.STD_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.STD_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.STD_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.STD_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.STD_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.STD_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.STD_TYPE__SC:
				return getSc();
			case Jats1Package.STD_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.STD_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.STD_TYPE__RUBY:
				return getRuby();
			case Jats1Package.STD_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.STD_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.STD_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.STD_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.STD_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.STD_TYPE__DAY:
				return getDay();
			case Jats1Package.STD_TYPE__MONTH:
				return getMonth();
			case Jats1Package.STD_TYPE__PUB_ID:
				return getPubId();
			case Jats1Package.STD_TYPE__SOURCE:
				return getSource();
			case Jats1Package.STD_TYPE__STD_ORGANIZATION:
				return getStdOrganization();
			case Jats1Package.STD_TYPE__YEAR:
				return getYear();
			case Jats1Package.STD_TYPE__SUB:
				return getSub();
			case Jats1Package.STD_TYPE__SUP:
				return getSup();
			case Jats1Package.STD_TYPE__BASE:
				return getBase();
			case Jats1Package.STD_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.STD_TYPE__ID:
				return getId();
			case Jats1Package.STD_TYPE__LANG:
				return getLang();
			case Jats1Package.STD_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STD_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.STD_TYPE__STD_ELEMENTS:
				((FeatureMap.Internal)getStdElements()).set(newValue);
				return;
			case Jats1Package.STD_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.STD_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.STD_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.STD_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.STD_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.STD_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.STD_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.STD_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.STD_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.STD_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.STD_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.STD_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.STD_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.STD_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.STD_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.STD_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.STD_TYPE__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends DayType>)newValue);
				return;
			case Jats1Package.STD_TYPE__MONTH:
				getMonth().clear();
				getMonth().addAll((Collection<? extends MonthType>)newValue);
				return;
			case Jats1Package.STD_TYPE__PUB_ID:
				getPubId().clear();
				getPubId().addAll((Collection<? extends PubIdType>)newValue);
				return;
			case Jats1Package.STD_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceType>)newValue);
				return;
			case Jats1Package.STD_TYPE__STD_ORGANIZATION:
				getStdOrganization().clear();
				getStdOrganization().addAll((Collection<? extends StdOrganizationType>)newValue);
				return;
			case Jats1Package.STD_TYPE__YEAR:
				getYear().clear();
				getYear().addAll((Collection<? extends YearType>)newValue);
				return;
			case Jats1Package.STD_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.STD_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.STD_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.STD_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.STD_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.STD_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.STD_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STD_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.STD_TYPE__STD_ELEMENTS:
				getStdElements().clear();
				return;
			case Jats1Package.STD_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.STD_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.STD_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.STD_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.STD_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.STD_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.STD_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.STD_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.STD_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.STD_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.STD_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.STD_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.STD_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.STD_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.STD_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.STD_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.STD_TYPE__DAY:
				getDay().clear();
				return;
			case Jats1Package.STD_TYPE__MONTH:
				getMonth().clear();
				return;
			case Jats1Package.STD_TYPE__PUB_ID:
				getPubId().clear();
				return;
			case Jats1Package.STD_TYPE__SOURCE:
				getSource().clear();
				return;
			case Jats1Package.STD_TYPE__STD_ORGANIZATION:
				getStdOrganization().clear();
				return;
			case Jats1Package.STD_TYPE__YEAR:
				getYear().clear();
				return;
			case Jats1Package.STD_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.STD_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.STD_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.STD_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.STD_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.STD_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.STD_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STD_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.STD_TYPE__STD_ELEMENTS:
				return !getStdElements().isEmpty();
			case Jats1Package.STD_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.STD_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.STD_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.STD_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.STD_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.STD_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.STD_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.STD_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.STD_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.STD_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.STD_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.STD_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.STD_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.STD_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.STD_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.STD_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.STD_TYPE__DAY:
				return !getDay().isEmpty();
			case Jats1Package.STD_TYPE__MONTH:
				return !getMonth().isEmpty();
			case Jats1Package.STD_TYPE__PUB_ID:
				return !getPubId().isEmpty();
			case Jats1Package.STD_TYPE__SOURCE:
				return !getSource().isEmpty();
			case Jats1Package.STD_TYPE__STD_ORGANIZATION:
				return !getStdOrganization().isEmpty();
			case Jats1Package.STD_TYPE__YEAR:
				return !getYear().isEmpty();
			case Jats1Package.STD_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.STD_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.STD_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.STD_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.STD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.STD_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.STD_TYPE__SPECIFIC_USE:
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

} //StdTypeImpl
