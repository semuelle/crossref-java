/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xref Faces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.XrefFaces#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getXrefFaces()
 * @model extendedMetaData="name='xrefFaces' kind='mixed'"
 * @generated
 */
public interface XrefFaces extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Face Markup</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Markup</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_FaceMarkup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='FaceMarkup:1'"
	 * @generated
	 */
	FeatureMap getFaceMarkup();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getB();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getI();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getStrong();

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_U()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getU();

	/**
	 * Returns the value of the '<em><b>Ovl</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ovl</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Ovl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ovl' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getOvl();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getSup();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getSub();

	/**
	 * Returns the value of the '<em><b>Scp</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scp</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Scp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scp' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getScp();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getTt();

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Font()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getFont();

	/**
	 * Returns the value of the '<em><b>Math</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Math</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getXrefFaces_Math()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='math' namespace='http://www.w3.org/1998/Math/MathML' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<MathType> getMath();

} // XrefFaces
