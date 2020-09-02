/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.FnType;
import gov.nih.nlm.ncbi.jats1.InstitutionType;
import gov.nih.nlm.ncbi.jats1.InstitutionWrapType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.NamedContentType;
import gov.nih.nlm.ncbi.jats1.OnBehalfOfType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
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
 * An implementation of the model object '<em><b>On Behalf Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getOnBehalfOfElements <em>On Behalf Of Elements</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getNamedContent <em>Named Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getStyledContent <em>Styled Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getInstitutionWrap <em>Institution Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.OnBehalfOfTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnBehalfOfTypeImpl extends MinimalEObjectImpl.Container implements OnBehalfOfType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnBehalfOfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getOnBehalfOfType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.ON_BEHALF_OF_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getOnBehalfOfElements() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getOnBehalfOfType_OnBehalfOfElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Ruby());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedContentType> getNamedContent() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_NamedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StyledContentType> getStyledContent() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_StyledContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionType> getInstitution() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Institution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstitutionWrapType> getInstitutionWrap() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_InstitutionWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FnType> getFn() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Fn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetType> getTarget() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Target());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefType> getXref() {
		return getOnBehalfOfElements().list(Jats1Package.eINSTANCE.getOnBehalfOfType_Xref());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ON_BEHALF_OF_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ON_BEHALF_OF_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ON_BEHALF_OF_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ON_BEHALF_OF_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ON_BEHALF_OF_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__ON_BEHALF_OF_ELEMENTS:
				return ((InternalEList<?>)getOnBehalfOfElements()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__NAMED_CONTENT:
				return ((InternalEList<?>)getNamedContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__STYLED_CONTENT:
				return ((InternalEList<?>)getStyledContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION:
				return ((InternalEList<?>)getInstitution()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION_WRAP:
				return ((InternalEList<?>)getInstitutionWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__FN:
				return ((InternalEList<?>)getFn()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case Jats1Package.ON_BEHALF_OF_TYPE__XREF:
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
			case Jats1Package.ON_BEHALF_OF_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.ON_BEHALF_OF_TYPE__ON_BEHALF_OF_ELEMENTS:
				if (coreType) return getOnBehalfOfElements();
				return ((FeatureMap.Internal)getOnBehalfOfElements()).getWrapper();
			case Jats1Package.ON_BEHALF_OF_TYPE__BOLD:
				return getBold();
			case Jats1Package.ON_BEHALF_OF_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.ON_BEHALF_OF_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.ON_BEHALF_OF_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.ON_BEHALF_OF_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.ON_BEHALF_OF_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.ON_BEHALF_OF_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.ON_BEHALF_OF_TYPE__SC:
				return getSc();
			case Jats1Package.ON_BEHALF_OF_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.ON_BEHALF_OF_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.ON_BEHALF_OF_TYPE__RUBY:
				return getRuby();
			case Jats1Package.ON_BEHALF_OF_TYPE__SUB:
				return getSub();
			case Jats1Package.ON_BEHALF_OF_TYPE__SUP:
				return getSup();
			case Jats1Package.ON_BEHALF_OF_TYPE__NAMED_CONTENT:
				return getNamedContent();
			case Jats1Package.ON_BEHALF_OF_TYPE__STYLED_CONTENT:
				return getStyledContent();
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION:
				return getInstitution();
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION_WRAP:
				return getInstitutionWrap();
			case Jats1Package.ON_BEHALF_OF_TYPE__FN:
				return getFn();
			case Jats1Package.ON_BEHALF_OF_TYPE__TARGET:
				return getTarget();
			case Jats1Package.ON_BEHALF_OF_TYPE__XREF:
				return getXref();
			case Jats1Package.ON_BEHALF_OF_TYPE__BASE:
				return getBase();
			case Jats1Package.ON_BEHALF_OF_TYPE__ID:
				return getId();
			case Jats1Package.ON_BEHALF_OF_TYPE__LANG:
				return getLang();
			case Jats1Package.ON_BEHALF_OF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ON_BEHALF_OF_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ON_BEHALF_OF_ELEMENTS:
				((FeatureMap.Internal)getOnBehalfOfElements()).set(newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				getNamedContent().addAll((Collection<? extends NamedContentType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				getStyledContent().addAll((Collection<? extends StyledContentType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				getInstitutionWrap().addAll((Collection<? extends InstitutionWrapType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__FN:
				getFn().clear();
				getFn().addAll((Collection<? extends FnType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__XREF:
				getXref().clear();
				getXref().addAll((Collection<? extends XrefType>)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ON_BEHALF_OF_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ON_BEHALF_OF_ELEMENTS:
				getOnBehalfOfElements().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SUB:
				getSub().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SUP:
				getSup().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__NAMED_CONTENT:
				getNamedContent().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__STYLED_CONTENT:
				getStyledContent().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION:
				getInstitution().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION_WRAP:
				getInstitutionWrap().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__FN:
				getFn().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__TARGET:
				getTarget().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__XREF:
				getXref().clear();
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.ON_BEHALF_OF_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ON_BEHALF_OF_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__ON_BEHALF_OF_ELEMENTS:
				return !getOnBehalfOfElements().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__SUB:
				return !getSub().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__SUP:
				return !getSup().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__NAMED_CONTENT:
				return !getNamedContent().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__STYLED_CONTENT:
				return !getStyledContent().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION:
				return !getInstitution().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__INSTITUTION_WRAP:
				return !getInstitutionWrap().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__FN:
				return !getFn().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__TARGET:
				return !getTarget().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__XREF:
				return !getXref().isEmpty();
			case Jats1Package.ON_BEHALF_OF_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ON_BEHALF_OF_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ON_BEHALF_OF_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.ON_BEHALF_OF_TYPE__SPECIFIC_USE:
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
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //OnBehalfOfTypeImpl
