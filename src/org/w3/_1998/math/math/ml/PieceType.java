/**
 */
package org.w3._1998.math.math.ml;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getApply1 <em>Apply1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBind1 <em>Bind1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCi1 <em>Ci1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCn1 <em>Cn1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCsymbol1 <em>Csymbol1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCbytes1 <em>Cbytes1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCerror1 <em>Cerror1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCs1 <em>Cs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getShare1 <em>Share1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPiecewise1 <em>Piecewise1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDeprecatedContExpGroup1 <em>Deprecated Cont Exp Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDeprecatedContExp1 <em>Deprecated Cont Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntervalClassGroup1 <em>Interval Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntervalClass1 <em>Interval Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryFunctionalClassGroup1 <em>Unary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryFunctionalClass1 <em>Unary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLambdaClassGroup1 <em>Lambda Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLambdaClass1 <em>Lambda Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryFunctionalClassGroup1 <em>Nary Functional Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryFunctionalClass1 <em>Nary Functional Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getQuotient1 <em>Quotient1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDivide1 <em>Divide1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getMinus1 <em>Minus1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPower1 <em>Power1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getRem1 <em>Rem1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getRoot1 <em>Root1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getFactorial1 <em>Factorial1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getAbs1 <em>Abs1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConjugate1 <em>Conjugate1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getReal1 <em>Real1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getImaginary1 <em>Imaginary1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getFloor1 <em>Floor1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getCeiling1 <em>Ceiling1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryMinmaxClassGroup1 <em>Nary Minmax Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryMinmaxClass1 <em>Nary Minmax Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryArithClassGroup1 <em>Nary Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryArithClass1 <em>Nary Arith Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLogicalClassGroup1 <em>Nary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLogicalClass1 <em>Nary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLogicalClassGroup1 <em>Unary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLogicalClass1 <em>Unary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLogicalClassGroup1 <em>Binary Logical Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLogicalClass1 <em>Binary Logical Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getQuantifierClassGroup1 <em>Quantifier Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getQuantifierClass1 <em>Quantifier Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryRelnClassGroup1 <em>Nary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryRelnClass1 <em>Nary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryRelnClassGroup1 <em>Binary Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryRelnClass1 <em>Binary Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntClassGroup1 <em>Int Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getIntClass1 <em>Int Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDifferentialOperatorClassGroup1 <em>Differential Operator Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDifferentialOperatorClass1 <em>Differential Operator Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPartialdiffClassGroup1 <em>Partialdiff Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getPartialdiffClass1 <em>Partialdiff Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryVeccalcClassGroup1 <em>Unary Veccalc Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryVeccalcClass1 <em>Unary Veccalc Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetlistConstructorClassGroup1 <em>Nary Setlist Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetlistConstructorClass1 <em>Nary Setlist Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetClassGroup1 <em>Nary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetClass1 <em>Nary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinarySetClassGroup1 <em>Binary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinarySetClass1 <em>Binary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetRelnClassGroup1 <em>Nary Set Reln Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNarySetRelnClass1 <em>Nary Set Reln Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnarySetClassGroup1 <em>Unary Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnarySetClass1 <em>Unary Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getSumClassGroup1 <em>Sum Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getSumClass1 <em>Sum Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getProductClassGroup1 <em>Product Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getProductClass1 <em>Product Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLimitClassGroup1 <em>Limit Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getLimitClass1 <em>Limit Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryElementaryClassGroup1 <em>Unary Elementary Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryElementaryClass1 <em>Unary Elementary Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryStatsClassGroup1 <em>Nary Stats Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryStatsClass1 <em>Nary Stats Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryConstructorClassGroup1 <em>Nary Constructor Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryConstructorClass1 <em>Nary Constructor Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLinalgClassGroup1 <em>Unary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getUnaryLinalgClass1 <em>Unary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLinalgClassGroup1 <em>Nary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getNaryLinalgClass1 <em>Nary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLinalgClassGroup1 <em>Binary Linalg Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getBinaryLinalgClass1 <em>Binary Linalg Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantSetClassGroup1 <em>Constant Set Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantSetClass1 <em>Constant Set Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantArithClassGroup1 <em>Constant Arith Class Group1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getConstantArithClass1 <em>Constant Arith Class1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getDefinitionURL <em>Definition URL</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.PieceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType()
 * @model extendedMetaData="name='piece_._type' kind='elementOnly'"
 * @generated
 */
