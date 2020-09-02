/**
 */
package org.w3._1998.math.math.ml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._1998.math.math.ml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage
 * @generated
 */
public class MlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MlSwitch<Adapter> modelSwitch =
		new MlSwitch<Adapter>() {
			@Override
			public Adapter caseAbsType(AbsType object) {
				return createAbsTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationXmlModel(AnnotationXmlModel object) {
				return createAnnotationXmlModelAdapter();
			}
			@Override
			public Adapter caseAnnotationXmlType(AnnotationXmlType object) {
				return createAnnotationXmlTypeAdapter();
			}
			@Override
			public Adapter caseApplyContent(ApplyContent object) {
				return createApplyContentAdapter();
			}
			@Override
			public Adapter caseApplyType(ApplyType object) {
				return createApplyTypeAdapter();
			}
			@Override
			public Adapter caseApproxType(ApproxType object) {
				return createApproxTypeAdapter();
			}
			@Override
			public Adapter caseArgType(ArgType object) {
				return createArgTypeAdapter();
			}
			@Override
			public Adapter caseBinaryLinalgClassType(BinaryLinalgClassType object) {
				return createBinaryLinalgClassTypeAdapter();
			}
			@Override
			public Adapter caseBinaryLogicalClassType(BinaryLogicalClassType object) {
				return createBinaryLogicalClassTypeAdapter();
			}
			@Override
			public Adapter caseBinarySetClassType(BinarySetClassType object) {
				return createBinarySetClassTypeAdapter();
			}
			@Override
			public Adapter caseBindContent(BindContent object) {
				return createBindContentAdapter();
			}
			@Override
			public Adapter caseBindType(BindType object) {
				return createBindTypeAdapter();
			}
			@Override
			public Adapter caseBvarType(BvarType object) {
				return createBvarTypeAdapter();
			}
			@Override
			public Adapter caseCbytesType(CbytesType object) {
				return createCbytesTypeAdapter();
			}
			@Override
			public Adapter caseCeilingType(CeilingType object) {
				return createCeilingTypeAdapter();
			}
			@Override
			public Adapter caseCerrorType(CerrorType object) {
				return createCerrorTypeAdapter();
			}
			@Override
			public Adapter caseCiContent(CiContent object) {
				return createCiContentAdapter();
			}
			@Override
			public Adapter caseCiType(CiType object) {
				return createCiTypeAdapter();
			}
			@Override
			public Adapter caseCnContent(CnContent object) {
				return createCnContentAdapter();
			}
			@Override
			public Adapter caseCnType(CnType object) {
				return createCnTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseConjugateType(ConjugateType object) {
				return createConjugateTypeAdapter();
			}
			@Override
			public Adapter caseConstantArithClassType(ConstantArithClassType object) {
				return createConstantArithClassTypeAdapter();
			}
			@Override
			public Adapter caseConstantSetClassType(ConstantSetClassType object) {
				return createConstantSetClassTypeAdapter();
			}
			@Override
			public Adapter caseCsType(CsType object) {
				return createCsTypeAdapter();
			}
			@Override
			public Adapter caseCsymbolContent(CsymbolContent object) {
				return createCsymbolContentAdapter();
			}
			@Override
			public Adapter caseCsymbolType(CsymbolType object) {
				return createCsymbolTypeAdapter();
			}
			@Override
			public Adapter caseDeclareType(DeclareType object) {
				return createDeclareTypeAdapter();
			}
			@Override
			public Adapter caseDegreeType(DegreeType object) {
				return createDegreeTypeAdapter();
			}
			@Override
			public Adapter caseDifferentialOperatorClassType(DifferentialOperatorClassType object) {
				return createDifferentialOperatorClassTypeAdapter();
			}
			@Override
			public Adapter caseDivideType(DivideType object) {
				return createDivideTypeAdapter();
			}
			@Override
			public Adapter caseDomainofapplicationType(DomainofapplicationType object) {
				return createDomainofapplicationTypeAdapter();
			}
			@Override
			public Adapter caseExpType(ExpType object) {
				return createExpTypeAdapter();
			}
			@Override
			public Adapter caseFactorialType(FactorialType object) {
				return createFactorialTypeAdapter();
			}
			@Override
			public Adapter caseFactorofType(FactorofType object) {
				return createFactorofTypeAdapter();
			}
			@Override
			public Adapter caseFloorType(FloorType object) {
				return createFloorTypeAdapter();
			}
			@Override
			public Adapter caseFnType(FnType object) {
				return createFnTypeAdapter();
			}
			@Override
			public Adapter caseImaginaryType(ImaginaryType object) {
				return createImaginaryTypeAdapter();
			}
			@Override
			public Adapter caseImpliedMrow(ImpliedMrow object) {
				return createImpliedMrowAdapter();
			}
			@Override
			public Adapter caseIntClassType(IntClassType object) {
				return createIntClassTypeAdapter();
			}
			@Override
			public Adapter caseIntervalClassType(IntervalClassType object) {
				return createIntervalClassTypeAdapter();
			}
			@Override
			public Adapter caseLambdaClassType(LambdaClassType object) {
				return createLambdaClassTypeAdapter();
			}
			@Override
			public Adapter caseLimitClassType(LimitClassType object) {
				return createLimitClassTypeAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseLogbaseType(LogbaseType object) {
				return createLogbaseTypeAdapter();
			}
			@Override
			public Adapter caseLowlimitType(LowlimitType object) {
				return createLowlimitTypeAdapter();
			}
			@Override
			public Adapter caseMactionType(MactionType object) {
				return createMactionTypeAdapter();
			}
			@Override
			public Adapter caseMaligngroupType(MaligngroupType object) {
				return createMaligngroupTypeAdapter();
			}
			@Override
			public Adapter caseMalignmarkType(MalignmarkType object) {
				return createMalignmarkTypeAdapter();
			}
			@Override
			public Adapter caseMathType(MathType object) {
				return createMathTypeAdapter();
			}
			@Override
			public Adapter caseMencloseType(MencloseType object) {
				return createMencloseTypeAdapter();
			}
			@Override
			public Adapter caseMerrorType(MerrorType object) {
				return createMerrorTypeAdapter();
			}
			@Override
			public Adapter caseMfencedType(MfencedType object) {
				return createMfencedTypeAdapter();
			}
			@Override
			public Adapter caseMfracType(MfracType object) {
				return createMfracTypeAdapter();
			}
			@Override
			public Adapter caseMglyphType(MglyphType object) {
				return createMglyphTypeAdapter();
			}
			@Override
			public Adapter caseMinusType(MinusType object) {
				return createMinusTypeAdapter();
			}
			@Override
			public Adapter caseMiType(MiType object) {
				return createMiTypeAdapter();
			}
			@Override
			public Adapter caseMlabeledtrType(MlabeledtrType object) {
				return createMlabeledtrTypeAdapter();
			}
			@Override
			public Adapter caseMlongdivType(MlongdivType object) {
				return createMlongdivTypeAdapter();
			}
			@Override
			public Adapter caseMmultiscriptsType(MmultiscriptsType object) {
				return createMmultiscriptsTypeAdapter();
			}
			@Override
			public Adapter caseMnType(MnType object) {
				return createMnTypeAdapter();
			}
			@Override
			public Adapter caseMomentaboutType(MomentaboutType object) {
				return createMomentaboutTypeAdapter();
			}
			@Override
			public Adapter caseMoType(MoType object) {
				return createMoTypeAdapter();
			}
			@Override
			public Adapter caseMoverType(MoverType object) {
				return createMoverTypeAdapter();
			}
			@Override
			public Adapter caseMpaddedType(MpaddedType object) {
				return createMpaddedTypeAdapter();
			}
			@Override
			public Adapter caseMphantomType(MphantomType object) {
				return createMphantomTypeAdapter();
			}
			@Override
			public Adapter caseMprescriptsType(MprescriptsType object) {
				return createMprescriptsTypeAdapter();
			}
			@Override
			public Adapter caseMrootType(MrootType object) {
				return createMrootTypeAdapter();
			}
			@Override
			public Adapter caseMrowType(MrowType object) {
				return createMrowTypeAdapter();
			}
			@Override
			public Adapter caseMscarriesType(MscarriesType object) {
				return createMscarriesTypeAdapter();
			}
			@Override
			public Adapter caseMscarryType(MscarryType object) {
				return createMscarryTypeAdapter();
			}
			@Override
			public Adapter caseMsgroupType(MsgroupType object) {
				return createMsgroupTypeAdapter();
			}
			@Override
			public Adapter caseMslineType(MslineType object) {
				return createMslineTypeAdapter();
			}
			@Override
			public Adapter caseMspaceType(MspaceType object) {
				return createMspaceTypeAdapter();
			}
			@Override
			public Adapter caseMsqrtType(MsqrtType object) {
				return createMsqrtTypeAdapter();
			}
			@Override
			public Adapter caseMsrowType(MsrowType object) {
				return createMsrowTypeAdapter();
			}
			@Override
			public Adapter caseMstackType(MstackType object) {
				return createMstackTypeAdapter();
			}
			@Override
			public Adapter caseMstyleType(MstyleType object) {
				return createMstyleTypeAdapter();
			}
			@Override
			public Adapter caseMsType(MsType object) {
				return createMsTypeAdapter();
			}
			@Override
			public Adapter caseMsubsupType(MsubsupType object) {
				return createMsubsupTypeAdapter();
			}
			@Override
			public Adapter caseMsubType(MsubType object) {
				return createMsubTypeAdapter();
			}
			@Override
			public Adapter caseMsupType(MsupType object) {
				return createMsupTypeAdapter();
			}
			@Override
			public Adapter caseMtableType(MtableType object) {
				return createMtableTypeAdapter();
			}
			@Override
			public Adapter caseMtextType(MtextType object) {
				return createMtextTypeAdapter();
			}
			@Override
			public Adapter caseMtrType(MtrType object) {
				return createMtrTypeAdapter();
			}
			@Override
			public Adapter caseMunderoverType(MunderoverType object) {
				return createMunderoverTypeAdapter();
			}
			@Override
			public Adapter caseMunderType(MunderType object) {
				return createMunderTypeAdapter();
			}
			@Override
			public Adapter caseNaryArithClassType(NaryArithClassType object) {
				return createNaryArithClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryConstructorClassType(NaryConstructorClassType object) {
				return createNaryConstructorClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryFunctionalClassType(NaryFunctionalClassType object) {
				return createNaryFunctionalClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryLinalgClassType(NaryLinalgClassType object) {
				return createNaryLinalgClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryLogicalClassType(NaryLogicalClassType object) {
				return createNaryLogicalClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryMinmaxClassType(NaryMinmaxClassType object) {
				return createNaryMinmaxClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryRelnClassType(NaryRelnClassType object) {
				return createNaryRelnClassTypeAdapter();
			}
			@Override
			public Adapter caseNarySetClassType(NarySetClassType object) {
				return createNarySetClassTypeAdapter();
			}
			@Override
			public Adapter caseNarySetRelnClassType(NarySetRelnClassType object) {
				return createNarySetRelnClassTypeAdapter();
			}
			@Override
			public Adapter caseNaryStatsClassType(NaryStatsClassType object) {
				return createNaryStatsClassTypeAdapter();
			}
			@Override
			public Adapter caseNeqType(NeqType object) {
				return createNeqTypeAdapter();
			}
			@Override
			public Adapter caseNoneType(NoneType object) {
				return createNoneTypeAdapter();
			}
			@Override
			public Adapter caseOtherwiseType(OtherwiseType object) {
				return createOtherwiseTypeAdapter();
			}
			@Override
			public Adapter casePartialdiffClassType(PartialdiffClassType object) {
				return createPartialdiffClassTypeAdapter();
			}
			@Override
			public Adapter casePieceType(PieceType object) {
				return createPieceTypeAdapter();
			}
			@Override
			public Adapter casePiecewiseType(PiecewiseType object) {
				return createPiecewiseTypeAdapter();
			}
			@Override
			public Adapter casePowerType(PowerType object) {
				return createPowerTypeAdapter();
			}
			@Override
			public Adapter caseProductClassType(ProductClassType object) {
				return createProductClassTypeAdapter();
			}
			@Override
			public Adapter caseQuantifierClassType(QuantifierClassType object) {
				return createQuantifierClassTypeAdapter();
			}
			@Override
			public Adapter caseQuotientType(QuotientType object) {
				return createQuotientTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseRelnType(RelnType object) {
				return createRelnTypeAdapter();
			}
			@Override
			public Adapter caseRemType(RemType object) {
				return createRemTypeAdapter();
			}
			@Override
			public Adapter caseRootType(RootType object) {
				return createRootTypeAdapter();
			}
			@Override
			public Adapter caseSepType(SepType object) {
				return createSepTypeAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseShareType(ShareType object) {
				return createShareTypeAdapter();
			}
			@Override
			public Adapter caseSumClassType(SumClassType object) {
				return createSumClassTypeAdapter();
			}
			@Override
			public Adapter caseTableCellExpressionType(TableCellExpressionType object) {
				return createTableCellExpressionTypeAdapter();
			}
			@Override
			public Adapter caseTendstoType(TendstoType object) {
				return createTendstoTypeAdapter();
			}
			@Override
			public Adapter caseUnaryElementaryClassType(UnaryElementaryClassType object) {
				return createUnaryElementaryClassTypeAdapter();
			}
			@Override
			public Adapter caseUnaryFunctionalClassType(UnaryFunctionalClassType object) {
				return createUnaryFunctionalClassTypeAdapter();
			}
			@Override
			public Adapter caseUnaryLinalgClassType(UnaryLinalgClassType object) {
				return createUnaryLinalgClassTypeAdapter();
			}
			@Override
			public Adapter caseUnaryLogicalClassType(UnaryLogicalClassType object) {
				return createUnaryLogicalClassTypeAdapter();
			}
			@Override
			public Adapter caseUnarySetClassType(UnarySetClassType object) {
				return createUnarySetClassTypeAdapter();
			}
			@Override
			public Adapter caseUnaryVeccalcClassType(UnaryVeccalcClassType object) {
				return createUnaryVeccalcClassTypeAdapter();
			}
			@Override
			public Adapter caseUplimitType(UplimitType object) {
				return createUplimitTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.AbsType <em>Abs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.AbsType
	 * @generated
	 */
	public Adapter createAbsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.AnnotationXmlModel <em>Annotation Xml Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.AnnotationXmlModel
	 * @generated
	 */
	public Adapter createAnnotationXmlModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.AnnotationXmlType <em>Annotation Xml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.AnnotationXmlType
	 * @generated
	 */
	public Adapter createAnnotationXmlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ApplyContent <em>Apply Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ApplyContent
	 * @generated
	 */
	public Adapter createApplyContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ApplyType <em>Apply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ApplyType
	 * @generated
	 */
	public Adapter createApplyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ApproxType <em>Approx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ApproxType
	 * @generated
	 */
	public Adapter createApproxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ArgType
	 * @generated
	 */
	public Adapter createArgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.BinaryLinalgClassType <em>Binary Linalg Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.BinaryLinalgClassType
	 * @generated
	 */
	public Adapter createBinaryLinalgClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.BinaryLogicalClassType <em>Binary Logical Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.BinaryLogicalClassType
	 * @generated
	 */
	public Adapter createBinaryLogicalClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.BinarySetClassType <em>Binary Set Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.BinarySetClassType
	 * @generated
	 */
	public Adapter createBinarySetClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.BindContent <em>Bind Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.BindContent
	 * @generated
	 */
	public Adapter createBindContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.BindType <em>Bind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.BindType
	 * @generated
	 */
	public Adapter createBindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.BvarType <em>Bvar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.BvarType
	 * @generated
	 */
	public Adapter createBvarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CbytesType <em>Cbytes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CbytesType
	 * @generated
	 */
	public Adapter createCbytesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CeilingType <em>Ceiling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CeilingType
	 * @generated
	 */
	public Adapter createCeilingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CerrorType <em>Cerror Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CerrorType
	 * @generated
	 */
	public Adapter createCerrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CiContent <em>Ci Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CiContent
	 * @generated
	 */
	public Adapter createCiContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CiType <em>Ci Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CiType
	 * @generated
	 */
	public Adapter createCiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CnContent <em>Cn Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CnContent
	 * @generated
	 */
	public Adapter createCnContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CnType <em>Cn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CnType
	 * @generated
	 */
	public Adapter createCnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ConjugateType <em>Conjugate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ConjugateType
	 * @generated
	 */
	public Adapter createConjugateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ConstantArithClassType <em>Constant Arith Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ConstantArithClassType
	 * @generated
	 */
	public Adapter createConstantArithClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ConstantSetClassType <em>Constant Set Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ConstantSetClassType
	 * @generated
	 */
	public Adapter createConstantSetClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CsType <em>Cs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CsType
	 * @generated
	 */
	public Adapter createCsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CsymbolContent <em>Csymbol Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CsymbolContent
	 * @generated
	 */
	public Adapter createCsymbolContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.CsymbolType <em>Csymbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.CsymbolType
	 * @generated
	 */
	public Adapter createCsymbolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.DeclareType <em>Declare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.DeclareType
	 * @generated
	 */
	public Adapter createDeclareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.DegreeType <em>Degree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.DegreeType
	 * @generated
	 */
	public Adapter createDegreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.DifferentialOperatorClassType <em>Differential Operator Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.DifferentialOperatorClassType
	 * @generated
	 */
	public Adapter createDifferentialOperatorClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.DivideType <em>Divide Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.DivideType
	 * @generated
	 */
	public Adapter createDivideTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.DomainofapplicationType <em>Domainofapplication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.DomainofapplicationType
	 * @generated
	 */
	public Adapter createDomainofapplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ExpType <em>Exp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ExpType
	 * @generated
	 */
	public Adapter createExpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.FactorialType <em>Factorial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.FactorialType
	 * @generated
	 */
	public Adapter createFactorialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.FactorofType <em>Factorof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.FactorofType
	 * @generated
	 */
	public Adapter createFactorofTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.FloorType <em>Floor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.FloorType
	 * @generated
	 */
	public Adapter createFloorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.FnType <em>Fn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.FnType
	 * @generated
	 */
	public Adapter createFnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ImaginaryType <em>Imaginary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ImaginaryType
	 * @generated
	 */
	public Adapter createImaginaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ImpliedMrow <em>Implied Mrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ImpliedMrow
	 * @generated
	 */
	public Adapter createImpliedMrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.IntClassType <em>Int Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.IntClassType
	 * @generated
	 */
	public Adapter createIntClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.IntervalClassType <em>Interval Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.IntervalClassType
	 * @generated
	 */
	public Adapter createIntervalClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.LambdaClassType <em>Lambda Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.LambdaClassType
	 * @generated
	 */
	public Adapter createLambdaClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.LimitClassType <em>Limit Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.LimitClassType
	 * @generated
	 */
	public Adapter createLimitClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.LogbaseType <em>Logbase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.LogbaseType
	 * @generated
	 */
	public Adapter createLogbaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.LowlimitType <em>Lowlimit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.LowlimitType
	 * @generated
	 */
	public Adapter createLowlimitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MactionType <em>Maction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MactionType
	 * @generated
	 */
	public Adapter createMactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MaligngroupType <em>Maligngroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MaligngroupType
	 * @generated
	 */
	public Adapter createMaligngroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MalignmarkType <em>Malignmark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MalignmarkType
	 * @generated
	 */
	public Adapter createMalignmarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MathType <em>Math Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MathType
	 * @generated
	 */
	public Adapter createMathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MencloseType <em>Menclose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MencloseType
	 * @generated
	 */
	public Adapter createMencloseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MerrorType <em>Merror Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MerrorType
	 * @generated
	 */
	public Adapter createMerrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MfencedType <em>Mfenced Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MfencedType
	 * @generated
	 */
	public Adapter createMfencedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MfracType <em>Mfrac Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MfracType
	 * @generated
	 */
	public Adapter createMfracTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MglyphType <em>Mglyph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MglyphType
	 * @generated
	 */
	public Adapter createMglyphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MinusType <em>Minus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MinusType
	 * @generated
	 */
	public Adapter createMinusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MiType <em>Mi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MiType
	 * @generated
	 */
	public Adapter createMiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MlabeledtrType <em>Mlabeledtr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MlabeledtrType
	 * @generated
	 */
	public Adapter createMlabeledtrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MlongdivType <em>Mlongdiv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MlongdivType
	 * @generated
	 */
	public Adapter createMlongdivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MmultiscriptsType <em>Mmultiscripts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MmultiscriptsType
	 * @generated
	 */
	public Adapter createMmultiscriptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MnType <em>Mn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MnType
	 * @generated
	 */
	public Adapter createMnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MomentaboutType <em>Momentabout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MomentaboutType
	 * @generated
	 */
	public Adapter createMomentaboutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MoType <em>Mo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MoType
	 * @generated
	 */
	public Adapter createMoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MoverType <em>Mover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MoverType
	 * @generated
	 */
	public Adapter createMoverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MpaddedType <em>Mpadded Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MpaddedType
	 * @generated
	 */
	public Adapter createMpaddedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MphantomType <em>Mphantom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MphantomType
	 * @generated
	 */
	public Adapter createMphantomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MprescriptsType <em>Mprescripts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MprescriptsType
	 * @generated
	 */
	public Adapter createMprescriptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MrootType <em>Mroot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MrootType
	 * @generated
	 */
	public Adapter createMrootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MrowType <em>Mrow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MrowType
	 * @generated
	 */
	public Adapter createMrowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MscarriesType <em>Mscarries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MscarriesType
	 * @generated
	 */
	public Adapter createMscarriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MscarryType <em>Mscarry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MscarryType
	 * @generated
	 */
	public Adapter createMscarryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsgroupType <em>Msgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsgroupType
	 * @generated
	 */
	public Adapter createMsgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MslineType <em>Msline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MslineType
	 * @generated
	 */
	public Adapter createMslineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MspaceType <em>Mspace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MspaceType
	 * @generated
	 */
	public Adapter createMspaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsqrtType <em>Msqrt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsqrtType
	 * @generated
	 */
	public Adapter createMsqrtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsrowType <em>Msrow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsrowType
	 * @generated
	 */
	public Adapter createMsrowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MstackType <em>Mstack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MstackType
	 * @generated
	 */
	public Adapter createMstackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MstyleType <em>Mstyle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MstyleType
	 * @generated
	 */
	public Adapter createMstyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsType <em>Ms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsType
	 * @generated
	 */
	public Adapter createMsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsubsupType <em>Msubsup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsubsupType
	 * @generated
	 */
	public Adapter createMsubsupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsubType <em>Msub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsubType
	 * @generated
	 */
	public Adapter createMsubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MsupType <em>Msup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MsupType
	 * @generated
	 */
	public Adapter createMsupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MtableType <em>Mtable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MtableType
	 * @generated
	 */
	public Adapter createMtableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MtextType <em>Mtext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MtextType
	 * @generated
	 */
	public Adapter createMtextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MtrType <em>Mtr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MtrType
	 * @generated
	 */
	public Adapter createMtrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MunderoverType <em>Munderover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MunderoverType
	 * @generated
	 */
	public Adapter createMunderoverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.MunderType <em>Munder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.MunderType
	 * @generated
	 */
	public Adapter createMunderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryArithClassType <em>Nary Arith Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryArithClassType
	 * @generated
	 */
	public Adapter createNaryArithClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryConstructorClassType <em>Nary Constructor Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryConstructorClassType
	 * @generated
	 */
	public Adapter createNaryConstructorClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryFunctionalClassType <em>Nary Functional Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryFunctionalClassType
	 * @generated
	 */
	public Adapter createNaryFunctionalClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryLinalgClassType <em>Nary Linalg Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryLinalgClassType
	 * @generated
	 */
	public Adapter createNaryLinalgClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryLogicalClassType <em>Nary Logical Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryLogicalClassType
	 * @generated
	 */
	public Adapter createNaryLogicalClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryMinmaxClassType <em>Nary Minmax Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryMinmaxClassType
	 * @generated
	 */
	public Adapter createNaryMinmaxClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryRelnClassType <em>Nary Reln Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryRelnClassType
	 * @generated
	 */
	public Adapter createNaryRelnClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NarySetClassType <em>Nary Set Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NarySetClassType
	 * @generated
	 */
	public Adapter createNarySetClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NarySetRelnClassType <em>Nary Set Reln Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NarySetRelnClassType
	 * @generated
	 */
	public Adapter createNarySetRelnClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NaryStatsClassType <em>Nary Stats Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NaryStatsClassType
	 * @generated
	 */
	public Adapter createNaryStatsClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NeqType <em>Neq Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NeqType
	 * @generated
	 */
	public Adapter createNeqTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.NoneType <em>None Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.NoneType
	 * @generated
	 */
	public Adapter createNoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.OtherwiseType <em>Otherwise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.OtherwiseType
	 * @generated
	 */
	public Adapter createOtherwiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.PartialdiffClassType <em>Partialdiff Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.PartialdiffClassType
	 * @generated
	 */
	public Adapter createPartialdiffClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.PieceType <em>Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.PieceType
	 * @generated
	 */
	public Adapter createPieceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.PiecewiseType <em>Piecewise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.PiecewiseType
	 * @generated
	 */
	public Adapter createPiecewiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.PowerType <em>Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.PowerType
	 * @generated
	 */
	public Adapter createPowerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ProductClassType <em>Product Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ProductClassType
	 * @generated
	 */
	public Adapter createProductClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.QuantifierClassType <em>Quantifier Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.QuantifierClassType
	 * @generated
	 */
	public Adapter createQuantifierClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.QuotientType <em>Quotient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.QuotientType
	 * @generated
	 */
	public Adapter createQuotientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.RelnType <em>Reln Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.RelnType
	 * @generated
	 */
	public Adapter createRelnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.RemType <em>Rem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.RemType
	 * @generated
	 */
	public Adapter createRemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.RootType
	 * @generated
	 */
	public Adapter createRootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.SepType <em>Sep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.SepType
	 * @generated
	 */
	public Adapter createSepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.ShareType <em>Share Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.ShareType
	 * @generated
	 */
	public Adapter createShareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.SumClassType <em>Sum Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.SumClassType
	 * @generated
	 */
	public Adapter createSumClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.TableCellExpressionType <em>Table Cell Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.TableCellExpressionType
	 * @generated
	 */
	public Adapter createTableCellExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.TendstoType <em>Tendsto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.TendstoType
	 * @generated
	 */
	public Adapter createTendstoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UnaryElementaryClassType <em>Unary Elementary Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UnaryElementaryClassType
	 * @generated
	 */
	public Adapter createUnaryElementaryClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UnaryFunctionalClassType <em>Unary Functional Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UnaryFunctionalClassType
	 * @generated
	 */
	public Adapter createUnaryFunctionalClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UnaryLinalgClassType <em>Unary Linalg Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UnaryLinalgClassType
	 * @generated
	 */
	public Adapter createUnaryLinalgClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UnaryLogicalClassType <em>Unary Logical Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UnaryLogicalClassType
	 * @generated
	 */
	public Adapter createUnaryLogicalClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UnarySetClassType <em>Unary Set Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UnarySetClassType
	 * @generated
	 */
	public Adapter createUnarySetClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UnaryVeccalcClassType <em>Unary Veccalc Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UnaryVeccalcClassType
	 * @generated
	 */
	public Adapter createUnaryVeccalcClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.UplimitType <em>Uplimit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.UplimitType
	 * @generated
	 */
	public Adapter createUplimitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._1998.math.math.ml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._1998.math.math.ml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MlAdapterFactory
