/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ConferenceDateType;
import org.crossref.schema._4._4.EventMetadataType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceName <em>Conference Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceTheme <em>Conference Theme</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceAcronym <em>Conference Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceSponsor <em>Conference Sponsor</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceNumber <em>Conference Number</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceLocation <em>Conference Location</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.EventMetadataTypeImpl#getConferenceDate <em>Conference Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventMetadataTypeImpl extends MinimalEObjectImpl.Container implements EventMetadataType {
	/**
	 * The default value of the '{@link #getConferenceName() <em>Conference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConferenceName() <em>Conference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceName()
	 * @generated
	 * @ordered
	 */
	protected String conferenceName = CONFERENCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConferenceTheme() <em>Conference Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceTheme()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_THEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConferenceTheme() <em>Conference Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceTheme()
	 * @generated
	 * @ordered
	 */
	protected String conferenceTheme = CONFERENCE_THEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConferenceAcronym() <em>Conference Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_ACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConferenceAcronym() <em>Conference Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceAcronym()
	 * @generated
	 * @ordered
	 */
	protected String conferenceAcronym = CONFERENCE_ACRONYM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConferenceSponsor() <em>Conference Sponsor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceSponsor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> conferenceSponsor;

	/**
	 * The default value of the '{@link #getConferenceNumber() <em>Conference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConferenceNumber() <em>Conference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String conferenceNumber = CONFERENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConferenceLocation() <em>Conference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFERENCE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConferenceLocation() <em>Conference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceLocation()
	 * @generated
	 * @ordered
	 */
	protected String conferenceLocation = CONFERENCE_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConferenceDate() <em>Conference Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferenceDate()
	 * @generated
	 * @ordered
	 */
	protected ConferenceDateType conferenceDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getEventMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceName() {
		return conferenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceName(String newConferenceName) {
		String oldConferenceName = conferenceName;
		conferenceName = newConferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_NAME, oldConferenceName, conferenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceTheme() {
		return conferenceTheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceTheme(String newConferenceTheme) {
		String oldConferenceTheme = conferenceTheme;
		conferenceTheme = newConferenceTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_THEME, oldConferenceTheme, conferenceTheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceAcronym() {
		return conferenceAcronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceAcronym(String newConferenceAcronym) {
		String oldConferenceAcronym = conferenceAcronym;
		conferenceAcronym = newConferenceAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_ACRONYM, oldConferenceAcronym, conferenceAcronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConferenceSponsor() {
		if (conferenceSponsor == null) {
			conferenceSponsor = new EDataTypeEList<String>(String.class, this, _4Package.EVENT_METADATA_TYPE__CONFERENCE_SPONSOR);
		}
		return conferenceSponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceNumber() {
		return conferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceNumber(String newConferenceNumber) {
		String oldConferenceNumber = conferenceNumber;
		conferenceNumber = newConferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_NUMBER, oldConferenceNumber, conferenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConferenceLocation() {
		return conferenceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConferenceLocation(String newConferenceLocation) {
		String oldConferenceLocation = conferenceLocation;
		conferenceLocation = newConferenceLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_LOCATION, oldConferenceLocation, conferenceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConferenceDateType getConferenceDate() {
		return conferenceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConferenceDate(ConferenceDateType newConferenceDate, NotificationChain msgs) {
		ConferenceDateType oldConferenceDate = conferenceDate;
		conferenceDate = newConferenceDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE, oldConferenceDate, newConferenceDate);
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
	public void setConferenceDate(ConferenceDateType newConferenceDate) {
		if (newConferenceDate != conferenceDate) {
			NotificationChain msgs = null;
			if (conferenceDate != null)
				msgs = ((InternalEObject)conferenceDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE, null, msgs);
			if (newConferenceDate != null)
				msgs = ((InternalEObject)newConferenceDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE, null, msgs);
			msgs = basicSetConferenceDate(newConferenceDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE, newConferenceDate, newConferenceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE:
				return basicSetConferenceDate(null, msgs);
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
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NAME:
				return getConferenceName();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_THEME:
				return getConferenceTheme();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_ACRONYM:
				return getConferenceAcronym();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_SPONSOR:
				return getConferenceSponsor();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NUMBER:
				return getConferenceNumber();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_LOCATION:
				return getConferenceLocation();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE:
				return getConferenceDate();
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
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NAME:
				setConferenceName((String)newValue);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_THEME:
				setConferenceTheme((String)newValue);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_ACRONYM:
				setConferenceAcronym((String)newValue);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_SPONSOR:
				getConferenceSponsor().clear();
				getConferenceSponsor().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NUMBER:
				setConferenceNumber((String)newValue);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_LOCATION:
				setConferenceLocation((String)newValue);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE:
				setConferenceDate((ConferenceDateType)newValue);
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
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NAME:
				setConferenceName(CONFERENCE_NAME_EDEFAULT);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_THEME:
				setConferenceTheme(CONFERENCE_THEME_EDEFAULT);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_ACRONYM:
				setConferenceAcronym(CONFERENCE_ACRONYM_EDEFAULT);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_SPONSOR:
				getConferenceSponsor().clear();
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NUMBER:
				setConferenceNumber(CONFERENCE_NUMBER_EDEFAULT);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_LOCATION:
				setConferenceLocation(CONFERENCE_LOCATION_EDEFAULT);
				return;
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE:
				setConferenceDate((ConferenceDateType)null);
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
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NAME:
				return CONFERENCE_NAME_EDEFAULT == null ? conferenceName != null : !CONFERENCE_NAME_EDEFAULT.equals(conferenceName);
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_THEME:
				return CONFERENCE_THEME_EDEFAULT == null ? conferenceTheme != null : !CONFERENCE_THEME_EDEFAULT.equals(conferenceTheme);
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_ACRONYM:
				return CONFERENCE_ACRONYM_EDEFAULT == null ? conferenceAcronym != null : !CONFERENCE_ACRONYM_EDEFAULT.equals(conferenceAcronym);
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_SPONSOR:
				return conferenceSponsor != null && !conferenceSponsor.isEmpty();
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_NUMBER:
				return CONFERENCE_NUMBER_EDEFAULT == null ? conferenceNumber != null : !CONFERENCE_NUMBER_EDEFAULT.equals(conferenceNumber);
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_LOCATION:
				return CONFERENCE_LOCATION_EDEFAULT == null ? conferenceLocation != null : !CONFERENCE_LOCATION_EDEFAULT.equals(conferenceLocation);
			case _4Package.EVENT_METADATA_TYPE__CONFERENCE_DATE:
				return conferenceDate != null;
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
		result.append(" (conferenceName: ");
		result.append(conferenceName);
		result.append(", conferenceTheme: ");
		result.append(conferenceTheme);
		result.append(", conferenceAcronym: ");
		result.append(conferenceAcronym);
		result.append(", conferenceSponsor: ");
		result.append(conferenceSponsor);
		result.append(", conferenceNumber: ");
		result.append(conferenceNumber);
		result.append(", conferenceLocation: ");
		result.append(conferenceLocation);
		result.append(')');
		return result.toString();
	}

} //EventMetadataTypeImpl
