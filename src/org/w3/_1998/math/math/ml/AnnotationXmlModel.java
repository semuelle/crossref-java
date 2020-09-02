/**
 */
package org.w3._1998.math.math.ml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Xml Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.AnnotationXmlModel#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getAnnotationXmlModel()
 * @model extendedMetaData="name='annotation-xml.model' kind='elementOnly'"
 * @generated
 */
public interface AnnotationXmlModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getAnnotationXmlModel_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AnnotationXmlModel