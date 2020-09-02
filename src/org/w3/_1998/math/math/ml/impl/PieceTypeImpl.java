/**
 */
package org.w3._1998.math.math.ml.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.AbsType;
import org.w3._1998.math.math.ml.ApplyType;
import org.w3._1998.math.math.ml.ArgType;
import org.w3._1998.math.math.ml.BinaryLinalgClassType;
import org.w3._1998.math.math.ml.BinaryLogicalClassType;
import org.w3._1998.math.math.ml.BinarySetClassType;
import org.w3._1998.math.math.ml.BindType;
import org.w3._1998.math.math.ml.CbytesType;
import org.w3._1998.math.math.ml.CeilingType;
import org.w3._1998.math.math.ml.CerrorType;
import org.w3._1998.math.math.ml.CiType;
import org.w3._1998.math.math.ml.CnType;
import org.w3._1998.math.math.ml.ConjugateType;
import org.w3._1998.math.math.ml.ConstantArithClassType;
import org.w3._1998.math.math.ml.ConstantSetClassType;
import org.w3._1998.math.math.ml.CsType;
import org.w3._1998.math.math.ml.CsymbolType;
import org.w3._1998.math.math.ml.DifferentialOperatorClassType;
import org.w3._1998.math.math.ml.DivideType;
import org.w3._1998.math.math.ml.ExpType;
import org.w3._1998.math.math.ml.FactorialType;
import org.w3._1998.math.math.ml.FloorType;
import org.w3._1998.math.math.ml.ImaginaryType;
import org.w3._1998.math.math.ml.IntClassType;
import org.w3._1998.math.math.ml.IntervalClassType;
import org.w3._1998.math.math.ml.LambdaClassType;
import org.w3._1998.math.math.ml.LimitClassType;
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
import org.w3._1998.math.math.ml.PieceType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getApply1 <em>Apply1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBind1 <em>Bind1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCi1 <em>Ci1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCn1 <em>Cn1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCsymbol1 <em>Csymbol1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCbytes1 <em>Cbytes1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCerror1 <em>Cerror1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCs1 <em>Cs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getShare1 <em>Share1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPiecewise1 <em>Piecewise1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDeprecatedContExpGroup1 <em>Deprecated Cont Exp Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDeprecatedContExp1 <em>Deprecated Cont Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntervalClassGroup1 <em>Interval Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntervalClass1 <em>Interval Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryFunctionalClassGroup1 <em>Unary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryFunctionalClass1 <em>Unary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLambdaClassGroup1 <em>Lambda Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLambdaClass1 <em>Lambda Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryFunctionalClassGroup1 <em>Nary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryFunctionalClass1 <em>Nary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getQuotient1 <em>Quotient1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDivide1 <em>Divide1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getMinus1 <em>Minus1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPower1 <em>Power1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getRem1 <em>Rem1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getRoot1 <em>Root1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getFactorial1 <em>Factorial1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getAbs1 <em>Abs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConjugate1 <em>Conjugate1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getReal1 <em>Real1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getImaginary1 <em>Imaginary1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getFloor1 <em>Floor1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getCeiling1 <em>Ceiling1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryMinmaxClassGroup1 <em>Nary Minmax Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryMinmaxClass1 <em>Nary Minmax Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryArithClassGroup1 <em>Nary Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryArithClass1 <em>Nary Arith Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLogicalClassGroup1 <em>Nary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLogicalClass1 <em>Nary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLogicalClassGroup1 <em>Unary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLogicalClass1 <em>Unary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLogicalClassGroup1 <em>Binary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLogicalClass1 <em>Binary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getQuantifierClassGroup1 <em>Quantifier Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getQuantifierClass1 <em>Quantifier Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryRelnClassGroup1 <em>Nary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryRelnClass1 <em>Nary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryRelnClassGroup1 <em>Binary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryRelnClass1 <em>Binary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntClassGroup1 <em>Int Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getIntClass1 <em>Int Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDifferentialOperatorClassGroup1 <em>Differential Operator Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDifferentialOperatorClass1 <em>Differential Operator Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPartialdiffClassGroup1 <em>Partialdiff Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getPartialdiffClass1 <em>Partialdiff Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryVeccalcClassGroup1 <em>Unary Veccalc Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryVeccalcClass1 <em>Unary Veccalc Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetlistConstructorClassGroup1 <em>Nary Setlist Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetlistConstructorClass1 <em>Nary Setlist Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetClassGroup1 <em>Nary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetClass1 <em>Nary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinarySetClassGroup1 <em>Binary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinarySetClass1 <em>Binary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetRelnClassGroup1 <em>Nary Set Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNarySetRelnClass1 <em>Nary Set Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnarySetClassGroup1 <em>Unary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnarySetClass1 <em>Unary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getSumClassGroup1 <em>Sum Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getSumClass1 <em>Sum Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getProductClassGroup1 <em>Product Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getProductClass1 <em>Product Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLimitClassGroup1 <em>Limit Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getLimitClass1 <em>Limit Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryElementaryClassGroup1 <em>Unary Elementary Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryElementaryClass1 <em>Unary Elementary Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryStatsClassGroup1 <em>Nary Stats Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryStatsClass1 <em>Nary Stats Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryConstructorClassGroup1 <em>Nary Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryConstructorClass1 <em>Nary Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLinalgClassGroup1 <em>Unary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getUnaryLinalgClass1 <em>Unary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLinalgClassGroup1 <em>Nary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getNaryLinalgClass1 <em>Nary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLinalgClassGroup1 <em>Binary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getBinaryLinalgClass1 <em>Binary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantSetClassGroup1 <em>Constant Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantSetClass1 <em>Constant Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantArithClassGroup1 <em>Constant Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getConstantArithClass1 <em>Constant Arith Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getDefinitionURL <em>Definition URL</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.PieceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PieceTypeImpl extends MinimalEObjectImpl.Container implements PieceType {
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
	 * The cached value of the '{@link #getApply1() <em>Apply1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply1()
	 * @generated
	 * @ordered
	 */
	protected ApplyType apply1;

	/**
	 * The cached value of the '{@link #getBind1() <em>Bind1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind1()
	 * @generated
	 * @ordered
	 */
	protected BindType bind1;

	/**
	 * The cached value of the '{@link #getCi1() <em>Ci1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCi1()
	 * @generated
	 * @ordered
	 */
	protected CiType ci1;

	/**
	 * The cached value of the '{@link #getCn1() <em>Cn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCn1()
	 * @generated
	 * @ordered
	 */
	protected CnType cn1;

	/**
	 * The cached value of the '{@link #getCsymbol1() <em>Csymbol1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsymbol1()
	 * @generated
	 * @ordered
	 */
	protected CsymbolType csymbol1;

	/**
	 * The cached value of the '{@link #getCbytes1() <em>Cbytes1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbytes1()
	 * @generated
	 * @ordered
	 */
	protected CbytesType cbytes1;

	/**
	 * The cached value of the '{@link #getCerror1() <em>Cerror1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCerror1()
	 * @generated
	 * @ordered
	 */
	protected CerrorType cerror1;

	/**
	 * The cached value of the '{@link #getCs1() <em>Cs1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs1()
	 * @generated
	 * @ordered
	 */
	protected CsType cs1;

	/**
	 * The cached value of the '{@link #getShare1() <em>Share1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShare1()
	 * @generated
	 * @ordered
	 */
	protected ShareType share1;

	/**
	 * The cached value of the '{@link #getPiecewise1() <em>Piecewise1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecewise1()
	 * @generated
	 * @ordered
	 */
	protected PiecewiseType piecewise1;

	/**
	 * The cached value of the '{@link #getDeprecatedContExpGroup1() <em>Deprecated Cont Exp Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecatedContExpGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap deprecatedContExpGroup1;

	/**
	 * The cached value of the '{@link #getIntervalClassGroup1() <em>Interval Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intervalClassGroup1;

	/**
	 * The cached value of the '{@link #getUnaryFunctionalClassGroup1() <em>Unary Functional Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryFunctionalClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryFunctionalClassGroup1;

	/**
	 * The cached value of the '{@link #getLambdaClassGroup1() <em>Lambda Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lambdaClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryFunctionalClassGroup1() <em>Nary Functional Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryFunctionalClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryFunctionalClassGroup1;

	/**
	 * The cached value of the '{@link #getQuotient1() <em>Quotient1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotient1()
	 * @generated
	 * @ordered
	 */
	protected QuotientType quotient1;

	/**
	 * The cached value of the '{@link #getDivide1() <em>Divide1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivide1()
	 * @generated
	 * @ordered
	 */
	protected DivideType divide1;

	/**
	 * The cached value of the '{@link #getMinus1() <em>Minus1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinus1()
	 * @generated
	 * @ordered
	 */
	protected MinusType minus1;

	/**
	 * The cached value of the '{@link #getPower1() <em>Power1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower1()
	 * @generated
	 * @ordered
	 */
	protected PowerType power1;

	/**
	 * The cached value of the '{@link #getRem1() <em>Rem1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRem1()
	 * @generated
	 * @ordered
	 */
	protected RemType rem1;

	/**
	 * The cached value of the '{@link #getRoot1() <em>Root1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot1()
	 * @generated
	 * @ordered
	 */
	protected RootType root1;

	/**
	 * The cached value of the '{@link #getFactorial1() <em>Factorial1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorial1()
	 * @generated
	 * @ordered
	 */
	protected FactorialType factorial1;

	/**
	 * The cached value of the '{@link #getAbs1() <em>Abs1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs1()
	 * @generated
	 * @ordered
	 */
	protected AbsType abs1;

	/**
	 * The cached value of the '{@link #getConjugate1() <em>Conjugate1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugate1()
	 * @generated
	 * @ordered
	 */
	protected ConjugateType conjugate1;

	/**
	 * The cached value of the '{@link #getArg1() <em>Arg1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg1()
	 * @generated
	 * @ordered
	 */
	protected ArgType arg1;

	/**
	 * The cached value of the '{@link #getReal1() <em>Real1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal1()
	 * @generated
	 * @ordered
	 */
	protected RealType real1;

	/**
	 * The cached value of the '{@link #getImaginary1() <em>Imaginary1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImaginary1()
	 * @generated
	 * @ordered
	 */
	protected ImaginaryType imaginary1;

	/**
	 * The cached value of the '{@link #getFloor1() <em>Floor1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor1()
	 * @generated
	 * @ordered
	 */
	protected FloorType floor1;

	/**
	 * The cached value of the '{@link #getCeiling1() <em>Ceiling1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling1()
	 * @generated
	 * @ordered
	 */
	protected CeilingType ceiling1;

	/**
	 * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp1()
	 * @generated
	 * @ordered
	 */
	protected ExpType exp1;

	/**
	 * The cached value of the '{@link #getNaryMinmaxClassGroup1() <em>Nary Minmax Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryMinmaxClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryMinmaxClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryArithClassGroup1() <em>Nary Arith Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryArithClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryArithClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryLogicalClassGroup1() <em>Nary Logical Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryLogicalClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryLogicalClassGroup1;

	/**
	 * The cached value of the '{@link #getUnaryLogicalClassGroup1() <em>Unary Logical Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryLogicalClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryLogicalClassGroup1;

	/**
	 * The cached value of the '{@link #getBinaryLogicalClassGroup1() <em>Binary Logical Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryLogicalClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryLogicalClassGroup1;

	/**
	 * The cached value of the '{@link #getQuantifierClassGroup1() <em>Quantifier Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifierClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap quantifierClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryRelnClassGroup1() <em>Nary Reln Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryRelnClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryRelnClassGroup1;

	/**
	 * The cached value of the '{@link #getBinaryRelnClassGroup1() <em>Binary Reln Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryRelnClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryRelnClassGroup1;

	/**
	 * The cached value of the '{@link #getIntClassGroup1() <em>Int Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap intClassGroup1;

	/**
	 * The cached value of the '{@link #getDifferentialOperatorClassGroup1() <em>Differential Operator Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentialOperatorClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap differentialOperatorClassGroup1;

	/**
	 * The cached value of the '{@link #getPartialdiffClassGroup1() <em>Partialdiff Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialdiffClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap partialdiffClassGroup1;

	/**
	 * The cached value of the '{@link #getUnaryVeccalcClassGroup1() <em>Unary Veccalc Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryVeccalcClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryVeccalcClassGroup1;

	/**
	 * The cached value of the '{@link #getNarySetlistConstructorClassGroup1() <em>Nary Setlist Constructor Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarySetlistConstructorClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap narySetlistConstructorClassGroup1;

	/**
	 * The cached value of the '{@link #getNarySetClassGroup1() <em>Nary Set Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarySetClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap narySetClassGroup1;

	/**
	 * The cached value of the '{@link #getBinarySetClassGroup1() <em>Binary Set Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinarySetClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binarySetClassGroup1;

	/**
	 * The cached value of the '{@link #getNarySetRelnClassGroup1() <em>Nary Set Reln Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarySetRelnClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap narySetRelnClassGroup1;

	/**
	 * The cached value of the '{@link #getUnarySetClassGroup1() <em>Unary Set Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnarySetClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unarySetClassGroup1;

	/**
	 * The cached value of the '{@link #getSumClassGroup1() <em>Sum Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSumClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap sumClassGroup1;

	/**
	 * The cached value of the '{@link #getProductClassGroup1() <em>Product Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap productClassGroup1;

	/**
	 * The cached value of the '{@link #getLimitClassGroup1() <em>Limit Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap limitClassGroup1;

	/**
	 * The cached value of the '{@link #getUnaryElementaryClassGroup1() <em>Unary Elementary Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryElementaryClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryElementaryClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryStatsClassGroup1() <em>Nary Stats Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryStatsClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryStatsClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryConstructorClassGroup1() <em>Nary Constructor Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryConstructorClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryConstructorClassGroup1;

	/**
	 * The cached value of the '{@link #getUnaryLinalgClassGroup1() <em>Unary Linalg Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryLinalgClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unaryLinalgClassGroup1;

	/**
	 * The cached value of the '{@link #getNaryLinalgClassGroup1() <em>Nary Linalg Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryLinalgClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap naryLinalgClassGroup1;

	/**
	 * The cached value of the '{@link #getBinaryLinalgClassGroup1() <em>Binary Linalg Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryLinalgClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap binaryLinalgClassGroup1;

	/**
	 * The cached value of the '{@link #getConstantSetClassGroup1() <em>Constant Set Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantSetClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap constantSetClassGroup1;

	/**
	 * The cached value of the '{@link #getConstantArithClassGroup1() <em>Constant Arith Class Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantArithClassGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap constantArithClassGroup1;

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
	protected PieceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getPieceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__APPLY, oldApply, newApply);
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
				msgs = ((InternalEObject)apply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__APPLY, null, msgs);
			if (newApply != null)
				msgs = ((InternalEObject)newApply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__APPLY, null, msgs);
			msgs = basicSetApply(newApply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__APPLY, newApply, newApply));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__BIND, oldBind, newBind);
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
				msgs = ((InternalEObject)bind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__BIND, null, msgs);
			if (newBind != null)
				msgs = ((InternalEObject)newBind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__BIND, null, msgs);
			msgs = basicSetBind(newBind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__BIND, newBind, newBind));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CI, oldCi, newCi);
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
				msgs = ((InternalEObject)ci).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CI, null, msgs);
			if (newCi != null)
				msgs = ((InternalEObject)newCi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CI, null, msgs);
			msgs = basicSetCi(newCi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CI, newCi, newCi));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CN, oldCn, newCn);
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
				msgs = ((InternalEObject)cn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CN, null, msgs);
			if (newCn != null)
				msgs = ((InternalEObject)newCn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CN, null, msgs);
			msgs = basicSetCn(newCn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CN, newCn, newCn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CSYMBOL, oldCsymbol, newCsymbol);
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
				msgs = ((InternalEObject)csymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CSYMBOL, null, msgs);
			if (newCsymbol != null)
				msgs = ((InternalEObject)newCsymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CSYMBOL, null, msgs);
			msgs = basicSetCsymbol(newCsymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CSYMBOL, newCsymbol, newCsymbol));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CBYTES, oldCbytes, newCbytes);
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
				msgs = ((InternalEObject)cbytes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CBYTES, null, msgs);
			if (newCbytes != null)
				msgs = ((InternalEObject)newCbytes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CBYTES, null, msgs);
			msgs = basicSetCbytes(newCbytes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CBYTES, newCbytes, newCbytes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CERROR, oldCerror, newCerror);
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
				msgs = ((InternalEObject)cerror).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CERROR, null, msgs);
			if (newCerror != null)
				msgs = ((InternalEObject)newCerror).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CERROR, null, msgs);
			msgs = basicSetCerror(newCerror, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CERROR, newCerror, newCerror));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CS, oldCs, newCs);
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
				msgs = ((InternalEObject)cs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject)newCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CS, newCs, newCs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__SHARE, oldShare, newShare);
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
				msgs = ((InternalEObject)share).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__SHARE, null, msgs);
			if (newShare != null)
				msgs = ((InternalEObject)newShare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__SHARE, null, msgs);
			msgs = basicSetShare(newShare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__SHARE, newShare, newShare));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__PIECEWISE, oldPiecewise, newPiecewise);
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
				msgs = ((InternalEObject)piecewise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__PIECEWISE, null, msgs);
			if (newPiecewise != null)
				msgs = ((InternalEObject)newPiecewise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__PIECEWISE, null, msgs);
			msgs = basicSetPiecewise(newPiecewise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__PIECEWISE, newPiecewise, newPiecewise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup() {
		if (deprecatedContExpGroup == null) {
			deprecatedContExpGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP);
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
		return (EObject)getDeprecatedContExpGroup().get(MlPackage.eINSTANCE.getPieceType_DeprecatedContExp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecatedContExp(EObject newDeprecatedContExp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDeprecatedContExpGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_DeprecatedContExp(), newDeprecatedContExp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup() {
		if (intervalClassGroup == null) {
			intervalClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP);
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
		return (IntervalClassType)getIntervalClassGroup().get(MlPackage.eINSTANCE.getPieceType_IntervalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalClass(IntervalClassType newIntervalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntervalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_IntervalClass(), newIntervalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup() {
		if (unaryFunctionalClassGroup == null) {
			unaryFunctionalClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP);
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
		return (UnaryFunctionalClassType)getUnaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryFunctionalClass(UnaryFunctionalClassType newUnaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryFunctionalClass(), newUnaryFunctionalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup() {
		if (lambdaClassGroup == null) {
			lambdaClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP);
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
		return (LambdaClassType)getLambdaClassGroup().get(MlPackage.eINSTANCE.getPieceType_LambdaClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaClass(LambdaClassType newLambdaClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLambdaClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_LambdaClass(), newLambdaClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup() {
		if (naryFunctionalClassGroup == null) {
			naryFunctionalClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP);
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
		return (NaryFunctionalClassType)getNaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryFunctionalClass(NaryFunctionalClassType newNaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryFunctionalClass(), newNaryFunctionalClass, msgs);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__QUOTIENT, oldQuotient, newQuotient);
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
				msgs = ((InternalEObject)quotient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__QUOTIENT, null, msgs);
			if (newQuotient != null)
				msgs = ((InternalEObject)newQuotient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__QUOTIENT, null, msgs);
			msgs = basicSetQuotient(newQuotient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__QUOTIENT, newQuotient, newQuotient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__DIVIDE, oldDivide, newDivide);
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
				msgs = ((InternalEObject)divide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__DIVIDE, null, msgs);
			if (newDivide != null)
				msgs = ((InternalEObject)newDivide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__DIVIDE, null, msgs);
			msgs = basicSetDivide(newDivide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__DIVIDE, newDivide, newDivide));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__MINUS, oldMinus, newMinus);
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
				msgs = ((InternalEObject)minus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__MINUS, null, msgs);
			if (newMinus != null)
				msgs = ((InternalEObject)newMinus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__MINUS, null, msgs);
			msgs = basicSetMinus(newMinus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__MINUS, newMinus, newMinus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__POWER, oldPower, newPower);
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
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__POWER, newPower, newPower));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REM, oldRem, newRem);
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
				msgs = ((InternalEObject)rem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REM, null, msgs);
			if (newRem != null)
				msgs = ((InternalEObject)newRem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REM, null, msgs);
			msgs = basicSetRem(newRem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REM, newRem, newRem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ROOT, oldRoot, newRoot);
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
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ROOT, newRoot, newRoot));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FACTORIAL, oldFactorial, newFactorial);
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
				msgs = ((InternalEObject)factorial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FACTORIAL, null, msgs);
			if (newFactorial != null)
				msgs = ((InternalEObject)newFactorial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FACTORIAL, null, msgs);
			msgs = basicSetFactorial(newFactorial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FACTORIAL, newFactorial, newFactorial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ABS, oldAbs, newAbs);
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
				msgs = ((InternalEObject)abs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ABS, null, msgs);
			if (newAbs != null)
				msgs = ((InternalEObject)newAbs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ABS, null, msgs);
			msgs = basicSetAbs(newAbs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ABS, newAbs, newAbs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CONJUGATE, oldConjugate, newConjugate);
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
				msgs = ((InternalEObject)conjugate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CONJUGATE, null, msgs);
			if (newConjugate != null)
				msgs = ((InternalEObject)newConjugate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CONJUGATE, null, msgs);
			msgs = basicSetConjugate(newConjugate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CONJUGATE, newConjugate, newConjugate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ARG, oldArg, newArg);
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
				msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ARG, null, msgs);
			if (newArg != null)
				msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ARG, null, msgs);
			msgs = basicSetArg(newArg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ARG, newArg, newArg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REAL, oldReal, newReal);
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
				msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REAL, null, msgs);
			if (newReal != null)
				msgs = ((InternalEObject)newReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REAL, null, msgs);
			msgs = basicSetReal(newReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REAL, newReal, newReal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__IMAGINARY, oldImaginary, newImaginary);
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
				msgs = ((InternalEObject)imaginary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__IMAGINARY, null, msgs);
			if (newImaginary != null)
				msgs = ((InternalEObject)newImaginary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__IMAGINARY, null, msgs);
			msgs = basicSetImaginary(newImaginary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__IMAGINARY, newImaginary, newImaginary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FLOOR, oldFloor, newFloor);
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
				msgs = ((InternalEObject)floor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FLOOR, null, msgs);
			if (newFloor != null)
				msgs = ((InternalEObject)newFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FLOOR, null, msgs);
			msgs = basicSetFloor(newFloor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FLOOR, newFloor, newFloor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CEILING, oldCeiling, newCeiling);
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
				msgs = ((InternalEObject)ceiling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CEILING, null, msgs);
			if (newCeiling != null)
				msgs = ((InternalEObject)newCeiling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CEILING, null, msgs);
			msgs = basicSetCeiling(newCeiling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CEILING, newCeiling, newCeiling));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__EXP, oldExp, newExp);
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
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup() {
		if (naryMinmaxClassGroup == null) {
			naryMinmaxClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP);
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
		return (NaryMinmaxClassType)getNaryMinmaxClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryMinmaxClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryMinmaxClass(NaryMinmaxClassType newNaryMinmaxClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryMinmaxClass(), newNaryMinmaxClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup() {
		if (naryArithClassGroup == null) {
			naryArithClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP);
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
		return (NaryArithClassType)getNaryArithClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryArithClass(NaryArithClassType newNaryArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryArithClass(), newNaryArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup() {
		if (naryLogicalClassGroup == null) {
			naryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP);
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
		return (NaryLogicalClassType)getNaryLogicalClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLogicalClass(NaryLogicalClassType newNaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryLogicalClass(), newNaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup() {
		if (unaryLogicalClassGroup == null) {
			unaryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP);
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
		return (UnaryLogicalClassType)getUnaryLogicalClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLogicalClass(UnaryLogicalClassType newUnaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryLogicalClass(), newUnaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup() {
		if (binaryLogicalClassGroup == null) {
			binaryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP);
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
		return (BinaryLogicalClassType)getBinaryLogicalClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLogicalClass(BinaryLogicalClassType newBinaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinaryLogicalClass(), newBinaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup() {
		if (quantifierClassGroup == null) {
			quantifierClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP);
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
		return (QuantifierClassType)getQuantifierClassGroup().get(MlPackage.eINSTANCE.getPieceType_QuantifierClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifierClass(QuantifierClassType newQuantifierClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getQuantifierClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_QuantifierClass(), newQuantifierClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup() {
		if (naryRelnClassGroup == null) {
			naryRelnClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP);
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
		return (NaryRelnClassType)getNaryRelnClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryRelnClass(NaryRelnClassType newNaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryRelnClass(), newNaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup() {
		if (binaryRelnClassGroup == null) {
			binaryRelnClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP);
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
		return (EObject)getBinaryRelnClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryRelnClass(EObject newBinaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinaryRelnClass(), newBinaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup() {
		if (intClassGroup == null) {
			intClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__INT_CLASS_GROUP);
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
		return (IntClassType)getIntClassGroup().get(MlPackage.eINSTANCE.getPieceType_IntClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntClass(IntClassType newIntClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_IntClass(), newIntClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup() {
		if (differentialOperatorClassGroup == null) {
			differentialOperatorClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP);
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
		return (DifferentialOperatorClassType)getDifferentialOperatorClassGroup().get(MlPackage.eINSTANCE.getPieceType_DifferentialOperatorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferentialOperatorClass(DifferentialOperatorClassType newDifferentialOperatorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_DifferentialOperatorClass(), newDifferentialOperatorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup() {
		if (partialdiffClassGroup == null) {
			partialdiffClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP);
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
		return (PartialdiffClassType)getPartialdiffClassGroup().get(MlPackage.eINSTANCE.getPieceType_PartialdiffClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialdiffClass(PartialdiffClassType newPartialdiffClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPartialdiffClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_PartialdiffClass(), newPartialdiffClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup() {
		if (unaryVeccalcClassGroup == null) {
			unaryVeccalcClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP);
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
		return (UnaryVeccalcClassType)getUnaryVeccalcClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryVeccalcClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryVeccalcClass(UnaryVeccalcClassType newUnaryVeccalcClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryVeccalcClass(), newUnaryVeccalcClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup() {
		if (narySetlistConstructorClassGroup == null) {
			narySetlistConstructorClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP);
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
		return (EObject)getNarySetlistConstructorClassGroup().get(MlPackage.eINSTANCE.getPieceType_NarySetlistConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetlistConstructorClass(EObject newNarySetlistConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NarySetlistConstructorClass(), newNarySetlistConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup() {
		if (narySetClassGroup == null) {
			narySetClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP);
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
		return (NarySetClassType)getNarySetClassGroup().get(MlPackage.eINSTANCE.getPieceType_NarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetClass(NarySetClassType newNarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NarySetClass(), newNarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup() {
		if (binarySetClassGroup == null) {
			binarySetClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP);
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
		return (BinarySetClassType)getBinarySetClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySetClass(BinarySetClassType newBinarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinarySetClass(), newBinarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup() {
		if (narySetRelnClassGroup == null) {
			narySetRelnClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP);
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
		return (NarySetRelnClassType)getNarySetRelnClassGroup().get(MlPackage.eINSTANCE.getPieceType_NarySetRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetRelnClass(NarySetRelnClassType newNarySetRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NarySetRelnClass(), newNarySetRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup() {
		if (unarySetClassGroup == null) {
			unarySetClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP);
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
		return (UnarySetClassType)getUnarySetClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnarySetClass(UnarySetClassType newUnarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnarySetClass(), newUnarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup() {
		if (sumClassGroup == null) {
			sumClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__SUM_CLASS_GROUP);
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
		return (SumClassType)getSumClassGroup().get(MlPackage.eINSTANCE.getPieceType_SumClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSumClass(SumClassType newSumClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSumClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_SumClass(), newSumClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup() {
		if (productClassGroup == null) {
			productClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP);
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
		return (ProductClassType)getProductClassGroup().get(MlPackage.eINSTANCE.getPieceType_ProductClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductClass(ProductClassType newProductClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProductClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_ProductClass(), newProductClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup() {
		if (limitClassGroup == null) {
			limitClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP);
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
		return (LimitClassType)getLimitClassGroup().get(MlPackage.eINSTANCE.getPieceType_LimitClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitClass(LimitClassType newLimitClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLimitClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_LimitClass(), newLimitClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup() {
		if (unaryElementaryClassGroup == null) {
			unaryElementaryClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP);
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
		return (UnaryElementaryClassType)getUnaryElementaryClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryElementaryClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryElementaryClass(UnaryElementaryClassType newUnaryElementaryClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryElementaryClass(), newUnaryElementaryClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup() {
		if (naryStatsClassGroup == null) {
			naryStatsClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP);
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
		return (NaryStatsClassType)getNaryStatsClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryStatsClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryStatsClass(NaryStatsClassType newNaryStatsClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryStatsClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryStatsClass(), newNaryStatsClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup() {
		if (naryConstructorClassGroup == null) {
			naryConstructorClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP);
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
		return (NaryConstructorClassType)getNaryConstructorClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryConstructorClass(NaryConstructorClassType newNaryConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryConstructorClass(), newNaryConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup() {
		if (unaryLinalgClassGroup == null) {
			unaryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP);
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
		return (UnaryLinalgClassType)getUnaryLinalgClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLinalgClass(UnaryLinalgClassType newUnaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryLinalgClass(), newUnaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup() {
		if (naryLinalgClassGroup == null) {
			naryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP);
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
		return (NaryLinalgClassType)getNaryLinalgClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLinalgClass(NaryLinalgClassType newNaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryLinalgClass(), newNaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup() {
		if (binaryLinalgClassGroup == null) {
			binaryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP);
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
		return (BinaryLinalgClassType)getBinaryLinalgClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLinalgClass(BinaryLinalgClassType newBinaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinaryLinalgClass(), newBinaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup() {
		if (constantSetClassGroup == null) {
			constantSetClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP);
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
		return (ConstantSetClassType)getConstantSetClassGroup().get(MlPackage.eINSTANCE.getPieceType_ConstantSetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantSetClass(ConstantSetClassType newConstantSetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantSetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_ConstantSetClass(), newConstantSetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup() {
		if (constantArithClassGroup == null) {
			constantArithClassGroup = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP);
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
		return (ConstantArithClassType)getConstantArithClassGroup().get(MlPackage.eINSTANCE.getPieceType_ConstantArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantArithClass(ConstantArithClassType newConstantArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_ConstantArithClass(), newConstantArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplyType getApply1() {
		return apply1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApply1(ApplyType newApply1, NotificationChain msgs) {
		ApplyType oldApply1 = apply1;
		apply1 = newApply1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__APPLY1, oldApply1, newApply1);
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
	public void setApply1(ApplyType newApply1) {
		if (newApply1 != apply1) {
			NotificationChain msgs = null;
			if (apply1 != null)
				msgs = ((InternalEObject)apply1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__APPLY1, null, msgs);
			if (newApply1 != null)
				msgs = ((InternalEObject)newApply1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__APPLY1, null, msgs);
			msgs = basicSetApply1(newApply1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__APPLY1, newApply1, newApply1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindType getBind1() {
		return bind1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBind1(BindType newBind1, NotificationChain msgs) {
		BindType oldBind1 = bind1;
		bind1 = newBind1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__BIND1, oldBind1, newBind1);
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
	public void setBind1(BindType newBind1) {
		if (newBind1 != bind1) {
			NotificationChain msgs = null;
			if (bind1 != null)
				msgs = ((InternalEObject)bind1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__BIND1, null, msgs);
			if (newBind1 != null)
				msgs = ((InternalEObject)newBind1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__BIND1, null, msgs);
			msgs = basicSetBind1(newBind1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__BIND1, newBind1, newBind1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiType getCi1() {
		return ci1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCi1(CiType newCi1, NotificationChain msgs) {
		CiType oldCi1 = ci1;
		ci1 = newCi1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CI1, oldCi1, newCi1);
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
	public void setCi1(CiType newCi1) {
		if (newCi1 != ci1) {
			NotificationChain msgs = null;
			if (ci1 != null)
				msgs = ((InternalEObject)ci1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CI1, null, msgs);
			if (newCi1 != null)
				msgs = ((InternalEObject)newCi1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CI1, null, msgs);
			msgs = basicSetCi1(newCi1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CI1, newCi1, newCi1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnType getCn1() {
		return cn1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCn1(CnType newCn1, NotificationChain msgs) {
		CnType oldCn1 = cn1;
		cn1 = newCn1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CN1, oldCn1, newCn1);
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
	public void setCn1(CnType newCn1) {
		if (newCn1 != cn1) {
			NotificationChain msgs = null;
			if (cn1 != null)
				msgs = ((InternalEObject)cn1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CN1, null, msgs);
			if (newCn1 != null)
				msgs = ((InternalEObject)newCn1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CN1, null, msgs);
			msgs = basicSetCn1(newCn1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CN1, newCn1, newCn1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsymbolType getCsymbol1() {
		return csymbol1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsymbol1(CsymbolType newCsymbol1, NotificationChain msgs) {
		CsymbolType oldCsymbol1 = csymbol1;
		csymbol1 = newCsymbol1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CSYMBOL1, oldCsymbol1, newCsymbol1);
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
	public void setCsymbol1(CsymbolType newCsymbol1) {
		if (newCsymbol1 != csymbol1) {
			NotificationChain msgs = null;
			if (csymbol1 != null)
				msgs = ((InternalEObject)csymbol1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CSYMBOL1, null, msgs);
			if (newCsymbol1 != null)
				msgs = ((InternalEObject)newCsymbol1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CSYMBOL1, null, msgs);
			msgs = basicSetCsymbol1(newCsymbol1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CSYMBOL1, newCsymbol1, newCsymbol1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CbytesType getCbytes1() {
		return cbytes1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCbytes1(CbytesType newCbytes1, NotificationChain msgs) {
		CbytesType oldCbytes1 = cbytes1;
		cbytes1 = newCbytes1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CBYTES1, oldCbytes1, newCbytes1);
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
	public void setCbytes1(CbytesType newCbytes1) {
		if (newCbytes1 != cbytes1) {
			NotificationChain msgs = null;
			if (cbytes1 != null)
				msgs = ((InternalEObject)cbytes1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CBYTES1, null, msgs);
			if (newCbytes1 != null)
				msgs = ((InternalEObject)newCbytes1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CBYTES1, null, msgs);
			msgs = basicSetCbytes1(newCbytes1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CBYTES1, newCbytes1, newCbytes1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CerrorType getCerror1() {
		return cerror1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCerror1(CerrorType newCerror1, NotificationChain msgs) {
		CerrorType oldCerror1 = cerror1;
		cerror1 = newCerror1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CERROR1, oldCerror1, newCerror1);
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
	public void setCerror1(CerrorType newCerror1) {
		if (newCerror1 != cerror1) {
			NotificationChain msgs = null;
			if (cerror1 != null)
				msgs = ((InternalEObject)cerror1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CERROR1, null, msgs);
			if (newCerror1 != null)
				msgs = ((InternalEObject)newCerror1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CERROR1, null, msgs);
			msgs = basicSetCerror1(newCerror1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CERROR1, newCerror1, newCerror1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsType getCs1() {
		return cs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCs1(CsType newCs1, NotificationChain msgs) {
		CsType oldCs1 = cs1;
		cs1 = newCs1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CS1, oldCs1, newCs1);
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
	public void setCs1(CsType newCs1) {
		if (newCs1 != cs1) {
			NotificationChain msgs = null;
			if (cs1 != null)
				msgs = ((InternalEObject)cs1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CS1, null, msgs);
			if (newCs1 != null)
				msgs = ((InternalEObject)newCs1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CS1, null, msgs);
			msgs = basicSetCs1(newCs1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CS1, newCs1, newCs1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShareType getShare1() {
		return share1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShare1(ShareType newShare1, NotificationChain msgs) {
		ShareType oldShare1 = share1;
		share1 = newShare1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__SHARE1, oldShare1, newShare1);
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
	public void setShare1(ShareType newShare1) {
		if (newShare1 != share1) {
			NotificationChain msgs = null;
			if (share1 != null)
				msgs = ((InternalEObject)share1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__SHARE1, null, msgs);
			if (newShare1 != null)
				msgs = ((InternalEObject)newShare1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__SHARE1, null, msgs);
			msgs = basicSetShare1(newShare1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__SHARE1, newShare1, newShare1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PiecewiseType getPiecewise1() {
		return piecewise1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiecewise1(PiecewiseType newPiecewise1, NotificationChain msgs) {
		PiecewiseType oldPiecewise1 = piecewise1;
		piecewise1 = newPiecewise1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__PIECEWISE1, oldPiecewise1, newPiecewise1);
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
	public void setPiecewise1(PiecewiseType newPiecewise1) {
		if (newPiecewise1 != piecewise1) {
			NotificationChain msgs = null;
			if (piecewise1 != null)
				msgs = ((InternalEObject)piecewise1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__PIECEWISE1, null, msgs);
			if (newPiecewise1 != null)
				msgs = ((InternalEObject)newPiecewise1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__PIECEWISE1, null, msgs);
			msgs = basicSetPiecewise1(newPiecewise1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__PIECEWISE1, newPiecewise1, newPiecewise1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup1() {
		if (deprecatedContExpGroup1 == null) {
			deprecatedContExpGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP1);
		}
		return deprecatedContExpGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDeprecatedContExp1() {
		return (EObject)getDeprecatedContExpGroup().get(MlPackage.eINSTANCE.getPieceType_DeprecatedContExp1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecatedContExp1(EObject newDeprecatedContExp1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDeprecatedContExpGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_DeprecatedContExp1(), newDeprecatedContExp1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup1() {
		if (intervalClassGroup1 == null) {
			intervalClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP1);
		}
		return intervalClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervalClassType getIntervalClass1() {
		return (IntervalClassType)getIntervalClassGroup().get(MlPackage.eINSTANCE.getPieceType_IntervalClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalClass1(IntervalClassType newIntervalClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntervalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_IntervalClass1(), newIntervalClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup1() {
		if (unaryFunctionalClassGroup1 == null) {
			unaryFunctionalClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP1);
		}
		return unaryFunctionalClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getUnaryFunctionalClass1() {
		return (UnaryFunctionalClassType)getUnaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryFunctionalClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryFunctionalClass1(UnaryFunctionalClassType newUnaryFunctionalClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryFunctionalClass1(), newUnaryFunctionalClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup1() {
		if (lambdaClassGroup1 == null) {
			lambdaClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP1);
		}
		return lambdaClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaClassType getLambdaClass1() {
		return (LambdaClassType)getLambdaClassGroup().get(MlPackage.eINSTANCE.getPieceType_LambdaClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaClass1(LambdaClassType newLambdaClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLambdaClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_LambdaClass1(), newLambdaClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup1() {
		if (naryFunctionalClassGroup1 == null) {
			naryFunctionalClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP1);
		}
		return naryFunctionalClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryFunctionalClassType getNaryFunctionalClass1() {
		return (NaryFunctionalClassType)getNaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryFunctionalClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryFunctionalClass1(NaryFunctionalClassType newNaryFunctionalClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryFunctionalClass1(), newNaryFunctionalClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuotientType getQuotient1() {
		return quotient1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuotient1(QuotientType newQuotient1, NotificationChain msgs) {
		QuotientType oldQuotient1 = quotient1;
		quotient1 = newQuotient1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__QUOTIENT1, oldQuotient1, newQuotient1);
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
	public void setQuotient1(QuotientType newQuotient1) {
		if (newQuotient1 != quotient1) {
			NotificationChain msgs = null;
			if (quotient1 != null)
				msgs = ((InternalEObject)quotient1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__QUOTIENT1, null, msgs);
			if (newQuotient1 != null)
				msgs = ((InternalEObject)newQuotient1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__QUOTIENT1, null, msgs);
			msgs = basicSetQuotient1(newQuotient1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__QUOTIENT1, newQuotient1, newQuotient1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivideType getDivide1() {
		return divide1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivide1(DivideType newDivide1, NotificationChain msgs) {
		DivideType oldDivide1 = divide1;
		divide1 = newDivide1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__DIVIDE1, oldDivide1, newDivide1);
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
	public void setDivide1(DivideType newDivide1) {
		if (newDivide1 != divide1) {
			NotificationChain msgs = null;
			if (divide1 != null)
				msgs = ((InternalEObject)divide1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__DIVIDE1, null, msgs);
			if (newDivide1 != null)
				msgs = ((InternalEObject)newDivide1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__DIVIDE1, null, msgs);
			msgs = basicSetDivide1(newDivide1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__DIVIDE1, newDivide1, newDivide1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinusType getMinus1() {
		return minus1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinus1(MinusType newMinus1, NotificationChain msgs) {
		MinusType oldMinus1 = minus1;
		minus1 = newMinus1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__MINUS1, oldMinus1, newMinus1);
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
	public void setMinus1(MinusType newMinus1) {
		if (newMinus1 != minus1) {
			NotificationChain msgs = null;
			if (minus1 != null)
				msgs = ((InternalEObject)minus1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__MINUS1, null, msgs);
			if (newMinus1 != null)
				msgs = ((InternalEObject)newMinus1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__MINUS1, null, msgs);
			msgs = basicSetMinus1(newMinus1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__MINUS1, newMinus1, newMinus1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getPower1() {
		return power1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower1(PowerType newPower1, NotificationChain msgs) {
		PowerType oldPower1 = power1;
		power1 = newPower1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__POWER1, oldPower1, newPower1);
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
	public void setPower1(PowerType newPower1) {
		if (newPower1 != power1) {
			NotificationChain msgs = null;
			if (power1 != null)
				msgs = ((InternalEObject)power1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__POWER1, null, msgs);
			if (newPower1 != null)
				msgs = ((InternalEObject)newPower1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__POWER1, null, msgs);
			msgs = basicSetPower1(newPower1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__POWER1, newPower1, newPower1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemType getRem1() {
		return rem1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRem1(RemType newRem1, NotificationChain msgs) {
		RemType oldRem1 = rem1;
		rem1 = newRem1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REM1, oldRem1, newRem1);
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
	public void setRem1(RemType newRem1) {
		if (newRem1 != rem1) {
			NotificationChain msgs = null;
			if (rem1 != null)
				msgs = ((InternalEObject)rem1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REM1, null, msgs);
			if (newRem1 != null)
				msgs = ((InternalEObject)newRem1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REM1, null, msgs);
			msgs = basicSetRem1(newRem1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REM1, newRem1, newRem1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootType getRoot1() {
		return root1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot1(RootType newRoot1, NotificationChain msgs) {
		RootType oldRoot1 = root1;
		root1 = newRoot1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ROOT1, oldRoot1, newRoot1);
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
	public void setRoot1(RootType newRoot1) {
		if (newRoot1 != root1) {
			NotificationChain msgs = null;
			if (root1 != null)
				msgs = ((InternalEObject)root1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ROOT1, null, msgs);
			if (newRoot1 != null)
				msgs = ((InternalEObject)newRoot1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ROOT1, null, msgs);
			msgs = basicSetRoot1(newRoot1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ROOT1, newRoot1, newRoot1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FactorialType getFactorial1() {
		return factorial1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactorial1(FactorialType newFactorial1, NotificationChain msgs) {
		FactorialType oldFactorial1 = factorial1;
		factorial1 = newFactorial1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FACTORIAL1, oldFactorial1, newFactorial1);
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
	public void setFactorial1(FactorialType newFactorial1) {
		if (newFactorial1 != factorial1) {
			NotificationChain msgs = null;
			if (factorial1 != null)
				msgs = ((InternalEObject)factorial1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FACTORIAL1, null, msgs);
			if (newFactorial1 != null)
				msgs = ((InternalEObject)newFactorial1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FACTORIAL1, null, msgs);
			msgs = basicSetFactorial1(newFactorial1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FACTORIAL1, newFactorial1, newFactorial1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsType getAbs1() {
		return abs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbs1(AbsType newAbs1, NotificationChain msgs) {
		AbsType oldAbs1 = abs1;
		abs1 = newAbs1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ABS1, oldAbs1, newAbs1);
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
	public void setAbs1(AbsType newAbs1) {
		if (newAbs1 != abs1) {
			NotificationChain msgs = null;
			if (abs1 != null)
				msgs = ((InternalEObject)abs1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ABS1, null, msgs);
			if (newAbs1 != null)
				msgs = ((InternalEObject)newAbs1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ABS1, null, msgs);
			msgs = basicSetAbs1(newAbs1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ABS1, newAbs1, newAbs1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugateType getConjugate1() {
		return conjugate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjugate1(ConjugateType newConjugate1, NotificationChain msgs) {
		ConjugateType oldConjugate1 = conjugate1;
		conjugate1 = newConjugate1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CONJUGATE1, oldConjugate1, newConjugate1);
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
	public void setConjugate1(ConjugateType newConjugate1) {
		if (newConjugate1 != conjugate1) {
			NotificationChain msgs = null;
			if (conjugate1 != null)
				msgs = ((InternalEObject)conjugate1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CONJUGATE1, null, msgs);
			if (newConjugate1 != null)
				msgs = ((InternalEObject)newConjugate1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CONJUGATE1, null, msgs);
			msgs = basicSetConjugate1(newConjugate1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CONJUGATE1, newConjugate1, newConjugate1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgType getArg1() {
		return arg1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArg1(ArgType newArg1, NotificationChain msgs) {
		ArgType oldArg1 = arg1;
		arg1 = newArg1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ARG1, oldArg1, newArg1);
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
	public void setArg1(ArgType newArg1) {
		if (newArg1 != arg1) {
			NotificationChain msgs = null;
			if (arg1 != null)
				msgs = ((InternalEObject)arg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ARG1, null, msgs);
			if (newArg1 != null)
				msgs = ((InternalEObject)newArg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__ARG1, null, msgs);
			msgs = basicSetArg1(newArg1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ARG1, newArg1, newArg1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealType getReal1() {
		return real1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReal1(RealType newReal1, NotificationChain msgs) {
		RealType oldReal1 = real1;
		real1 = newReal1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REAL1, oldReal1, newReal1);
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
	public void setReal1(RealType newReal1) {
		if (newReal1 != real1) {
			NotificationChain msgs = null;
			if (real1 != null)
				msgs = ((InternalEObject)real1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REAL1, null, msgs);
			if (newReal1 != null)
				msgs = ((InternalEObject)newReal1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__REAL1, null, msgs);
			msgs = basicSetReal1(newReal1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__REAL1, newReal1, newReal1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImaginaryType getImaginary1() {
		return imaginary1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImaginary1(ImaginaryType newImaginary1, NotificationChain msgs) {
		ImaginaryType oldImaginary1 = imaginary1;
		imaginary1 = newImaginary1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__IMAGINARY1, oldImaginary1, newImaginary1);
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
	public void setImaginary1(ImaginaryType newImaginary1) {
		if (newImaginary1 != imaginary1) {
			NotificationChain msgs = null;
			if (imaginary1 != null)
				msgs = ((InternalEObject)imaginary1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__IMAGINARY1, null, msgs);
			if (newImaginary1 != null)
				msgs = ((InternalEObject)newImaginary1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__IMAGINARY1, null, msgs);
			msgs = basicSetImaginary1(newImaginary1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__IMAGINARY1, newImaginary1, newImaginary1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorType getFloor1() {
		return floor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloor1(FloorType newFloor1, NotificationChain msgs) {
		FloorType oldFloor1 = floor1;
		floor1 = newFloor1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FLOOR1, oldFloor1, newFloor1);
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
	public void setFloor1(FloorType newFloor1) {
		if (newFloor1 != floor1) {
			NotificationChain msgs = null;
			if (floor1 != null)
				msgs = ((InternalEObject)floor1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FLOOR1, null, msgs);
			if (newFloor1 != null)
				msgs = ((InternalEObject)newFloor1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__FLOOR1, null, msgs);
			msgs = basicSetFloor1(newFloor1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__FLOOR1, newFloor1, newFloor1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CeilingType getCeiling1() {
		return ceiling1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCeiling1(CeilingType newCeiling1, NotificationChain msgs) {
		CeilingType oldCeiling1 = ceiling1;
		ceiling1 = newCeiling1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CEILING1, oldCeiling1, newCeiling1);
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
	public void setCeiling1(CeilingType newCeiling1) {
		if (newCeiling1 != ceiling1) {
			NotificationChain msgs = null;
			if (ceiling1 != null)
				msgs = ((InternalEObject)ceiling1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CEILING1, null, msgs);
			if (newCeiling1 != null)
				msgs = ((InternalEObject)newCeiling1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__CEILING1, null, msgs);
			msgs = basicSetCeiling1(newCeiling1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CEILING1, newCeiling1, newCeiling1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpType getExp1() {
		return exp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp1(ExpType newExp1, NotificationChain msgs) {
		ExpType oldExp1 = exp1;
		exp1 = newExp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__EXP1, oldExp1, newExp1);
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
	public void setExp1(ExpType newExp1) {
		if (newExp1 != exp1) {
			NotificationChain msgs = null;
			if (exp1 != null)
				msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__EXP1, null, msgs);
			if (newExp1 != null)
				msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.PIECE_TYPE__EXP1, null, msgs);
			msgs = basicSetExp1(newExp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__EXP1, newExp1, newExp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup1() {
		if (naryMinmaxClassGroup1 == null) {
			naryMinmaxClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP1);
		}
		return naryMinmaxClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryMinmaxClassType getNaryMinmaxClass1() {
		return (NaryMinmaxClassType)getNaryMinmaxClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryMinmaxClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryMinmaxClass1(NaryMinmaxClassType newNaryMinmaxClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryMinmaxClass1(), newNaryMinmaxClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup1() {
		if (naryArithClassGroup1 == null) {
			naryArithClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP1);
		}
		return naryArithClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getNaryArithClass1() {
		return (NaryArithClassType)getNaryArithClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryArithClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryArithClass1(NaryArithClassType newNaryArithClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryArithClass1(), newNaryArithClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup1() {
		if (naryLogicalClassGroup1 == null) {
			naryLogicalClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP1);
		}
		return naryLogicalClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType getNaryLogicalClass1() {
		return (NaryLogicalClassType)getNaryLogicalClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryLogicalClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLogicalClass1(NaryLogicalClassType newNaryLogicalClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryLogicalClass1(), newNaryLogicalClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup1() {
		if (unaryLogicalClassGroup1 == null) {
			unaryLogicalClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP1);
		}
		return unaryLogicalClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicalClassType getUnaryLogicalClass1() {
		return (UnaryLogicalClassType)getUnaryLogicalClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryLogicalClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLogicalClass1(UnaryLogicalClassType newUnaryLogicalClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryLogicalClass1(), newUnaryLogicalClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup1() {
		if (binaryLogicalClassGroup1 == null) {
			binaryLogicalClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP1);
		}
		return binaryLogicalClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalClassType getBinaryLogicalClass1() {
		return (BinaryLogicalClassType)getBinaryLogicalClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinaryLogicalClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLogicalClass1(BinaryLogicalClassType newBinaryLogicalClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinaryLogicalClass1(), newBinaryLogicalClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup1() {
		if (quantifierClassGroup1 == null) {
			quantifierClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP1);
		}
		return quantifierClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierClassType getQuantifierClass1() {
		return (QuantifierClassType)getQuantifierClassGroup().get(MlPackage.eINSTANCE.getPieceType_QuantifierClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifierClass1(QuantifierClassType newQuantifierClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getQuantifierClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_QuantifierClass1(), newQuantifierClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup1() {
		if (naryRelnClassGroup1 == null) {
			naryRelnClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP1);
		}
		return naryRelnClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getNaryRelnClass1() {
		return (NaryRelnClassType)getNaryRelnClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryRelnClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryRelnClass1(NaryRelnClassType newNaryRelnClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryRelnClass1(), newNaryRelnClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup1() {
		if (binaryRelnClassGroup1 == null) {
			binaryRelnClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP1);
		}
		return binaryRelnClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getBinaryRelnClass1() {
		return (EObject)getBinaryRelnClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinaryRelnClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryRelnClass1(EObject newBinaryRelnClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinaryRelnClass1(), newBinaryRelnClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup1() {
		if (intClassGroup1 == null) {
			intClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__INT_CLASS_GROUP1);
		}
		return intClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntClassType getIntClass1() {
		return (IntClassType)getIntClassGroup().get(MlPackage.eINSTANCE.getPieceType_IntClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntClass1(IntClassType newIntClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_IntClass1(), newIntClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup1() {
		if (differentialOperatorClassGroup1 == null) {
			differentialOperatorClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP1);
		}
		return differentialOperatorClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferentialOperatorClassType getDifferentialOperatorClass1() {
		return (DifferentialOperatorClassType)getDifferentialOperatorClassGroup().get(MlPackage.eINSTANCE.getPieceType_DifferentialOperatorClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferentialOperatorClass1(DifferentialOperatorClassType newDifferentialOperatorClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_DifferentialOperatorClass1(), newDifferentialOperatorClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup1() {
		if (partialdiffClassGroup1 == null) {
			partialdiffClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP1);
		}
		return partialdiffClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialdiffClassType getPartialdiffClass1() {
		return (PartialdiffClassType)getPartialdiffClassGroup().get(MlPackage.eINSTANCE.getPieceType_PartialdiffClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialdiffClass1(PartialdiffClassType newPartialdiffClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPartialdiffClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_PartialdiffClass1(), newPartialdiffClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup1() {
		if (unaryVeccalcClassGroup1 == null) {
			unaryVeccalcClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP1);
		}
		return unaryVeccalcClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getUnaryVeccalcClass1() {
		return (UnaryVeccalcClassType)getUnaryVeccalcClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryVeccalcClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryVeccalcClass1(UnaryVeccalcClassType newUnaryVeccalcClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryVeccalcClass1(), newUnaryVeccalcClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup1() {
		if (narySetlistConstructorClassGroup1 == null) {
			narySetlistConstructorClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1);
		}
		return narySetlistConstructorClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getNarySetlistConstructorClass1() {
		return (EObject)getNarySetlistConstructorClassGroup().get(MlPackage.eINSTANCE.getPieceType_NarySetlistConstructorClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetlistConstructorClass1(EObject newNarySetlistConstructorClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NarySetlistConstructorClass1(), newNarySetlistConstructorClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup1() {
		if (narySetClassGroup1 == null) {
			narySetClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP1);
		}
		return narySetClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType getNarySetClass1() {
		return (NarySetClassType)getNarySetClassGroup().get(MlPackage.eINSTANCE.getPieceType_NarySetClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetClass1(NarySetClassType newNarySetClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NarySetClass1(), newNarySetClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup1() {
		if (binarySetClassGroup1 == null) {
			binarySetClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP1);
		}
		return binarySetClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getBinarySetClass1() {
		return (BinarySetClassType)getBinarySetClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinarySetClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySetClass1(BinarySetClassType newBinarySetClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinarySetClass1(), newBinarySetClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup1() {
		if (narySetRelnClassGroup1 == null) {
			narySetRelnClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP1);
		}
		return narySetRelnClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetRelnClassType getNarySetRelnClass1() {
		return (NarySetRelnClassType)getNarySetRelnClassGroup().get(MlPackage.eINSTANCE.getPieceType_NarySetRelnClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetRelnClass1(NarySetRelnClassType newNarySetRelnClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NarySetRelnClass1(), newNarySetRelnClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup1() {
		if (unarySetClassGroup1 == null) {
			unarySetClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP1);
		}
		return unarySetClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnarySetClassType getUnarySetClass1() {
		return (UnarySetClassType)getUnarySetClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnarySetClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnarySetClass1(UnarySetClassType newUnarySetClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnarySetClass1(), newUnarySetClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup1() {
		if (sumClassGroup1 == null) {
			sumClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__SUM_CLASS_GROUP1);
		}
		return sumClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SumClassType getSumClass1() {
		return (SumClassType)getSumClassGroup().get(MlPackage.eINSTANCE.getPieceType_SumClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSumClass1(SumClassType newSumClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSumClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_SumClass1(), newSumClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup1() {
		if (productClassGroup1 == null) {
			productClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP1);
		}
		return productClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductClassType getProductClass1() {
		return (ProductClassType)getProductClassGroup().get(MlPackage.eINSTANCE.getPieceType_ProductClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductClass1(ProductClassType newProductClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProductClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_ProductClass1(), newProductClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup1() {
		if (limitClassGroup1 == null) {
			limitClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP1);
		}
		return limitClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LimitClassType getLimitClass1() {
		return (LimitClassType)getLimitClassGroup().get(MlPackage.eINSTANCE.getPieceType_LimitClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitClass1(LimitClassType newLimitClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLimitClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_LimitClass1(), newLimitClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup1() {
		if (unaryElementaryClassGroup1 == null) {
			unaryElementaryClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP1);
		}
		return unaryElementaryClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getUnaryElementaryClass1() {
		return (UnaryElementaryClassType)getUnaryElementaryClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryElementaryClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryElementaryClass1(UnaryElementaryClassType newUnaryElementaryClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryElementaryClass1(), newUnaryElementaryClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup1() {
		if (naryStatsClassGroup1 == null) {
			naryStatsClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP1);
		}
		return naryStatsClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getNaryStatsClass1() {
		return (NaryStatsClassType)getNaryStatsClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryStatsClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryStatsClass1(NaryStatsClassType newNaryStatsClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryStatsClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryStatsClass1(), newNaryStatsClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup1() {
		if (naryConstructorClassGroup1 == null) {
			naryConstructorClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP1);
		}
		return naryConstructorClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType getNaryConstructorClass1() {
		return (NaryConstructorClassType)getNaryConstructorClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryConstructorClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryConstructorClass1(NaryConstructorClassType newNaryConstructorClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryConstructorClass1(), newNaryConstructorClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup1() {
		if (unaryLinalgClassGroup1 == null) {
			unaryLinalgClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP1);
		}
		return unaryLinalgClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLinalgClassType getUnaryLinalgClass1() {
		return (UnaryLinalgClassType)getUnaryLinalgClassGroup().get(MlPackage.eINSTANCE.getPieceType_UnaryLinalgClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLinalgClass1(UnaryLinalgClassType newUnaryLinalgClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_UnaryLinalgClass1(), newUnaryLinalgClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup1() {
		if (naryLinalgClassGroup1 == null) {
			naryLinalgClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP1);
		}
		return naryLinalgClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLinalgClassType getNaryLinalgClass1() {
		return (NaryLinalgClassType)getNaryLinalgClassGroup().get(MlPackage.eINSTANCE.getPieceType_NaryLinalgClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLinalgClass1(NaryLinalgClassType newNaryLinalgClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_NaryLinalgClass1(), newNaryLinalgClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup1() {
		if (binaryLinalgClassGroup1 == null) {
			binaryLinalgClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP1);
		}
		return binaryLinalgClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType getBinaryLinalgClass1() {
		return (BinaryLinalgClassType)getBinaryLinalgClassGroup().get(MlPackage.eINSTANCE.getPieceType_BinaryLinalgClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLinalgClass1(BinaryLinalgClassType newBinaryLinalgClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_BinaryLinalgClass1(), newBinaryLinalgClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup1() {
		if (constantSetClassGroup1 == null) {
			constantSetClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP1);
		}
		return constantSetClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getConstantSetClass1() {
		return (ConstantSetClassType)getConstantSetClassGroup().get(MlPackage.eINSTANCE.getPieceType_ConstantSetClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantSetClass1(ConstantSetClassType newConstantSetClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantSetClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_ConstantSetClass1(), newConstantSetClass1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup1() {
		if (constantArithClassGroup1 == null) {
			constantArithClassGroup1 = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP1);
		}
		return constantArithClassGroup1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getConstantArithClass1() {
		return (ConstantArithClassType)getConstantArithClassGroup().get(MlPackage.eINSTANCE.getPieceType_ConstantArithClass1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantArithClass1(ConstantArithClassType newConstantArithClass1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getPieceType_ConstantArithClass1(), newConstantArithClass1, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__DEFINITION_URL, oldDefinitionURL, definitionURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ENCODING, oldEncoding, encoding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.PIECE_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.PIECE_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.PIECE_TYPE__APPLY:
				return basicSetApply(null, msgs);
			case MlPackage.PIECE_TYPE__BIND:
				return basicSetBind(null, msgs);
			case MlPackage.PIECE_TYPE__CI:
				return basicSetCi(null, msgs);
			case MlPackage.PIECE_TYPE__CN:
				return basicSetCn(null, msgs);
			case MlPackage.PIECE_TYPE__CSYMBOL:
				return basicSetCsymbol(null, msgs);
			case MlPackage.PIECE_TYPE__CBYTES:
				return basicSetCbytes(null, msgs);
			case MlPackage.PIECE_TYPE__CERROR:
				return basicSetCerror(null, msgs);
			case MlPackage.PIECE_TYPE__CS:
				return basicSetCs(null, msgs);
			case MlPackage.PIECE_TYPE__SHARE:
				return basicSetShare(null, msgs);
			case MlPackage.PIECE_TYPE__PIECEWISE:
				return basicSetPiecewise(null, msgs);
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return ((InternalEList<?>)getDeprecatedContExpGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP:
				return basicSetDeprecatedContExp(null, msgs);
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP:
				return ((InternalEList<?>)getIntervalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS:
				return basicSetIntervalClass(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS:
				return basicSetUnaryFunctionalClass(null, msgs);
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP:
				return ((InternalEList<?>)getLambdaClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS:
				return basicSetLambdaClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS:
				return basicSetNaryFunctionalClass(null, msgs);
			case MlPackage.PIECE_TYPE__QUOTIENT:
				return basicSetQuotient(null, msgs);
			case MlPackage.PIECE_TYPE__DIVIDE:
				return basicSetDivide(null, msgs);
			case MlPackage.PIECE_TYPE__MINUS:
				return basicSetMinus(null, msgs);
			case MlPackage.PIECE_TYPE__POWER:
				return basicSetPower(null, msgs);
			case MlPackage.PIECE_TYPE__REM:
				return basicSetRem(null, msgs);
			case MlPackage.PIECE_TYPE__ROOT:
				return basicSetRoot(null, msgs);
			case MlPackage.PIECE_TYPE__FACTORIAL:
				return basicSetFactorial(null, msgs);
			case MlPackage.PIECE_TYPE__ABS:
				return basicSetAbs(null, msgs);
			case MlPackage.PIECE_TYPE__CONJUGATE:
				return basicSetConjugate(null, msgs);
			case MlPackage.PIECE_TYPE__ARG:
				return basicSetArg(null, msgs);
			case MlPackage.PIECE_TYPE__REAL:
				return basicSetReal(null, msgs);
			case MlPackage.PIECE_TYPE__IMAGINARY:
				return basicSetImaginary(null, msgs);
			case MlPackage.PIECE_TYPE__FLOOR:
				return basicSetFloor(null, msgs);
			case MlPackage.PIECE_TYPE__CEILING:
				return basicSetCeiling(null, msgs);
			case MlPackage.PIECE_TYPE__EXP:
				return basicSetExp(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP:
				return ((InternalEList<?>)getNaryMinmaxClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS:
				return basicSetNaryMinmaxClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getNaryArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS:
				return basicSetNaryArithClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS:
				return basicSetNaryLogicalClass(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS:
				return basicSetUnaryLogicalClass(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS:
				return basicSetBinaryLogicalClass(null, msgs);
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP:
				return ((InternalEList<?>)getQuantifierClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS:
				return basicSetQuantifierClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS:
				return basicSetNaryRelnClass(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS:
				return basicSetBinaryRelnClass(null, msgs);
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP:
				return ((InternalEList<?>)getIntClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__INT_CLASS:
				return basicSetIntClass(null, msgs);
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return basicSetDifferentialOperatorClass(null, msgs);
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP:
				return ((InternalEList<?>)getPartialdiffClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS:
				return basicSetPartialdiffClass(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS:
				return basicSetUnaryVeccalcClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return basicSetNarySetlistConstructorClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS:
				return basicSetNarySetClass(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getBinarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS:
				return basicSetBinarySetClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS:
				return basicSetNarySetRelnClass(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getUnarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS:
				return basicSetUnarySetClass(null, msgs);
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP:
				return ((InternalEList<?>)getSumClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__SUM_CLASS:
				return basicSetSumClass(null, msgs);
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP:
				return ((InternalEList<?>)getProductClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS:
				return basicSetProductClass(null, msgs);
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP:
				return ((InternalEList<?>)getLimitClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__LIMIT_CLASS:
				return basicSetLimitClass(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryElementaryClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS:
				return basicSetUnaryElementaryClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP:
				return ((InternalEList<?>)getNaryStatsClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS:
				return basicSetNaryStatsClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNaryConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS:
				return basicSetNaryConstructorClass(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS:
				return basicSetUnaryLinalgClass(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS:
				return basicSetNaryLinalgClass(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS:
				return basicSetBinaryLinalgClass(null, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP:
				return ((InternalEList<?>)getConstantSetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS:
				return basicSetConstantSetClass(null, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getConstantArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS:
				return basicSetConstantArithClass(null, msgs);
			case MlPackage.PIECE_TYPE__APPLY1:
				return basicSetApply1(null, msgs);
			case MlPackage.PIECE_TYPE__BIND1:
				return basicSetBind1(null, msgs);
			case MlPackage.PIECE_TYPE__CI1:
				return basicSetCi1(null, msgs);
			case MlPackage.PIECE_TYPE__CN1:
				return basicSetCn1(null, msgs);
			case MlPackage.PIECE_TYPE__CSYMBOL1:
				return basicSetCsymbol1(null, msgs);
			case MlPackage.PIECE_TYPE__CBYTES1:
				return basicSetCbytes1(null, msgs);
			case MlPackage.PIECE_TYPE__CERROR1:
				return basicSetCerror1(null, msgs);
			case MlPackage.PIECE_TYPE__CS1:
				return basicSetCs1(null, msgs);
			case MlPackage.PIECE_TYPE__SHARE1:
				return basicSetShare1(null, msgs);
			case MlPackage.PIECE_TYPE__PIECEWISE1:
				return basicSetPiecewise1(null, msgs);
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP1:
				return ((InternalEList<?>)getDeprecatedContExpGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP1:
				return basicSetDeprecatedContExp1(null, msgs);
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP1:
				return ((InternalEList<?>)getIntervalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS1:
				return basicSetIntervalClass1(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS1:
				return basicSetUnaryFunctionalClass1(null, msgs);
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP1:
				return ((InternalEList<?>)getLambdaClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS1:
				return basicSetLambdaClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryFunctionalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS1:
				return basicSetNaryFunctionalClass1(null, msgs);
			case MlPackage.PIECE_TYPE__QUOTIENT1:
				return basicSetQuotient1(null, msgs);
			case MlPackage.PIECE_TYPE__DIVIDE1:
				return basicSetDivide1(null, msgs);
			case MlPackage.PIECE_TYPE__MINUS1:
				return basicSetMinus1(null, msgs);
			case MlPackage.PIECE_TYPE__POWER1:
				return basicSetPower1(null, msgs);
			case MlPackage.PIECE_TYPE__REM1:
				return basicSetRem1(null, msgs);
			case MlPackage.PIECE_TYPE__ROOT1:
				return basicSetRoot1(null, msgs);
			case MlPackage.PIECE_TYPE__FACTORIAL1:
				return basicSetFactorial1(null, msgs);
			case MlPackage.PIECE_TYPE__ABS1:
				return basicSetAbs1(null, msgs);
			case MlPackage.PIECE_TYPE__CONJUGATE1:
				return basicSetConjugate1(null, msgs);
			case MlPackage.PIECE_TYPE__ARG1:
				return basicSetArg1(null, msgs);
			case MlPackage.PIECE_TYPE__REAL1:
				return basicSetReal1(null, msgs);
			case MlPackage.PIECE_TYPE__IMAGINARY1:
				return basicSetImaginary1(null, msgs);
			case MlPackage.PIECE_TYPE__FLOOR1:
				return basicSetFloor1(null, msgs);
			case MlPackage.PIECE_TYPE__CEILING1:
				return basicSetCeiling1(null, msgs);
			case MlPackage.PIECE_TYPE__EXP1:
				return basicSetExp1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryMinmaxClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS1:
				return basicSetNaryMinmaxClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryArithClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS1:
				return basicSetNaryArithClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryLogicalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS1:
				return basicSetNaryLogicalClass1(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryLogicalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS1:
				return basicSetUnaryLogicalClass1(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP1:
				return ((InternalEList<?>)getBinaryLogicalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS1:
				return basicSetBinaryLogicalClass1(null, msgs);
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP1:
				return ((InternalEList<?>)getQuantifierClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS1:
				return basicSetQuantifierClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryRelnClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS1:
				return basicSetNaryRelnClass1(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP1:
				return ((InternalEList<?>)getBinaryRelnClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS1:
				return basicSetBinaryRelnClass1(null, msgs);
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP1:
				return ((InternalEList<?>)getIntClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__INT_CLASS1:
				return basicSetIntClass1(null, msgs);
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS1:
				return basicSetDifferentialOperatorClass1(null, msgs);
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP1:
				return ((InternalEList<?>)getPartialdiffClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS1:
				return basicSetPartialdiffClass1(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS1:
				return basicSetUnaryVeccalcClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS1:
				return basicSetNarySetlistConstructorClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getNarySetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS1:
				return basicSetNarySetClass1(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getBinarySetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS1:
				return basicSetBinarySetClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP1:
				return ((InternalEList<?>)getNarySetRelnClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS1:
				return basicSetNarySetRelnClass1(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getUnarySetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS1:
				return basicSetUnarySetClass1(null, msgs);
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP1:
				return ((InternalEList<?>)getSumClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__SUM_CLASS1:
				return basicSetSumClass1(null, msgs);
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP1:
				return ((InternalEList<?>)getProductClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS1:
				return basicSetProductClass1(null, msgs);
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP1:
				return ((InternalEList<?>)getLimitClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__LIMIT_CLASS1:
				return basicSetLimitClass1(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryElementaryClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS1:
				return basicSetUnaryElementaryClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryStatsClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS1:
				return basicSetNaryStatsClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryConstructorClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS1:
				return basicSetNaryConstructorClass1(null, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryLinalgClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS1:
				return basicSetUnaryLinalgClass1(null, msgs);
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryLinalgClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS1:
				return basicSetNaryLinalgClass1(null, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP1:
				return ((InternalEList<?>)getBinaryLinalgClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS1:
				return basicSetBinaryLinalgClass1(null, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getConstantSetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS1:
				return basicSetConstantSetClass1(null, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP1:
				return ((InternalEList<?>)getConstantArithClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS1:
				return basicSetConstantArithClass1(null, msgs);
			case MlPackage.PIECE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.PIECE_TYPE__APPLY:
				return getApply();
			case MlPackage.PIECE_TYPE__BIND:
				return getBind();
			case MlPackage.PIECE_TYPE__CI:
				return getCi();
			case MlPackage.PIECE_TYPE__CN:
				return getCn();
			case MlPackage.PIECE_TYPE__CSYMBOL:
				return getCsymbol();
			case MlPackage.PIECE_TYPE__CBYTES:
				return getCbytes();
			case MlPackage.PIECE_TYPE__CERROR:
				return getCerror();
			case MlPackage.PIECE_TYPE__CS:
				return getCs();
			case MlPackage.PIECE_TYPE__SHARE:
				return getShare();
			case MlPackage.PIECE_TYPE__PIECEWISE:
				return getPiecewise();
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				if (coreType) return getDeprecatedContExpGroup();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp();
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP:
				if (coreType) return getIntervalClassGroup();
				return ((FeatureMap.Internal)getIntervalClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS:
				return getIntervalClass();
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getUnaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass();
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP:
				if (coreType) return getLambdaClassGroup();
				return ((FeatureMap.Internal)getLambdaClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS:
				return getLambdaClass();
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getNaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass();
			case MlPackage.PIECE_TYPE__QUOTIENT:
				return getQuotient();
			case MlPackage.PIECE_TYPE__DIVIDE:
				return getDivide();
			case MlPackage.PIECE_TYPE__MINUS:
				return getMinus();
			case MlPackage.PIECE_TYPE__POWER:
				return getPower();
			case MlPackage.PIECE_TYPE__REM:
				return getRem();
			case MlPackage.PIECE_TYPE__ROOT:
				return getRoot();
			case MlPackage.PIECE_TYPE__FACTORIAL:
				return getFactorial();
			case MlPackage.PIECE_TYPE__ABS:
				return getAbs();
			case MlPackage.PIECE_TYPE__CONJUGATE:
				return getConjugate();
			case MlPackage.PIECE_TYPE__ARG:
				return getArg();
			case MlPackage.PIECE_TYPE__REAL:
				return getReal();
			case MlPackage.PIECE_TYPE__IMAGINARY:
				return getImaginary();
			case MlPackage.PIECE_TYPE__FLOOR:
				return getFloor();
			case MlPackage.PIECE_TYPE__CEILING:
				return getCeiling();
			case MlPackage.PIECE_TYPE__EXP:
				return getExp();
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP:
				if (coreType) return getNaryMinmaxClassGroup();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass();
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP:
				if (coreType) return getNaryArithClassGroup();
				return ((FeatureMap.Internal)getNaryArithClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS:
				return getNaryArithClass();
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getNaryLogicalClassGroup();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass();
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getUnaryLogicalClassGroup();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass();
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getBinaryLogicalClassGroup();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass();
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP:
				if (coreType) return getQuantifierClassGroup();
				return ((FeatureMap.Internal)getQuantifierClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS:
				return getQuantifierClass();
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP:
				if (coreType) return getNaryRelnClassGroup();
				return ((FeatureMap.Internal)getNaryRelnClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS:
				return getNaryRelnClass();
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP:
				if (coreType) return getBinaryRelnClassGroup();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS:
				return getBinaryRelnClass();
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP:
				if (coreType) return getIntClassGroup();
				return ((FeatureMap.Internal)getIntClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__INT_CLASS:
				return getIntClass();
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				if (coreType) return getDifferentialOperatorClassGroup();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass();
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP:
				if (coreType) return getPartialdiffClassGroup();
				return ((FeatureMap.Internal)getPartialdiffClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS:
				return getPartialdiffClass();
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				if (coreType) return getUnaryVeccalcClassGroup();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass();
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNarySetlistConstructorClassGroup();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass();
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP:
				if (coreType) return getNarySetClassGroup();
				return ((FeatureMap.Internal)getNarySetClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS:
				return getNarySetClass();
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP:
				if (coreType) return getBinarySetClassGroup();
				return ((FeatureMap.Internal)getBinarySetClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS:
				return getBinarySetClass();
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				if (coreType) return getNarySetRelnClassGroup();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass();
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP:
				if (coreType) return getUnarySetClassGroup();
				return ((FeatureMap.Internal)getUnarySetClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS:
				return getUnarySetClass();
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP:
				if (coreType) return getSumClassGroup();
				return ((FeatureMap.Internal)getSumClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__SUM_CLASS:
				return getSumClass();
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP:
				if (coreType) return getProductClassGroup();
				return ((FeatureMap.Internal)getProductClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS:
				return getProductClass();
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP:
				if (coreType) return getLimitClassGroup();
				return ((FeatureMap.Internal)getLimitClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__LIMIT_CLASS:
				return getLimitClass();
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				if (coreType) return getUnaryElementaryClassGroup();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass();
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP:
				if (coreType) return getNaryStatsClassGroup();
				return ((FeatureMap.Internal)getNaryStatsClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS:
				return getNaryStatsClass();
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNaryConstructorClassGroup();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass();
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP:
				if (coreType) return getUnaryLinalgClassGroup();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass();
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP:
				if (coreType) return getNaryLinalgClassGroup();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS:
				return getNaryLinalgClass();
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP:
				if (coreType) return getBinaryLinalgClassGroup();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass();
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP:
				if (coreType) return getConstantSetClassGroup();
				return ((FeatureMap.Internal)getConstantSetClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS:
				return getConstantSetClass();
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				if (coreType) return getConstantArithClassGroup();
				return ((FeatureMap.Internal)getConstantArithClassGroup()).getWrapper();
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS:
				return getConstantArithClass();
			case MlPackage.PIECE_TYPE__APPLY1:
				return getApply1();
			case MlPackage.PIECE_TYPE__BIND1:
				return getBind1();
			case MlPackage.PIECE_TYPE__CI1:
				return getCi1();
			case MlPackage.PIECE_TYPE__CN1:
				return getCn1();
			case MlPackage.PIECE_TYPE__CSYMBOL1:
				return getCsymbol1();
			case MlPackage.PIECE_TYPE__CBYTES1:
				return getCbytes1();
			case MlPackage.PIECE_TYPE__CERROR1:
				return getCerror1();
			case MlPackage.PIECE_TYPE__CS1:
				return getCs1();
			case MlPackage.PIECE_TYPE__SHARE1:
				return getShare1();
			case MlPackage.PIECE_TYPE__PIECEWISE1:
				return getPiecewise1();
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP1:
				if (coreType) return getDeprecatedContExpGroup1();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP1:
				return getDeprecatedContExp1();
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP1:
				if (coreType) return getIntervalClassGroup1();
				return ((FeatureMap.Internal)getIntervalClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS1:
				return getIntervalClass1();
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP1:
				if (coreType) return getUnaryFunctionalClassGroup1();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS1:
				return getUnaryFunctionalClass1();
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP1:
				if (coreType) return getLambdaClassGroup1();
				return ((FeatureMap.Internal)getLambdaClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS1:
				return getLambdaClass1();
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP1:
				if (coreType) return getNaryFunctionalClassGroup1();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS1:
				return getNaryFunctionalClass1();
			case MlPackage.PIECE_TYPE__QUOTIENT1:
				return getQuotient1();
			case MlPackage.PIECE_TYPE__DIVIDE1:
				return getDivide1();
			case MlPackage.PIECE_TYPE__MINUS1:
				return getMinus1();
			case MlPackage.PIECE_TYPE__POWER1:
				return getPower1();
			case MlPackage.PIECE_TYPE__REM1:
				return getRem1();
			case MlPackage.PIECE_TYPE__ROOT1:
				return getRoot1();
			case MlPackage.PIECE_TYPE__FACTORIAL1:
				return getFactorial1();
			case MlPackage.PIECE_TYPE__ABS1:
				return getAbs1();
			case MlPackage.PIECE_TYPE__CONJUGATE1:
				return getConjugate1();
			case MlPackage.PIECE_TYPE__ARG1:
				return getArg1();
			case MlPackage.PIECE_TYPE__REAL1:
				return getReal1();
			case MlPackage.PIECE_TYPE__IMAGINARY1:
				return getImaginary1();
			case MlPackage.PIECE_TYPE__FLOOR1:
				return getFloor1();
			case MlPackage.PIECE_TYPE__CEILING1:
				return getCeiling1();
			case MlPackage.PIECE_TYPE__EXP1:
				return getExp1();
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP1:
				if (coreType) return getNaryMinmaxClassGroup1();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS1:
				return getNaryMinmaxClass1();
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP1:
				if (coreType) return getNaryArithClassGroup1();
				return ((FeatureMap.Internal)getNaryArithClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS1:
				return getNaryArithClass1();
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP1:
				if (coreType) return getNaryLogicalClassGroup1();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS1:
				return getNaryLogicalClass1();
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP1:
				if (coreType) return getUnaryLogicalClassGroup1();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS1:
				return getUnaryLogicalClass1();
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP1:
				if (coreType) return getBinaryLogicalClassGroup1();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS1:
				return getBinaryLogicalClass1();
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP1:
				if (coreType) return getQuantifierClassGroup1();
				return ((FeatureMap.Internal)getQuantifierClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS1:
				return getQuantifierClass1();
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP1:
				if (coreType) return getNaryRelnClassGroup1();
				return ((FeatureMap.Internal)getNaryRelnClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS1:
				return getNaryRelnClass1();
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP1:
				if (coreType) return getBinaryRelnClassGroup1();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS1:
				return getBinaryRelnClass1();
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP1:
				if (coreType) return getIntClassGroup1();
				return ((FeatureMap.Internal)getIntClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__INT_CLASS1:
				return getIntClass1();
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				if (coreType) return getDifferentialOperatorClassGroup1();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS1:
				return getDifferentialOperatorClass1();
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP1:
				if (coreType) return getPartialdiffClassGroup1();
				return ((FeatureMap.Internal)getPartialdiffClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS1:
				return getPartialdiffClass1();
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP1:
				if (coreType) return getUnaryVeccalcClassGroup1();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS1:
				return getUnaryVeccalcClass1();
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				if (coreType) return getNarySetlistConstructorClassGroup1();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS1:
				return getNarySetlistConstructorClass1();
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP1:
				if (coreType) return getNarySetClassGroup1();
				return ((FeatureMap.Internal)getNarySetClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS1:
				return getNarySetClass1();
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP1:
				if (coreType) return getBinarySetClassGroup1();
				return ((FeatureMap.Internal)getBinarySetClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS1:
				return getBinarySetClass1();
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP1:
				if (coreType) return getNarySetRelnClassGroup1();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS1:
				return getNarySetRelnClass1();
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP1:
				if (coreType) return getUnarySetClassGroup1();
				return ((FeatureMap.Internal)getUnarySetClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS1:
				return getUnarySetClass1();
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP1:
				if (coreType) return getSumClassGroup1();
				return ((FeatureMap.Internal)getSumClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__SUM_CLASS1:
				return getSumClass1();
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP1:
				if (coreType) return getProductClassGroup1();
				return ((FeatureMap.Internal)getProductClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS1:
				return getProductClass1();
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP1:
				if (coreType) return getLimitClassGroup1();
				return ((FeatureMap.Internal)getLimitClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__LIMIT_CLASS1:
				return getLimitClass1();
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP1:
				if (coreType) return getUnaryElementaryClassGroup1();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS1:
				return getUnaryElementaryClass1();
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP1:
				if (coreType) return getNaryStatsClassGroup1();
				return ((FeatureMap.Internal)getNaryStatsClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS1:
				return getNaryStatsClass1();
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP1:
				if (coreType) return getNaryConstructorClassGroup1();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS1:
				return getNaryConstructorClass1();
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP1:
				if (coreType) return getUnaryLinalgClassGroup1();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS1:
				return getUnaryLinalgClass1();
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP1:
				if (coreType) return getNaryLinalgClassGroup1();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS1:
				return getNaryLinalgClass1();
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP1:
				if (coreType) return getBinaryLinalgClassGroup1();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS1:
				return getBinaryLinalgClass1();
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP1:
				if (coreType) return getConstantSetClassGroup1();
				return ((FeatureMap.Internal)getConstantSetClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS1:
				return getConstantSetClass1();
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP1:
				if (coreType) return getConstantArithClassGroup1();
				return ((FeatureMap.Internal)getConstantArithClassGroup1()).getWrapper();
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS1:
				return getConstantArithClass1();
			case MlPackage.PIECE_TYPE__CLASS:
				return getClass_();
			case MlPackage.PIECE_TYPE__DEFINITION_URL:
				return getDefinitionURL();
			case MlPackage.PIECE_TYPE__ENCODING:
				return getEncoding();
			case MlPackage.PIECE_TYPE__HREF:
				return getHref();
			case MlPackage.PIECE_TYPE__ID:
				return getId();
			case MlPackage.PIECE_TYPE__OTHER:
				return getOther();
			case MlPackage.PIECE_TYPE__STYLE:
				return getStyle();
			case MlPackage.PIECE_TYPE__XREF:
				return getXref();
			case MlPackage.PIECE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.PIECE_TYPE__APPLY:
				setApply((ApplyType)newValue);
				return;
			case MlPackage.PIECE_TYPE__BIND:
				setBind((BindType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CI:
				setCi((CiType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CN:
				setCn((CnType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CSYMBOL:
				setCsymbol((CsymbolType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CBYTES:
				setCbytes((CbytesType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CERROR:
				setCerror((CerrorType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CS:
				setCs((CsType)newValue);
				return;
			case MlPackage.PIECE_TYPE__SHARE:
				setShare((ShareType)newValue);
				return;
			case MlPackage.PIECE_TYPE__PIECEWISE:
				setPiecewise((PiecewiseType)newValue);
				return;
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				((FeatureMap.Internal)getDeprecatedContExpGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP:
				((FeatureMap.Internal)getIntervalClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP:
				((FeatureMap.Internal)getLambdaClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__QUOTIENT:
				setQuotient((QuotientType)newValue);
				return;
			case MlPackage.PIECE_TYPE__DIVIDE:
				setDivide((DivideType)newValue);
				return;
			case MlPackage.PIECE_TYPE__MINUS:
				setMinus((MinusType)newValue);
				return;
			case MlPackage.PIECE_TYPE__POWER:
				setPower((PowerType)newValue);
				return;
			case MlPackage.PIECE_TYPE__REM:
				setRem((RemType)newValue);
				return;
			case MlPackage.PIECE_TYPE__ROOT:
				setRoot((RootType)newValue);
				return;
			case MlPackage.PIECE_TYPE__FACTORIAL:
				setFactorial((FactorialType)newValue);
				return;
			case MlPackage.PIECE_TYPE__ABS:
				setAbs((AbsType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CONJUGATE:
				setConjugate((ConjugateType)newValue);
				return;
			case MlPackage.PIECE_TYPE__ARG:
				setArg((ArgType)newValue);
				return;
			case MlPackage.PIECE_TYPE__REAL:
				setReal((RealType)newValue);
				return;
			case MlPackage.PIECE_TYPE__IMAGINARY:
				setImaginary((ImaginaryType)newValue);
				return;
			case MlPackage.PIECE_TYPE__FLOOR:
				setFloor((FloorType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CEILING:
				setCeiling((CeilingType)newValue);
				return;
			case MlPackage.PIECE_TYPE__EXP:
				setExp((ExpType)newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP:
				((FeatureMap.Internal)getNaryMinmaxClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getNaryArithClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP:
				((FeatureMap.Internal)getQuantifierClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP:
				((FeatureMap.Internal)getIntClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP:
				((FeatureMap.Internal)getPartialdiffClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getBinarySetClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetRelnClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getUnarySetClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP:
				((FeatureMap.Internal)getSumClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP:
				((FeatureMap.Internal)getProductClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP:
				((FeatureMap.Internal)getLimitClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryElementaryClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP:
				((FeatureMap.Internal)getNaryStatsClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNaryConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP:
				((FeatureMap.Internal)getConstantSetClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getConstantArithClassGroup()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__APPLY1:
				setApply1((ApplyType)newValue);
				return;
			case MlPackage.PIECE_TYPE__BIND1:
				setBind1((BindType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CI1:
				setCi1((CiType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CN1:
				setCn1((CnType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CSYMBOL1:
				setCsymbol1((CsymbolType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CBYTES1:
				setCbytes1((CbytesType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CERROR1:
				setCerror1((CerrorType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CS1:
				setCs1((CsType)newValue);
				return;
			case MlPackage.PIECE_TYPE__SHARE1:
				setShare1((ShareType)newValue);
				return;
			case MlPackage.PIECE_TYPE__PIECEWISE1:
				setPiecewise1((PiecewiseType)newValue);
				return;
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP1:
				((FeatureMap.Internal)getDeprecatedContExpGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP1:
				((FeatureMap.Internal)getIntervalClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP1:
				((FeatureMap.Internal)getLambdaClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryFunctionalClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__QUOTIENT1:
				setQuotient1((QuotientType)newValue);
				return;
			case MlPackage.PIECE_TYPE__DIVIDE1:
				setDivide1((DivideType)newValue);
				return;
			case MlPackage.PIECE_TYPE__MINUS1:
				setMinus1((MinusType)newValue);
				return;
			case MlPackage.PIECE_TYPE__POWER1:
				setPower1((PowerType)newValue);
				return;
			case MlPackage.PIECE_TYPE__REM1:
				setRem1((RemType)newValue);
				return;
			case MlPackage.PIECE_TYPE__ROOT1:
				setRoot1((RootType)newValue);
				return;
			case MlPackage.PIECE_TYPE__FACTORIAL1:
				setFactorial1((FactorialType)newValue);
				return;
			case MlPackage.PIECE_TYPE__ABS1:
				setAbs1((AbsType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CONJUGATE1:
				setConjugate1((ConjugateType)newValue);
				return;
			case MlPackage.PIECE_TYPE__ARG1:
				setArg1((ArgType)newValue);
				return;
			case MlPackage.PIECE_TYPE__REAL1:
				setReal1((RealType)newValue);
				return;
			case MlPackage.PIECE_TYPE__IMAGINARY1:
				setImaginary1((ImaginaryType)newValue);
				return;
			case MlPackage.PIECE_TYPE__FLOOR1:
				setFloor1((FloorType)newValue);
				return;
			case MlPackage.PIECE_TYPE__CEILING1:
				setCeiling1((CeilingType)newValue);
				return;
			case MlPackage.PIECE_TYPE__EXP1:
				setExp1((ExpType)newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryMinmaxClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryArithClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryLogicalClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryLogicalClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP1:
				((FeatureMap.Internal)getBinaryLogicalClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP1:
				((FeatureMap.Internal)getQuantifierClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryRelnClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP1:
				((FeatureMap.Internal)getBinaryRelnClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP1:
				((FeatureMap.Internal)getIntClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP1:
				((FeatureMap.Internal)getPartialdiffClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getNarySetClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getBinarySetClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP1:
				((FeatureMap.Internal)getNarySetRelnClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getUnarySetClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP1:
				((FeatureMap.Internal)getSumClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP1:
				((FeatureMap.Internal)getProductClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP1:
				((FeatureMap.Internal)getLimitClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryElementaryClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryStatsClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryConstructorClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryLinalgClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryLinalgClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP1:
				((FeatureMap.Internal)getBinaryLinalgClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getConstantSetClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP1:
				((FeatureMap.Internal)getConstantArithClassGroup1()).set(newValue);
				return;
			case MlPackage.PIECE_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.PIECE_TYPE__DEFINITION_URL:
				setDefinitionURL((String)newValue);
				return;
			case MlPackage.PIECE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case MlPackage.PIECE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.PIECE_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.PIECE_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.PIECE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.PIECE_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.PIECE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.PIECE_TYPE__APPLY:
				setApply((ApplyType)null);
				return;
			case MlPackage.PIECE_TYPE__BIND:
				setBind((BindType)null);
				return;
			case MlPackage.PIECE_TYPE__CI:
				setCi((CiType)null);
				return;
			case MlPackage.PIECE_TYPE__CN:
				setCn((CnType)null);
				return;
			case MlPackage.PIECE_TYPE__CSYMBOL:
				setCsymbol((CsymbolType)null);
				return;
			case MlPackage.PIECE_TYPE__CBYTES:
				setCbytes((CbytesType)null);
				return;
			case MlPackage.PIECE_TYPE__CERROR:
				setCerror((CerrorType)null);
				return;
			case MlPackage.PIECE_TYPE__CS:
				setCs((CsType)null);
				return;
			case MlPackage.PIECE_TYPE__SHARE:
				setShare((ShareType)null);
				return;
			case MlPackage.PIECE_TYPE__PIECEWISE:
				setPiecewise((PiecewiseType)null);
				return;
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				getDeprecatedContExpGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP:
				getIntervalClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				getUnaryFunctionalClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP:
				getLambdaClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				getNaryFunctionalClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__QUOTIENT:
				setQuotient((QuotientType)null);
				return;
			case MlPackage.PIECE_TYPE__DIVIDE:
				setDivide((DivideType)null);
				return;
			case MlPackage.PIECE_TYPE__MINUS:
				setMinus((MinusType)null);
				return;
			case MlPackage.PIECE_TYPE__POWER:
				setPower((PowerType)null);
				return;
			case MlPackage.PIECE_TYPE__REM:
				setRem((RemType)null);
				return;
			case MlPackage.PIECE_TYPE__ROOT:
				setRoot((RootType)null);
				return;
			case MlPackage.PIECE_TYPE__FACTORIAL:
				setFactorial((FactorialType)null);
				return;
			case MlPackage.PIECE_TYPE__ABS:
				setAbs((AbsType)null);
				return;
			case MlPackage.PIECE_TYPE__CONJUGATE:
				setConjugate((ConjugateType)null);
				return;
			case MlPackage.PIECE_TYPE__ARG:
				setArg((ArgType)null);
				return;
			case MlPackage.PIECE_TYPE__REAL:
				setReal((RealType)null);
				return;
			case MlPackage.PIECE_TYPE__IMAGINARY:
				setImaginary((ImaginaryType)null);
				return;
			case MlPackage.PIECE_TYPE__FLOOR:
				setFloor((FloorType)null);
				return;
			case MlPackage.PIECE_TYPE__CEILING:
				setCeiling((CeilingType)null);
				return;
			case MlPackage.PIECE_TYPE__EXP:
				setExp((ExpType)null);
				return;
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP:
				getNaryMinmaxClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP:
				getNaryArithClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				getNaryLogicalClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				getUnaryLogicalClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				getBinaryLogicalClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP:
				getQuantifierClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP:
				getNaryRelnClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP:
				getBinaryRelnClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP:
				getIntClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				getDifferentialOperatorClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP:
				getPartialdiffClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				getUnaryVeccalcClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				getNarySetlistConstructorClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP:
				getNarySetClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP:
				getBinarySetClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				getNarySetRelnClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP:
				getUnarySetClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP:
				getSumClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP:
				getProductClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP:
				getLimitClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				getUnaryElementaryClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP:
				getNaryStatsClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				getNaryConstructorClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP:
				getUnaryLinalgClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP:
				getNaryLinalgClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP:
				getBinaryLinalgClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP:
				getConstantSetClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				getConstantArithClassGroup().clear();
				return;
			case MlPackage.PIECE_TYPE__APPLY1:
				setApply1((ApplyType)null);
				return;
			case MlPackage.PIECE_TYPE__BIND1:
				setBind1((BindType)null);
				return;
			case MlPackage.PIECE_TYPE__CI1:
				setCi1((CiType)null);
				return;
			case MlPackage.PIECE_TYPE__CN1:
				setCn1((CnType)null);
				return;
			case MlPackage.PIECE_TYPE__CSYMBOL1:
				setCsymbol1((CsymbolType)null);
				return;
			case MlPackage.PIECE_TYPE__CBYTES1:
				setCbytes1((CbytesType)null);
				return;
			case MlPackage.PIECE_TYPE__CERROR1:
				setCerror1((CerrorType)null);
				return;
			case MlPackage.PIECE_TYPE__CS1:
				setCs1((CsType)null);
				return;
			case MlPackage.PIECE_TYPE__SHARE1:
				setShare1((ShareType)null);
				return;
			case MlPackage.PIECE_TYPE__PIECEWISE1:
				setPiecewise1((PiecewiseType)null);
				return;
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP1:
				getDeprecatedContExpGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP1:
				getIntervalClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP1:
				getUnaryFunctionalClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP1:
				getLambdaClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP1:
				getNaryFunctionalClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__QUOTIENT1:
				setQuotient1((QuotientType)null);
				return;
			case MlPackage.PIECE_TYPE__DIVIDE1:
				setDivide1((DivideType)null);
				return;
			case MlPackage.PIECE_TYPE__MINUS1:
				setMinus1((MinusType)null);
				return;
			case MlPackage.PIECE_TYPE__POWER1:
				setPower1((PowerType)null);
				return;
			case MlPackage.PIECE_TYPE__REM1:
				setRem1((RemType)null);
				return;
			case MlPackage.PIECE_TYPE__ROOT1:
				setRoot1((RootType)null);
				return;
			case MlPackage.PIECE_TYPE__FACTORIAL1:
				setFactorial1((FactorialType)null);
				return;
			case MlPackage.PIECE_TYPE__ABS1:
				setAbs1((AbsType)null);
				return;
			case MlPackage.PIECE_TYPE__CONJUGATE1:
				setConjugate1((ConjugateType)null);
				return;
			case MlPackage.PIECE_TYPE__ARG1:
				setArg1((ArgType)null);
				return;
			case MlPackage.PIECE_TYPE__REAL1:
				setReal1((RealType)null);
				return;
			case MlPackage.PIECE_TYPE__IMAGINARY1:
				setImaginary1((ImaginaryType)null);
				return;
			case MlPackage.PIECE_TYPE__FLOOR1:
				setFloor1((FloorType)null);
				return;
			case MlPackage.PIECE_TYPE__CEILING1:
				setCeiling1((CeilingType)null);
				return;
			case MlPackage.PIECE_TYPE__EXP1:
				setExp1((ExpType)null);
				return;
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP1:
				getNaryMinmaxClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP1:
				getNaryArithClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP1:
				getNaryLogicalClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP1:
				getUnaryLogicalClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP1:
				getBinaryLogicalClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP1:
				getQuantifierClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP1:
				getNaryRelnClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP1:
				getBinaryRelnClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP1:
				getIntClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				getDifferentialOperatorClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP1:
				getPartialdiffClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP1:
				getUnaryVeccalcClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				getNarySetlistConstructorClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP1:
				getNarySetClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP1:
				getBinarySetClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP1:
				getNarySetRelnClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP1:
				getUnarySetClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP1:
				getSumClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP1:
				getProductClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP1:
				getLimitClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP1:
				getUnaryElementaryClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP1:
				getNaryStatsClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP1:
				getNaryConstructorClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP1:
				getUnaryLinalgClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP1:
				getNaryLinalgClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP1:
				getBinaryLinalgClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP1:
				getConstantSetClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP1:
				getConstantArithClassGroup1().clear();
				return;
			case MlPackage.PIECE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__DEFINITION_URL:
				setDefinitionURL(DEFINITION_URL_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.PIECE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.PIECE_TYPE__APPLY:
				return apply != null;
			case MlPackage.PIECE_TYPE__BIND:
				return bind != null;
			case MlPackage.PIECE_TYPE__CI:
				return ci != null;
			case MlPackage.PIECE_TYPE__CN:
				return cn != null;
			case MlPackage.PIECE_TYPE__CSYMBOL:
				return csymbol != null;
			case MlPackage.PIECE_TYPE__CBYTES:
				return cbytes != null;
			case MlPackage.PIECE_TYPE__CERROR:
				return cerror != null;
			case MlPackage.PIECE_TYPE__CS:
				return cs != null;
			case MlPackage.PIECE_TYPE__SHARE:
				return share != null;
			case MlPackage.PIECE_TYPE__PIECEWISE:
				return piecewise != null;
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return deprecatedContExpGroup != null && !deprecatedContExpGroup.isEmpty();
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp() != null;
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP:
				return intervalClassGroup != null && !intervalClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS:
				return getIntervalClass() != null;
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return unaryFunctionalClassGroup != null && !unaryFunctionalClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass() != null;
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP:
				return lambdaClassGroup != null && !lambdaClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS:
				return getLambdaClass() != null;
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return naryFunctionalClassGroup != null && !naryFunctionalClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass() != null;
			case MlPackage.PIECE_TYPE__QUOTIENT:
				return quotient != null;
			case MlPackage.PIECE_TYPE__DIVIDE:
				return divide != null;
			case MlPackage.PIECE_TYPE__MINUS:
				return minus != null;
			case MlPackage.PIECE_TYPE__POWER:
				return power != null;
			case MlPackage.PIECE_TYPE__REM:
				return rem != null;
			case MlPackage.PIECE_TYPE__ROOT:
				return root != null;
			case MlPackage.PIECE_TYPE__FACTORIAL:
				return factorial != null;
			case MlPackage.PIECE_TYPE__ABS:
				return abs != null;
			case MlPackage.PIECE_TYPE__CONJUGATE:
				return conjugate != null;
			case MlPackage.PIECE_TYPE__ARG:
				return arg != null;
			case MlPackage.PIECE_TYPE__REAL:
				return real != null;
			case MlPackage.PIECE_TYPE__IMAGINARY:
				return imaginary != null;
			case MlPackage.PIECE_TYPE__FLOOR:
				return floor != null;
			case MlPackage.PIECE_TYPE__CEILING:
				return ceiling != null;
			case MlPackage.PIECE_TYPE__EXP:
				return exp != null;
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP:
				return naryMinmaxClassGroup != null && !naryMinmaxClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass() != null;
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP:
				return naryArithClassGroup != null && !naryArithClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS:
				return getNaryArithClass() != null;
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return naryLogicalClassGroup != null && !naryLogicalClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass() != null;
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return unaryLogicalClassGroup != null && !unaryLogicalClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass() != null;
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return binaryLogicalClassGroup != null && !binaryLogicalClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass() != null;
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP:
				return quantifierClassGroup != null && !quantifierClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS:
				return getQuantifierClass() != null;
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP:
				return naryRelnClassGroup != null && !naryRelnClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS:
				return getNaryRelnClass() != null;
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP:
				return binaryRelnClassGroup != null && !binaryRelnClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS:
				return getBinaryRelnClass() != null;
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP:
				return intClassGroup != null && !intClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__INT_CLASS:
				return getIntClass() != null;
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return differentialOperatorClassGroup != null && !differentialOperatorClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass() != null;
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP:
				return partialdiffClassGroup != null && !partialdiffClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS:
				return getPartialdiffClass() != null;
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return unaryVeccalcClassGroup != null && !unaryVeccalcClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass() != null;
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return narySetlistConstructorClassGroup != null && !narySetlistConstructorClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass() != null;
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP:
				return narySetClassGroup != null && !narySetClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS:
				return getNarySetClass() != null;
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP:
				return binarySetClassGroup != null && !binarySetClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS:
				return getBinarySetClass() != null;
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return narySetRelnClassGroup != null && !narySetRelnClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass() != null;
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP:
				return unarySetClassGroup != null && !unarySetClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS:
				return getUnarySetClass() != null;
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP:
				return sumClassGroup != null && !sumClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__SUM_CLASS:
				return getSumClass() != null;
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP:
				return productClassGroup != null && !productClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS:
				return getProductClass() != null;
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP:
				return limitClassGroup != null && !limitClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__LIMIT_CLASS:
				return getLimitClass() != null;
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return unaryElementaryClassGroup != null && !unaryElementaryClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass() != null;
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP:
				return naryStatsClassGroup != null && !naryStatsClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS:
				return getNaryStatsClass() != null;
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return naryConstructorClassGroup != null && !naryConstructorClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass() != null;
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP:
				return unaryLinalgClassGroup != null && !unaryLinalgClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass() != null;
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP:
				return naryLinalgClassGroup != null && !naryLinalgClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS:
				return getNaryLinalgClass() != null;
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP:
				return binaryLinalgClassGroup != null && !binaryLinalgClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass() != null;
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP:
				return constantSetClassGroup != null && !constantSetClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS:
				return getConstantSetClass() != null;
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return constantArithClassGroup != null && !constantArithClassGroup.isEmpty();
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS:
				return getConstantArithClass() != null;
			case MlPackage.PIECE_TYPE__APPLY1:
				return apply1 != null;
			case MlPackage.PIECE_TYPE__BIND1:
				return bind1 != null;
			case MlPackage.PIECE_TYPE__CI1:
				return ci1 != null;
			case MlPackage.PIECE_TYPE__CN1:
				return cn1 != null;
			case MlPackage.PIECE_TYPE__CSYMBOL1:
				return csymbol1 != null;
			case MlPackage.PIECE_TYPE__CBYTES1:
				return cbytes1 != null;
			case MlPackage.PIECE_TYPE__CERROR1:
				return cerror1 != null;
			case MlPackage.PIECE_TYPE__CS1:
				return cs1 != null;
			case MlPackage.PIECE_TYPE__SHARE1:
				return share1 != null;
			case MlPackage.PIECE_TYPE__PIECEWISE1:
				return piecewise1 != null;
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP_GROUP1:
				return deprecatedContExpGroup1 != null && !deprecatedContExpGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__DEPRECATED_CONT_EXP1:
				return getDeprecatedContExp1() != null;
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS_GROUP1:
				return intervalClassGroup1 != null && !intervalClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__INTERVAL_CLASS1:
				return getIntervalClass1() != null;
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP1:
				return unaryFunctionalClassGroup1 != null && !unaryFunctionalClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_FUNCTIONAL_CLASS1:
				return getUnaryFunctionalClass1() != null;
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS_GROUP1:
				return lambdaClassGroup1 != null && !lambdaClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__LAMBDA_CLASS1:
				return getLambdaClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP1:
				return naryFunctionalClassGroup1 != null && !naryFunctionalClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_FUNCTIONAL_CLASS1:
				return getNaryFunctionalClass1() != null;
			case MlPackage.PIECE_TYPE__QUOTIENT1:
				return quotient1 != null;
			case MlPackage.PIECE_TYPE__DIVIDE1:
				return divide1 != null;
			case MlPackage.PIECE_TYPE__MINUS1:
				return minus1 != null;
			case MlPackage.PIECE_TYPE__POWER1:
				return power1 != null;
			case MlPackage.PIECE_TYPE__REM1:
				return rem1 != null;
			case MlPackage.PIECE_TYPE__ROOT1:
				return root1 != null;
			case MlPackage.PIECE_TYPE__FACTORIAL1:
				return factorial1 != null;
			case MlPackage.PIECE_TYPE__ABS1:
				return abs1 != null;
			case MlPackage.PIECE_TYPE__CONJUGATE1:
				return conjugate1 != null;
			case MlPackage.PIECE_TYPE__ARG1:
				return arg1 != null;
			case MlPackage.PIECE_TYPE__REAL1:
				return real1 != null;
			case MlPackage.PIECE_TYPE__IMAGINARY1:
				return imaginary1 != null;
			case MlPackage.PIECE_TYPE__FLOOR1:
				return floor1 != null;
			case MlPackage.PIECE_TYPE__CEILING1:
				return ceiling1 != null;
			case MlPackage.PIECE_TYPE__EXP1:
				return exp1 != null;
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS_GROUP1:
				return naryMinmaxClassGroup1 != null && !naryMinmaxClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_MINMAX_CLASS1:
				return getNaryMinmaxClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS_GROUP1:
				return naryArithClassGroup1 != null && !naryArithClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_ARITH_CLASS1:
				return getNaryArithClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS_GROUP1:
				return naryLogicalClassGroup1 != null && !naryLogicalClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_LOGICAL_CLASS1:
				return getNaryLogicalClass1() != null;
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS_GROUP1:
				return unaryLogicalClassGroup1 != null && !unaryLogicalClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_LOGICAL_CLASS1:
				return getUnaryLogicalClass1() != null;
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS_GROUP1:
				return binaryLogicalClassGroup1 != null && !binaryLogicalClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_LOGICAL_CLASS1:
				return getBinaryLogicalClass1() != null;
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS_GROUP1:
				return quantifierClassGroup1 != null && !quantifierClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__QUANTIFIER_CLASS1:
				return getQuantifierClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS_GROUP1:
				return naryRelnClassGroup1 != null && !naryRelnClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_RELN_CLASS1:
				return getNaryRelnClass1() != null;
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS_GROUP1:
				return binaryRelnClassGroup1 != null && !binaryRelnClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_RELN_CLASS1:
				return getBinaryRelnClass1() != null;
			case MlPackage.PIECE_TYPE__INT_CLASS_GROUP1:
				return intClassGroup1 != null && !intClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__INT_CLASS1:
				return getIntClass1() != null;
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				return differentialOperatorClassGroup1 != null && !differentialOperatorClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__DIFFERENTIAL_OPERATOR_CLASS1:
				return getDifferentialOperatorClass1() != null;
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS_GROUP1:
				return partialdiffClassGroup1 != null && !partialdiffClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__PARTIALDIFF_CLASS1:
				return getPartialdiffClass1() != null;
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS_GROUP1:
				return unaryVeccalcClassGroup1 != null && !unaryVeccalcClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_VECCALC_CLASS1:
				return getUnaryVeccalcClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				return narySetlistConstructorClassGroup1 != null && !narySetlistConstructorClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS1:
				return getNarySetlistConstructorClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS_GROUP1:
				return narySetClassGroup1 != null && !narySetClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_SET_CLASS1:
				return getNarySetClass1() != null;
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS_GROUP1:
				return binarySetClassGroup1 != null && !binarySetClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_SET_CLASS1:
				return getBinarySetClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS_GROUP1:
				return narySetRelnClassGroup1 != null && !narySetRelnClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_SET_RELN_CLASS1:
				return getNarySetRelnClass1() != null;
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS_GROUP1:
				return unarySetClassGroup1 != null && !unarySetClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_SET_CLASS1:
				return getUnarySetClass1() != null;
			case MlPackage.PIECE_TYPE__SUM_CLASS_GROUP1:
				return sumClassGroup1 != null && !sumClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__SUM_CLASS1:
				return getSumClass1() != null;
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS_GROUP1:
				return productClassGroup1 != null && !productClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__PRODUCT_CLASS1:
				return getProductClass1() != null;
			case MlPackage.PIECE_TYPE__LIMIT_CLASS_GROUP1:
				return limitClassGroup1 != null && !limitClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__LIMIT_CLASS1:
				return getLimitClass1() != null;
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP1:
				return unaryElementaryClassGroup1 != null && !unaryElementaryClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_ELEMENTARY_CLASS1:
				return getUnaryElementaryClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS_GROUP1:
				return naryStatsClassGroup1 != null && !naryStatsClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_STATS_CLASS1:
				return getNaryStatsClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP1:
				return naryConstructorClassGroup1 != null && !naryConstructorClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_CONSTRUCTOR_CLASS1:
				return getNaryConstructorClass1() != null;
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS_GROUP1:
				return unaryLinalgClassGroup1 != null && !unaryLinalgClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__UNARY_LINALG_CLASS1:
				return getUnaryLinalgClass1() != null;
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS_GROUP1:
				return naryLinalgClassGroup1 != null && !naryLinalgClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__NARY_LINALG_CLASS1:
				return getNaryLinalgClass1() != null;
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS_GROUP1:
				return binaryLinalgClassGroup1 != null && !binaryLinalgClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__BINARY_LINALG_CLASS1:
				return getBinaryLinalgClass1() != null;
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS_GROUP1:
				return constantSetClassGroup1 != null && !constantSetClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__CONSTANT_SET_CLASS1:
				return getConstantSetClass1() != null;
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS_GROUP1:
				return constantArithClassGroup1 != null && !constantArithClassGroup1.isEmpty();
			case MlPackage.PIECE_TYPE__CONSTANT_ARITH_CLASS1:
				return getConstantArithClass1() != null;
			case MlPackage.PIECE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.PIECE_TYPE__DEFINITION_URL:
				return DEFINITION_URL_EDEFAULT == null ? definitionURL != null : !DEFINITION_URL_EDEFAULT.equals(definitionURL);
			case MlPackage.PIECE_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case MlPackage.PIECE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.PIECE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.PIECE_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.PIECE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.PIECE_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.PIECE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (deprecatedContExpGroup: ");
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
		result.append(", deprecatedContExpGroup1: ");
		result.append(deprecatedContExpGroup1);
		result.append(", intervalClassGroup1: ");
		result.append(intervalClassGroup1);
		result.append(", unaryFunctionalClassGroup1: ");
		result.append(unaryFunctionalClassGroup1);
		result.append(", lambdaClassGroup1: ");
		result.append(lambdaClassGroup1);
		result.append(", naryFunctionalClassGroup1: ");
		result.append(naryFunctionalClassGroup1);
		result.append(", naryMinmaxClassGroup1: ");
		result.append(naryMinmaxClassGroup1);
		result.append(", naryArithClassGroup1: ");
		result.append(naryArithClassGroup1);
		result.append(", naryLogicalClassGroup1: ");
		result.append(naryLogicalClassGroup1);
		result.append(", unaryLogicalClassGroup1: ");
		result.append(unaryLogicalClassGroup1);
		result.append(", binaryLogicalClassGroup1: ");
		result.append(binaryLogicalClassGroup1);
		result.append(", quantifierClassGroup1: ");
		result.append(quantifierClassGroup1);
		result.append(", naryRelnClassGroup1: ");
		result.append(naryRelnClassGroup1);
		result.append(", binaryRelnClassGroup1: ");
		result.append(binaryRelnClassGroup1);
		result.append(", intClassGroup1: ");
		result.append(intClassGroup1);
		result.append(", differentialOperatorClassGroup1: ");
		result.append(differentialOperatorClassGroup1);
		result.append(", partialdiffClassGroup1: ");
		result.append(partialdiffClassGroup1);
		result.append(", unaryVeccalcClassGroup1: ");
		result.append(unaryVeccalcClassGroup1);
		result.append(", narySetlistConstructorClassGroup1: ");
		result.append(narySetlistConstructorClassGroup1);
		result.append(", narySetClassGroup1: ");
		result.append(narySetClassGroup1);
		result.append(", binarySetClassGroup1: ");
		result.append(binarySetClassGroup1);
		result.append(", narySetRelnClassGroup1: ");
		result.append(narySetRelnClassGroup1);
		result.append(", unarySetClassGroup1: ");
		result.append(unarySetClassGroup1);
		result.append(", sumClassGroup1: ");
		result.append(sumClassGroup1);
		result.append(", productClassGroup1: ");
		result.append(productClassGroup1);
		result.append(", limitClassGroup1: ");
		result.append(limitClassGroup1);
		result.append(", unaryElementaryClassGroup1: ");
		result.append(unaryElementaryClassGroup1);
		result.append(", naryStatsClassGroup1: ");
		result.append(naryStatsClassGroup1);
		result.append(", naryConstructorClassGroup1: ");
		result.append(naryConstructorClassGroup1);
		result.append(", unaryLinalgClassGroup1: ");
		result.append(unaryLinalgClassGroup1);
		result.append(", naryLinalgClassGroup1: ");
		result.append(naryLinalgClassGroup1);
		result.append(", binaryLinalgClassGroup1: ");
		result.append(binaryLinalgClassGroup1);
		result.append(", constantSetClassGroup1: ");
		result.append(constantSetClassGroup1);
		result.append(", constantArithClassGroup1: ");
		result.append(constantArithClassGroup1);
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

} //PieceTypeImpl
