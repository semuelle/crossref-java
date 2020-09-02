/**
 */
package org.w3._1998.math.math.ml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.CnContent;
import org.w3._1998.math.math.ml.MglyphType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.SepType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cn Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.CnContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.CnContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.CnContentImpl#getMglyph <em>Mglyph</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.CnContentImpl#getSep <em>Sep</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.CnContentImpl#getPresentationExpressionGroup <em>Presentation Expression Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.CnContentImpl#getPresentationExpression <em>Presentation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CnContentImpl extends MinimalEObjectImpl.Container implements CnContent {
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
	protected CnContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getCnContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MlPackage.CN_CONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getCnContent_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MglyphType> getMglyph() {
		return getGroup().list(MlPackage.eINSTANCE.getCnContent_Mglyph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SepType> getSep() {
		return getGroup().list(MlPackage.eINSTANCE.getCnContent_Sep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPresentationExpressionGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getCnContent_PresentationExpressionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getPresentationExpression() {
		return getPresentationExpressionGroup().list(MlPackage.eINSTANCE.getCnContent_PresentationExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlPackage.CN_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MlPackage.CN_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.CN_CONTENT__MGLYPH:
				return ((InternalEList<?>)getMglyph()).basicRemove(otherEnd, msgs);
			case MlPackage.CN_CONTENT__SEP:
				return ((InternalEList<?>)getSep()).basicRemove(otherEnd, msgs);
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION_GROUP:
				return ((InternalEList<?>)getPresentationExpressionGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION:
				return ((InternalEList<?>)getPresentationExpression()).basicRemove(otherEnd, msgs);
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
			case MlPackage.CN_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MlPackage.CN_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MlPackage.CN_CONTENT__MGLYPH:
				return getMglyph();
			case MlPackage.CN_CONTENT__SEP:
				return getSep();
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION_GROUP:
				if (coreType) return getPresentationExpressionGroup();
				return ((FeatureMap.Internal)getPresentationExpressionGroup()).getWrapper();
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION:
				return getPresentationExpression();
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
			case MlPackage.CN_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MlPackage.CN_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MlPackage.CN_CONTENT__MGLYPH:
				getMglyph().clear();
				getMglyph().addAll((Collection<? extends MglyphType>)newValue);
				return;
			case MlPackage.CN_CONTENT__SEP:
				getSep().clear();
				getSep().addAll((Collection<? extends SepType>)newValue);
				return;
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION_GROUP:
				((FeatureMap.Internal)getPresentationExpressionGroup()).set(newValue);
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
			case MlPackage.CN_CONTENT__MIXED:
				getMixed().clear();
				return;
			case MlPackage.CN_CONTENT__GROUP:
				getGroup().clear();
				return;
			case MlPackage.CN_CONTENT__MGLYPH:
				getMglyph().clear();
				return;
			case MlPackage.CN_CONTENT__SEP:
				getSep().clear();
				return;
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION_GROUP:
				getPresentationExpressionGroup().clear();
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
			case MlPackage.CN_CONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MlPackage.CN_CONTENT__GROUP:
				return !getGroup().isEmpty();
			case MlPackage.CN_CONTENT__MGLYPH:
				return !getMglyph().isEmpty();
			case MlPackage.CN_CONTENT__SEP:
				return !getSep().isEmpty();
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION_GROUP:
				return !getPresentationExpressionGroup().isEmpty();
			case MlPackage.CN_CONTENT__PRESENTATION_EXPRESSION:
				return !getPresentationExpression().isEmpty();
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

} //CnContentImpl
