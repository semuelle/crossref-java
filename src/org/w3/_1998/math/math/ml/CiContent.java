/**
 */
package org.w3._1998.math.math.ml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ci Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.CiContent#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CiContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CiContent#getMglyph <em>Mglyph</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CiContent#getPresentationExpressionGroup <em>Presentation Expression Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CiContent#getPresentationExpression <em>Presentation Expression</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getCiContent()
 * @model extendedMetaData="name='ci.content' kind='mixed'"
 * @generated
 */
public interface CiContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCiContent_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCiContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Mglyph</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MglyphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mglyph</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCiContent_Mglyph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mglyph' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MglyphType> getMglyph();

	/**
	 * Returns the value of the '<em><b>Presentation Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Expression Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCiContent_PresentationExpressionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='PresentationExpression:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getPresentationExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Presentation Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Expression</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCiContent_PresentationExpression()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PresentationExpression' namespace='##targetNamespace' group='PresentationExpression:group'"
	 * @generated
	 */
	EList<EObject> getPresentationExpression();

} // CiContent