public interface PieceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference.
	 * @see #setApply(ApplyType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Apply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='apply' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplyType getApply();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getApply <em>Apply</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Bind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
	 * @generated
	 */
	BindType getBind();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getBind <em>Bind</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Ci()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ci' namespace='##targetNamespace'"
	 * @generated
	 */
	CiType getCi();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCi <em>Ci</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cn' namespace='##targetNamespace'"
	 * @generated
	 */
	CnType getCn();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCn <em>Cn</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Csymbol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CsymbolType getCsymbol();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCsymbol <em>Csymbol</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cbytes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cbytes' namespace='##targetNamespace'"
	 * @generated
	 */
	CbytesType getCbytes();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCbytes <em>Cbytes</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cerror()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cerror' namespace='##targetNamespace'"
	 * @generated
	 */
	CerrorType getCerror();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCerror <em>Cerror</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace'"
	 * @generated
	 */
	CsType getCs();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCs <em>Cs</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Share()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='share' namespace='##targetNamespace'"
	 * @generated
	 */
	ShareType getShare();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getShare <em>Share</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Piecewise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='piecewise' namespace='##targetNamespace'"
	 * @generated
	 */
	PiecewiseType getPiecewise();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getPiecewise <em>Piecewise</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DeprecatedContExpGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DeprecatedContExp()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntervalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntervalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryFunctionalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryFunctionalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LambdaClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LambdaClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryFunctionalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryFunctionalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Quotient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quotient' namespace='##targetNamespace'"
	 * @generated
	 */
	QuotientType getQuotient();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getQuotient <em>Quotient</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Divide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divide' namespace='##targetNamespace'"
	 * @generated
	 */
	DivideType getDivide();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getDivide <em>Divide</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Minus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minus' namespace='##targetNamespace'"
	 * @generated
	 */
	MinusType getMinus();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getMinus <em>Minus</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Power()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerType getPower();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getPower <em>Power</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Rem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rem' namespace='##targetNamespace'"
	 * @generated
	 */
	RemType getRem();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getRem <em>Rem</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Root()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
	RootType getRoot();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getRoot <em>Root</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Factorial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factorial' namespace='##targetNamespace'"
	 * @generated
	 */
	FactorialType getFactorial();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getFactorial <em>Factorial</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Abs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abs' namespace='##targetNamespace'"
	 * @generated
	 */
	AbsType getAbs();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getAbs <em>Abs</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Conjugate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conjugate' namespace='##targetNamespace'"
	 * @generated
	 */
	ConjugateType getConjugate();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getConjugate <em>Conjugate</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Arg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgType getArg();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getArg <em>Arg</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Real()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getReal();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getReal <em>Real</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Imaginary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imaginary' namespace='##targetNamespace'"
	 * @generated
	 */
	ImaginaryType getImaginary();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getImaginary <em>Imaginary</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Floor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorType getFloor();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getFloor <em>Floor</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Ceiling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceiling' namespace='##targetNamespace'"
	 * @generated
	 */
	CeilingType getCeiling();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCeiling <em>Ceiling</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Exp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exp' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpType getExp();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getExp <em>Exp</em>}' containment reference.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryMinmaxClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryMinmaxClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryArithClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryArithClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLogicalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLogicalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLogicalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLogicalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLogicalClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLogicalClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_QuantifierClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_QuantifierClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryRelnClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryRelnClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryRelnClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryRelnClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DifferentialOperatorClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DifferentialOperatorClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_PartialdiffClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_PartialdiffClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryVeccalcClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryVeccalcClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetlistConstructorClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetlistConstructorClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinarySetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinarySetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetRelnClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetRelnClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnarySetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnarySetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_SumClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_SumClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ProductClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ProductClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LimitClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LimitClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryElementaryClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryElementaryClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryStatsClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryStatsClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryConstructorClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryConstructorClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLinalgClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLinalgClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLinalgClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLinalgClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLinalgClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLinalgClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantSetClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantSetClass()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantArithClassGroup()
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantArithClass()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-arith.class' namespace='##targetNamespace' group='constant-arith.class:group'"
	 * @generated
	 */
	ConstantArithClassType getConstantArithClass();

	/**
	 * Returns the value of the '<em><b>Apply1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply1</em>' containment reference.
	 * @see #setApply1(ApplyType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Apply1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='apply' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplyType getApply1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getApply1 <em>Apply1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply1</em>' containment reference.
	 * @see #getApply1()
	 * @generated
	 */
	void setApply1(ApplyType value);

	/**
	 * Returns the value of the '<em><b>Bind1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind1</em>' containment reference.
	 * @see #setBind1(BindType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Bind1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bind' namespace='##targetNamespace'"
	 * @generated
	 */
	BindType getBind1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getBind1 <em>Bind1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind1</em>' containment reference.
	 * @see #getBind1()
	 * @generated
	 */
	void setBind1(BindType value);

	/**
	 * Returns the value of the '<em><b>Ci1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci1</em>' containment reference.
	 * @see #setCi1(CiType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Ci1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ci' namespace='##targetNamespace'"
	 * @generated
	 */
	CiType getCi1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCi1 <em>Ci1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci1</em>' containment reference.
	 * @see #getCi1()
	 * @generated
	 */
	void setCi1(CiType value);

	/**
	 * Returns the value of the '<em><b>Cn1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cn1</em>' containment reference.
	 * @see #setCn1(CnType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cn1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cn' namespace='##targetNamespace'"
	 * @generated
	 */
	CnType getCn1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCn1 <em>Cn1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cn1</em>' containment reference.
	 * @see #getCn1()
	 * @generated
	 */
	void setCn1(CnType value);

	/**
	 * Returns the value of the '<em><b>Csymbol1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csymbol1</em>' containment reference.
	 * @see #setCsymbol1(CsymbolType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Csymbol1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='csymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CsymbolType getCsymbol1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCsymbol1 <em>Csymbol1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csymbol1</em>' containment reference.
	 * @see #getCsymbol1()
	 * @generated
	 */
	void setCsymbol1(CsymbolType value);

	/**
	 * Returns the value of the '<em><b>Cbytes1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cbytes1</em>' containment reference.
	 * @see #setCbytes1(CbytesType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cbytes1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cbytes' namespace='##targetNamespace'"
	 * @generated
	 */
	CbytesType getCbytes1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCbytes1 <em>Cbytes1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cbytes1</em>' containment reference.
	 * @see #getCbytes1()
	 * @generated
	 */
	void setCbytes1(CbytesType value);

	/**
	 * Returns the value of the '<em><b>Cerror1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cerror1</em>' containment reference.
	 * @see #setCerror1(CerrorType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cerror1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cerror' namespace='##targetNamespace'"
	 * @generated
	 */
	CerrorType getCerror1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCerror1 <em>Cerror1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cerror1</em>' containment reference.
	 * @see #getCerror1()
	 * @generated
	 */
	void setCerror1(CerrorType value);

	/**
	 * Returns the value of the '<em><b>Cs1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs1</em>' containment reference.
	 * @see #setCs1(CsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Cs1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace'"
	 * @generated
	 */
	CsType getCs1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCs1 <em>Cs1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs1</em>' containment reference.
	 * @see #getCs1()
	 * @generated
	 */
	void setCs1(CsType value);

	/**
	 * Returns the value of the '<em><b>Share1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share1</em>' containment reference.
	 * @see #setShare1(ShareType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Share1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='share' namespace='##targetNamespace'"
	 * @generated
	 */
	ShareType getShare1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getShare1 <em>Share1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share1</em>' containment reference.
	 * @see #getShare1()
	 * @generated
	 */
	void setShare1(ShareType value);

	/**
	 * Returns the value of the '<em><b>Piecewise1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piecewise1</em>' containment reference.
	 * @see #setPiecewise1(PiecewiseType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Piecewise1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='piecewise' namespace='##targetNamespace'"
	 * @generated
	 */
	PiecewiseType getPiecewise1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getPiecewise1 <em>Piecewise1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piecewise1</em>' containment reference.
	 * @see #getPiecewise1()
	 * @generated
	 */
	void setPiecewise1(PiecewiseType value);

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DeprecatedContExpGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='DeprecatedContExp:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeprecatedContExpGroup1();

	/**
	 * Returns the value of the '<em><b>Deprecated Cont Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Cont Exp1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DeprecatedContExp1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeprecatedContExp' namespace='##targetNamespace' group='DeprecatedContExp:group'"
	 * @generated
	 */
	EObject getDeprecatedContExp1();

	/**
	 * Returns the value of the '<em><b>Interval Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntervalClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='interval.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntervalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Interval Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntervalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interval.class' namespace='##targetNamespace' group='interval.class:group'"
	 * @generated
	 */
	IntervalClassType getIntervalClass1();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryFunctionalClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-functional.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryFunctionalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Functional Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Functional Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryFunctionalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-functional.class' namespace='##targetNamespace' group='unary-functional.class:group'"
	 * @generated
	 */
	UnaryFunctionalClassType getUnaryFunctionalClass1();

	/**
	 * Returns the value of the '<em><b>Lambda Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LambdaClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='lambda.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLambdaClassGroup1();

	/**
	 * Returns the value of the '<em><b>Lambda Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LambdaClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lambda.class' namespace='##targetNamespace' group='lambda.class:group'"
	 * @generated
	 */
	LambdaClassType getLambdaClass1();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryFunctionalClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-functional.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryFunctionalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Functional Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Functional Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryFunctionalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-functional.class' namespace='##targetNamespace' group='nary-functional.class:group'"
	 * @generated
	 */
	NaryFunctionalClassType getNaryFunctionalClass1();

	/**
	 * Returns the value of the '<em><b>Quotient1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotient1</em>' containment reference.
	 * @see #setQuotient1(QuotientType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Quotient1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quotient' namespace='##targetNamespace'"
	 * @generated
	 */
	QuotientType getQuotient1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getQuotient1 <em>Quotient1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quotient1</em>' containment reference.
	 * @see #getQuotient1()
	 * @generated
	 */
	void setQuotient1(QuotientType value);

	/**
	 * Returns the value of the '<em><b>Divide1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divide1</em>' containment reference.
	 * @see #setDivide1(DivideType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Divide1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divide' namespace='##targetNamespace'"
	 * @generated
	 */
	DivideType getDivide1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getDivide1 <em>Divide1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divide1</em>' containment reference.
	 * @see #getDivide1()
	 * @generated
	 */
	void setDivide1(DivideType value);

	/**
	 * Returns the value of the '<em><b>Minus1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minus1</em>' containment reference.
	 * @see #setMinus1(MinusType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Minus1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minus' namespace='##targetNamespace'"
	 * @generated
	 */
	MinusType getMinus1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getMinus1 <em>Minus1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minus1</em>' containment reference.
	 * @see #getMinus1()
	 * @generated
	 */
	void setMinus1(MinusType value);

	/**
	 * Returns the value of the '<em><b>Power1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power1</em>' containment reference.
	 * @see #setPower1(PowerType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Power1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerType getPower1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getPower1 <em>Power1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power1</em>' containment reference.
	 * @see #getPower1()
	 * @generated
	 */
	void setPower1(PowerType value);

	/**
	 * Returns the value of the '<em><b>Rem1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rem1</em>' containment reference.
	 * @see #setRem1(RemType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Rem1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rem' namespace='##targetNamespace'"
	 * @generated
	 */
	RemType getRem1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getRem1 <em>Rem1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem1</em>' containment reference.
	 * @see #getRem1()
	 * @generated
	 */
	void setRem1(RemType value);

	/**
	 * Returns the value of the '<em><b>Root1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root1</em>' containment reference.
	 * @see #setRoot1(RootType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Root1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
	RootType getRoot1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getRoot1 <em>Root1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root1</em>' containment reference.
	 * @see #getRoot1()
	 * @generated
	 */
	void setRoot1(RootType value);

	/**
	 * Returns the value of the '<em><b>Factorial1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factorial1</em>' containment reference.
	 * @see #setFactorial1(FactorialType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Factorial1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factorial' namespace='##targetNamespace'"
	 * @generated
	 */
	FactorialType getFactorial1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getFactorial1 <em>Factorial1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factorial1</em>' containment reference.
	 * @see #getFactorial1()
	 * @generated
	 */
	void setFactorial1(FactorialType value);

	/**
	 * Returns the value of the '<em><b>Abs1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs1</em>' containment reference.
	 * @see #setAbs1(AbsType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Abs1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abs' namespace='##targetNamespace'"
	 * @generated
	 */
	AbsType getAbs1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getAbs1 <em>Abs1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs1</em>' containment reference.
	 * @see #getAbs1()
	 * @generated
	 */
	void setAbs1(AbsType value);

	/**
	 * Returns the value of the '<em><b>Conjugate1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjugate1</em>' containment reference.
	 * @see #setConjugate1(ConjugateType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Conjugate1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conjugate' namespace='##targetNamespace'"
	 * @generated
	 */
	ConjugateType getConjugate1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getConjugate1 <em>Conjugate1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugate1</em>' containment reference.
	 * @see #getConjugate1()
	 * @generated
	 */
	void setConjugate1(ConjugateType value);

	/**
	 * Returns the value of the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg1</em>' containment reference.
	 * @see #setArg1(ArgType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Arg1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgType getArg1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getArg1 <em>Arg1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg1</em>' containment reference.
	 * @see #getArg1()
	 * @generated
	 */
	void setArg1(ArgType value);

	/**
	 * Returns the value of the '<em><b>Real1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real1</em>' containment reference.
	 * @see #setReal1(RealType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Real1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getReal1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getReal1 <em>Real1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real1</em>' containment reference.
	 * @see #getReal1()
	 * @generated
	 */
	void setReal1(RealType value);

	/**
	 * Returns the value of the '<em><b>Imaginary1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary1</em>' containment reference.
	 * @see #setImaginary1(ImaginaryType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Imaginary1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imaginary' namespace='##targetNamespace'"
	 * @generated
	 */
	ImaginaryType getImaginary1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getImaginary1 <em>Imaginary1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaginary1</em>' containment reference.
	 * @see #getImaginary1()
	 * @generated
	 */
	void setImaginary1(ImaginaryType value);

	/**
	 * Returns the value of the '<em><b>Floor1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor1</em>' containment reference.
	 * @see #setFloor1(FloorType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Floor1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorType getFloor1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getFloor1 <em>Floor1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor1</em>' containment reference.
	 * @see #getFloor1()
	 * @generated
	 */
	void setFloor1(FloorType value);

	/**
	 * Returns the value of the '<em><b>Ceiling1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling1</em>' containment reference.
	 * @see #setCeiling1(CeilingType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Ceiling1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceiling' namespace='##targetNamespace'"
	 * @generated
	 */
	CeilingType getCeiling1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getCeiling1 <em>Ceiling1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling1</em>' containment reference.
	 * @see #getCeiling1()
	 * @generated
	 */
	void setCeiling1(CeilingType value);

	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference.
	 * @see #setExp1(ExpType)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Exp1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exp' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpType getExp1();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getExp1 <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp1</em>' containment reference.
	 * @see #getExp1()
	 * @generated
	 */
	void setExp1(ExpType value);

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryMinmaxClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-minmax.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryMinmaxClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Minmax Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Minmax Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryMinmaxClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-minmax.class' namespace='##targetNamespace' group='nary-minmax.class:group'"
	 * @generated
	 */
	NaryMinmaxClassType getNaryMinmaxClass1();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryArithClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-arith.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryArithClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Arith Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Arith Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryArithClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-arith.class' namespace='##targetNamespace' group='nary-arith.class:group'"
	 * @generated
	 */
	NaryArithClassType getNaryArithClass1();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLogicalClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-logical.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryLogicalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Logical Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Logical Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLogicalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-logical.class' namespace='##targetNamespace' group='nary-logical.class:group'"
	 * @generated
	 */
	NaryLogicalClassType getNaryLogicalClass1();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLogicalClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-logical.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryLogicalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Logical Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Logical Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLogicalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-logical.class' namespace='##targetNamespace' group='unary-logical.class:group'"
	 * @generated
	 */
	UnaryLogicalClassType getUnaryLogicalClass1();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLogicalClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-logical.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryLogicalClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Logical Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Logical Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLogicalClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-logical.class' namespace='##targetNamespace' group='binary-logical.class:group'"
	 * @generated
	 */
	BinaryLogicalClassType getBinaryLogicalClass1();

	/**
	 * Returns the value of the '<em><b>Quantifier Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_QuantifierClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='quantifier.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getQuantifierClassGroup1();

	/**
	 * Returns the value of the '<em><b>Quantifier Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_QuantifierClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantifier.class' namespace='##targetNamespace' group='quantifier.class:group'"
	 * @generated
	 */
	QuantifierClassType getQuantifierClass1();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryRelnClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-reln.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryRelnClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Reln Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Reln Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryRelnClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-reln.class' namespace='##targetNamespace' group='nary-reln.class:group'"
	 * @generated
	 */
	NaryRelnClassType getNaryRelnClass1();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryRelnClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-reln.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryRelnClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Reln Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Reln Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryRelnClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-reln.class' namespace='##targetNamespace' group='binary-reln.class:group'"
	 * @generated
	 */
	EObject getBinaryRelnClass1();

	/**
	 * Returns the value of the '<em><b>Int Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='int.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntClassGroup1();

	/**
	 * Returns the value of the '<em><b>Int Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_IntClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='int.class' namespace='##targetNamespace' group='int.class:group'"
	 * @generated
	 */
	IntClassType getIntClass1();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DifferentialOperatorClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Differential-Operator.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDifferentialOperatorClassGroup1();

	/**
	 * Returns the value of the '<em><b>Differential Operator Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differential Operator Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DifferentialOperatorClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Differential-Operator.class' namespace='##targetNamespace' group='Differential-Operator.class:group'"
	 * @generated
	 */
	DifferentialOperatorClassType getDifferentialOperatorClass1();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_PartialdiffClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='partialdiff.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPartialdiffClassGroup1();

	/**
	 * Returns the value of the '<em><b>Partialdiff Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialdiff Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_PartialdiffClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='partialdiff.class' namespace='##targetNamespace' group='partialdiff.class:group'"
	 * @generated
	 */
	PartialdiffClassType getPartialdiffClass1();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryVeccalcClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-veccalc.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryVeccalcClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Veccalc Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Veccalc Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryVeccalcClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-veccalc.class' namespace='##targetNamespace' group='unary-veccalc.class:group'"
	 * @generated
	 */
	UnaryVeccalcClassType getUnaryVeccalcClass1();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetlistConstructorClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-setlist-constructor.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNarySetlistConstructorClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Setlist Constructor Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Setlist Constructor Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetlistConstructorClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-setlist-constructor.class' namespace='##targetNamespace' group='nary-setlist-constructor.class:group'"
	 * @generated
	 */
	EObject getNarySetlistConstructorClass1();

	/**
	 * Returns the value of the '<em><b>Nary Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNarySetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Set Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set.class' namespace='##targetNamespace' group='nary-set.class:group'"
	 * @generated
	 */
	NarySetClassType getNarySetClass1();

	/**
	 * Returns the value of the '<em><b>Binary Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinarySetClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinarySetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Set Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Set Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinarySetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-set.class' namespace='##targetNamespace' group='binary-set.class:group'"
	 * @generated
	 */
	BinarySetClassType getBinarySetClass1();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetRelnClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-set-reln.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNarySetRelnClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Set Reln Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Set Reln Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NarySetRelnClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-set-reln.class' namespace='##targetNamespace' group='nary-set-reln.class:group'"
	 * @generated
	 */
	NarySetRelnClassType getNarySetRelnClass1();

	/**
	 * Returns the value of the '<em><b>Unary Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnarySetClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnarySetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Set Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Set Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnarySetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-set.class' namespace='##targetNamespace' group='unary-set.class:group'"
	 * @generated
	 */
	UnarySetClassType getUnarySetClass1();

	/**
	 * Returns the value of the '<em><b>Sum Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_SumClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='sum.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSumClassGroup1();

	/**
	 * Returns the value of the '<em><b>Sum Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_SumClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sum.class' namespace='##targetNamespace' group='sum.class:group'"
	 * @generated
	 */
	SumClassType getSumClass1();

	/**
	 * Returns the value of the '<em><b>Product Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ProductClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='product.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getProductClassGroup1();

	/**
	 * Returns the value of the '<em><b>Product Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ProductClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='product.class' namespace='##targetNamespace' group='product.class:group'"
	 * @generated
	 */
	ProductClassType getProductClass1();

	/**
	 * Returns the value of the '<em><b>Limit Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LimitClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='limit.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLimitClassGroup1();

	/**
	 * Returns the value of the '<em><b>Limit Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_LimitClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='limit.class' namespace='##targetNamespace' group='limit.class:group'"
	 * @generated
	 */
	LimitClassType getLimitClass1();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryElementaryClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-elementary.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryElementaryClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Elementary Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Elementary Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryElementaryClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-elementary.class' namespace='##targetNamespace' group='unary-elementary.class:group'"
	 * @generated
	 */
	UnaryElementaryClassType getUnaryElementaryClass1();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryStatsClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-stats.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryStatsClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Stats Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Stats Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryStatsClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-stats.class' namespace='##targetNamespace' group='nary-stats.class:group'"
	 * @generated
	 */
	NaryStatsClassType getNaryStatsClass1();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryConstructorClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-constructor.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryConstructorClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Constructor Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Constructor Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryConstructorClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-constructor.class' namespace='##targetNamespace' group='nary-constructor.class:group'"
	 * @generated
	 */
	NaryConstructorClassType getNaryConstructorClass1();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLinalgClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='unary-linalg.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUnaryLinalgClassGroup1();

	/**
	 * Returns the value of the '<em><b>Unary Linalg Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Linalg Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_UnaryLinalgClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unary-linalg.class' namespace='##targetNamespace' group='unary-linalg.class:group'"
	 * @generated
	 */
	UnaryLinalgClassType getUnaryLinalgClass1();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLinalgClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='nary-linalg.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNaryLinalgClassGroup1();

	/**
	 * Returns the value of the '<em><b>Nary Linalg Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Linalg Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_NaryLinalgClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nary-linalg.class' namespace='##targetNamespace' group='nary-linalg.class:group'"
	 * @generated
	 */
	NaryLinalgClassType getNaryLinalgClass1();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLinalgClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='binary-linalg.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryLinalgClassGroup1();

	/**
	 * Returns the value of the '<em><b>Binary Linalg Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Linalg Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_BinaryLinalgClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binary-linalg.class' namespace='##targetNamespace' group='binary-linalg.class:group'"
	 * @generated
	 */
	BinaryLinalgClassType getBinaryLinalgClass1();

	/**
	 * Returns the value of the '<em><b>Constant Set Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantSetClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='constant-set.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConstantSetClassGroup1();

	/**
	 * Returns the value of the '<em><b>Constant Set Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Set Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantSetClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-set.class' namespace='##targetNamespace' group='constant-set.class:group'"
	 * @generated
	 */
	ConstantSetClassType getConstantSetClass1();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class Group1</em>' attribute list.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantArithClassGroup1()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='constant-arith.class:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConstantArithClassGroup1();

	/**
	 * Returns the value of the '<em><b>Constant Arith Class1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Arith Class1</em>' containment reference.
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_ConstantArithClass1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-arith.class' namespace='##targetNamespace' group='constant-arith.class:group'"
	 * @generated
	 */
	ConstantArithClassType getConstantArithClass1();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Definition URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition URL</em>' attribute.
	 * @see #setDefinitionURL(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_DefinitionURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='definitionURL'"
	 * @generated
	 */
	String getDefinitionURL();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getDefinitionURL <em>Definition URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition URL</em>' attribute.
	 * @see #getDefinitionURL()
	 * @generated
	 */
	void setDefinitionURL(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getHref <em>Href</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='other'"
	 * @generated
	 */
	Object getOther();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getOther <em>Other</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_Xref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xref'"
	 * @generated
	 */
	Object getXref();

	/**
	 * Sets the value of the '{@link org.w3._1998.math.math.ml.PieceType#getXref <em>Xref</em>}' attribute.
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
	 * @see org.w3._1998.math.math.ml.MlPackage#getPieceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':190' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PieceType
