/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbbrevType;
import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.ContribGroupType;
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
import gov.nih.nlm.ncbi.jats1.StyledContentType;
import gov.nih.nlm.ncbi.jats1.SubType;
import gov.nih.nlm.ncbi.jats1.SupType;
import gov.nih.nlm.ncbi.jats1.SupplementType;
import gov.nih.nlm.ncbi.jats1.TitleType;
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
 * An implementation of the model object '<em><b>Supplement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSupplementElements <em>Supplement Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getInlineFormula <em>Inline Formula</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getIndexTerm <em>Index Term</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getIndexTermRangeEnd <em>Index Term Range End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getMilestoneEnd <em>Milestone End</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getMilestoneStart <em>Milestone Start</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.SupplementTypeImpl#getSupplementType <em>Supplement Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplementTypeImpl extends MinimalEObjectImpl.Container implements SupplementType {
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
	 * The default value of the '{@link #getSupplementType() <em>Supplement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplementType() <em>Supplement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementType()
	 * @generated
	 * @ordered
	 */
	protected String supplementType = SUPPLEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getSupplementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.SUPPLEMENT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSupplementElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getSupplementType_SupplementElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineFormulaType> getInlineFormula() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_InlineFormula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrevType> getAbbrev() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Abbrev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermType> getIndexTerm() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_IndexTerm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndexTermRangeEndType> getIndexTermRangeEnd() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_IndexTermRangeEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneEndType> getMilestoneEnd() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_MilestoneEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MilestoneStartType> getMilestoneStart() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_MilestoneStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContribGroupType> getContribGroup() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_ContribGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleType> getTitle() {
		return getSupplementElements().list(Jats1Package.eINSTANCE.getSupplementType_Title());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUPPLEMENT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUPPLEMENT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUPPLEMENT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUPPLEMENT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplementType() {
		return supplementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplementType(String newSupplementType) {
		String oldSupplementType = supplementType;
		supplementType = newSupplementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_TYPE, oldSupplementType, supplementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.SUPPLEMENT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_ELEMENTS:
				return ((InternalEList<?>)getSupplementElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_FORMULA:
				return ((InternalEList<?>)getInlineFormula()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__ABBREV:
				return ((InternalEList<?>)getAbbrev()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM:
				return ((InternalEList<?>)getIndexTerm()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM_RANGE_END:
				return ((InternalEList<?>)getIndexTermRangeEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_END:
				return ((InternalEList<?>)getMilestoneEnd()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_START:
				return ((InternalEList<?>)getMilestoneStart()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__CONTRIB_GROUP:
				return ((InternalEList<?>)getContribGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.SUPPLEMENT_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.SUPPLEMENT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_ELEMENTS:
				if (coreType) return getSupplementElements();
				return ((FeatureMap.Internal)getSupplementElements()).getWrapper();
			case Jats1Package.SUPPLEMENT_TYPE__BOLD:
				return getBold();
			case Jats1Package.SUPPLEMENT_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.SUPPLEMENT_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.SUPPLEMENT_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.SUPPLEMENT_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.SUPPLEMENT_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.SUPPLEMENT_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.SUPPLEMENT_TYPE__SC:
				return getSc();
			case Jats1Package.SUPPLEMENT_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.SUPPLEMENT_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.SUPPLEMENT_TYPE__RUBY:
				return getRuby();
			case Jats1Package.SUPPLEMENT_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.SUPPLEMENT_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.SUPPLEMENT_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_FORMULA:
				return getInlineFormula();
			case Jats1Package.SUPPLEMENT_TYPE__ABBREV:
				return getAbbrev();
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM:
				return getIndexTerm();
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM_RANGE_END:
				return getIndexTermRangeEnd();
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_END:
				return getMilestoneEnd();
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_START:
				return getMilestoneStart();
			case Jats1Package.SUPPLEMENT_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.SUPPLEMENT_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.SUPPLEMENT_TYPE__SUB:
				return getSub();
			case Jats1Package.SUPPLEMENT_TYPE__SUP:
				return getSup();
			case Jats1Package.SUPPLEMENT_TYPE__CONTRIB_GROUP:
				return getContribGroup();
			case Jats1Package.SUPPLEMENT_TYPE__TITLE:
				return getTitle();
			case Jats1Package.SUPPLEMENT_TYPE__BASE:
				return getBase();
			case Jats1Package.SUPPLEMENT_TYPE__ID:
				return getId();
			case Jats1Package.SUPPLEMENT_TYPE__LANG:
				return getLang();
			case Jats1Package.SUPPLEMENT_TYPE__SPECIFIC_USE:
				return getSpecificUse();
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_TYPE:
				return getSupplementType();
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
			case Jats1Package.SUPPLEMENT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_ELEMENTS:
				((FeatureMap.Internal)getSupplementElements()).set(newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				getInlineFormula().addAll((Collection<? extends InlineFormulaType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ABBREV:
				getAbbrev().clear();
				getAbbrev().addAll((Collection<? extends AbbrevType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				getIndexTerm().addAll((Collection<? extends IndexTermType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				getIndexTermRangeEnd().addAll((Collection<? extends IndexTermRangeEndType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				getMilestoneEnd().addAll((Collection<? extends MilestoneEndType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				getMilestoneStart().addAll((Collection<? extends MilestoneStartType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				getContribGroup().addAll((Collection<? extends ContribGroupType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_TYPE:
				setSupplementType((String)newValue);
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
			case Jats1Package.SUPPLEMENT_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_ELEMENTS:
				getSupplementElements().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_FORMULA:
				getInlineFormula().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ABBREV:
				getAbbrev().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM:
				getIndexTerm().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM_RANGE_END:
				getIndexTermRangeEnd().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_END:
				getMilestoneEnd().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_START:
				getMilestoneStart().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__CONTRIB_GROUP:
				getContribGroup().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__TITLE:
				getTitle().clear();
				return;
			case Jats1Package.SUPPLEMENT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
				return;
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_TYPE:
				setSupplementType(SUPPLEMENT_TYPE_EDEFAULT);
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
			case Jats1Package.SUPPLEMENT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_ELEMENTS:
				return !getSupplementElements().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__INLINE_FORMULA:
				return !getInlineFormula().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__ABBREV:
				return !getAbbrev().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM:
				return !getIndexTerm().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__INDEX_TERM_RANGE_END:
				return !getIndexTermRangeEnd().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_END:
				return !getMilestoneEnd().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__MILESTONE_START:
				return !getMilestoneStart().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__CONTRIB_GROUP:
				return !getContribGroup().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__TITLE:
				return !getTitle().isEmpty();
			case Jats1Package.SUPPLEMENT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.SUPPLEMENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.SUPPLEMENT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.SUPPLEMENT_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
			case Jats1Package.SUPPLEMENT_TYPE__SUPPLEMENT_TYPE:
				return SUPPLEMENT_TYPE_EDEFAULT == null ? supplementType != null : !SUPPLEMENT_TYPE_EDEFAULT.equals(supplementType);
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
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(", supplementType: ");
		result.append(supplementType);
		result.append(')');
		return result.toString();
	}

} //SupplementTypeImpl
