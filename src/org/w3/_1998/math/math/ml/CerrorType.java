/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cerror Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getContExp <em>Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCsymbol1 <em>Csymbol1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.CerrorType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType()
 * @model extendedMetaData="name='cerror_._type' kind='elementOnly'"
 * @generated
 */
public interface CerrorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Csymbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csymbol</em>' containment reference.
	 * @see #setCsymbol(CsymbolType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Csymbol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CsymbolType getCsymbol();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getCsymbol <em>Csymbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csymbol</em>' containment reference.
	 * @see #getCsymbol()
	 * @generated
	 */
	void setCsymbol(CsymbolType value);

	/**
	 * Returns the value of the '<em><b>Cont Exp</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont Exp</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ContExp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContExp:1'"
	 * @generated
	 */
	FeatureMap getContExp();

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ApplyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Apply()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='apply' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<ApplyType> getApply();

	/**
	 * Returns the value of the '<em><b>Bind</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Bind()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<BindType> getBind();

	/**
	 * Returns the value of the '<em><b>Ci</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CiType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Ci()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ci' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CiType> getCi();

	/**
	 * Returns the value of the '<em><b>Cn</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cn</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Cn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cn' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CnType> getCn();

	/**
	 * Returns the value of the '<em><b>Csymbol1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CsymbolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csymbol1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Csymbol1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CsymbolType> getCsymbol1();

	/**
	 * Returns the value of the '<em><b>Cbytes</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CbytesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cbytes</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Cbytes()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cbytes' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CbytesType> getCbytes();

	/**
	 * Returns the value of the '<em><b>Cerror</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CerrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cerror</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Cerror()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cerror' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CerrorType> getCerror();

	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Cs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CsType> getCs();

	/**
	 * Returns the value of the '<em><b>Share</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ShareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Share()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='share' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<ShareType> getShare();

	/**
	 * Returns the value of the '<em><b>Piecewise</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.PiecewiseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecewise</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Piecewise()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='piecewise' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<PiecewiseType> getPiecewise();

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_DeprecatedContExpGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='DeprecatedContExp:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getDeprecatedContExpGroup();

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_DeprecatedContExp()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeprecatedContExp' namespace='##targetNamespace' group='DeprecatedContExp:group'"
	 * @generated
	 */
	EList<EObject> getDeprecatedContExp();

	/**
	 * Returns the value of the '<em><b>Interval Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_IntervalClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='interval.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getIntervalClassGroup();

	/**
	 * Returns the value of the '<em><b>Interval Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.IntervalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_IntervalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interval.class' namespace='##targetNamespace' group='interval.class:group'"
	 * @generated
	 */
	EList<IntervalClassType> getIntervalClass();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryFunctionalClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-functional.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getUnaryFunctionalClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryFunctionalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryFunctionalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-functional.class' namespace='##targetNamespace' group='unary-functional.class:group'"
	 * @generated
	 */
	EList<UnaryFunctionalClassType> getUnaryFunctionalClass();

	/**
	 * Returns the value of the '<em><b>Lambda Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_LambdaClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='lambda.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getLambdaClassGroup();

	/**
	 * Returns the value of the '<em><b>Lambda Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.LambdaClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_LambdaClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lambda.class' namespace='##targetNamespace' group='lambda.class:group'"
	 * @generated
	 */
	EList<LambdaClassType> getLambdaClass();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryFunctionalClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-functional.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryFunctionalClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryFunctionalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryFunctionalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-functional.class' namespace='##targetNamespace' group='nary-functional.class:group'"
	 * @generated
	 */
	EList<NaryFunctionalClassType> getNaryFunctionalClass();

	/**
	 * Returns the value of the '<em><b>Quotient</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.QuotientType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotient</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Quotient()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quotient' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<QuotientType> getQuotient();

	/**
	 * Returns the value of the '<em><b>Divide</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.DivideType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divide</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Divide()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='divide' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<DivideType> getDivide();

	/**
	 * Returns the value of the '<em><b>Minus</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MinusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minus</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Minus()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minus' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<MinusType> getMinus();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.PowerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Power()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<PowerType> getPower();

	/**
	 * Returns the value of the '<em><b>Rem</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.RemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rem</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Rem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rem' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<RemType> getRem();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.RootType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Root()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<RootType> getRoot();

	/**
	 * Returns the value of the '<em><b>Factorial</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.FactorialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factorial</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Factorial()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='factorial' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<FactorialType> getFactorial();

	/**
	 * Returns the value of the '<em><b>Abs</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.AbsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Abs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abs' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<AbsType> getAbs();

	/**
	 * Returns the value of the '<em><b>Conjugate</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConjugateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjugate</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Conjugate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conjugate' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<ConjugateType> getConjugate();

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ArgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Arg()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<ArgType> getArg();

	/**
	 * Returns the value of the '<em><b>Real</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.RealType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Real()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='real' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<RealType> getReal();

	/**
	 * Returns the value of the '<em><b>Imaginary</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ImaginaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Imaginary()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imaginary' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<ImaginaryType> getImaginary();

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.FloorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Floor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<FloorType> getFloor();

	/**
	 * Returns the value of the '<em><b>Ceiling</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CeilingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Ceiling()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ceiling' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<CeilingType> getCeiling();

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ExpType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Exp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exp' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	EList<ExpType> getExp();

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryMinmaxClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-minmax.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryMinmaxClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryMinmaxClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryMinmaxClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-minmax.class' namespace='##targetNamespace' group='nary-minmax.class:group'"
	 * @generated
	 */
	EList<NaryMinmaxClassType> getNaryMinmaxClass();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryArithClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-arith.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryArithClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryArithClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryArithClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-arith.class' namespace='##targetNamespace' group='nary-arith.class:group'"
	 * @generated
	 */
	EList<NaryArithClassType> getNaryArithClass();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryLogicalClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-logical.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryLogicalClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryLogicalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryLogicalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-logical.class' namespace='##targetNamespace' group='nary-logical.class:group'"
	 * @generated
	 */
	EList<NaryLogicalClassType> getNaryLogicalClass();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryLogicalClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-logical.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getUnaryLogicalClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryLogicalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryLogicalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-logical.class' namespace='##targetNamespace' group='unary-logical.class:group'"
	 * @generated
	 */
	EList<UnaryLogicalClassType> getUnaryLogicalClass();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinaryLogicalClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-logical.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getBinaryLogicalClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BinaryLogicalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinaryLogicalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-logical.class' namespace='##targetNamespace' group='binary-logical.class:group'"
	 * @generated
	 */
	EList<BinaryLogicalClassType> getBinaryLogicalClass();

	/**
	 * Returns the value of the '<em><b>Quantifier Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_QuantifierClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='quantifier.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getQuantifierClassGroup();

	/**
	 * Returns the value of the '<em><b>Quantifier Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.QuantifierClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_QuantifierClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantifier.class' namespace='##targetNamespace' group='quantifier.class:group'"
	 * @generated
	 */
	EList<QuantifierClassType> getQuantifierClass();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryRelnClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-reln.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryRelnClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryRelnClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryRelnClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-reln.class' namespace='##targetNamespace' group='nary-reln.class:group'"
	 * @generated
	 */
	EList<NaryRelnClassType> getNaryRelnClass();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinaryRelnClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-reln.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getBinaryRelnClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinaryRelnClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-reln.class' namespace='##targetNamespace' group='binary-reln.class:group'"
	 * @generated
	 */
	EList<EObject> getBinaryRelnClass();

	/**
	 * Returns the value of the '<em><b>Int Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_IntClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='int.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getIntClassGroup();

	/**
	 * Returns the value of the '<em><b>Int Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.IntClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_IntClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int.class' namespace='##targetNamespace' group='int.class:group'"
	 * @generated
	 */
	EList<IntClassType> getIntClass();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_DifferentialOperatorClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Differential-Operator.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getDifferentialOperatorClassGroup();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.DifferentialOperatorClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_DifferentialOperatorClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Differential-Operator.class' namespace='##targetNamespace' group='Differential-Operator.class:group'"
	 * @generated
	 */
	EList<DifferentialOperatorClassType> getDifferentialOperatorClass();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_PartialdiffClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='partialdiff.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getPartialdiffClassGroup();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.PartialdiffClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_PartialdiffClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partialdiff.class' namespace='##targetNamespace' group='partialdiff.class:group'"
	 * @generated
	 */
	EList<PartialdiffClassType> getPartialdiffClass();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryVeccalcClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-veccalc.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getUnaryVeccalcClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryVeccalcClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryVeccalcClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-veccalc.class' namespace='##targetNamespace' group='unary-veccalc.class:group'"
	 * @generated
	 */
	EList<UnaryVeccalcClassType> getUnaryVeccalcClass();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NarySetlistConstructorClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-setlist-constructor.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNarySetlistConstructorClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NarySetlistConstructorClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-setlist-constructor.class' namespace='##targetNamespace' group='nary-setlist-constructor.class:group'"
	 * @generated
	 */
	EList<EObject> getNarySetlistConstructorClass();

	/**
	 * Returns the value of the '<em><b>Nary Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NarySetClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-set.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNarySetClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Set Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NarySetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NarySetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set.class' namespace='##targetNamespace' group='nary-set.class:group'"
	 * @generated
	 */
	EList<NarySetClassType> getNarySetClass();

	/**
	 * Returns the value of the '<em><b>Binary Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinarySetClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-set.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getBinarySetClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Set Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BinarySetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinarySetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-set.class' namespace='##targetNamespace' group='binary-set.class:group'"
	 * @generated
	 */
	EList<BinarySetClassType> getBinarySetClass();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NarySetRelnClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-set-reln.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNarySetRelnClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NarySetRelnClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NarySetRelnClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set-reln.class' namespace='##targetNamespace' group='nary-set-reln.class:group'"
	 * @generated
	 */
	EList<NarySetRelnClassType> getNarySetRelnClass();

	/**
	 * Returns the value of the '<em><b>Unary Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnarySetClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-set.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getUnarySetClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Set Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnarySetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnarySetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-set.class' namespace='##targetNamespace' group='unary-set.class:group'"
	 * @generated
	 */
	EList<UnarySetClassType> getUnarySetClass();

	/**
	 * Returns the value of the '<em><b>Sum Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_SumClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='sum.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getSumClassGroup();

	/**
	 * Returns the value of the '<em><b>Sum Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.SumClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_SumClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sum.class' namespace='##targetNamespace' group='sum.class:group'"
	 * @generated
	 */
	EList<SumClassType> getSumClass();

	/**
	 * Returns the value of the '<em><b>Product Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ProductClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='product.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getProductClassGroup();

	/**
	 * Returns the value of the '<em><b>Product Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ProductClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ProductClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='product.class' namespace='##targetNamespace' group='product.class:group'"
	 * @generated
	 */
	EList<ProductClassType> getProductClass();

	/**
	 * Returns the value of the '<em><b>Limit Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_LimitClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='limit.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getLimitClassGroup();

	/**
	 * Returns the value of the '<em><b>Limit Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.LimitClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_LimitClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='limit.class' namespace='##targetNamespace' group='limit.class:group'"
	 * @generated
	 */
	EList<LimitClassType> getLimitClass();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryElementaryClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-elementary.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getUnaryElementaryClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryElementaryClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryElementaryClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-elementary.class' namespace='##targetNamespace' group='unary-elementary.class:group'"
	 * @generated
	 */
	EList<UnaryElementaryClassType> getUnaryElementaryClass();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryStatsClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-stats.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryStatsClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryStatsClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryStatsClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-stats.class' namespace='##targetNamespace' group='nary-stats.class:group'"
	 * @generated
	 */
	EList<NaryStatsClassType> getNaryStatsClass();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryConstructorClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-constructor.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryConstructorClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryConstructorClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryConstructorClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-constructor.class' namespace='##targetNamespace' group='nary-constructor.class:group'"
	 * @generated
	 */
	EList<NaryConstructorClassType> getNaryConstructorClass();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryLinalgClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-linalg.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getUnaryLinalgClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryLinalgClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_UnaryLinalgClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-linalg.class' namespace='##targetNamespace' group='unary-linalg.class:group'"
	 * @generated
	 */
	EList<UnaryLinalgClassType> getUnaryLinalgClass();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryLinalgClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-linalg.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getNaryLinalgClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryLinalgClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_NaryLinalgClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-linalg.class' namespace='##targetNamespace' group='nary-linalg.class:group'"
	 * @generated
	 */
	EList<NaryLinalgClassType> getNaryLinalgClass();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinaryLinalgClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-linalg.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getBinaryLinalgClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BinaryLinalgClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_BinaryLinalgClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-linalg.class' namespace='##targetNamespace' group='binary-linalg.class:group'"
	 * @generated
	 */
	EList<BinaryLinalgClassType> getBinaryLinalgClass();

	/**
	 * Returns the value of the '<em><b>Constant Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ConstantSetClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='constant-set.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getConstantSetClassGroup();

	/**
	 * Returns the value of the '<em><b>Constant Set Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConstantSetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ConstantSetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-set.class' namespace='##targetNamespace' group='constant-set.class:group'"
	 * @generated
	 */
	EList<ConstantSetClassType> getConstantSetClass();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ConstantArithClassGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='constant-arith.class:group' namespace='##targetNamespace' group='#ContExp:1'"
	 * @generated
	 */
	FeatureMap getConstantArithClassGroup();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConstantArithClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_ConstantArithClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-arith.class' namespace='##targetNamespace' group='constant-arith.class:group'"
	 * @generated
	 */
	EList<ConstantArithClassType> getConstantArithClass();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Object value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(Object)
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.CerrorType#getXref <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' attribute.
	 * @see #getXref()
	 * @generated
	 */
	void setXref(Object value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getCerrorType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':99' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CerrorType
