/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.JournalArticleType;
import org.crossref.schema._4._4.JournalIssueType;
import org.crossref.schema._4._4.JournalMetadataType;
import org.crossref.schema._4._4.JournalType;
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
 * An implementation of the model object '<em><b>Journal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalTypeImpl#getJournalMetadata <em>Journal Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalTypeImpl#getJournalIssue <em>Journal Issue</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.JournalTypeImpl#getJournalArticle <em>Journal Article</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JournalTypeImpl extends MinimalEObjectImpl.Container implements JournalType {
	/**
	 * The cached value of the '{@link #getJournalMetadata() <em>Journal Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalMetadata()
	 * @generated
	 * @ordered
	 */
	protected JournalMetadataType journalMetadata;

	/**
	 * The cached value of the '{@link #getJournalIssue() <em>Journal Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalIssue()
	 * @generated
	 * @ordered
	 */
	protected JournalIssueType journalIssue;

	/**
	 * The cached value of the '{@link #getJournalArticle() <em>Journal Article</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalArticle()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalArticleType> journalArticle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getJournalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalMetadataType getJournalMetadata() {
		return journalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalMetadata(JournalMetadataType newJournalMetadata, NotificationChain msgs) {
		JournalMetadataType oldJournalMetadata = journalMetadata;
		journalMetadata = newJournalMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_TYPE__JOURNAL_METADATA, oldJournalMetadata, newJournalMetadata);
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
	public void setJournalMetadata(JournalMetadataType newJournalMetadata) {
		if (newJournalMetadata != journalMetadata) {
			NotificationChain msgs = null;
			if (journalMetadata != null)
				msgs = ((InternalEObject)journalMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_TYPE__JOURNAL_METADATA, null, msgs);
			if (newJournalMetadata != null)
				msgs = ((InternalEObject)newJournalMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_TYPE__JOURNAL_METADATA, null, msgs);
			msgs = basicSetJournalMetadata(newJournalMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_TYPE__JOURNAL_METADATA, newJournalMetadata, newJournalMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JournalIssueType getJournalIssue() {
		return journalIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJournalIssue(JournalIssueType newJournalIssue, NotificationChain msgs) {
		JournalIssueType oldJournalIssue = journalIssue;
		journalIssue = newJournalIssue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_TYPE__JOURNAL_ISSUE, oldJournalIssue, newJournalIssue);
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
	public void setJournalIssue(JournalIssueType newJournalIssue) {
		if (newJournalIssue != journalIssue) {
			NotificationChain msgs = null;
			if (journalIssue != null)
				msgs = ((InternalEObject)journalIssue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_TYPE__JOURNAL_ISSUE, null, msgs);
			if (newJournalIssue != null)
				msgs = ((InternalEObject)newJournalIssue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.JOURNAL_TYPE__JOURNAL_ISSUE, null, msgs);
			msgs = basicSetJournalIssue(newJournalIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.JOURNAL_TYPE__JOURNAL_ISSUE, newJournalIssue, newJournalIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JournalArticleType> getJournalArticle() {
		if (journalArticle == null) {
			journalArticle = new EObjectContainmentEList<JournalArticleType>(JournalArticleType.class, this, _4Package.JOURNAL_TYPE__JOURNAL_ARTICLE);
		}
		return journalArticle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.JOURNAL_TYPE__JOURNAL_METADATA:
				return basicSetJournalMetadata(null, msgs);
			case _4Package.JOURNAL_TYPE__JOURNAL_ISSUE:
				return basicSetJournalIssue(null, msgs);
			case _4Package.JOURNAL_TYPE__JOURNAL_ARTICLE:
				return ((InternalEList<?>)getJournalArticle()).basicRemove(otherEnd, msgs);
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
			case _4Package.JOURNAL_TYPE__JOURNAL_METADATA:
				return getJournalMetadata();
			case _4Package.JOURNAL_TYPE__JOURNAL_ISSUE:
				return getJournalIssue();
			case _4Package.JOURNAL_TYPE__JOURNAL_ARTICLE:
				return getJournalArticle();
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
			case _4Package.JOURNAL_TYPE__JOURNAL_METADATA:
				setJournalMetadata((JournalMetadataType)newValue);
				return;
			case _4Package.JOURNAL_TYPE__JOURNAL_ISSUE:
				setJournalIssue((JournalIssueType)newValue);
				return;
			case _4Package.JOURNAL_TYPE__JOURNAL_ARTICLE:
				getJournalArticle().clear();
				getJournalArticle().addAll((Collection<? extends JournalArticleType>)newValue);
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
			case _4Package.JOURNAL_TYPE__JOURNAL_METADATA:
				setJournalMetadata((JournalMetadataType)null);
				return;
			case _4Package.JOURNAL_TYPE__JOURNAL_ISSUE:
				setJournalIssue((JournalIssueType)null);
				return;
			case _4Package.JOURNAL_TYPE__JOURNAL_ARTICLE:
				getJournalArticle().clear();
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
			case _4Package.JOURNAL_TYPE__JOURNAL_METADATA:
				return journalMetadata != null;
			case _4Package.JOURNAL_TYPE__JOURNAL_ISSUE:
				return journalIssue != null;
			case _4Package.JOURNAL_TYPE__JOURNAL_ARTICLE:
				return journalArticle != null && !journalArticle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JournalTypeImpl
