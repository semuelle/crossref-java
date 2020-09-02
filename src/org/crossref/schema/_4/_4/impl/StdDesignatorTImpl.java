/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.StdDesignatorT;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Std Designator T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.StdDesignatorTImpl#getStdDesignator <em>Std Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StdDesignatorTImpl#getStdAltScript <em>Std Alt Script</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.StdDesignatorTImpl#getStdVariantForm <em>Std Variant Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StdDesignatorTImpl extends MinimalEObjectImpl.Container implements StdDesignatorT {
	/**
	 * The default value of the '{@link #getStdDesignator() <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDesignator()
	 * @generated
	 * @ordered
	 */
	protected static final String STD_DESIGNATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdDesignator() <em>Std Designator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDesignator()
	 * @generated
	 * @ordered
	 */
	protected String stdDesignator = STD_DESIGNATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStdAltScript() <em>Std Alt Script</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdAltScript()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stdAltScript;

	/**
	 * The cached value of the '{@link #getStdVariantForm() <em>Std Variant Form</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdVariantForm()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stdVariantForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdDesignatorTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getStdDesignatorT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStdDesignator() {
		return stdDesignator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdDesignator(String newStdDesignator) {
		String oldStdDesignator = stdDesignator;
		stdDesignator = newStdDesignator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.STD_DESIGNATOR_T__STD_DESIGNATOR, oldStdDesignator, stdDesignator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStdAltScript() {
		if (stdAltScript == null) {
			stdAltScript = new EDataTypeEList<String>(String.class, this, _4Package.STD_DESIGNATOR_T__STD_ALT_SCRIPT);
		}
		return stdAltScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStdVariantForm() {
		if (stdVariantForm == null) {
			stdVariantForm = new EDataTypeEList<String>(String.class, this, _4Package.STD_DESIGNATOR_T__STD_VARIANT_FORM);
		}
		return stdVariantForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _4Package.STD_DESIGNATOR_T__STD_DESIGNATOR:
				return getStdDesignator();
			case _4Package.STD_DESIGNATOR_T__STD_ALT_SCRIPT:
				return getStdAltScript();
			case _4Package.STD_DESIGNATOR_T__STD_VARIANT_FORM:
				return getStdVariantForm();
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
			case _4Package.STD_DESIGNATOR_T__STD_DESIGNATOR:
				setStdDesignator((String)newValue);
				return;
			case _4Package.STD_DESIGNATOR_T__STD_ALT_SCRIPT:
				getStdAltScript().clear();
				getStdAltScript().addAll((Collection<? extends String>)newValue);
				return;
			case _4Package.STD_DESIGNATOR_T__STD_VARIANT_FORM:
				getStdVariantForm().clear();
				getStdVariantForm().addAll((Collection<? extends String>)newValue);
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
			case _4Package.STD_DESIGNATOR_T__STD_DESIGNATOR:
				setStdDesignator(STD_DESIGNATOR_EDEFAULT);
				return;
			case _4Package.STD_DESIGNATOR_T__STD_ALT_SCRIPT:
				getStdAltScript().clear();
				return;
			case _4Package.STD_DESIGNATOR_T__STD_VARIANT_FORM:
				getStdVariantForm().clear();
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
			case _4Package.STD_DESIGNATOR_T__STD_DESIGNATOR:
				return STD_DESIGNATOR_EDEFAULT == null ? stdDesignator != null : !STD_DESIGNATOR_EDEFAULT.equals(stdDesignator);
			case _4Package.STD_DESIGNATOR_T__STD_ALT_SCRIPT:
				return stdAltScript != null && !stdAltScript.isEmpty();
			case _4Package.STD_DESIGNATOR_T__STD_VARIANT_FORM:
				return stdVariantForm != null && !stdVariantForm.isEmpty();
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
		result.append(" (stdDesignator: ");
		result.append(stdDesignator);
		result.append(", stdAltScript: ");
		result.append(stdAltScript);
		result.append(", stdVariantForm: ");
		result.append(stdVariantForm);
		result.append(')');
		return result.toString();
	}

} //StdDesignatorTImpl
