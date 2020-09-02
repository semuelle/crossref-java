/**
 */
package org.crossref.schema._4._4.impl;

import org.crossref.schema._4._4.PagesType;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pages Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.PagesTypeImpl#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PagesTypeImpl#getLastPage <em>Last Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.PagesTypeImpl#getOtherPages <em>Other Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PagesTypeImpl extends MinimalEObjectImpl.Container implements PagesType {
	/**
	 * The default value of the '{@link #getFirstPage() <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPage()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstPage() <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPage()
	 * @generated
	 * @ordered
	 */
	protected String firstPage = FIRST_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPage() <em>Last Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPage()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPage() <em>Last Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPage()
	 * @generated
	 * @ordered
	 */
	protected String lastPage = LAST_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPages() <em>Other Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPages()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPages() <em>Other Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPages()
	 * @generated
	 * @ordered
	 */
	protected String otherPages = OTHER_PAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getPagesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstPage() {
		return firstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstPage(String newFirstPage) {
		String oldFirstPage = firstPage;
		firstPage = newFirstPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PAGES_TYPE__FIRST_PAGE, oldFirstPage, firstPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastPage() {
		return lastPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPage(String newLastPage) {
		String oldLastPage = lastPage;
		lastPage = newLastPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PAGES_TYPE__LAST_PAGE, oldLastPage, lastPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPages() {
		return otherPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPages(String newOtherPages) {
		String oldOtherPages = otherPages;
		otherPages = newOtherPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.PAGES_TYPE__OTHER_PAGES, oldOtherPages, otherPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.PAGES_TYPE__FIRST_PAGE:
				return getFirstPage();
			case _4Package.PAGES_TYPE__LAST_PAGE:
				return getLastPage();
			case _4Package.PAGES_TYPE__OTHER_PAGES:
				return getOtherPages();
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
			case _4Package.PAGES_TYPE__FIRST_PAGE:
				setFirstPage((String)newValue);
				return;
			case _4Package.PAGES_TYPE__LAST_PAGE:
				setLastPage((String)newValue);
				return;
			case _4Package.PAGES_TYPE__OTHER_PAGES:
				setOtherPages((String)newValue);
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
			case _4Package.PAGES_TYPE__FIRST_PAGE:
				setFirstPage(FIRST_PAGE_EDEFAULT);
				return;
			case _4Package.PAGES_TYPE__LAST_PAGE:
				setLastPage(LAST_PAGE_EDEFAULT);
				return;
			case _4Package.PAGES_TYPE__OTHER_PAGES:
				setOtherPages(OTHER_PAGES_EDEFAULT);
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
			case _4Package.PAGES_TYPE__FIRST_PAGE:
				return FIRST_PAGE_EDEFAULT == null ? firstPage != null : !FIRST_PAGE_EDEFAULT.equals(firstPage);
			case _4Package.PAGES_TYPE__LAST_PAGE:
				return LAST_PAGE_EDEFAULT == null ? lastPage != null : !LAST_PAGE_EDEFAULT.equals(lastPage);
			case _4Package.PAGES_TYPE__OTHER_PAGES:
				return OTHER_PAGES_EDEFAULT == null ? otherPages != null : !OTHER_PAGES_EDEFAULT.equals(otherPages);
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
		result.append(" (firstPage: ");
		result.append(firstPage);
		result.append(", lastPage: ");
		result.append(lastPage);
		result.append(", otherPages: ");
		result.append(otherPages);
		result.append(')');
		return result.toString();
	}

} //PagesTypeImpl
