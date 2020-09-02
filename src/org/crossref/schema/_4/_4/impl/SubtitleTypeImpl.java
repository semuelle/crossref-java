/**
 */
package org.crossref.schema._4._4.impl;

import java.util.Collection;

import org.crossref.schema._4._4.SubtitleType;
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
 * An implementation of the model object '<em><b>Subtitle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.SubtitleTypeImpl#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtitleTypeImpl extends MinimalEObjectImpl.Container implements SubtitleType {
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
	protected SubtitleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getSubtitleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.SUBTITLE_TYPE__MIXED);
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
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(_4Package.eINSTANCE.getSubtitleType_FaceMarkup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getB() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getI() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getEm() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getStrong() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getU() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_U());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getOvl() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Ovl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSup() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSub() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getScp() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Scp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getTt() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getFont() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Font());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getSubtitleType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.SUBTITLE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__FACE_MARKUP:
				return ((InternalEList<?>)getFaceMarkup()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__OVL:
				return ((InternalEList<?>)getOvl()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__SCP:
				return ((InternalEList<?>)getScp()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__FONT:
				return ((InternalEList<?>)getFont()).basicRemove(otherEnd, msgs);
			case _4Package.SUBTITLE_TYPE__MATH:
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
			case _4Package.SUBTITLE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.SUBTITLE_TYPE__FACE_MARKUP:
				if (coreType) return getFaceMarkup();
				return ((FeatureMap.Internal)getFaceMarkup()).getWrapper();
			case _4Package.SUBTITLE_TYPE__B:
				return getB();
			case _4Package.SUBTITLE_TYPE__I:
				return getI();
			case _4Package.SUBTITLE_TYPE__EM:
				return getEm();
			case _4Package.SUBTITLE_TYPE__STRONG:
				return getStrong();
			case _4Package.SUBTITLE_TYPE__U:
				return getU();
			case _4Package.SUBTITLE_TYPE__OVL:
				return getOvl();
			case _4Package.SUBTITLE_TYPE__SUP:
				return getSup();
			case _4Package.SUBTITLE_TYPE__SUB:
				return getSub();
			case _4Package.SUBTITLE_TYPE__SCP:
				return getScp();
			case _4Package.SUBTITLE_TYPE__TT:
				return getTt();
			case _4Package.SUBTITLE_TYPE__FONT:
				return getFont();
			case _4Package.SUBTITLE_TYPE__MATH:
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
			case _4Package.SUBTITLE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.SUBTITLE_TYPE__FACE_MARKUP:
				((FeatureMap.Internal)getFaceMarkup()).set(newValue);
				return;
			case _4Package.SUBTITLE_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__U:
				getU().clear();
				getU().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__OVL:
				getOvl().clear();
				getOvl().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__SCP:
				getScp().clear();
				getScp().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__FONT:
				getFont().clear();
				getFont().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.SUBTITLE_TYPE__MATH:
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
			case _4Package.SUBTITLE_TYPE__MIXED:
				getMixed().clear();
				return;
			case _4Package.SUBTITLE_TYPE__FACE_MARKUP:
				getFaceMarkup().clear();
				return;
			case _4Package.SUBTITLE_TYPE__B:
				getB().clear();
				return;
			case _4Package.SUBTITLE_TYPE__I:
				getI().clear();
				return;
			case _4Package.SUBTITLE_TYPE__EM:
				getEm().clear();
				return;
			case _4Package.SUBTITLE_TYPE__STRONG:
				getStrong().clear();
				return;
			case _4Package.SUBTITLE_TYPE__U:
				getU().clear();
				return;
			case _4Package.SUBTITLE_TYPE__OVL:
				getOvl().clear();
				return;
			case _4Package.SUBTITLE_TYPE__SUP:
				getSup().clear();
				return;
			case _4Package.SUBTITLE_TYPE__SUB:
				getSub().clear();
				return;
			case _4Package.SUBTITLE_TYPE__SCP:
				getScp().clear();
				return;
			case _4Package.SUBTITLE_TYPE__TT:
				getTt().clear();
				return;
			case _4Package.SUBTITLE_TYPE__FONT:
				getFont().clear();
				return;
			case _4Package.SUBTITLE_TYPE__MATH:
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
			case _4Package.SUBTITLE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.SUBTITLE_TYPE__FACE_MARKUP:
				return !getFaceMarkup().isEmpty();
			case _4Package.SUBTITLE_TYPE__B:
				return !getB().isEmpty();
			case _4Package.SUBTITLE_TYPE__I:
				return !getI().isEmpty();
			case _4Package.SUBTITLE_TYPE__EM:
				return !getEm().isEmpty();
			case _4Package.SUBTITLE_TYPE__STRONG:
				return !getStrong().isEmpty();
			case _4Package.SUBTITLE_TYPE__U:
				return !getU().isEmpty();
			case _4Package.SUBTITLE_TYPE__OVL:
				return !getOvl().isEmpty();
			case _4Package.SUBTITLE_TYPE__SUP:
				return !getSup().isEmpty();
			case _4Package.SUBTITLE_TYPE__SUB:
				return !getSub().isEmpty();
			case _4Package.SUBTITLE_TYPE__SCP:
				return !getScp().isEmpty();
			case _4Package.SUBTITLE_TYPE__TT:
				return !getTt().isEmpty();
			case _4Package.SUBTITLE_TYPE__FONT:
				return !getFont().isEmpty();
			case _4Package.SUBTITLE_TYPE__MATH:
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

} //SubtitleTypeImpl
