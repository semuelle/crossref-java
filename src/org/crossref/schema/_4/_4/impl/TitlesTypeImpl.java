/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.OriginalLanguageTitleType;
import org.crossref.schema._4._4.SubtitleType;
import org.crossref.schema._4._4.TitleType;
import org.crossref.schema._4._4.TitlesType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Titles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.TitlesTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.TitlesTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.TitlesTypeImpl#getOriginalLanguageTitle <em>Original Language Title</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.TitlesTypeImpl#getSubtitle1 <em>Subtitle1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitlesTypeImpl extends MinimalEObjectImpl.Container implements TitlesType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected SubtitleType subtitle;

	/**
	 * The cached value of the '{@link #getOriginalLanguageTitle() <em>Original Language Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalLanguageTitle()
	 * @generated
	 * @ordered
	 */
	protected OriginalLanguageTitleType originalLanguageTitle;

	/**
	 * The cached value of the '{@link #getSubtitle1() <em>Subtitle1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle1()
	 * @generated
	 * @ordered
	 */
	protected SubtitleType subtitle1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitlesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getTitlesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		SubtitleType oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__SUBTITLE, oldSubtitle, newSubtitle);
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
	public void setSubtitle(SubtitleType newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OriginalLanguageTitleType getOriginalLanguageTitle() {
		return originalLanguageTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalLanguageTitle(OriginalLanguageTitleType newOriginalLanguageTitle, NotificationChain msgs) {
		OriginalLanguageTitleType oldOriginalLanguageTitle = originalLanguageTitle;
		originalLanguageTitle = newOriginalLanguageTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE, oldOriginalLanguageTitle, newOriginalLanguageTitle);
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
	public void setOriginalLanguageTitle(OriginalLanguageTitleType newOriginalLanguageTitle) {
		if (newOriginalLanguageTitle != originalLanguageTitle) {
			NotificationChain msgs = null;
			if (originalLanguageTitle != null)
				msgs = ((InternalEObject)originalLanguageTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE, null, msgs);
			if (newOriginalLanguageTitle != null)
				msgs = ((InternalEObject)newOriginalLanguageTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE, null, msgs);
			msgs = basicSetOriginalLanguageTitle(newOriginalLanguageTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE, newOriginalLanguageTitle, newOriginalLanguageTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtitleType getSubtitle1() {
		return subtitle1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle1(SubtitleType newSubtitle1, NotificationChain msgs) {
		SubtitleType oldSubtitle1 = subtitle1;
		subtitle1 = newSubtitle1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__SUBTITLE1, oldSubtitle1, newSubtitle1);
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
	public void setSubtitle1(SubtitleType newSubtitle1) {
		if (newSubtitle1 != subtitle1) {
			NotificationChain msgs = null;
			if (subtitle1 != null)
				msgs = ((InternalEObject)subtitle1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__SUBTITLE1, null, msgs);
			if (newSubtitle1 != null)
				msgs = ((InternalEObject)newSubtitle1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.TITLES_TYPE__SUBTITLE1, null, msgs);
			msgs = basicSetSubtitle1(newSubtitle1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.TITLES_TYPE__SUBTITLE1, newSubtitle1, newSubtitle1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.TITLES_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case _4Package.TITLES_TYPE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE:
				return basicSetOriginalLanguageTitle(null, msgs);
			case _4Package.TITLES_TYPE__SUBTITLE1:
				return basicSetSubtitle1(null, msgs);
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
			case _4Package.TITLES_TYPE__TITLE:
				return getTitle();
			case _4Package.TITLES_TYPE__SUBTITLE:
				return getSubtitle();
			case _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE:
				return getOriginalLanguageTitle();
			case _4Package.TITLES_TYPE__SUBTITLE1:
				return getSubtitle1();
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
			case _4Package.TITLES_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case _4Package.TITLES_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE:
				setOriginalLanguageTitle((OriginalLanguageTitleType)newValue);
				return;
			case _4Package.TITLES_TYPE__SUBTITLE1:
				setSubtitle1((SubtitleType)newValue);
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
			case _4Package.TITLES_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case _4Package.TITLES_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE:
				setOriginalLanguageTitle((OriginalLanguageTitleType)null);
				return;
			case _4Package.TITLES_TYPE__SUBTITLE1:
				setSubtitle1((SubtitleType)null);
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
			case _4Package.TITLES_TYPE__TITLE:
				return title != null;
			case _4Package.TITLES_TYPE__SUBTITLE:
				return subtitle != null;
			case _4Package.TITLES_TYPE__ORIGINAL_LANGUAGE_TITLE:
				return originalLanguageTitle != null;
			case _4Package.TITLES_TYPE__SUBTITLE1:
				return subtitle1 != null;
		}
		return super.eIsSet(featureID);
	}

} //TitlesTypeImpl
