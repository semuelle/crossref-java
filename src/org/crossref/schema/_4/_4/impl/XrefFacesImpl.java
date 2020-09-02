/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.XrefFaces;
import org.crossref.schema._4._4._4Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xref Faces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.XrefFacesImpl#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XrefFacesImpl extends MinimalEObjectImpl.Container implements XrefFaces {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XrefFacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getXrefFaces();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.XREF_FACES__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFaceMarkup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(_4Package.eINSTANCE.getXrefFaces_FaceMarkup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getB() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getI() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getEm() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getStrong() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getU() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_U());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getOvl() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Ovl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSup() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSub() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getScp() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Scp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getTt() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getFont() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Font());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getXrefFaces_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.XREF_FACES__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__FACE_MARKUP:
				return ((InternalEList<?>)getFaceMarkup()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__OVL:
				return ((InternalEList<?>)getOvl()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__SCP:
				return ((InternalEList<?>)getScp()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__FONT:
				return ((InternalEList<?>)getFont()).basicRemove(otherEnd, msgs);
			case _4Package.XREF_FACES__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
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
			case _4Package.XREF_FACES__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.XREF_FACES__FACE_MARKUP:
				if (coreType) return getFaceMarkup();
				return ((FeatureMap.Internal)getFaceMarkup()).getWrapper();
			case _4Package.XREF_FACES__B:
				return getB();
			case _4Package.XREF_FACES__I:
				return getI();
			case _4Package.XREF_FACES__EM:
				return getEm();
			case _4Package.XREF_FACES__STRONG:
				return getStrong();
			case _4Package.XREF_FACES__U:
				return getU();
			case _4Package.XREF_FACES__OVL:
				return getOvl();
			case _4Package.XREF_FACES__SUP:
				return getSup();
			case _4Package.XREF_FACES__SUB:
				return getSub();
			case _4Package.XREF_FACES__SCP:
				return getScp();
			case _4Package.XREF_FACES__TT:
				return getTt();
			case _4Package.XREF_FACES__FONT:
				return getFont();
			case _4Package.XREF_FACES__MATH:
				return getMath();
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
			case _4Package.XREF_FACES__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.XREF_FACES__FACE_MARKUP:
				((FeatureMap.Internal)getFaceMarkup()).set(newValue);
				return;
			case _4Package.XREF_FACES__B:
				getB().clear();
				getB().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__I:
				getI().clear();
				getI().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__U:
				getU().clear();
				getU().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__OVL:
				getOvl().clear();
				getOvl().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__SCP:
				getScp().clear();
				getScp().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__FONT:
				getFont().clear();
				getFont().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.XREF_FACES__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
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
			case _4Package.XREF_FACES__MIXED:
				getMixed().clear();
				return;
			case _4Package.XREF_FACES__FACE_MARKUP:
				getFaceMarkup().clear();
				return;
			case _4Package.XREF_FACES__B:
				getB().clear();
				return;
			case _4Package.XREF_FACES__I:
				getI().clear();
				return;
			case _4Package.XREF_FACES__EM:
				getEm().clear();
				return;
			case _4Package.XREF_FACES__STRONG:
				getStrong().clear();
				return;
			case _4Package.XREF_FACES__U:
				getU().clear();
				return;
			case _4Package.XREF_FACES__OVL:
				getOvl().clear();
				return;
			case _4Package.XREF_FACES__SUP:
				getSup().clear();
				return;
			case _4Package.XREF_FACES__SUB:
				getSub().clear();
				return;
			case _4Package.XREF_FACES__SCP:
				getScp().clear();
				return;
			case _4Package.XREF_FACES__TT:
				getTt().clear();
				return;
			case _4Package.XREF_FACES__FONT:
				getFont().clear();
				return;
			case _4Package.XREF_FACES__MATH:
				getMath().clear();
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
			case _4Package.XREF_FACES__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.XREF_FACES__FACE_MARKUP:
				return !getFaceMarkup().isEmpty();
			case _4Package.XREF_FACES__B:
				return !getB().isEmpty();
			case _4Package.XREF_FACES__I:
				return !getI().isEmpty();
			case _4Package.XREF_FACES__EM:
				return !getEm().isEmpty();
			case _4Package.XREF_FACES__STRONG:
				return !getStrong().isEmpty();
			case _4Package.XREF_FACES__U:
				return !getU().isEmpty();
			case _4Package.XREF_FACES__OVL:
				return !getOvl().isEmpty();
			case _4Package.XREF_FACES__SUP:
				return !getSup().isEmpty();
			case _4Package.XREF_FACES__SUB:
				return !getSub().isEmpty();
			case _4Package.XREF_FACES__SCP:
				return !getScp().isEmpty();
			case _4Package.XREF_FACES__TT:
				return !getTt().isEmpty();
			case _4Package.XREF_FACES__FONT:
				return !getFont().isEmpty();
			case _4Package.XREF_FACES__MATH:
				return !getMath().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //XrefFacesImpl
