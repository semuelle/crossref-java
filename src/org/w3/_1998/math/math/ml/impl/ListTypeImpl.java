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
import org.w3._1998.math.math.ml.ListType;
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
import org.w3._1998.math.math.ml.OrderType;
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
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBvarQ <em>Bvar Q</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBvar <em>Bvar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDomainofapplication <em>Domainofapplication</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getLowlimit <em>Lowlimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUplimit <em>Uplimit</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getContExp <em>Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getDefinitionURL <em>Definition URL</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.ListTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeImpl extends MinimalEObjectImpl.Container implements ListType {
	/**
	 * The cached value of the '{@link #getBvarQ() <em>Bvar Q</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBvarQ()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap bvarQ;

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
	 * The cached value of the '{@link #getContExp() <em>Cont Exp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContExp()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contExp;

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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType ORDER_EDEFAULT = OrderType.NUMERIC;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected OrderType order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

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
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBvarQ() {
		if (bvarQ == null) {
			bvarQ = new BasicFeatureMap(this, MlPackage.LIST_TYPE__BVAR_Q);
		}
		return bvarQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BvarType> getBvar() {
		return getBvarQ().list(MlPackage.eINSTANCE.getListType_Bvar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MlPackage.LIST_TYPE__GROUP);
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
		return getGroup().list(MlPackage.eINSTANCE.getListType_Domainofapplication());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionType> getCondition() {
		return getGroup().list(MlPackage.eINSTANCE.getListType_Condition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LowlimitType> getLowlimit() {
		return getGroup().list(MlPackage.eINSTANCE.getListType_Lowlimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UplimitType> getUplimit() {
		return getGroup().list(MlPackage.eINSTANCE.getListType_Uplimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContExp() {
		if (contExp == null) {
			contExp = new BasicFeatureMap(this, MlPackage.LIST_TYPE__CONT_EXP);
		}
		return contExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplyType> getApply() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Apply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindType> getBind() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Bind());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiType> getCi() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Ci());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CnType> getCn() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Cn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsymbolType> getCsymbol() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Csymbol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CbytesType> getCbytes() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Cbytes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CerrorType> getCerror() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Cerror());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsType> getCs() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Cs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShareType> getShare() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Share());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PiecewiseType> getPiecewise() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Piecewise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_DeprecatedContExpGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDeprecatedContExp() {
		return getDeprecatedContExpGroup().list(MlPackage.eINSTANCE.getListType_DeprecatedContExp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_IntervalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntervalClassType> getIntervalClass() {
		return getIntervalClassGroup().list(MlPackage.eINSTANCE.getListType_IntervalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_UnaryFunctionalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryFunctionalClassType> getUnaryFunctionalClass() {
		return getUnaryFunctionalClassGroup().list(MlPackage.eINSTANCE.getListType_UnaryFunctionalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_LambdaClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LambdaClassType> getLambdaClass() {
		return getLambdaClassGroup().list(MlPackage.eINSTANCE.getListType_LambdaClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryFunctionalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryFunctionalClassType> getNaryFunctionalClass() {
		return getNaryFunctionalClassGroup().list(MlPackage.eINSTANCE.getListType_NaryFunctionalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuotientType> getQuotient() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Quotient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DivideType> getDivide() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Divide());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MinusType> getMinus() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Minus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PowerType> getPower() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Power());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemType> getRem() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Rem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootType> getRoot() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Root());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FactorialType> getFactorial() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Factorial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbsType> getAbs() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Abs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConjugateType> getConjugate() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Conjugate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgType> getArg() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Arg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RealType> getReal() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Real());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImaginaryType> getImaginary() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Imaginary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FloorType> getFloor() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Floor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CeilingType> getCeiling() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Ceiling());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpType> getExp() {
		return getContExp().list(MlPackage.eINSTANCE.getListType_Exp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryMinmaxClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryMinmaxClassType> getNaryMinmaxClass() {
		return getNaryMinmaxClassGroup().list(MlPackage.eINSTANCE.getListType_NaryMinmaxClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryArithClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryArithClassType> getNaryArithClass() {
		return getNaryArithClassGroup().list(MlPackage.eINSTANCE.getListType_NaryArithClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryLogicalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryLogicalClassType> getNaryLogicalClass() {
		return getNaryLogicalClassGroup().list(MlPackage.eINSTANCE.getListType_NaryLogicalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_UnaryLogicalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryLogicalClassType> getUnaryLogicalClass() {
		return getUnaryLogicalClassGroup().list(MlPackage.eINSTANCE.getListType_UnaryLogicalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_BinaryLogicalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryLogicalClassType> getBinaryLogicalClass() {
		return getBinaryLogicalClassGroup().list(MlPackage.eINSTANCE.getListType_BinaryLogicalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_QuantifierClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuantifierClassType> getQuantifierClass() {
		return getQuantifierClassGroup().list(MlPackage.eINSTANCE.getListType_QuantifierClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryRelnClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryRelnClassType> getNaryRelnClass() {
		return getNaryRelnClassGroup().list(MlPackage.eINSTANCE.getListType_NaryRelnClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_BinaryRelnClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getBinaryRelnClass() {
		return getBinaryRelnClassGroup().list(MlPackage.eINSTANCE.getListType_BinaryRelnClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_IntClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntClassType> getIntClass() {
		return getIntClassGroup().list(MlPackage.eINSTANCE.getListType_IntClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_DifferentialOperatorClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DifferentialOperatorClassType> getDifferentialOperatorClass() {
		return getDifferentialOperatorClassGroup().list(MlPackage.eINSTANCE.getListType_DifferentialOperatorClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_PartialdiffClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartialdiffClassType> getPartialdiffClass() {
		return getPartialdiffClassGroup().list(MlPackage.eINSTANCE.getListType_PartialdiffClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_UnaryVeccalcClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryVeccalcClassType> getUnaryVeccalcClass() {
		return getUnaryVeccalcClassGroup().list(MlPackage.eINSTANCE.getListType_UnaryVeccalcClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NarySetlistConstructorClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getNarySetlistConstructorClass() {
		return getNarySetlistConstructorClassGroup().list(MlPackage.eINSTANCE.getListType_NarySetlistConstructorClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NarySetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NarySetClassType> getNarySetClass() {
		return getNarySetClassGroup().list(MlPackage.eINSTANCE.getListType_NarySetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_BinarySetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinarySetClassType> getBinarySetClass() {
		return getBinarySetClassGroup().list(MlPackage.eINSTANCE.getListType_BinarySetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NarySetRelnClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NarySetRelnClassType> getNarySetRelnClass() {
		return getNarySetRelnClassGroup().list(MlPackage.eINSTANCE.getListType_NarySetRelnClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_UnarySetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnarySetClassType> getUnarySetClass() {
		return getUnarySetClassGroup().list(MlPackage.eINSTANCE.getListType_UnarySetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_SumClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SumClassType> getSumClass() {
		return getSumClassGroup().list(MlPackage.eINSTANCE.getListType_SumClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_ProductClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductClassType> getProductClass() {
		return getProductClassGroup().list(MlPackage.eINSTANCE.getListType_ProductClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_LimitClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LimitClassType> getLimitClass() {
		return getLimitClassGroup().list(MlPackage.eINSTANCE.getListType_LimitClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_UnaryElementaryClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryElementaryClassType> getUnaryElementaryClass() {
		return getUnaryElementaryClassGroup().list(MlPackage.eINSTANCE.getListType_UnaryElementaryClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryStatsClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryStatsClassType> getNaryStatsClass() {
		return getNaryStatsClassGroup().list(MlPackage.eINSTANCE.getListType_NaryStatsClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryConstructorClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryConstructorClassType> getNaryConstructorClass() {
		return getNaryConstructorClassGroup().list(MlPackage.eINSTANCE.getListType_NaryConstructorClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_UnaryLinalgClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryLinalgClassType> getUnaryLinalgClass() {
		return getUnaryLinalgClassGroup().list(MlPackage.eINSTANCE.getListType_UnaryLinalgClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_NaryLinalgClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryLinalgClassType> getNaryLinalgClass() {
		return getNaryLinalgClassGroup().list(MlPackage.eINSTANCE.getListType_NaryLinalgClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_BinaryLinalgClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryLinalgClassType> getBinaryLinalgClass() {
		return getBinaryLinalgClassGroup().list(MlPackage.eINSTANCE.getListType_BinaryLinalgClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_ConstantSetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantSetClassType> getConstantSetClass() {
		return getConstantSetClassGroup().list(MlPackage.eINSTANCE.getListType_ConstantSetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getListType_ConstantArithClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantArithClassType> getConstantArithClass() {
		return getConstantArithClassGroup().list(MlPackage.eINSTANCE.getListType_ConstantArithClass());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__DEFINITION_URL, oldDefinitionURL, definitionURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__ENCODING, oldEncoding, encoding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderType newOrder) {
		OrderType oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrder() {
		OrderType oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.LIST_TYPE__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrder() {
		return orderESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.LIST_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.LIST_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.LIST_TYPE__BVAR_Q:
				return ((InternalEList<?>)getBvarQ()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BVAR:
				return ((InternalEList<?>)getBvar()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__DOMAINOFAPPLICATION:
				return ((InternalEList<?>)getDomainofapplication()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__LOWLIMIT:
				return ((InternalEList<?>)getLowlimit()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UPLIMIT:
				return ((InternalEList<?>)getUplimit()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONT_EXP:
				return ((InternalEList<?>)getContExp()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__APPLY:
				return ((InternalEList<?>)getApply()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BIND:
				return ((InternalEList<?>)getBind()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CI:
				return ((InternalEList<?>)getCi()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CN:
				return ((InternalEList<?>)getCn()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CSYMBOL:
				return ((InternalEList<?>)getCsymbol()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CBYTES:
				return ((InternalEList<?>)getCbytes()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CERROR:
				return ((InternalEList<?>)getCerror()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CS:
				return ((InternalEList<?>)getCs()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__SHARE:
				return ((InternalEList<?>)getShare()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__PIECEWISE:
				return ((InternalEList<?>)getPiecewise()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return ((InternalEList<?>)getDeprecatedContExpGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP:
				return ((InternalEList<?>)getDeprecatedContExp()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__INTERVAL_CLASS_GROUP:
				return ((InternalEList<?>)getIntervalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__INTERVAL_CLASS:
				return ((InternalEList<?>)getIntervalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS:
				return ((InternalEList<?>)getUnaryFunctionalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__LAMBDA_CLASS_GROUP:
				return ((InternalEList<?>)getLambdaClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__LAMBDA_CLASS:
				return ((InternalEList<?>)getLambdaClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS:
				return ((InternalEList<?>)getNaryFunctionalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__QUOTIENT:
				return ((InternalEList<?>)getQuotient()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__DIVIDE:
				return ((InternalEList<?>)getDivide()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__MINUS:
				return ((InternalEList<?>)getMinus()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__POWER:
				return ((InternalEList<?>)getPower()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__REM:
				return ((InternalEList<?>)getRem()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__ROOT:
				return ((InternalEList<?>)getRoot()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__FACTORIAL:
				return ((InternalEList<?>)getFactorial()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__ABS:
				return ((InternalEList<?>)getAbs()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONJUGATE:
				return ((InternalEList<?>)getConjugate()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__ARG:
				return ((InternalEList<?>)getArg()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__REAL:
				return ((InternalEList<?>)getReal()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__IMAGINARY:
				return ((InternalEList<?>)getImaginary()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__FLOOR:
				return ((InternalEList<?>)getFloor()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CEILING:
				return ((InternalEList<?>)getCeiling()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__EXP:
				return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS_GROUP:
				return ((InternalEList<?>)getNaryMinmaxClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS:
				return ((InternalEList<?>)getNaryMinmaxClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getNaryArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS:
				return ((InternalEList<?>)getNaryArithClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS:
				return ((InternalEList<?>)getNaryLogicalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS:
				return ((InternalEList<?>)getUnaryLogicalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS:
				return ((InternalEList<?>)getBinaryLogicalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS_GROUP:
				return ((InternalEList<?>)getQuantifierClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS:
				return ((InternalEList<?>)getQuantifierClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS:
				return ((InternalEList<?>)getNaryRelnClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS:
				return ((InternalEList<?>)getBinaryRelnClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__INT_CLASS_GROUP:
				return ((InternalEList<?>)getIntClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__INT_CLASS:
				return ((InternalEList<?>)getIntClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return ((InternalEList<?>)getDifferentialOperatorClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS_GROUP:
				return ((InternalEList<?>)getPartialdiffClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS:
				return ((InternalEList<?>)getPartialdiffClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS:
				return ((InternalEList<?>)getUnaryVeccalcClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return ((InternalEList<?>)getNarySetlistConstructorClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_SET_CLASS:
				return ((InternalEList<?>)getNarySetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getBinarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS:
				return ((InternalEList<?>)getBinarySetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS:
				return ((InternalEList<?>)getNarySetRelnClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getUnarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS:
				return ((InternalEList<?>)getUnarySetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__SUM_CLASS_GROUP:
				return ((InternalEList<?>)getSumClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__SUM_CLASS:
				return ((InternalEList<?>)getSumClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__PRODUCT_CLASS_GROUP:
				return ((InternalEList<?>)getProductClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__PRODUCT_CLASS:
				return ((InternalEList<?>)getProductClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__LIMIT_CLASS_GROUP:
				return ((InternalEList<?>)getLimitClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__LIMIT_CLASS:
				return ((InternalEList<?>)getLimitClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryElementaryClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS:
				return ((InternalEList<?>)getUnaryElementaryClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS_GROUP:
				return ((InternalEList<?>)getNaryStatsClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS:
				return ((InternalEList<?>)getNaryStatsClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNaryConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS:
				return ((InternalEList<?>)getNaryConstructorClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS:
				return ((InternalEList<?>)getUnaryLinalgClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS:
				return ((InternalEList<?>)getNaryLinalgClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS:
				return ((InternalEList<?>)getBinaryLinalgClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS_GROUP:
				return ((InternalEList<?>)getConstantSetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS:
				return ((InternalEList<?>)getConstantSetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getConstantArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS:
				return ((InternalEList<?>)getConstantArithClass()).basicRemove(otherEnd, msgs);
			case MlPackage.LIST_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.LIST_TYPE__BVAR_Q:
				if (coreType) return getBvarQ();
				return ((FeatureMap.Internal)getBvarQ()).getWrapper();
			case MlPackage.LIST_TYPE__BVAR:
				return getBvar();
			case MlPackage.LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MlPackage.LIST_TYPE__DOMAINOFAPPLICATION:
				return getDomainofapplication();
			case MlPackage.LIST_TYPE__CONDITION:
				return getCondition();
			case MlPackage.LIST_TYPE__LOWLIMIT:
				return getLowlimit();
			case MlPackage.LIST_TYPE__UPLIMIT:
				return getUplimit();
			case MlPackage.LIST_TYPE__CONT_EXP:
				if (coreType) return getContExp();
				return ((FeatureMap.Internal)getContExp()).getWrapper();
			case MlPackage.LIST_TYPE__APPLY:
				return getApply();
			case MlPackage.LIST_TYPE__BIND:
				return getBind();
			case MlPackage.LIST_TYPE__CI:
				return getCi();
			case MlPackage.LIST_TYPE__CN:
				return getCn();
			case MlPackage.LIST_TYPE__CSYMBOL:
				return getCsymbol();
			case MlPackage.LIST_TYPE__CBYTES:
				return getCbytes();
			case MlPackage.LIST_TYPE__CERROR:
				return getCerror();
			case MlPackage.LIST_TYPE__CS:
				return getCs();
			case MlPackage.LIST_TYPE__SHARE:
				return getShare();
			case MlPackage.LIST_TYPE__PIECEWISE:
				return getPiecewise();
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP_GROUP:
				if (coreType) return getDeprecatedContExpGroup();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup()).getWrapper();
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp();
			case MlPackage.LIST_TYPE__INTERVAL_CLASS_GROUP:
				if (coreType) return getIntervalClassGroup();
				return ((FeatureMap.Internal)getIntervalClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__INTERVAL_CLASS:
				return getIntervalClass();
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getUnaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass();
			case MlPackage.LIST_TYPE__LAMBDA_CLASS_GROUP:
				if (coreType) return getLambdaClassGroup();
				return ((FeatureMap.Internal)getLambdaClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__LAMBDA_CLASS:
				return getLambdaClass();
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getNaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass();
			case MlPackage.LIST_TYPE__QUOTIENT:
				return getQuotient();
			case MlPackage.LIST_TYPE__DIVIDE:
				return getDivide();
			case MlPackage.LIST_TYPE__MINUS:
				return getMinus();
			case MlPackage.LIST_TYPE__POWER:
				return getPower();
			case MlPackage.LIST_TYPE__REM:
				return getRem();
			case MlPackage.LIST_TYPE__ROOT:
				return getRoot();
			case MlPackage.LIST_TYPE__FACTORIAL:
				return getFactorial();
			case MlPackage.LIST_TYPE__ABS:
				return getAbs();
			case MlPackage.LIST_TYPE__CONJUGATE:
				return getConjugate();
			case MlPackage.LIST_TYPE__ARG:
				return getArg();
			case MlPackage.LIST_TYPE__REAL:
				return getReal();
			case MlPackage.LIST_TYPE__IMAGINARY:
				return getImaginary();
			case MlPackage.LIST_TYPE__FLOOR:
				return getFloor();
			case MlPackage.LIST_TYPE__CEILING:
				return getCeiling();
			case MlPackage.LIST_TYPE__EXP:
				return getExp();
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS_GROUP:
				if (coreType) return getNaryMinmaxClassGroup();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass();
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS_GROUP:
				if (coreType) return getNaryArithClassGroup();
				return ((FeatureMap.Internal)getNaryArithClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS:
				return getNaryArithClass();
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getNaryLogicalClassGroup();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass();
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getUnaryLogicalClassGroup();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass();
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getBinaryLogicalClassGroup();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass();
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS_GROUP:
				if (coreType) return getQuantifierClassGroup();
				return ((FeatureMap.Internal)getQuantifierClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS:
				return getQuantifierClass();
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS_GROUP:
				if (coreType) return getNaryRelnClassGroup();
				return ((FeatureMap.Internal)getNaryRelnClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS:
				return getNaryRelnClass();
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS_GROUP:
				if (coreType) return getBinaryRelnClassGroup();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS:
				return getBinaryRelnClass();
			case MlPackage.LIST_TYPE__INT_CLASS_GROUP:
				if (coreType) return getIntClassGroup();
				return ((FeatureMap.Internal)getIntClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__INT_CLASS:
				return getIntClass();
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				if (coreType) return getDifferentialOperatorClassGroup();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass();
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS_GROUP:
				if (coreType) return getPartialdiffClassGroup();
				return ((FeatureMap.Internal)getPartialdiffClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS:
				return getPartialdiffClass();
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS_GROUP:
				if (coreType) return getUnaryVeccalcClassGroup();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass();
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNarySetlistConstructorClassGroup();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass();
			case MlPackage.LIST_TYPE__NARY_SET_CLASS_GROUP:
				if (coreType) return getNarySetClassGroup();
				return ((FeatureMap.Internal)getNarySetClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_SET_CLASS:
				return getNarySetClass();
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS_GROUP:
				if (coreType) return getBinarySetClassGroup();
				return ((FeatureMap.Internal)getBinarySetClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS:
				return getBinarySetClass();
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS_GROUP:
				if (coreType) return getNarySetRelnClassGroup();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass();
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS_GROUP:
				if (coreType) return getUnarySetClassGroup();
				return ((FeatureMap.Internal)getUnarySetClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS:
				return getUnarySetClass();
			case MlPackage.LIST_TYPE__SUM_CLASS_GROUP:
				if (coreType) return getSumClassGroup();
				return ((FeatureMap.Internal)getSumClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__SUM_CLASS:
				return getSumClass();
			case MlPackage.LIST_TYPE__PRODUCT_CLASS_GROUP:
				if (coreType) return getProductClassGroup();
				return ((FeatureMap.Internal)getProductClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__PRODUCT_CLASS:
				return getProductClass();
			case MlPackage.LIST_TYPE__LIMIT_CLASS_GROUP:
				if (coreType) return getLimitClassGroup();
				return ((FeatureMap.Internal)getLimitClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__LIMIT_CLASS:
				return getLimitClass();
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				if (coreType) return getUnaryElementaryClassGroup();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass();
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS_GROUP:
				if (coreType) return getNaryStatsClassGroup();
				return ((FeatureMap.Internal)getNaryStatsClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS:
				return getNaryStatsClass();
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNaryConstructorClassGroup();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass();
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS_GROUP:
				if (coreType) return getUnaryLinalgClassGroup();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass();
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS_GROUP:
				if (coreType) return getNaryLinalgClassGroup();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS:
				return getNaryLinalgClass();
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS_GROUP:
				if (coreType) return getBinaryLinalgClassGroup();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass();
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS_GROUP:
				if (coreType) return getConstantSetClassGroup();
				return ((FeatureMap.Internal)getConstantSetClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS:
				return getConstantSetClass();
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				if (coreType) return getConstantArithClassGroup();
				return ((FeatureMap.Internal)getConstantArithClassGroup()).getWrapper();
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS:
				return getConstantArithClass();
			case MlPackage.LIST_TYPE__CLASS:
				return getClass_();
			case MlPackage.LIST_TYPE__DEFINITION_URL:
				return getDefinitionURL();
			case MlPackage.LIST_TYPE__ENCODING:
				return getEncoding();
			case MlPackage.LIST_TYPE__HREF:
				return getHref();
			case MlPackage.LIST_TYPE__ID:
				return getId();
			case MlPackage.LIST_TYPE__ORDER:
				return getOrder();
			case MlPackage.LIST_TYPE__OTHER:
				return getOther();
			case MlPackage.LIST_TYPE__STYLE:
				return getStyle();
			case MlPackage.LIST_TYPE__XREF:
				return getXref();
			case MlPackage.LIST_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.LIST_TYPE__BVAR_Q:
				((FeatureMap.Internal)getBvarQ()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__BVAR:
				getBvar().clear();
				getBvar().addAll((Collection<? extends BvarType>)newValue);
				return;
			case MlPackage.LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__DOMAINOFAPPLICATION:
				getDomainofapplication().clear();
				getDomainofapplication().addAll((Collection<? extends DomainofapplicationType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends ConditionType>)newValue);
				return;
			case MlPackage.LIST_TYPE__LOWLIMIT:
				getLowlimit().clear();
				getLowlimit().addAll((Collection<? extends LowlimitType>)newValue);
				return;
			case MlPackage.LIST_TYPE__UPLIMIT:
				getUplimit().clear();
				getUplimit().addAll((Collection<? extends UplimitType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CONT_EXP:
				((FeatureMap.Internal)getContExp()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__APPLY:
				getApply().clear();
				getApply().addAll((Collection<? extends ApplyType>)newValue);
				return;
			case MlPackage.LIST_TYPE__BIND:
				getBind().clear();
				getBind().addAll((Collection<? extends BindType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CI:
				getCi().clear();
				getCi().addAll((Collection<? extends CiType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CN:
				getCn().clear();
				getCn().addAll((Collection<? extends CnType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CSYMBOL:
				getCsymbol().clear();
				getCsymbol().addAll((Collection<? extends CsymbolType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CBYTES:
				getCbytes().clear();
				getCbytes().addAll((Collection<? extends CbytesType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CERROR:
				getCerror().clear();
				getCerror().addAll((Collection<? extends CerrorType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CS:
				getCs().clear();
				getCs().addAll((Collection<? extends CsType>)newValue);
				return;
			case MlPackage.LIST_TYPE__SHARE:
				getShare().clear();
				getShare().addAll((Collection<? extends ShareType>)newValue);
				return;
			case MlPackage.LIST_TYPE__PIECEWISE:
				getPiecewise().clear();
				getPiecewise().addAll((Collection<? extends PiecewiseType>)newValue);
				return;
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP_GROUP:
				((FeatureMap.Internal)getDeprecatedContExpGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__INTERVAL_CLASS_GROUP:
				((FeatureMap.Internal)getIntervalClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__LAMBDA_CLASS_GROUP:
				((FeatureMap.Internal)getLambdaClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__QUOTIENT:
				getQuotient().clear();
				getQuotient().addAll((Collection<? extends QuotientType>)newValue);
				return;
			case MlPackage.LIST_TYPE__DIVIDE:
				getDivide().clear();
				getDivide().addAll((Collection<? extends DivideType>)newValue);
				return;
			case MlPackage.LIST_TYPE__MINUS:
				getMinus().clear();
				getMinus().addAll((Collection<? extends MinusType>)newValue);
				return;
			case MlPackage.LIST_TYPE__POWER:
				getPower().clear();
				getPower().addAll((Collection<? extends PowerType>)newValue);
				return;
			case MlPackage.LIST_TYPE__REM:
				getRem().clear();
				getRem().addAll((Collection<? extends RemType>)newValue);
				return;
			case MlPackage.LIST_TYPE__ROOT:
				getRoot().clear();
				getRoot().addAll((Collection<? extends RootType>)newValue);
				return;
			case MlPackage.LIST_TYPE__FACTORIAL:
				getFactorial().clear();
				getFactorial().addAll((Collection<? extends FactorialType>)newValue);
				return;
			case MlPackage.LIST_TYPE__ABS:
				getAbs().clear();
				getAbs().addAll((Collection<? extends AbsType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CONJUGATE:
				getConjugate().clear();
				getConjugate().addAll((Collection<? extends ConjugateType>)newValue);
				return;
			case MlPackage.LIST_TYPE__ARG:
				getArg().clear();
				getArg().addAll((Collection<? extends ArgType>)newValue);
				return;
			case MlPackage.LIST_TYPE__REAL:
				getReal().clear();
				getReal().addAll((Collection<? extends RealType>)newValue);
				return;
			case MlPackage.LIST_TYPE__IMAGINARY:
				getImaginary().clear();
				getImaginary().addAll((Collection<? extends ImaginaryType>)newValue);
				return;
			case MlPackage.LIST_TYPE__FLOOR:
				getFloor().clear();
				getFloor().addAll((Collection<? extends FloorType>)newValue);
				return;
			case MlPackage.LIST_TYPE__CEILING:
				getCeiling().clear();
				getCeiling().addAll((Collection<? extends CeilingType>)newValue);
				return;
			case MlPackage.LIST_TYPE__EXP:
				getExp().clear();
				getExp().addAll((Collection<? extends ExpType>)newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS_GROUP:
				((FeatureMap.Internal)getNaryMinmaxClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getNaryArithClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS_GROUP:
				((FeatureMap.Internal)getQuantifierClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__INT_CLASS_GROUP:
				((FeatureMap.Internal)getIntClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS_GROUP:
				((FeatureMap.Internal)getPartialdiffClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getBinarySetClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetRelnClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getUnarySetClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__SUM_CLASS_GROUP:
				((FeatureMap.Internal)getSumClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__PRODUCT_CLASS_GROUP:
				((FeatureMap.Internal)getProductClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__LIMIT_CLASS_GROUP:
				((FeatureMap.Internal)getLimitClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryElementaryClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS_GROUP:
				((FeatureMap.Internal)getNaryStatsClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNaryConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS_GROUP:
				((FeatureMap.Internal)getConstantSetClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getConstantArithClassGroup()).set(newValue);
				return;
			case MlPackage.LIST_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.LIST_TYPE__DEFINITION_URL:
				setDefinitionURL((String)newValue);
				return;
			case MlPackage.LIST_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case MlPackage.LIST_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.LIST_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.LIST_TYPE__ORDER:
				setOrder((OrderType)newValue);
				return;
			case MlPackage.LIST_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.LIST_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.LIST_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.LIST_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.LIST_TYPE__BVAR_Q:
				getBvarQ().clear();
				return;
			case MlPackage.LIST_TYPE__BVAR:
				getBvar().clear();
				return;
			case MlPackage.LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case MlPackage.LIST_TYPE__DOMAINOFAPPLICATION:
				getDomainofapplication().clear();
				return;
			case MlPackage.LIST_TYPE__CONDITION:
				getCondition().clear();
				return;
			case MlPackage.LIST_TYPE__LOWLIMIT:
				getLowlimit().clear();
				return;
			case MlPackage.LIST_TYPE__UPLIMIT:
				getUplimit().clear();
				return;
			case MlPackage.LIST_TYPE__CONT_EXP:
				getContExp().clear();
				return;
			case MlPackage.LIST_TYPE__APPLY:
				getApply().clear();
				return;
			case MlPackage.LIST_TYPE__BIND:
				getBind().clear();
				return;
			case MlPackage.LIST_TYPE__CI:
				getCi().clear();
				return;
			case MlPackage.LIST_TYPE__CN:
				getCn().clear();
				return;
			case MlPackage.LIST_TYPE__CSYMBOL:
				getCsymbol().clear();
				return;
			case MlPackage.LIST_TYPE__CBYTES:
				getCbytes().clear();
				return;
			case MlPackage.LIST_TYPE__CERROR:
				getCerror().clear();
				return;
			case MlPackage.LIST_TYPE__CS:
				getCs().clear();
				return;
			case MlPackage.LIST_TYPE__SHARE:
				getShare().clear();
				return;
			case MlPackage.LIST_TYPE__PIECEWISE:
				getPiecewise().clear();
				return;
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP_GROUP:
				getDeprecatedContExpGroup().clear();
				return;
			case MlPackage.LIST_TYPE__INTERVAL_CLASS_GROUP:
				getIntervalClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				getUnaryFunctionalClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__LAMBDA_CLASS_GROUP:
				getLambdaClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				getNaryFunctionalClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__QUOTIENT:
				getQuotient().clear();
				return;
			case MlPackage.LIST_TYPE__DIVIDE:
				getDivide().clear();
				return;
			case MlPackage.LIST_TYPE__MINUS:
				getMinus().clear();
				return;
			case MlPackage.LIST_TYPE__POWER:
				getPower().clear();
				return;
			case MlPackage.LIST_TYPE__REM:
				getRem().clear();
				return;
			case MlPackage.LIST_TYPE__ROOT:
				getRoot().clear();
				return;
			case MlPackage.LIST_TYPE__FACTORIAL:
				getFactorial().clear();
				return;
			case MlPackage.LIST_TYPE__ABS:
				getAbs().clear();
				return;
			case MlPackage.LIST_TYPE__CONJUGATE:
				getConjugate().clear();
				return;
			case MlPackage.LIST_TYPE__ARG:
				getArg().clear();
				return;
			case MlPackage.LIST_TYPE__REAL:
				getReal().clear();
				return;
			case MlPackage.LIST_TYPE__IMAGINARY:
				getImaginary().clear();
				return;
			case MlPackage.LIST_TYPE__FLOOR:
				getFloor().clear();
				return;
			case MlPackage.LIST_TYPE__CEILING:
				getCeiling().clear();
				return;
			case MlPackage.LIST_TYPE__EXP:
				getExp().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS_GROUP:
				getNaryMinmaxClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS_GROUP:
				getNaryArithClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS_GROUP:
				getNaryLogicalClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				getUnaryLogicalClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				getBinaryLogicalClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS_GROUP:
				getQuantifierClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS_GROUP:
				getNaryRelnClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS_GROUP:
				getBinaryRelnClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__INT_CLASS_GROUP:
				getIntClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				getDifferentialOperatorClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS_GROUP:
				getPartialdiffClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS_GROUP:
				getUnaryVeccalcClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				getNarySetlistConstructorClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_SET_CLASS_GROUP:
				getNarySetClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS_GROUP:
				getBinarySetClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS_GROUP:
				getNarySetRelnClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS_GROUP:
				getUnarySetClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__SUM_CLASS_GROUP:
				getSumClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__PRODUCT_CLASS_GROUP:
				getProductClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__LIMIT_CLASS_GROUP:
				getLimitClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				getUnaryElementaryClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS_GROUP:
				getNaryStatsClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				getNaryConstructorClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS_GROUP:
				getUnaryLinalgClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS_GROUP:
				getNaryLinalgClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS_GROUP:
				getBinaryLinalgClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS_GROUP:
				getConstantSetClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				getConstantArithClassGroup().clear();
				return;
			case MlPackage.LIST_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__DEFINITION_URL:
				setDefinitionURL(DEFINITION_URL_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__ORDER:
				unsetOrder();
				return;
			case MlPackage.LIST_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.LIST_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.LIST_TYPE__BVAR_Q:
				return bvarQ != null && !bvarQ.isEmpty();
			case MlPackage.LIST_TYPE__BVAR:
				return !getBvar().isEmpty();
			case MlPackage.LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MlPackage.LIST_TYPE__DOMAINOFAPPLICATION:
				return !getDomainofapplication().isEmpty();
			case MlPackage.LIST_TYPE__CONDITION:
				return !getCondition().isEmpty();
			case MlPackage.LIST_TYPE__LOWLIMIT:
				return !getLowlimit().isEmpty();
			case MlPackage.LIST_TYPE__UPLIMIT:
				return !getUplimit().isEmpty();
			case MlPackage.LIST_TYPE__CONT_EXP:
				return contExp != null && !contExp.isEmpty();
			case MlPackage.LIST_TYPE__APPLY:
				return !getApply().isEmpty();
			case MlPackage.LIST_TYPE__BIND:
				return !getBind().isEmpty();
			case MlPackage.LIST_TYPE__CI:
				return !getCi().isEmpty();
			case MlPackage.LIST_TYPE__CN:
				return !getCn().isEmpty();
			case MlPackage.LIST_TYPE__CSYMBOL:
				return !getCsymbol().isEmpty();
			case MlPackage.LIST_TYPE__CBYTES:
				return !getCbytes().isEmpty();
			case MlPackage.LIST_TYPE__CERROR:
				return !getCerror().isEmpty();
			case MlPackage.LIST_TYPE__CS:
				return !getCs().isEmpty();
			case MlPackage.LIST_TYPE__SHARE:
				return !getShare().isEmpty();
			case MlPackage.LIST_TYPE__PIECEWISE:
				return !getPiecewise().isEmpty();
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return !getDeprecatedContExpGroup().isEmpty();
			case MlPackage.LIST_TYPE__DEPRECATED_CONT_EXP:
				return !getDeprecatedContExp().isEmpty();
			case MlPackage.LIST_TYPE__INTERVAL_CLASS_GROUP:
				return !getIntervalClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__INTERVAL_CLASS:
				return !getIntervalClass().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return !getUnaryFunctionalClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_FUNCTIONAL_CLASS:
				return !getUnaryFunctionalClass().isEmpty();
			case MlPackage.LIST_TYPE__LAMBDA_CLASS_GROUP:
				return !getLambdaClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__LAMBDA_CLASS:
				return !getLambdaClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return !getNaryFunctionalClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_FUNCTIONAL_CLASS:
				return !getNaryFunctionalClass().isEmpty();
			case MlPackage.LIST_TYPE__QUOTIENT:
				return !getQuotient().isEmpty();
			case MlPackage.LIST_TYPE__DIVIDE:
				return !getDivide().isEmpty();
			case MlPackage.LIST_TYPE__MINUS:
				return !getMinus().isEmpty();
			case MlPackage.LIST_TYPE__POWER:
				return !getPower().isEmpty();
			case MlPackage.LIST_TYPE__REM:
				return !getRem().isEmpty();
			case MlPackage.LIST_TYPE__ROOT:
				return !getRoot().isEmpty();
			case MlPackage.LIST_TYPE__FACTORIAL:
				return !getFactorial().isEmpty();
			case MlPackage.LIST_TYPE__ABS:
				return !getAbs().isEmpty();
			case MlPackage.LIST_TYPE__CONJUGATE:
				return !getConjugate().isEmpty();
			case MlPackage.LIST_TYPE__ARG:
				return !getArg().isEmpty();
			case MlPackage.LIST_TYPE__REAL:
				return !getReal().isEmpty();
			case MlPackage.LIST_TYPE__IMAGINARY:
				return !getImaginary().isEmpty();
			case MlPackage.LIST_TYPE__FLOOR:
				return !getFloor().isEmpty();
			case MlPackage.LIST_TYPE__CEILING:
				return !getCeiling().isEmpty();
			case MlPackage.LIST_TYPE__EXP:
				return !getExp().isEmpty();
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS_GROUP:
				return !getNaryMinmaxClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_MINMAX_CLASS:
				return !getNaryMinmaxClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS_GROUP:
				return !getNaryArithClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_ARITH_CLASS:
				return !getNaryArithClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return !getNaryLogicalClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_LOGICAL_CLASS:
				return !getNaryLogicalClass().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return !getUnaryLogicalClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_LOGICAL_CLASS:
				return !getUnaryLogicalClass().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return !getBinaryLogicalClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_LOGICAL_CLASS:
				return !getBinaryLogicalClass().isEmpty();
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS_GROUP:
				return !getQuantifierClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__QUANTIFIER_CLASS:
				return !getQuantifierClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS_GROUP:
				return !getNaryRelnClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_RELN_CLASS:
				return !getNaryRelnClass().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS_GROUP:
				return !getBinaryRelnClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_RELN_CLASS:
				return !getBinaryRelnClass().isEmpty();
			case MlPackage.LIST_TYPE__INT_CLASS_GROUP:
				return !getIntClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__INT_CLASS:
				return !getIntClass().isEmpty();
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return !getDifferentialOperatorClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return !getDifferentialOperatorClass().isEmpty();
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS_GROUP:
				return !getPartialdiffClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__PARTIALDIFF_CLASS:
				return !getPartialdiffClass().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return !getUnaryVeccalcClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_VECCALC_CLASS:
				return !getUnaryVeccalcClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return !getNarySetlistConstructorClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return !getNarySetlistConstructorClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_SET_CLASS_GROUP:
				return !getNarySetClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_SET_CLASS:
				return !getNarySetClass().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS_GROUP:
				return !getBinarySetClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_SET_CLASS:
				return !getBinarySetClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return !getNarySetRelnClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_SET_RELN_CLASS:
				return !getNarySetRelnClass().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS_GROUP:
				return !getUnarySetClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_SET_CLASS:
				return !getUnarySetClass().isEmpty();
			case MlPackage.LIST_TYPE__SUM_CLASS_GROUP:
				return !getSumClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__SUM_CLASS:
				return !getSumClass().isEmpty();
			case MlPackage.LIST_TYPE__PRODUCT_CLASS_GROUP:
				return !getProductClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__PRODUCT_CLASS:
				return !getProductClass().isEmpty();
			case MlPackage.LIST_TYPE__LIMIT_CLASS_GROUP:
				return !getLimitClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__LIMIT_CLASS:
				return !getLimitClass().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return !getUnaryElementaryClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_ELEMENTARY_CLASS:
				return !getUnaryElementaryClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS_GROUP:
				return !getNaryStatsClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_STATS_CLASS:
				return !getNaryStatsClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return !getNaryConstructorClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_CONSTRUCTOR_CLASS:
				return !getNaryConstructorClass().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS_GROUP:
				return !getUnaryLinalgClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__UNARY_LINALG_CLASS:
				return !getUnaryLinalgClass().isEmpty();
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS_GROUP:
				return !getNaryLinalgClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__NARY_LINALG_CLASS:
				return !getNaryLinalgClass().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS_GROUP:
				return !getBinaryLinalgClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__BINARY_LINALG_CLASS:
				return !getBinaryLinalgClass().isEmpty();
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS_GROUP:
				return !getConstantSetClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__CONSTANT_SET_CLASS:
				return !getConstantSetClass().isEmpty();
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return !getConstantArithClassGroup().isEmpty();
			case MlPackage.LIST_TYPE__CONSTANT_ARITH_CLASS:
				return !getConstantArithClass().isEmpty();
			case MlPackage.LIST_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.LIST_TYPE__DEFINITION_URL:
				return DEFINITION_URL_EDEFAULT == null ? definitionURL != null : !DEFINITION_URL_EDEFAULT.equals(definitionURL);
			case MlPackage.LIST_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case MlPackage.LIST_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.LIST_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.LIST_TYPE__ORDER:
				return isSetOrder();
			case MlPackage.LIST_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.LIST_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.LIST_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.LIST_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (bvarQ: ");
		result.append(bvarQ);
		result.append(", group: ");
		result.append(group);
		result.append(", contExp: ");
		result.append(contExp);
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
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
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

} //ListTypeImpl
