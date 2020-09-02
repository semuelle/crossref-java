/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.DayType;
import gov.nih.nlm.ncbi.jats1.EraType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonthType;
import gov.nih.nlm.ncbi.jats1.SeasonType;
import gov.nih.nlm.ncbi.jats1.StringDateType;
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
 * An implementation of the model object '<em><b>String Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getDatePartsClass <em>Date Parts Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getEra <em>Era</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getIso8601Date <em>Iso8601 Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.StringDateTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringDateTypeImpl extends MinimalEObjectImpl.Container implements StringDateType {
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
	 * The default value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final String CALENDAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected String calendar = CALENDAR_EDEFAULT;

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
	 * The default value of the '{@link #getIso8601Date() <em>Iso8601 Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso8601Date()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO8601_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIso8601Date() <em>Iso8601 Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso8601Date()
	 * @generated
	 * @ordered
	 */
	protected String iso8601Date = ISO8601_DATE_EDEFAULT;

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
	protected StringDateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getStringDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.STRING_DATE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDatePartsClass() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Jats1Package.eINSTANCE.getStringDateType_DatePartsClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DayType> getDay() {
		return getDatePartsClass().list(Jats1Package.eINSTANCE.getStringDateType_Day());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EraType> getEra() {
		return getDatePartsClass().list(Jats1Package.eINSTANCE.getStringDateType_Era());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonthType> getMonth() {
		return getDatePartsClass().list(Jats1Package.eINSTANCE.getStringDateType_Month());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SeasonType> getSeason() {
		return getDatePartsClass().list(Jats1Package.eINSTANCE.getStringDateType_Season());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<YearType> getYear() {
		return getDatePartsClass().list(Jats1Package.eINSTANCE.getStringDateType_Year());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendar(String newCalendar) {
		String oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__CALENDAR, oldCalendar, calendar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIso8601Date() {
		return iso8601Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIso8601Date(String newIso8601Date) {
		String oldIso8601Date = iso8601Date;
		iso8601Date = newIso8601Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__ISO8601_DATE, oldIso8601Date, iso8601Date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.STRING_DATE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.STRING_DATE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_DATE_TYPE__DATE_PARTS_CLASS:
				return ((InternalEList<?>)getDatePartsClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_DATE_TYPE__DAY:
				return ((InternalEList<?>)getDay()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_DATE_TYPE__ERA:
				return ((InternalEList<?>)getEra()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_DATE_TYPE__MONTH:
				return ((InternalEList<?>)getMonth()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_DATE_TYPE__SEASON:
				return ((InternalEList<?>)getSeason()).basicRemove(otherEnd, msgs);
			case Jats1Package.STRING_DATE_TYPE__YEAR:
				return ((InternalEList<?>)getYear()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.STRING_DATE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.STRING_DATE_TYPE__DATE_PARTS_CLASS:
				if (coreType) return getDatePartsClass();
				return ((FeatureMap.Internal)getDatePartsClass()).getWrapper();
			case Jats1Package.STRING_DATE_TYPE__DAY:
				return getDay();
			case Jats1Package.STRING_DATE_TYPE__ERA:
				return getEra();
			case Jats1Package.STRING_DATE_TYPE__MONTH:
				return getMonth();
			case Jats1Package.STRING_DATE_TYPE__SEASON:
				return getSeason();
			case Jats1Package.STRING_DATE_TYPE__YEAR:
				return getYear();
			case Jats1Package.STRING_DATE_TYPE__BASE:
				return getBase();
			case Jats1Package.STRING_DATE_TYPE__CALENDAR:
				return getCalendar();
			case Jats1Package.STRING_DATE_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.STRING_DATE_TYPE__ID:
				return getId();
			case Jats1Package.STRING_DATE_TYPE__ISO8601_DATE:
				return getIso8601Date();
			case Jats1Package.STRING_DATE_TYPE__LANG:
				return getLang();
			case Jats1Package.STRING_DATE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_DATE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__DATE_PARTS_CLASS:
				((FeatureMap.Internal)getDatePartsClass()).set(newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends DayType>)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__ERA:
				getEra().clear();
				getEra().addAll((Collection<? extends EraType>)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__MONTH:
				getMonth().clear();
				getMonth().addAll((Collection<? extends MonthType>)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__SEASON:
				getSeason().clear();
				getSeason().addAll((Collection<? extends SeasonType>)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__YEAR:
				getYear().clear();
				getYear().addAll((Collection<? extends YearType>)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__CALENDAR:
				setCalendar((String)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__ISO8601_DATE:
				setIso8601Date((String)newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.STRING_DATE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_DATE_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__DATE_PARTS_CLASS:
				getDatePartsClass().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__DAY:
				getDay().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__ERA:
				getEra().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__MONTH:
				getMonth().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__SEASON:
				getSeason().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__YEAR:
				getYear().clear();
				return;
			case Jats1Package.STRING_DATE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.STRING_DATE_TYPE__CALENDAR:
				setCalendar(CALENDAR_EDEFAULT);
				return;
			case Jats1Package.STRING_DATE_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.STRING_DATE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.STRING_DATE_TYPE__ISO8601_DATE:
				setIso8601Date(ISO8601_DATE_EDEFAULT);
				return;
			case Jats1Package.STRING_DATE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.STRING_DATE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.STRING_DATE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.STRING_DATE_TYPE__DATE_PARTS_CLASS:
				return !getDatePartsClass().isEmpty();
			case Jats1Package.STRING_DATE_TYPE__DAY:
				return !getDay().isEmpty();
			case Jats1Package.STRING_DATE_TYPE__ERA:
				return !getEra().isEmpty();
			case Jats1Package.STRING_DATE_TYPE__MONTH:
				return !getMonth().isEmpty();
			case Jats1Package.STRING_DATE_TYPE__SEASON:
				return !getSeason().isEmpty();
			case Jats1Package.STRING_DATE_TYPE__YEAR:
				return !getYear().isEmpty();
			case Jats1Package.STRING_DATE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.STRING_DATE_TYPE__CALENDAR:
				return CALENDAR_EDEFAULT == null ? calendar != null : !CALENDAR_EDEFAULT.equals(calendar);
			case Jats1Package.STRING_DATE_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.STRING_DATE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.STRING_DATE_TYPE__ISO8601_DATE:
				return ISO8601_DATE_EDEFAULT == null ? iso8601Date != null : !ISO8601_DATE_EDEFAULT.equals(iso8601Date);
			case Jats1Package.STRING_DATE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.STRING_DATE_TYPE__SPECIFIC_USE:
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
		result.append(", calendar: ");
		result.append(calendar);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", iso8601Date: ");
		result.append(iso8601Date);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //StringDateTypeImpl
