/**
 */
package org.w3._1998.math.math.ml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.AbsType;
import org.w3._1998.math.math.ml.ApplyType;
import org.w3._1998.math.math.ml.ArgType;
import org.w3._1998.math.math.ml.BinaryLinalgClassType;
import org.w3._1998.math.math.ml.BinaryLogicalClassType;
import org.w3._1998.math.math.ml.BinarySetClassType;
import org.w3._1998.math.math.ml.BindType;
import org.w3._1998.math.math.ml.BvarType;
import org.w3._1998.math.math.ml.CbytesType;
import org.w3._1998.math.math.ml.CeilingType;
import org.w3._1998.math.math.ml.CerrorType;
import org.w3._1998.math.math.ml.CiType;
import org.w3._1998.math.math.ml.CnType;
import org.w3._1998.math.math.ml.ConditionType;
import org.w3._1998.math.math.ml.ConjugateType;
import org.w3._1998.math.math.ml.ConstantArithClassType;
import org.w3._1998.math.math.ml.ConstantSetClassType;
import org.w3._1998.math.math.ml.CsType;
import org.w3._1998.math.math.ml.CsymbolType;
import org.w3._1998.math.math.ml.DifferentialOperatorClassType;
import org.w3._1998.math.math.ml.DivideType;
import org.w3._1998.math.math.ml.DomainofapplicationType;
import org.w3._1998.math.math.ml.ExpType;
import org.w3._1998.math.math.ml.FactorialType;
import org.w3._1998.math.math.ml.FloorType;
import org.w3._1998.math.math.ml.ImaginaryType;
import org.w3._1998.math.math.ml.IntClassType;
import org.w3._1998.math.math.ml.IntervalClassType;
import org.w3._1998.math.math.ml.LambdaClassType;
import org.w3._1998.math.math.ml.LimitClassType;
import org.w3._1998.math.math.ml.LowlimitType;
import org.w3._1998.math.math.ml.MinusType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.NaryArithClassType;
import org.w3._1998.math.math.ml.NaryConstructorClassType;
import org.w3._1998.math.math.ml.NaryFunctionalClassType;
import org.w3._1998.math.math.ml.NaryLinalgClassType;
import org.w3._1998.math.math.ml.NaryLogicalClassType;
import org.w3._1998.math.math.ml.NaryMinmaxClassType;
import org.w3._1998.math.math.ml.NaryRelnClassType;
import org.w3._1998.math.math.ml.NarySetClassType;
import org.w3._1998.math.math.ml.NarySetRelnClassType;
import org.w3._1998.math.math.ml.NaryStatsClassType;
import org.w3._1998.math.math.ml.PartialdiffClassType;
import org.w3._1998.math.math.ml.PiecewiseType;
import org.w3._1998.math.math.ml.PowerType;
import org.w3._1998.math.math.ml.ProductClassType;
import org.w3._1998.math.math.ml.QuantifierClassType;
import org.w3._1998.math.math.ml.QuotientType;
import org.w3._1998.math.math.ml.RealType;
import org.w3._1998.math.math.ml.RemType;
import org.w3._1998.math.math.ml.RootType;
import org.w3._1998.math.math.ml.ShareType;
import org.w3._1998.math.math.ml.SumClassType;
import org.w3._1998.math.math.ml.UnaryElementaryClassType;
import org.w3._1998.math.math.ml.UnaryFunctionalClassType;
import org.w3._1998.math.math.ml.UnaryLinalgClassType;
import org.w3._1998.math.math.ml.UnaryLogicalClassType;
import org.w3._1998.math.math.ml.UnarySetClassType;
import org.w3._1998.math.math.ml.UnaryVeccalcClassType;
import org.w3._1998.math.math.ml.UplimitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBvar <em>Bvar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDomainofapplication <em>Domainofapplication</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getLowlimit <em>Lowlimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUplimit <em>Uplimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getDefinitionURL <em>Definition URL</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.LambdaClassTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaClassTypeImpl extends MinimalEObjectImpl.Container implements LambdaClassType {
	/**
	 * The cached value of the '{@link #getBvar() <em>Bvar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvar()
	 * @generated
	 * @ordered
	 */
	protected EList<BvarType> bvar;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getApply() <em>Apply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply()
	 * @generated
	 * @ordered
	 */
	protected ApplyType apply;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected BindType bind;

	/**
	 * The cached value of the '{@link #getCi() <em>Ci</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCi()
	 * @generated
	 * @ordered
	 */
	protected CiType ci;

	/**
	 * The cached value of the '{@link #getCn() <em>Cn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCn()
	 * @generated
	 * @ordered
	 */
	protected CnType cn;

	/**
	 * The cached value of the '{@link #getCsymbol() <em>Csymbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsymbol()
	 * @generated
	 * @ordered
	 */
	protected CsymbolType csymbol;

	/**
	 * The cached value of the '{@link #getCbytes() <em>Cbytes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbytes()
	 * @generated
	 * @ordered
	 */
	protected CbytesType cbytes;

	/**
	 * The cached value of the '{@link #getCerror() <em>Cerror</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCerror()
	 * @generated
	 * @ordered
	 */
	protected CerrorType cerror;

	/**
	 * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs()
	 * @generated
	 * @ordered
	 */
	protected CsType cs;

	/**
	 * The cached value of the '{@link #getShare() <em>Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShare()
	 * @generated
	 * @ordered
	 */
	protected ShareType share;

	/**
	 * The cached value of the '{@link #getPiecewise() <em>Piecewise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecewise()
	 * @generated
	 * @ordered
	 */
	protected PiecewiseType piecewise;

	/**
	 * The cached value of the '{@link #getDeprecatedContExpGroup() <em>Deprecated Cont Exp Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecatedContExpGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deprecatedContExpGroup;

	/**
	 * The cached value of the '{@link #getIntervalClassGroup() <em>Interval Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intervalClassGroup;

	/**
	 * The cached value of the '{@link #getUnaryFunctionalClassGroup() <em>Unary Functional Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryFunctionalClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryFunctionalClassGroup;

	/**
	 * The cached value of the '{@link #getLambdaClassGroup() <em>Lambda Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lambdaClassGroup;

	/**
	 * The cached value of the '{@link #getNaryFunctionalClassGroup() <em>Nary Functional Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryFunctionalClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryFunctionalClassGroup;

	/**
	 * The cached value of the '{@link #getQuotient() <em>Quotient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotient()
	 * @generated
	 * @ordered
	 */
	protected QuotientType quotient;

	/**
	 * The cached value of the '{@link #getDivide() <em>Divide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivide()
	 * @generated
	 * @ordered
	 */
	protected DivideType divide;

	/**
	 * The cached value of the '{@link #getMinus() <em>Minus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinus()
	 * @generated
	 * @ordered
	 */
	protected MinusType minus;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected PowerType power;

	/**
	 * The cached value of the '{@link #getRem() <em>Rem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRem()
	 * @generated
	 * @ordered
	 */
	protected RemType rem;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected RootType root;

	/**
	 * The cached value of the '{@link #getFactorial() <em>Factorial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorial()
	 * @generated
	 * @ordered
	 */
	protected FactorialType factorial;

	/**
	 * The cached value of the '{@link #getAbs() <em>Abs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs()
	 * @generated
	 * @ordered
	 */
	protected AbsType abs;

	/**
	 * The cached value of the '{@link #getConjugate() <em>Conjugate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugate()
	 * @generated
	 * @ordered
	 */
	protected ConjugateType conjugate;

	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected ArgType arg;

	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected RealType real;

	/**
	 * The cached value of the '{@link #getImaginary() <em>Imaginary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImaginary()
	 * @generated
	 * @ordered
	 */
	protected ImaginaryType imaginary;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected FloorType floor;

	/**
	 * The cached value of the '{@link #getCeiling() <em>Ceiling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling()
	 * @generated
	 * @ordered
	 */
	protected CeilingType ceiling;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected ExpType exp;

	/**
	 * The cached value of the '{@link #getNaryMinmaxClassGroup() <em>Nary Minmax Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryMinmaxClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryMinmaxClassGroup;

	/**
	 * The cached value of the '{@link #getNaryArithClassGroup() <em>Nary Arith Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryArithClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryArithClassGroup;

	/**
	 * The cached value of the '{@link #getNaryLogicalClassGroup() <em>Nary Logical Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryLogicalClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryLogicalClassGroup;

	/**
	 * The cached value of the '{@link #getUnaryLogicalClassGroup() <em>Unary Logical Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryLogicalClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryLogicalClassGroup;

	/**
	 * The cached value of the '{@link #getBinaryLogicalClassGroup() <em>Binary Logical Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryLogicalClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryLogicalClassGroup;

	/**
	 * The cached value of the '{@link #getQuantifierClassGroup() <em>Quantifier Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifierClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap quantifierClassGroup;

	/**
	 * The cached value of the '{@link #getNaryRelnClassGroup() <em>Nary Reln Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryRelnClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryRelnClassGroup;

	/**
	 * The cached value of the '{@link #getBinaryRelnClassGroup() <em>Binary Reln Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryRelnClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryRelnClassGroup;

	/**
	 * The cached value of the '{@link #getIntClassGroup() <em>Int Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intClassGroup;

	/**
	 * The cached value of the '{@link #getDifferentialOperatorClassGroup() <em>Differential Operator Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentialOperatorClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap differentialOperatorClassGroup;

	/**
	 * The cached value of the '{@link #getPartialdiffClassGroup() <em>Partialdiff Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialdiffClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap partialdiffClassGroup;

	/**
	 * The cached value of the '{@link #getUnaryVeccalcClassGroup() <em>Unary Veccalc Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryVeccalcClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryVeccalcClassGroup;

	/**
	 * The cached value of the '{@link #getNarySetlistConstructorClassGroup() <em>Nary Setlist Constructor Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarySetlistConstructorClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap narySetlistConstructorClassGroup;

	/**
	 * The cached value of the '{@link #getNarySetClassGroup() <em>Nary Set Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarySetClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap narySetClassGroup;

	/**
	 * The cached value of the '{@link #getBinarySetClassGroup() <em>Binary Set Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinarySetClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binarySetClassGroup;

	/**
	 * The cached value of the '{@link #getNarySetRelnClassGroup() <em>Nary Set Reln Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarySetRelnClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap narySetRelnClassGroup;

	/**
	 * The cached value of the '{@link #getUnarySetClassGroup() <em>Unary Set Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnarySetClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unarySetClassGroup;

	/**
	 * The cached value of the '{@link #getSumClassGroup() <em>Sum Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSumClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap sumClassGroup;

	/**
	 * The cached value of the '{@link #getProductClassGroup() <em>Product Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap productClassGroup;

	/**
	 * The cached value of the '{@link #getLimitClassGroup() <em>Limit Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap limitClassGroup;

	/**
	 * The cached value of the '{@link #getUnaryElementaryClassGroup() <em>Unary Elementary Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryElementaryClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryElementaryClassGroup;

	/**
	 * The cached value of the '{@link #getNaryStatsClassGroup() <em>Nary Stats Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryStatsClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryStatsClassGroup;

	/**
	 * The cached value of the '{@link #getNaryConstructorClassGroup() <em>Nary Constructor Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryConstructorClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryConstructorClassGroup;

	/**
	 * The cached value of the '{@link #getUnaryLinalgClassGroup() <em>Unary Linalg Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryLinalgClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryLinalgClassGroup;

	/**
	 * The cached value of the '{@link #getNaryLinalgClassGroup() <em>Nary Linalg Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryLinalgClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryLinalgClassGroup;

	/**
	 * The cached value of the '{@link #getBinaryLinalgClassGroup() <em>Binary Linalg Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryLinalgClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryLinalgClassGroup;

	/**
	 * The cached value of the '{@link #getConstantSetClassGroup() <em>Constant Set Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantSetClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap constantSetClassGroup;

	/**
	 * The cached value of the '{@link #getConstantArithClassGroup() <em>Constant Arith Class Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantArithClassGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap constantArithClassGroup;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected List<String> class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinitionURL() <em>Definition URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionURL()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionURL() <em>Definition URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionURL()
	 * @generated
	 * @ordered
	 */
	protected String definitionURL = DEFINITION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final Object OTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected Object other = OTHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXref()
	 * @generated
	 * @ordered
	 */
	protected static final Object XREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXref()
	 * @generated
	 * @ordered
	 */
	protected Object xref = XREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getLambdaClassType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BvarType> getBvar() {
		if (bvar == null) {
			bvar = new EObjectContainmentEList<BvarType>(BvarType.class, this, MlPackage.LAMBDA_CLASS_TYPE__BVAR);
		}
		return bvar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainofapplicationType> getDomainofapplication() {
		return getGroup().list(MlPackage.eINSTANCE.getLambdaClassType_Domainofapplication());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionType> getCondition() {
		return getGroup().list(MlPackage.eINSTANCE.getLambdaClassType_Condition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LowlimitType> getLowlimit() {
		return getGroup().list(MlPackage.eINSTANCE.getLambdaClassType_Lowlimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UplimitType> getUplimit() {
		return getGroup().list(MlPackage.eINSTANCE.getLambdaClassType_Uplimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplyType getApply() {
		return apply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApply(ApplyType newApply, NotificationChain msgs) {
		ApplyType oldApply = apply;
		apply = newApply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__APPLY, oldApply, newApply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApply(ApplyType newApply) {
		if (newApply != apply) {
			NotificationChain msgs = null;
			if (apply != null)
				msgs = ((InternalEObject)apply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__APPLY, null, msgs);
			if (newApply != null)
				msgs = ((InternalEObject)newApply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__APPLY, null, msgs);
			msgs = basicSetApply(newApply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__APPLY, newApply, newApply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindType getBind() {
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBind(BindType newBind, NotificationChain msgs) {
		BindType oldBind = bind;
		bind = newBind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__BIND, oldBind, newBind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBind(BindType newBind) {
		if (newBind != bind) {
			NotificationChain msgs = null;
			if (bind != null)
				msgs = ((InternalEObject)bind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__BIND, null, msgs);
			if (newBind != null)
				msgs = ((InternalEObject)newBind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__BIND, null, msgs);
			msgs = basicSetBind(newBind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__BIND, newBind, newBind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiType getCi() {
		return ci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCi(CiType newCi, NotificationChain msgs) {
		CiType oldCi = ci;
		ci = newCi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CI, oldCi, newCi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCi(CiType newCi) {
		if (newCi != ci) {
			NotificationChain msgs = null;
			if (ci != null)
				msgs = ((InternalEObject)ci).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CI, null, msgs);
			if (newCi != null)
				msgs = ((InternalEObject)newCi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CI, null, msgs);
			msgs = basicSetCi(newCi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CI, newCi, newCi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnType getCn() {
		return cn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCn(CnType newCn, NotificationChain msgs) {
		CnType oldCn = cn;
		cn = newCn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CN, oldCn, newCn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCn(CnType newCn) {
		if (newCn != cn) {
			NotificationChain msgs = null;
			if (cn != null)
				msgs = ((InternalEObject)cn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CN, null, msgs);
			if (newCn != null)
				msgs = ((InternalEObject)newCn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CN, null, msgs);
			msgs = basicSetCn(newCn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CN, newCn, newCn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsymbolType getCsymbol() {
		return csymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsymbol(CsymbolType newCsymbol, NotificationChain msgs) {
		CsymbolType oldCsymbol = csymbol;
		csymbol = newCsymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL, oldCsymbol, newCsymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsymbol(CsymbolType newCsymbol) {
		if (newCsymbol != csymbol) {
			NotificationChain msgs = null;
			if (csymbol != null)
				msgs = ((InternalEObject)csymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL, null, msgs);
			if (newCsymbol != null)
				msgs = ((InternalEObject)newCsymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL, null, msgs);
			msgs = basicSetCsymbol(newCsymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL, newCsymbol, newCsymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CbytesType getCbytes() {
		return cbytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCbytes(CbytesType newCbytes, NotificationChain msgs) {
		CbytesType oldCbytes = cbytes;
		cbytes = newCbytes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CBYTES, oldCbytes, newCbytes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCbytes(CbytesType newCbytes) {
		if (newCbytes != cbytes) {
			NotificationChain msgs = null;
			if (cbytes != null)
				msgs = ((InternalEObject)cbytes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CBYTES, null, msgs);
			if (newCbytes != null)
				msgs = ((InternalEObject)newCbytes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CBYTES, null, msgs);
			msgs = basicSetCbytes(newCbytes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CBYTES, newCbytes, newCbytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CerrorType getCerror() {
		return cerror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCerror(CerrorType newCerror, NotificationChain msgs) {
		CerrorType oldCerror = cerror;
		cerror = newCerror;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CERROR, oldCerror, newCerror);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCerror(CerrorType newCerror) {
		if (newCerror != cerror) {
			NotificationChain msgs = null;
			if (cerror != null)
				msgs = ((InternalEObject)cerror).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CERROR, null, msgs);
			if (newCerror != null)
				msgs = ((InternalEObject)newCerror).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CERROR, null, msgs);
			msgs = basicSetCerror(newCerror, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CERROR, newCerror, newCerror));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsType getCs() {
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCs(CsType newCs, NotificationChain msgs) {
		CsType oldCs = cs;
		cs = newCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CS, oldCs, newCs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCs(CsType newCs) {
		if (newCs != cs) {
			NotificationChain msgs = null;
			if (cs != null)
				msgs = ((InternalEObject)cs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject)newCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CS, newCs, newCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShareType getShare() {
		return share;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShare(ShareType newShare, NotificationChain msgs) {
		ShareType oldShare = share;
		share = newShare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__SHARE, oldShare, newShare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShare(ShareType newShare) {
		if (newShare != share) {
			NotificationChain msgs = null;
			if (share != null)
				msgs = ((InternalEObject)share).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__SHARE, null, msgs);
			if (newShare != null)
				msgs = ((InternalEObject)newShare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__SHARE, null, msgs);
			msgs = basicSetShare(newShare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__SHARE, newShare, newShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PiecewiseType getPiecewise() {
		return piecewise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiecewise(PiecewiseType newPiecewise, NotificationChain msgs) {
		PiecewiseType oldPiecewise = piecewise;
		piecewise = newPiecewise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE, oldPiecewise, newPiecewise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPiecewise(PiecewiseType newPiecewise) {
		if (newPiecewise != piecewise) {
			NotificationChain msgs = null;
			if (piecewise != null)
				msgs = ((InternalEObject)piecewise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE, null, msgs);
			if (newPiecewise != null)
				msgs = ((InternalEObject)newPiecewise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE, null, msgs);
			msgs = basicSetPiecewise(newPiecewise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE, newPiecewise, newPiecewise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup() {
		if (deprecatedContExpGroup == null) {
			deprecatedContExpGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP_GROUP);
		}
		return deprecatedContExpGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDeprecatedContExp() {
		return (EObject)getDeprecatedContExpGroup().get(MlPackage.eINSTANCE.getLambdaClassType_DeprecatedContExp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecatedContExp(EObject newDeprecatedContExp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDeprecatedContExpGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_DeprecatedContExp(), newDeprecatedContExp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup() {
		if (intervalClassGroup == null) {
			intervalClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS_GROUP);
		}
		return intervalClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervalClassType getIntervalClass() {
		return (IntervalClassType)getIntervalClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_IntervalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalClass(IntervalClassType newIntervalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntervalClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_IntervalClass(), newIntervalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup() {
		if (unaryFunctionalClassGroup == null) {
			unaryFunctionalClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP);
		}
		return unaryFunctionalClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getUnaryFunctionalClass() {
		return (UnaryFunctionalClassType)getUnaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_UnaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryFunctionalClass(UnaryFunctionalClassType newUnaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_UnaryFunctionalClass(), newUnaryFunctionalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup() {
		if (lambdaClassGroup == null) {
			lambdaClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS_GROUP);
		}
		return lambdaClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaClassType getLambdaClass() {
		return (LambdaClassType)getLambdaClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_LambdaClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaClass(LambdaClassType newLambdaClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLambdaClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_LambdaClass(), newLambdaClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup() {
		if (naryFunctionalClassGroup == null) {
			naryFunctionalClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS_GROUP);
		}
		return naryFunctionalClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryFunctionalClassType getNaryFunctionalClass() {
		return (NaryFunctionalClassType)getNaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryFunctionalClass(NaryFunctionalClassType newNaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryFunctionalClass(), newNaryFunctionalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuotientType getQuotient() {
		return quotient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuotient(QuotientType newQuotient, NotificationChain msgs) {
		QuotientType oldQuotient = quotient;
		quotient = newQuotient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT, oldQuotient, newQuotient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotient(QuotientType newQuotient) {
		if (newQuotient != quotient) {
			NotificationChain msgs = null;
			if (quotient != null)
				msgs = ((InternalEObject)quotient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT, null, msgs);
			if (newQuotient != null)
				msgs = ((InternalEObject)newQuotient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT, null, msgs);
			msgs = basicSetQuotient(newQuotient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT, newQuotient, newQuotient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivideType getDivide() {
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivide(DivideType newDivide, NotificationChain msgs) {
		DivideType oldDivide = divide;
		divide = newDivide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__DIVIDE, oldDivide, newDivide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDivide(DivideType newDivide) {
		if (newDivide != divide) {
			NotificationChain msgs = null;
			if (divide != null)
				msgs = ((InternalEObject)divide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__DIVIDE, null, msgs);
			if (newDivide != null)
				msgs = ((InternalEObject)newDivide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__DIVIDE, null, msgs);
			msgs = basicSetDivide(newDivide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__DIVIDE, newDivide, newDivide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinusType getMinus() {
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinus(MinusType newMinus, NotificationChain msgs) {
		MinusType oldMinus = minus;
		minus = newMinus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__MINUS, oldMinus, newMinus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinus(MinusType newMinus) {
		if (newMinus != minus) {
			NotificationChain msgs = null;
			if (minus != null)
				msgs = ((InternalEObject)minus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__MINUS, null, msgs);
			if (newMinus != null)
				msgs = ((InternalEObject)newMinus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__MINUS, null, msgs);
			msgs = basicSetMinus(newMinus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__MINUS, newMinus, newMinus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower(PowerType newPower, NotificationChain msgs) {
		PowerType oldPower = power;
		power = newPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__POWER, oldPower, newPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(PowerType newPower) {
		if (newPower != power) {
			NotificationChain msgs = null;
			if (power != null)
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__POWER, newPower, newPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemType getRem() {
		return rem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRem(RemType newRem, NotificationChain msgs) {
		RemType oldRem = rem;
		rem = newRem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__REM, oldRem, newRem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRem(RemType newRem) {
		if (newRem != rem) {
			NotificationChain msgs = null;
			if (rem != null)
				msgs = ((InternalEObject)rem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__REM, null, msgs);
			if (newRem != null)
				msgs = ((InternalEObject)newRem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__REM, null, msgs);
			msgs = basicSetRem(newRem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__REM, newRem, newRem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootType getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs) {
		RootType oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(RootType newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FactorialType getFactorial() {
		return factorial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactorial(FactorialType newFactorial, NotificationChain msgs) {
		FactorialType oldFactorial = factorial;
		factorial = newFactorial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL, oldFactorial, newFactorial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactorial(FactorialType newFactorial) {
		if (newFactorial != factorial) {
			NotificationChain msgs = null;
			if (factorial != null)
				msgs = ((InternalEObject)factorial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL, null, msgs);
			if (newFactorial != null)
				msgs = ((InternalEObject)newFactorial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL, null, msgs);
			msgs = basicSetFactorial(newFactorial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL, newFactorial, newFactorial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsType getAbs() {
		return abs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbs(AbsType newAbs, NotificationChain msgs) {
		AbsType oldAbs = abs;
		abs = newAbs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ABS, oldAbs, newAbs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbs(AbsType newAbs) {
		if (newAbs != abs) {
			NotificationChain msgs = null;
			if (abs != null)
				msgs = ((InternalEObject)abs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__ABS, null, msgs);
			if (newAbs != null)
				msgs = ((InternalEObject)newAbs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__ABS, null, msgs);
			msgs = basicSetAbs(newAbs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ABS, newAbs, newAbs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugateType getConjugate() {
		return conjugate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjugate(ConjugateType newConjugate, NotificationChain msgs) {
		ConjugateType oldConjugate = conjugate;
		conjugate = newConjugate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE, oldConjugate, newConjugate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConjugate(ConjugateType newConjugate) {
		if (newConjugate != conjugate) {
			NotificationChain msgs = null;
			if (conjugate != null)
				msgs = ((InternalEObject)conjugate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE, null, msgs);
			if (newConjugate != null)
				msgs = ((InternalEObject)newConjugate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE, null, msgs);
			msgs = basicSetConjugate(newConjugate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE, newConjugate, newConjugate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgType getArg() {
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArg(ArgType newArg, NotificationChain msgs) {
		ArgType oldArg = arg;
		arg = newArg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ARG, oldArg, newArg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArg(ArgType newArg) {
		if (newArg != arg) {
			NotificationChain msgs = null;
			if (arg != null)
				msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__ARG, null, msgs);
			if (newArg != null)
				msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__ARG, null, msgs);
			msgs = basicSetArg(newArg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ARG, newArg, newArg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealType getReal() {
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReal(RealType newReal, NotificationChain msgs) {
		RealType oldReal = real;
		real = newReal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__REAL, oldReal, newReal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReal(RealType newReal) {
		if (newReal != real) {
			NotificationChain msgs = null;
			if (real != null)
				msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__REAL, null, msgs);
			if (newReal != null)
				msgs = ((InternalEObject)newReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__REAL, null, msgs);
			msgs = basicSetReal(newReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__REAL, newReal, newReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImaginaryType getImaginary() {
		return imaginary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImaginary(ImaginaryType newImaginary, NotificationChain msgs) {
		ImaginaryType oldImaginary = imaginary;
		imaginary = newImaginary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY, oldImaginary, newImaginary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImaginary(ImaginaryType newImaginary) {
		if (newImaginary != imaginary) {
			NotificationChain msgs = null;
			if (imaginary != null)
				msgs = ((InternalEObject)imaginary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY, null, msgs);
			if (newImaginary != null)
				msgs = ((InternalEObject)newImaginary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY, null, msgs);
			msgs = basicSetImaginary(newImaginary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY, newImaginary, newImaginary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorType getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloor(FloorType newFloor, NotificationChain msgs) {
		FloorType oldFloor = floor;
		floor = newFloor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__FLOOR, oldFloor, newFloor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloor(FloorType newFloor) {
		if (newFloor != floor) {
			NotificationChain msgs = null;
			if (floor != null)
				msgs = ((InternalEObject)floor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__FLOOR, null, msgs);
			if (newFloor != null)
				msgs = ((InternalEObject)newFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__FLOOR, null, msgs);
			msgs = basicSetFloor(newFloor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__FLOOR, newFloor, newFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CeilingType getCeiling() {
		return ceiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCeiling(CeilingType newCeiling, NotificationChain msgs) {
		CeilingType oldCeiling = ceiling;
		ceiling = newCeiling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CEILING, oldCeiling, newCeiling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCeiling(CeilingType newCeiling) {
		if (newCeiling != ceiling) {
			NotificationChain msgs = null;
			if (ceiling != null)
				msgs = ((InternalEObject)ceiling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CEILING, null, msgs);
			if (newCeiling != null)
				msgs = ((InternalEObject)newCeiling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__CEILING, null, msgs);
			msgs = basicSetCeiling(newCeiling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CEILING, newCeiling, newCeiling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpType getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(ExpType newExp, NotificationChain msgs) {
		ExpType oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExp(ExpType newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.LAMBDA_CLASS_TYPE__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup() {
		if (naryMinmaxClassGroup == null) {
			naryMinmaxClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS_GROUP);
		}
		return naryMinmaxClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryMinmaxClassType getNaryMinmaxClass() {
		return (NaryMinmaxClassType)getNaryMinmaxClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryMinmaxClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryMinmaxClass(NaryMinmaxClassType newNaryMinmaxClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryMinmaxClass(), newNaryMinmaxClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup() {
		if (naryArithClassGroup == null) {
			naryArithClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS_GROUP);
		}
		return naryArithClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getNaryArithClass() {
		return (NaryArithClassType)getNaryArithClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryArithClass(NaryArithClassType newNaryArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryArithClass(), newNaryArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup() {
		if (naryLogicalClassGroup == null) {
			naryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS_GROUP);
		}
		return naryLogicalClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType getNaryLogicalClass() {
		return (NaryLogicalClassType)getNaryLogicalClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLogicalClass(NaryLogicalClassType newNaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryLogicalClass(), newNaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup() {
		if (unaryLogicalClassGroup == null) {
			unaryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS_GROUP);
		}
		return unaryLogicalClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicalClassType getUnaryLogicalClass() {
		return (UnaryLogicalClassType)getUnaryLogicalClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_UnaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLogicalClass(UnaryLogicalClassType newUnaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_UnaryLogicalClass(), newUnaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup() {
		if (binaryLogicalClassGroup == null) {
			binaryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS_GROUP);
		}
		return binaryLogicalClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalClassType getBinaryLogicalClass() {
		return (BinaryLogicalClassType)getBinaryLogicalClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_BinaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLogicalClass(BinaryLogicalClassType newBinaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_BinaryLogicalClass(), newBinaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup() {
		if (quantifierClassGroup == null) {
			quantifierClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS_GROUP);
		}
		return quantifierClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierClassType getQuantifierClass() {
		return (QuantifierClassType)getQuantifierClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_QuantifierClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifierClass(QuantifierClassType newQuantifierClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getQuantifierClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_QuantifierClass(), newQuantifierClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup() {
		if (naryRelnClassGroup == null) {
			naryRelnClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS_GROUP);
		}
		return naryRelnClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getNaryRelnClass() {
		return (NaryRelnClassType)getNaryRelnClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryRelnClass(NaryRelnClassType newNaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryRelnClass(), newNaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup() {
		if (binaryRelnClassGroup == null) {
			binaryRelnClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS_GROUP);
		}
		return binaryRelnClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getBinaryRelnClass() {
		return (EObject)getBinaryRelnClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_BinaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryRelnClass(EObject newBinaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_BinaryRelnClass(), newBinaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup() {
		if (intClassGroup == null) {
			intClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS_GROUP);
		}
		return intClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntClassType getIntClass() {
		return (IntClassType)getIntClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_IntClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntClass(IntClassType newIntClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_IntClass(), newIntClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup() {
		if (differentialOperatorClassGroup == null) {
			differentialOperatorClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP);
		}
		return differentialOperatorClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferentialOperatorClassType getDifferentialOperatorClass() {
		return (DifferentialOperatorClassType)getDifferentialOperatorClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_DifferentialOperatorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferentialOperatorClass(DifferentialOperatorClassType newDifferentialOperatorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_DifferentialOperatorClass(), newDifferentialOperatorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup() {
		if (partialdiffClassGroup == null) {
			partialdiffClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS_GROUP);
		}
		return partialdiffClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialdiffClassType getPartialdiffClass() {
		return (PartialdiffClassType)getPartialdiffClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_PartialdiffClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialdiffClass(PartialdiffClassType newPartialdiffClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPartialdiffClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_PartialdiffClass(), newPartialdiffClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup() {
		if (unaryVeccalcClassGroup == null) {
			unaryVeccalcClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS_GROUP);
		}
		return unaryVeccalcClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getUnaryVeccalcClass() {
		return (UnaryVeccalcClassType)getUnaryVeccalcClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_UnaryVeccalcClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryVeccalcClass(UnaryVeccalcClassType newUnaryVeccalcClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_UnaryVeccalcClass(), newUnaryVeccalcClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup() {
		if (narySetlistConstructorClassGroup == null) {
			narySetlistConstructorClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP);
		}
		return narySetlistConstructorClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getNarySetlistConstructorClass() {
		return (EObject)getNarySetlistConstructorClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NarySetlistConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetlistConstructorClass(EObject newNarySetlistConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NarySetlistConstructorClass(), newNarySetlistConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup() {
		if (narySetClassGroup == null) {
			narySetClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS_GROUP);
		}
		return narySetClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType getNarySetClass() {
		return (NarySetClassType)getNarySetClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetClass(NarySetClassType newNarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NarySetClass(), newNarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup() {
		if (binarySetClassGroup == null) {
			binarySetClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS_GROUP);
		}
		return binarySetClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getBinarySetClass() {
		return (BinarySetClassType)getBinarySetClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_BinarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySetClass(BinarySetClassType newBinarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_BinarySetClass(), newBinarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup() {
		if (narySetRelnClassGroup == null) {
			narySetRelnClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS_GROUP);
		}
		return narySetRelnClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetRelnClassType getNarySetRelnClass() {
		return (NarySetRelnClassType)getNarySetRelnClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NarySetRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetRelnClass(NarySetRelnClassType newNarySetRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NarySetRelnClass(), newNarySetRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup() {
		if (unarySetClassGroup == null) {
			unarySetClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS_GROUP);
		}
		return unarySetClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnarySetClassType getUnarySetClass() {
		return (UnarySetClassType)getUnarySetClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_UnarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnarySetClass(UnarySetClassType newUnarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_UnarySetClass(), newUnarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup() {
		if (sumClassGroup == null) {
			sumClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS_GROUP);
		}
		return sumClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SumClassType getSumClass() {
		return (SumClassType)getSumClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_SumClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSumClass(SumClassType newSumClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSumClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_SumClass(), newSumClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup() {
		if (productClassGroup == null) {
			productClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS_GROUP);
		}
		return productClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductClassType getProductClass() {
		return (ProductClassType)getProductClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_ProductClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductClass(ProductClassType newProductClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProductClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_ProductClass(), newProductClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup() {
		if (limitClassGroup == null) {
			limitClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS_GROUP);
		}
		return limitClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LimitClassType getLimitClass() {
		return (LimitClassType)getLimitClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_LimitClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitClass(LimitClassType newLimitClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLimitClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_LimitClass(), newLimitClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup() {
		if (unaryElementaryClassGroup == null) {
			unaryElementaryClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS_GROUP);
		}
		return unaryElementaryClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getUnaryElementaryClass() {
		return (UnaryElementaryClassType)getUnaryElementaryClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_UnaryElementaryClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryElementaryClass(UnaryElementaryClassType newUnaryElementaryClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_UnaryElementaryClass(), newUnaryElementaryClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup() {
		if (naryStatsClassGroup == null) {
			naryStatsClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS_GROUP);
		}
		return naryStatsClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getNaryStatsClass() {
		return (NaryStatsClassType)getNaryStatsClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryStatsClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryStatsClass(NaryStatsClassType newNaryStatsClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryStatsClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryStatsClass(), newNaryStatsClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup() {
		if (naryConstructorClassGroup == null) {
			naryConstructorClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP);
		}
		return naryConstructorClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType getNaryConstructorClass() {
		return (NaryConstructorClassType)getNaryConstructorClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryConstructorClass(NaryConstructorClassType newNaryConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryConstructorClass(), newNaryConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup() {
		if (unaryLinalgClassGroup == null) {
			unaryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS_GROUP);
		}
		return unaryLinalgClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLinalgClassType getUnaryLinalgClass() {
		return (UnaryLinalgClassType)getUnaryLinalgClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_UnaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLinalgClass(UnaryLinalgClassType newUnaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_UnaryLinalgClass(), newUnaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup() {
		if (naryLinalgClassGroup == null) {
			naryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS_GROUP);
		}
		return naryLinalgClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLinalgClassType getNaryLinalgClass() {
		return (NaryLinalgClassType)getNaryLinalgClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_NaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLinalgClass(NaryLinalgClassType newNaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_NaryLinalgClass(), newNaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup() {
		if (binaryLinalgClassGroup == null) {
			binaryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS_GROUP);
		}
		return binaryLinalgClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType getBinaryLinalgClass() {
		return (BinaryLinalgClassType)getBinaryLinalgClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_BinaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLinalgClass(BinaryLinalgClassType newBinaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_BinaryLinalgClass(), newBinaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup() {
		if (constantSetClassGroup == null) {
			constantSetClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS_GROUP);
		}
		return constantSetClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getConstantSetClass() {
		return (ConstantSetClassType)getConstantSetClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_ConstantSetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantSetClass(ConstantSetClassType newConstantSetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantSetClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_ConstantSetClass(), newConstantSetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup() {
		if (constantArithClassGroup == null) {
			constantArithClassGroup = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS_GROUP);
		}
		return constantArithClassGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getConstantArithClass() {
		return (ConstantArithClassType)getConstantArithClassGroup().get(MlPackage.eINSTANCE.getLambdaClassType_ConstantArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantArithClass(ConstantArithClassType newConstantArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getLambdaClassType_ConstantArithClass(), newConstantArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(List<String> newClass) {
		List<String> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinitionURL() {
		return definitionURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionURL(String newDefinitionURL) {
		String oldDefinitionURL = definitionURL;
		definitionURL = newDefinitionURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__DEFINITION_URL, oldDefinitionURL, definitionURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(Object newOther) {
		Object oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getXref() {
		return xref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXref(Object newXref) {
		Object oldXref = xref;
		xref = newXref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LAMBDA_CLASS_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.LAMBDA_CLASS_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlPackage.LAMBDA_CLASS_TYPE__BVAR:
				return ((InternalEList<?>)getBvar()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__DOMAINOFAPPLICATION:
				return ((InternalEList<?>)getDomainofapplication()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__LOWLIMIT:
				return ((InternalEList<?>)getLowlimit()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UPLIMIT:
				return ((InternalEList<?>)getUplimit()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__APPLY:
				return basicSetApply(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BIND:
				return basicSetBind(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CI:
				return basicSetCi(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CN:
				return basicSetCn(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL:
				return basicSetCsymbol(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CBYTES:
				return basicSetCbytes(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CERROR:
				return basicSetCerror(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CS:
				return basicSetCs(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__SHARE:
				return basicSetShare(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE:
				return basicSetPiecewise(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return ((InternalEList<?>)getDeprecatedContExpGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP:
				return basicSetDeprecatedContExp(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS_GROUP:
				return ((InternalEList<?>)getIntervalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS:
				return basicSetIntervalClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS:
				return basicSetUnaryFunctionalClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS_GROUP:
				return ((InternalEList<?>)getLambdaClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS:
				return basicSetLambdaClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS:
				return basicSetNaryFunctionalClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT:
				return basicSetQuotient(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__DIVIDE:
				return basicSetDivide(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__MINUS:
				return basicSetMinus(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__POWER:
				return basicSetPower(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__REM:
				return basicSetRem(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__ROOT:
				return basicSetRoot(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL:
				return basicSetFactorial(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__ABS:
				return basicSetAbs(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE:
				return basicSetConjugate(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__ARG:
				return basicSetArg(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__REAL:
				return basicSetReal(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY:
				return basicSetImaginary(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__FLOOR:
				return basicSetFloor(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CEILING:
				return basicSetCeiling(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__EXP:
				return basicSetExp(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS_GROUP:
				return ((InternalEList<?>)getNaryMinmaxClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS:
				return basicSetNaryMinmaxClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getNaryArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS:
				return basicSetNaryArithClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS:
				return basicSetNaryLogicalClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS:
				return basicSetUnaryLogicalClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS:
				return basicSetBinaryLogicalClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS_GROUP:
				return ((InternalEList<?>)getQuantifierClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS:
				return basicSetQuantifierClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS:
				return basicSetNaryRelnClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS:
				return basicSetBinaryRelnClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS_GROUP:
				return ((InternalEList<?>)getIntClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS:
				return basicSetIntClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return basicSetDifferentialOperatorClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS_GROUP:
				return ((InternalEList<?>)getPartialdiffClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS:
				return basicSetPartialdiffClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS:
				return basicSetUnaryVeccalcClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return basicSetNarySetlistConstructorClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS:
				return basicSetNarySetClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getBinarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS:
				return basicSetBinarySetClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS:
				return basicSetNarySetRelnClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getUnarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS:
				return basicSetUnarySetClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS_GROUP:
				return ((InternalEList<?>)getSumClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS:
				return basicSetSumClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS_GROUP:
				return ((InternalEList<?>)getProductClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS:
				return basicSetProductClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS_GROUP:
				return ((InternalEList<?>)getLimitClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS:
				return basicSetLimitClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryElementaryClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS:
				return basicSetUnaryElementaryClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS_GROUP:
				return ((InternalEList<?>)getNaryStatsClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS:
				return basicSetNaryStatsClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNaryConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS:
				return basicSetNaryConstructorClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS:
				return basicSetUnaryLinalgClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS:
				return basicSetNaryLinalgClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS:
				return basicSetBinaryLinalgClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS_GROUP:
				return ((InternalEList<?>)getConstantSetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS:
				return basicSetConstantSetClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getConstantArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS:
				return basicSetConstantArithClass(null, msgs);
			case MlPackage.LAMBDA_CLASS_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case MlPackage.LAMBDA_CLASS_TYPE__BVAR:
				return getBvar();
			case MlPackage.LAMBDA_CLASS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__DOMAINOFAPPLICATION:
				return getDomainofapplication();
			case MlPackage.LAMBDA_CLASS_TYPE__CONDITION:
				return getCondition();
			case MlPackage.LAMBDA_CLASS_TYPE__LOWLIMIT:
				return getLowlimit();
			case MlPackage.LAMBDA_CLASS_TYPE__UPLIMIT:
				return getUplimit();
			case MlPackage.LAMBDA_CLASS_TYPE__APPLY:
				return getApply();
			case MlPackage.LAMBDA_CLASS_TYPE__BIND:
				return getBind();
			case MlPackage.LAMBDA_CLASS_TYPE__CI:
				return getCi();
			case MlPackage.LAMBDA_CLASS_TYPE__CN:
				return getCn();
			case MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL:
				return getCsymbol();
			case MlPackage.LAMBDA_CLASS_TYPE__CBYTES:
				return getCbytes();
			case MlPackage.LAMBDA_CLASS_TYPE__CERROR:
				return getCerror();
			case MlPackage.LAMBDA_CLASS_TYPE__CS:
				return getCs();
			case MlPackage.LAMBDA_CLASS_TYPE__SHARE:
				return getShare();
			case MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE:
				return getPiecewise();
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP_GROUP:
				if (coreType) return getDeprecatedContExpGroup();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp();
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS_GROUP:
				if (coreType) return getIntervalClassGroup();
				return ((FeatureMap.Internal)getIntervalClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS:
				return getIntervalClass();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getUnaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass();
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS_GROUP:
				if (coreType) return getLambdaClassGroup();
				return ((FeatureMap.Internal)getLambdaClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS:
				return getLambdaClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getNaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass();
			case MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT:
				return getQuotient();
			case MlPackage.LAMBDA_CLASS_TYPE__DIVIDE:
				return getDivide();
			case MlPackage.LAMBDA_CLASS_TYPE__MINUS:
				return getMinus();
			case MlPackage.LAMBDA_CLASS_TYPE__POWER:
				return getPower();
			case MlPackage.LAMBDA_CLASS_TYPE__REM:
				return getRem();
			case MlPackage.LAMBDA_CLASS_TYPE__ROOT:
				return getRoot();
			case MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL:
				return getFactorial();
			case MlPackage.LAMBDA_CLASS_TYPE__ABS:
				return getAbs();
			case MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE:
				return getConjugate();
			case MlPackage.LAMBDA_CLASS_TYPE__ARG:
				return getArg();
			case MlPackage.LAMBDA_CLASS_TYPE__REAL:
				return getReal();
			case MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY:
				return getImaginary();
			case MlPackage.LAMBDA_CLASS_TYPE__FLOOR:
				return getFloor();
			case MlPackage.LAMBDA_CLASS_TYPE__CEILING:
				return getCeiling();
			case MlPackage.LAMBDA_CLASS_TYPE__EXP:
				return getExp();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS_GROUP:
				if (coreType) return getNaryMinmaxClassGroup();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS_GROUP:
				if (coreType) return getNaryArithClassGroup();
				return ((FeatureMap.Internal)getNaryArithClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS:
				return getNaryArithClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getNaryLogicalClassGroup();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getUnaryLogicalClassGroup();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getBinaryLogicalClassGroup();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass();
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS_GROUP:
				if (coreType) return getQuantifierClassGroup();
				return ((FeatureMap.Internal)getQuantifierClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS:
				return getQuantifierClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS_GROUP:
				if (coreType) return getNaryRelnClassGroup();
				return ((FeatureMap.Internal)getNaryRelnClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS:
				return getNaryRelnClass();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS_GROUP:
				if (coreType) return getBinaryRelnClassGroup();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS:
				return getBinaryRelnClass();
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS_GROUP:
				if (coreType) return getIntClassGroup();
				return ((FeatureMap.Internal)getIntClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS:
				return getIntClass();
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				if (coreType) return getDifferentialOperatorClassGroup();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass();
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS_GROUP:
				if (coreType) return getPartialdiffClassGroup();
				return ((FeatureMap.Internal)getPartialdiffClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS:
				return getPartialdiffClass();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS_GROUP:
				if (coreType) return getUnaryVeccalcClassGroup();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNarySetlistConstructorClassGroup();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS_GROUP:
				if (coreType) return getNarySetClassGroup();
				return ((FeatureMap.Internal)getNarySetClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS:
				return getNarySetClass();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS_GROUP:
				if (coreType) return getBinarySetClassGroup();
				return ((FeatureMap.Internal)getBinarySetClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS:
				return getBinarySetClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS_GROUP:
				if (coreType) return getNarySetRelnClassGroup();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS_GROUP:
				if (coreType) return getUnarySetClassGroup();
				return ((FeatureMap.Internal)getUnarySetClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS:
				return getUnarySetClass();
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS_GROUP:
				if (coreType) return getSumClassGroup();
				return ((FeatureMap.Internal)getSumClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS:
				return getSumClass();
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS_GROUP:
				if (coreType) return getProductClassGroup();
				return ((FeatureMap.Internal)getProductClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS:
				return getProductClass();
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS_GROUP:
				if (coreType) return getLimitClassGroup();
				return ((FeatureMap.Internal)getLimitClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS:
				return getLimitClass();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				if (coreType) return getUnaryElementaryClassGroup();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS_GROUP:
				if (coreType) return getNaryStatsClassGroup();
				return ((FeatureMap.Internal)getNaryStatsClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS:
				return getNaryStatsClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNaryConstructorClassGroup();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS_GROUP:
				if (coreType) return getUnaryLinalgClassGroup();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS_GROUP:
				if (coreType) return getNaryLinalgClassGroup();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS:
				return getNaryLinalgClass();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS_GROUP:
				if (coreType) return getBinaryLinalgClassGroup();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass();
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS_GROUP:
				if (coreType) return getConstantSetClassGroup();
				return ((FeatureMap.Internal)getConstantSetClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS:
				return getConstantSetClass();
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				if (coreType) return getConstantArithClassGroup();
				return ((FeatureMap.Internal)getConstantArithClassGroup()).getWrapper();
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS:
				return getConstantArithClass();
			case MlPackage.LAMBDA_CLASS_TYPE__CLASS:
				return getClass_();
			case MlPackage.LAMBDA_CLASS_TYPE__DEFINITION_URL:
				return getDefinitionURL();
			case MlPackage.LAMBDA_CLASS_TYPE__ENCODING:
				return getEncoding();
			case MlPackage.LAMBDA_CLASS_TYPE__HREF:
				return getHref();
			case MlPackage.LAMBDA_CLASS_TYPE__ID:
				return getId();
			case MlPackage.LAMBDA_CLASS_TYPE__OTHER:
				return getOther();
			case MlPackage.LAMBDA_CLASS_TYPE__STYLE:
				return getStyle();
			case MlPackage.LAMBDA_CLASS_TYPE__XREF:
				return getXref();
			case MlPackage.LAMBDA_CLASS_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case MlPackage.LAMBDA_CLASS_TYPE__BVAR:
				getBvar().clear();
				getBvar().addAll((Collection<? extends BvarType>)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DOMAINOFAPPLICATION:
				getDomainofapplication().clear();
				getDomainofapplication().addAll((Collection<? extends DomainofapplicationType>)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends ConditionType>)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__LOWLIMIT:
				getLowlimit().clear();
				getLowlimit().addAll((Collection<? extends LowlimitType>)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UPLIMIT:
				getUplimit().clear();
				getUplimit().addAll((Collection<? extends UplimitType>)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__APPLY:
				setApply((ApplyType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BIND:
				setBind((BindType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CI:
				setCi((CiType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CN:
				setCn((CnType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL:
				setCsymbol((CsymbolType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CBYTES:
				setCbytes((CbytesType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CERROR:
				setCerror((CerrorType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CS:
				setCs((CsType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__SHARE:
				setShare((ShareType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE:
				setPiecewise((PiecewiseType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP_GROUP:
				((FeatureMap.Internal)getDeprecatedContExpGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS_GROUP:
				((FeatureMap.Internal)getIntervalClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS_GROUP:
				((FeatureMap.Internal)getLambdaClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT:
				setQuotient((QuotientType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DIVIDE:
				setDivide((DivideType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__MINUS:
				setMinus((MinusType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__POWER:
				setPower((PowerType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__REM:
				setRem((RemType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ROOT:
				setRoot((RootType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL:
				setFactorial((FactorialType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ABS:
				setAbs((AbsType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE:
				setConjugate((ConjugateType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ARG:
				setArg((ArgType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__REAL:
				setReal((RealType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY:
				setImaginary((ImaginaryType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__FLOOR:
				setFloor((FloorType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CEILING:
				setCeiling((CeilingType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__EXP:
				setExp((ExpType)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS_GROUP:
				((FeatureMap.Internal)getNaryMinmaxClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getNaryArithClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS_GROUP:
				((FeatureMap.Internal)getQuantifierClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS_GROUP:
				((FeatureMap.Internal)getIntClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS_GROUP:
				((FeatureMap.Internal)getPartialdiffClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getBinarySetClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetRelnClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getUnarySetClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS_GROUP:
				((FeatureMap.Internal)getSumClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS_GROUP:
				((FeatureMap.Internal)getProductClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS_GROUP:
				((FeatureMap.Internal)getLimitClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryElementaryClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS_GROUP:
				((FeatureMap.Internal)getNaryStatsClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNaryConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS_GROUP:
				((FeatureMap.Internal)getConstantSetClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getConstantArithClassGroup()).set(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DEFINITION_URL:
				setDefinitionURL((String)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case MlPackage.LAMBDA_CLASS_TYPE__BVAR:
				getBvar().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__GROUP:
				getGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DOMAINOFAPPLICATION:
				getDomainofapplication().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONDITION:
				getCondition().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__LOWLIMIT:
				getLowlimit().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UPLIMIT:
				getUplimit().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__APPLY:
				setApply((ApplyType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BIND:
				setBind((BindType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CI:
				setCi((CiType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CN:
				setCn((CnType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL:
				setCsymbol((CsymbolType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CBYTES:
				setCbytes((CbytesType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CERROR:
				setCerror((CerrorType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CS:
				setCs((CsType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__SHARE:
				setShare((ShareType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE:
				setPiecewise((PiecewiseType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP_GROUP:
				getDeprecatedContExpGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS_GROUP:
				getIntervalClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				getUnaryFunctionalClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS_GROUP:
				getLambdaClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				getNaryFunctionalClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT:
				setQuotient((QuotientType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DIVIDE:
				setDivide((DivideType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__MINUS:
				setMinus((MinusType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__POWER:
				setPower((PowerType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__REM:
				setRem((RemType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ROOT:
				setRoot((RootType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL:
				setFactorial((FactorialType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ABS:
				setAbs((AbsType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE:
				setConjugate((ConjugateType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ARG:
				setArg((ArgType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__REAL:
				setReal((RealType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY:
				setImaginary((ImaginaryType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__FLOOR:
				setFloor((FloorType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CEILING:
				setCeiling((CeilingType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__EXP:
				setExp((ExpType)null);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS_GROUP:
				getNaryMinmaxClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS_GROUP:
				getNaryArithClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS_GROUP:
				getNaryLogicalClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				getUnaryLogicalClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				getBinaryLogicalClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS_GROUP:
				getQuantifierClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS_GROUP:
				getNaryRelnClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS_GROUP:
				getBinaryRelnClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS_GROUP:
				getIntClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				getDifferentialOperatorClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS_GROUP:
				getPartialdiffClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS_GROUP:
				getUnaryVeccalcClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				getNarySetlistConstructorClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS_GROUP:
				getNarySetClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS_GROUP:
				getBinarySetClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS_GROUP:
				getNarySetRelnClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS_GROUP:
				getUnarySetClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS_GROUP:
				getSumClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS_GROUP:
				getProductClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS_GROUP:
				getLimitClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				getUnaryElementaryClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS_GROUP:
				getNaryStatsClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				getNaryConstructorClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS_GROUP:
				getUnaryLinalgClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS_GROUP:
				getNaryLinalgClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS_GROUP:
				getBinaryLinalgClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS_GROUP:
				getConstantSetClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				getConstantArithClassGroup().clear();
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__DEFINITION_URL:
				setDefinitionURL(DEFINITION_URL_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.LAMBDA_CLASS_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case MlPackage.LAMBDA_CLASS_TYPE__BVAR:
				return bvar != null && !bvar.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__DOMAINOFAPPLICATION:
				return !getDomainofapplication().isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__CONDITION:
				return !getCondition().isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__LOWLIMIT:
				return !getLowlimit().isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UPLIMIT:
				return !getUplimit().isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__APPLY:
				return apply != null;
			case MlPackage.LAMBDA_CLASS_TYPE__BIND:
				return bind != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CI:
				return ci != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CN:
				return cn != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CSYMBOL:
				return csymbol != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CBYTES:
				return cbytes != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CERROR:
				return cerror != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CS:
				return cs != null;
			case MlPackage.LAMBDA_CLASS_TYPE__SHARE:
				return share != null;
			case MlPackage.LAMBDA_CLASS_TYPE__PIECEWISE:
				return piecewise != null;
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return deprecatedContExpGroup != null && !deprecatedContExpGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS_GROUP:
				return intervalClassGroup != null && !intervalClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__INTERVAL_CLASS:
				return getIntervalClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return unaryFunctionalClassGroup != null && !unaryFunctionalClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS_GROUP:
				return lambdaClassGroup != null && !lambdaClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__LAMBDA_CLASS:
				return getLambdaClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return naryFunctionalClassGroup != null && !naryFunctionalClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__QUOTIENT:
				return quotient != null;
			case MlPackage.LAMBDA_CLASS_TYPE__DIVIDE:
				return divide != null;
			case MlPackage.LAMBDA_CLASS_TYPE__MINUS:
				return minus != null;
			case MlPackage.LAMBDA_CLASS_TYPE__POWER:
				return power != null;
			case MlPackage.LAMBDA_CLASS_TYPE__REM:
				return rem != null;
			case MlPackage.LAMBDA_CLASS_TYPE__ROOT:
				return root != null;
			case MlPackage.LAMBDA_CLASS_TYPE__FACTORIAL:
				return factorial != null;
			case MlPackage.LAMBDA_CLASS_TYPE__ABS:
				return abs != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CONJUGATE:
				return conjugate != null;
			case MlPackage.LAMBDA_CLASS_TYPE__ARG:
				return arg != null;
			case MlPackage.LAMBDA_CLASS_TYPE__REAL:
				return real != null;
			case MlPackage.LAMBDA_CLASS_TYPE__IMAGINARY:
				return imaginary != null;
			case MlPackage.LAMBDA_CLASS_TYPE__FLOOR:
				return floor != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CEILING:
				return ceiling != null;
			case MlPackage.LAMBDA_CLASS_TYPE__EXP:
				return exp != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS_GROUP:
				return naryMinmaxClassGroup != null && !naryMinmaxClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS_GROUP:
				return naryArithClassGroup != null && !naryArithClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_ARITH_CLASS:
				return getNaryArithClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return naryLogicalClassGroup != null && !naryLogicalClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return unaryLogicalClassGroup != null && !unaryLogicalClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return binaryLogicalClassGroup != null && !binaryLogicalClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS_GROUP:
				return quantifierClassGroup != null && !quantifierClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__QUANTIFIER_CLASS:
				return getQuantifierClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS_GROUP:
				return naryRelnClassGroup != null && !naryRelnClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_RELN_CLASS:
				return getNaryRelnClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS_GROUP:
				return binaryRelnClassGroup != null && !binaryRelnClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_RELN_CLASS:
				return getBinaryRelnClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS_GROUP:
				return intClassGroup != null && !intClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__INT_CLASS:
				return getIntClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return differentialOperatorClassGroup != null && !differentialOperatorClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS_GROUP:
				return partialdiffClassGroup != null && !partialdiffClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__PARTIALDIFF_CLASS:
				return getPartialdiffClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return unaryVeccalcClassGroup != null && !unaryVeccalcClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return narySetlistConstructorClassGroup != null && !narySetlistConstructorClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS_GROUP:
				return narySetClassGroup != null && !narySetClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_CLASS:
				return getNarySetClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS_GROUP:
				return binarySetClassGroup != null && !binarySetClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_SET_CLASS:
				return getBinarySetClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return narySetRelnClassGroup != null && !narySetRelnClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS_GROUP:
				return unarySetClassGroup != null && !unarySetClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_SET_CLASS:
				return getUnarySetClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS_GROUP:
				return sumClassGroup != null && !sumClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__SUM_CLASS:
				return getSumClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS_GROUP:
				return productClassGroup != null && !productClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__PRODUCT_CLASS:
				return getProductClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS_GROUP:
				return limitClassGroup != null && !limitClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__LIMIT_CLASS:
				return getLimitClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return unaryElementaryClassGroup != null && !unaryElementaryClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS_GROUP:
				return naryStatsClassGroup != null && !naryStatsClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_STATS_CLASS:
				return getNaryStatsClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return naryConstructorClassGroup != null && !naryConstructorClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS_GROUP:
				return unaryLinalgClassGroup != null && !unaryLinalgClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS_GROUP:
				return naryLinalgClassGroup != null && !naryLinalgClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__NARY_LINALG_CLASS:
				return getNaryLinalgClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS_GROUP:
				return binaryLinalgClassGroup != null && !binaryLinalgClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS_GROUP:
				return constantSetClassGroup != null && !constantSetClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_SET_CLASS:
				return getConstantSetClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return constantArithClassGroup != null && !constantArithClassGroup.isEmpty();
			case MlPackage.LAMBDA_CLASS_TYPE__CONSTANT_ARITH_CLASS:
				return getConstantArithClass() != null;
			case MlPackage.LAMBDA_CLASS_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.LAMBDA_CLASS_TYPE__DEFINITION_URL:
				return DEFINITION_URL_EDEFAULT == null ? definitionURL != null : !DEFINITION_URL_EDEFAULT.equals(definitionURL);
			case MlPackage.LAMBDA_CLASS_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case MlPackage.LAMBDA_CLASS_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.LAMBDA_CLASS_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.LAMBDA_CLASS_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.LAMBDA_CLASS_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.LAMBDA_CLASS_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.LAMBDA_CLASS_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", deprecatedContExpGroup: ");
		result.append(deprecatedContExpGroup);
		result.append(", intervalClassGroup: ");
		result.append(intervalClassGroup);
		result.append(", unaryFunctionalClassGroup: ");
		result.append(unaryFunctionalClassGroup);
		result.append(", lambdaClassGroup: ");
		result.append(lambdaClassGroup);
		result.append(", naryFunctionalClassGroup: ");
		result.append(naryFunctionalClassGroup);
		result.append(", naryMinmaxClassGroup: ");
		result.append(naryMinmaxClassGroup);
		result.append(", naryArithClassGroup: ");
		result.append(naryArithClassGroup);
		result.append(", naryLogicalClassGroup: ");
		result.append(naryLogicalClassGroup);
		result.append(", unaryLogicalClassGroup: ");
		result.append(unaryLogicalClassGroup);
		result.append(", binaryLogicalClassGroup: ");
		result.append(binaryLogicalClassGroup);
		result.append(", quantifierClassGroup: ");
		result.append(quantifierClassGroup);
		result.append(", naryRelnClassGroup: ");
		result.append(naryRelnClassGroup);
		result.append(", binaryRelnClassGroup: ");
		result.append(binaryRelnClassGroup);
		result.append(", intClassGroup: ");
		result.append(intClassGroup);
		result.append(", differentialOperatorClassGroup: ");
		result.append(differentialOperatorClassGroup);
		result.append(", partialdiffClassGroup: ");
		result.append(partialdiffClassGroup);
		result.append(", unaryVeccalcClassGroup: ");
		result.append(unaryVeccalcClassGroup);
		result.append(", narySetlistConstructorClassGroup: ");
		result.append(narySetlistConstructorClassGroup);
		result.append(", narySetClassGroup: ");
		result.append(narySetClassGroup);
		result.append(", binarySetClassGroup: ");
		result.append(binarySetClassGroup);
		result.append(", narySetRelnClassGroup: ");
		result.append(narySetRelnClassGroup);
		result.append(", unarySetClassGroup: ");
		result.append(unarySetClassGroup);
		result.append(", sumClassGroup: ");
		result.append(sumClassGroup);
		result.append(", productClassGroup: ");
		result.append(productClassGroup);
		result.append(", limitClassGroup: ");
		result.append(limitClassGroup);
		result.append(", unaryElementaryClassGroup: ");
		result.append(unaryElementaryClassGroup);
		result.append(", naryStatsClassGroup: ");
		result.append(naryStatsClassGroup);
		result.append(", naryConstructorClassGroup: ");
		result.append(naryConstructorClassGroup);
		result.append(", unaryLinalgClassGroup: ");
		result.append(unaryLinalgClassGroup);
		result.append(", naryLinalgClassGroup: ");
		result.append(naryLinalgClassGroup);
		result.append(", binaryLinalgClassGroup: ");
		result.append(binaryLinalgClassGroup);
		result.append(", constantSetClassGroup: ");
		result.append(constantSetClassGroup);
		result.append(", constantArithClassGroup: ");
		result.append(constantArithClassGroup);
		result.append(", class: ");
		result.append(class_);
		result.append(", definitionURL: ");
		result.append(definitionURL);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", other: ");
		result.append(other);
		result.append(", style: ");
		result.append(style);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //LambdaClassTypeImpl
