/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ConferencePaperType;
import org.crossref.schema._4._4.ConferenceType;
import org.crossref.schema._4._4.ContributorsType;
import org.crossref.schema._4._4.EventMetadataType;
import org.crossref.schema._4._4.ProceedingsMetadataType;
import org.crossref.schema._4._4.ProceedingsSeriesMetadataType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceTypeImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceTypeImpl#getEventMetadata <em>Event Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceTypeImpl#getProceedingsSeriesMetadata <em>Proceedings Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceTypeImpl#getProceedingsMetadata <em>Proceedings Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ConferenceTypeImpl#getConferencePaper <em>Conference Paper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceTypeImpl extends MinimalEObjectImpl.Container implements ConferenceType {
	/**
	 * The cached value of the '{@link #getContributors() <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected ContributorsType contributors;

	/**
	 * The cached value of the '{@link #getEventMetadata() <em>Event Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventMetadata()
	 * @generated
	 * @ordered
	 */
	protected EventMetadataType eventMetadata;

	/**
	 * The cached value of the '{@link #getProceedingsSeriesMetadata() <em>Proceedings Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsSeriesMetadata()
	 * @generated
	 * @ordered
	 */
	protected ProceedingsSeriesMetadataType proceedingsSeriesMetadata;

	/**
	 * The cached value of the '{@link #getProceedingsMetadata() <em>Proceedings Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedingsMetadata()
	 * @generated
	 * @ordered
	 */
	protected ProceedingsMetadataType proceedingsMetadata;

	/**
	 * The cached value of the '{@link #getConferencePaper() <em>Conference Paper</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConferencePaper()
	 * @generated
	 * @ordered
	 */
	protected EList<ConferencePaperType> conferencePaper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getConferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributorsType getContributors() {
		return contributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributors(ContributorsType newContributors, NotificationChain msgs) {
		ContributorsType oldContributors = contributors;
		contributors = newContributors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__CONTRIBUTORS, oldContributors, newContributors);
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
	public void setContributors(ContributorsType newContributors) {
		if (newContributors != contributors) {
			NotificationChain msgs = null;
			if (contributors != null)
				msgs = ((InternalEObject)contributors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__CONTRIBUTORS, null, msgs);
			if (newContributors != null)
				msgs = ((InternalEObject)newContributors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__CONTRIBUTORS, null, msgs);
			msgs = basicSetContributors(newContributors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__CONTRIBUTORS, newContributors, newContributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventMetadataType getEventMetadata() {
		return eventMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventMetadata(EventMetadataType newEventMetadata, NotificationChain msgs) {
		EventMetadataType oldEventMetadata = eventMetadata;
		eventMetadata = newEventMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__EVENT_METADATA, oldEventMetadata, newEventMetadata);
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
	public void setEventMetadata(EventMetadataType newEventMetadata) {
		if (newEventMetadata != eventMetadata) {
			NotificationChain msgs = null;
			if (eventMetadata != null)
				msgs = ((InternalEObject)eventMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__EVENT_METADATA, null, msgs);
			if (newEventMetadata != null)
				msgs = ((InternalEObject)newEventMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__EVENT_METADATA, null, msgs);
			msgs = basicSetEventMetadata(newEventMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__EVENT_METADATA, newEventMetadata, newEventMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceedingsSeriesMetadataType getProceedingsSeriesMetadata() {
		return proceedingsSeriesMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProceedingsSeriesMetadata(ProceedingsSeriesMetadataType newProceedingsSeriesMetadata, NotificationChain msgs) {
		ProceedingsSeriesMetadataType oldProceedingsSeriesMetadata = proceedingsSeriesMetadata;
		proceedingsSeriesMetadata = newProceedingsSeriesMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA, oldProceedingsSeriesMetadata, newProceedingsSeriesMetadata);
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
	public void setProceedingsSeriesMetadata(ProceedingsSeriesMetadataType newProceedingsSeriesMetadata) {
		if (newProceedingsSeriesMetadata != proceedingsSeriesMetadata) {
			NotificationChain msgs = null;
			if (proceedingsSeriesMetadata != null)
				msgs = ((InternalEObject)proceedingsSeriesMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA, null, msgs);
			if (newProceedingsSeriesMetadata != null)
				msgs = ((InternalEObject)newProceedingsSeriesMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA, null, msgs);
			msgs = basicSetProceedingsSeriesMetadata(newProceedingsSeriesMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA, newProceedingsSeriesMetadata, newProceedingsSeriesMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceedingsMetadataType getProceedingsMetadata() {
		return proceedingsMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProceedingsMetadata(ProceedingsMetadataType newProceedingsMetadata, NotificationChain msgs) {
		ProceedingsMetadataType oldProceedingsMetadata = proceedingsMetadata;
		proceedingsMetadata = newProceedingsMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA, oldProceedingsMetadata, newProceedingsMetadata);
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
	public void setProceedingsMetadata(ProceedingsMetadataType newProceedingsMetadata) {
		if (newProceedingsMetadata != proceedingsMetadata) {
			NotificationChain msgs = null;
			if (proceedingsMetadata != null)
				msgs = ((InternalEObject)proceedingsMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA, null, msgs);
			if (newProceedingsMetadata != null)
				msgs = ((InternalEObject)newProceedingsMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA, null, msgs);
			msgs = basicSetProceedingsMetadata(newProceedingsMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA, newProceedingsMetadata, newProceedingsMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConferencePaperType> getConferencePaper() {
		if (conferencePaper == null) {
			conferencePaper = new EObjectContainmentEList<ConferencePaperType>(ConferencePaperType.class, this, _4Package.CONFERENCE_TYPE__CONFERENCE_PAPER);
		}
		return conferencePaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.CONFERENCE_TYPE__CONTRIBUTORS:
				return basicSetContributors(null, msgs);
			case _4Package.CONFERENCE_TYPE__EVENT_METADATA:
				return basicSetEventMetadata(null, msgs);
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA:
				return basicSetProceedingsSeriesMetadata(null, msgs);
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA:
				return basicSetProceedingsMetadata(null, msgs);
			case _4Package.CONFERENCE_TYPE__CONFERENCE_PAPER:
				return ((InternalEList<?>)getConferencePaper()).basicRemove(otherEnd, msgs);
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
			case _4Package.CONFERENCE_TYPE__CONTRIBUTORS:
				return getContributors();
			case _4Package.CONFERENCE_TYPE__EVENT_METADATA:
				return getEventMetadata();
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA:
				return getProceedingsSeriesMetadata();
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA:
				return getProceedingsMetadata();
			case _4Package.CONFERENCE_TYPE__CONFERENCE_PAPER:
				return getConferencePaper();
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
			case _4Package.CONFERENCE_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)newValue);
				return;
			case _4Package.CONFERENCE_TYPE__EVENT_METADATA:
				setEventMetadata((EventMetadataType)newValue);
				return;
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA:
				setProceedingsSeriesMetadata((ProceedingsSeriesMetadataType)newValue);
				return;
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA:
				setProceedingsMetadata((ProceedingsMetadataType)newValue);
				return;
			case _4Package.CONFERENCE_TYPE__CONFERENCE_PAPER:
				getConferencePaper().clear();
				getConferencePaper().addAll((Collection<? extends ConferencePaperType>)newValue);
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
			case _4Package.CONFERENCE_TYPE__CONTRIBUTORS:
				setContributors((ContributorsType)null);
				return;
			case _4Package.CONFERENCE_TYPE__EVENT_METADATA:
				setEventMetadata((EventMetadataType)null);
				return;
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA:
				setProceedingsSeriesMetadata((ProceedingsSeriesMetadataType)null);
				return;
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA:
				setProceedingsMetadata((ProceedingsMetadataType)null);
				return;
			case _4Package.CONFERENCE_TYPE__CONFERENCE_PAPER:
				getConferencePaper().clear();
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
			case _4Package.CONFERENCE_TYPE__CONTRIBUTORS:
				return contributors != null;
			case _4Package.CONFERENCE_TYPE__EVENT_METADATA:
				return eventMetadata != null;
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_SERIES_METADATA:
				return proceedingsSeriesMetadata != null;
			case _4Package.CONFERENCE_TYPE__PROCEEDINGS_METADATA:
				return proceedingsMetadata != null;
			case _4Package.CONFERENCE_TYPE__CONFERENCE_PAPER:
				return conferencePaper != null && !conferencePaper.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConferenceTypeImpl
