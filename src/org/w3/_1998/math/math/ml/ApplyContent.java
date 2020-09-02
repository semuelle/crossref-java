/**
 */
package org.w3._1998.math.math.ml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBvar <em>Bvar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDomainofapplication <em>Domainofapplication</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLowlimit <em>Lowlimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUplimit <em>Uplimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getMomentabout <em>Momentabout</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLogbase <em>Logbase</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getContExp <em>Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getApply1 <em>Apply1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBind1 <em>Bind1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCi1 <em>Ci1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCn1 <em>Cn1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCsymbol1 <em>Csymbol1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCbytes1 <em>Cbytes1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCerror1 <em>Cerror1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCs1 <em>Cs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getShare1 <em>Share1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPiecewise1 <em>Piecewise1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDeprecatedContExpGroup1 <em>Deprecated Cont Exp Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDeprecatedContExp1 <em>Deprecated Cont Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntervalClassGroup1 <em>Interval Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntervalClass1 <em>Interval Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryFunctionalClassGroup1 <em>Unary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryFunctionalClass1 <em>Unary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLambdaClassGroup1 <em>Lambda Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLambdaClass1 <em>Lambda Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryFunctionalClassGroup1 <em>Nary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryFunctionalClass1 <em>Nary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQuotient1 <em>Quotient1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDivide1 <em>Divide1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getMinus1 <em>Minus1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPower1 <em>Power1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getRem1 <em>Rem1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getRoot1 <em>Root1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getFactorial1 <em>Factorial1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getAbs1 <em>Abs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConjugate1 <em>Conjugate1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getReal1 <em>Real1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getImaginary1 <em>Imaginary1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getFloor1 <em>Floor1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getCeiling1 <em>Ceiling1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryMinmaxClassGroup1 <em>Nary Minmax Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryMinmaxClass1 <em>Nary Minmax Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryArithClassGroup1 <em>Nary Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryArithClass1 <em>Nary Arith Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLogicalClassGroup1 <em>Nary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLogicalClass1 <em>Nary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLogicalClassGroup1 <em>Unary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLogicalClass1 <em>Unary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLogicalClassGroup1 <em>Binary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLogicalClass1 <em>Binary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQuantifierClassGroup1 <em>Quantifier Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getQuantifierClass1 <em>Quantifier Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryRelnClassGroup1 <em>Nary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryRelnClass1 <em>Nary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryRelnClassGroup1 <em>Binary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryRelnClass1 <em>Binary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntClassGroup1 <em>Int Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getIntClass1 <em>Int Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDifferentialOperatorClassGroup1 <em>Differential Operator Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getDifferentialOperatorClass1 <em>Differential Operator Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPartialdiffClassGroup1 <em>Partialdiff Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getPartialdiffClass1 <em>Partialdiff Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryVeccalcClassGroup1 <em>Unary Veccalc Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryVeccalcClass1 <em>Unary Veccalc Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetlistConstructorClassGroup1 <em>Nary Setlist Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetlistConstructorClass1 <em>Nary Setlist Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetClassGroup1 <em>Nary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetClass1 <em>Nary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinarySetClassGroup1 <em>Binary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinarySetClass1 <em>Binary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetRelnClassGroup1 <em>Nary Set Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNarySetRelnClass1 <em>Nary Set Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnarySetClassGroup1 <em>Unary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnarySetClass1 <em>Unary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getSumClassGroup1 <em>Sum Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getSumClass1 <em>Sum Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getProductClassGroup1 <em>Product Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getProductClass1 <em>Product Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLimitClassGroup1 <em>Limit Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getLimitClass1 <em>Limit Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryElementaryClassGroup1 <em>Unary Elementary Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryElementaryClass1 <em>Unary Elementary Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryStatsClassGroup1 <em>Nary Stats Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryStatsClass1 <em>Nary Stats Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryConstructorClassGroup1 <em>Nary Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryConstructorClass1 <em>Nary Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLinalgClassGroup1 <em>Unary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getUnaryLinalgClass1 <em>Unary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLinalgClassGroup1 <em>Nary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getNaryLinalgClass1 <em>Nary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLinalgClassGroup1 <em>Binary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getBinaryLinalgClass1 <em>Binary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantSetClassGroup1 <em>Constant Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantSetClass1 <em>Constant Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantArithClassGroup1 <em>Constant Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.ApplyContent#getConstantArithClass1 <em>Constant Arith Class1</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent()
 * @model extendedMetaData="name='apply.content' kind='elementOnly'"
 * @generated
 */
public interface ApplyContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference.
	 * @see #setApply(ApplyType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Apply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='apply' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplyType getApply();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getApply <em>Apply</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Bind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
	 * @generated
	 */
	BindType getBind();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getBind <em>Bind</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Ci()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ci' namespace='##targetNamespace'"
	 * @generated
	 */
	CiType getCi();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCi <em>Ci</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cn' namespace='##targetNamespace'"
	 * @generated
	 */
	CnType getCn();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCn <em>Cn</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Csymbol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CsymbolType getCsymbol();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCsymbol <em>Csymbol</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cbytes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cbytes' namespace='##targetNamespace'"
	 * @generated
	 */
	CbytesType getCbytes();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCbytes <em>Cbytes</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cerror()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cerror' namespace='##targetNamespace'"
	 * @generated
	 */
	CerrorType getCerror();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCerror <em>Cerror</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace'"
	 * @generated
	 */
	CsType getCs();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCs <em>Cs</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Share()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='share' namespace='##targetNamespace'"
	 * @generated
	 */
	ShareType getShare();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getShare <em>Share</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Piecewise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='piecewise' namespace='##targetNamespace'"
	 * @generated
	 */
	PiecewiseType getPiecewise();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getPiecewise <em>Piecewise</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DeprecatedContExpGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DeprecatedContExp()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntervalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntervalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryFunctionalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryFunctionalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LambdaClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LambdaClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryFunctionalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryFunctionalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Quotient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quotient' namespace='##targetNamespace'"
	 * @generated
	 */
	QuotientType getQuotient();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getQuotient <em>Quotient</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Divide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divide' namespace='##targetNamespace'"
	 * @generated
	 */
	DivideType getDivide();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getDivide <em>Divide</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Minus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minus' namespace='##targetNamespace'"
	 * @generated
	 */
	MinusType getMinus();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getMinus <em>Minus</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Power()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerType getPower();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getPower <em>Power</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Rem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rem' namespace='##targetNamespace'"
	 * @generated
	 */
	RemType getRem();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getRem <em>Rem</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Root()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
	RootType getRoot();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getRoot <em>Root</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Factorial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factorial' namespace='##targetNamespace'"
	 * @generated
	 */
	FactorialType getFactorial();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getFactorial <em>Factorial</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Abs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abs' namespace='##targetNamespace'"
	 * @generated
	 */
	AbsType getAbs();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getAbs <em>Abs</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Conjugate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conjugate' namespace='##targetNamespace'"
	 * @generated
	 */
	ConjugateType getConjugate();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getConjugate <em>Conjugate</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Arg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgType getArg();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getArg <em>Arg</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Real()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getReal();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getReal <em>Real</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Imaginary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imaginary' namespace='##targetNamespace'"
	 * @generated
	 */
	ImaginaryType getImaginary();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getImaginary <em>Imaginary</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Floor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorType getFloor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getFloor <em>Floor</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Ceiling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceiling' namespace='##targetNamespace'"
	 * @generated
	 */
	CeilingType getCeiling();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getCeiling <em>Ceiling</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Exp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exp' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpType getExp();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.ApplyContent#getExp <em>Exp</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryMinmaxClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryMinmaxClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryArithClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryArithClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLogicalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLogicalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLogicalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLogicalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLogicalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLogicalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_QuantifierClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_QuantifierClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryRelnClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryRelnClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryRelnClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryRelnClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DifferentialOperatorClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DifferentialOperatorClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_PartialdiffClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_PartialdiffClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryVeccalcClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryVeccalcClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetlistConstructorClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetlistConstructorClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinarySetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinarySetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetRelnClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetRelnClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnarySetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnarySetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_SumClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_SumClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ProductClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ProductClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LimitClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LimitClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryElementaryClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryElementaryClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryStatsClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryStatsClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryConstructorClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryConstructorClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLinalgClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLinalgClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLinalgClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLinalgClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLinalgClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLinalgClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantSetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantSetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantArithClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantArithClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-arith.class' namespace='##targetNamespace' group='constant-arith.class:group'"
	 * @generated
	 */
	ConstantArithClassType getConstantArithClass();

	/**
	 * Returns the value of the '<em><b>Bvar</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BvarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bvar</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Bvar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bvar' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BvarType> getBvar();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Qualifier()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Qualifier:92'"
	 * @generated
	 */
	FeatureMap getQualifier();

	/**
	 * Returns the value of the '<em><b>Domainofapplication</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.DomainofapplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainofapplication</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Domainofapplication()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domainofapplication' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<DomainofapplicationType> getDomainofapplication();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Condition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<ConditionType> getCondition();

	/**
	 * Returns the value of the '<em><b>Lowlimit</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.LowlimitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowlimit</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Lowlimit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lowlimit' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<LowlimitType> getLowlimit();

	/**
	 * Returns the value of the '<em><b>Uplimit</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UplimitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uplimit</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Uplimit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uplimit' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<UplimitType> getUplimit();

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.DegreeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Degree()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degree' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<DegreeType> getDegree();

	/**
	 * Returns the value of the '<em><b>Momentabout</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MomentaboutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Momentabout</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Momentabout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='momentabout' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<MomentaboutType> getMomentabout();

	/**
	 * Returns the value of the '<em><b>Logbase</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.LogbaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logbase</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Logbase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logbase' namespace='##targetNamespace' group='#Qualifier:92'"
	 * @generated
	 */
	EList<LogbaseType> getLogbase();

	/**
	 * Returns the value of the '<em><b>Cont Exp</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont Exp</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ContExp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContExp:100'"
	 * @generated
	 */
	FeatureMap getContExp();

	/**
	 * Returns the value of the '<em><b>Apply1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ApplyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Apply1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='apply' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<ApplyType> getApply1();

	/**
	 * Returns the value of the '<em><b>Bind1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Bind1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<BindType> getBind1();

	/**
	 * Returns the value of the '<em><b>Ci1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CiType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Ci1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ci' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CiType> getCi1();

	/**
	 * Returns the value of the '<em><b>Cn1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cn1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cn1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cn' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CnType> getCn1();

	/**
	 * Returns the value of the '<em><b>Csymbol1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CsymbolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csymbol1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Csymbol1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CsymbolType> getCsymbol1();

	/**
	 * Returns the value of the '<em><b>Cbytes1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CbytesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cbytes1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cbytes1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cbytes' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CbytesType> getCbytes1();

	/**
	 * Returns the value of the '<em><b>Cerror1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CerrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cerror1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cerror1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cerror' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CerrorType> getCerror1();

	/**
	 * Returns the value of the '<em><b>Cs1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Cs1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CsType> getCs1();

	/**
	 * Returns the value of the '<em><b>Share1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ShareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Share1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='share' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<ShareType> getShare1();

	/**
	 * Returns the value of the '<em><b>Piecewise1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.PiecewiseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecewise1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Piecewise1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='piecewise' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<PiecewiseType> getPiecewise1();

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DeprecatedContExpGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='DeprecatedContExp:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getDeprecatedContExpGroup1();

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DeprecatedContExp1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeprecatedContExp' namespace='##targetNamespace' group='DeprecatedContExp:group'"
	 * @generated
	 */
	EList<EObject> getDeprecatedContExp1();

	/**
	 * Returns the value of the '<em><b>Interval Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntervalClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='interval.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getIntervalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Interval Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.IntervalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntervalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interval.class' namespace='##targetNamespace' group='interval.class:group'"
	 * @generated
	 */
	EList<IntervalClassType> getIntervalClass1();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryFunctionalClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-functional.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getUnaryFunctionalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryFunctionalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryFunctionalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-functional.class' namespace='##targetNamespace' group='unary-functional.class:group'"
	 * @generated
	 */
	EList<UnaryFunctionalClassType> getUnaryFunctionalClass1();

	/**
	 * Returns the value of the '<em><b>Lambda Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LambdaClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='lambda.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getLambdaClassGroup1();

	/**
	 * Returns the value of the '<em><b>Lambda Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.LambdaClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LambdaClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lambda.class' namespace='##targetNamespace' group='lambda.class:group'"
	 * @generated
	 */
	EList<LambdaClassType> getLambdaClass1();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryFunctionalClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-functional.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryFunctionalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryFunctionalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryFunctionalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-functional.class' namespace='##targetNamespace' group='nary-functional.class:group'"
	 * @generated
	 */
	EList<NaryFunctionalClassType> getNaryFunctionalClass1();

	/**
	 * Returns the value of the '<em><b>Quotient1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.QuotientType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotient1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Quotient1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quotient' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<QuotientType> getQuotient1();

	/**
	 * Returns the value of the '<em><b>Divide1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.DivideType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divide1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Divide1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='divide' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<DivideType> getDivide1();

	/**
	 * Returns the value of the '<em><b>Minus1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MinusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minus1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Minus1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minus' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<MinusType> getMinus1();

	/**
	 * Returns the value of the '<em><b>Power1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.PowerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Power1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<PowerType> getPower1();

	/**
	 * Returns the value of the '<em><b>Rem1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.RemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rem1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Rem1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rem' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<RemType> getRem1();

	/**
	 * Returns the value of the '<em><b>Root1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.RootType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Root1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<RootType> getRoot1();

	/**
	 * Returns the value of the '<em><b>Factorial1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.FactorialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factorial1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Factorial1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='factorial' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<FactorialType> getFactorial1();

	/**
	 * Returns the value of the '<em><b>Abs1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.AbsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Abs1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abs' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<AbsType> getAbs1();

	/**
	 * Returns the value of the '<em><b>Conjugate1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConjugateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjugate1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Conjugate1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conjugate' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<ConjugateType> getConjugate1();

	/**
	 * Returns the value of the '<em><b>Arg1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ArgType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Arg1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<ArgType> getArg1();

	/**
	 * Returns the value of the '<em><b>Real1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.RealType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Real1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='real' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<RealType> getReal1();

	/**
	 * Returns the value of the '<em><b>Imaginary1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ImaginaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Imaginary1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imaginary' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<ImaginaryType> getImaginary1();

	/**
	 * Returns the value of the '<em><b>Floor1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.FloorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Floor1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<FloorType> getFloor1();

	/**
	 * Returns the value of the '<em><b>Ceiling1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.CeilingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Ceiling1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ceiling' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<CeilingType> getCeiling1();

	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ExpType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_Exp1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exp' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	EList<ExpType> getExp1();

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryMinmaxClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-minmax.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryMinmaxClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryMinmaxClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryMinmaxClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-minmax.class' namespace='##targetNamespace' group='nary-minmax.class:group'"
	 * @generated
	 */
	EList<NaryMinmaxClassType> getNaryMinmaxClass1();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryArithClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-arith.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryArithClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryArithClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryArithClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-arith.class' namespace='##targetNamespace' group='nary-arith.class:group'"
	 * @generated
	 */
	EList<NaryArithClassType> getNaryArithClass1();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLogicalClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-logical.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryLogicalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryLogicalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLogicalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-logical.class' namespace='##targetNamespace' group='nary-logical.class:group'"
	 * @generated
	 */
	EList<NaryLogicalClassType> getNaryLogicalClass1();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLogicalClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-logical.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getUnaryLogicalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryLogicalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLogicalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-logical.class' namespace='##targetNamespace' group='unary-logical.class:group'"
	 * @generated
	 */
	EList<UnaryLogicalClassType> getUnaryLogicalClass1();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLogicalClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-logical.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getBinaryLogicalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BinaryLogicalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLogicalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-logical.class' namespace='##targetNamespace' group='binary-logical.class:group'"
	 * @generated
	 */
	EList<BinaryLogicalClassType> getBinaryLogicalClass1();

	/**
	 * Returns the value of the '<em><b>Quantifier Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_QuantifierClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='quantifier.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getQuantifierClassGroup1();

	/**
	 * Returns the value of the '<em><b>Quantifier Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.QuantifierClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_QuantifierClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantifier.class' namespace='##targetNamespace' group='quantifier.class:group'"
	 * @generated
	 */
	EList<QuantifierClassType> getQuantifierClass1();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryRelnClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-reln.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryRelnClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryRelnClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryRelnClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-reln.class' namespace='##targetNamespace' group='nary-reln.class:group'"
	 * @generated
	 */
	EList<NaryRelnClassType> getNaryRelnClass1();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryRelnClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-reln.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getBinaryRelnClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryRelnClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-reln.class' namespace='##targetNamespace' group='binary-reln.class:group'"
	 * @generated
	 */
	EList<EObject> getBinaryRelnClass1();

	/**
	 * Returns the value of the '<em><b>Int Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='int.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getIntClassGroup1();

	/**
	 * Returns the value of the '<em><b>Int Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.IntClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_IntClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int.class' namespace='##targetNamespace' group='int.class:group'"
	 * @generated
	 */
	EList<IntClassType> getIntClass1();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DifferentialOperatorClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Differential-Operator.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getDifferentialOperatorClassGroup1();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.DifferentialOperatorClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_DifferentialOperatorClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Differential-Operator.class' namespace='##targetNamespace' group='Differential-Operator.class:group'"
	 * @generated
	 */
	EList<DifferentialOperatorClassType> getDifferentialOperatorClass1();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_PartialdiffClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='partialdiff.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getPartialdiffClassGroup1();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.PartialdiffClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_PartialdiffClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partialdiff.class' namespace='##targetNamespace' group='partialdiff.class:group'"
	 * @generated
	 */
	EList<PartialdiffClassType> getPartialdiffClass1();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryVeccalcClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-veccalc.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getUnaryVeccalcClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryVeccalcClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryVeccalcClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-veccalc.class' namespace='##targetNamespace' group='unary-veccalc.class:group'"
	 * @generated
	 */
	EList<UnaryVeccalcClassType> getUnaryVeccalcClass1();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetlistConstructorClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-setlist-constructor.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNarySetlistConstructorClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetlistConstructorClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-setlist-constructor.class' namespace='##targetNamespace' group='nary-setlist-constructor.class:group'"
	 * @generated
	 */
	EList<EObject> getNarySetlistConstructorClass1();

	/**
	 * Returns the value of the '<em><b>Nary Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-set.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNarySetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Set Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NarySetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set.class' namespace='##targetNamespace' group='nary-set.class:group'"
	 * @generated
	 */
	EList<NarySetClassType> getNarySetClass1();

	/**
	 * Returns the value of the '<em><b>Binary Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinarySetClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-set.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getBinarySetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Set Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BinarySetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinarySetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-set.class' namespace='##targetNamespace' group='binary-set.class:group'"
	 * @generated
	 */
	EList<BinarySetClassType> getBinarySetClass1();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetRelnClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-set-reln.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNarySetRelnClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NarySetRelnClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NarySetRelnClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set-reln.class' namespace='##targetNamespace' group='nary-set-reln.class:group'"
	 * @generated
	 */
	EList<NarySetRelnClassType> getNarySetRelnClass1();

	/**
	 * Returns the value of the '<em><b>Unary Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnarySetClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-set.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getUnarySetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Set Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnarySetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnarySetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-set.class' namespace='##targetNamespace' group='unary-set.class:group'"
	 * @generated
	 */
	EList<UnarySetClassType> getUnarySetClass1();

	/**
	 * Returns the value of the '<em><b>Sum Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_SumClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='sum.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getSumClassGroup1();

	/**
	 * Returns the value of the '<em><b>Sum Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.SumClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_SumClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sum.class' namespace='##targetNamespace' group='sum.class:group'"
	 * @generated
	 */
	EList<SumClassType> getSumClass1();

	/**
	 * Returns the value of the '<em><b>Product Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ProductClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='product.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getProductClassGroup1();

	/**
	 * Returns the value of the '<em><b>Product Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ProductClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ProductClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='product.class' namespace='##targetNamespace' group='product.class:group'"
	 * @generated
	 */
	EList<ProductClassType> getProductClass1();

	/**
	 * Returns the value of the '<em><b>Limit Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LimitClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='limit.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getLimitClassGroup1();

	/**
	 * Returns the value of the '<em><b>Limit Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.LimitClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_LimitClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='limit.class' namespace='##targetNamespace' group='limit.class:group'"
	 * @generated
	 */
	EList<LimitClassType> getLimitClass1();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryElementaryClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-elementary.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getUnaryElementaryClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryElementaryClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryElementaryClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-elementary.class' namespace='##targetNamespace' group='unary-elementary.class:group'"
	 * @generated
	 */
	EList<UnaryElementaryClassType> getUnaryElementaryClass1();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryStatsClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-stats.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryStatsClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryStatsClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryStatsClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-stats.class' namespace='##targetNamespace' group='nary-stats.class:group'"
	 * @generated
	 */
	EList<NaryStatsClassType> getNaryStatsClass1();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryConstructorClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-constructor.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryConstructorClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryConstructorClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryConstructorClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-constructor.class' namespace='##targetNamespace' group='nary-constructor.class:group'"
	 * @generated
	 */
	EList<NaryConstructorClassType> getNaryConstructorClass1();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLinalgClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='unary-linalg.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getUnaryLinalgClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.UnaryLinalgClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_UnaryLinalgClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-linalg.class' namespace='##targetNamespace' group='unary-linalg.class:group'"
	 * @generated
	 */
	EList<UnaryLinalgClassType> getUnaryLinalgClass1();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLinalgClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='nary-linalg.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getNaryLinalgClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.NaryLinalgClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_NaryLinalgClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-linalg.class' namespace='##targetNamespace' group='nary-linalg.class:group'"
	 * @generated
	 */
	EList<NaryLinalgClassType> getNaryLinalgClass1();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLinalgClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='binary-linalg.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getBinaryLinalgClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.BinaryLinalgClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_BinaryLinalgClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-linalg.class' namespace='##targetNamespace' group='binary-linalg.class:group'"
	 * @generated
	 */
	EList<BinaryLinalgClassType> getBinaryLinalgClass1();

	/**
	 * Returns the value of the '<em><b>Constant Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantSetClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='constant-set.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getConstantSetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Constant Set Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConstantSetClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantSetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-set.class' namespace='##targetNamespace' group='constant-set.class:group'"
	 * @generated
	 */
	EList<ConstantSetClassType> getConstantSetClass1();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantArithClassGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='constant-arith.class:group' namespace='##targetNamespace' group='#ContExp:100'"
	 * @generated
	 */
	FeatureMap getConstantArithClassGroup1();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.ConstantArithClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class1</em>' containment reference list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getApplyContent_ConstantArithClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-arith.class' namespace='##targetNamespace' group='constant-arith.class:group'"
	 * @generated
	 */
	EList<ConstantArithClassType> getConstantArithClass1();

} // ApplyContent
