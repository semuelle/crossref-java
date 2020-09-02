/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.DateType;
import gov.nih.nlm.ncbi.jats1.DayType;
import gov.nih.nlm.ncbi.jats1.EraType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MonthType;
import gov.nih.nlm.ncbi.jats1.SeasonType;
import gov.nih.nlm.ncbi.jats1.YearType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getEra <em>Era</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getDateType <em>Date Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getIso8601Date <em>Iso8601 Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getPublicationFormat <em>Publication Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.DateTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTypeImpl extends MinimalEObjectImpl.Container implements DateType {
	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected DayType day;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected MonthType month;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected SeasonType season;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected YearType year;

	/**
	 * The cached value of the '{@link #getEra() <em>Era</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEra()
	 * @generated
	 * @ordered
	 */
	protected EraType era;

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
	 * The default value of the '{@link #getDateType() <em>Date Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateType() <em>Date Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateType()
	 * @generated
	 * @ordered
	 */
	protected String dateType = DATE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getPublicationFormat() <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationFormat() <em>Publication Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationFormat()
	 * @generated
	 * @ordered
	 */
	protected String publicationFormat = PUBLICATION_FORMAT_EDEFAULT;

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
	protected DateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayType getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDay(DayType newDay, NotificationChain msgs) {
		DayType oldDay = day;
		day = newDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__DAY, oldDay, newDay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(DayType newDay) {
		if (newDay != day) {
			NotificationChain msgs = null;
			if (day != null)
				msgs = ((InternalEObject)day).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__DAY, null, msgs);
			if (newDay != null)
				msgs = ((InternalEObject)newDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__DAY, null, msgs);
			msgs = basicSetDay(newDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__DAY, newDay, newDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonthType getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonth(MonthType newMonth, NotificationChain msgs) {
		MonthType oldMonth = month;
		month = newMonth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__MONTH, oldMonth, newMonth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonth(MonthType newMonth) {
		if (newMonth != month) {
			NotificationChain msgs = null;
			if (month != null)
				msgs = ((InternalEObject)month).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__MONTH, null, msgs);
			if (newMonth != null)
				msgs = ((InternalEObject)newMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__MONTH, null, msgs);
			msgs = basicSetMonth(newMonth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__MONTH, newMonth, newMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeasonType getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(SeasonType newSeason, NotificationChain msgs) {
		SeasonType oldSeason = season;
		season = newSeason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__SEASON, oldSeason, newSeason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(SeasonType newSeason) {
		if (newSeason != season) {
			NotificationChain msgs = null;
			if (season != null)
				msgs = ((InternalEObject)season).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__SEASON, null, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__SEASON, null, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YearType getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(YearType newYear, NotificationChain msgs) {
		YearType oldYear = year;
		year = newYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__YEAR, oldYear, newYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(YearType newYear) {
		if (newYear != year) {
			NotificationChain msgs = null;
			if (year != null)
				msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__YEAR, null, msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__YEAR, null, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EraType getEra() {
		return era;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEra(EraType newEra, NotificationChain msgs) {
		EraType oldEra = era;
		era = newEra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__ERA, oldEra, newEra);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEra(EraType newEra) {
		if (newEra != era) {
			NotificationChain msgs = null;
			if (era != null)
				msgs = ((InternalEObject)era).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__ERA, null, msgs);
			if (newEra != null)
				msgs = ((InternalEObject)newEra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.DATE_TYPE__ERA, null, msgs);
			msgs = basicSetEra(newEra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__ERA, newEra, newEra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__CALENDAR, oldCalendar, calendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateType() {
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateType(String newDateType) {
		String oldDateType = dateType;
		dateType = newDateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__DATE_TYPE, oldDateType, dateType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__ISO8601_DATE, oldIso8601Date, iso8601Date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicationFormat() {
		return publicationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationFormat(String newPublicationFormat) {
		String oldPublicationFormat = publicationFormat;
		publicationFormat = newPublicationFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__PUBLICATION_FORMAT, oldPublicationFormat, publicationFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.DATE_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.DATE_TYPE__DAY:
				return basicSetDay(null, msgs);
			case Jats1Package.DATE_TYPE__MONTH:
				return basicSetMonth(null, msgs);
			case Jats1Package.DATE_TYPE__SEASON:
				return basicSetSeason(null, msgs);
			case Jats1Package.DATE_TYPE__YEAR:
				return basicSetYear(null, msgs);
			case Jats1Package.DATE_TYPE__ERA:
				return basicSetEra(null, msgs);
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
			case Jats1Package.DATE_TYPE__DAY:
				return getDay();
			case Jats1Package.DATE_TYPE__MONTH:
				return getMonth();
			case Jats1Package.DATE_TYPE__SEASON:
				return getSeason();
			case Jats1Package.DATE_TYPE__YEAR:
				return getYear();
			case Jats1Package.DATE_TYPE__ERA:
				return getEra();
			case Jats1Package.DATE_TYPE__BASE:
				return getBase();
			case Jats1Package.DATE_TYPE__CALENDAR:
				return getCalendar();
			case Jats1Package.DATE_TYPE__DATE_TYPE:
				return getDateType();
			case Jats1Package.DATE_TYPE__ID:
				return getId();
			case Jats1Package.DATE_TYPE__ISO8601_DATE:
				return getIso8601Date();
			case Jats1Package.DATE_TYPE__PUBLICATION_FORMAT:
				return getPublicationFormat();
			case Jats1Package.DATE_TYPE__SPECIFIC_USE:
				return getSpecificUse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.DATE_TYPE__DAY:
				setDay((DayType)newValue);
				return;
			case Jats1Package.DATE_TYPE__MONTH:
				setMonth((MonthType)newValue);
				return;
			case Jats1Package.DATE_TYPE__SEASON:
				setSeason((SeasonType)newValue);
				return;
			case Jats1Package.DATE_TYPE__YEAR:
				setYear((YearType)newValue);
				return;
			case Jats1Package.DATE_TYPE__ERA:
				setEra((EraType)newValue);
				return;
			case Jats1Package.DATE_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.DATE_TYPE__CALENDAR:
				setCalendar((String)newValue);
				return;
			case Jats1Package.DATE_TYPE__DATE_TYPE:
				setDateType((String)newValue);
				return;
			case Jats1Package.DATE_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.DATE_TYPE__ISO8601_DATE:
				setIso8601Date((String)newValue);
				return;
			case Jats1Package.DATE_TYPE__PUBLICATION_FORMAT:
				setPublicationFormat((String)newValue);
				return;
			case Jats1Package.DATE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.DATE_TYPE__DAY:
				setDay((DayType)null);
				return;
			case Jats1Package.DATE_TYPE__MONTH:
				setMonth((MonthType)null);
				return;
			case Jats1Package.DATE_TYPE__SEASON:
				setSeason((SeasonType)null);
				return;
			case Jats1Package.DATE_TYPE__YEAR:
				setYear((YearType)null);
				return;
			case Jats1Package.DATE_TYPE__ERA:
				setEra((EraType)null);
				return;
			case Jats1Package.DATE_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.DATE_TYPE__CALENDAR:
				setCalendar(CALENDAR_EDEFAULT);
				return;
			case Jats1Package.DATE_TYPE__DATE_TYPE:
				setDateType(DATE_TYPE_EDEFAULT);
				return;
			case Jats1Package.DATE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.DATE_TYPE__ISO8601_DATE:
				setIso8601Date(ISO8601_DATE_EDEFAULT);
				return;
			case Jats1Package.DATE_TYPE__PUBLICATION_FORMAT:
				setPublicationFormat(PUBLICATION_FORMAT_EDEFAULT);
				return;
			case Jats1Package.DATE_TYPE__SPECIFIC_USE:
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
			case Jats1Package.DATE_TYPE__DAY:
				return day != null;
			case Jats1Package.DATE_TYPE__MONTH:
				return month != null;
			case Jats1Package.DATE_TYPE__SEASON:
				return season != null;
			case Jats1Package.DATE_TYPE__YEAR:
				return year != null;
			case Jats1Package.DATE_TYPE__ERA:
				return era != null;
			case Jats1Package.DATE_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.DATE_TYPE__CALENDAR:
				return CALENDAR_EDEFAULT == null ? calendar != null : !CALENDAR_EDEFAULT.equals(calendar);
			case Jats1Package.DATE_TYPE__DATE_TYPE:
				return DATE_TYPE_EDEFAULT == null ? dateType != null : !DATE_TYPE_EDEFAULT.equals(dateType);
			case Jats1Package.DATE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.DATE_TYPE__ISO8601_DATE:
				return ISO8601_DATE_EDEFAULT == null ? iso8601Date != null : !ISO8601_DATE_EDEFAULT.equals(iso8601Date);
			case Jats1Package.DATE_TYPE__PUBLICATION_FORMAT:
				return PUBLICATION_FORMAT_EDEFAULT == null ? publicationFormat != null : !PUBLICATION_FORMAT_EDEFAULT.equals(publicationFormat);
			case Jats1Package.DATE_TYPE__SPECIFIC_USE:
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
		result.append(" (base: ");
		result.append(base);
		result.append(", calendar: ");
		result.append(calendar);
		result.append(", dateType: ");
		result.append(dateType);
		result.append(", id: ");
		result.append(id);
		result.append(", iso8601Date: ");
		result.append(iso8601Date);
		result.append(", publicationFormat: ");
		result.append(publicationFormat);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //DateTypeImpl
