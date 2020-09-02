/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.BoldType;
import gov.nih.nlm.ncbi.jats1.FixedCaseType;
import gov.nih.nlm.ncbi.jats1.ItalicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonospaceType;
import gov.nih.nlm.ncbi.jats1.OverlineType;
import gov.nih.nlm.ncbi.jats1.PriceType;
import gov.nih.nlm.ncbi.jats1.RomanType;
import gov.nih.nlm.ncbi.jats1.RubyType;
import gov.nih.nlm.ncbi.jats1.SansSerifType;
import gov.nih.nlm.ncbi.jats1.ScType;
import gov.nih.nlm.ncbi.jats1.StrikeType;
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
 * An implementation of the model object '<em><b>Price Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getEmphasisClass <em>Emphasis Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getFixedCase <em>Fixed Case</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getMonospace <em>Monospace</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getOverline <em>Overline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getRoman <em>Roman</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getSansSerif <em>Sans Serif</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getSc <em>Sc</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getUnderline <em>Underline</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PriceTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PriceTypeImpl extends MinimalEObjectImpl.Container implements PriceType {
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
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

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
	protected PriceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPriceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.PRICE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEmphasisClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getPriceType_EmphasisClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldType> getBold() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Bold());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FixedCaseType> getFixedCase() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_FixedCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicType> getItalic() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Italic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonospaceType> getMonospace() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Monospace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlineType> getOverline() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Overline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RomanType> getRoman() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Roman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SansSerifType> getSansSerif() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_SansSerif());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScType> getSc() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Sc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrikeType> getStrike() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Strike());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineType> getUnderline() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Underline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RubyType> getRuby() {
		return getEmphasisClass().list(Jats1Package.eINSTANCE.getPriceType_Ruby());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRICE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRICE_TYPE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRICE_TYPE__CURRENCY, oldCurrency, currency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRICE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRICE_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRICE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PRICE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__EMPHASIS_CLASS:
				return ((InternalEList<?>)getEmphasisClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__BOLD:
				return ((InternalEList<?>)getBold()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__FIXED_CASE:
				return ((InternalEList<?>)getFixedCase()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__ITALIC:
				return ((InternalEList<?>)getItalic()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__MONOSPACE:
				return ((InternalEList<?>)getMonospace()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__OVERLINE:
				return ((InternalEList<?>)getOverline()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__ROMAN:
				return ((InternalEList<?>)getRoman()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__SANS_SERIF:
				return ((InternalEList<?>)getSansSerif()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__SC:
				return ((InternalEList<?>)getSc()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__UNDERLINE:
				return ((InternalEList<?>)getUnderline()).basicRemove(otherEnd, msgs);
			case Jats1Package.PRICE_TYPE__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PRICE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.PRICE_TYPE__EMPHASIS_CLASS:
				if (coreType) return getEmphasisClass();
				return ((FeatureMap.Internal)getEmphasisClass()).getWrapper();
			case Jats1Package.PRICE_TYPE__BOLD:
				return getBold();
			case Jats1Package.PRICE_TYPE__FIXED_CASE:
				return getFixedCase();
			case Jats1Package.PRICE_TYPE__ITALIC:
				return getItalic();
			case Jats1Package.PRICE_TYPE__MONOSPACE:
				return getMonospace();
			case Jats1Package.PRICE_TYPE__OVERLINE:
				return getOverline();
			case Jats1Package.PRICE_TYPE__ROMAN:
				return getRoman();
			case Jats1Package.PRICE_TYPE__SANS_SERIF:
				return getSansSerif();
			case Jats1Package.PRICE_TYPE__SC:
				return getSc();
			case Jats1Package.PRICE_TYPE__STRIKE:
				return getStrike();
			case Jats1Package.PRICE_TYPE__UNDERLINE:
				return getUnderline();
			case Jats1Package.PRICE_TYPE__RUBY:
				return getRuby();
			case Jats1Package.PRICE_TYPE__BASE:
				return getBase();
			case Jats1Package.PRICE_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.PRICE_TYPE__CURRENCY:
				return getCurrency();
			case Jats1Package.PRICE_TYPE__ID:
				return getId();
			case Jats1Package.PRICE_TYPE__LANG:
				return getLang();
			case Jats1Package.PRICE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PRICE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.PRICE_TYPE__EMPHASIS_CLASS:
				((FeatureMap.Internal)getEmphasisClass()).set(newValue);
				return;
			case Jats1Package.PRICE_TYPE__BOLD:
				getBold().clear();
				getBold().addAll((Collection<? extends BoldType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				getFixedCase().addAll((Collection<? extends FixedCaseType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__ITALIC:
				getItalic().clear();
				getItalic().addAll((Collection<? extends ItalicType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__MONOSPACE:
				getMonospace().clear();
				getMonospace().addAll((Collection<? extends MonospaceType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__OVERLINE:
				getOverline().clear();
				getOverline().addAll((Collection<? extends OverlineType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__ROMAN:
				getRoman().clear();
				getRoman().addAll((Collection<? extends RomanType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				getSansSerif().addAll((Collection<? extends SansSerifType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__SC:
				getSc().clear();
				getSc().addAll((Collection<? extends ScType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__UNDERLINE:
				getUnderline().clear();
				getUnderline().addAll((Collection<? extends UnderlineType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case Jats1Package.PRICE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PRICE_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.PRICE_TYPE__CURRENCY:
				setCurrency((String)newValue);
				return;
			case Jats1Package.PRICE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.PRICE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.PRICE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PRICE_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.PRICE_TYPE__EMPHASIS_CLASS:
				getEmphasisClass().clear();
				return;
			case Jats1Package.PRICE_TYPE__BOLD:
				getBold().clear();
				return;
			case Jats1Package.PRICE_TYPE__FIXED_CASE:
				getFixedCase().clear();
				return;
			case Jats1Package.PRICE_TYPE__ITALIC:
				getItalic().clear();
				return;
			case Jats1Package.PRICE_TYPE__MONOSPACE:
				getMonospace().clear();
				return;
			case Jats1Package.PRICE_TYPE__OVERLINE:
				getOverline().clear();
				return;
			case Jats1Package.PRICE_TYPE__ROMAN:
				getRoman().clear();
				return;
			case Jats1Package.PRICE_TYPE__SANS_SERIF:
				getSansSerif().clear();
				return;
			case Jats1Package.PRICE_TYPE__SC:
				getSc().clear();
				return;
			case Jats1Package.PRICE_TYPE__STRIKE:
				getStrike().clear();
				return;
			case Jats1Package.PRICE_TYPE__UNDERLINE:
				getUnderline().clear();
				return;
			case Jats1Package.PRICE_TYPE__RUBY:
				getRuby().clear();
				return;
			case Jats1Package.PRICE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PRICE_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.PRICE_TYPE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case Jats1Package.PRICE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.PRICE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.PRICE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.PRICE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.PRICE_TYPE__EMPHASIS_CLASS:
				return !getEmphasisClass().isEmpty();
			case Jats1Package.PRICE_TYPE__BOLD:
				return !getBold().isEmpty();
			case Jats1Package.PRICE_TYPE__FIXED_CASE:
				return !getFixedCase().isEmpty();
			case Jats1Package.PRICE_TYPE__ITALIC:
				return !getItalic().isEmpty();
			case Jats1Package.PRICE_TYPE__MONOSPACE:
				return !getMonospace().isEmpty();
			case Jats1Package.PRICE_TYPE__OVERLINE:
				return !getOverline().isEmpty();
			case Jats1Package.PRICE_TYPE__ROMAN:
				return !getRoman().isEmpty();
			case Jats1Package.PRICE_TYPE__SANS_SERIF:
				return !getSansSerif().isEmpty();
			case Jats1Package.PRICE_TYPE__SC:
				return !getSc().isEmpty();
			case Jats1Package.PRICE_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case Jats1Package.PRICE_TYPE__UNDERLINE:
				return !getUnderline().isEmpty();
			case Jats1Package.PRICE_TYPE__RUBY:
				return !getRuby().isEmpty();
			case Jats1Package.PRICE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PRICE_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.PRICE_TYPE__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case Jats1Package.PRICE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.PRICE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.PRICE_TYPE__SPECIFIC_USE:
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
		result.append(", currency: ");
		result.append(currency);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //PriceTypeImpl
