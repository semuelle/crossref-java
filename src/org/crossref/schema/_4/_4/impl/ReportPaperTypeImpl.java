/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.ComponentListType;
import org.crossref.schema._4._4.ContentItemType;
import org.crossref.schema._4._4.PublicationTypeType;
import org.crossref.schema._4._4.ReportPaperMetadataType;
import org.crossref.schema._4._4.ReportPaperSeriesMetadataType;
import org.crossref.schema._4._4.ReportPaperType;
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
 * An implementation of the model object '<em><b>Report Paper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.ReportPaperTypeImpl#getReportPaperMetadata <em>Report Paper Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ReportPaperTypeImpl#getReportPaperSeriesMetadata <em>Report Paper Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ReportPaperTypeImpl#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ReportPaperTypeImpl#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.ReportPaperTypeImpl#getPublicationType <em>Publication Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportPaperTypeImpl extends MinimalEObjectImpl.Container implements ReportPaperType {
	/**
	 * The cached value of the '{@link #getReportPaperMetadata() <em>Report Paper Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportPaperMetadata()
	 * @generated
	 * @ordered
	 */
	protected ReportPaperMetadataType reportPaperMetadata;

	/**
	 * The cached value of the '{@link #getReportPaperSeriesMetadata() <em>Report Paper Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportPaperSeriesMetadata()
	 * @generated
	 * @ordered
	 */
	protected ReportPaperSeriesMetadataType reportPaperSeriesMetadata;

	/**
	 * The cached value of the '{@link #getContentItem() <em>Content Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentItemType> contentItem;

	/**
	 * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentList()
	 * @generated
	 * @ordered
	 */
	protected ComponentListType componentList;

	/**
	 * The default value of the '{@link #getPublicationType() <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationType()
	 * @generated
	 * @ordered
	 */
	protected static final PublicationTypeType PUBLICATION_TYPE_EDEFAULT = PublicationTypeType.FULL_TEXT;

	/**
	 * The cached value of the '{@link #getPublicationType() <em>Publication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationType()
	 * @generated
	 * @ordered
	 */
	protected PublicationTypeType publicationType = PUBLICATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Publication Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publicationTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportPaperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getReportPaperType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperMetadataType getReportPaperMetadata() {
		return reportPaperMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportPaperMetadata(ReportPaperMetadataType newReportPaperMetadata, NotificationChain msgs) {
		ReportPaperMetadataType oldReportPaperMetadata = reportPaperMetadata;
		reportPaperMetadata = newReportPaperMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA, oldReportPaperMetadata, newReportPaperMetadata);
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
	public void setReportPaperMetadata(ReportPaperMetadataType newReportPaperMetadata) {
		if (newReportPaperMetadata != reportPaperMetadata) {
			NotificationChain msgs = null;
			if (reportPaperMetadata != null)
				msgs = ((InternalEObject)reportPaperMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA, null, msgs);
			if (newReportPaperMetadata != null)
				msgs = ((InternalEObject)newReportPaperMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA, null, msgs);
			msgs = basicSetReportPaperMetadata(newReportPaperMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA, newReportPaperMetadata, newReportPaperMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportPaperSeriesMetadataType getReportPaperSeriesMetadata() {
		return reportPaperSeriesMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportPaperSeriesMetadata(ReportPaperSeriesMetadataType newReportPaperSeriesMetadata, NotificationChain msgs) {
		ReportPaperSeriesMetadataType oldReportPaperSeriesMetadata = reportPaperSeriesMetadata;
		reportPaperSeriesMetadata = newReportPaperSeriesMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA, oldReportPaperSeriesMetadata, newReportPaperSeriesMetadata);
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
	public void setReportPaperSeriesMetadata(ReportPaperSeriesMetadataType newReportPaperSeriesMetadata) {
		if (newReportPaperSeriesMetadata != reportPaperSeriesMetadata) {
			NotificationChain msgs = null;
			if (reportPaperSeriesMetadata != null)
				msgs = ((InternalEObject)reportPaperSeriesMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA, null, msgs);
			if (newReportPaperSeriesMetadata != null)
				msgs = ((InternalEObject)newReportPaperSeriesMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA, null, msgs);
			msgs = basicSetReportPaperSeriesMetadata(newReportPaperSeriesMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA, newReportPaperSeriesMetadata, newReportPaperSeriesMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentItemType> getContentItem() {
		if (contentItem == null) {
			contentItem = new EObjectContainmentEList<ContentItemType>(ContentItemType.class, this, _4Package.REPORT_PAPER_TYPE__CONTENT_ITEM);
		}
		return contentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentListType getComponentList() {
		return componentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentList(ComponentListType newComponentList, NotificationChain msgs) {
		ComponentListType oldComponentList = componentList;
		componentList = newComponentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST, oldComponentList, newComponentList);
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
	public void setComponentList(ComponentListType newComponentList) {
		if (newComponentList != componentList) {
			NotificationChain msgs = null;
			if (componentList != null)
				msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST, null, msgs);
			if (newComponentList != null)
				msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST, null, msgs);
			msgs = basicSetComponentList(newComponentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST, newComponentList, newComponentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationTypeType getPublicationType() {
		return publicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationType(PublicationTypeType newPublicationType) {
		PublicationTypeType oldPublicationType = publicationType;
		publicationType = newPublicationType == null ? PUBLICATION_TYPE_EDEFAULT : newPublicationType;
		boolean oldPublicationTypeESet = publicationTypeESet;
		publicationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.REPORT_PAPER_TYPE__PUBLICATION_TYPE, oldPublicationType, publicationType, !oldPublicationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPublicationType() {
		PublicationTypeType oldPublicationType = publicationType;
		boolean oldPublicationTypeESet = publicationTypeESet;
		publicationType = PUBLICATION_TYPE_EDEFAULT;
		publicationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.REPORT_PAPER_TYPE__PUBLICATION_TYPE, oldPublicationType, PUBLICATION_TYPE_EDEFAULT, oldPublicationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPublicationType() {
		return publicationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA:
				return basicSetReportPaperMetadata(null, msgs);
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA:
				return basicSetReportPaperSeriesMetadata(null, msgs);
			case _4Package.REPORT_PAPER_TYPE__CONTENT_ITEM:
				return ((InternalEList<?>)getContentItem()).basicRemove(otherEnd, msgs);
			case _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST:
				return basicSetComponentList(null, msgs);
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
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA:
				return getReportPaperMetadata();
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA:
				return getReportPaperSeriesMetadata();
			case _4Package.REPORT_PAPER_TYPE__CONTENT_ITEM:
				return getContentItem();
			case _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST:
				return getComponentList();
			case _4Package.REPORT_PAPER_TYPE__PUBLICATION_TYPE:
				return getPublicationType();
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
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA:
				setReportPaperMetadata((ReportPaperMetadataType)newValue);
				return;
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA:
				setReportPaperSeriesMetadata((ReportPaperSeriesMetadataType)newValue);
				return;
			case _4Package.REPORT_PAPER_TYPE__CONTENT_ITEM:
				getContentItem().clear();
				getContentItem().addAll((Collection<? extends ContentItemType>)newValue);
				return;
			case _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)newValue);
				return;
			case _4Package.REPORT_PAPER_TYPE__PUBLICATION_TYPE:
				setPublicationType((PublicationTypeType)newValue);
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
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA:
				setReportPaperMetadata((ReportPaperMetadataType)null);
				return;
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA:
				setReportPaperSeriesMetadata((ReportPaperSeriesMetadataType)null);
				return;
			case _4Package.REPORT_PAPER_TYPE__CONTENT_ITEM:
				getContentItem().clear();
				return;
			case _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST:
				setComponentList((ComponentListType)null);
				return;
			case _4Package.REPORT_PAPER_TYPE__PUBLICATION_TYPE:
				unsetPublicationType();
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
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_METADATA:
				return reportPaperMetadata != null;
			case _4Package.REPORT_PAPER_TYPE__REPORT_PAPER_SERIES_METADATA:
				return reportPaperSeriesMetadata != null;
			case _4Package.REPORT_PAPER_TYPE__CONTENT_ITEM:
				return contentItem != null && !contentItem.isEmpty();
			case _4Package.REPORT_PAPER_TYPE__COMPONENT_LIST:
				return componentList != null;
			case _4Package.REPORT_PAPER_TYPE__PUBLICATION_TYPE:
				return isSetPublicationType();
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
		result.append(" (publicationType: ");
		if (publicationTypeESet) result.append(publicationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReportPaperTypeImpl
