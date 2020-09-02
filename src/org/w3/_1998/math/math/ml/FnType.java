/**
 */
package org.w3._1998.math.math.ml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fn Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.FnType#getConstantArithClass <em>Constant Arith Class</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getFnType()
 * @model extendedMetaData="name='fn_._type' kind='elementOnly'"
 * @generated
 */
public interface FnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference.
	 * @see #setApply(ApplyType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Apply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='apply' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplyType getApply();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getApply <em>Apply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply</em>' containment reference.
	 * @see #getApply()
	 * @generated
	 */
	void setApply(ApplyType value);

	/**
	 * Returns the value of the '<em><b>Bind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' containment reference.
	 * @see #setBind(BindType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Bind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
	 * @generated
	 */
	BindType getBind();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getBind <em>Bind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind</em>' containment reference.
	 * @see #getBind()
	 * @generated
	 */
	void setBind(BindType value);

	/**
	 * Returns the value of the '<em><b>Ci</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci</em>' containment reference.
	 * @see #setCi(CiType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Ci()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ci' namespace='##targetNamespace'"
	 * @generated
	 */
	CiType getCi();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCi <em>Ci</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci</em>' containment reference.
	 * @see #getCi()
	 * @generated
	 */
	void setCi(CiType value);

	/**
	 * Returns the value of the '<em><b>Cn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cn</em>' containment reference.
	 * @see #setCn(CnType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Cn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cn' namespace='##targetNamespace'"
	 * @generated
	 */
	CnType getCn();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCn <em>Cn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cn</em>' containment reference.
	 * @see #getCn()
	 * @generated
	 */
	void setCn(CnType value);

	/**
	 * Returns the value of the '<em><b>Csymbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csymbol</em>' containment reference.
	 * @see #setCsymbol(CsymbolType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Csymbol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CsymbolType getCsymbol();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCsymbol <em>Csymbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csymbol</em>' containment reference.
	 * @see #getCsymbol()
	 * @generated
	 */
	void setCsymbol(CsymbolType value);

	/**
	 * Returns the value of the '<em><b>Cbytes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cbytes</em>' containment reference.
	 * @see #setCbytes(CbytesType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Cbytes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cbytes' namespace='##targetNamespace'"
	 * @generated
	 */
	CbytesType getCbytes();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCbytes <em>Cbytes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cbytes</em>' containment reference.
	 * @see #getCbytes()
	 * @generated
	 */
	void setCbytes(CbytesType value);

	/**
	 * Returns the value of the '<em><b>Cerror</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cerror</em>' containment reference.
	 * @see #setCerror(CerrorType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Cerror()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cerror' namespace='##targetNamespace'"
	 * @generated
	 */
	CerrorType getCerror();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCerror <em>Cerror</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cerror</em>' containment reference.
	 * @see #getCerror()
	 * @generated
	 */
	void setCerror(CerrorType value);

	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference.
	 * @see #setCs(CsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Cs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace'"
	 * @generated
	 */
	CsType getCs();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCs <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs</em>' containment reference.
	 * @see #getCs()
	 * @generated
	 */
	void setCs(CsType value);

	/**
	 * Returns the value of the '<em><b>Share</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share</em>' containment reference.
	 * @see #setShare(ShareType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Share()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='share' namespace='##targetNamespace'"
	 * @generated
	 */
	ShareType getShare();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getShare <em>Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share</em>' containment reference.
	 * @see #getShare()
	 * @generated
	 */
	void setShare(ShareType value);

	/**
	 * Returns the value of the '<em><b>Piecewise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecewise</em>' containment reference.
	 * @see #setPiecewise(PiecewiseType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Piecewise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='piecewise' namespace='##targetNamespace'"
	 * @generated
	 */
	PiecewiseType getPiecewise();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getPiecewise <em>Piecewise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piecewise</em>' containment reference.
	 * @see #getPiecewise()
	 * @generated
	 */
	void setPiecewise(PiecewiseType value);

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_DeprecatedContExpGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='DeprecatedContExp:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeprecatedContExpGroup();

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_DeprecatedContExp()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeprecatedContExp' namespace='##targetNamespace' group='DeprecatedContExp:group'"
	 * @generated
	 */
	EObject getDeprecatedContExp();

	/**
	 * Returns the value of the '<em><b>Interval Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_IntervalClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='interval.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntervalClassGroup();

	/**
	 * Returns the value of the '<em><b>Interval Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_IntervalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interval.class' namespace='##targetNamespace' group='interval.class:group'"
	 * @generated
	 */
	IntervalClassType getIntervalClass();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryFunctionalClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-functional.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryFunctionalClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryFunctionalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-functional.class' namespace='##targetNamespace' group='unary-functional.class:group'"
	 * @generated
	 */
	UnaryFunctionalClassType getUnaryFunctionalClass();

	/**
	 * Returns the value of the '<em><b>Lambda Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_LambdaClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='lambda.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLambdaClassGroup();

	/**
	 * Returns the value of the '<em><b>Lambda Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_LambdaClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lambda.class' namespace='##targetNamespace' group='lambda.class:group'"
	 * @generated
	 */
	LambdaClassType getLambdaClass();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryFunctionalClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-functional.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryFunctionalClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryFunctionalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-functional.class' namespace='##targetNamespace' group='nary-functional.class:group'"
	 * @generated
	 */
	NaryFunctionalClassType getNaryFunctionalClass();

	/**
	 * Returns the value of the '<em><b>Quotient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotient</em>' containment reference.
	 * @see #setQuotient(QuotientType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Quotient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quotient' namespace='##targetNamespace'"
	 * @generated
	 */
	QuotientType getQuotient();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getQuotient <em>Quotient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quotient</em>' containment reference.
	 * @see #getQuotient()
	 * @generated
	 */
	void setQuotient(QuotientType value);

	/**
	 * Returns the value of the '<em><b>Divide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divide</em>' containment reference.
	 * @see #setDivide(DivideType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Divide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divide' namespace='##targetNamespace'"
	 * @generated
	 */
	DivideType getDivide();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getDivide <em>Divide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divide</em>' containment reference.
	 * @see #getDivide()
	 * @generated
	 */
	void setDivide(DivideType value);

	/**
	 * Returns the value of the '<em><b>Minus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minus</em>' containment reference.
	 * @see #setMinus(MinusType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Minus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minus' namespace='##targetNamespace'"
	 * @generated
	 */
	MinusType getMinus();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getMinus <em>Minus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minus</em>' containment reference.
	 * @see #getMinus()
	 * @generated
	 */
	void setMinus(MinusType value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' containment reference.
	 * @see #setPower(PowerType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Power()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerType getPower();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(PowerType value);

	/**
	 * Returns the value of the '<em><b>Rem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rem</em>' containment reference.
	 * @see #setRem(RemType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Rem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rem' namespace='##targetNamespace'"
	 * @generated
	 */
	RemType getRem();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getRem <em>Rem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem</em>' containment reference.
	 * @see #getRem()
	 * @generated
	 */
	void setRem(RemType value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(RootType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Root()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
	RootType getRoot();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(RootType value);

	/**
	 * Returns the value of the '<em><b>Factorial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factorial</em>' containment reference.
	 * @see #setFactorial(FactorialType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Factorial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factorial' namespace='##targetNamespace'"
	 * @generated
	 */
	FactorialType getFactorial();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getFactorial <em>Factorial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factorial</em>' containment reference.
	 * @see #getFactorial()
	 * @generated
	 */
	void setFactorial(FactorialType value);

	/**
	 * Returns the value of the '<em><b>Abs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs</em>' containment reference.
	 * @see #setAbs(AbsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Abs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abs' namespace='##targetNamespace'"
	 * @generated
	 */
	AbsType getAbs();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getAbs <em>Abs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs</em>' containment reference.
	 * @see #getAbs()
	 * @generated
	 */
	void setAbs(AbsType value);

	/**
	 * Returns the value of the '<em><b>Conjugate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjugate</em>' containment reference.
	 * @see #setConjugate(ConjugateType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Conjugate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conjugate' namespace='##targetNamespace'"
	 * @generated
	 */
	ConjugateType getConjugate();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getConjugate <em>Conjugate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugate</em>' containment reference.
	 * @see #getConjugate()
	 * @generated
	 */
	void setConjugate(ConjugateType value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference.
	 * @see #setArg(ArgType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Arg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgType getArg();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getArg <em>Arg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' containment reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(ArgType value);

	/**
	 * Returns the value of the '<em><b>Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' containment reference.
	 * @see #setReal(RealType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Real()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getReal();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getReal <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' containment reference.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(RealType value);

	/**
	 * Returns the value of the '<em><b>Imaginary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary</em>' containment reference.
	 * @see #setImaginary(ImaginaryType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Imaginary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imaginary' namespace='##targetNamespace'"
	 * @generated
	 */
	ImaginaryType getImaginary();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getImaginary <em>Imaginary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaginary</em>' containment reference.
	 * @see #getImaginary()
	 * @generated
	 */
	void setImaginary(ImaginaryType value);

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' containment reference.
	 * @see #setFloor(FloorType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Floor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorType getFloor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getFloor <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' containment reference.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(FloorType value);

	/**
	 * Returns the value of the '<em><b>Ceiling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling</em>' containment reference.
	 * @see #setCeiling(CeilingType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Ceiling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceiling' namespace='##targetNamespace'"
	 * @generated
	 */
	CeilingType getCeiling();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getCeiling <em>Ceiling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling</em>' containment reference.
	 * @see #getCeiling()
	 * @generated
	 */
	void setCeiling(CeilingType value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(ExpType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_Exp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exp' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpType getExp();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.FnType#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(ExpType value);

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryMinmaxClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-minmax.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryMinmaxClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryMinmaxClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-minmax.class' namespace='##targetNamespace' group='nary-minmax.class:group'"
	 * @generated
	 */
	NaryMinmaxClassType getNaryMinmaxClass();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryArithClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-arith.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryArithClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryArithClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-arith.class' namespace='##targetNamespace' group='nary-arith.class:group'"
	 * @generated
	 */
	NaryArithClassType getNaryArithClass();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryLogicalClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-logical.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryLogicalClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryLogicalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-logical.class' namespace='##targetNamespace' group='nary-logical.class:group'"
	 * @generated
	 */
	NaryLogicalClassType getNaryLogicalClass();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryLogicalClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-logical.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryLogicalClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryLogicalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-logical.class' namespace='##targetNamespace' group='unary-logical.class:group'"
	 * @generated
	 */
	UnaryLogicalClassType getUnaryLogicalClass();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinaryLogicalClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-logical.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryLogicalClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinaryLogicalClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-logical.class' namespace='##targetNamespace' group='binary-logical.class:group'"
	 * @generated
	 */
	BinaryLogicalClassType getBinaryLogicalClass();

	/**
	 * Returns the value of the '<em><b>Quantifier Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_QuantifierClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='quantifier.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getQuantifierClassGroup();

	/**
	 * Returns the value of the '<em><b>Quantifier Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_QuantifierClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantifier.class' namespace='##targetNamespace' group='quantifier.class:group'"
	 * @generated
	 */
	QuantifierClassType getQuantifierClass();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryRelnClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-reln.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryRelnClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryRelnClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-reln.class' namespace='##targetNamespace' group='nary-reln.class:group'"
	 * @generated
	 */
	NaryRelnClassType getNaryRelnClass();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinaryRelnClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-reln.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryRelnClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinaryRelnClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-reln.class' namespace='##targetNamespace' group='binary-reln.class:group'"
	 * @generated
	 */
	EObject getBinaryRelnClass();

	/**
	 * Returns the value of the '<em><b>Int Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_IntClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='int.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntClassGroup();

	/**
	 * Returns the value of the '<em><b>Int Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_IntClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int.class' namespace='##targetNamespace' group='int.class:group'"
	 * @generated
	 */
	IntClassType getIntClass();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_DifferentialOperatorClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Differential-Operator.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDifferentialOperatorClassGroup();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_DifferentialOperatorClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Differential-Operator.class' namespace='##targetNamespace' group='Differential-Operator.class:group'"
	 * @generated
	 */
	DifferentialOperatorClassType getDifferentialOperatorClass();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_PartialdiffClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='partialdiff.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPartialdiffClassGroup();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_PartialdiffClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partialdiff.class' namespace='##targetNamespace' group='partialdiff.class:group'"
	 * @generated
	 */
	PartialdiffClassType getPartialdiffClass();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryVeccalcClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-veccalc.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryVeccalcClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryVeccalcClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-veccalc.class' namespace='##targetNamespace' group='unary-veccalc.class:group'"
	 * @generated
	 */
	UnaryVeccalcClassType getUnaryVeccalcClass();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NarySetlistConstructorClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-setlist-constructor.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNarySetlistConstructorClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NarySetlistConstructorClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-setlist-constructor.class' namespace='##targetNamespace' group='nary-setlist-constructor.class:group'"
	 * @generated
	 */
	EObject getNarySetlistConstructorClass();

	/**
	 * Returns the value of the '<em><b>Nary Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NarySetClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNarySetClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Set Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NarySetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set.class' namespace='##targetNamespace' group='nary-set.class:group'"
	 * @generated
	 */
	NarySetClassType getNarySetClass();

	/**
	 * Returns the value of the '<em><b>Binary Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinarySetClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinarySetClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Set Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinarySetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-set.class' namespace='##targetNamespace' group='binary-set.class:group'"
	 * @generated
	 */
	BinarySetClassType getBinarySetClass();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NarySetRelnClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-set-reln.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNarySetRelnClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NarySetRelnClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set-reln.class' namespace='##targetNamespace' group='nary-set-reln.class:group'"
	 * @generated
	 */
	NarySetRelnClassType getNarySetRelnClass();

	/**
	 * Returns the value of the '<em><b>Unary Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnarySetClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnarySetClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Set Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnarySetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-set.class' namespace='##targetNamespace' group='unary-set.class:group'"
	 * @generated
	 */
	UnarySetClassType getUnarySetClass();

	/**
	 * Returns the value of the '<em><b>Sum Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_SumClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='sum.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSumClassGroup();

	/**
	 * Returns the value of the '<em><b>Sum Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_SumClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sum.class' namespace='##targetNamespace' group='sum.class:group'"
	 * @generated
	 */
	SumClassType getSumClass();

	/**
	 * Returns the value of the '<em><b>Product Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_ProductClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='product.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getProductClassGroup();

	/**
	 * Returns the value of the '<em><b>Product Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_ProductClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='product.class' namespace='##targetNamespace' group='product.class:group'"
	 * @generated
	 */
	ProductClassType getProductClass();

	/**
	 * Returns the value of the '<em><b>Limit Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_LimitClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='limit.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLimitClassGroup();

	/**
	 * Returns the value of the '<em><b>Limit Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_LimitClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='limit.class' namespace='##targetNamespace' group='limit.class:group'"
	 * @generated
	 */
	LimitClassType getLimitClass();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryElementaryClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-elementary.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryElementaryClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryElementaryClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-elementary.class' namespace='##targetNamespace' group='unary-elementary.class:group'"
	 * @generated
	 */
	UnaryElementaryClassType getUnaryElementaryClass();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryStatsClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-stats.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryStatsClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryStatsClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-stats.class' namespace='##targetNamespace' group='nary-stats.class:group'"
	 * @generated
	 */
	NaryStatsClassType getNaryStatsClass();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryConstructorClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-constructor.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryConstructorClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryConstructorClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-constructor.class' namespace='##targetNamespace' group='nary-constructor.class:group'"
	 * @generated
	 */
	NaryConstructorClassType getNaryConstructorClass();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryLinalgClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-linalg.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryLinalgClassGroup();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_UnaryLinalgClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-linalg.class' namespace='##targetNamespace' group='unary-linalg.class:group'"
	 * @generated
	 */
	UnaryLinalgClassType getUnaryLinalgClass();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryLinalgClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-linalg.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryLinalgClassGroup();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_NaryLinalgClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-linalg.class' namespace='##targetNamespace' group='nary-linalg.class:group'"
	 * @generated
	 */
	NaryLinalgClassType getNaryLinalgClass();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinaryLinalgClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-linalg.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryLinalgClassGroup();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_BinaryLinalgClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-linalg.class' namespace='##targetNamespace' group='binary-linalg.class:group'"
	 * @generated
	 */
	BinaryLinalgClassType getBinaryLinalgClass();

	/**
	 * Returns the value of the '<em><b>Constant Set Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_ConstantSetClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='constant-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConstantSetClassGroup();

	/**
	 * Returns the value of the '<em><b>Constant Set Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_ConstantSetClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-set.class' namespace='##targetNamespace' group='constant-set.class:group'"
	 * @generated
	 */
	ConstantSetClassType getConstantSetClass();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class Group</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_ConstantArithClassGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='constant-arith.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConstantArithClassGroup();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getFnType_ConstantArithClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-arith.class' namespace='##targetNamespace' group='constant-arith.class:group'"
	 * @generated
	 */
	ConstantArithClassType getConstantArithClass();

} // FnType
