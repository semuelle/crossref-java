/**
 */
package org.w3._1998.math.math.ml.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.AbsType;
import org.w3._1998.math.math.ml.AnnotationType;
import org.w3._1998.math.math.ml.AnnotationXmlType;
import org.w3._1998.math.math.ml.ApplyType;
import org.w3._1998.math.math.ml.ApproxType;
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
import org.w3._1998.math.math.ml.DeclareType;
import org.w3._1998.math.math.ml.DegreeType;
import org.w3._1998.math.math.ml.DifferentialOperatorClassType;
import org.w3._1998.math.math.ml.DivideType;
import org.w3._1998.math.math.ml.DocumentRoot;
import org.w3._1998.math.math.ml.DomainofapplicationType;
import org.w3._1998.math.math.ml.ExpType;
import org.w3._1998.math.math.ml.FactorialType;
import org.w3._1998.math.math.ml.FactorofType;
import org.w3._1998.math.math.ml.FloorType;
import org.w3._1998.math.math.ml.FnType;
import org.w3._1998.math.math.ml.ImaginaryType;
import org.w3._1998.math.math.ml.IntClassType;
import org.w3._1998.math.math.ml.IntervalClassType;
import org.w3._1998.math.math.ml.LambdaClassType;
import org.w3._1998.math.math.ml.LimitClassType;
import org.w3._1998.math.math.ml.ListType;
import org.w3._1998.math.math.ml.LogbaseType;
import org.w3._1998.math.math.ml.LowlimitType;
import org.w3._1998.math.math.ml.MactionType;
import org.w3._1998.math.math.ml.MaligngroupType;
import org.w3._1998.math.math.ml.MalignmarkType;
import org.w3._1998.math.math.ml.MathType;
import org.w3._1998.math.math.ml.MencloseType;
import org.w3._1998.math.math.ml.MerrorType;
import org.w3._1998.math.math.ml.MfencedType;
import org.w3._1998.math.math.ml.MfracType;
import org.w3._1998.math.math.ml.MglyphType;
import org.w3._1998.math.math.ml.MiType;
import org.w3._1998.math.math.ml.MinusType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MlabeledtrType;
import org.w3._1998.math.math.ml.MlongdivType;
import org.w3._1998.math.math.ml.MmultiscriptsType;
import org.w3._1998.math.math.ml.MnType;
import org.w3._1998.math.math.ml.MoType;
import org.w3._1998.math.math.ml.MomentaboutType;
import org.w3._1998.math.math.ml.MoverType;
import org.w3._1998.math.math.ml.MpaddedType;
import org.w3._1998.math.math.ml.MphantomType;
import org.w3._1998.math.math.ml.MprescriptsType;
import org.w3._1998.math.math.ml.MrootType;
import org.w3._1998.math.math.ml.MrowType;
import org.w3._1998.math.math.ml.MsType;
import org.w3._1998.math.math.ml.MscarriesType;
import org.w3._1998.math.math.ml.MscarryType;
import org.w3._1998.math.math.ml.MsgroupType;
import org.w3._1998.math.math.ml.MslineType;
import org.w3._1998.math.math.ml.MspaceType;
import org.w3._1998.math.math.ml.MsqrtType;
import org.w3._1998.math.math.ml.MsrowType;
import org.w3._1998.math.math.ml.MstackType;
import org.w3._1998.math.math.ml.MstyleType;
import org.w3._1998.math.math.ml.MsubType;
import org.w3._1998.math.math.ml.MsubsupType;
import org.w3._1998.math.math.ml.MsupType;
import org.w3._1998.math.math.ml.MtableType;
import org.w3._1998.math.math.ml.MtextType;
import org.w3._1998.math.math.ml.MtrType;
import org.w3._1998.math.math.ml.MunderType;
import org.w3._1998.math.math.ml.MunderoverType;
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
import org.w3._1998.math.math.ml.NeqType;
import org.w3._1998.math.math.ml.NoneType;
import org.w3._1998.math.math.ml.OtherwiseType;
import org.w3._1998.math.math.ml.PartialdiffClassType;
import org.w3._1998.math.math.ml.PieceType;
import org.w3._1998.math.math.ml.PiecewiseType;
import org.w3._1998.math.math.ml.PowerType;
import org.w3._1998.math.math.ml.ProductClassType;
import org.w3._1998.math.math.ml.QuantifierClassType;
import org.w3._1998.math.math.ml.QuotientType;
import org.w3._1998.math.math.ml.RealType;
import org.w3._1998.math.math.ml.RelnType;
import org.w3._1998.math.math.ml.RemType;
import org.w3._1998.math.math.ml.RootType;
import org.w3._1998.math.math.ml.SepType;
import org.w3._1998.math.math.ml.SetType;
import org.w3._1998.math.math.ml.ShareType;
import org.w3._1998.math.math.ml.SumClassType;
import org.w3._1998.math.math.ml.TableCellExpressionType;
import org.w3._1998.math.math.ml.TendstoType;
import org.w3._1998.math.math.ml.UnaryElementaryClassType;
import org.w3._1998.math.math.ml.UnaryFunctionalClassType;
import org.w3._1998.math.math.ml.UnaryLinalgClassType;
import org.w3._1998.math.math.ml.UnaryLogicalClassType;
import org.w3._1998.math.math.ml.UnarySetClassType;
import org.w3._1998.math.math.ml.UnaryVeccalcClassType;
import org.w3._1998.math.math.ml.UplimitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getAnnotationXml <em>Annotation Xml</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getApprox <em>Approx</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArccos <em>Arccos</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArccosh <em>Arccosh</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArccot <em>Arccot</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArccoth <em>Arccoth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArccsc <em>Arccsc</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArccsch <em>Arccsch</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArcsec <em>Arcsec</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArcsech <em>Arcsech</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArcsin <em>Arcsin</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArcsinh <em>Arcsinh</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArctan <em>Arctan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArctanh <em>Arctanh</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getBvar <em>Bvar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCard <em>Card</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCartesianproduct <em>Cartesianproduct</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getComplexes <em>Complexes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCos <em>Cos</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCosh <em>Cosh</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCot <em>Cot</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCoth <em>Coth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCsc <em>Csc</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCsch <em>Csch</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getCurl <em>Curl</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDeclare <em>Declare</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDeterminant <em>Determinant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDivergence <em>Divergence</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getDomainofapplication <em>Domainofapplication</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getEmptyset <em>Emptyset</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getEquivalent <em>Equivalent</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getEulergamma <em>Eulergamma</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getExists <em>Exists</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getExponentiale <em>Exponentiale</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getFactorof <em>Factorof</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getFalse <em>False</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getForall <em>Forall</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getGcd <em>Gcd</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getGeq <em>Geq</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getGrad <em>Grad</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getImaginaryi <em>Imaginaryi</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getImplies <em>Implies</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getInfinity <em>Infinity</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getIntegers <em>Integers</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getIntersect <em>Intersect</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLambda <em>Lambda</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLaplacian <em>Laplacian</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLcm <em>Lcm</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLeq <em>Leq</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLn <em>Ln</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLogbase <em>Logbase</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLowlimit <em>Lowlimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMaction <em>Maction</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPresentationExpression <em>Presentation Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMalignExpression <em>Malign Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMaligngroup <em>Maligngroup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMalignmark <em>Malignmark</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMath <em>Math</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMatrixrow <em>Matrixrow</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMedian <em>Median</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMenclose <em>Menclose</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMerror <em>Merror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMfenced <em>Mfenced</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMfrac <em>Mfrac</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMglyph <em>Mglyph</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMi <em>Mi</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTokenExpression <em>Token Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMlabeledtr <em>Mlabeledtr</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTableRowExpression <em>Table Row Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMlongdiv <em>Mlongdiv</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMmultiscripts <em>Mmultiscripts</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMn <em>Mn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMo <em>Mo</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMoment <em>Moment</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMomentabout <em>Momentabout</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMover <em>Mover</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMpadded <em>Mpadded</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMphantom <em>Mphantom</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMprescripts <em>Mprescripts</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMroot <em>Mroot</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMrow <em>Mrow</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMs <em>Ms</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMscarries <em>Mscarries</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMscarry <em>Mscarry</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsgroup <em>Msgroup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsline <em>Msline</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMspace <em>Mspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsqrt <em>Msqrt</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsrow <em>Msrow</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMstack <em>Mstack</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMstyle <em>Mstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsub <em>Msub</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsubsup <em>Msubsup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMsup <em>Msup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMtable <em>Mtable</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMtd <em>Mtd</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTableCellExpression <em>Table Cell Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMtext <em>Mtext</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMtr <em>Mtr</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMunder <em>Munder</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getMunderover <em>Munderover</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNaturalnumbers <em>Naturalnumbers</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNeq <em>Neq</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNone <em>None</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNotanumber <em>Notanumber</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNotin <em>Notin</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNotprsubset <em>Notprsubset</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getNotsubset <em>Notsubset</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getOr <em>Or</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getOuterproduct <em>Outerproduct</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPartialdiff <em>Partialdiff</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPi <em>Pi</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPiece <em>Piece</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPlus <em>Plus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPrimes <em>Primes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getPrsubset <em>Prsubset</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getRationals <em>Rationals</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getReals <em>Reals</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getReln <em>Reln</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getScalarproduct <em>Scalarproduct</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSdev <em>Sdev</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSech <em>Sech</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSep <em>Sep</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSetdiff <em>Setdiff</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSin <em>Sin</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSinh <em>Sinh</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTan <em>Tan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTanh <em>Tanh</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTendsto <em>Tendsto</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTimes <em>Times</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTranspose <em>Transpose</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getTrue <em>True</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getUplimit <em>Uplimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getVariance <em>Variance</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getVectorproduct <em>Vectorproduct</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DocumentRootImpl#getXor <em>Xor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsType getAbs() {
		return (AbsType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Abs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbs(AbsType newAbs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Abs(), newAbs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbs(AbsType newAbs) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Abs(), newAbs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType getAnd() {
		return (NaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_And(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(NaryLogicalClassType newAnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_And(), newAnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnd(NaryLogicalClassType newAnd) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_And(), newAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType getNaryLogicalClass() {
		return (NaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLogicalClass(NaryLogicalClassType newNaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryLogicalClass(), newNaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType getAnnotation() {
		return (AnnotationType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Annotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(AnnotationType newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Annotation(), newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationXmlType getAnnotationXml() {
		return (AnnotationXmlType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_AnnotationXml(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationXml(AnnotationXmlType newAnnotationXml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_AnnotationXml(), newAnnotationXml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotationXml(AnnotationXmlType newAnnotationXml) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_AnnotationXml(), newAnnotationXml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplyType getApply() {
		return (ApplyType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Apply(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApply(ApplyType newApply, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Apply(), newApply, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApply(ApplyType newApply) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Apply(), newApply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApproxType getApprox() {
		return (ApproxType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Approx(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprox(ApproxType newApprox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Approx(), newApprox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprox(ApproxType newApprox) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Approx(), newApprox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getBinaryRelnClass() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_BinaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryRelnClass(EObject newBinaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_BinaryRelnClass(), newBinaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArccos() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arccos(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArccos(UnaryElementaryClassType newArccos, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arccos(), newArccos, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArccos(UnaryElementaryClassType newArccos) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arccos(), newArccos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getUnaryElementaryClass() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_UnaryElementaryClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryElementaryClass(UnaryElementaryClassType newUnaryElementaryClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_UnaryElementaryClass(), newUnaryElementaryClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArccosh() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arccosh(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArccosh(UnaryElementaryClassType newArccosh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arccosh(), newArccosh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArccosh(UnaryElementaryClassType newArccosh) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arccosh(), newArccosh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArccot() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arccot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArccot(UnaryElementaryClassType newArccot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arccot(), newArccot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArccot(UnaryElementaryClassType newArccot) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arccot(), newArccot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArccoth() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arccoth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArccoth(UnaryElementaryClassType newArccoth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arccoth(), newArccoth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArccoth(UnaryElementaryClassType newArccoth) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arccoth(), newArccoth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArccsc() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arccsc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArccsc(UnaryElementaryClassType newArccsc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arccsc(), newArccsc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArccsc(UnaryElementaryClassType newArccsc) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arccsc(), newArccsc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArccsch() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arccsch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArccsch(UnaryElementaryClassType newArccsch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arccsch(), newArccsch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArccsch(UnaryElementaryClassType newArccsch) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arccsch(), newArccsch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArcsec() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arcsec(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcsec(UnaryElementaryClassType newArcsec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arcsec(), newArcsec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcsec(UnaryElementaryClassType newArcsec) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arcsec(), newArcsec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArcsech() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arcsech(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcsech(UnaryElementaryClassType newArcsech, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arcsech(), newArcsech, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcsech(UnaryElementaryClassType newArcsech) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arcsech(), newArcsech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArcsin() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arcsin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcsin(UnaryElementaryClassType newArcsin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arcsin(), newArcsin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcsin(UnaryElementaryClassType newArcsin) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arcsin(), newArcsin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArcsinh() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arcsinh(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcsinh(UnaryElementaryClassType newArcsinh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arcsinh(), newArcsinh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcsinh(UnaryElementaryClassType newArcsinh) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arcsinh(), newArcsinh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArctan() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arctan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArctan(UnaryElementaryClassType newArctan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arctan(), newArctan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArctan(UnaryElementaryClassType newArctan) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arctan(), newArctan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getArctanh() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arctanh(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArctanh(UnaryElementaryClassType newArctanh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arctanh(), newArctanh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArctanh(UnaryElementaryClassType newArctanh) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arctanh(), newArctanh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgType getArg() {
		return (ArgType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Arg(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArg(ArgType newArg, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Arg(), newArg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArg(ArgType newArg) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Arg(), newArg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType getBinaryLinalgClass() {
		return (BinaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_BinaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLinalgClass(BinaryLinalgClassType newBinaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_BinaryLinalgClass(), newBinaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalClassType getBinaryLogicalClass() {
		return (BinaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_BinaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryLogicalClass(BinaryLogicalClassType newBinaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_BinaryLogicalClass(), newBinaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getBinarySetClass() {
		return (BinarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_BinarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinarySetClass(BinarySetClassType newBinarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_BinarySetClass(), newBinarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindType getBind() {
		return (BindType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Bind(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBind(BindType newBind, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Bind(), newBind, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBind(BindType newBind) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Bind(), newBind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BvarType getBvar() {
		return (BvarType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Bvar(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBvar(BvarType newBvar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Bvar(), newBvar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBvar(BvarType newBvar) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Bvar(), newBvar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnarySetClassType getCard() {
		return (UnarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Card(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCard(UnarySetClassType newCard, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Card(), newCard, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCard(UnarySetClassType newCard) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Card(), newCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnarySetClassType getUnarySetClass() {
		return (UnarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_UnarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnarySetClass(UnarySetClassType newUnarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_UnarySetClass(), newUnarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType getCartesianproduct() {
		return (NarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cartesianproduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianproduct(NarySetClassType newCartesianproduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cartesianproduct(), newCartesianproduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianproduct(NarySetClassType newCartesianproduct) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cartesianproduct(), newCartesianproduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType getNarySetClass() {
		return (NarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NarySetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetClass(NarySetClassType newNarySetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NarySetClass(), newNarySetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CbytesType getCbytes() {
		return (CbytesType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cbytes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCbytes(CbytesType newCbytes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cbytes(), newCbytes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCbytes(CbytesType newCbytes) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cbytes(), newCbytes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CeilingType getCeiling() {
		return (CeilingType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Ceiling(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCeiling(CeilingType newCeiling, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Ceiling(), newCeiling, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCeiling(CeilingType newCeiling) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Ceiling(), newCeiling);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CerrorType getCerror() {
		return (CerrorType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cerror(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCerror(CerrorType newCerror, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cerror(), newCerror, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCerror(CerrorType newCerror) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cerror(), newCerror);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiType getCi() {
		return (CiType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Ci(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCi(CiType newCi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Ci(), newCi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCi(CiType newCi) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Ci(), newCi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnType getCn() {
		return (CnType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCn(CnType newCn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cn(), newCn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCn(CnType newCn) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cn(), newCn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getCodomain() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Codomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodomain(UnaryFunctionalClassType newCodomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Codomain(), newCodomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodomain(UnaryFunctionalClassType newCodomain) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Codomain(), newCodomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getUnaryFunctionalClass() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_UnaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryFunctionalClass(UnaryFunctionalClassType newUnaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_UnaryFunctionalClass(), newUnaryFunctionalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getComplexes() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Complexes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexes(ConstantSetClassType newComplexes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Complexes(), newComplexes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplexes(ConstantSetClassType newComplexes) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Complexes(), newComplexes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getConstantSetClass() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_ConstantSetClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantSetClass(ConstantSetClassType newConstantSetClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_ConstantSetClass(), newConstantSetClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryFunctionalClassType getCompose() {
		return (NaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Compose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompose(NaryFunctionalClassType newCompose, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Compose(), newCompose, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompose(NaryFunctionalClassType newCompose) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Compose(), newCompose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryFunctionalClassType getNaryFunctionalClass() {
		return (NaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryFunctionalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryFunctionalClass(NaryFunctionalClassType newNaryFunctionalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryFunctionalClass(), newNaryFunctionalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionType getCondition() {
		return (ConditionType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Condition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ConditionType newCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(ConditionType newCondition) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugateType getConjugate() {
		return (ConjugateType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Conjugate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjugate(ConjugateType newConjugate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Conjugate(), newConjugate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConjugate(ConjugateType newConjugate) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Conjugate(), newConjugate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getConstantArithClass() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_ConstantArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantArithClass(ConstantArithClassType newConstantArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_ConstantArithClass(), newConstantArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getCos() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cos(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCos(UnaryElementaryClassType newCos, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cos(), newCos, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCos(UnaryElementaryClassType newCos) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cos(), newCos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getCosh() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cosh(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCosh(UnaryElementaryClassType newCosh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cosh(), newCosh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCosh(UnaryElementaryClassType newCosh) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cosh(), newCosh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getCot() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCot(UnaryElementaryClassType newCot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cot(), newCot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCot(UnaryElementaryClassType newCot) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cot(), newCot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getCoth() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Coth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoth(UnaryElementaryClassType newCoth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Coth(), newCoth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoth(UnaryElementaryClassType newCoth) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Coth(), newCoth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsType getCs() {
		return (CsType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Cs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCs(CsType newCs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Cs(), newCs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCs(CsType newCs) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Cs(), newCs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getCsc() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Csc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsc(UnaryElementaryClassType newCsc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Csc(), newCsc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsc(UnaryElementaryClassType newCsc) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Csc(), newCsc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getCsch() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Csch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsch(UnaryElementaryClassType newCsch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Csch(), newCsch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsch(UnaryElementaryClassType newCsch) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Csch(), newCsch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsymbolType getCsymbol() {
		return (CsymbolType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Csymbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsymbol(CsymbolType newCsymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Csymbol(), newCsymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsymbol(CsymbolType newCsymbol) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Csymbol(), newCsymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getCurl() {
		return (UnaryVeccalcClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Curl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurl(UnaryVeccalcClassType newCurl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Curl(), newCurl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurl(UnaryVeccalcClassType newCurl) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Curl(), newCurl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getUnaryVeccalcClass() {
		return (UnaryVeccalcClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_UnaryVeccalcClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryVeccalcClass(UnaryVeccalcClassType newUnaryVeccalcClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_UnaryVeccalcClass(), newUnaryVeccalcClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclareType getDeclare() {
		return (DeclareType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Declare(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclare(DeclareType newDeclare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Declare(), newDeclare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclare(DeclareType newDeclare) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Declare(), newDeclare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDeprecatedContExp() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_DeprecatedContExp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecatedContExp(EObject newDeprecatedContExp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_DeprecatedContExp(), newDeprecatedContExp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeType getDegree() {
		return (DegreeType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Degree(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegree(DegreeType newDegree, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Degree(), newDegree, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(DegreeType newDegree) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Degree(), newDegree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLinalgClassType getDeterminant() {
		return (UnaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Determinant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeterminant(UnaryLinalgClassType newDeterminant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Determinant(), newDeterminant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeterminant(UnaryLinalgClassType newDeterminant) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Determinant(), newDeterminant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLinalgClassType getUnaryLinalgClass() {
		return (UnaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_UnaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLinalgClass(UnaryLinalgClassType newUnaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_UnaryLinalgClass(), newUnaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferentialOperatorClassType getDiff() {
		return (DifferentialOperatorClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Diff(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiff(DifferentialOperatorClassType newDiff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Diff(), newDiff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiff(DifferentialOperatorClassType newDiff) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Diff(), newDiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferentialOperatorClassType getDifferentialOperatorClass() {
		return (DifferentialOperatorClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_DifferentialOperatorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferentialOperatorClass(DifferentialOperatorClassType newDifferentialOperatorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_DifferentialOperatorClass(), newDifferentialOperatorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getDivergence() {
		return (UnaryVeccalcClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Divergence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivergence(UnaryVeccalcClassType newDivergence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Divergence(), newDivergence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDivergence(UnaryVeccalcClassType newDivergence) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Divergence(), newDivergence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivideType getDivide() {
		return (DivideType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Divide(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivide(DivideType newDivide, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Divide(), newDivide, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDivide(DivideType newDivide) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Divide(), newDivide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getDomain() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Domain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(UnaryFunctionalClassType newDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Domain(), newDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(UnaryFunctionalClassType newDomain) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Domain(), newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainofapplicationType getDomainofapplication() {
		return (DomainofapplicationType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Domainofapplication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainofapplication(DomainofapplicationType newDomainofapplication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Domainofapplication(), newDomainofapplication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainofapplication(DomainofapplicationType newDomainofapplication) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Domainofapplication(), newDomainofapplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getEmptyset() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Emptyset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyset(ConstantSetClassType newEmptyset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Emptyset(), newEmptyset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyset(ConstantSetClassType newEmptyset) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Emptyset(), newEmptyset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getEq() {
		return (NaryRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Eq(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEq(NaryRelnClassType newEq, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Eq(), newEq, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEq(NaryRelnClassType newEq) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Eq(), newEq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getNaryRelnClass() {
		return (NaryRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryRelnClass(NaryRelnClassType newNaryRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryRelnClass(), newNaryRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalClassType getEquivalent() {
		return (BinaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Equivalent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalent(BinaryLogicalClassType newEquivalent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Equivalent(), newEquivalent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquivalent(BinaryLogicalClassType newEquivalent) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Equivalent(), newEquivalent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getEulergamma() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Eulergamma(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEulergamma(ConstantArithClassType newEulergamma, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Eulergamma(), newEulergamma, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEulergamma(ConstantArithClassType newEulergamma) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Eulergamma(), newEulergamma);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierClassType getExists() {
		return (QuantifierClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Exists(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExists(QuantifierClassType newExists, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Exists(), newExists, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExists(QuantifierClassType newExists) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Exists(), newExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierClassType getQuantifierClass() {
		return (QuantifierClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_QuantifierClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifierClass(QuantifierClassType newQuantifierClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_QuantifierClass(), newQuantifierClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpType getExp() {
		return (ExpType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Exp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(ExpType newExp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Exp(), newExp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExp(ExpType newExp) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Exp(), newExp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getExponentiale() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Exponentiale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExponentiale(ConstantArithClassType newExponentiale, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Exponentiale(), newExponentiale, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponentiale(ConstantArithClassType newExponentiale) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Exponentiale(), newExponentiale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FactorialType getFactorial() {
		return (FactorialType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Factorial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactorial(FactorialType newFactorial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Factorial(), newFactorial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactorial(FactorialType newFactorial) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Factorial(), newFactorial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FactorofType getFactorof() {
		return (FactorofType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Factorof(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactorof(FactorofType newFactorof, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Factorof(), newFactorof, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactorof(FactorofType newFactorof) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Factorof(), newFactorof);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getFalse() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_False(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalse(ConstantArithClassType newFalse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_False(), newFalse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFalse(ConstantArithClassType newFalse) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_False(), newFalse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorType getFloor() {
		return (FloorType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Floor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloor(FloorType newFloor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Floor(), newFloor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloor(FloorType newFloor) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Floor(), newFloor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnType getFn() {
		return (FnType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Fn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFn(FnType newFn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Fn(), newFn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFn(FnType newFn) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Fn(), newFn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierClassType getForall() {
		return (QuantifierClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Forall(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForall(QuantifierClassType newForall, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Forall(), newForall, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForall(QuantifierClassType newForall) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Forall(), newForall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getGcd() {
		return (NaryArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Gcd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGcd(NaryArithClassType newGcd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Gcd(), newGcd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGcd(NaryArithClassType newGcd) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Gcd(), newGcd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getNaryArithClass() {
		return (NaryArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryArithClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryArithClass(NaryArithClassType newNaryArithClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryArithClass(), newNaryArithClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getGeq() {
		return (NaryRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Geq(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeq(NaryRelnClassType newGeq, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Geq(), newGeq, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeq(NaryRelnClassType newGeq) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Geq(), newGeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getGrad() {
		return (UnaryVeccalcClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Grad(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrad(UnaryVeccalcClassType newGrad, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Grad(), newGrad, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrad(UnaryVeccalcClassType newGrad) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Grad(), newGrad);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getGt() {
		return (NaryRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Gt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGt(NaryRelnClassType newGt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Gt(), newGt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGt(NaryRelnClassType newGt) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Gt(), newGt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getIdent() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Ident(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdent(UnaryFunctionalClassType newIdent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Ident(), newIdent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdent(UnaryFunctionalClassType newIdent) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Ident(), newIdent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getImage() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Image(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(UnaryFunctionalClassType newImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Image(), newImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(UnaryFunctionalClassType newImage) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Image(), newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImaginaryType getImaginary() {
		return (ImaginaryType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Imaginary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImaginary(ImaginaryType newImaginary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Imaginary(), newImaginary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImaginary(ImaginaryType newImaginary) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Imaginary(), newImaginary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getImaginaryi() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Imaginaryi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImaginaryi(ConstantArithClassType newImaginaryi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Imaginaryi(), newImaginaryi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImaginaryi(ConstantArithClassType newImaginaryi) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Imaginaryi(), newImaginaryi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalClassType getImplies() {
		return (BinaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Implies(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplies(BinaryLogicalClassType newImplies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Implies(), newImplies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplies(BinaryLogicalClassType newImplies) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Implies(), newImplies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getIn() {
		return (BinarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_In(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(BinarySetClassType newIn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_In(), newIn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIn(BinarySetClassType newIn) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_In(), newIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getInfinity() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Infinity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfinity(ConstantArithClassType newInfinity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Infinity(), newInfinity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfinity(ConstantArithClassType newInfinity) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Infinity(), newInfinity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntClassType getInt() {
		return (IntClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Int(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInt(IntClassType newInt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Int(), newInt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInt(IntClassType newInt) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Int(), newInt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntClassType getIntClass() {
		return (IntClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_IntClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntClass(IntClassType newIntClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_IntClass(), newIntClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getIntegers() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Integers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegers(ConstantSetClassType newIntegers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Integers(), newIntegers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegers(ConstantSetClassType newIntegers) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Integers(), newIntegers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType getIntersect() {
		return (NarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Intersect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntersect(NarySetClassType newIntersect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Intersect(), newIntersect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntersect(NarySetClassType newIntersect) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Intersect(), newIntersect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervalClassType getInterval() {
		return (IntervalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Interval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(IntervalClassType newInterval, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Interval(), newInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterval(IntervalClassType newInterval) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Interval(), newInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervalClassType getIntervalClass() {
		return (IntervalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_IntervalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalClass(IntervalClassType newIntervalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_IntervalClass(), newIntervalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getInverse() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Inverse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverse(UnaryFunctionalClassType newInverse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Inverse(), newInverse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverse(UnaryFunctionalClassType newInverse) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Inverse(), newInverse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaClassType getLambda() {
		return (LambdaClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Lambda(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambda(LambdaClassType newLambda, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Lambda(), newLambda, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambda(LambdaClassType newLambda) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Lambda(), newLambda);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaClassType getLambdaClass() {
		return (LambdaClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_LambdaClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambdaClass(LambdaClassType newLambdaClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_LambdaClass(), newLambdaClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType getLaplacian() {
		return (UnaryVeccalcClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Laplacian(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaplacian(UnaryVeccalcClassType newLaplacian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Laplacian(), newLaplacian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaplacian(UnaryVeccalcClassType newLaplacian) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Laplacian(), newLaplacian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getLcm() {
		return (NaryArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Lcm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLcm(NaryArithClassType newLcm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Lcm(), newLcm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLcm(NaryArithClassType newLcm) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Lcm(), newLcm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getLeq() {
		return (NaryRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Leq(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeq(NaryRelnClassType newLeq, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Leq(), newLeq, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeq(NaryRelnClassType newLeq) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Leq(), newLeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LimitClassType getLimit() {
		return (LimitClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Limit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimit(LimitClassType newLimit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Limit(), newLimit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(LimitClassType newLimit) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Limit(), newLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LimitClassType getLimitClass() {
		return (LimitClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_LimitClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitClass(LimitClassType newLimitClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_LimitClass(), newLimitClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType getList() {
		return (ListType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_List(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_List(), newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setList(ListType newList) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_List(), newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getNarySetlistConstructorClass() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NarySetlistConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetlistConstructorClass(EObject newNarySetlistConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NarySetlistConstructorClass(), newNarySetlistConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getLn() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Ln(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLn(UnaryFunctionalClassType newLn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Ln(), newLn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLn(UnaryFunctionalClassType newLn) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Ln(), newLn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getLog() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Log(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLog(UnaryFunctionalClassType newLog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Log(), newLog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLog(UnaryFunctionalClassType newLog) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Log(), newLog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogbaseType getLogbase() {
		return (LogbaseType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Logbase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogbase(LogbaseType newLogbase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Logbase(), newLogbase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogbase(LogbaseType newLogbase) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Logbase(), newLogbase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowlimitType getLowlimit() {
		return (LowlimitType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Lowlimit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowlimit(LowlimitType newLowlimit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Lowlimit(), newLowlimit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowlimit(LowlimitType newLowlimit) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Lowlimit(), newLowlimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType getLt() {
		return (NaryRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Lt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLt(NaryRelnClassType newLt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Lt(), newLt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLt(NaryRelnClassType newLt) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Lt(), newLt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MactionType getMaction() {
		return (MactionType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Maction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaction(MactionType newMaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Maction(), newMaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaction(MactionType newMaction) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Maction(), newMaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getPresentationExpression() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_PresentationExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationExpression(EObject newPresentationExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_PresentationExpression(), newPresentationExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMalignExpression() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_MalignExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMalignExpression(EObject newMalignExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_MalignExpression(), newMalignExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaligngroupType getMaligngroup() {
		return (MaligngroupType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Maligngroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaligngroup(MaligngroupType newMaligngroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Maligngroup(), newMaligngroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaligngroup(MaligngroupType newMaligngroup) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Maligngroup(), newMaligngroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MalignmarkType getMalignmark() {
		return (MalignmarkType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Malignmark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMalignmark(MalignmarkType newMalignmark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Malignmark(), newMalignmark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMalignmark(MalignmarkType newMalignmark) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Malignmark(), newMalignmark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathType getMath() {
		return (MathType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Math(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMath(MathType newMath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Math(), newMath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMath(MathType newMath) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Math(), newMath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType getMatrix() {
		return (NaryConstructorClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Matrix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(NaryConstructorClassType newMatrix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Matrix(), newMatrix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatrix(NaryConstructorClassType newMatrix) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Matrix(), newMatrix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType getNaryConstructorClass() {
		return (NaryConstructorClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryConstructorClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryConstructorClass(NaryConstructorClassType newNaryConstructorClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryConstructorClass(), newNaryConstructorClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType getMatrixrow() {
		return (NaryConstructorClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Matrixrow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrixrow(NaryConstructorClassType newMatrixrow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Matrixrow(), newMatrixrow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatrixrow(NaryConstructorClassType newMatrixrow) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Matrixrow(), newMatrixrow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryMinmaxClassType getMax() {
		return (NaryMinmaxClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Max(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(NaryMinmaxClassType newMax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Max(), newMax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(NaryMinmaxClassType newMax) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Max(), newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryMinmaxClassType getNaryMinmaxClass() {
		return (NaryMinmaxClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryMinmaxClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryMinmaxClass(NaryMinmaxClassType newNaryMinmaxClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryMinmaxClass(), newNaryMinmaxClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getMean() {
		return (NaryStatsClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMean(NaryStatsClassType newMean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mean(), newMean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMean(NaryStatsClassType newMean) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mean(), newMean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getNaryStatsClass() {
		return (NaryStatsClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryStatsClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryStatsClass(NaryStatsClassType newNaryStatsClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryStatsClass(), newNaryStatsClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getMedian() {
		return (NaryStatsClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Median(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedian(NaryStatsClassType newMedian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Median(), newMedian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedian(NaryStatsClassType newMedian) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Median(), newMedian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MencloseType getMenclose() {
		return (MencloseType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Menclose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenclose(MencloseType newMenclose, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Menclose(), newMenclose, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMenclose(MencloseType newMenclose) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Menclose(), newMenclose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MerrorType getMerror() {
		return (MerrorType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Merror(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerror(MerrorType newMerror, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Merror(), newMerror, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerror(MerrorType newMerror) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Merror(), newMerror);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MfencedType getMfenced() {
		return (MfencedType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mfenced(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMfenced(MfencedType newMfenced, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mfenced(), newMfenced, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMfenced(MfencedType newMfenced) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mfenced(), newMfenced);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MfracType getMfrac() {
		return (MfracType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mfrac(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMfrac(MfracType newMfrac, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mfrac(), newMfrac, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMfrac(MfracType newMfrac) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mfrac(), newMfrac);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MglyphType getMglyph() {
		return (MglyphType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mglyph(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMglyph(MglyphType newMglyph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mglyph(), newMglyph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMglyph(MglyphType newMglyph) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mglyph(), newMglyph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiType getMi() {
		return (MiType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMi(MiType newMi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mi(), newMi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMi(MiType newMi) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mi(), newMi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getTokenExpression() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_TokenExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokenExpression(EObject newTokenExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_TokenExpression(), newTokenExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryMinmaxClassType getMin() {
		return (NaryMinmaxClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Min(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(NaryMinmaxClassType newMin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Min(), newMin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(NaryMinmaxClassType newMin) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Min(), newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinusType getMinus() {
		return (MinusType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Minus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinus(MinusType newMinus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Minus(), newMinus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinus(MinusType newMinus) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Minus(), newMinus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlabeledtrType getMlabeledtr() {
		return (MlabeledtrType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mlabeledtr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMlabeledtr(MlabeledtrType newMlabeledtr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mlabeledtr(), newMlabeledtr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMlabeledtr(MlabeledtrType newMlabeledtr) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mlabeledtr(), newMlabeledtr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getTableRowExpression() {
		return (EObject)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_TableRowExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRowExpression(EObject newTableRowExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_TableRowExpression(), newTableRowExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlongdivType getMlongdiv() {
		return (MlongdivType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mlongdiv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMlongdiv(MlongdivType newMlongdiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mlongdiv(), newMlongdiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMlongdiv(MlongdivType newMlongdiv) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mlongdiv(), newMlongdiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MmultiscriptsType getMmultiscripts() {
		return (MmultiscriptsType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mmultiscripts(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMmultiscripts(MmultiscriptsType newMmultiscripts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mmultiscripts(), newMmultiscripts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMmultiscripts(MmultiscriptsType newMmultiscripts) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mmultiscripts(), newMmultiscripts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MnType getMn() {
		return (MnType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMn(MnType newMn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mn(), newMn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMn(MnType newMn) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mn(), newMn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoType getMo() {
		return (MoType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMo(MoType newMo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mo(), newMo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMo(MoType newMo) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mo(), newMo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getMode() {
		return (NaryStatsClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(NaryStatsClassType newMode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mode(), newMode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(NaryStatsClassType newMode) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mode(), newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType getMoment() {
		return (UnaryFunctionalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Moment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoment(UnaryFunctionalClassType newMoment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Moment(), newMoment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoment(UnaryFunctionalClassType newMoment) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Moment(), newMoment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MomentaboutType getMomentabout() {
		return (MomentaboutType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Momentabout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMomentabout(MomentaboutType newMomentabout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Momentabout(), newMomentabout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMomentabout(MomentaboutType newMomentabout) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Momentabout(), newMomentabout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoverType getMover() {
		return (MoverType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mover(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMover(MoverType newMover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mover(), newMover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMover(MoverType newMover) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mover(), newMover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MpaddedType getMpadded() {
		return (MpaddedType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mpadded(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMpadded(MpaddedType newMpadded, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mpadded(), newMpadded, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMpadded(MpaddedType newMpadded) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mpadded(), newMpadded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MphantomType getMphantom() {
		return (MphantomType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mphantom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMphantom(MphantomType newMphantom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mphantom(), newMphantom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMphantom(MphantomType newMphantom) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mphantom(), newMphantom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MprescriptsType getMprescripts() {
		return (MprescriptsType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mprescripts(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMprescripts(MprescriptsType newMprescripts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mprescripts(), newMprescripts, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMprescripts(MprescriptsType newMprescripts) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mprescripts(), newMprescripts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrootType getMroot() {
		return (MrootType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mroot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMroot(MrootType newMroot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mroot(), newMroot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMroot(MrootType newMroot) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mroot(), newMroot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrowType getMrow() {
		return (MrowType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mrow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMrow(MrowType newMrow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mrow(), newMrow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMrow(MrowType newMrow) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mrow(), newMrow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsType getMs() {
		return (MsType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Ms(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMs(MsType newMs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Ms(), newMs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMs(MsType newMs) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Ms(), newMs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MscarriesType getMscarries() {
		return (MscarriesType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mscarries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMscarries(MscarriesType newMscarries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mscarries(), newMscarries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMscarries(MscarriesType newMscarries) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mscarries(), newMscarries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MscarryType getMscarry() {
		return (MscarryType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mscarry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMscarry(MscarryType newMscarry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mscarry(), newMscarry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMscarry(MscarryType newMscarry) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mscarry(), newMscarry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgroupType getMsgroup() {
		return (MsgroupType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msgroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgroup(MsgroupType newMsgroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msgroup(), newMsgroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsgroup(MsgroupType newMsgroup) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msgroup(), newMsgroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MslineType getMsline() {
		return (MslineType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsline(MslineType newMsline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msline(), newMsline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsline(MslineType newMsline) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msline(), newMsline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MspaceType getMspace() {
		return (MspaceType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mspace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMspace(MspaceType newMspace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mspace(), newMspace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMspace(MspaceType newMspace) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mspace(), newMspace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsqrtType getMsqrt() {
		return (MsqrtType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msqrt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsqrt(MsqrtType newMsqrt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msqrt(), newMsqrt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsqrt(MsqrtType newMsqrt) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msqrt(), newMsqrt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsrowType getMsrow() {
		return (MsrowType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msrow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsrow(MsrowType newMsrow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msrow(), newMsrow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsrow(MsrowType newMsrow) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msrow(), newMsrow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MstackType getMstack() {
		return (MstackType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mstack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMstack(MstackType newMstack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mstack(), newMstack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMstack(MstackType newMstack) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mstack(), newMstack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MstyleType getMstyle() {
		return (MstyleType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mstyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMstyle(MstyleType newMstyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mstyle(), newMstyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMstyle(MstyleType newMstyle) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mstyle(), newMstyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsubType getMsub() {
		return (MsubType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msub(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsub(MsubType newMsub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msub(), newMsub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsub(MsubType newMsub) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msub(), newMsub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsubsupType getMsubsup() {
		return (MsubsupType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msubsup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsubsup(MsubsupType newMsubsup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msubsup(), newMsubsup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsubsup(MsubsupType newMsubsup) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msubsup(), newMsubsup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsupType getMsup() {
		return (MsupType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Msup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsup(MsupType newMsup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Msup(), newMsup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsup(MsupType newMsup) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Msup(), newMsup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MtableType getMtable() {
		return (MtableType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mtable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMtable(MtableType newMtable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mtable(), newMtable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMtable(MtableType newMtable) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mtable(), newMtable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCellExpressionType getMtd() {
		return (TableCellExpressionType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mtd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMtd(TableCellExpressionType newMtd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mtd(), newMtd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMtd(TableCellExpressionType newMtd) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mtd(), newMtd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCellExpressionType getTableCellExpression() {
		return (TableCellExpressionType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_TableCellExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCellExpression(TableCellExpressionType newTableCellExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_TableCellExpression(), newTableCellExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MtextType getMtext() {
		return (MtextType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mtext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMtext(MtextType newMtext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mtext(), newMtext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMtext(MtextType newMtext) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mtext(), newMtext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MtrType getMtr() {
		return (MtrType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Mtr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMtr(MtrType newMtr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Mtr(), newMtr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMtr(MtrType newMtr) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Mtr(), newMtr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MunderType getMunder() {
		return (MunderType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Munder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMunder(MunderType newMunder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Munder(), newMunder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMunder(MunderType newMunder) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Munder(), newMunder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MunderoverType getMunderover() {
		return (MunderoverType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Munderover(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMunderover(MunderoverType newMunderover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Munderover(), newMunderover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMunderover(MunderoverType newMunderover) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Munderover(), newMunderover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLinalgClassType getNaryLinalgClass() {
		return (NaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NaryLinalgClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryLinalgClass(NaryLinalgClassType newNaryLinalgClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NaryLinalgClass(), newNaryLinalgClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetRelnClassType getNarySetRelnClass() {
		return (NarySetRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_NarySetRelnClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarySetRelnClass(NarySetRelnClassType newNarySetRelnClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_NarySetRelnClass(), newNarySetRelnClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getNaturalnumbers() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Naturalnumbers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaturalnumbers(ConstantSetClassType newNaturalnumbers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Naturalnumbers(), newNaturalnumbers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNaturalnumbers(ConstantSetClassType newNaturalnumbers) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Naturalnumbers(), newNaturalnumbers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeqType getNeq() {
		return (NeqType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Neq(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeq(NeqType newNeq, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Neq(), newNeq, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeq(NeqType newNeq) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Neq(), newNeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoneType getNone() {
		return (NoneType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_None(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNone(NoneType newNone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_None(), newNone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNone(NoneType newNone) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_None(), newNone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicalClassType getNot() {
		return (UnaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Not(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(UnaryLogicalClassType newNot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Not(), newNot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNot(UnaryLogicalClassType newNot) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Not(), newNot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicalClassType getUnaryLogicalClass() {
		return (UnaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_UnaryLogicalClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryLogicalClass(UnaryLogicalClassType newUnaryLogicalClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_UnaryLogicalClass(), newUnaryLogicalClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getNotanumber() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Notanumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotanumber(ConstantArithClassType newNotanumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Notanumber(), newNotanumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotanumber(ConstantArithClassType newNotanumber) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Notanumber(), newNotanumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getNotin() {
		return (BinarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Notin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotin(BinarySetClassType newNotin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Notin(), newNotin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotin(BinarySetClassType newNotin) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Notin(), newNotin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getNotprsubset() {
		return (BinarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Notprsubset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotprsubset(BinarySetClassType newNotprsubset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Notprsubset(), newNotprsubset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotprsubset(BinarySetClassType newNotprsubset) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Notprsubset(), newNotprsubset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getNotsubset() {
		return (BinarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Notsubset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotsubset(BinarySetClassType newNotsubset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Notsubset(), newNotsubset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotsubset(BinarySetClassType newNotsubset) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Notsubset(), newNotsubset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType getOr() {
		return (NaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Or(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(NaryLogicalClassType newOr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Or(), newOr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOr(NaryLogicalClassType newOr) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Or(), newOr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherwiseType getOtherwise() {
		return (OtherwiseType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Otherwise(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(OtherwiseType newOtherwise, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Otherwise(), newOtherwise, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherwise(OtherwiseType newOtherwise) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Otherwise(), newOtherwise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType getOuterproduct() {
		return (BinaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Outerproduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterproduct(BinaryLinalgClassType newOuterproduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Outerproduct(), newOuterproduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterproduct(BinaryLinalgClassType newOuterproduct) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Outerproduct(), newOuterproduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialdiffClassType getPartialdiff() {
		return (PartialdiffClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Partialdiff(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialdiff(PartialdiffClassType newPartialdiff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Partialdiff(), newPartialdiff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartialdiff(PartialdiffClassType newPartialdiff) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Partialdiff(), newPartialdiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialdiffClassType getPartialdiffClass() {
		return (PartialdiffClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_PartialdiffClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialdiffClass(PartialdiffClassType newPartialdiffClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_PartialdiffClass(), newPartialdiffClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getPi() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Pi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPi(ConstantArithClassType newPi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Pi(), newPi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPi(ConstantArithClassType newPi) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Pi(), newPi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PieceType getPiece() {
		return (PieceType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Piece(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiece(PieceType newPiece, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Piece(), newPiece, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPiece(PieceType newPiece) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Piece(), newPiece);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PiecewiseType getPiecewise() {
		return (PiecewiseType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Piecewise(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiecewise(PiecewiseType newPiecewise, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Piecewise(), newPiecewise, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPiecewise(PiecewiseType newPiecewise) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Piecewise(), newPiecewise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getPlus() {
		return (NaryArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Plus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlus(NaryArithClassType newPlus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Plus(), newPlus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlus(NaryArithClassType newPlus) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Plus(), newPlus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getPower() {
		return (PowerType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Power(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower(PowerType newPower, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Power(), newPower, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(PowerType newPower) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Power(), newPower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getPrimes() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Primes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimes(ConstantSetClassType newPrimes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Primes(), newPrimes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimes(ConstantSetClassType newPrimes) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Primes(), newPrimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductClassType getProduct() {
		return (ProductClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Product(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(ProductClassType newProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Product(), newProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(ProductClassType newProduct) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Product(), newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductClassType getProductClass() {
		return (ProductClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_ProductClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductClass(ProductClassType newProductClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_ProductClass(), newProductClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetRelnClassType getPrsubset() {
		return (NarySetRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Prsubset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrsubset(NarySetRelnClassType newPrsubset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Prsubset(), newPrsubset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrsubset(NarySetRelnClassType newPrsubset) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Prsubset(), newPrsubset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuotientType getQuotient() {
		return (QuotientType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Quotient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuotient(QuotientType newQuotient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Quotient(), newQuotient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotient(QuotientType newQuotient) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Quotient(), newQuotient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getRationals() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Rationals(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationals(ConstantSetClassType newRationals, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Rationals(), newRationals, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationals(ConstantSetClassType newRationals) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Rationals(), newRationals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealType getReal() {
		return (RealType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Real(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReal(RealType newReal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Real(), newReal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReal(RealType newReal) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Real(), newReal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType getReals() {
		return (ConstantSetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Reals(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReals(ConstantSetClassType newReals, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Reals(), newReals, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReals(ConstantSetClassType newReals) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Reals(), newReals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelnType getReln() {
		return (RelnType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Reln(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReln(RelnType newReln, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Reln(), newReln, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReln(RelnType newReln) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Reln(), newReln);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemType getRem() {
		return (RemType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Rem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRem(RemType newRem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Rem(), newRem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRem(RemType newRem) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Rem(), newRem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootType getRoot() {
		return (RootType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Root(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Root(), newRoot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(RootType newRoot) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Root(), newRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType getScalarproduct() {
		return (BinaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Scalarproduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalarproduct(BinaryLinalgClassType newScalarproduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Scalarproduct(), newScalarproduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalarproduct(BinaryLinalgClassType newScalarproduct) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Scalarproduct(), newScalarproduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getSdev() {
		return (NaryStatsClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sdev(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSdev(NaryStatsClassType newSdev, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sdev(), newSdev, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSdev(NaryStatsClassType newSdev) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sdev(), newSdev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getSec() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sec(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSec(UnaryElementaryClassType newSec, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sec(), newSec, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSec(UnaryElementaryClassType newSec) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sec(), newSec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getSech() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sech(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSech(UnaryElementaryClassType newSech, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sech(), newSech, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSech(UnaryElementaryClassType newSech) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sech(), newSech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLinalgClassType getSelector() {
		return (NaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Selector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(NaryLinalgClassType newSelector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Selector(), newSelector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(NaryLinalgClassType newSelector) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Selector(), newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SepType getSep() {
		return (SepType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSep(SepType newSep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sep(), newSep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSep(SepType newSep) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sep(), newSep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetType getSet() {
		return (SetType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Set(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(SetType newSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Set(), newSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSet(SetType newSet) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Set(), newSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType getSetdiff() {
		return (BinarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Setdiff(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetdiff(BinarySetClassType newSetdiff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Setdiff(), newSetdiff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetdiff(BinarySetClassType newSetdiff) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Setdiff(), newSetdiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShareType getShare() {
		return (ShareType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Share(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShare(ShareType newShare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Share(), newShare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShare(ShareType newShare) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Share(), newShare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getSin() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSin(UnaryElementaryClassType newSin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sin(), newSin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSin(UnaryElementaryClassType newSin) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sin(), newSin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getSinh() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sinh(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSinh(UnaryElementaryClassType newSinh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sinh(), newSinh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSinh(UnaryElementaryClassType newSinh) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sinh(), newSinh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetRelnClassType getSubset() {
		return (NarySetRelnClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Subset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubset(NarySetRelnClassType newSubset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Subset(), newSubset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubset(NarySetRelnClassType newSubset) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Subset(), newSubset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SumClassType getSum() {
		return (SumClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Sum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSum(SumClassType newSum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Sum(), newSum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSum(SumClassType newSum) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Sum(), newSum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SumClassType getSumClass() {
		return (SumClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_SumClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSumClass(SumClassType newSumClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_SumClass(), newSumClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getTan() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Tan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTan(UnaryElementaryClassType newTan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Tan(), newTan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTan(UnaryElementaryClassType newTan) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Tan(), newTan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType getTanh() {
		return (UnaryElementaryClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Tanh(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTanh(UnaryElementaryClassType newTanh, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Tanh(), newTanh, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTanh(UnaryElementaryClassType newTanh) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Tanh(), newTanh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TendstoType getTendsto() {
		return (TendstoType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Tendsto(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTendsto(TendstoType newTendsto, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Tendsto(), newTendsto, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTendsto(TendstoType newTendsto) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Tendsto(), newTendsto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType getTimes() {
		return (NaryArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Times(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimes(NaryArithClassType newTimes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Times(), newTimes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimes(NaryArithClassType newTimes) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Times(), newTimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLinalgClassType getTranspose() {
		return (UnaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Transpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranspose(UnaryLinalgClassType newTranspose, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Transpose(), newTranspose, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranspose(UnaryLinalgClassType newTranspose) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Transpose(), newTranspose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType getTrue() {
		return (ConstantArithClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_True(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrue(ConstantArithClassType newTrue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_True(), newTrue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrue(ConstantArithClassType newTrue) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_True(), newTrue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType getUnion() {
		return (NarySetClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Union(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnion(NarySetClassType newUnion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Union(), newUnion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnion(NarySetClassType newUnion) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Union(), newUnion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UplimitType getUplimit() {
		return (UplimitType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Uplimit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUplimit(UplimitType newUplimit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Uplimit(), newUplimit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUplimit(UplimitType newUplimit) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Uplimit(), newUplimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType getVariance() {
		return (NaryStatsClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Variance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariance(NaryStatsClassType newVariance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Variance(), newVariance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariance(NaryStatsClassType newVariance) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Variance(), newVariance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType getVector() {
		return (NaryConstructorClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Vector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(NaryConstructorClassType newVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Vector(), newVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVector(NaryConstructorClassType newVector) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Vector(), newVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType getVectorproduct() {
		return (BinaryLinalgClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Vectorproduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVectorproduct(BinaryLinalgClassType newVectorproduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Vectorproduct(), newVectorproduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVectorproduct(BinaryLinalgClassType newVectorproduct) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Vectorproduct(), newVectorproduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType getXor() {
		return (NaryLogicalClassType)getMixed().get(MlPackage.eINSTANCE.getDocumentRoot_Xor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXor(NaryLogicalClassType newXor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MlPackage.eINSTANCE.getDocumentRoot_Xor(), newXor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXor(NaryLogicalClassType newXor) {
		((FeatureMap.Internal)getMixed()).set(MlPackage.eINSTANCE.getDocumentRoot_Xor(), newXor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case MlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case MlPackage.DOCUMENT_ROOT__ABS:
				return basicSetAbs(null, msgs);
			case MlPackage.DOCUMENT_ROOT__AND:
				return basicSetAnd(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_LOGICAL_CLASS:
				return basicSetNaryLogicalClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ANNOTATION_XML:
				return basicSetAnnotationXml(null, msgs);
			case MlPackage.DOCUMENT_ROOT__APPLY:
				return basicSetApply(null, msgs);
			case MlPackage.DOCUMENT_ROOT__APPROX:
				return basicSetApprox(null, msgs);
			case MlPackage.DOCUMENT_ROOT__BINARY_RELN_CLASS:
				return basicSetBinaryRelnClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCCOS:
				return basicSetArccos(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNARY_ELEMENTARY_CLASS:
				return basicSetUnaryElementaryClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCCOSH:
				return basicSetArccosh(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCCOT:
				return basicSetArccot(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCCOTH:
				return basicSetArccoth(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCCSC:
				return basicSetArccsc(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCCSCH:
				return basicSetArccsch(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCSEC:
				return basicSetArcsec(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCSECH:
				return basicSetArcsech(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCSIN:
				return basicSetArcsin(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCSINH:
				return basicSetArcsinh(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCTAN:
				return basicSetArctan(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARCTANH:
				return basicSetArctanh(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ARG:
				return basicSetArg(null, msgs);
			case MlPackage.DOCUMENT_ROOT__BINARY_LINALG_CLASS:
				return basicSetBinaryLinalgClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__BINARY_LOGICAL_CLASS:
				return basicSetBinaryLogicalClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__BINARY_SET_CLASS:
				return basicSetBinarySetClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__BIND:
				return basicSetBind(null, msgs);
			case MlPackage.DOCUMENT_ROOT__BVAR:
				return basicSetBvar(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CARD:
				return basicSetCard(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNARY_SET_CLASS:
				return basicSetUnarySetClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CARTESIANPRODUCT:
				return basicSetCartesianproduct(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_SET_CLASS:
				return basicSetNarySetClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CBYTES:
				return basicSetCbytes(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CEILING:
				return basicSetCeiling(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CERROR:
				return basicSetCerror(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CI:
				return basicSetCi(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CN:
				return basicSetCn(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CODOMAIN:
				return basicSetCodomain(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNARY_FUNCTIONAL_CLASS:
				return basicSetUnaryFunctionalClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__COMPLEXES:
				return basicSetComplexes(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CONSTANT_SET_CLASS:
				return basicSetConstantSetClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__COMPOSE:
				return basicSetCompose(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_FUNCTIONAL_CLASS:
				return basicSetNaryFunctionalClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CONDITION:
				return basicSetCondition(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CONJUGATE:
				return basicSetConjugate(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CONSTANT_ARITH_CLASS:
				return basicSetConstantArithClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__COS:
				return basicSetCos(null, msgs);
			case MlPackage.DOCUMENT_ROOT__COSH:
				return basicSetCosh(null, msgs);
			case MlPackage.DOCUMENT_ROOT__COT:
				return basicSetCot(null, msgs);
			case MlPackage.DOCUMENT_ROOT__COTH:
				return basicSetCoth(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CS:
				return basicSetCs(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CSC:
				return basicSetCsc(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CSCH:
				return basicSetCsch(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CSYMBOL:
				return basicSetCsymbol(null, msgs);
			case MlPackage.DOCUMENT_ROOT__CURL:
				return basicSetCurl(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNARY_VECCALC_CLASS:
				return basicSetUnaryVeccalcClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DECLARE:
				return basicSetDeclare(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DEPRECATED_CONT_EXP:
				return basicSetDeprecatedContExp(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DEGREE:
				return basicSetDegree(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DETERMINANT:
				return basicSetDeterminant(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNARY_LINALG_CLASS:
				return basicSetUnaryLinalgClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DIFF:
				return basicSetDiff(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DIFFERENTIAL_OPERATOR_CLASS:
				return basicSetDifferentialOperatorClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DIVERGENCE:
				return basicSetDivergence(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DIVIDE:
				return basicSetDivide(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DOMAIN:
				return basicSetDomain(null, msgs);
			case MlPackage.DOCUMENT_ROOT__DOMAINOFAPPLICATION:
				return basicSetDomainofapplication(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EMPTYSET:
				return basicSetEmptyset(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EQ:
				return basicSetEq(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_RELN_CLASS:
				return basicSetNaryRelnClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EQUIVALENT:
				return basicSetEquivalent(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EULERGAMMA:
				return basicSetEulergamma(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EXISTS:
				return basicSetExists(null, msgs);
			case MlPackage.DOCUMENT_ROOT__QUANTIFIER_CLASS:
				return basicSetQuantifierClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EXP:
				return basicSetExp(null, msgs);
			case MlPackage.DOCUMENT_ROOT__EXPONENTIALE:
				return basicSetExponentiale(null, msgs);
			case MlPackage.DOCUMENT_ROOT__FACTORIAL:
				return basicSetFactorial(null, msgs);
			case MlPackage.DOCUMENT_ROOT__FACTOROF:
				return basicSetFactorof(null, msgs);
			case MlPackage.DOCUMENT_ROOT__FALSE:
				return basicSetFalse(null, msgs);
			case MlPackage.DOCUMENT_ROOT__FLOOR:
				return basicSetFloor(null, msgs);
			case MlPackage.DOCUMENT_ROOT__FN:
				return basicSetFn(null, msgs);
			case MlPackage.DOCUMENT_ROOT__FORALL:
				return basicSetForall(null, msgs);
			case MlPackage.DOCUMENT_ROOT__GCD:
				return basicSetGcd(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_ARITH_CLASS:
				return basicSetNaryArithClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__GEQ:
				return basicSetGeq(null, msgs);
			case MlPackage.DOCUMENT_ROOT__GRAD:
				return basicSetGrad(null, msgs);
			case MlPackage.DOCUMENT_ROOT__GT:
				return basicSetGt(null, msgs);
			case MlPackage.DOCUMENT_ROOT__IDENT:
				return basicSetIdent(null, msgs);
			case MlPackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case MlPackage.DOCUMENT_ROOT__IMAGINARY:
				return basicSetImaginary(null, msgs);
			case MlPackage.DOCUMENT_ROOT__IMAGINARYI:
				return basicSetImaginaryi(null, msgs);
			case MlPackage.DOCUMENT_ROOT__IMPLIES:
				return basicSetImplies(null, msgs);
			case MlPackage.DOCUMENT_ROOT__IN:
				return basicSetIn(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INFINITY:
				return basicSetInfinity(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INT:
				return basicSetInt(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INT_CLASS:
				return basicSetIntClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INTEGERS:
				return basicSetIntegers(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INTERSECT:
				return basicSetIntersect(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INTERVAL:
				return basicSetInterval(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INTERVAL_CLASS:
				return basicSetIntervalClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__INVERSE:
				return basicSetInverse(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LAMBDA:
				return basicSetLambda(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LAMBDA_CLASS:
				return basicSetLambdaClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LAPLACIAN:
				return basicSetLaplacian(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LCM:
				return basicSetLcm(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LEQ:
				return basicSetLeq(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LIMIT:
				return basicSetLimit(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LIMIT_CLASS:
				return basicSetLimitClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return basicSetNarySetlistConstructorClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LN:
				return basicSetLn(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LOG:
				return basicSetLog(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LOGBASE:
				return basicSetLogbase(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LOWLIMIT:
				return basicSetLowlimit(null, msgs);
			case MlPackage.DOCUMENT_ROOT__LT:
				return basicSetLt(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MACTION:
				return basicSetMaction(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PRESENTATION_EXPRESSION:
				return basicSetPresentationExpression(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MALIGN_EXPRESSION:
				return basicSetMalignExpression(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MALIGNGROUP:
				return basicSetMaligngroup(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MALIGNMARK:
				return basicSetMalignmark(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MATH:
				return basicSetMath(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MATRIX:
				return basicSetMatrix(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_CONSTRUCTOR_CLASS:
				return basicSetNaryConstructorClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MATRIXROW:
				return basicSetMatrixrow(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MAX:
				return basicSetMax(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_MINMAX_CLASS:
				return basicSetNaryMinmaxClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MEAN:
				return basicSetMean(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_STATS_CLASS:
				return basicSetNaryStatsClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MEDIAN:
				return basicSetMedian(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MENCLOSE:
				return basicSetMenclose(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MERROR:
				return basicSetMerror(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MFENCED:
				return basicSetMfenced(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MFRAC:
				return basicSetMfrac(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MGLYPH:
				return basicSetMglyph(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MI:
				return basicSetMi(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TOKEN_EXPRESSION:
				return basicSetTokenExpression(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MIN:
				return basicSetMin(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MINUS:
				return basicSetMinus(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MLABELEDTR:
				return basicSetMlabeledtr(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TABLE_ROW_EXPRESSION:
				return basicSetTableRowExpression(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MLONGDIV:
				return basicSetMlongdiv(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MMULTISCRIPTS:
				return basicSetMmultiscripts(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MN:
				return basicSetMn(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MO:
				return basicSetMo(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MODE:
				return basicSetMode(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MOMENT:
				return basicSetMoment(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MOMENTABOUT:
				return basicSetMomentabout(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MOVER:
				return basicSetMover(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MPADDED:
				return basicSetMpadded(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MPHANTOM:
				return basicSetMphantom(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MPRESCRIPTS:
				return basicSetMprescripts(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MROOT:
				return basicSetMroot(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MROW:
				return basicSetMrow(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MS:
				return basicSetMs(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSCARRIES:
				return basicSetMscarries(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSCARRY:
				return basicSetMscarry(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSGROUP:
				return basicSetMsgroup(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSLINE:
				return basicSetMsline(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSPACE:
				return basicSetMspace(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSQRT:
				return basicSetMsqrt(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSROW:
				return basicSetMsrow(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSTACK:
				return basicSetMstack(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSTYLE:
				return basicSetMstyle(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSUB:
				return basicSetMsub(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSUBSUP:
				return basicSetMsubsup(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MSUP:
				return basicSetMsup(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MTABLE:
				return basicSetMtable(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MTD:
				return basicSetMtd(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TABLE_CELL_EXPRESSION:
				return basicSetTableCellExpression(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MTEXT:
				return basicSetMtext(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MTR:
				return basicSetMtr(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MUNDER:
				return basicSetMunder(null, msgs);
			case MlPackage.DOCUMENT_ROOT__MUNDEROVER:
				return basicSetMunderover(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_LINALG_CLASS:
				return basicSetNaryLinalgClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NARY_SET_RELN_CLASS:
				return basicSetNarySetRelnClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NATURALNUMBERS:
				return basicSetNaturalnumbers(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NEQ:
				return basicSetNeq(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NONE:
				return basicSetNone(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NOT:
				return basicSetNot(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNARY_LOGICAL_CLASS:
				return basicSetUnaryLogicalClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NOTANUMBER:
				return basicSetNotanumber(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NOTIN:
				return basicSetNotin(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NOTPRSUBSET:
				return basicSetNotprsubset(null, msgs);
			case MlPackage.DOCUMENT_ROOT__NOTSUBSET:
				return basicSetNotsubset(null, msgs);
			case MlPackage.DOCUMENT_ROOT__OR:
				return basicSetOr(null, msgs);
			case MlPackage.DOCUMENT_ROOT__OTHERWISE:
				return basicSetOtherwise(null, msgs);
			case MlPackage.DOCUMENT_ROOT__OUTERPRODUCT:
				return basicSetOuterproduct(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF:
				return basicSetPartialdiff(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF_CLASS:
				return basicSetPartialdiffClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PI:
				return basicSetPi(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PIECE:
				return basicSetPiece(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PIECEWISE:
				return basicSetPiecewise(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PLUS:
				return basicSetPlus(null, msgs);
			case MlPackage.DOCUMENT_ROOT__POWER:
				return basicSetPower(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PRIMES:
				return basicSetPrimes(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PRODUCT:
				return basicSetProduct(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PRODUCT_CLASS:
				return basicSetProductClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__PRSUBSET:
				return basicSetPrsubset(null, msgs);
			case MlPackage.DOCUMENT_ROOT__QUOTIENT:
				return basicSetQuotient(null, msgs);
			case MlPackage.DOCUMENT_ROOT__RATIONALS:
				return basicSetRationals(null, msgs);
			case MlPackage.DOCUMENT_ROOT__REAL:
				return basicSetReal(null, msgs);
			case MlPackage.DOCUMENT_ROOT__REALS:
				return basicSetReals(null, msgs);
			case MlPackage.DOCUMENT_ROOT__RELN:
				return basicSetReln(null, msgs);
			case MlPackage.DOCUMENT_ROOT__REM:
				return basicSetRem(null, msgs);
			case MlPackage.DOCUMENT_ROOT__ROOT:
				return basicSetRoot(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SCALARPRODUCT:
				return basicSetScalarproduct(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SDEV:
				return basicSetSdev(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SEC:
				return basicSetSec(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SECH:
				return basicSetSech(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SELECTOR:
				return basicSetSelector(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SEP:
				return basicSetSep(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SET:
				return basicSetSet(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SETDIFF:
				return basicSetSetdiff(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SHARE:
				return basicSetShare(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SIN:
				return basicSetSin(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SINH:
				return basicSetSinh(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SUBSET:
				return basicSetSubset(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SUM:
				return basicSetSum(null, msgs);
			case MlPackage.DOCUMENT_ROOT__SUM_CLASS:
				return basicSetSumClass(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TAN:
				return basicSetTan(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TANH:
				return basicSetTanh(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TENDSTO:
				return basicSetTendsto(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TIMES:
				return basicSetTimes(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TRANSPOSE:
				return basicSetTranspose(null, msgs);
			case MlPackage.DOCUMENT_ROOT__TRUE:
				return basicSetTrue(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UNION:
				return basicSetUnion(null, msgs);
			case MlPackage.DOCUMENT_ROOT__UPLIMIT:
				return basicSetUplimit(null, msgs);
			case MlPackage.DOCUMENT_ROOT__VARIANCE:
				return basicSetVariance(null, msgs);
			case MlPackage.DOCUMENT_ROOT__VECTOR:
				return basicSetVector(null, msgs);
			case MlPackage.DOCUMENT_ROOT__VECTORPRODUCT:
				return basicSetVectorproduct(null, msgs);
			case MlPackage.DOCUMENT_ROOT__XOR:
				return basicSetXor(null, msgs);
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
			case MlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case MlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case MlPackage.DOCUMENT_ROOT__ABS:
				return getAbs();
			case MlPackage.DOCUMENT_ROOT__AND:
				return getAnd();
			case MlPackage.DOCUMENT_ROOT__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass();
			case MlPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case MlPackage.DOCUMENT_ROOT__ANNOTATION_XML:
				return getAnnotationXml();
			case MlPackage.DOCUMENT_ROOT__APPLY:
				return getApply();
			case MlPackage.DOCUMENT_ROOT__APPROX:
				return getApprox();
			case MlPackage.DOCUMENT_ROOT__BINARY_RELN_CLASS:
				return getBinaryRelnClass();
			case MlPackage.DOCUMENT_ROOT__ARCCOS:
				return getArccos();
			case MlPackage.DOCUMENT_ROOT__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass();
			case MlPackage.DOCUMENT_ROOT__ARCCOSH:
				return getArccosh();
			case MlPackage.DOCUMENT_ROOT__ARCCOT:
				return getArccot();
			case MlPackage.DOCUMENT_ROOT__ARCCOTH:
				return getArccoth();
			case MlPackage.DOCUMENT_ROOT__ARCCSC:
				return getArccsc();
			case MlPackage.DOCUMENT_ROOT__ARCCSCH:
				return getArccsch();
			case MlPackage.DOCUMENT_ROOT__ARCSEC:
				return getArcsec();
			case MlPackage.DOCUMENT_ROOT__ARCSECH:
				return getArcsech();
			case MlPackage.DOCUMENT_ROOT__ARCSIN:
				return getArcsin();
			case MlPackage.DOCUMENT_ROOT__ARCSINH:
				return getArcsinh();
			case MlPackage.DOCUMENT_ROOT__ARCTAN:
				return getArctan();
			case MlPackage.DOCUMENT_ROOT__ARCTANH:
				return getArctanh();
			case MlPackage.DOCUMENT_ROOT__ARG:
				return getArg();
			case MlPackage.DOCUMENT_ROOT__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass();
			case MlPackage.DOCUMENT_ROOT__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass();
			case MlPackage.DOCUMENT_ROOT__BINARY_SET_CLASS:
				return getBinarySetClass();
			case MlPackage.DOCUMENT_ROOT__BIND:
				return getBind();
			case MlPackage.DOCUMENT_ROOT__BVAR:
				return getBvar();
			case MlPackage.DOCUMENT_ROOT__CARD:
				return getCard();
			case MlPackage.DOCUMENT_ROOT__UNARY_SET_CLASS:
				return getUnarySetClass();
			case MlPackage.DOCUMENT_ROOT__CARTESIANPRODUCT:
				return getCartesianproduct();
			case MlPackage.DOCUMENT_ROOT__NARY_SET_CLASS:
				return getNarySetClass();
			case MlPackage.DOCUMENT_ROOT__CBYTES:
				return getCbytes();
			case MlPackage.DOCUMENT_ROOT__CEILING:
				return getCeiling();
			case MlPackage.DOCUMENT_ROOT__CERROR:
				return getCerror();
			case MlPackage.DOCUMENT_ROOT__CI:
				return getCi();
			case MlPackage.DOCUMENT_ROOT__CN:
				return getCn();
			case MlPackage.DOCUMENT_ROOT__CODOMAIN:
				return getCodomain();
			case MlPackage.DOCUMENT_ROOT__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass();
			case MlPackage.DOCUMENT_ROOT__COMPLEXES:
				return getComplexes();
			case MlPackage.DOCUMENT_ROOT__CONSTANT_SET_CLASS:
				return getConstantSetClass();
			case MlPackage.DOCUMENT_ROOT__COMPOSE:
				return getCompose();
			case MlPackage.DOCUMENT_ROOT__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass();
			case MlPackage.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case MlPackage.DOCUMENT_ROOT__CONJUGATE:
				return getConjugate();
			case MlPackage.DOCUMENT_ROOT__CONSTANT_ARITH_CLASS:
				return getConstantArithClass();
			case MlPackage.DOCUMENT_ROOT__COS:
				return getCos();
			case MlPackage.DOCUMENT_ROOT__COSH:
				return getCosh();
			case MlPackage.DOCUMENT_ROOT__COT:
				return getCot();
			case MlPackage.DOCUMENT_ROOT__COTH:
				return getCoth();
			case MlPackage.DOCUMENT_ROOT__CS:
				return getCs();
			case MlPackage.DOCUMENT_ROOT__CSC:
				return getCsc();
			case MlPackage.DOCUMENT_ROOT__CSCH:
				return getCsch();
			case MlPackage.DOCUMENT_ROOT__CSYMBOL:
				return getCsymbol();
			case MlPackage.DOCUMENT_ROOT__CURL:
				return getCurl();
			case MlPackage.DOCUMENT_ROOT__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass();
			case MlPackage.DOCUMENT_ROOT__DECLARE:
				return getDeclare();
			case MlPackage.DOCUMENT_ROOT__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp();
			case MlPackage.DOCUMENT_ROOT__DEGREE:
				return getDegree();
			case MlPackage.DOCUMENT_ROOT__DETERMINANT:
				return getDeterminant();
			case MlPackage.DOCUMENT_ROOT__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass();
			case MlPackage.DOCUMENT_ROOT__DIFF:
				return getDiff();
			case MlPackage.DOCUMENT_ROOT__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass();
			case MlPackage.DOCUMENT_ROOT__DIVERGENCE:
				return getDivergence();
			case MlPackage.DOCUMENT_ROOT__DIVIDE:
				return getDivide();
			case MlPackage.DOCUMENT_ROOT__DOMAIN:
				return getDomain();
			case MlPackage.DOCUMENT_ROOT__DOMAINOFAPPLICATION:
				return getDomainofapplication();
			case MlPackage.DOCUMENT_ROOT__EMPTYSET:
				return getEmptyset();
			case MlPackage.DOCUMENT_ROOT__EQ:
				return getEq();
			case MlPackage.DOCUMENT_ROOT__NARY_RELN_CLASS:
				return getNaryRelnClass();
			case MlPackage.DOCUMENT_ROOT__EQUIVALENT:
				return getEquivalent();
			case MlPackage.DOCUMENT_ROOT__EULERGAMMA:
				return getEulergamma();
			case MlPackage.DOCUMENT_ROOT__EXISTS:
				return getExists();
			case MlPackage.DOCUMENT_ROOT__QUANTIFIER_CLASS:
				return getQuantifierClass();
			case MlPackage.DOCUMENT_ROOT__EXP:
				return getExp();
			case MlPackage.DOCUMENT_ROOT__EXPONENTIALE:
				return getExponentiale();
			case MlPackage.DOCUMENT_ROOT__FACTORIAL:
				return getFactorial();
			case MlPackage.DOCUMENT_ROOT__FACTOROF:
				return getFactorof();
			case MlPackage.DOCUMENT_ROOT__FALSE:
				return getFalse();
			case MlPackage.DOCUMENT_ROOT__FLOOR:
				return getFloor();
			case MlPackage.DOCUMENT_ROOT__FN:
				return getFn();
			case MlPackage.DOCUMENT_ROOT__FORALL:
				return getForall();
			case MlPackage.DOCUMENT_ROOT__GCD:
				return getGcd();
			case MlPackage.DOCUMENT_ROOT__NARY_ARITH_CLASS:
				return getNaryArithClass();
			case MlPackage.DOCUMENT_ROOT__GEQ:
				return getGeq();
			case MlPackage.DOCUMENT_ROOT__GRAD:
				return getGrad();
			case MlPackage.DOCUMENT_ROOT__GT:
				return getGt();
			case MlPackage.DOCUMENT_ROOT__IDENT:
				return getIdent();
			case MlPackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case MlPackage.DOCUMENT_ROOT__IMAGINARY:
				return getImaginary();
			case MlPackage.DOCUMENT_ROOT__IMAGINARYI:
				return getImaginaryi();
			case MlPackage.DOCUMENT_ROOT__IMPLIES:
				return getImplies();
			case MlPackage.DOCUMENT_ROOT__IN:
				return getIn();
			case MlPackage.DOCUMENT_ROOT__INFINITY:
				return getInfinity();
			case MlPackage.DOCUMENT_ROOT__INT:
				return getInt();
			case MlPackage.DOCUMENT_ROOT__INT_CLASS:
				return getIntClass();
			case MlPackage.DOCUMENT_ROOT__INTEGERS:
				return getIntegers();
			case MlPackage.DOCUMENT_ROOT__INTERSECT:
				return getIntersect();
			case MlPackage.DOCUMENT_ROOT__INTERVAL:
				return getInterval();
			case MlPackage.DOCUMENT_ROOT__INTERVAL_CLASS:
				return getIntervalClass();
			case MlPackage.DOCUMENT_ROOT__INVERSE:
				return getInverse();
			case MlPackage.DOCUMENT_ROOT__LAMBDA:
				return getLambda();
			case MlPackage.DOCUMENT_ROOT__LAMBDA_CLASS:
				return getLambdaClass();
			case MlPackage.DOCUMENT_ROOT__LAPLACIAN:
				return getLaplacian();
			case MlPackage.DOCUMENT_ROOT__LCM:
				return getLcm();
			case MlPackage.DOCUMENT_ROOT__LEQ:
				return getLeq();
			case MlPackage.DOCUMENT_ROOT__LIMIT:
				return getLimit();
			case MlPackage.DOCUMENT_ROOT__LIMIT_CLASS:
				return getLimitClass();
			case MlPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case MlPackage.DOCUMENT_ROOT__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass();
			case MlPackage.DOCUMENT_ROOT__LN:
				return getLn();
			case MlPackage.DOCUMENT_ROOT__LOG:
				return getLog();
			case MlPackage.DOCUMENT_ROOT__LOGBASE:
				return getLogbase();
			case MlPackage.DOCUMENT_ROOT__LOWLIMIT:
				return getLowlimit();
			case MlPackage.DOCUMENT_ROOT__LT:
				return getLt();
			case MlPackage.DOCUMENT_ROOT__MACTION:
				return getMaction();
			case MlPackage.DOCUMENT_ROOT__PRESENTATION_EXPRESSION:
				return getPresentationExpression();
			case MlPackage.DOCUMENT_ROOT__MALIGN_EXPRESSION:
				return getMalignExpression();
			case MlPackage.DOCUMENT_ROOT__MALIGNGROUP:
				return getMaligngroup();
			case MlPackage.DOCUMENT_ROOT__MALIGNMARK:
				return getMalignmark();
			case MlPackage.DOCUMENT_ROOT__MATH:
				return getMath();
			case MlPackage.DOCUMENT_ROOT__MATRIX:
				return getMatrix();
			case MlPackage.DOCUMENT_ROOT__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass();
			case MlPackage.DOCUMENT_ROOT__MATRIXROW:
				return getMatrixrow();
			case MlPackage.DOCUMENT_ROOT__MAX:
				return getMax();
			case MlPackage.DOCUMENT_ROOT__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass();
			case MlPackage.DOCUMENT_ROOT__MEAN:
				return getMean();
			case MlPackage.DOCUMENT_ROOT__NARY_STATS_CLASS:
				return getNaryStatsClass();
			case MlPackage.DOCUMENT_ROOT__MEDIAN:
				return getMedian();
			case MlPackage.DOCUMENT_ROOT__MENCLOSE:
				return getMenclose();
			case MlPackage.DOCUMENT_ROOT__MERROR:
				return getMerror();
			case MlPackage.DOCUMENT_ROOT__MFENCED:
				return getMfenced();
			case MlPackage.DOCUMENT_ROOT__MFRAC:
				return getMfrac();
			case MlPackage.DOCUMENT_ROOT__MGLYPH:
				return getMglyph();
			case MlPackage.DOCUMENT_ROOT__MI:
				return getMi();
			case MlPackage.DOCUMENT_ROOT__TOKEN_EXPRESSION:
				return getTokenExpression();
			case MlPackage.DOCUMENT_ROOT__MIN:
				return getMin();
			case MlPackage.DOCUMENT_ROOT__MINUS:
				return getMinus();
			case MlPackage.DOCUMENT_ROOT__MLABELEDTR:
				return getMlabeledtr();
			case MlPackage.DOCUMENT_ROOT__TABLE_ROW_EXPRESSION:
				return getTableRowExpression();
			case MlPackage.DOCUMENT_ROOT__MLONGDIV:
				return getMlongdiv();
			case MlPackage.DOCUMENT_ROOT__MMULTISCRIPTS:
				return getMmultiscripts();
			case MlPackage.DOCUMENT_ROOT__MN:
				return getMn();
			case MlPackage.DOCUMENT_ROOT__MO:
				return getMo();
			case MlPackage.DOCUMENT_ROOT__MODE:
				return getMode();
			case MlPackage.DOCUMENT_ROOT__MOMENT:
				return getMoment();
			case MlPackage.DOCUMENT_ROOT__MOMENTABOUT:
				return getMomentabout();
			case MlPackage.DOCUMENT_ROOT__MOVER:
				return getMover();
			case MlPackage.DOCUMENT_ROOT__MPADDED:
				return getMpadded();
			case MlPackage.DOCUMENT_ROOT__MPHANTOM:
				return getMphantom();
			case MlPackage.DOCUMENT_ROOT__MPRESCRIPTS:
				return getMprescripts();
			case MlPackage.DOCUMENT_ROOT__MROOT:
				return getMroot();
			case MlPackage.DOCUMENT_ROOT__MROW:
				return getMrow();
			case MlPackage.DOCUMENT_ROOT__MS:
				return getMs();
			case MlPackage.DOCUMENT_ROOT__MSCARRIES:
				return getMscarries();
			case MlPackage.DOCUMENT_ROOT__MSCARRY:
				return getMscarry();
			case MlPackage.DOCUMENT_ROOT__MSGROUP:
				return getMsgroup();
			case MlPackage.DOCUMENT_ROOT__MSLINE:
				return getMsline();
			case MlPackage.DOCUMENT_ROOT__MSPACE:
				return getMspace();
			case MlPackage.DOCUMENT_ROOT__MSQRT:
				return getMsqrt();
			case MlPackage.DOCUMENT_ROOT__MSROW:
				return getMsrow();
			case MlPackage.DOCUMENT_ROOT__MSTACK:
				return getMstack();
			case MlPackage.DOCUMENT_ROOT__MSTYLE:
				return getMstyle();
			case MlPackage.DOCUMENT_ROOT__MSUB:
				return getMsub();
			case MlPackage.DOCUMENT_ROOT__MSUBSUP:
				return getMsubsup();
			case MlPackage.DOCUMENT_ROOT__MSUP:
				return getMsup();
			case MlPackage.DOCUMENT_ROOT__MTABLE:
				return getMtable();
			case MlPackage.DOCUMENT_ROOT__MTD:
				return getMtd();
			case MlPackage.DOCUMENT_ROOT__TABLE_CELL_EXPRESSION:
				return getTableCellExpression();
			case MlPackage.DOCUMENT_ROOT__MTEXT:
				return getMtext();
			case MlPackage.DOCUMENT_ROOT__MTR:
				return getMtr();
			case MlPackage.DOCUMENT_ROOT__MUNDER:
				return getMunder();
			case MlPackage.DOCUMENT_ROOT__MUNDEROVER:
				return getMunderover();
			case MlPackage.DOCUMENT_ROOT__NARY_LINALG_CLASS:
				return getNaryLinalgClass();
			case MlPackage.DOCUMENT_ROOT__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass();
			case MlPackage.DOCUMENT_ROOT__NATURALNUMBERS:
				return getNaturalnumbers();
			case MlPackage.DOCUMENT_ROOT__NEQ:
				return getNeq();
			case MlPackage.DOCUMENT_ROOT__NONE:
				return getNone();
			case MlPackage.DOCUMENT_ROOT__NOT:
				return getNot();
			case MlPackage.DOCUMENT_ROOT__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass();
			case MlPackage.DOCUMENT_ROOT__NOTANUMBER:
				return getNotanumber();
			case MlPackage.DOCUMENT_ROOT__NOTIN:
				return getNotin();
			case MlPackage.DOCUMENT_ROOT__NOTPRSUBSET:
				return getNotprsubset();
			case MlPackage.DOCUMENT_ROOT__NOTSUBSET:
				return getNotsubset();
			case MlPackage.DOCUMENT_ROOT__OR:
				return getOr();
			case MlPackage.DOCUMENT_ROOT__OTHERWISE:
				return getOtherwise();
			case MlPackage.DOCUMENT_ROOT__OUTERPRODUCT:
				return getOuterproduct();
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF:
				return getPartialdiff();
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF_CLASS:
				return getPartialdiffClass();
			case MlPackage.DOCUMENT_ROOT__PI:
				return getPi();
			case MlPackage.DOCUMENT_ROOT__PIECE:
				return getPiece();
			case MlPackage.DOCUMENT_ROOT__PIECEWISE:
				return getPiecewise();
			case MlPackage.DOCUMENT_ROOT__PLUS:
				return getPlus();
			case MlPackage.DOCUMENT_ROOT__POWER:
				return getPower();
			case MlPackage.DOCUMENT_ROOT__PRIMES:
				return getPrimes();
			case MlPackage.DOCUMENT_ROOT__PRODUCT:
				return getProduct();
			case MlPackage.DOCUMENT_ROOT__PRODUCT_CLASS:
				return getProductClass();
			case MlPackage.DOCUMENT_ROOT__PRSUBSET:
				return getPrsubset();
			case MlPackage.DOCUMENT_ROOT__QUOTIENT:
				return getQuotient();
			case MlPackage.DOCUMENT_ROOT__RATIONALS:
				return getRationals();
			case MlPackage.DOCUMENT_ROOT__REAL:
				return getReal();
			case MlPackage.DOCUMENT_ROOT__REALS:
				return getReals();
			case MlPackage.DOCUMENT_ROOT__RELN:
				return getReln();
			case MlPackage.DOCUMENT_ROOT__REM:
				return getRem();
			case MlPackage.DOCUMENT_ROOT__ROOT:
				return getRoot();
			case MlPackage.DOCUMENT_ROOT__SCALARPRODUCT:
				return getScalarproduct();
			case MlPackage.DOCUMENT_ROOT__SDEV:
				return getSdev();
			case MlPackage.DOCUMENT_ROOT__SEC:
				return getSec();
			case MlPackage.DOCUMENT_ROOT__SECH:
				return getSech();
			case MlPackage.DOCUMENT_ROOT__SELECTOR:
				return getSelector();
			case MlPackage.DOCUMENT_ROOT__SEP:
				return getSep();
			case MlPackage.DOCUMENT_ROOT__SET:
				return getSet();
			case MlPackage.DOCUMENT_ROOT__SETDIFF:
				return getSetdiff();
			case MlPackage.DOCUMENT_ROOT__SHARE:
				return getShare();
			case MlPackage.DOCUMENT_ROOT__SIN:
				return getSin();
			case MlPackage.DOCUMENT_ROOT__SINH:
				return getSinh();
			case MlPackage.DOCUMENT_ROOT__SUBSET:
				return getSubset();
			case MlPackage.DOCUMENT_ROOT__SUM:
				return getSum();
			case MlPackage.DOCUMENT_ROOT__SUM_CLASS:
				return getSumClass();
			case MlPackage.DOCUMENT_ROOT__TAN:
				return getTan();
			case MlPackage.DOCUMENT_ROOT__TANH:
				return getTanh();
			case MlPackage.DOCUMENT_ROOT__TENDSTO:
				return getTendsto();
			case MlPackage.DOCUMENT_ROOT__TIMES:
				return getTimes();
			case MlPackage.DOCUMENT_ROOT__TRANSPOSE:
				return getTranspose();
			case MlPackage.DOCUMENT_ROOT__TRUE:
				return getTrue();
			case MlPackage.DOCUMENT_ROOT__UNION:
				return getUnion();
			case MlPackage.DOCUMENT_ROOT__UPLIMIT:
				return getUplimit();
			case MlPackage.DOCUMENT_ROOT__VARIANCE:
				return getVariance();
			case MlPackage.DOCUMENT_ROOT__VECTOR:
				return getVector();
			case MlPackage.DOCUMENT_ROOT__VECTORPRODUCT:
				return getVectorproduct();
			case MlPackage.DOCUMENT_ROOT__XOR:
				return getXor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ABS:
				setAbs((AbsType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__AND:
				setAnd((NaryLogicalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ANNOTATION_XML:
				setAnnotationXml((AnnotationXmlType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__APPLY:
				setApply((ApplyType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__APPROX:
				setApprox((ApproxType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOS:
				setArccos((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOSH:
				setArccosh((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOT:
				setArccot((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOTH:
				setArccoth((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCSC:
				setArccsc((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCSCH:
				setArccsch((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSEC:
				setArcsec((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSECH:
				setArcsech((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSIN:
				setArcsin((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSINH:
				setArcsinh((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCTAN:
				setArctan((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCTANH:
				setArctanh((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ARG:
				setArg((ArgType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__BIND:
				setBind((BindType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__BVAR:
				setBvar((BvarType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CARD:
				setCard((UnarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CARTESIANPRODUCT:
				setCartesianproduct((NarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CBYTES:
				setCbytes((CbytesType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CEILING:
				setCeiling((CeilingType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CERROR:
				setCerror((CerrorType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CI:
				setCi((CiType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CN:
				setCn((CnType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CODOMAIN:
				setCodomain((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__COMPLEXES:
				setComplexes((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__COMPOSE:
				setCompose((NaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CONDITION:
				setCondition((ConditionType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CONJUGATE:
				setConjugate((ConjugateType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__COS:
				setCos((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__COSH:
				setCosh((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__COT:
				setCot((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__COTH:
				setCoth((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CS:
				setCs((CsType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CSC:
				setCsc((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CSCH:
				setCsch((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CSYMBOL:
				setCsymbol((CsymbolType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__CURL:
				setCurl((UnaryVeccalcClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DECLARE:
				setDeclare((DeclareType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DEGREE:
				setDegree((DegreeType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DETERMINANT:
				setDeterminant((UnaryLinalgClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DIFF:
				setDiff((DifferentialOperatorClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DIVERGENCE:
				setDivergence((UnaryVeccalcClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DIVIDE:
				setDivide((DivideType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DOMAIN:
				setDomain((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__DOMAINOFAPPLICATION:
				setDomainofapplication((DomainofapplicationType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EMPTYSET:
				setEmptyset((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EQ:
				setEq((NaryRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EQUIVALENT:
				setEquivalent((BinaryLogicalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EULERGAMMA:
				setEulergamma((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EXISTS:
				setExists((QuantifierClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EXP:
				setExp((ExpType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__EXPONENTIALE:
				setExponentiale((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__FACTORIAL:
				setFactorial((FactorialType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__FACTOROF:
				setFactorof((FactorofType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__FALSE:
				setFalse((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__FLOOR:
				setFloor((FloorType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__FN:
				setFn((FnType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__FORALL:
				setForall((QuantifierClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__GCD:
				setGcd((NaryArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__GEQ:
				setGeq((NaryRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__GRAD:
				setGrad((UnaryVeccalcClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__GT:
				setGt((NaryRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__IDENT:
				setIdent((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__IMAGE:
				setImage((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__IMAGINARY:
				setImaginary((ImaginaryType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__IMAGINARYI:
				setImaginaryi((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__IMPLIES:
				setImplies((BinaryLogicalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__IN:
				setIn((BinarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__INFINITY:
				setInfinity((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__INT:
				setInt((IntClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__INTEGERS:
				setIntegers((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__INTERSECT:
				setIntersect((NarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__INTERVAL:
				setInterval((IntervalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__INVERSE:
				setInverse((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LAMBDA:
				setLambda((LambdaClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LAPLACIAN:
				setLaplacian((UnaryVeccalcClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LCM:
				setLcm((NaryArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LEQ:
				setLeq((NaryRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LIMIT:
				setLimit((LimitClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LIST:
				setList((ListType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LN:
				setLn((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LOG:
				setLog((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LOGBASE:
				setLogbase((LogbaseType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LOWLIMIT:
				setLowlimit((LowlimitType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__LT:
				setLt((NaryRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MACTION:
				setMaction((MactionType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MALIGNGROUP:
				setMaligngroup((MaligngroupType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MALIGNMARK:
				setMalignmark((MalignmarkType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MATH:
				setMath((MathType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MATRIX:
				setMatrix((NaryConstructorClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MATRIXROW:
				setMatrixrow((NaryConstructorClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MAX:
				setMax((NaryMinmaxClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MEAN:
				setMean((NaryStatsClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MEDIAN:
				setMedian((NaryStatsClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MENCLOSE:
				setMenclose((MencloseType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MERROR:
				setMerror((MerrorType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MFENCED:
				setMfenced((MfencedType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MFRAC:
				setMfrac((MfracType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MGLYPH:
				setMglyph((MglyphType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MI:
				setMi((MiType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MIN:
				setMin((NaryMinmaxClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MINUS:
				setMinus((MinusType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MLABELEDTR:
				setMlabeledtr((MlabeledtrType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MLONGDIV:
				setMlongdiv((MlongdivType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MMULTISCRIPTS:
				setMmultiscripts((MmultiscriptsType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MN:
				setMn((MnType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MO:
				setMo((MoType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MODE:
				setMode((NaryStatsClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MOMENT:
				setMoment((UnaryFunctionalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MOMENTABOUT:
				setMomentabout((MomentaboutType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MOVER:
				setMover((MoverType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MPADDED:
				setMpadded((MpaddedType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MPHANTOM:
				setMphantom((MphantomType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MPRESCRIPTS:
				setMprescripts((MprescriptsType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MROOT:
				setMroot((MrootType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MROW:
				setMrow((MrowType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MS:
				setMs((MsType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSCARRIES:
				setMscarries((MscarriesType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSCARRY:
				setMscarry((MscarryType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSGROUP:
				setMsgroup((MsgroupType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSLINE:
				setMsline((MslineType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSPACE:
				setMspace((MspaceType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSQRT:
				setMsqrt((MsqrtType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSROW:
				setMsrow((MsrowType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSTACK:
				setMstack((MstackType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSTYLE:
				setMstyle((MstyleType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSUB:
				setMsub((MsubType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSUBSUP:
				setMsubsup((MsubsupType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MSUP:
				setMsup((MsupType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MTABLE:
				setMtable((MtableType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MTD:
				setMtd((TableCellExpressionType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MTEXT:
				setMtext((MtextType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MTR:
				setMtr((MtrType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MUNDER:
				setMunder((MunderType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__MUNDEROVER:
				setMunderover((MunderoverType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NATURALNUMBERS:
				setNaturalnumbers((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NEQ:
				setNeq((NeqType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NONE:
				setNone((NoneType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NOT:
				setNot((UnaryLogicalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTANUMBER:
				setNotanumber((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTIN:
				setNotin((BinarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTPRSUBSET:
				setNotprsubset((BinarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTSUBSET:
				setNotsubset((BinarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__OR:
				setOr((NaryLogicalClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__OTHERWISE:
				setOtherwise((OtherwiseType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__OUTERPRODUCT:
				setOuterproduct((BinaryLinalgClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF:
				setPartialdiff((PartialdiffClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PI:
				setPi((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PIECE:
				setPiece((PieceType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PIECEWISE:
				setPiecewise((PiecewiseType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PLUS:
				setPlus((NaryArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__POWER:
				setPower((PowerType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PRIMES:
				setPrimes((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__PRSUBSET:
				setPrsubset((NarySetRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__QUOTIENT:
				setQuotient((QuotientType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__RATIONALS:
				setRationals((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__REAL:
				setReal((RealType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__REALS:
				setReals((ConstantSetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__RELN:
				setReln((RelnType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__REM:
				setRem((RemType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__ROOT:
				setRoot((RootType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SCALARPRODUCT:
				setScalarproduct((BinaryLinalgClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SDEV:
				setSdev((NaryStatsClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SEC:
				setSec((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SECH:
				setSech((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SELECTOR:
				setSelector((NaryLinalgClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SEP:
				setSep((SepType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SET:
				setSet((SetType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SETDIFF:
				setSetdiff((BinarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SHARE:
				setShare((ShareType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SIN:
				setSin((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SINH:
				setSinh((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SUBSET:
				setSubset((NarySetRelnClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__SUM:
				setSum((SumClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__TAN:
				setTan((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__TANH:
				setTanh((UnaryElementaryClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__TENDSTO:
				setTendsto((TendstoType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__TIMES:
				setTimes((NaryArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__TRANSPOSE:
				setTranspose((UnaryLinalgClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__TRUE:
				setTrue((ConstantArithClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__UNION:
				setUnion((NarySetClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__UPLIMIT:
				setUplimit((UplimitType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__VARIANCE:
				setVariance((NaryStatsClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__VECTOR:
				setVector((NaryConstructorClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__VECTORPRODUCT:
				setVectorproduct((BinaryLinalgClassType)newValue);
				return;
			case MlPackage.DOCUMENT_ROOT__XOR:
				setXor((NaryLogicalClassType)newValue);
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
			case MlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case MlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case MlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case MlPackage.DOCUMENT_ROOT__ABS:
				setAbs((AbsType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__AND:
				setAnd((NaryLogicalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ANNOTATION_XML:
				setAnnotationXml((AnnotationXmlType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__APPLY:
				setApply((ApplyType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__APPROX:
				setApprox((ApproxType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOS:
				setArccos((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOSH:
				setArccosh((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOT:
				setArccot((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCOTH:
				setArccoth((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCSC:
				setArccsc((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCCSCH:
				setArccsch((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSEC:
				setArcsec((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSECH:
				setArcsech((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSIN:
				setArcsin((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCSINH:
				setArcsinh((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCTAN:
				setArctan((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARCTANH:
				setArctanh((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ARG:
				setArg((ArgType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__BIND:
				setBind((BindType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__BVAR:
				setBvar((BvarType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CARD:
				setCard((UnarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CARTESIANPRODUCT:
				setCartesianproduct((NarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CBYTES:
				setCbytes((CbytesType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CEILING:
				setCeiling((CeilingType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CERROR:
				setCerror((CerrorType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CI:
				setCi((CiType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CN:
				setCn((CnType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CODOMAIN:
				setCodomain((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__COMPLEXES:
				setComplexes((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__COMPOSE:
				setCompose((NaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CONDITION:
				setCondition((ConditionType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CONJUGATE:
				setConjugate((ConjugateType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__COS:
				setCos((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__COSH:
				setCosh((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__COT:
				setCot((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__COTH:
				setCoth((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CS:
				setCs((CsType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CSC:
				setCsc((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CSCH:
				setCsch((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CSYMBOL:
				setCsymbol((CsymbolType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__CURL:
				setCurl((UnaryVeccalcClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DECLARE:
				setDeclare((DeclareType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DEGREE:
				setDegree((DegreeType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DETERMINANT:
				setDeterminant((UnaryLinalgClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DIFF:
				setDiff((DifferentialOperatorClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DIVERGENCE:
				setDivergence((UnaryVeccalcClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DIVIDE:
				setDivide((DivideType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DOMAIN:
				setDomain((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__DOMAINOFAPPLICATION:
				setDomainofapplication((DomainofapplicationType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EMPTYSET:
				setEmptyset((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EQ:
				setEq((NaryRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EQUIVALENT:
				setEquivalent((BinaryLogicalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EULERGAMMA:
				setEulergamma((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EXISTS:
				setExists((QuantifierClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EXP:
				setExp((ExpType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__EXPONENTIALE:
				setExponentiale((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__FACTORIAL:
				setFactorial((FactorialType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__FACTOROF:
				setFactorof((FactorofType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__FALSE:
				setFalse((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__FLOOR:
				setFloor((FloorType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__FN:
				setFn((FnType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__FORALL:
				setForall((QuantifierClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__GCD:
				setGcd((NaryArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__GEQ:
				setGeq((NaryRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__GRAD:
				setGrad((UnaryVeccalcClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__GT:
				setGt((NaryRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__IDENT:
				setIdent((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__IMAGE:
				setImage((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__IMAGINARY:
				setImaginary((ImaginaryType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__IMAGINARYI:
				setImaginaryi((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__IMPLIES:
				setImplies((BinaryLogicalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__IN:
				setIn((BinarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__INFINITY:
				setInfinity((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__INT:
				setInt((IntClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__INTEGERS:
				setIntegers((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__INTERSECT:
				setIntersect((NarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__INTERVAL:
				setInterval((IntervalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__INVERSE:
				setInverse((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LAMBDA:
				setLambda((LambdaClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LAPLACIAN:
				setLaplacian((UnaryVeccalcClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LCM:
				setLcm((NaryArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LEQ:
				setLeq((NaryRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LIMIT:
				setLimit((LimitClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LIST:
				setList((ListType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LN:
				setLn((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LOG:
				setLog((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LOGBASE:
				setLogbase((LogbaseType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LOWLIMIT:
				setLowlimit((LowlimitType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__LT:
				setLt((NaryRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MACTION:
				setMaction((MactionType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MALIGNGROUP:
				setMaligngroup((MaligngroupType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MALIGNMARK:
				setMalignmark((MalignmarkType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MATH:
				setMath((MathType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MATRIX:
				setMatrix((NaryConstructorClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MATRIXROW:
				setMatrixrow((NaryConstructorClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MAX:
				setMax((NaryMinmaxClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MEAN:
				setMean((NaryStatsClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MEDIAN:
				setMedian((NaryStatsClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MENCLOSE:
				setMenclose((MencloseType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MERROR:
				setMerror((MerrorType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MFENCED:
				setMfenced((MfencedType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MFRAC:
				setMfrac((MfracType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MGLYPH:
				setMglyph((MglyphType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MI:
				setMi((MiType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MIN:
				setMin((NaryMinmaxClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MINUS:
				setMinus((MinusType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MLABELEDTR:
				setMlabeledtr((MlabeledtrType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MLONGDIV:
				setMlongdiv((MlongdivType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MMULTISCRIPTS:
				setMmultiscripts((MmultiscriptsType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MN:
				setMn((MnType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MO:
				setMo((MoType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MODE:
				setMode((NaryStatsClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MOMENT:
				setMoment((UnaryFunctionalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MOMENTABOUT:
				setMomentabout((MomentaboutType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MOVER:
				setMover((MoverType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MPADDED:
				setMpadded((MpaddedType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MPHANTOM:
				setMphantom((MphantomType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MPRESCRIPTS:
				setMprescripts((MprescriptsType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MROOT:
				setMroot((MrootType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MROW:
				setMrow((MrowType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MS:
				setMs((MsType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSCARRIES:
				setMscarries((MscarriesType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSCARRY:
				setMscarry((MscarryType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSGROUP:
				setMsgroup((MsgroupType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSLINE:
				setMsline((MslineType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSPACE:
				setMspace((MspaceType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSQRT:
				setMsqrt((MsqrtType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSROW:
				setMsrow((MsrowType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSTACK:
				setMstack((MstackType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSTYLE:
				setMstyle((MstyleType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSUB:
				setMsub((MsubType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSUBSUP:
				setMsubsup((MsubsupType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MSUP:
				setMsup((MsupType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MTABLE:
				setMtable((MtableType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MTD:
				setMtd((TableCellExpressionType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MTEXT:
				setMtext((MtextType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MTR:
				setMtr((MtrType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MUNDER:
				setMunder((MunderType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__MUNDEROVER:
				setMunderover((MunderoverType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NATURALNUMBERS:
				setNaturalnumbers((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NEQ:
				setNeq((NeqType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NONE:
				setNone((NoneType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NOT:
				setNot((UnaryLogicalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTANUMBER:
				setNotanumber((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTIN:
				setNotin((BinarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTPRSUBSET:
				setNotprsubset((BinarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__NOTSUBSET:
				setNotsubset((BinarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__OR:
				setOr((NaryLogicalClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__OTHERWISE:
				setOtherwise((OtherwiseType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__OUTERPRODUCT:
				setOuterproduct((BinaryLinalgClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF:
				setPartialdiff((PartialdiffClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PI:
				setPi((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PIECE:
				setPiece((PieceType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PIECEWISE:
				setPiecewise((PiecewiseType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PLUS:
				setPlus((NaryArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__POWER:
				setPower((PowerType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PRIMES:
				setPrimes((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__PRSUBSET:
				setPrsubset((NarySetRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__QUOTIENT:
				setQuotient((QuotientType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__RATIONALS:
				setRationals((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__REAL:
				setReal((RealType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__REALS:
				setReals((ConstantSetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__RELN:
				setReln((RelnType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__REM:
				setRem((RemType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__ROOT:
				setRoot((RootType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SCALARPRODUCT:
				setScalarproduct((BinaryLinalgClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SDEV:
				setSdev((NaryStatsClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SEC:
				setSec((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SECH:
				setSech((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SELECTOR:
				setSelector((NaryLinalgClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SEP:
				setSep((SepType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SET:
				setSet((SetType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SETDIFF:
				setSetdiff((BinarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SHARE:
				setShare((ShareType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SIN:
				setSin((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SINH:
				setSinh((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SUBSET:
				setSubset((NarySetRelnClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__SUM:
				setSum((SumClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__TAN:
				setTan((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__TANH:
				setTanh((UnaryElementaryClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__TENDSTO:
				setTendsto((TendstoType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__TIMES:
				setTimes((NaryArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__TRANSPOSE:
				setTranspose((UnaryLinalgClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__TRUE:
				setTrue((ConstantArithClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__UNION:
				setUnion((NarySetClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__UPLIMIT:
				setUplimit((UplimitType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__VARIANCE:
				setVariance((NaryStatsClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__VECTOR:
				setVector((NaryConstructorClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__VECTORPRODUCT:
				setVectorproduct((BinaryLinalgClassType)null);
				return;
			case MlPackage.DOCUMENT_ROOT__XOR:
				setXor((NaryLogicalClassType)null);
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
			case MlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case MlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case MlPackage.DOCUMENT_ROOT__ABS:
				return getAbs() != null;
			case MlPackage.DOCUMENT_ROOT__AND:
				return getAnd() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass() != null;
			case MlPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case MlPackage.DOCUMENT_ROOT__ANNOTATION_XML:
				return getAnnotationXml() != null;
			case MlPackage.DOCUMENT_ROOT__APPLY:
				return getApply() != null;
			case MlPackage.DOCUMENT_ROOT__APPROX:
				return getApprox() != null;
			case MlPackage.DOCUMENT_ROOT__BINARY_RELN_CLASS:
				return getBinaryRelnClass() != null;
			case MlPackage.DOCUMENT_ROOT__ARCCOS:
				return getArccos() != null;
			case MlPackage.DOCUMENT_ROOT__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass() != null;
			case MlPackage.DOCUMENT_ROOT__ARCCOSH:
				return getArccosh() != null;
			case MlPackage.DOCUMENT_ROOT__ARCCOT:
				return getArccot() != null;
			case MlPackage.DOCUMENT_ROOT__ARCCOTH:
				return getArccoth() != null;
			case MlPackage.DOCUMENT_ROOT__ARCCSC:
				return getArccsc() != null;
			case MlPackage.DOCUMENT_ROOT__ARCCSCH:
				return getArccsch() != null;
			case MlPackage.DOCUMENT_ROOT__ARCSEC:
				return getArcsec() != null;
			case MlPackage.DOCUMENT_ROOT__ARCSECH:
				return getArcsech() != null;
			case MlPackage.DOCUMENT_ROOT__ARCSIN:
				return getArcsin() != null;
			case MlPackage.DOCUMENT_ROOT__ARCSINH:
				return getArcsinh() != null;
			case MlPackage.DOCUMENT_ROOT__ARCTAN:
				return getArctan() != null;
			case MlPackage.DOCUMENT_ROOT__ARCTANH:
				return getArctanh() != null;
			case MlPackage.DOCUMENT_ROOT__ARG:
				return getArg() != null;
			case MlPackage.DOCUMENT_ROOT__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass() != null;
			case MlPackage.DOCUMENT_ROOT__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass() != null;
			case MlPackage.DOCUMENT_ROOT__BINARY_SET_CLASS:
				return getBinarySetClass() != null;
			case MlPackage.DOCUMENT_ROOT__BIND:
				return getBind() != null;
			case MlPackage.DOCUMENT_ROOT__BVAR:
				return getBvar() != null;
			case MlPackage.DOCUMENT_ROOT__CARD:
				return getCard() != null;
			case MlPackage.DOCUMENT_ROOT__UNARY_SET_CLASS:
				return getUnarySetClass() != null;
			case MlPackage.DOCUMENT_ROOT__CARTESIANPRODUCT:
				return getCartesianproduct() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_SET_CLASS:
				return getNarySetClass() != null;
			case MlPackage.DOCUMENT_ROOT__CBYTES:
				return getCbytes() != null;
			case MlPackage.DOCUMENT_ROOT__CEILING:
				return getCeiling() != null;
			case MlPackage.DOCUMENT_ROOT__CERROR:
				return getCerror() != null;
			case MlPackage.DOCUMENT_ROOT__CI:
				return getCi() != null;
			case MlPackage.DOCUMENT_ROOT__CN:
				return getCn() != null;
			case MlPackage.DOCUMENT_ROOT__CODOMAIN:
				return getCodomain() != null;
			case MlPackage.DOCUMENT_ROOT__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass() != null;
			case MlPackage.DOCUMENT_ROOT__COMPLEXES:
				return getComplexes() != null;
			case MlPackage.DOCUMENT_ROOT__CONSTANT_SET_CLASS:
				return getConstantSetClass() != null;
			case MlPackage.DOCUMENT_ROOT__COMPOSE:
				return getCompose() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass() != null;
			case MlPackage.DOCUMENT_ROOT__CONDITION:
				return getCondition() != null;
			case MlPackage.DOCUMENT_ROOT__CONJUGATE:
				return getConjugate() != null;
			case MlPackage.DOCUMENT_ROOT__CONSTANT_ARITH_CLASS:
				return getConstantArithClass() != null;
			case MlPackage.DOCUMENT_ROOT__COS:
				return getCos() != null;
			case MlPackage.DOCUMENT_ROOT__COSH:
				return getCosh() != null;
			case MlPackage.DOCUMENT_ROOT__COT:
				return getCot() != null;
			case MlPackage.DOCUMENT_ROOT__COTH:
				return getCoth() != null;
			case MlPackage.DOCUMENT_ROOT__CS:
				return getCs() != null;
			case MlPackage.DOCUMENT_ROOT__CSC:
				return getCsc() != null;
			case MlPackage.DOCUMENT_ROOT__CSCH:
				return getCsch() != null;
			case MlPackage.DOCUMENT_ROOT__CSYMBOL:
				return getCsymbol() != null;
			case MlPackage.DOCUMENT_ROOT__CURL:
				return getCurl() != null;
			case MlPackage.DOCUMENT_ROOT__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass() != null;
			case MlPackage.DOCUMENT_ROOT__DECLARE:
				return getDeclare() != null;
			case MlPackage.DOCUMENT_ROOT__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp() != null;
			case MlPackage.DOCUMENT_ROOT__DEGREE:
				return getDegree() != null;
			case MlPackage.DOCUMENT_ROOT__DETERMINANT:
				return getDeterminant() != null;
			case MlPackage.DOCUMENT_ROOT__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass() != null;
			case MlPackage.DOCUMENT_ROOT__DIFF:
				return getDiff() != null;
			case MlPackage.DOCUMENT_ROOT__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass() != null;
			case MlPackage.DOCUMENT_ROOT__DIVERGENCE:
				return getDivergence() != null;
			case MlPackage.DOCUMENT_ROOT__DIVIDE:
				return getDivide() != null;
			case MlPackage.DOCUMENT_ROOT__DOMAIN:
				return getDomain() != null;
			case MlPackage.DOCUMENT_ROOT__DOMAINOFAPPLICATION:
				return getDomainofapplication() != null;
			case MlPackage.DOCUMENT_ROOT__EMPTYSET:
				return getEmptyset() != null;
			case MlPackage.DOCUMENT_ROOT__EQ:
				return getEq() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_RELN_CLASS:
				return getNaryRelnClass() != null;
			case MlPackage.DOCUMENT_ROOT__EQUIVALENT:
				return getEquivalent() != null;
			case MlPackage.DOCUMENT_ROOT__EULERGAMMA:
				return getEulergamma() != null;
			case MlPackage.DOCUMENT_ROOT__EXISTS:
				return getExists() != null;
			case MlPackage.DOCUMENT_ROOT__QUANTIFIER_CLASS:
				return getQuantifierClass() != null;
			case MlPackage.DOCUMENT_ROOT__EXP:
				return getExp() != null;
			case MlPackage.DOCUMENT_ROOT__EXPONENTIALE:
				return getExponentiale() != null;
			case MlPackage.DOCUMENT_ROOT__FACTORIAL:
				return getFactorial() != null;
			case MlPackage.DOCUMENT_ROOT__FACTOROF:
				return getFactorof() != null;
			case MlPackage.DOCUMENT_ROOT__FALSE:
				return getFalse() != null;
			case MlPackage.DOCUMENT_ROOT__FLOOR:
				return getFloor() != null;
			case MlPackage.DOCUMENT_ROOT__FN:
				return getFn() != null;
			case MlPackage.DOCUMENT_ROOT__FORALL:
				return getForall() != null;
			case MlPackage.DOCUMENT_ROOT__GCD:
				return getGcd() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_ARITH_CLASS:
				return getNaryArithClass() != null;
			case MlPackage.DOCUMENT_ROOT__GEQ:
				return getGeq() != null;
			case MlPackage.DOCUMENT_ROOT__GRAD:
				return getGrad() != null;
			case MlPackage.DOCUMENT_ROOT__GT:
				return getGt() != null;
			case MlPackage.DOCUMENT_ROOT__IDENT:
				return getIdent() != null;
			case MlPackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case MlPackage.DOCUMENT_ROOT__IMAGINARY:
				return getImaginary() != null;
			case MlPackage.DOCUMENT_ROOT__IMAGINARYI:
				return getImaginaryi() != null;
			case MlPackage.DOCUMENT_ROOT__IMPLIES:
				return getImplies() != null;
			case MlPackage.DOCUMENT_ROOT__IN:
				return getIn() != null;
			case MlPackage.DOCUMENT_ROOT__INFINITY:
				return getInfinity() != null;
			case MlPackage.DOCUMENT_ROOT__INT:
				return getInt() != null;
			case MlPackage.DOCUMENT_ROOT__INT_CLASS:
				return getIntClass() != null;
			case MlPackage.DOCUMENT_ROOT__INTEGERS:
				return getIntegers() != null;
			case MlPackage.DOCUMENT_ROOT__INTERSECT:
				return getIntersect() != null;
			case MlPackage.DOCUMENT_ROOT__INTERVAL:
				return getInterval() != null;
			case MlPackage.DOCUMENT_ROOT__INTERVAL_CLASS:
				return getIntervalClass() != null;
			case MlPackage.DOCUMENT_ROOT__INVERSE:
				return getInverse() != null;
			case MlPackage.DOCUMENT_ROOT__LAMBDA:
				return getLambda() != null;
			case MlPackage.DOCUMENT_ROOT__LAMBDA_CLASS:
				return getLambdaClass() != null;
			case MlPackage.DOCUMENT_ROOT__LAPLACIAN:
				return getLaplacian() != null;
			case MlPackage.DOCUMENT_ROOT__LCM:
				return getLcm() != null;
			case MlPackage.DOCUMENT_ROOT__LEQ:
				return getLeq() != null;
			case MlPackage.DOCUMENT_ROOT__LIMIT:
				return getLimit() != null;
			case MlPackage.DOCUMENT_ROOT__LIMIT_CLASS:
				return getLimitClass() != null;
			case MlPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass() != null;
			case MlPackage.DOCUMENT_ROOT__LN:
				return getLn() != null;
			case MlPackage.DOCUMENT_ROOT__LOG:
				return getLog() != null;
			case MlPackage.DOCUMENT_ROOT__LOGBASE:
				return getLogbase() != null;
			case MlPackage.DOCUMENT_ROOT__LOWLIMIT:
				return getLowlimit() != null;
			case MlPackage.DOCUMENT_ROOT__LT:
				return getLt() != null;
			case MlPackage.DOCUMENT_ROOT__MACTION:
				return getMaction() != null;
			case MlPackage.DOCUMENT_ROOT__PRESENTATION_EXPRESSION:
				return getPresentationExpression() != null;
			case MlPackage.DOCUMENT_ROOT__MALIGN_EXPRESSION:
				return getMalignExpression() != null;
			case MlPackage.DOCUMENT_ROOT__MALIGNGROUP:
				return getMaligngroup() != null;
			case MlPackage.DOCUMENT_ROOT__MALIGNMARK:
				return getMalignmark() != null;
			case MlPackage.DOCUMENT_ROOT__MATH:
				return getMath() != null;
			case MlPackage.DOCUMENT_ROOT__MATRIX:
				return getMatrix() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass() != null;
			case MlPackage.DOCUMENT_ROOT__MATRIXROW:
				return getMatrixrow() != null;
			case MlPackage.DOCUMENT_ROOT__MAX:
				return getMax() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass() != null;
			case MlPackage.DOCUMENT_ROOT__MEAN:
				return getMean() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_STATS_CLASS:
				return getNaryStatsClass() != null;
			case MlPackage.DOCUMENT_ROOT__MEDIAN:
				return getMedian() != null;
			case MlPackage.DOCUMENT_ROOT__MENCLOSE:
				return getMenclose() != null;
			case MlPackage.DOCUMENT_ROOT__MERROR:
				return getMerror() != null;
			case MlPackage.DOCUMENT_ROOT__MFENCED:
				return getMfenced() != null;
			case MlPackage.DOCUMENT_ROOT__MFRAC:
				return getMfrac() != null;
			case MlPackage.DOCUMENT_ROOT__MGLYPH:
				return getMglyph() != null;
			case MlPackage.DOCUMENT_ROOT__MI:
				return getMi() != null;
			case MlPackage.DOCUMENT_ROOT__TOKEN_EXPRESSION:
				return getTokenExpression() != null;
			case MlPackage.DOCUMENT_ROOT__MIN:
				return getMin() != null;
			case MlPackage.DOCUMENT_ROOT__MINUS:
				return getMinus() != null;
			case MlPackage.DOCUMENT_ROOT__MLABELEDTR:
				return getMlabeledtr() != null;
			case MlPackage.DOCUMENT_ROOT__TABLE_ROW_EXPRESSION:
				return getTableRowExpression() != null;
			case MlPackage.DOCUMENT_ROOT__MLONGDIV:
				return getMlongdiv() != null;
			case MlPackage.DOCUMENT_ROOT__MMULTISCRIPTS:
				return getMmultiscripts() != null;
			case MlPackage.DOCUMENT_ROOT__MN:
				return getMn() != null;
			case MlPackage.DOCUMENT_ROOT__MO:
				return getMo() != null;
			case MlPackage.DOCUMENT_ROOT__MODE:
				return getMode() != null;
			case MlPackage.DOCUMENT_ROOT__MOMENT:
				return getMoment() != null;
			case MlPackage.DOCUMENT_ROOT__MOMENTABOUT:
				return getMomentabout() != null;
			case MlPackage.DOCUMENT_ROOT__MOVER:
				return getMover() != null;
			case MlPackage.DOCUMENT_ROOT__MPADDED:
				return getMpadded() != null;
			case MlPackage.DOCUMENT_ROOT__MPHANTOM:
				return getMphantom() != null;
			case MlPackage.DOCUMENT_ROOT__MPRESCRIPTS:
				return getMprescripts() != null;
			case MlPackage.DOCUMENT_ROOT__MROOT:
				return getMroot() != null;
			case MlPackage.DOCUMENT_ROOT__MROW:
				return getMrow() != null;
			case MlPackage.DOCUMENT_ROOT__MS:
				return getMs() != null;
			case MlPackage.DOCUMENT_ROOT__MSCARRIES:
				return getMscarries() != null;
			case MlPackage.DOCUMENT_ROOT__MSCARRY:
				return getMscarry() != null;
			case MlPackage.DOCUMENT_ROOT__MSGROUP:
				return getMsgroup() != null;
			case MlPackage.DOCUMENT_ROOT__MSLINE:
				return getMsline() != null;
			case MlPackage.DOCUMENT_ROOT__MSPACE:
				return getMspace() != null;
			case MlPackage.DOCUMENT_ROOT__MSQRT:
				return getMsqrt() != null;
			case MlPackage.DOCUMENT_ROOT__MSROW:
				return getMsrow() != null;
			case MlPackage.DOCUMENT_ROOT__MSTACK:
				return getMstack() != null;
			case MlPackage.DOCUMENT_ROOT__MSTYLE:
				return getMstyle() != null;
			case MlPackage.DOCUMENT_ROOT__MSUB:
				return getMsub() != null;
			case MlPackage.DOCUMENT_ROOT__MSUBSUP:
				return getMsubsup() != null;
			case MlPackage.DOCUMENT_ROOT__MSUP:
				return getMsup() != null;
			case MlPackage.DOCUMENT_ROOT__MTABLE:
				return getMtable() != null;
			case MlPackage.DOCUMENT_ROOT__MTD:
				return getMtd() != null;
			case MlPackage.DOCUMENT_ROOT__TABLE_CELL_EXPRESSION:
				return getTableCellExpression() != null;
			case MlPackage.DOCUMENT_ROOT__MTEXT:
				return getMtext() != null;
			case MlPackage.DOCUMENT_ROOT__MTR:
				return getMtr() != null;
			case MlPackage.DOCUMENT_ROOT__MUNDER:
				return getMunder() != null;
			case MlPackage.DOCUMENT_ROOT__MUNDEROVER:
				return getMunderover() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_LINALG_CLASS:
				return getNaryLinalgClass() != null;
			case MlPackage.DOCUMENT_ROOT__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass() != null;
			case MlPackage.DOCUMENT_ROOT__NATURALNUMBERS:
				return getNaturalnumbers() != null;
			case MlPackage.DOCUMENT_ROOT__NEQ:
				return getNeq() != null;
			case MlPackage.DOCUMENT_ROOT__NONE:
				return getNone() != null;
			case MlPackage.DOCUMENT_ROOT__NOT:
				return getNot() != null;
			case MlPackage.DOCUMENT_ROOT__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass() != null;
			case MlPackage.DOCUMENT_ROOT__NOTANUMBER:
				return getNotanumber() != null;
			case MlPackage.DOCUMENT_ROOT__NOTIN:
				return getNotin() != null;
			case MlPackage.DOCUMENT_ROOT__NOTPRSUBSET:
				return getNotprsubset() != null;
			case MlPackage.DOCUMENT_ROOT__NOTSUBSET:
				return getNotsubset() != null;
			case MlPackage.DOCUMENT_ROOT__OR:
				return getOr() != null;
			case MlPackage.DOCUMENT_ROOT__OTHERWISE:
				return getOtherwise() != null;
			case MlPackage.DOCUMENT_ROOT__OUTERPRODUCT:
				return getOuterproduct() != null;
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF:
				return getPartialdiff() != null;
			case MlPackage.DOCUMENT_ROOT__PARTIALDIFF_CLASS:
				return getPartialdiffClass() != null;
			case MlPackage.DOCUMENT_ROOT__PI:
				return getPi() != null;
			case MlPackage.DOCUMENT_ROOT__PIECE:
				return getPiece() != null;
			case MlPackage.DOCUMENT_ROOT__PIECEWISE:
				return getPiecewise() != null;
			case MlPackage.DOCUMENT_ROOT__PLUS:
				return getPlus() != null;
			case MlPackage.DOCUMENT_ROOT__POWER:
				return getPower() != null;
			case MlPackage.DOCUMENT_ROOT__PRIMES:
				return getPrimes() != null;
			case MlPackage.DOCUMENT_ROOT__PRODUCT:
				return getProduct() != null;
			case MlPackage.DOCUMENT_ROOT__PRODUCT_CLASS:
				return getProductClass() != null;
			case MlPackage.DOCUMENT_ROOT__PRSUBSET:
				return getPrsubset() != null;
			case MlPackage.DOCUMENT_ROOT__QUOTIENT:
				return getQuotient() != null;
			case MlPackage.DOCUMENT_ROOT__RATIONALS:
				return getRationals() != null;
			case MlPackage.DOCUMENT_ROOT__REAL:
				return getReal() != null;
			case MlPackage.DOCUMENT_ROOT__REALS:
				return getReals() != null;
			case MlPackage.DOCUMENT_ROOT__RELN:
				return getReln() != null;
			case MlPackage.DOCUMENT_ROOT__REM:
				return getRem() != null;
			case MlPackage.DOCUMENT_ROOT__ROOT:
				return getRoot() != null;
			case MlPackage.DOCUMENT_ROOT__SCALARPRODUCT:
				return getScalarproduct() != null;
			case MlPackage.DOCUMENT_ROOT__SDEV:
				return getSdev() != null;
			case MlPackage.DOCUMENT_ROOT__SEC:
				return getSec() != null;
			case MlPackage.DOCUMENT_ROOT__SECH:
				return getSech() != null;
			case MlPackage.DOCUMENT_ROOT__SELECTOR:
				return getSelector() != null;
			case MlPackage.DOCUMENT_ROOT__SEP:
				return getSep() != null;
			case MlPackage.DOCUMENT_ROOT__SET:
				return getSet() != null;
			case MlPackage.DOCUMENT_ROOT__SETDIFF:
				return getSetdiff() != null;
			case MlPackage.DOCUMENT_ROOT__SHARE:
				return getShare() != null;
			case MlPackage.DOCUMENT_ROOT__SIN:
				return getSin() != null;
			case MlPackage.DOCUMENT_ROOT__SINH:
				return getSinh() != null;
			case MlPackage.DOCUMENT_ROOT__SUBSET:
				return getSubset() != null;
			case MlPackage.DOCUMENT_ROOT__SUM:
				return getSum() != null;
			case MlPackage.DOCUMENT_ROOT__SUM_CLASS:
				return getSumClass() != null;
			case MlPackage.DOCUMENT_ROOT__TAN:
				return getTan() != null;
			case MlPackage.DOCUMENT_ROOT__TANH:
				return getTanh() != null;
			case MlPackage.DOCUMENT_ROOT__TENDSTO:
				return getTendsto() != null;
			case MlPackage.DOCUMENT_ROOT__TIMES:
				return getTimes() != null;
			case MlPackage.DOCUMENT_ROOT__TRANSPOSE:
				return getTranspose() != null;
			case MlPackage.DOCUMENT_ROOT__TRUE:
				return getTrue() != null;
			case MlPackage.DOCUMENT_ROOT__UNION:
				return getUnion() != null;
			case MlPackage.DOCUMENT_ROOT__UPLIMIT:
				return getUplimit() != null;
			case MlPackage.DOCUMENT_ROOT__VARIANCE:
				return getVariance() != null;
			case MlPackage.DOCUMENT_ROOT__VECTOR:
				return getVector() != null;
			case MlPackage.DOCUMENT_ROOT__VECTORPRODUCT:
				return getVectorproduct() != null;
			case MlPackage.DOCUMENT_ROOT__XOR:
				return getXor() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
