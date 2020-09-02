/**
 */
package org.w3._1998.math.math.ml.impl;

import java.util.Collection;

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
import org.w3._1998.math.math.ml.ApplyContent;
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
import org.w3._1998.math.math.ml.DegreeType;
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
import org.w3._1998.math.math.ml.LogbaseType;
import org.w3._1998.math.math.ml.LowlimitType;
import org.w3._1998.math.math.ml.MinusType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MomentaboutType;
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
 * An implementation of the model object '<em><b>Apply Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBvar <em>Bvar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDomainofapplication <em>Domainofapplication</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLowlimit <em>Lowlimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUplimit <em>Uplimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getMomentabout <em>Momentabout</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLogbase <em>Logbase</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getContExp <em>Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getApply1 <em>Apply1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBind1 <em>Bind1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCi1 <em>Ci1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCn1 <em>Cn1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCsymbol1 <em>Csymbol1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCbytes1 <em>Cbytes1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCerror1 <em>Cerror1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCs1 <em>Cs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getShare1 <em>Share1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPiecewise1 <em>Piecewise1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDeprecatedContExpGroup1 <em>Deprecated Cont Exp Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDeprecatedContExp1 <em>Deprecated Cont Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntervalClassGroup1 <em>Interval Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntervalClass1 <em>Interval Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryFunctionalClassGroup1 <em>Unary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryFunctionalClass1 <em>Unary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLambdaClassGroup1 <em>Lambda Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLambdaClass1 <em>Lambda Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryFunctionalClassGroup1 <em>Nary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryFunctionalClass1 <em>Nary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQuotient1 <em>Quotient1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDivide1 <em>Divide1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getMinus1 <em>Minus1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPower1 <em>Power1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getRem1 <em>Rem1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getRoot1 <em>Root1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getFactorial1 <em>Factorial1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getAbs1 <em>Abs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConjugate1 <em>Conjugate1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getReal1 <em>Real1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getImaginary1 <em>Imaginary1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getFloor1 <em>Floor1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getCeiling1 <em>Ceiling1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryMinmaxClassGroup1 <em>Nary Minmax Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryMinmaxClass1 <em>Nary Minmax Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryArithClassGroup1 <em>Nary Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryArithClass1 <em>Nary Arith Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLogicalClassGroup1 <em>Nary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLogicalClass1 <em>Nary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLogicalClassGroup1 <em>Unary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLogicalClass1 <em>Unary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLogicalClassGroup1 <em>Binary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLogicalClass1 <em>Binary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQuantifierClassGroup1 <em>Quantifier Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getQuantifierClass1 <em>Quantifier Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryRelnClassGroup1 <em>Nary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryRelnClass1 <em>Nary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryRelnClassGroup1 <em>Binary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryRelnClass1 <em>Binary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntClassGroup1 <em>Int Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getIntClass1 <em>Int Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDifferentialOperatorClassGroup1 <em>Differential Operator Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getDifferentialOperatorClass1 <em>Differential Operator Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPartialdiffClassGroup1 <em>Partialdiff Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getPartialdiffClass1 <em>Partialdiff Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryVeccalcClassGroup1 <em>Unary Veccalc Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryVeccalcClass1 <em>Unary Veccalc Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetlistConstructorClassGroup1 <em>Nary Setlist Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetlistConstructorClass1 <em>Nary Setlist Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetClassGroup1 <em>Nary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetClass1 <em>Nary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinarySetClassGroup1 <em>Binary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinarySetClass1 <em>Binary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetRelnClassGroup1 <em>Nary Set Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNarySetRelnClass1 <em>Nary Set Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnarySetClassGroup1 <em>Unary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnarySetClass1 <em>Unary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getSumClassGroup1 <em>Sum Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getSumClass1 <em>Sum Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getProductClassGroup1 <em>Product Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getProductClass1 <em>Product Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLimitClassGroup1 <em>Limit Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getLimitClass1 <em>Limit Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryElementaryClassGroup1 <em>Unary Elementary Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryElementaryClass1 <em>Unary Elementary Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryStatsClassGroup1 <em>Nary Stats Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryStatsClass1 <em>Nary Stats Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryConstructorClassGroup1 <em>Nary Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryConstructorClass1 <em>Nary Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLinalgClassGroup1 <em>Unary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getUnaryLinalgClass1 <em>Unary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLinalgClassGroup1 <em>Nary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getNaryLinalgClass1 <em>Nary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLinalgClassGroup1 <em>Binary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getBinaryLinalgClass1 <em>Binary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantSetClassGroup1 <em>Constant Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantSetClass1 <em>Constant Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantArithClassGroup1 <em>Constant Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ApplyContentImpl#getConstantArithClass1 <em>Constant Arith Class1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyContentImpl extends MinimalEObjectImpl.Container implements ApplyContent {
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
	 * The cached value of the '{@link #getBvar() <em>Bvar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvar()
	 * @generated
	 * @ordered
	 */
	protected EList<BvarType> bvar;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap qualifier;

	/**
	 * The cached value of the '{@link #getContExp() <em>Cont Exp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContExp()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getApplyContent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__APPLY, oldApply, newApply);
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
				msgs = ((InternalEObject)apply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__APPLY, null, msgs);
			if (newApply != null)
				msgs = ((InternalEObject)newApply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__APPLY, null, msgs);
			msgs = basicSetApply(newApply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__APPLY, newApply, newApply));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__BIND, oldBind, newBind);
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
				msgs = ((InternalEObject)bind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__BIND, null, msgs);
			if (newBind != null)
				msgs = ((InternalEObject)newBind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__BIND, null, msgs);
			msgs = basicSetBind(newBind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__BIND, newBind, newBind));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CI, oldCi, newCi);
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
				msgs = ((InternalEObject)ci).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CI, null, msgs);
			if (newCi != null)
				msgs = ((InternalEObject)newCi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CI, null, msgs);
			msgs = basicSetCi(newCi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CI, newCi, newCi));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CN, oldCn, newCn);
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
				msgs = ((InternalEObject)cn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CN, null, msgs);
			if (newCn != null)
				msgs = ((InternalEObject)newCn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CN, null, msgs);
			msgs = basicSetCn(newCn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CN, newCn, newCn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CSYMBOL, oldCsymbol, newCsymbol);
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
				msgs = ((InternalEObject)csymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CSYMBOL, null, msgs);
			if (newCsymbol != null)
				msgs = ((InternalEObject)newCsymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CSYMBOL, null, msgs);
			msgs = basicSetCsymbol(newCsymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CSYMBOL, newCsymbol, newCsymbol));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CBYTES, oldCbytes, newCbytes);
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
				msgs = ((InternalEObject)cbytes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CBYTES, null, msgs);
			if (newCbytes != null)
				msgs = ((InternalEObject)newCbytes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CBYTES, null, msgs);
			msgs = basicSetCbytes(newCbytes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CBYTES, newCbytes, newCbytes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CERROR, oldCerror, newCerror);
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
				msgs = ((InternalEObject)cerror).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CERROR, null, msgs);
			if (newCerror != null)
				msgs = ((InternalEObject)newCerror).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CERROR, null, msgs);
			msgs = basicSetCerror(newCerror, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CERROR, newCerror, newCerror));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CS, oldCs, newCs);
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
				msgs = ((InternalEObject)cs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject)newCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CS, newCs, newCs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__SHARE, oldShare, newShare);
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
				msgs = ((InternalEObject)share).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__SHARE, null, msgs);
			if (newShare != null)
				msgs = ((InternalEObject)newShare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__SHARE, null, msgs);
			msgs = basicSetShare(newShare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__SHARE, newShare, newShare));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__PIECEWISE, oldPiecewise, newPiecewise);
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
				msgs = ((InternalEObject)piecewise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__PIECEWISE, null, msgs);
			if (newPiecewise != null)
				msgs = ((InternalEObject)newPiecewise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__PIECEWISE, null, msgs);
			msgs = basicSetPiecewise(newPiecewise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__PIECEWISE, newPiecewise, newPiecewise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup() {
		if (deprecatedContExpGroup == null) {
			deprecatedContExpGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP);
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
		return (EObject)getDeprecatedContExpGroup().get(MlPackage.eINSTANCE.getApplyContent_DeprecatedContExp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecatedContExp(EObject newDeprecatedContExp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDeprecatedContExpGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_DeprecatedContExp(), newDeprecatedContExp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup() {
		if (intervalClassGroup == null) {
			intervalClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP);
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
		return (IntervalClassType)getIntervalClassGroup().get(MlPackage.eINSTANCE.getApplyContent_IntervalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalClass(IntervalClassType newIntervalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntervalClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_IntervalClass(), newIntervalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup() {
		if (unaryFunctionalClassGroup == null) {
			unaryFunctionalClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP);
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
		return (UnaryFunctionalClassType)getUnaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getApplyContent_UnaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryFunctionalClass(UnaryFunctionalClassType newUnaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_UnaryFunctionalClass(), newUnaryFunctionalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup() {
		if (lambdaClassGroup == null) {
			lambdaClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP);
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
		return (LambdaClassType)getLambdaClassGroup().get(MlPackage.eINSTANCE.getApplyContent_LambdaClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaClass(LambdaClassType newLambdaClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLambdaClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_LambdaClass(), newLambdaClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup() {
		if (naryFunctionalClassGroup == null) {
			naryFunctionalClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP);
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
		return (NaryFunctionalClassType)getNaryFunctionalClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryFunctionalClass(NaryFunctionalClassType newNaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryFunctionalClass(), newNaryFunctionalClass, msgs);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__QUOTIENT, oldQuotient, newQuotient);
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
				msgs = ((InternalEObject)quotient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__QUOTIENT, null, msgs);
			if (newQuotient != null)
				msgs = ((InternalEObject)newQuotient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__QUOTIENT, null, msgs);
			msgs = basicSetQuotient(newQuotient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__QUOTIENT, newQuotient, newQuotient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__DIVIDE, oldDivide, newDivide);
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
				msgs = ((InternalEObject)divide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__DIVIDE, null, msgs);
			if (newDivide != null)
				msgs = ((InternalEObject)newDivide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__DIVIDE, null, msgs);
			msgs = basicSetDivide(newDivide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__DIVIDE, newDivide, newDivide));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__MINUS, oldMinus, newMinus);
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
				msgs = ((InternalEObject)minus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__MINUS, null, msgs);
			if (newMinus != null)
				msgs = ((InternalEObject)newMinus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__MINUS, null, msgs);
			msgs = basicSetMinus(newMinus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__MINUS, newMinus, newMinus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__POWER, oldPower, newPower);
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
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__POWER, newPower, newPower));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__REM, oldRem, newRem);
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
				msgs = ((InternalEObject)rem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__REM, null, msgs);
			if (newRem != null)
				msgs = ((InternalEObject)newRem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__REM, null, msgs);
			msgs = basicSetRem(newRem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__REM, newRem, newRem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__ROOT, oldRoot, newRoot);
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
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__ROOT, newRoot, newRoot));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__FACTORIAL, oldFactorial, newFactorial);
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
				msgs = ((InternalEObject)factorial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__FACTORIAL, null, msgs);
			if (newFactorial != null)
				msgs = ((InternalEObject)newFactorial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__FACTORIAL, null, msgs);
			msgs = basicSetFactorial(newFactorial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__FACTORIAL, newFactorial, newFactorial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__ABS, oldAbs, newAbs);
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
				msgs = ((InternalEObject)abs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__ABS, null, msgs);
			if (newAbs != null)
				msgs = ((InternalEObject)newAbs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__ABS, null, msgs);
			msgs = basicSetAbs(newAbs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__ABS, newAbs, newAbs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CONJUGATE, oldConjugate, newConjugate);
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
				msgs = ((InternalEObject)conjugate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CONJUGATE, null, msgs);
			if (newConjugate != null)
				msgs = ((InternalEObject)newConjugate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CONJUGATE, null, msgs);
			msgs = basicSetConjugate(newConjugate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CONJUGATE, newConjugate, newConjugate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__ARG, oldArg, newArg);
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
				msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__ARG, null, msgs);
			if (newArg != null)
				msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__ARG, null, msgs);
			msgs = basicSetArg(newArg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__ARG, newArg, newArg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__REAL, oldReal, newReal);
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
				msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__REAL, null, msgs);
			if (newReal != null)
				msgs = ((InternalEObject)newReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__REAL, null, msgs);
			msgs = basicSetReal(newReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__REAL, newReal, newReal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__IMAGINARY, oldImaginary, newImaginary);
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
				msgs = ((InternalEObject)imaginary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__IMAGINARY, null, msgs);
			if (newImaginary != null)
				msgs = ((InternalEObject)newImaginary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__IMAGINARY, null, msgs);
			msgs = basicSetImaginary(newImaginary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__IMAGINARY, newImaginary, newImaginary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__FLOOR, oldFloor, newFloor);
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
				msgs = ((InternalEObject)floor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__FLOOR, null, msgs);
			if (newFloor != null)
				msgs = ((InternalEObject)newFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__FLOOR, null, msgs);
			msgs = basicSetFloor(newFloor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__FLOOR, newFloor, newFloor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CEILING, oldCeiling, newCeiling);
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
				msgs = ((InternalEObject)ceiling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CEILING, null, msgs);
			if (newCeiling != null)
				msgs = ((InternalEObject)newCeiling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__CEILING, null, msgs);
			msgs = basicSetCeiling(newCeiling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__CEILING, newCeiling, newCeiling));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__EXP, oldExp, newExp);
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
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.APPLY_CONTENT__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.APPLY_CONTENT__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup() {
		if (naryMinmaxClassGroup == null) {
			naryMinmaxClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP);
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
		return (NaryMinmaxClassType)getNaryMinmaxClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryMinmaxClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryMinmaxClass(NaryMinmaxClassType newNaryMinmaxClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryMinmaxClass(), newNaryMinmaxClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup() {
		if (naryArithClassGroup == null) {
			naryArithClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP);
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
		return (NaryArithClassType)getNaryArithClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryArithClass(NaryArithClassType newNaryArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryArithClass(), newNaryArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup() {
		if (naryLogicalClassGroup == null) {
			naryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP);
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
		return (NaryLogicalClassType)getNaryLogicalClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLogicalClass(NaryLogicalClassType newNaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryLogicalClass(), newNaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup() {
		if (unaryLogicalClassGroup == null) {
			unaryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP);
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
		return (UnaryLogicalClassType)getUnaryLogicalClassGroup().get(MlPackage.eINSTANCE.getApplyContent_UnaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLogicalClass(UnaryLogicalClassType newUnaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_UnaryLogicalClass(), newUnaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup() {
		if (binaryLogicalClassGroup == null) {
			binaryLogicalClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP);
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
		return (BinaryLogicalClassType)getBinaryLogicalClassGroup().get(MlPackage.eINSTANCE.getApplyContent_BinaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLogicalClass(BinaryLogicalClassType newBinaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_BinaryLogicalClass(), newBinaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup() {
		if (quantifierClassGroup == null) {
			quantifierClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP);
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
		return (QuantifierClassType)getQuantifierClassGroup().get(MlPackage.eINSTANCE.getApplyContent_QuantifierClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifierClass(QuantifierClassType newQuantifierClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getQuantifierClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_QuantifierClass(), newQuantifierClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup() {
		if (naryRelnClassGroup == null) {
			naryRelnClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP);
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
		return (NaryRelnClassType)getNaryRelnClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryRelnClass(NaryRelnClassType newNaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryRelnClass(), newNaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup() {
		if (binaryRelnClassGroup == null) {
			binaryRelnClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP);
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
		return (EObject)getBinaryRelnClassGroup().get(MlPackage.eINSTANCE.getApplyContent_BinaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryRelnClass(EObject newBinaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_BinaryRelnClass(), newBinaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup() {
		if (intClassGroup == null) {
			intClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__INT_CLASS_GROUP);
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
		return (IntClassType)getIntClassGroup().get(MlPackage.eINSTANCE.getApplyContent_IntClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntClass(IntClassType newIntClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIntClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_IntClass(), newIntClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup() {
		if (differentialOperatorClassGroup == null) {
			differentialOperatorClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP);
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
		return (DifferentialOperatorClassType)getDifferentialOperatorClassGroup().get(MlPackage.eINSTANCE.getApplyContent_DifferentialOperatorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferentialOperatorClass(DifferentialOperatorClassType newDifferentialOperatorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_DifferentialOperatorClass(), newDifferentialOperatorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup() {
		if (partialdiffClassGroup == null) {
			partialdiffClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP);
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
		return (PartialdiffClassType)getPartialdiffClassGroup().get(MlPackage.eINSTANCE.getApplyContent_PartialdiffClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialdiffClass(PartialdiffClassType newPartialdiffClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPartialdiffClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_PartialdiffClass(), newPartialdiffClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup() {
		if (unaryVeccalcClassGroup == null) {
			unaryVeccalcClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP);
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
		return (UnaryVeccalcClassType)getUnaryVeccalcClassGroup().get(MlPackage.eINSTANCE.getApplyContent_UnaryVeccalcClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryVeccalcClass(UnaryVeccalcClassType newUnaryVeccalcClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_UnaryVeccalcClass(), newUnaryVeccalcClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup() {
		if (narySetlistConstructorClassGroup == null) {
			narySetlistConstructorClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP);
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
		return (EObject)getNarySetlistConstructorClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NarySetlistConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetlistConstructorClass(EObject newNarySetlistConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NarySetlistConstructorClass(), newNarySetlistConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup() {
		if (narySetClassGroup == null) {
			narySetClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP);
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
		return (NarySetClassType)getNarySetClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetClass(NarySetClassType newNarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NarySetClass(), newNarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup() {
		if (binarySetClassGroup == null) {
			binarySetClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP);
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
		return (BinarySetClassType)getBinarySetClassGroup().get(MlPackage.eINSTANCE.getApplyContent_BinarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySetClass(BinarySetClassType newBinarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_BinarySetClass(), newBinarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup() {
		if (narySetRelnClassGroup == null) {
			narySetRelnClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP);
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
		return (NarySetRelnClassType)getNarySetRelnClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NarySetRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetRelnClass(NarySetRelnClassType newNarySetRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNarySetRelnClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NarySetRelnClass(), newNarySetRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup() {
		if (unarySetClassGroup == null) {
			unarySetClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP);
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
		return (UnarySetClassType)getUnarySetClassGroup().get(MlPackage.eINSTANCE.getApplyContent_UnarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnarySetClass(UnarySetClassType newUnarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnarySetClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_UnarySetClass(), newUnarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup() {
		if (sumClassGroup == null) {
			sumClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP);
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
		return (SumClassType)getSumClassGroup().get(MlPackage.eINSTANCE.getApplyContent_SumClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSumClass(SumClassType newSumClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSumClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_SumClass(), newSumClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup() {
		if (productClassGroup == null) {
			productClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP);
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
		return (ProductClassType)getProductClassGroup().get(MlPackage.eINSTANCE.getApplyContent_ProductClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductClass(ProductClassType newProductClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getProductClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_ProductClass(), newProductClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup() {
		if (limitClassGroup == null) {
			limitClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP);
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
		return (LimitClassType)getLimitClassGroup().get(MlPackage.eINSTANCE.getApplyContent_LimitClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitClass(LimitClassType newLimitClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLimitClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_LimitClass(), newLimitClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup() {
		if (unaryElementaryClassGroup == null) {
			unaryElementaryClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP);
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
		return (UnaryElementaryClassType)getUnaryElementaryClassGroup().get(MlPackage.eINSTANCE.getApplyContent_UnaryElementaryClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryElementaryClass(UnaryElementaryClassType newUnaryElementaryClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_UnaryElementaryClass(), newUnaryElementaryClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup() {
		if (naryStatsClassGroup == null) {
			naryStatsClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP);
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
		return (NaryStatsClassType)getNaryStatsClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryStatsClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryStatsClass(NaryStatsClassType newNaryStatsClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryStatsClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryStatsClass(), newNaryStatsClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup() {
		if (naryConstructorClassGroup == null) {
			naryConstructorClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP);
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
		return (NaryConstructorClassType)getNaryConstructorClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryConstructorClass(NaryConstructorClassType newNaryConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryConstructorClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryConstructorClass(), newNaryConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup() {
		if (unaryLinalgClassGroup == null) {
			unaryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP);
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
		return (UnaryLinalgClassType)getUnaryLinalgClassGroup().get(MlPackage.eINSTANCE.getApplyContent_UnaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLinalgClass(UnaryLinalgClassType newUnaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_UnaryLinalgClass(), newUnaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup() {
		if (naryLinalgClassGroup == null) {
			naryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP);
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
		return (NaryLinalgClassType)getNaryLinalgClassGroup().get(MlPackage.eINSTANCE.getApplyContent_NaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLinalgClass(NaryLinalgClassType newNaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_NaryLinalgClass(), newNaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup() {
		if (binaryLinalgClassGroup == null) {
			binaryLinalgClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP);
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
		return (BinaryLinalgClassType)getBinaryLinalgClassGroup().get(MlPackage.eINSTANCE.getApplyContent_BinaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLinalgClass(BinaryLinalgClassType newBinaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_BinaryLinalgClass(), newBinaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup() {
		if (constantSetClassGroup == null) {
			constantSetClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP);
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
		return (ConstantSetClassType)getConstantSetClassGroup().get(MlPackage.eINSTANCE.getApplyContent_ConstantSetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantSetClass(ConstantSetClassType newConstantSetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantSetClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_ConstantSetClass(), newConstantSetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup() {
		if (constantArithClassGroup == null) {
			constantArithClassGroup = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP);
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
		return (ConstantArithClassType)getConstantArithClassGroup().get(MlPackage.eINSTANCE.getApplyContent_ConstantArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantArithClass(ConstantArithClassType newConstantArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getConstantArithClassGroup()).basicAdd(MlPackage.eINSTANCE.getApplyContent_ConstantArithClass(), newConstantArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BvarType> getBvar() {
		if (bvar == null) {
			bvar = new EObjectContainmentEList<BvarType>(BvarType.class, this, MlPackage.APPLY_CONTENT__BVAR);
		}
		return bvar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQualifier() {
		if (qualifier == null) {
			qualifier = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainofapplicationType> getDomainofapplication() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Domainofapplication());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionType> getCondition() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Condition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LowlimitType> getLowlimit() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Lowlimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UplimitType> getUplimit() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Uplimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeType> getDegree() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Degree());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MomentaboutType> getMomentabout() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Momentabout());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogbaseType> getLogbase() {
		return getQualifier().list(MlPackage.eINSTANCE.getApplyContent_Logbase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContExp() {
		if (contExp == null) {
			contExp = new BasicFeatureMap(this, MlPackage.APPLY_CONTENT__CONT_EXP);
		}
		return contExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplyType> getApply1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Apply1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindType> getBind1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Bind1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiType> getCi1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Ci1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CnType> getCn1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Cn1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsymbolType> getCsymbol1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Csymbol1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CbytesType> getCbytes1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Cbytes1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CerrorType> getCerror1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Cerror1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsType> getCs1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Cs1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShareType> getShare1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Share1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PiecewiseType> getPiecewise1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Piecewise1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_DeprecatedContExpGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDeprecatedContExp1() {
		return getDeprecatedContExpGroup().list(MlPackage.eINSTANCE.getApplyContent_DeprecatedContExp1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_IntervalClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntervalClassType> getIntervalClass1() {
		return getIntervalClassGroup().list(MlPackage.eINSTANCE.getApplyContent_IntervalClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_UnaryFunctionalClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryFunctionalClassType> getUnaryFunctionalClass1() {
		return getUnaryFunctionalClassGroup().list(MlPackage.eINSTANCE.getApplyContent_UnaryFunctionalClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_LambdaClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LambdaClassType> getLambdaClass1() {
		return getLambdaClassGroup().list(MlPackage.eINSTANCE.getApplyContent_LambdaClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryFunctionalClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryFunctionalClassType> getNaryFunctionalClass1() {
		return getNaryFunctionalClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryFunctionalClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuotientType> getQuotient1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Quotient1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DivideType> getDivide1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Divide1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MinusType> getMinus1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Minus1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PowerType> getPower1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Power1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemType> getRem1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Rem1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootType> getRoot1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Root1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FactorialType> getFactorial1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Factorial1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbsType> getAbs1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Abs1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConjugateType> getConjugate1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Conjugate1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgType> getArg1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Arg1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RealType> getReal1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Real1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImaginaryType> getImaginary1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Imaginary1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FloorType> getFloor1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Floor1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CeilingType> getCeiling1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Ceiling1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpType> getExp1() {
		return getContExp().list(MlPackage.eINSTANCE.getApplyContent_Exp1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryMinmaxClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryMinmaxClassType> getNaryMinmaxClass1() {
		return getNaryMinmaxClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryMinmaxClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryArithClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryArithClassType> getNaryArithClass1() {
		return getNaryArithClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryArithClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryLogicalClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryLogicalClassType> getNaryLogicalClass1() {
		return getNaryLogicalClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryLogicalClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_UnaryLogicalClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryLogicalClassType> getUnaryLogicalClass1() {
		return getUnaryLogicalClassGroup().list(MlPackage.eINSTANCE.getApplyContent_UnaryLogicalClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_BinaryLogicalClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryLogicalClassType> getBinaryLogicalClass1() {
		return getBinaryLogicalClassGroup().list(MlPackage.eINSTANCE.getApplyContent_BinaryLogicalClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_QuantifierClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuantifierClassType> getQuantifierClass1() {
		return getQuantifierClassGroup().list(MlPackage.eINSTANCE.getApplyContent_QuantifierClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryRelnClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryRelnClassType> getNaryRelnClass1() {
		return getNaryRelnClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryRelnClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_BinaryRelnClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getBinaryRelnClass1() {
		return getBinaryRelnClassGroup().list(MlPackage.eINSTANCE.getApplyContent_BinaryRelnClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_IntClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntClassType> getIntClass1() {
		return getIntClassGroup().list(MlPackage.eINSTANCE.getApplyContent_IntClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_DifferentialOperatorClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DifferentialOperatorClassType> getDifferentialOperatorClass1() {
		return getDifferentialOperatorClassGroup().list(MlPackage.eINSTANCE.getApplyContent_DifferentialOperatorClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_PartialdiffClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartialdiffClassType> getPartialdiffClass1() {
		return getPartialdiffClassGroup().list(MlPackage.eINSTANCE.getApplyContent_PartialdiffClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_UnaryVeccalcClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryVeccalcClassType> getUnaryVeccalcClass1() {
		return getUnaryVeccalcClassGroup().list(MlPackage.eINSTANCE.getApplyContent_UnaryVeccalcClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NarySetlistConstructorClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getNarySetlistConstructorClass1() {
		return getNarySetlistConstructorClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NarySetlistConstructorClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NarySetClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NarySetClassType> getNarySetClass1() {
		return getNarySetClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NarySetClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_BinarySetClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinarySetClassType> getBinarySetClass1() {
		return getBinarySetClassGroup().list(MlPackage.eINSTANCE.getApplyContent_BinarySetClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NarySetRelnClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NarySetRelnClassType> getNarySetRelnClass1() {
		return getNarySetRelnClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NarySetRelnClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_UnarySetClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnarySetClassType> getUnarySetClass1() {
		return getUnarySetClassGroup().list(MlPackage.eINSTANCE.getApplyContent_UnarySetClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_SumClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SumClassType> getSumClass1() {
		return getSumClassGroup().list(MlPackage.eINSTANCE.getApplyContent_SumClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_ProductClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductClassType> getProductClass1() {
		return getProductClassGroup().list(MlPackage.eINSTANCE.getApplyContent_ProductClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_LimitClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LimitClassType> getLimitClass1() {
		return getLimitClassGroup().list(MlPackage.eINSTANCE.getApplyContent_LimitClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_UnaryElementaryClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryElementaryClassType> getUnaryElementaryClass1() {
		return getUnaryElementaryClassGroup().list(MlPackage.eINSTANCE.getApplyContent_UnaryElementaryClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryStatsClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryStatsClassType> getNaryStatsClass1() {
		return getNaryStatsClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryStatsClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryConstructorClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryConstructorClassType> getNaryConstructorClass1() {
		return getNaryConstructorClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryConstructorClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_UnaryLinalgClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryLinalgClassType> getUnaryLinalgClass1() {
		return getUnaryLinalgClassGroup().list(MlPackage.eINSTANCE.getApplyContent_UnaryLinalgClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_NaryLinalgClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryLinalgClassType> getNaryLinalgClass1() {
		return getNaryLinalgClassGroup().list(MlPackage.eINSTANCE.getApplyContent_NaryLinalgClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_BinaryLinalgClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryLinalgClassType> getBinaryLinalgClass1() {
		return getBinaryLinalgClassGroup().list(MlPackage.eINSTANCE.getApplyContent_BinaryLinalgClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_ConstantSetClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantSetClassType> getConstantSetClass1() {
		return getConstantSetClassGroup().list(MlPackage.eINSTANCE.getApplyContent_ConstantSetClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup1() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getApplyContent_ConstantArithClassGroup1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantArithClassType> getConstantArithClass1() {
		return getConstantArithClassGroup().list(MlPackage.eINSTANCE.getApplyContent_ConstantArithClass1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlPackage.APPLY_CONTENT__APPLY:
				return basicSetApply(null, msgs);
			case MlPackage.APPLY_CONTENT__BIND:
				return basicSetBind(null, msgs);
			case MlPackage.APPLY_CONTENT__CI:
				return basicSetCi(null, msgs);
			case MlPackage.APPLY_CONTENT__CN:
				return basicSetCn(null, msgs);
			case MlPackage.APPLY_CONTENT__CSYMBOL:
				return basicSetCsymbol(null, msgs);
			case MlPackage.APPLY_CONTENT__CBYTES:
				return basicSetCbytes(null, msgs);
			case MlPackage.APPLY_CONTENT__CERROR:
				return basicSetCerror(null, msgs);
			case MlPackage.APPLY_CONTENT__CS:
				return basicSetCs(null, msgs);
			case MlPackage.APPLY_CONTENT__SHARE:
				return basicSetShare(null, msgs);
			case MlPackage.APPLY_CONTENT__PIECEWISE:
				return basicSetPiecewise(null, msgs);
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP:
				return ((InternalEList<?>)getDeprecatedContExpGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP:
				return basicSetDeprecatedContExp(null, msgs);
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP:
				return ((InternalEList<?>)getIntervalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS:
				return basicSetIntervalClass(null, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS:
				return basicSetUnaryFunctionalClass(null, msgs);
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP:
				return ((InternalEList<?>)getLambdaClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS:
				return basicSetLambdaClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS:
				return basicSetNaryFunctionalClass(null, msgs);
			case MlPackage.APPLY_CONTENT__QUOTIENT:
				return basicSetQuotient(null, msgs);
			case MlPackage.APPLY_CONTENT__DIVIDE:
				return basicSetDivide(null, msgs);
			case MlPackage.APPLY_CONTENT__MINUS:
				return basicSetMinus(null, msgs);
			case MlPackage.APPLY_CONTENT__POWER:
				return basicSetPower(null, msgs);
			case MlPackage.APPLY_CONTENT__REM:
				return basicSetRem(null, msgs);
			case MlPackage.APPLY_CONTENT__ROOT:
				return basicSetRoot(null, msgs);
			case MlPackage.APPLY_CONTENT__FACTORIAL:
				return basicSetFactorial(null, msgs);
			case MlPackage.APPLY_CONTENT__ABS:
				return basicSetAbs(null, msgs);
			case MlPackage.APPLY_CONTENT__CONJUGATE:
				return basicSetConjugate(null, msgs);
			case MlPackage.APPLY_CONTENT__ARG:
				return basicSetArg(null, msgs);
			case MlPackage.APPLY_CONTENT__REAL:
				return basicSetReal(null, msgs);
			case MlPackage.APPLY_CONTENT__IMAGINARY:
				return basicSetImaginary(null, msgs);
			case MlPackage.APPLY_CONTENT__FLOOR:
				return basicSetFloor(null, msgs);
			case MlPackage.APPLY_CONTENT__CEILING:
				return basicSetCeiling(null, msgs);
			case MlPackage.APPLY_CONTENT__EXP:
				return basicSetExp(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP:
				return ((InternalEList<?>)getNaryMinmaxClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS:
				return basicSetNaryMinmaxClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getNaryArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS:
				return basicSetNaryArithClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS:
				return basicSetNaryLogicalClass(null, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS:
				return basicSetUnaryLogicalClass(null, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS:
				return basicSetBinaryLogicalClass(null, msgs);
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP:
				return ((InternalEList<?>)getQuantifierClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS:
				return basicSetQuantifierClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS:
				return basicSetNaryRelnClass(null, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS:
				return basicSetBinaryRelnClass(null, msgs);
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP:
				return ((InternalEList<?>)getIntClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__INT_CLASS:
				return basicSetIntClass(null, msgs);
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS:
				return basicSetDifferentialOperatorClass(null, msgs);
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP:
				return ((InternalEList<?>)getPartialdiffClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS:
				return basicSetPartialdiffClass(null, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS:
				return basicSetUnaryVeccalcClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return basicSetNarySetlistConstructorClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS:
				return basicSetNarySetClass(null, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getBinarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS:
				return basicSetBinarySetClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS:
				return basicSetNarySetRelnClass(null, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getUnarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS:
				return basicSetUnarySetClass(null, msgs);
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP:
				return ((InternalEList<?>)getSumClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__SUM_CLASS:
				return basicSetSumClass(null, msgs);
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP:
				return ((InternalEList<?>)getProductClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS:
				return basicSetProductClass(null, msgs);
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP:
				return ((InternalEList<?>)getLimitClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS:
				return basicSetLimitClass(null, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryElementaryClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS:
				return basicSetUnaryElementaryClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP:
				return ((InternalEList<?>)getNaryStatsClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS:
				return basicSetNaryStatsClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNaryConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS:
				return basicSetNaryConstructorClass(null, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS:
				return basicSetUnaryLinalgClass(null, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS:
				return basicSetNaryLinalgClass(null, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS:
				return basicSetBinaryLinalgClass(null, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP:
				return ((InternalEList<?>)getConstantSetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS:
				return basicSetConstantSetClass(null, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getConstantArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS:
				return basicSetConstantArithClass(null, msgs);
			case MlPackage.APPLY_CONTENT__BVAR:
				return ((InternalEList<?>)getBvar()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DOMAINOFAPPLICATION:
				return ((InternalEList<?>)getDomainofapplication()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LOWLIMIT:
				return ((InternalEList<?>)getLowlimit()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UPLIMIT:
				return ((InternalEList<?>)getUplimit()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DEGREE:
				return ((InternalEList<?>)getDegree()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__MOMENTABOUT:
				return ((InternalEList<?>)getMomentabout()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LOGBASE:
				return ((InternalEList<?>)getLogbase()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONT_EXP:
				return ((InternalEList<?>)getContExp()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__APPLY1:
				return ((InternalEList<?>)getApply1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BIND1:
				return ((InternalEList<?>)getBind1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CI1:
				return ((InternalEList<?>)getCi1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CN1:
				return ((InternalEList<?>)getCn1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CSYMBOL1:
				return ((InternalEList<?>)getCsymbol1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CBYTES1:
				return ((InternalEList<?>)getCbytes1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CERROR1:
				return ((InternalEList<?>)getCerror1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CS1:
				return ((InternalEList<?>)getCs1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__SHARE1:
				return ((InternalEList<?>)getShare1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PIECEWISE1:
				return ((InternalEList<?>)getPiecewise1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP1:
				return ((InternalEList<?>)getDeprecatedContExpGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP1:
				return ((InternalEList<?>)getDeprecatedContExp1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP1:
				return ((InternalEList<?>)getIntervalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS1:
				return ((InternalEList<?>)getIntervalClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS1:
				return ((InternalEList<?>)getUnaryFunctionalClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP1:
				return ((InternalEList<?>)getLambdaClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS1:
				return ((InternalEList<?>)getLambdaClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryFunctionalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS1:
				return ((InternalEList<?>)getNaryFunctionalClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__QUOTIENT1:
				return ((InternalEList<?>)getQuotient1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DIVIDE1:
				return ((InternalEList<?>)getDivide1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__MINUS1:
				return ((InternalEList<?>)getMinus1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__POWER1:
				return ((InternalEList<?>)getPower1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__REM1:
				return ((InternalEList<?>)getRem1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__ROOT1:
				return ((InternalEList<?>)getRoot1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__FACTORIAL1:
				return ((InternalEList<?>)getFactorial1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__ABS1:
				return ((InternalEList<?>)getAbs1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONJUGATE1:
				return ((InternalEList<?>)getConjugate1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__ARG1:
				return ((InternalEList<?>)getArg1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__REAL1:
				return ((InternalEList<?>)getReal1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__IMAGINARY1:
				return ((InternalEList<?>)getImaginary1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__FLOOR1:
				return ((InternalEList<?>)getFloor1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CEILING1:
				return ((InternalEList<?>)getCeiling1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__EXP1:
				return ((InternalEList<?>)getExp1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryMinmaxClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS1:
				return ((InternalEList<?>)getNaryMinmaxClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryArithClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS1:
				return ((InternalEList<?>)getNaryArithClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryLogicalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS1:
				return ((InternalEList<?>)getNaryLogicalClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryLogicalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS1:
				return ((InternalEList<?>)getUnaryLogicalClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP1:
				return ((InternalEList<?>)getBinaryLogicalClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS1:
				return ((InternalEList<?>)getBinaryLogicalClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP1:
				return ((InternalEList<?>)getQuantifierClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS1:
				return ((InternalEList<?>)getQuantifierClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryRelnClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS1:
				return ((InternalEList<?>)getNaryRelnClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP1:
				return ((InternalEList<?>)getBinaryRelnClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS1:
				return ((InternalEList<?>)getBinaryRelnClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP1:
				return ((InternalEList<?>)getIntClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__INT_CLASS1:
				return ((InternalEList<?>)getIntClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS1:
				return ((InternalEList<?>)getDifferentialOperatorClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP1:
				return ((InternalEList<?>)getPartialdiffClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS1:
				return ((InternalEList<?>)getPartialdiffClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS1:
				return ((InternalEList<?>)getUnaryVeccalcClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS1:
				return ((InternalEList<?>)getNarySetlistConstructorClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getNarySetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS1:
				return ((InternalEList<?>)getNarySetClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getBinarySetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS1:
				return ((InternalEList<?>)getBinarySetClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP1:
				return ((InternalEList<?>)getNarySetRelnClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS1:
				return ((InternalEList<?>)getNarySetRelnClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getUnarySetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS1:
				return ((InternalEList<?>)getUnarySetClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP1:
				return ((InternalEList<?>)getSumClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__SUM_CLASS1:
				return ((InternalEList<?>)getSumClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP1:
				return ((InternalEList<?>)getProductClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS1:
				return ((InternalEList<?>)getProductClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP1:
				return ((InternalEList<?>)getLimitClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS1:
				return ((InternalEList<?>)getLimitClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryElementaryClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS1:
				return ((InternalEList<?>)getUnaryElementaryClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryStatsClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS1:
				return ((InternalEList<?>)getNaryStatsClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryConstructorClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS1:
				return ((InternalEList<?>)getNaryConstructorClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP1:
				return ((InternalEList<?>)getUnaryLinalgClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS1:
				return ((InternalEList<?>)getUnaryLinalgClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP1:
				return ((InternalEList<?>)getNaryLinalgClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS1:
				return ((InternalEList<?>)getNaryLinalgClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP1:
				return ((InternalEList<?>)getBinaryLinalgClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS1:
				return ((InternalEList<?>)getBinaryLinalgClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP1:
				return ((InternalEList<?>)getConstantSetClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS1:
				return ((InternalEList<?>)getConstantSetClass1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP1:
				return ((InternalEList<?>)getConstantArithClassGroup1()).basicRemove(otherEnd, msgs);
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS1:
				return ((InternalEList<?>)getConstantArithClass1()).basicRemove(otherEnd, msgs);
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
			case MlPackage.APPLY_CONTENT__APPLY:
				return getApply();
			case MlPackage.APPLY_CONTENT__BIND:
				return getBind();
			case MlPackage.APPLY_CONTENT__CI:
				return getCi();
			case MlPackage.APPLY_CONTENT__CN:
				return getCn();
			case MlPackage.APPLY_CONTENT__CSYMBOL:
				return getCsymbol();
			case MlPackage.APPLY_CONTENT__CBYTES:
				return getCbytes();
			case MlPackage.APPLY_CONTENT__CERROR:
				return getCerror();
			case MlPackage.APPLY_CONTENT__CS:
				return getCs();
			case MlPackage.APPLY_CONTENT__SHARE:
				return getShare();
			case MlPackage.APPLY_CONTENT__PIECEWISE:
				return getPiecewise();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP:
				if (coreType) return getDeprecatedContExpGroup();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP:
				if (coreType) return getIntervalClassGroup();
				return ((FeatureMap.Internal)getIntervalClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS:
				return getIntervalClass();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getUnaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP:
				if (coreType) return getLambdaClassGroup();
				return ((FeatureMap.Internal)getLambdaClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS:
				return getLambdaClass();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getNaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass();
			case MlPackage.APPLY_CONTENT__QUOTIENT:
				return getQuotient();
			case MlPackage.APPLY_CONTENT__DIVIDE:
				return getDivide();
			case MlPackage.APPLY_CONTENT__MINUS:
				return getMinus();
			case MlPackage.APPLY_CONTENT__POWER:
				return getPower();
			case MlPackage.APPLY_CONTENT__REM:
				return getRem();
			case MlPackage.APPLY_CONTENT__ROOT:
				return getRoot();
			case MlPackage.APPLY_CONTENT__FACTORIAL:
				return getFactorial();
			case MlPackage.APPLY_CONTENT__ABS:
				return getAbs();
			case MlPackage.APPLY_CONTENT__CONJUGATE:
				return getConjugate();
			case MlPackage.APPLY_CONTENT__ARG:
				return getArg();
			case MlPackage.APPLY_CONTENT__REAL:
				return getReal();
			case MlPackage.APPLY_CONTENT__IMAGINARY:
				return getImaginary();
			case MlPackage.APPLY_CONTENT__FLOOR:
				return getFloor();
			case MlPackage.APPLY_CONTENT__CEILING:
				return getCeiling();
			case MlPackage.APPLY_CONTENT__EXP:
				return getExp();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP:
				if (coreType) return getNaryMinmaxClassGroup();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP:
				if (coreType) return getNaryArithClassGroup();
				return ((FeatureMap.Internal)getNaryArithClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS:
				return getNaryArithClass();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getNaryLogicalClassGroup();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getUnaryLogicalClassGroup();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getBinaryLogicalClassGroup();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP:
				if (coreType) return getQuantifierClassGroup();
				return ((FeatureMap.Internal)getQuantifierClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS:
				return getQuantifierClass();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP:
				if (coreType) return getNaryRelnClassGroup();
				return ((FeatureMap.Internal)getNaryRelnClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS:
				return getNaryRelnClass();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP:
				if (coreType) return getBinaryRelnClassGroup();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS:
				return getBinaryRelnClass();
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP:
				if (coreType) return getIntClassGroup();
				return ((FeatureMap.Internal)getIntClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__INT_CLASS:
				return getIntClass();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				if (coreType) return getDifferentialOperatorClassGroup();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP:
				if (coreType) return getPartialdiffClassGroup();
				return ((FeatureMap.Internal)getPartialdiffClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS:
				return getPartialdiffClass();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP:
				if (coreType) return getUnaryVeccalcClassGroup();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNarySetlistConstructorClassGroup();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP:
				if (coreType) return getNarySetClassGroup();
				return ((FeatureMap.Internal)getNarySetClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS:
				return getNarySetClass();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP:
				if (coreType) return getBinarySetClassGroup();
				return ((FeatureMap.Internal)getBinarySetClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS:
				return getBinarySetClass();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP:
				if (coreType) return getNarySetRelnClassGroup();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP:
				if (coreType) return getUnarySetClassGroup();
				return ((FeatureMap.Internal)getUnarySetClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS:
				return getUnarySetClass();
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP:
				if (coreType) return getSumClassGroup();
				return ((FeatureMap.Internal)getSumClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__SUM_CLASS:
				return getSumClass();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP:
				if (coreType) return getProductClassGroup();
				return ((FeatureMap.Internal)getProductClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS:
				return getProductClass();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP:
				if (coreType) return getLimitClassGroup();
				return ((FeatureMap.Internal)getLimitClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS:
				return getLimitClass();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP:
				if (coreType) return getUnaryElementaryClassGroup();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP:
				if (coreType) return getNaryStatsClassGroup();
				return ((FeatureMap.Internal)getNaryStatsClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS:
				return getNaryStatsClass();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNaryConstructorClassGroup();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP:
				if (coreType) return getUnaryLinalgClassGroup();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP:
				if (coreType) return getNaryLinalgClassGroup();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS:
				return getNaryLinalgClass();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP:
				if (coreType) return getBinaryLinalgClassGroup();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP:
				if (coreType) return getConstantSetClassGroup();
				return ((FeatureMap.Internal)getConstantSetClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS:
				return getConstantSetClass();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP:
				if (coreType) return getConstantArithClassGroup();
				return ((FeatureMap.Internal)getConstantArithClassGroup()).getWrapper();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS:
				return getConstantArithClass();
			case MlPackage.APPLY_CONTENT__BVAR:
				return getBvar();
			case MlPackage.APPLY_CONTENT__QUALIFIER:
				if (coreType) return getQualifier();
				return ((FeatureMap.Internal)getQualifier()).getWrapper();
			case MlPackage.APPLY_CONTENT__DOMAINOFAPPLICATION:
				return getDomainofapplication();
			case MlPackage.APPLY_CONTENT__CONDITION:
				return getCondition();
			case MlPackage.APPLY_CONTENT__LOWLIMIT:
				return getLowlimit();
			case MlPackage.APPLY_CONTENT__UPLIMIT:
				return getUplimit();
			case MlPackage.APPLY_CONTENT__DEGREE:
				return getDegree();
			case MlPackage.APPLY_CONTENT__MOMENTABOUT:
				return getMomentabout();
			case MlPackage.APPLY_CONTENT__LOGBASE:
				return getLogbase();
			case MlPackage.APPLY_CONTENT__CONT_EXP:
				if (coreType) return getContExp();
				return ((FeatureMap.Internal)getContExp()).getWrapper();
			case MlPackage.APPLY_CONTENT__APPLY1:
				return getApply1();
			case MlPackage.APPLY_CONTENT__BIND1:
				return getBind1();
			case MlPackage.APPLY_CONTENT__CI1:
				return getCi1();
			case MlPackage.APPLY_CONTENT__CN1:
				return getCn1();
			case MlPackage.APPLY_CONTENT__CSYMBOL1:
				return getCsymbol1();
			case MlPackage.APPLY_CONTENT__CBYTES1:
				return getCbytes1();
			case MlPackage.APPLY_CONTENT__CERROR1:
				return getCerror1();
			case MlPackage.APPLY_CONTENT__CS1:
				return getCs1();
			case MlPackage.APPLY_CONTENT__SHARE1:
				return getShare1();
			case MlPackage.APPLY_CONTENT__PIECEWISE1:
				return getPiecewise1();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP1:
				if (coreType) return getDeprecatedContExpGroup1();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP1:
				return getDeprecatedContExp1();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP1:
				if (coreType) return getIntervalClassGroup1();
				return ((FeatureMap.Internal)getIntervalClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS1:
				return getIntervalClass1();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP1:
				if (coreType) return getUnaryFunctionalClassGroup1();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS1:
				return getUnaryFunctionalClass1();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP1:
				if (coreType) return getLambdaClassGroup1();
				return ((FeatureMap.Internal)getLambdaClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS1:
				return getLambdaClass1();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP1:
				if (coreType) return getNaryFunctionalClassGroup1();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS1:
				return getNaryFunctionalClass1();
			case MlPackage.APPLY_CONTENT__QUOTIENT1:
				return getQuotient1();
			case MlPackage.APPLY_CONTENT__DIVIDE1:
				return getDivide1();
			case MlPackage.APPLY_CONTENT__MINUS1:
				return getMinus1();
			case MlPackage.APPLY_CONTENT__POWER1:
				return getPower1();
			case MlPackage.APPLY_CONTENT__REM1:
				return getRem1();
			case MlPackage.APPLY_CONTENT__ROOT1:
				return getRoot1();
			case MlPackage.APPLY_CONTENT__FACTORIAL1:
				return getFactorial1();
			case MlPackage.APPLY_CONTENT__ABS1:
				return getAbs1();
			case MlPackage.APPLY_CONTENT__CONJUGATE1:
				return getConjugate1();
			case MlPackage.APPLY_CONTENT__ARG1:
				return getArg1();
			case MlPackage.APPLY_CONTENT__REAL1:
				return getReal1();
			case MlPackage.APPLY_CONTENT__IMAGINARY1:
				return getImaginary1();
			case MlPackage.APPLY_CONTENT__FLOOR1:
				return getFloor1();
			case MlPackage.APPLY_CONTENT__CEILING1:
				return getCeiling1();
			case MlPackage.APPLY_CONTENT__EXP1:
				return getExp1();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP1:
				if (coreType) return getNaryMinmaxClassGroup1();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS1:
				return getNaryMinmaxClass1();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP1:
				if (coreType) return getNaryArithClassGroup1();
				return ((FeatureMap.Internal)getNaryArithClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS1:
				return getNaryArithClass1();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP1:
				if (coreType) return getNaryLogicalClassGroup1();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS1:
				return getNaryLogicalClass1();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP1:
				if (coreType) return getUnaryLogicalClassGroup1();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS1:
				return getUnaryLogicalClass1();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP1:
				if (coreType) return getBinaryLogicalClassGroup1();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS1:
				return getBinaryLogicalClass1();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP1:
				if (coreType) return getQuantifierClassGroup1();
				return ((FeatureMap.Internal)getQuantifierClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS1:
				return getQuantifierClass1();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP1:
				if (coreType) return getNaryRelnClassGroup1();
				return ((FeatureMap.Internal)getNaryRelnClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS1:
				return getNaryRelnClass1();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP1:
				if (coreType) return getBinaryRelnClassGroup1();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS1:
				return getBinaryRelnClass1();
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP1:
				if (coreType) return getIntClassGroup1();
				return ((FeatureMap.Internal)getIntClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__INT_CLASS1:
				return getIntClass1();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				if (coreType) return getDifferentialOperatorClassGroup1();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS1:
				return getDifferentialOperatorClass1();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP1:
				if (coreType) return getPartialdiffClassGroup1();
				return ((FeatureMap.Internal)getPartialdiffClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS1:
				return getPartialdiffClass1();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP1:
				if (coreType) return getUnaryVeccalcClassGroup1();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS1:
				return getUnaryVeccalcClass1();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				if (coreType) return getNarySetlistConstructorClassGroup1();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS1:
				return getNarySetlistConstructorClass1();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP1:
				if (coreType) return getNarySetClassGroup1();
				return ((FeatureMap.Internal)getNarySetClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS1:
				return getNarySetClass1();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP1:
				if (coreType) return getBinarySetClassGroup1();
				return ((FeatureMap.Internal)getBinarySetClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS1:
				return getBinarySetClass1();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP1:
				if (coreType) return getNarySetRelnClassGroup1();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS1:
				return getNarySetRelnClass1();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP1:
				if (coreType) return getUnarySetClassGroup1();
				return ((FeatureMap.Internal)getUnarySetClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS1:
				return getUnarySetClass1();
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP1:
				if (coreType) return getSumClassGroup1();
				return ((FeatureMap.Internal)getSumClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__SUM_CLASS1:
				return getSumClass1();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP1:
				if (coreType) return getProductClassGroup1();
				return ((FeatureMap.Internal)getProductClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS1:
				return getProductClass1();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP1:
				if (coreType) return getLimitClassGroup1();
				return ((FeatureMap.Internal)getLimitClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS1:
				return getLimitClass1();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP1:
				if (coreType) return getUnaryElementaryClassGroup1();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS1:
				return getUnaryElementaryClass1();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP1:
				if (coreType) return getNaryStatsClassGroup1();
				return ((FeatureMap.Internal)getNaryStatsClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS1:
				return getNaryStatsClass1();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP1:
				if (coreType) return getNaryConstructorClassGroup1();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS1:
				return getNaryConstructorClass1();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP1:
				if (coreType) return getUnaryLinalgClassGroup1();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS1:
				return getUnaryLinalgClass1();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP1:
				if (coreType) return getNaryLinalgClassGroup1();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS1:
				return getNaryLinalgClass1();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP1:
				if (coreType) return getBinaryLinalgClassGroup1();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS1:
				return getBinaryLinalgClass1();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP1:
				if (coreType) return getConstantSetClassGroup1();
				return ((FeatureMap.Internal)getConstantSetClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS1:
				return getConstantSetClass1();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP1:
				if (coreType) return getConstantArithClassGroup1();
				return ((FeatureMap.Internal)getConstantArithClassGroup1()).getWrapper();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS1:
				return getConstantArithClass1();
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
			case MlPackage.APPLY_CONTENT__APPLY:
				setApply((ApplyType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__BIND:
				setBind((BindType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CI:
				setCi((CiType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CN:
				setCn((CnType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CSYMBOL:
				setCsymbol((CsymbolType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CBYTES:
				setCbytes((CbytesType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CERROR:
				setCerror((CerrorType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CS:
				setCs((CsType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__SHARE:
				setShare((ShareType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__PIECEWISE:
				setPiecewise((PiecewiseType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP:
				((FeatureMap.Internal)getDeprecatedContExpGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP:
				((FeatureMap.Internal)getIntervalClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP:
				((FeatureMap.Internal)getLambdaClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__QUOTIENT:
				setQuotient((QuotientType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__DIVIDE:
				setDivide((DivideType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__MINUS:
				setMinus((MinusType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__POWER:
				setPower((PowerType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__REM:
				setRem((RemType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__ROOT:
				setRoot((RootType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__FACTORIAL:
				setFactorial((FactorialType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__ABS:
				setAbs((AbsType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONJUGATE:
				setConjugate((ConjugateType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__ARG:
				setArg((ArgType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__REAL:
				setReal((RealType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__IMAGINARY:
				setImaginary((ImaginaryType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__FLOOR:
				setFloor((FloorType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CEILING:
				setCeiling((CeilingType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__EXP:
				setExp((ExpType)newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP:
				((FeatureMap.Internal)getNaryMinmaxClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getNaryArithClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP:
				((FeatureMap.Internal)getQuantifierClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP:
				((FeatureMap.Internal)getIntClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP:
				((FeatureMap.Internal)getPartialdiffClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getBinarySetClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetRelnClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getUnarySetClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP:
				((FeatureMap.Internal)getSumClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP:
				((FeatureMap.Internal)getProductClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP:
				((FeatureMap.Internal)getLimitClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryElementaryClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP:
				((FeatureMap.Internal)getNaryStatsClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNaryConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP:
				((FeatureMap.Internal)getConstantSetClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getConstantArithClassGroup()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BVAR:
				getBvar().clear();
				getBvar().addAll((Collection<? extends BvarType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__QUALIFIER:
				((FeatureMap.Internal)getQualifier()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__DOMAINOFAPPLICATION:
				getDomainofapplication().clear();
				getDomainofapplication().addAll((Collection<? extends DomainofapplicationType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends ConditionType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__LOWLIMIT:
				getLowlimit().clear();
				getLowlimit().addAll((Collection<? extends LowlimitType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__UPLIMIT:
				getUplimit().clear();
				getUplimit().addAll((Collection<? extends UplimitType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__DEGREE:
				getDegree().clear();
				getDegree().addAll((Collection<? extends DegreeType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__MOMENTABOUT:
				getMomentabout().clear();
				getMomentabout().addAll((Collection<? extends MomentaboutType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__LOGBASE:
				getLogbase().clear();
				getLogbase().addAll((Collection<? extends LogbaseType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONT_EXP:
				((FeatureMap.Internal)getContExp()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__APPLY1:
				getApply1().clear();
				getApply1().addAll((Collection<? extends ApplyType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__BIND1:
				getBind1().clear();
				getBind1().addAll((Collection<? extends BindType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CI1:
				getCi1().clear();
				getCi1().addAll((Collection<? extends CiType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CN1:
				getCn1().clear();
				getCn1().addAll((Collection<? extends CnType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CSYMBOL1:
				getCsymbol1().clear();
				getCsymbol1().addAll((Collection<? extends CsymbolType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CBYTES1:
				getCbytes1().clear();
				getCbytes1().addAll((Collection<? extends CbytesType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CERROR1:
				getCerror1().clear();
				getCerror1().addAll((Collection<? extends CerrorType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CS1:
				getCs1().clear();
				getCs1().addAll((Collection<? extends CsType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__SHARE1:
				getShare1().clear();
				getShare1().addAll((Collection<? extends ShareType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__PIECEWISE1:
				getPiecewise1().clear();
				getPiecewise1().addAll((Collection<? extends PiecewiseType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP1:
				((FeatureMap.Internal)getDeprecatedContExpGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP1:
				((FeatureMap.Internal)getIntervalClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP1:
				((FeatureMap.Internal)getLambdaClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryFunctionalClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__QUOTIENT1:
				getQuotient1().clear();
				getQuotient1().addAll((Collection<? extends QuotientType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__DIVIDE1:
				getDivide1().clear();
				getDivide1().addAll((Collection<? extends DivideType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__MINUS1:
				getMinus1().clear();
				getMinus1().addAll((Collection<? extends MinusType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__POWER1:
				getPower1().clear();
				getPower1().addAll((Collection<? extends PowerType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__REM1:
				getRem1().clear();
				getRem1().addAll((Collection<? extends RemType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__ROOT1:
				getRoot1().clear();
				getRoot1().addAll((Collection<? extends RootType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__FACTORIAL1:
				getFactorial1().clear();
				getFactorial1().addAll((Collection<? extends FactorialType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__ABS1:
				getAbs1().clear();
				getAbs1().addAll((Collection<? extends AbsType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONJUGATE1:
				getConjugate1().clear();
				getConjugate1().addAll((Collection<? extends ConjugateType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__ARG1:
				getArg1().clear();
				getArg1().addAll((Collection<? extends ArgType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__REAL1:
				getReal1().clear();
				getReal1().addAll((Collection<? extends RealType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__IMAGINARY1:
				getImaginary1().clear();
				getImaginary1().addAll((Collection<? extends ImaginaryType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__FLOOR1:
				getFloor1().clear();
				getFloor1().addAll((Collection<? extends FloorType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__CEILING1:
				getCeiling1().clear();
				getCeiling1().addAll((Collection<? extends CeilingType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__EXP1:
				getExp1().clear();
				getExp1().addAll((Collection<? extends ExpType>)newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryMinmaxClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryArithClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryLogicalClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryLogicalClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP1:
				((FeatureMap.Internal)getBinaryLogicalClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP1:
				((FeatureMap.Internal)getQuantifierClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryRelnClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP1:
				((FeatureMap.Internal)getBinaryRelnClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP1:
				((FeatureMap.Internal)getIntClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP1:
				((FeatureMap.Internal)getPartialdiffClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getNarySetClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getBinarySetClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP1:
				((FeatureMap.Internal)getNarySetRelnClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getUnarySetClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP1:
				((FeatureMap.Internal)getSumClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP1:
				((FeatureMap.Internal)getProductClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP1:
				((FeatureMap.Internal)getLimitClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryElementaryClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryStatsClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryConstructorClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP1:
				((FeatureMap.Internal)getUnaryLinalgClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP1:
				((FeatureMap.Internal)getNaryLinalgClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP1:
				((FeatureMap.Internal)getBinaryLinalgClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP1:
				((FeatureMap.Internal)getConstantSetClassGroup1()).set(newValue);
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP1:
				((FeatureMap.Internal)getConstantArithClassGroup1()).set(newValue);
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
			case MlPackage.APPLY_CONTENT__APPLY:
				setApply((ApplyType)null);
				return;
			case MlPackage.APPLY_CONTENT__BIND:
				setBind((BindType)null);
				return;
			case MlPackage.APPLY_CONTENT__CI:
				setCi((CiType)null);
				return;
			case MlPackage.APPLY_CONTENT__CN:
				setCn((CnType)null);
				return;
			case MlPackage.APPLY_CONTENT__CSYMBOL:
				setCsymbol((CsymbolType)null);
				return;
			case MlPackage.APPLY_CONTENT__CBYTES:
				setCbytes((CbytesType)null);
				return;
			case MlPackage.APPLY_CONTENT__CERROR:
				setCerror((CerrorType)null);
				return;
			case MlPackage.APPLY_CONTENT__CS:
				setCs((CsType)null);
				return;
			case MlPackage.APPLY_CONTENT__SHARE:
				setShare((ShareType)null);
				return;
			case MlPackage.APPLY_CONTENT__PIECEWISE:
				setPiecewise((PiecewiseType)null);
				return;
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP:
				getDeprecatedContExpGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP:
				getIntervalClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP:
				getUnaryFunctionalClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP:
				getLambdaClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP:
				getNaryFunctionalClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__QUOTIENT:
				setQuotient((QuotientType)null);
				return;
			case MlPackage.APPLY_CONTENT__DIVIDE:
				setDivide((DivideType)null);
				return;
			case MlPackage.APPLY_CONTENT__MINUS:
				setMinus((MinusType)null);
				return;
			case MlPackage.APPLY_CONTENT__POWER:
				setPower((PowerType)null);
				return;
			case MlPackage.APPLY_CONTENT__REM:
				setRem((RemType)null);
				return;
			case MlPackage.APPLY_CONTENT__ROOT:
				setRoot((RootType)null);
				return;
			case MlPackage.APPLY_CONTENT__FACTORIAL:
				setFactorial((FactorialType)null);
				return;
			case MlPackage.APPLY_CONTENT__ABS:
				setAbs((AbsType)null);
				return;
			case MlPackage.APPLY_CONTENT__CONJUGATE:
				setConjugate((ConjugateType)null);
				return;
			case MlPackage.APPLY_CONTENT__ARG:
				setArg((ArgType)null);
				return;
			case MlPackage.APPLY_CONTENT__REAL:
				setReal((RealType)null);
				return;
			case MlPackage.APPLY_CONTENT__IMAGINARY:
				setImaginary((ImaginaryType)null);
				return;
			case MlPackage.APPLY_CONTENT__FLOOR:
				setFloor((FloorType)null);
				return;
			case MlPackage.APPLY_CONTENT__CEILING:
				setCeiling((CeilingType)null);
				return;
			case MlPackage.APPLY_CONTENT__EXP:
				setExp((ExpType)null);
				return;
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP:
				getNaryMinmaxClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP:
				getNaryArithClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP:
				getNaryLogicalClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP:
				getUnaryLogicalClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP:
				getBinaryLogicalClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP:
				getQuantifierClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP:
				getNaryRelnClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP:
				getBinaryRelnClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP:
				getIntClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				getDifferentialOperatorClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP:
				getPartialdiffClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP:
				getUnaryVeccalcClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				getNarySetlistConstructorClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP:
				getNarySetClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP:
				getBinarySetClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP:
				getNarySetRelnClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP:
				getUnarySetClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP:
				getSumClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP:
				getProductClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP:
				getLimitClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP:
				getUnaryElementaryClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP:
				getNaryStatsClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP:
				getNaryConstructorClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP:
				getUnaryLinalgClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP:
				getNaryLinalgClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP:
				getBinaryLinalgClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP:
				getConstantSetClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP:
				getConstantArithClassGroup().clear();
				return;
			case MlPackage.APPLY_CONTENT__BVAR:
				getBvar().clear();
				return;
			case MlPackage.APPLY_CONTENT__QUALIFIER:
				getQualifier().clear();
				return;
			case MlPackage.APPLY_CONTENT__DOMAINOFAPPLICATION:
				getDomainofapplication().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONDITION:
				getCondition().clear();
				return;
			case MlPackage.APPLY_CONTENT__LOWLIMIT:
				getLowlimit().clear();
				return;
			case MlPackage.APPLY_CONTENT__UPLIMIT:
				getUplimit().clear();
				return;
			case MlPackage.APPLY_CONTENT__DEGREE:
				getDegree().clear();
				return;
			case MlPackage.APPLY_CONTENT__MOMENTABOUT:
				getMomentabout().clear();
				return;
			case MlPackage.APPLY_CONTENT__LOGBASE:
				getLogbase().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONT_EXP:
				getContExp().clear();
				return;
			case MlPackage.APPLY_CONTENT__APPLY1:
				getApply1().clear();
				return;
			case MlPackage.APPLY_CONTENT__BIND1:
				getBind1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CI1:
				getCi1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CN1:
				getCn1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CSYMBOL1:
				getCsymbol1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CBYTES1:
				getCbytes1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CERROR1:
				getCerror1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CS1:
				getCs1().clear();
				return;
			case MlPackage.APPLY_CONTENT__SHARE1:
				getShare1().clear();
				return;
			case MlPackage.APPLY_CONTENT__PIECEWISE1:
				getPiecewise1().clear();
				return;
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP1:
				getDeprecatedContExpGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP1:
				getIntervalClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP1:
				getUnaryFunctionalClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP1:
				getLambdaClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP1:
				getNaryFunctionalClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__QUOTIENT1:
				getQuotient1().clear();
				return;
			case MlPackage.APPLY_CONTENT__DIVIDE1:
				getDivide1().clear();
				return;
			case MlPackage.APPLY_CONTENT__MINUS1:
				getMinus1().clear();
				return;
			case MlPackage.APPLY_CONTENT__POWER1:
				getPower1().clear();
				return;
			case MlPackage.APPLY_CONTENT__REM1:
				getRem1().clear();
				return;
			case MlPackage.APPLY_CONTENT__ROOT1:
				getRoot1().clear();
				return;
			case MlPackage.APPLY_CONTENT__FACTORIAL1:
				getFactorial1().clear();
				return;
			case MlPackage.APPLY_CONTENT__ABS1:
				getAbs1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONJUGATE1:
				getConjugate1().clear();
				return;
			case MlPackage.APPLY_CONTENT__ARG1:
				getArg1().clear();
				return;
			case MlPackage.APPLY_CONTENT__REAL1:
				getReal1().clear();
				return;
			case MlPackage.APPLY_CONTENT__IMAGINARY1:
				getImaginary1().clear();
				return;
			case MlPackage.APPLY_CONTENT__FLOOR1:
				getFloor1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CEILING1:
				getCeiling1().clear();
				return;
			case MlPackage.APPLY_CONTENT__EXP1:
				getExp1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP1:
				getNaryMinmaxClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP1:
				getNaryArithClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP1:
				getNaryLogicalClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP1:
				getUnaryLogicalClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP1:
				getBinaryLogicalClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP1:
				getQuantifierClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP1:
				getNaryRelnClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP1:
				getBinaryRelnClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP1:
				getIntClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				getDifferentialOperatorClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP1:
				getPartialdiffClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP1:
				getUnaryVeccalcClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				getNarySetlistConstructorClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP1:
				getNarySetClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP1:
				getBinarySetClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP1:
				getNarySetRelnClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP1:
				getUnarySetClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP1:
				getSumClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP1:
				getProductClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP1:
				getLimitClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP1:
				getUnaryElementaryClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP1:
				getNaryStatsClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP1:
				getNaryConstructorClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP1:
				getUnaryLinalgClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP1:
				getNaryLinalgClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP1:
				getBinaryLinalgClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP1:
				getConstantSetClassGroup1().clear();
				return;
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP1:
				getConstantArithClassGroup1().clear();
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
			case MlPackage.APPLY_CONTENT__APPLY:
				return apply != null;
			case MlPackage.APPLY_CONTENT__BIND:
				return bind != null;
			case MlPackage.APPLY_CONTENT__CI:
				return ci != null;
			case MlPackage.APPLY_CONTENT__CN:
				return cn != null;
			case MlPackage.APPLY_CONTENT__CSYMBOL:
				return csymbol != null;
			case MlPackage.APPLY_CONTENT__CBYTES:
				return cbytes != null;
			case MlPackage.APPLY_CONTENT__CERROR:
				return cerror != null;
			case MlPackage.APPLY_CONTENT__CS:
				return cs != null;
			case MlPackage.APPLY_CONTENT__SHARE:
				return share != null;
			case MlPackage.APPLY_CONTENT__PIECEWISE:
				return piecewise != null;
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP:
				return deprecatedContExpGroup != null && !deprecatedContExpGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp() != null;
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP:
				return intervalClassGroup != null && !intervalClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS:
				return getIntervalClass() != null;
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP:
				return unaryFunctionalClassGroup != null && !unaryFunctionalClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass() != null;
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP:
				return lambdaClassGroup != null && !lambdaClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS:
				return getLambdaClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP:
				return naryFunctionalClassGroup != null && !naryFunctionalClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass() != null;
			case MlPackage.APPLY_CONTENT__QUOTIENT:
				return quotient != null;
			case MlPackage.APPLY_CONTENT__DIVIDE:
				return divide != null;
			case MlPackage.APPLY_CONTENT__MINUS:
				return minus != null;
			case MlPackage.APPLY_CONTENT__POWER:
				return power != null;
			case MlPackage.APPLY_CONTENT__REM:
				return rem != null;
			case MlPackage.APPLY_CONTENT__ROOT:
				return root != null;
			case MlPackage.APPLY_CONTENT__FACTORIAL:
				return factorial != null;
			case MlPackage.APPLY_CONTENT__ABS:
				return abs != null;
			case MlPackage.APPLY_CONTENT__CONJUGATE:
				return conjugate != null;
			case MlPackage.APPLY_CONTENT__ARG:
				return arg != null;
			case MlPackage.APPLY_CONTENT__REAL:
				return real != null;
			case MlPackage.APPLY_CONTENT__IMAGINARY:
				return imaginary != null;
			case MlPackage.APPLY_CONTENT__FLOOR:
				return floor != null;
			case MlPackage.APPLY_CONTENT__CEILING:
				return ceiling != null;
			case MlPackage.APPLY_CONTENT__EXP:
				return exp != null;
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP:
				return naryMinmaxClassGroup != null && !naryMinmaxClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP:
				return naryArithClassGroup != null && !naryArithClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS:
				return getNaryArithClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP:
				return naryLogicalClassGroup != null && !naryLogicalClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass() != null;
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP:
				return unaryLogicalClassGroup != null && !unaryLogicalClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass() != null;
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP:
				return binaryLogicalClassGroup != null && !binaryLogicalClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass() != null;
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP:
				return quantifierClassGroup != null && !quantifierClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS:
				return getQuantifierClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP:
				return naryRelnClassGroup != null && !naryRelnClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS:
				return getNaryRelnClass() != null;
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP:
				return binaryRelnClassGroup != null && !binaryRelnClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS:
				return getBinaryRelnClass() != null;
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP:
				return intClassGroup != null && !intClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__INT_CLASS:
				return getIntClass() != null;
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return differentialOperatorClassGroup != null && !differentialOperatorClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass() != null;
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP:
				return partialdiffClassGroup != null && !partialdiffClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS:
				return getPartialdiffClass() != null;
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP:
				return unaryVeccalcClassGroup != null && !unaryVeccalcClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return narySetlistConstructorClassGroup != null && !narySetlistConstructorClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP:
				return narySetClassGroup != null && !narySetClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS:
				return getNarySetClass() != null;
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP:
				return binarySetClassGroup != null && !binarySetClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS:
				return getBinarySetClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP:
				return narySetRelnClassGroup != null && !narySetRelnClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass() != null;
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP:
				return unarySetClassGroup != null && !unarySetClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS:
				return getUnarySetClass() != null;
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP:
				return sumClassGroup != null && !sumClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__SUM_CLASS:
				return getSumClass() != null;
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP:
				return productClassGroup != null && !productClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS:
				return getProductClass() != null;
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP:
				return limitClassGroup != null && !limitClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS:
				return getLimitClass() != null;
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP:
				return unaryElementaryClassGroup != null && !unaryElementaryClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP:
				return naryStatsClassGroup != null && !naryStatsClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS:
				return getNaryStatsClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP:
				return naryConstructorClassGroup != null && !naryConstructorClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass() != null;
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP:
				return unaryLinalgClassGroup != null && !unaryLinalgClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass() != null;
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP:
				return naryLinalgClassGroup != null && !naryLinalgClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS:
				return getNaryLinalgClass() != null;
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP:
				return binaryLinalgClassGroup != null && !binaryLinalgClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass() != null;
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP:
				return constantSetClassGroup != null && !constantSetClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS:
				return getConstantSetClass() != null;
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP:
				return constantArithClassGroup != null && !constantArithClassGroup.isEmpty();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS:
				return getConstantArithClass() != null;
			case MlPackage.APPLY_CONTENT__BVAR:
				return bvar != null && !bvar.isEmpty();
			case MlPackage.APPLY_CONTENT__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case MlPackage.APPLY_CONTENT__DOMAINOFAPPLICATION:
				return !getDomainofapplication().isEmpty();
			case MlPackage.APPLY_CONTENT__CONDITION:
				return !getCondition().isEmpty();
			case MlPackage.APPLY_CONTENT__LOWLIMIT:
				return !getLowlimit().isEmpty();
			case MlPackage.APPLY_CONTENT__UPLIMIT:
				return !getUplimit().isEmpty();
			case MlPackage.APPLY_CONTENT__DEGREE:
				return !getDegree().isEmpty();
			case MlPackage.APPLY_CONTENT__MOMENTABOUT:
				return !getMomentabout().isEmpty();
			case MlPackage.APPLY_CONTENT__LOGBASE:
				return !getLogbase().isEmpty();
			case MlPackage.APPLY_CONTENT__CONT_EXP:
				return contExp != null && !contExp.isEmpty();
			case MlPackage.APPLY_CONTENT__APPLY1:
				return !getApply1().isEmpty();
			case MlPackage.APPLY_CONTENT__BIND1:
				return !getBind1().isEmpty();
			case MlPackage.APPLY_CONTENT__CI1:
				return !getCi1().isEmpty();
			case MlPackage.APPLY_CONTENT__CN1:
				return !getCn1().isEmpty();
			case MlPackage.APPLY_CONTENT__CSYMBOL1:
				return !getCsymbol1().isEmpty();
			case MlPackage.APPLY_CONTENT__CBYTES1:
				return !getCbytes1().isEmpty();
			case MlPackage.APPLY_CONTENT__CERROR1:
				return !getCerror1().isEmpty();
			case MlPackage.APPLY_CONTENT__CS1:
				return !getCs1().isEmpty();
			case MlPackage.APPLY_CONTENT__SHARE1:
				return !getShare1().isEmpty();
			case MlPackage.APPLY_CONTENT__PIECEWISE1:
				return !getPiecewise1().isEmpty();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP_GROUP1:
				return !getDeprecatedContExpGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__DEPRECATED_CONT_EXP1:
				return !getDeprecatedContExp1().isEmpty();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS_GROUP1:
				return !getIntervalClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__INTERVAL_CLASS1:
				return !getIntervalClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS_GROUP1:
				return !getUnaryFunctionalClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_FUNCTIONAL_CLASS1:
				return !getUnaryFunctionalClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS_GROUP1:
				return !getLambdaClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__LAMBDA_CLASS1:
				return !getLambdaClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS_GROUP1:
				return !getNaryFunctionalClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_FUNCTIONAL_CLASS1:
				return !getNaryFunctionalClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__QUOTIENT1:
				return !getQuotient1().isEmpty();
			case MlPackage.APPLY_CONTENT__DIVIDE1:
				return !getDivide1().isEmpty();
			case MlPackage.APPLY_CONTENT__MINUS1:
				return !getMinus1().isEmpty();
			case MlPackage.APPLY_CONTENT__POWER1:
				return !getPower1().isEmpty();
			case MlPackage.APPLY_CONTENT__REM1:
				return !getRem1().isEmpty();
			case MlPackage.APPLY_CONTENT__ROOT1:
				return !getRoot1().isEmpty();
			case MlPackage.APPLY_CONTENT__FACTORIAL1:
				return !getFactorial1().isEmpty();
			case MlPackage.APPLY_CONTENT__ABS1:
				return !getAbs1().isEmpty();
			case MlPackage.APPLY_CONTENT__CONJUGATE1:
				return !getConjugate1().isEmpty();
			case MlPackage.APPLY_CONTENT__ARG1:
				return !getArg1().isEmpty();
			case MlPackage.APPLY_CONTENT__REAL1:
				return !getReal1().isEmpty();
			case MlPackage.APPLY_CONTENT__IMAGINARY1:
				return !getImaginary1().isEmpty();
			case MlPackage.APPLY_CONTENT__FLOOR1:
				return !getFloor1().isEmpty();
			case MlPackage.APPLY_CONTENT__CEILING1:
				return !getCeiling1().isEmpty();
			case MlPackage.APPLY_CONTENT__EXP1:
				return !getExp1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS_GROUP1:
				return !getNaryMinmaxClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_MINMAX_CLASS1:
				return !getNaryMinmaxClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS_GROUP1:
				return !getNaryArithClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_ARITH_CLASS1:
				return !getNaryArithClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS_GROUP1:
				return !getNaryLogicalClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_LOGICAL_CLASS1:
				return !getNaryLogicalClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS_GROUP1:
				return !getUnaryLogicalClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_LOGICAL_CLASS1:
				return !getUnaryLogicalClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS_GROUP1:
				return !getBinaryLogicalClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_LOGICAL_CLASS1:
				return !getBinaryLogicalClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS_GROUP1:
				return !getQuantifierClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__QUANTIFIER_CLASS1:
				return !getQuantifierClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS_GROUP1:
				return !getNaryRelnClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_RELN_CLASS1:
				return !getNaryRelnClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS_GROUP1:
				return !getBinaryRelnClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_RELN_CLASS1:
				return !getBinaryRelnClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__INT_CLASS_GROUP1:
				return !getIntClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__INT_CLASS1:
				return !getIntClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS_GROUP1:
				return !getDifferentialOperatorClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__DIFFERENTIAL_OPERATOR_CLASS1:
				return !getDifferentialOperatorClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS_GROUP1:
				return !getPartialdiffClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__PARTIALDIFF_CLASS1:
				return !getPartialdiffClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS_GROUP1:
				return !getUnaryVeccalcClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_VECCALC_CLASS1:
				return !getUnaryVeccalcClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP1:
				return !getNarySetlistConstructorClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SETLIST_CONSTRUCTOR_CLASS1:
				return !getNarySetlistConstructorClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS_GROUP1:
				return !getNarySetClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SET_CLASS1:
				return !getNarySetClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS_GROUP1:
				return !getBinarySetClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_SET_CLASS1:
				return !getBinarySetClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS_GROUP1:
				return !getNarySetRelnClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_SET_RELN_CLASS1:
				return !getNarySetRelnClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS_GROUP1:
				return !getUnarySetClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_SET_CLASS1:
				return !getUnarySetClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__SUM_CLASS_GROUP1:
				return !getSumClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__SUM_CLASS1:
				return !getSumClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS_GROUP1:
				return !getProductClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__PRODUCT_CLASS1:
				return !getProductClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS_GROUP1:
				return !getLimitClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__LIMIT_CLASS1:
				return !getLimitClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS_GROUP1:
				return !getUnaryElementaryClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_ELEMENTARY_CLASS1:
				return !getUnaryElementaryClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS_GROUP1:
				return !getNaryStatsClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_STATS_CLASS1:
				return !getNaryStatsClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS_GROUP1:
				return !getNaryConstructorClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_CONSTRUCTOR_CLASS1:
				return !getNaryConstructorClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS_GROUP1:
				return !getUnaryLinalgClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__UNARY_LINALG_CLASS1:
				return !getUnaryLinalgClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS_GROUP1:
				return !getNaryLinalgClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__NARY_LINALG_CLASS1:
				return !getNaryLinalgClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS_GROUP1:
				return !getBinaryLinalgClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__BINARY_LINALG_CLASS1:
				return !getBinaryLinalgClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS_GROUP1:
				return !getConstantSetClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__CONSTANT_SET_CLASS1:
				return !getConstantSetClass1().isEmpty();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS_GROUP1:
				return !getConstantArithClassGroup1().isEmpty();
			case MlPackage.APPLY_CONTENT__CONSTANT_ARITH_CLASS1:
				return !getConstantArithClass1().isEmpty();
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
		result.append(", qualifier: ");
		result.append(qualifier);
		result.append(", contExp: ");
		result.append(contExp);
		result.append(')');
		return result.toString();
	}

} //ApplyContentImpl
