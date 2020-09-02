/**
 */
package org.w3._1998.math.math.ml.impl;

import java.math.BigInteger;

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
import org.w3._1998.math.math.ml.DeclareType;
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
import org.w3._1998.math.math.ml.OccurrenceType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getContExp <em>Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCsymbol <em>Csymbol</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCbytes <em>Cbytes</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCerror <em>Cerror</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getPiecewise <em>Piecewise</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getDeprecatedContExpGroup <em>Deprecated Cont Exp Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getDeprecatedContExp <em>Deprecated Cont Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getIntervalClassGroup <em>Interval Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getIntervalClass <em>Interval Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryFunctionalClassGroup <em>Unary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryFunctionalClass <em>Unary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getLambdaClassGroup <em>Lambda Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getLambdaClass <em>Lambda Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryFunctionalClassGroup <em>Nary Functional Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryFunctionalClass <em>Nary Functional Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getQuotient <em>Quotient</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getMinus <em>Minus</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getRem <em>Rem</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getFactorial <em>Factorial</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getImaginary <em>Imaginary</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryMinmaxClassGroup <em>Nary Minmax Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryMinmaxClass <em>Nary Minmax Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryArithClassGroup <em>Nary Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryArithClass <em>Nary Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryLogicalClassGroup <em>Nary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryLogicalClass <em>Nary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryLogicalClassGroup <em>Unary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryLogicalClass <em>Unary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinaryLogicalClassGroup <em>Binary Logical Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinaryLogicalClass <em>Binary Logical Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getQuantifierClassGroup <em>Quantifier Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getQuantifierClass <em>Quantifier Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryRelnClassGroup <em>Nary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryRelnClass <em>Nary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinaryRelnClassGroup <em>Binary Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinaryRelnClass <em>Binary Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getIntClassGroup <em>Int Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getIntClass <em>Int Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getDifferentialOperatorClassGroup <em>Differential Operator Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getDifferentialOperatorClass <em>Differential Operator Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getPartialdiffClassGroup <em>Partialdiff Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getPartialdiffClass <em>Partialdiff Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryVeccalcClassGroup <em>Unary Veccalc Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryVeccalcClass <em>Unary Veccalc Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNarySetlistConstructorClassGroup <em>Nary Setlist Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNarySetlistConstructorClass <em>Nary Setlist Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNarySetClassGroup <em>Nary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNarySetClass <em>Nary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinarySetClassGroup <em>Binary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinarySetClass <em>Binary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNarySetRelnClassGroup <em>Nary Set Reln Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNarySetRelnClass <em>Nary Set Reln Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnarySetClassGroup <em>Unary Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnarySetClass <em>Unary Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getSumClassGroup <em>Sum Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getSumClass <em>Sum Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getProductClassGroup <em>Product Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getProductClass <em>Product Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getLimitClassGroup <em>Limit Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getLimitClass <em>Limit Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryElementaryClassGroup <em>Unary Elementary Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryElementaryClass <em>Unary Elementary Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryStatsClassGroup <em>Nary Stats Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryStatsClass <em>Nary Stats Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryConstructorClassGroup <em>Nary Constructor Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryConstructorClass <em>Nary Constructor Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryLinalgClassGroup <em>Unary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getUnaryLinalgClass <em>Unary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryLinalgClassGroup <em>Nary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNaryLinalgClass <em>Nary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinaryLinalgClassGroup <em>Binary Linalg Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getBinaryLinalgClass <em>Binary Linalg Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getConstantSetClassGroup <em>Constant Set Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getConstantSetClass <em>Constant Set Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getConstantArithClassGroup <em>Constant Arith Class Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getConstantArithClass <em>Constant Arith Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getDefinitionURL <em>Definition URL</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getNargs <em>Nargs</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.DeclareTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclareTypeImpl extends MinimalEObjectImpl.Container implements DeclareType {
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
	 * The default value of the '{@link #getNargs() <em>Nargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNargs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNargs() <em>Nargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNargs()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nargs = NARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final OccurrenceType OCCURRENCE_EDEFAULT = OccurrenceType.PREFIX;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceType occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean occurrenceESet;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getDeclareType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getContExp() {
		if (contExp == null) {
			contExp = new BasicFeatureMap(this, MlPackage.DECLARE_TYPE__CONT_EXP);
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
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Apply());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindType> getBind() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Bind());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiType> getCi() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Ci());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CnType> getCn() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Cn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsymbolType> getCsymbol() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Csymbol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CbytesType> getCbytes() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Cbytes());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CerrorType> getCerror() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Cerror());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CsType> getCs() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Cs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShareType> getShare() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Share());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PiecewiseType> getPiecewise() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Piecewise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDeprecatedContExpGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_DeprecatedContExpGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDeprecatedContExp() {
		return getDeprecatedContExpGroup().list(MlPackage.eINSTANCE.getDeclareType_DeprecatedContExp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntervalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_IntervalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntervalClassType> getIntervalClass() {
		return getIntervalClassGroup().list(MlPackage.eINSTANCE.getDeclareType_IntervalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryFunctionalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_UnaryFunctionalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryFunctionalClassType> getUnaryFunctionalClass() {
		return getUnaryFunctionalClassGroup().list(MlPackage.eINSTANCE.getDeclareType_UnaryFunctionalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLambdaClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_LambdaClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LambdaClassType> getLambdaClass() {
		return getLambdaClassGroup().list(MlPackage.eINSTANCE.getDeclareType_LambdaClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryFunctionalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryFunctionalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryFunctionalClassType> getNaryFunctionalClass() {
		return getNaryFunctionalClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryFunctionalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuotientType> getQuotient() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Quotient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DivideType> getDivide() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Divide());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MinusType> getMinus() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Minus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PowerType> getPower() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Power());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemType> getRem() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Rem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootType> getRoot() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Root());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FactorialType> getFactorial() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Factorial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbsType> getAbs() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Abs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConjugateType> getConjugate() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Conjugate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArgType> getArg() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Arg());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RealType> getReal() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Real());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImaginaryType> getImaginary() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Imaginary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FloorType> getFloor() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Floor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CeilingType> getCeiling() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Ceiling());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpType> getExp() {
		return getContExp().list(MlPackage.eINSTANCE.getDeclareType_Exp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryMinmaxClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryMinmaxClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryMinmaxClassType> getNaryMinmaxClass() {
		return getNaryMinmaxClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryMinmaxClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryArithClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryArithClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryArithClassType> getNaryArithClass() {
		return getNaryArithClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryArithClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLogicalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryLogicalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryLogicalClassType> getNaryLogicalClass() {
		return getNaryLogicalClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryLogicalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLogicalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_UnaryLogicalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryLogicalClassType> getUnaryLogicalClass() {
		return getUnaryLogicalClassGroup().list(MlPackage.eINSTANCE.getDeclareType_UnaryLogicalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLogicalClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_BinaryLogicalClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryLogicalClassType> getBinaryLogicalClass() {
		return getBinaryLogicalClassGroup().list(MlPackage.eINSTANCE.getDeclareType_BinaryLogicalClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getQuantifierClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_QuantifierClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuantifierClassType> getQuantifierClass() {
		return getQuantifierClassGroup().list(MlPackage.eINSTANCE.getDeclareType_QuantifierClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryRelnClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryRelnClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryRelnClassType> getNaryRelnClass() {
		return getNaryRelnClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryRelnClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryRelnClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_BinaryRelnClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getBinaryRelnClass() {
		return getBinaryRelnClassGroup().list(MlPackage.eINSTANCE.getDeclareType_BinaryRelnClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIntClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_IntClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntClassType> getIntClass() {
		return getIntClassGroup().list(MlPackage.eINSTANCE.getDeclareType_IntClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDifferentialOperatorClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_DifferentialOperatorClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DifferentialOperatorClassType> getDifferentialOperatorClass() {
		return getDifferentialOperatorClassGroup().list(MlPackage.eINSTANCE.getDeclareType_DifferentialOperatorClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPartialdiffClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_PartialdiffClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartialdiffClassType> getPartialdiffClass() {
		return getPartialdiffClassGroup().list(MlPackage.eINSTANCE.getDeclareType_PartialdiffClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryVeccalcClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_UnaryVeccalcClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryVeccalcClassType> getUnaryVeccalcClass() {
		return getUnaryVeccalcClassGroup().list(MlPackage.eINSTANCE.getDeclareType_UnaryVeccalcClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetlistConstructorClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NarySetlistConstructorClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getNarySetlistConstructorClass() {
		return getNarySetlistConstructorClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NarySetlistConstructorClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NarySetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NarySetClassType> getNarySetClass() {
		return getNarySetClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NarySetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinarySetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_BinarySetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinarySetClassType> getBinarySetClass() {
		return getBinarySetClassGroup().list(MlPackage.eINSTANCE.getDeclareType_BinarySetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNarySetRelnClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NarySetRelnClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NarySetRelnClassType> getNarySetRelnClass() {
		return getNarySetRelnClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NarySetRelnClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnarySetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_UnarySetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnarySetClassType> getUnarySetClass() {
		return getUnarySetClassGroup().list(MlPackage.eINSTANCE.getDeclareType_UnarySetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSumClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_SumClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SumClassType> getSumClass() {
		return getSumClassGroup().list(MlPackage.eINSTANCE.getDeclareType_SumClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getProductClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_ProductClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductClassType> getProductClass() {
		return getProductClassGroup().list(MlPackage.eINSTANCE.getDeclareType_ProductClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLimitClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_LimitClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LimitClassType> getLimitClass() {
		return getLimitClassGroup().list(MlPackage.eINSTANCE.getDeclareType_LimitClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryElementaryClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_UnaryElementaryClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryElementaryClassType> getUnaryElementaryClass() {
		return getUnaryElementaryClassGroup().list(MlPackage.eINSTANCE.getDeclareType_UnaryElementaryClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryStatsClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryStatsClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryStatsClassType> getNaryStatsClass() {
		return getNaryStatsClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryStatsClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryConstructorClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryConstructorClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryConstructorClassType> getNaryConstructorClass() {
		return getNaryConstructorClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryConstructorClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUnaryLinalgClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_UnaryLinalgClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnaryLinalgClassType> getUnaryLinalgClass() {
		return getUnaryLinalgClassGroup().list(MlPackage.eINSTANCE.getDeclareType_UnaryLinalgClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNaryLinalgClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_NaryLinalgClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NaryLinalgClassType> getNaryLinalgClass() {
		return getNaryLinalgClassGroup().list(MlPackage.eINSTANCE.getDeclareType_NaryLinalgClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBinaryLinalgClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_BinaryLinalgClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BinaryLinalgClassType> getBinaryLinalgClass() {
		return getBinaryLinalgClassGroup().list(MlPackage.eINSTANCE.getDeclareType_BinaryLinalgClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantSetClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_ConstantSetClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantSetClassType> getConstantSetClass() {
		return getConstantSetClassGroup().list(MlPackage.eINSTANCE.getDeclareType_ConstantSetClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConstantArithClassGroup() {
		return (FeatureMap)getContExp().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getDeclareType_ConstantArithClassGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstantArithClassType> getConstantArithClass() {
		return getConstantArithClassGroup().list(MlPackage.eINSTANCE.getDeclareType_ConstantArithClass());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.DECLARE_TYPE__DEFINITION_URL, oldDefinitionURL, definitionURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.DECLARE_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNargs() {
		return nargs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNargs(BigInteger newNargs) {
		BigInteger oldNargs = nargs;
		nargs = newNargs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.DECLARE_TYPE__NARGS, oldNargs, nargs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceType getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrence(OccurrenceType newOccurrence) {
		OccurrenceType oldOccurrence = occurrence;
		occurrence = newOccurrence == null ? OCCURRENCE_EDEFAULT : newOccurrence;
		boolean oldOccurrenceESet = occurrenceESet;
		occurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.DECLARE_TYPE__OCCURRENCE, oldOccurrence, occurrence, !oldOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOccurrence() {
		OccurrenceType oldOccurrence = occurrence;
		boolean oldOccurrenceESet = occurrenceESet;
		occurrence = OCCURRENCE_EDEFAULT;
		occurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.DECLARE_TYPE__OCCURRENCE, oldOccurrence, OCCURRENCE_EDEFAULT, oldOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOccurrence() {
		return occurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.DECLARE_TYPE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.DECLARE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlPackage.DECLARE_TYPE__CONT_EXP:
				return ((InternalEList<?>)getContExp()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__APPLY:
				return ((InternalEList<?>)getApply()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BIND:
				return ((InternalEList<?>)getBind()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CI:
				return ((InternalEList<?>)getCi()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CN:
				return ((InternalEList<?>)getCn()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CSYMBOL:
				return ((InternalEList<?>)getCsymbol()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CBYTES:
				return ((InternalEList<?>)getCbytes()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CERROR:
				return ((InternalEList<?>)getCerror()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CS:
				return ((InternalEList<?>)getCs()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__SHARE:
				return ((InternalEList<?>)getShare()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__PIECEWISE:
				return ((InternalEList<?>)getPiecewise()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return ((InternalEList<?>)getDeprecatedContExpGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP:
				return ((InternalEList<?>)getDeprecatedContExp()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS_GROUP:
				return ((InternalEList<?>)getIntervalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS:
				return ((InternalEList<?>)getIntervalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS:
				return ((InternalEList<?>)getUnaryFunctionalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS_GROUP:
				return ((InternalEList<?>)getLambdaClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS:
				return ((InternalEList<?>)getLambdaClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryFunctionalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS:
				return ((InternalEList<?>)getNaryFunctionalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__QUOTIENT:
				return ((InternalEList<?>)getQuotient()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__DIVIDE:
				return ((InternalEList<?>)getDivide()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__MINUS:
				return ((InternalEList<?>)getMinus()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__POWER:
				return ((InternalEList<?>)getPower()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__REM:
				return ((InternalEList<?>)getRem()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__ROOT:
				return ((InternalEList<?>)getRoot()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__FACTORIAL:
				return ((InternalEList<?>)getFactorial()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__ABS:
				return ((InternalEList<?>)getAbs()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CONJUGATE:
				return ((InternalEList<?>)getConjugate()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__ARG:
				return ((InternalEList<?>)getArg()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__REAL:
				return ((InternalEList<?>)getReal()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__IMAGINARY:
				return ((InternalEList<?>)getImaginary()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__FLOOR:
				return ((InternalEList<?>)getFloor()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CEILING:
				return ((InternalEList<?>)getCeiling()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__EXP:
				return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS_GROUP:
				return ((InternalEList<?>)getNaryMinmaxClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS:
				return ((InternalEList<?>)getNaryMinmaxClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getNaryArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS:
				return ((InternalEList<?>)getNaryArithClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS:
				return ((InternalEList<?>)getNaryLogicalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS:
				return ((InternalEList<?>)getUnaryLogicalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLogicalClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS:
				return ((InternalEList<?>)getBinaryLogicalClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS_GROUP:
				return ((InternalEList<?>)getQuantifierClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS:
				return ((InternalEList<?>)getQuantifierClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS:
				return ((InternalEList<?>)getNaryRelnClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS:
				return ((InternalEList<?>)getBinaryRelnClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__INT_CLASS_GROUP:
				return ((InternalEList<?>)getIntClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__INT_CLASS:
				return ((InternalEList<?>)getIntClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return ((InternalEList<?>)getDifferentialOperatorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return ((InternalEList<?>)getDifferentialOperatorClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS_GROUP:
				return ((InternalEList<?>)getPartialdiffClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS:
				return ((InternalEList<?>)getPartialdiffClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryVeccalcClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS:
				return ((InternalEList<?>)getUnaryVeccalcClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetlistConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return ((InternalEList<?>)getNarySetlistConstructorClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS:
				return ((InternalEList<?>)getNarySetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getBinarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS:
				return ((InternalEList<?>)getBinarySetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return ((InternalEList<?>)getNarySetRelnClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS:
				return ((InternalEList<?>)getNarySetRelnClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS_GROUP:
				return ((InternalEList<?>)getUnarySetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS:
				return ((InternalEList<?>)getUnarySetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__SUM_CLASS_GROUP:
				return ((InternalEList<?>)getSumClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__SUM_CLASS:
				return ((InternalEList<?>)getSumClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS_GROUP:
				return ((InternalEList<?>)getProductClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS:
				return ((InternalEList<?>)getProductClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS_GROUP:
				return ((InternalEList<?>)getLimitClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS:
				return ((InternalEList<?>)getLimitClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryElementaryClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS:
				return ((InternalEList<?>)getUnaryElementaryClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS_GROUP:
				return ((InternalEList<?>)getNaryStatsClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS:
				return ((InternalEList<?>)getNaryStatsClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return ((InternalEList<?>)getNaryConstructorClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS:
				return ((InternalEList<?>)getNaryConstructorClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getUnaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS:
				return ((InternalEList<?>)getUnaryLinalgClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getNaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS:
				return ((InternalEList<?>)getNaryLinalgClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS_GROUP:
				return ((InternalEList<?>)getBinaryLinalgClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS:
				return ((InternalEList<?>)getBinaryLinalgClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS_GROUP:
				return ((InternalEList<?>)getConstantSetClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS:
				return ((InternalEList<?>)getConstantSetClass()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return ((InternalEList<?>)getConstantArithClassGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS:
				return ((InternalEList<?>)getConstantArithClass()).basicRemove(otherEnd, msgs);
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
			case MlPackage.DECLARE_TYPE__CONT_EXP:
				if (coreType) return getContExp();
				return ((FeatureMap.Internal)getContExp()).getWrapper();
			case MlPackage.DECLARE_TYPE__APPLY:
				return getApply();
			case MlPackage.DECLARE_TYPE__BIND:
				return getBind();
			case MlPackage.DECLARE_TYPE__CI:
				return getCi();
			case MlPackage.DECLARE_TYPE__CN:
				return getCn();
			case MlPackage.DECLARE_TYPE__CSYMBOL:
				return getCsymbol();
			case MlPackage.DECLARE_TYPE__CBYTES:
				return getCbytes();
			case MlPackage.DECLARE_TYPE__CERROR:
				return getCerror();
			case MlPackage.DECLARE_TYPE__CS:
				return getCs();
			case MlPackage.DECLARE_TYPE__SHARE:
				return getShare();
			case MlPackage.DECLARE_TYPE__PIECEWISE:
				return getPiecewise();
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				if (coreType) return getDeprecatedContExpGroup();
				return ((FeatureMap.Internal)getDeprecatedContExpGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP:
				return getDeprecatedContExp();
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS_GROUP:
				if (coreType) return getIntervalClassGroup();
				return ((FeatureMap.Internal)getIntervalClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS:
				return getIntervalClass();
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getUnaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getUnaryFunctionalClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS:
				return getUnaryFunctionalClass();
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS_GROUP:
				if (coreType) return getLambdaClassGroup();
				return ((FeatureMap.Internal)getLambdaClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS:
				return getLambdaClass();
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				if (coreType) return getNaryFunctionalClassGroup();
				return ((FeatureMap.Internal)getNaryFunctionalClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS:
				return getNaryFunctionalClass();
			case MlPackage.DECLARE_TYPE__QUOTIENT:
				return getQuotient();
			case MlPackage.DECLARE_TYPE__DIVIDE:
				return getDivide();
			case MlPackage.DECLARE_TYPE__MINUS:
				return getMinus();
			case MlPackage.DECLARE_TYPE__POWER:
				return getPower();
			case MlPackage.DECLARE_TYPE__REM:
				return getRem();
			case MlPackage.DECLARE_TYPE__ROOT:
				return getRoot();
			case MlPackage.DECLARE_TYPE__FACTORIAL:
				return getFactorial();
			case MlPackage.DECLARE_TYPE__ABS:
				return getAbs();
			case MlPackage.DECLARE_TYPE__CONJUGATE:
				return getConjugate();
			case MlPackage.DECLARE_TYPE__ARG:
				return getArg();
			case MlPackage.DECLARE_TYPE__REAL:
				return getReal();
			case MlPackage.DECLARE_TYPE__IMAGINARY:
				return getImaginary();
			case MlPackage.DECLARE_TYPE__FLOOR:
				return getFloor();
			case MlPackage.DECLARE_TYPE__CEILING:
				return getCeiling();
			case MlPackage.DECLARE_TYPE__EXP:
				return getExp();
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS_GROUP:
				if (coreType) return getNaryMinmaxClassGroup();
				return ((FeatureMap.Internal)getNaryMinmaxClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS:
				return getNaryMinmaxClass();
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS_GROUP:
				if (coreType) return getNaryArithClassGroup();
				return ((FeatureMap.Internal)getNaryArithClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS:
				return getNaryArithClass();
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getNaryLogicalClassGroup();
				return ((FeatureMap.Internal)getNaryLogicalClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS:
				return getNaryLogicalClass();
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getUnaryLogicalClassGroup();
				return ((FeatureMap.Internal)getUnaryLogicalClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS:
				return getUnaryLogicalClass();
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				if (coreType) return getBinaryLogicalClassGroup();
				return ((FeatureMap.Internal)getBinaryLogicalClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS:
				return getBinaryLogicalClass();
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS_GROUP:
				if (coreType) return getQuantifierClassGroup();
				return ((FeatureMap.Internal)getQuantifierClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS:
				return getQuantifierClass();
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS_GROUP:
				if (coreType) return getNaryRelnClassGroup();
				return ((FeatureMap.Internal)getNaryRelnClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS:
				return getNaryRelnClass();
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS_GROUP:
				if (coreType) return getBinaryRelnClassGroup();
				return ((FeatureMap.Internal)getBinaryRelnClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS:
				return getBinaryRelnClass();
			case MlPackage.DECLARE_TYPE__INT_CLASS_GROUP:
				if (coreType) return getIntClassGroup();
				return ((FeatureMap.Internal)getIntClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__INT_CLASS:
				return getIntClass();
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				if (coreType) return getDifferentialOperatorClassGroup();
				return ((FeatureMap.Internal)getDifferentialOperatorClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return getDifferentialOperatorClass();
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS_GROUP:
				if (coreType) return getPartialdiffClassGroup();
				return ((FeatureMap.Internal)getPartialdiffClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS:
				return getPartialdiffClass();
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				if (coreType) return getUnaryVeccalcClassGroup();
				return ((FeatureMap.Internal)getUnaryVeccalcClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS:
				return getUnaryVeccalcClass();
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNarySetlistConstructorClassGroup();
				return ((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return getNarySetlistConstructorClass();
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS_GROUP:
				if (coreType) return getNarySetClassGroup();
				return ((FeatureMap.Internal)getNarySetClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS:
				return getNarySetClass();
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS_GROUP:
				if (coreType) return getBinarySetClassGroup();
				return ((FeatureMap.Internal)getBinarySetClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS:
				return getBinarySetClass();
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				if (coreType) return getNarySetRelnClassGroup();
				return ((FeatureMap.Internal)getNarySetRelnClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS:
				return getNarySetRelnClass();
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS_GROUP:
				if (coreType) return getUnarySetClassGroup();
				return ((FeatureMap.Internal)getUnarySetClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS:
				return getUnarySetClass();
			case MlPackage.DECLARE_TYPE__SUM_CLASS_GROUP:
				if (coreType) return getSumClassGroup();
				return ((FeatureMap.Internal)getSumClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__SUM_CLASS:
				return getSumClass();
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS_GROUP:
				if (coreType) return getProductClassGroup();
				return ((FeatureMap.Internal)getProductClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS:
				return getProductClass();
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS_GROUP:
				if (coreType) return getLimitClassGroup();
				return ((FeatureMap.Internal)getLimitClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS:
				return getLimitClass();
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				if (coreType) return getUnaryElementaryClassGroup();
				return ((FeatureMap.Internal)getUnaryElementaryClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS:
				return getUnaryElementaryClass();
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS_GROUP:
				if (coreType) return getNaryStatsClassGroup();
				return ((FeatureMap.Internal)getNaryStatsClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS:
				return getNaryStatsClass();
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				if (coreType) return getNaryConstructorClassGroup();
				return ((FeatureMap.Internal)getNaryConstructorClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS:
				return getNaryConstructorClass();
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS_GROUP:
				if (coreType) return getUnaryLinalgClassGroup();
				return ((FeatureMap.Internal)getUnaryLinalgClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS:
				return getUnaryLinalgClass();
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS_GROUP:
				if (coreType) return getNaryLinalgClassGroup();
				return ((FeatureMap.Internal)getNaryLinalgClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS:
				return getNaryLinalgClass();
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS_GROUP:
				if (coreType) return getBinaryLinalgClassGroup();
				return ((FeatureMap.Internal)getBinaryLinalgClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS:
				return getBinaryLinalgClass();
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS_GROUP:
				if (coreType) return getConstantSetClassGroup();
				return ((FeatureMap.Internal)getConstantSetClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS:
				return getConstantSetClass();
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				if (coreType) return getConstantArithClassGroup();
				return ((FeatureMap.Internal)getConstantArithClassGroup()).getWrapper();
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS:
				return getConstantArithClass();
			case MlPackage.DECLARE_TYPE__DEFINITION_URL:
				return getDefinitionURL();
			case MlPackage.DECLARE_TYPE__ENCODING:
				return getEncoding();
			case MlPackage.DECLARE_TYPE__NARGS:
				return getNargs();
			case MlPackage.DECLARE_TYPE__OCCURRENCE:
				return getOccurrence();
			case MlPackage.DECLARE_TYPE__SCOPE:
				return getScope();
			case MlPackage.DECLARE_TYPE__TYPE:
				return getType();
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
			case MlPackage.DECLARE_TYPE__CONT_EXP:
				((FeatureMap.Internal)getContExp()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__APPLY:
				getApply().clear();
				getApply().addAll((Collection<? extends ApplyType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__BIND:
				getBind().clear();
				getBind().addAll((Collection<? extends BindType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CI:
				getCi().clear();
				getCi().addAll((Collection<? extends CiType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CN:
				getCn().clear();
				getCn().addAll((Collection<? extends CnType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CSYMBOL:
				getCsymbol().clear();
				getCsymbol().addAll((Collection<? extends CsymbolType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CBYTES:
				getCbytes().clear();
				getCbytes().addAll((Collection<? extends CbytesType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CERROR:
				getCerror().clear();
				getCerror().addAll((Collection<? extends CerrorType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CS:
				getCs().clear();
				getCs().addAll((Collection<? extends CsType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__SHARE:
				getShare().clear();
				getShare().addAll((Collection<? extends ShareType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__PIECEWISE:
				getPiecewise().clear();
				getPiecewise().addAll((Collection<? extends PiecewiseType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				((FeatureMap.Internal)getDeprecatedContExpGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS_GROUP:
				((FeatureMap.Internal)getIntervalClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS_GROUP:
				((FeatureMap.Internal)getLambdaClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryFunctionalClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__QUOTIENT:
				getQuotient().clear();
				getQuotient().addAll((Collection<? extends QuotientType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__DIVIDE:
				getDivide().clear();
				getDivide().addAll((Collection<? extends DivideType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__MINUS:
				getMinus().clear();
				getMinus().addAll((Collection<? extends MinusType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__POWER:
				getPower().clear();
				getPower().addAll((Collection<? extends PowerType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__REM:
				getRem().clear();
				getRem().addAll((Collection<? extends RemType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__ROOT:
				getRoot().clear();
				getRoot().addAll((Collection<? extends RootType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__FACTORIAL:
				getFactorial().clear();
				getFactorial().addAll((Collection<? extends FactorialType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__ABS:
				getAbs().clear();
				getAbs().addAll((Collection<? extends AbsType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CONJUGATE:
				getConjugate().clear();
				getConjugate().addAll((Collection<? extends ConjugateType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__ARG:
				getArg().clear();
				getArg().addAll((Collection<? extends ArgType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__REAL:
				getReal().clear();
				getReal().addAll((Collection<? extends RealType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__IMAGINARY:
				getImaginary().clear();
				getImaginary().addAll((Collection<? extends ImaginaryType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__FLOOR:
				getFloor().clear();
				getFloor().addAll((Collection<? extends FloorType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__CEILING:
				getCeiling().clear();
				getCeiling().addAll((Collection<? extends CeilingType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__EXP:
				getExp().clear();
				getExp().addAll((Collection<? extends ExpType>)newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS_GROUP:
				((FeatureMap.Internal)getNaryMinmaxClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getNaryArithClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLogicalClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS_GROUP:
				((FeatureMap.Internal)getQuantifierClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryRelnClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__INT_CLASS_GROUP:
				((FeatureMap.Internal)getIntClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				((FeatureMap.Internal)getDifferentialOperatorClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS_GROUP:
				((FeatureMap.Internal)getPartialdiffClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryVeccalcClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetlistConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getBinarySetClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				((FeatureMap.Internal)getNarySetRelnClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS_GROUP:
				((FeatureMap.Internal)getUnarySetClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__SUM_CLASS_GROUP:
				((FeatureMap.Internal)getSumClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS_GROUP:
				((FeatureMap.Internal)getProductClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS_GROUP:
				((FeatureMap.Internal)getLimitClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryElementaryClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS_GROUP:
				((FeatureMap.Internal)getNaryStatsClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				((FeatureMap.Internal)getNaryConstructorClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getUnaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getNaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS_GROUP:
				((FeatureMap.Internal)getBinaryLinalgClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS_GROUP:
				((FeatureMap.Internal)getConstantSetClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				((FeatureMap.Internal)getConstantArithClassGroup()).set(newValue);
				return;
			case MlPackage.DECLARE_TYPE__DEFINITION_URL:
				setDefinitionURL((String)newValue);
				return;
			case MlPackage.DECLARE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case MlPackage.DECLARE_TYPE__NARGS:
				setNargs((BigInteger)newValue);
				return;
			case MlPackage.DECLARE_TYPE__OCCURRENCE:
				setOccurrence((OccurrenceType)newValue);
				return;
			case MlPackage.DECLARE_TYPE__SCOPE:
				setScope((String)newValue);
				return;
			case MlPackage.DECLARE_TYPE__TYPE:
				setType((String)newValue);
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
			case MlPackage.DECLARE_TYPE__CONT_EXP:
				getContExp().clear();
				return;
			case MlPackage.DECLARE_TYPE__APPLY:
				getApply().clear();
				return;
			case MlPackage.DECLARE_TYPE__BIND:
				getBind().clear();
				return;
			case MlPackage.DECLARE_TYPE__CI:
				getCi().clear();
				return;
			case MlPackage.DECLARE_TYPE__CN:
				getCn().clear();
				return;
			case MlPackage.DECLARE_TYPE__CSYMBOL:
				getCsymbol().clear();
				return;
			case MlPackage.DECLARE_TYPE__CBYTES:
				getCbytes().clear();
				return;
			case MlPackage.DECLARE_TYPE__CERROR:
				getCerror().clear();
				return;
			case MlPackage.DECLARE_TYPE__CS:
				getCs().clear();
				return;
			case MlPackage.DECLARE_TYPE__SHARE:
				getShare().clear();
				return;
			case MlPackage.DECLARE_TYPE__PIECEWISE:
				getPiecewise().clear();
				return;
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				getDeprecatedContExpGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS_GROUP:
				getIntervalClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				getUnaryFunctionalClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS_GROUP:
				getLambdaClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				getNaryFunctionalClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__QUOTIENT:
				getQuotient().clear();
				return;
			case MlPackage.DECLARE_TYPE__DIVIDE:
				getDivide().clear();
				return;
			case MlPackage.DECLARE_TYPE__MINUS:
				getMinus().clear();
				return;
			case MlPackage.DECLARE_TYPE__POWER:
				getPower().clear();
				return;
			case MlPackage.DECLARE_TYPE__REM:
				getRem().clear();
				return;
			case MlPackage.DECLARE_TYPE__ROOT:
				getRoot().clear();
				return;
			case MlPackage.DECLARE_TYPE__FACTORIAL:
				getFactorial().clear();
				return;
			case MlPackage.DECLARE_TYPE__ABS:
				getAbs().clear();
				return;
			case MlPackage.DECLARE_TYPE__CONJUGATE:
				getConjugate().clear();
				return;
			case MlPackage.DECLARE_TYPE__ARG:
				getArg().clear();
				return;
			case MlPackage.DECLARE_TYPE__REAL:
				getReal().clear();
				return;
			case MlPackage.DECLARE_TYPE__IMAGINARY:
				getImaginary().clear();
				return;
			case MlPackage.DECLARE_TYPE__FLOOR:
				getFloor().clear();
				return;
			case MlPackage.DECLARE_TYPE__CEILING:
				getCeiling().clear();
				return;
			case MlPackage.DECLARE_TYPE__EXP:
				getExp().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS_GROUP:
				getNaryMinmaxClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS_GROUP:
				getNaryArithClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				getNaryLogicalClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				getUnaryLogicalClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				getBinaryLogicalClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS_GROUP:
				getQuantifierClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS_GROUP:
				getNaryRelnClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS_GROUP:
				getBinaryRelnClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__INT_CLASS_GROUP:
				getIntClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				getDifferentialOperatorClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS_GROUP:
				getPartialdiffClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				getUnaryVeccalcClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				getNarySetlistConstructorClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS_GROUP:
				getNarySetClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS_GROUP:
				getBinarySetClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				getNarySetRelnClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS_GROUP:
				getUnarySetClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__SUM_CLASS_GROUP:
				getSumClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS_GROUP:
				getProductClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS_GROUP:
				getLimitClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				getUnaryElementaryClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS_GROUP:
				getNaryStatsClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				getNaryConstructorClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS_GROUP:
				getUnaryLinalgClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS_GROUP:
				getNaryLinalgClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS_GROUP:
				getBinaryLinalgClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS_GROUP:
				getConstantSetClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				getConstantArithClassGroup().clear();
				return;
			case MlPackage.DECLARE_TYPE__DEFINITION_URL:
				setDefinitionURL(DEFINITION_URL_EDEFAULT);
				return;
			case MlPackage.DECLARE_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case MlPackage.DECLARE_TYPE__NARGS:
				setNargs(NARGS_EDEFAULT);
				return;
			case MlPackage.DECLARE_TYPE__OCCURRENCE:
				unsetOccurrence();
				return;
			case MlPackage.DECLARE_TYPE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case MlPackage.DECLARE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MlPackage.DECLARE_TYPE__CONT_EXP:
				return contExp != null && !contExp.isEmpty();
			case MlPackage.DECLARE_TYPE__APPLY:
				return !getApply().isEmpty();
			case MlPackage.DECLARE_TYPE__BIND:
				return !getBind().isEmpty();
			case MlPackage.DECLARE_TYPE__CI:
				return !getCi().isEmpty();
			case MlPackage.DECLARE_TYPE__CN:
				return !getCn().isEmpty();
			case MlPackage.DECLARE_TYPE__CSYMBOL:
				return !getCsymbol().isEmpty();
			case MlPackage.DECLARE_TYPE__CBYTES:
				return !getCbytes().isEmpty();
			case MlPackage.DECLARE_TYPE__CERROR:
				return !getCerror().isEmpty();
			case MlPackage.DECLARE_TYPE__CS:
				return !getCs().isEmpty();
			case MlPackage.DECLARE_TYPE__SHARE:
				return !getShare().isEmpty();
			case MlPackage.DECLARE_TYPE__PIECEWISE:
				return !getPiecewise().isEmpty();
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP_GROUP:
				return !getDeprecatedContExpGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__DEPRECATED_CONT_EXP:
				return !getDeprecatedContExp().isEmpty();
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS_GROUP:
				return !getIntervalClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__INTERVAL_CLASS:
				return !getIntervalClass().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS_GROUP:
				return !getUnaryFunctionalClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_FUNCTIONAL_CLASS:
				return !getUnaryFunctionalClass().isEmpty();
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS_GROUP:
				return !getLambdaClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__LAMBDA_CLASS:
				return !getLambdaClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS_GROUP:
				return !getNaryFunctionalClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_FUNCTIONAL_CLASS:
				return !getNaryFunctionalClass().isEmpty();
			case MlPackage.DECLARE_TYPE__QUOTIENT:
				return !getQuotient().isEmpty();
			case MlPackage.DECLARE_TYPE__DIVIDE:
				return !getDivide().isEmpty();
			case MlPackage.DECLARE_TYPE__MINUS:
				return !getMinus().isEmpty();
			case MlPackage.DECLARE_TYPE__POWER:
				return !getPower().isEmpty();
			case MlPackage.DECLARE_TYPE__REM:
				return !getRem().isEmpty();
			case MlPackage.DECLARE_TYPE__ROOT:
				return !getRoot().isEmpty();
			case MlPackage.DECLARE_TYPE__FACTORIAL:
				return !getFactorial().isEmpty();
			case MlPackage.DECLARE_TYPE__ABS:
				return !getAbs().isEmpty();
			case MlPackage.DECLARE_TYPE__CONJUGATE:
				return !getConjugate().isEmpty();
			case MlPackage.DECLARE_TYPE__ARG:
				return !getArg().isEmpty();
			case MlPackage.DECLARE_TYPE__REAL:
				return !getReal().isEmpty();
			case MlPackage.DECLARE_TYPE__IMAGINARY:
				return !getImaginary().isEmpty();
			case MlPackage.DECLARE_TYPE__FLOOR:
				return !getFloor().isEmpty();
			case MlPackage.DECLARE_TYPE__CEILING:
				return !getCeiling().isEmpty();
			case MlPackage.DECLARE_TYPE__EXP:
				return !getExp().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS_GROUP:
				return !getNaryMinmaxClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_MINMAX_CLASS:
				return !getNaryMinmaxClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS_GROUP:
				return !getNaryArithClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_ARITH_CLASS:
				return !getNaryArithClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS_GROUP:
				return !getNaryLogicalClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_LOGICAL_CLASS:
				return !getNaryLogicalClass().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS_GROUP:
				return !getUnaryLogicalClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_LOGICAL_CLASS:
				return !getUnaryLogicalClass().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS_GROUP:
				return !getBinaryLogicalClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_LOGICAL_CLASS:
				return !getBinaryLogicalClass().isEmpty();
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS_GROUP:
				return !getQuantifierClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__QUANTIFIER_CLASS:
				return !getQuantifierClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS_GROUP:
				return !getNaryRelnClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_RELN_CLASS:
				return !getNaryRelnClass().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS_GROUP:
				return !getBinaryRelnClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_RELN_CLASS:
				return !getBinaryRelnClass().isEmpty();
			case MlPackage.DECLARE_TYPE__INT_CLASS_GROUP:
				return !getIntClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__INT_CLASS:
				return !getIntClass().isEmpty();
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS_GROUP:
				return !getDifferentialOperatorClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__DIFFERENTIAL_OPERATOR_CLASS:
				return !getDifferentialOperatorClass().isEmpty();
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS_GROUP:
				return !getPartialdiffClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__PARTIALDIFF_CLASS:
				return !getPartialdiffClass().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS_GROUP:
				return !getUnaryVeccalcClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_VECCALC_CLASS:
				return !getUnaryVeccalcClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS_GROUP:
				return !getNarySetlistConstructorClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_SETLIST_CONSTRUCTOR_CLASS:
				return !getNarySetlistConstructorClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS_GROUP:
				return !getNarySetClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_SET_CLASS:
				return !getNarySetClass().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS_GROUP:
				return !getBinarySetClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_SET_CLASS:
				return !getBinarySetClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS_GROUP:
				return !getNarySetRelnClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_SET_RELN_CLASS:
				return !getNarySetRelnClass().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS_GROUP:
				return !getUnarySetClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_SET_CLASS:
				return !getUnarySetClass().isEmpty();
			case MlPackage.DECLARE_TYPE__SUM_CLASS_GROUP:
				return !getSumClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__SUM_CLASS:
				return !getSumClass().isEmpty();
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS_GROUP:
				return !getProductClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__PRODUCT_CLASS:
				return !getProductClass().isEmpty();
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS_GROUP:
				return !getLimitClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__LIMIT_CLASS:
				return !getLimitClass().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS_GROUP:
				return !getUnaryElementaryClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_ELEMENTARY_CLASS:
				return !getUnaryElementaryClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS_GROUP:
				return !getNaryStatsClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_STATS_CLASS:
				return !getNaryStatsClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS_GROUP:
				return !getNaryConstructorClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_CONSTRUCTOR_CLASS:
				return !getNaryConstructorClass().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS_GROUP:
				return !getUnaryLinalgClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__UNARY_LINALG_CLASS:
				return !getUnaryLinalgClass().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS_GROUP:
				return !getNaryLinalgClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__NARY_LINALG_CLASS:
				return !getNaryLinalgClass().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS_GROUP:
				return !getBinaryLinalgClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__BINARY_LINALG_CLASS:
				return !getBinaryLinalgClass().isEmpty();
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS_GROUP:
				return !getConstantSetClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__CONSTANT_SET_CLASS:
				return !getConstantSetClass().isEmpty();
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS_GROUP:
				return !getConstantArithClassGroup().isEmpty();
			case MlPackage.DECLARE_TYPE__CONSTANT_ARITH_CLASS:
				return !getConstantArithClass().isEmpty();
			case MlPackage.DECLARE_TYPE__DEFINITION_URL:
				return DEFINITION_URL_EDEFAULT == null ? definitionURL != null : !DEFINITION_URL_EDEFAULT.equals(definitionURL);
			case MlPackage.DECLARE_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case MlPackage.DECLARE_TYPE__NARGS:
				return NARGS_EDEFAULT == null ? nargs != null : !NARGS_EDEFAULT.equals(nargs);
			case MlPackage.DECLARE_TYPE__OCCURRENCE:
				return isSetOccurrence();
			case MlPackage.DECLARE_TYPE__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case MlPackage.DECLARE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (contExp: ");
		result.append(contExp);
		result.append(", definitionURL: ");
		result.append(definitionURL);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", nargs: ");
		result.append(nargs);
		result.append(", occurrence: ");
		if (occurrenceESet) result.append(occurrence); else result.append("<unset>");
		result.append(", scope: ");
		result.append(scope);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DeclareTypeImpl
