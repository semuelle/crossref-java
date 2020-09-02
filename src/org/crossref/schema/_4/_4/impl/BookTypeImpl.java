/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.BookMetadataType;
import org.crossref.schema._4._4.BookSeriesMetadataType;
import org.crossref.schema._4._4.BookSetMetadataType;
import org.crossref.schema._4._4.BookType;
import org.crossref.schema._4._4.BookTypeType;
import org.crossref.schema._4._4.ContentItemType;
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
 * An implementation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.BookTypeImpl#getBookMetadata <em>Book Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BookTypeImpl#getBookSeriesMetadata <em>Book Series Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BookTypeImpl#getBookSetMetadata <em>Book Set Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BookTypeImpl#getContentItem <em>Content Item</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.BookTypeImpl#getBookType <em>Book Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookTypeImpl extends MinimalEObjectImpl.Container implements BookType {
	/**
	 * The cached value of the '{@link #getBookMetadata() <em>Book Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookMetadata()
	 * @generated
	 * @ordered
	 */
	protected BookMetadataType bookMetadata;

	/**
	 * The cached value of the '{@link #getBookSeriesMetadata() <em>Book Series Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookSeriesMetadata()
	 * @generated
	 * @ordered
	 */
	protected BookSeriesMetadataType bookSeriesMetadata;

	/**
	 * The cached value of the '{@link #getBookSetMetadata() <em>Book Set Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookSetMetadata()
	 * @generated
	 * @ordered
	 */
	protected BookSetMetadataType bookSetMetadata;

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
	 * The default value of the '{@link #getBookType() <em>Book Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookType()
	 * @generated
	 * @ordered
	 */
	protected static final BookTypeType BOOK_TYPE_EDEFAULT = BookTypeType.EDITED_BOOK;

	/**
	 * The cached value of the '{@link #getBookType() <em>Book Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookType()
	 * @generated
	 * @ordered
	 */
	protected BookTypeType bookType = BOOK_TYPE_EDEFAULT;

	/**
	 * This is true if the Book Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bookTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getBookType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookMetadataType getBookMetadata() {
		return bookMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookMetadata(BookMetadataType newBookMetadata, NotificationChain msgs) {
		BookMetadataType oldBookMetadata = bookMetadata;
		bookMetadata = newBookMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_METADATA, oldBookMetadata, newBookMetadata);
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
	public void setBookMetadata(BookMetadataType newBookMetadata) {
		if (newBookMetadata != bookMetadata) {
			NotificationChain msgs = null;
			if (bookMetadata != null)
				msgs = ((InternalEObject)bookMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.BOOK_TYPE__BOOK_METADATA, null, msgs);
			if (newBookMetadata != null)
				msgs = ((InternalEObject)newBookMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.BOOK_TYPE__BOOK_METADATA, null, msgs);
			msgs = basicSetBookMetadata(newBookMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_METADATA, newBookMetadata, newBookMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookSeriesMetadataType getBookSeriesMetadata() {
		return bookSeriesMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookSeriesMetadata(BookSeriesMetadataType newBookSeriesMetadata, NotificationChain msgs) {
		BookSeriesMetadataType oldBookSeriesMetadata = bookSeriesMetadata;
		bookSeriesMetadata = newBookSeriesMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_SERIES_METADATA, oldBookSeriesMetadata, newBookSeriesMetadata);
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
	public void setBookSeriesMetadata(BookSeriesMetadataType newBookSeriesMetadata) {
		if (newBookSeriesMetadata != bookSeriesMetadata) {
			NotificationChain msgs = null;
			if (bookSeriesMetadata != null)
				msgs = ((InternalEObject)bookSeriesMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.BOOK_TYPE__BOOK_SERIES_METADATA, null, msgs);
			if (newBookSeriesMetadata != null)
				msgs = ((InternalEObject)newBookSeriesMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.BOOK_TYPE__BOOK_SERIES_METADATA, null, msgs);
			msgs = basicSetBookSeriesMetadata(newBookSeriesMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_SERIES_METADATA, newBookSeriesMetadata, newBookSeriesMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookSetMetadataType getBookSetMetadata() {
		return bookSetMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookSetMetadata(BookSetMetadataType newBookSetMetadata, NotificationChain msgs) {
		BookSetMetadataType oldBookSetMetadata = bookSetMetadata;
		bookSetMetadata = newBookSetMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_SET_METADATA, oldBookSetMetadata, newBookSetMetadata);
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
	public void setBookSetMetadata(BookSetMetadataType newBookSetMetadata) {
		if (newBookSetMetadata != bookSetMetadata) {
			NotificationChain msgs = null;
			if (bookSetMetadata != null)
				msgs = ((InternalEObject)bookSetMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _4Package.BOOK_TYPE__BOOK_SET_METADATA, null, msgs);
			if (newBookSetMetadata != null)
				msgs = ((InternalEObject)newBookSetMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _4Package.BOOK_TYPE__BOOK_SET_METADATA, null, msgs);
			msgs = basicSetBookSetMetadata(newBookSetMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_SET_METADATA, newBookSetMetadata, newBookSetMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentItemType> getContentItem() {
		if (contentItem == null) {
			contentItem = new EObjectContainmentEList<ContentItemType>(ContentItemType.class, this, _4Package.BOOK_TYPE__CONTENT_ITEM);
		}
		return contentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BookTypeType getBookType() {
		return bookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookType(BookTypeType newBookType) {
		BookTypeType oldBookType = bookType;
		bookType = newBookType == null ? BOOK_TYPE_EDEFAULT : newBookType;
		boolean oldBookTypeESet = bookTypeESet;
		bookTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.BOOK_TYPE__BOOK_TYPE, oldBookType, bookType, !oldBookTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBookType() {
		BookTypeType oldBookType = bookType;
		boolean oldBookTypeESet = bookTypeESet;
		bookType = BOOK_TYPE_EDEFAULT;
		bookTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _4Package.BOOK_TYPE__BOOK_TYPE, oldBookType, BOOK_TYPE_EDEFAULT, oldBookTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBookType() {
		return bookTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.BOOK_TYPE__BOOK_METADATA:
				return basicSetBookMetadata(null, msgs);
			case _4Package.BOOK_TYPE__BOOK_SERIES_METADATA:
				return basicSetBookSeriesMetadata(null, msgs);
			case _4Package.BOOK_TYPE__BOOK_SET_METADATA:
				return basicSetBookSetMetadata(null, msgs);
			case _4Package.BOOK_TYPE__CONTENT_ITEM:
				return ((InternalEList<?>)getContentItem()).basicRemove(otherEnd, msgs);
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
			case _4Package.BOOK_TYPE__BOOK_METADATA:
				return getBookMetadata();
			case _4Package.BOOK_TYPE__BOOK_SERIES_METADATA:
				return getBookSeriesMetadata();
			case _4Package.BOOK_TYPE__BOOK_SET_METADATA:
				return getBookSetMetadata();
			case _4Package.BOOK_TYPE__CONTENT_ITEM:
				return getContentItem();
			case _4Package.BOOK_TYPE__BOOK_TYPE:
				return getBookType();
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
			case _4Package.BOOK_TYPE__BOOK_METADATA:
				setBookMetadata((BookMetadataType)newValue);
				return;
			case _4Package.BOOK_TYPE__BOOK_SERIES_METADATA:
				setBookSeriesMetadata((BookSeriesMetadataType)newValue);
				return;
			case _4Package.BOOK_TYPE__BOOK_SET_METADATA:
				setBookSetMetadata((BookSetMetadataType)newValue);
				return;
			case _4Package.BOOK_TYPE__CONTENT_ITEM:
				getContentItem().clear();
				getContentItem().addAll((Collection<? extends ContentItemType>)newValue);
				return;
			case _4Package.BOOK_TYPE__BOOK_TYPE:
				setBookType((BookTypeType)newValue);
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
			case _4Package.BOOK_TYPE__BOOK_METADATA:
				setBookMetadata((BookMetadataType)null);
				return;
			case _4Package.BOOK_TYPE__BOOK_SERIES_METADATA:
				setBookSeriesMetadata((BookSeriesMetadataType)null);
				return;
			case _4Package.BOOK_TYPE__BOOK_SET_METADATA:
				setBookSetMetadata((BookSetMetadataType)null);
				return;
			case _4Package.BOOK_TYPE__CONTENT_ITEM:
				getContentItem().clear();
				return;
			case _4Package.BOOK_TYPE__BOOK_TYPE:
				unsetBookType();
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
			case _4Package.BOOK_TYPE__BOOK_METADATA:
				return bookMetadata != null;
			case _4Package.BOOK_TYPE__BOOK_SERIES_METADATA:
				return bookSeriesMetadata != null;
			case _4Package.BOOK_TYPE__BOOK_SET_METADATA:
				return bookSetMetadata != null;
			case _4Package.BOOK_TYPE__CONTENT_ITEM:
				return contentItem != null && !contentItem.isEmpty();
			case _4Package.BOOK_TYPE__BOOK_TYPE:
				return isSetBookType();
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
		result.append(" (bookType: ");
		if (bookTypeESet) result.append(bookType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BookTypeImpl
