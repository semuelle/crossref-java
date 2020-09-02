/**
 */
package org.w3._1998.math.math.ml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.w3._1998.math.math.ml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage
 * @generated
 */
public class MlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlSwitch() {
		if (modelPackage == null) {
			modelPackage = MlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MlPackage.ABS_TYPE: {
				AbsType absType = (AbsType)theEObject;
				T result = caseAbsType(absType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.ANNOTATION_XML_MODEL: {
				AnnotationXmlModel annotationXmlModel = (AnnotationXmlModel)theEObject;
				T result = caseAnnotationXmlModel(annotationXmlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.ANNOTATION_XML_TYPE: {
				AnnotationXmlType annotationXmlType = (AnnotationXmlType)theEObject;
				T result = caseAnnotationXmlType(annotationXmlType);
				if (result == null) result = caseAnnotationXmlModel(annotationXmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.APPLY_CONTENT: {
				ApplyContent applyContent = (ApplyContent)theEObject;
				T result = caseApplyContent(applyContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.APPLY_TYPE: {
				ApplyType applyType = (ApplyType)theEObject;
				T result = caseApplyType(applyType);
				if (result == null) result = caseApplyContent(applyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.APPROX_TYPE: {
				ApproxType approxType = (ApproxType)theEObject;
				T result = caseApproxType(approxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.ARG_TYPE: {
				ArgType argType = (ArgType)theEObject;
				T result = caseArgType(argType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.BINARY_LINALG_CLASS_TYPE: {
				BinaryLinalgClassType binaryLinalgClassType = (BinaryLinalgClassType)theEObject;
				T result = caseBinaryLinalgClassType(binaryLinalgClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.BINARY_LOGICAL_CLASS_TYPE: {
				BinaryLogicalClassType binaryLogicalClassType = (BinaryLogicalClassType)theEObject;
				T result = caseBinaryLogicalClassType(binaryLogicalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.BINARY_SET_CLASS_TYPE: {
				BinarySetClassType binarySetClassType = (BinarySetClassType)theEObject;
				T result = caseBinarySetClassType(binarySetClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.BIND_CONTENT: {
				BindContent bindContent = (BindContent)theEObject;
				T result = caseBindContent(bindContent);
				if (result == null) result = caseApplyContent(bindContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.BIND_TYPE: {
				BindType bindType = (BindType)theEObject;
				T result = caseBindType(bindType);
				if (result == null) result = caseBindContent(bindType);
				if (result == null) result = caseApplyContent(bindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.BVAR_TYPE: {
				BvarType bvarType = (BvarType)theEObject;
				T result = caseBvarType(bvarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CBYTES_TYPE: {
				CbytesType cbytesType = (CbytesType)theEObject;
				T result = caseCbytesType(cbytesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CEILING_TYPE: {
				CeilingType ceilingType = (CeilingType)theEObject;
				T result = caseCeilingType(ceilingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CERROR_TYPE: {
				CerrorType cerrorType = (CerrorType)theEObject;
				T result = caseCerrorType(cerrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CI_CONTENT: {
				CiContent ciContent = (CiContent)theEObject;
				T result = caseCiContent(ciContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CI_TYPE: {
				CiType ciType = (CiType)theEObject;
				T result = caseCiType(ciType);
				if (result == null) result = caseCiContent(ciType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CN_CONTENT: {
				CnContent cnContent = (CnContent)theEObject;
				T result = caseCnContent(cnContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CN_TYPE: {
				CnType cnType = (CnType)theEObject;
				T result = caseCnType(cnType);
				if (result == null) result = caseCnContent(cnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CONJUGATE_TYPE: {
				ConjugateType conjugateType = (ConjugateType)theEObject;
				T result = caseConjugateType(conjugateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CONSTANT_ARITH_CLASS_TYPE: {
				ConstantArithClassType constantArithClassType = (ConstantArithClassType)theEObject;
				T result = caseConstantArithClassType(constantArithClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CONSTANT_SET_CLASS_TYPE: {
				ConstantSetClassType constantSetClassType = (ConstantSetClassType)theEObject;
				T result = caseConstantSetClassType(constantSetClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CS_TYPE: {
				CsType csType = (CsType)theEObject;
				T result = caseCsType(csType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CSYMBOL_CONTENT: {
				CsymbolContent csymbolContent = (CsymbolContent)theEObject;
				T result = caseCsymbolContent(csymbolContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.CSYMBOL_TYPE: {
				CsymbolType csymbolType = (CsymbolType)theEObject;
				T result = caseCsymbolType(csymbolType);
				if (result == null) result = caseCsymbolContent(csymbolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.DECLARE_TYPE: {
				DeclareType declareType = (DeclareType)theEObject;
				T result = caseDeclareType(declareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.DEGREE_TYPE: {
				DegreeType degreeType = (DegreeType)theEObject;
				T result = caseDegreeType(degreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.DIFFERENTIAL_OPERATOR_CLASS_TYPE: {
				DifferentialOperatorClassType differentialOperatorClassType = (DifferentialOperatorClassType)theEObject;
				T result = caseDifferentialOperatorClassType(differentialOperatorClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.DIVIDE_TYPE: {
				DivideType divideType = (DivideType)theEObject;
				T result = caseDivideType(divideType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.DOMAINOFAPPLICATION_TYPE: {
				DomainofapplicationType domainofapplicationType = (DomainofapplicationType)theEObject;
				T result = caseDomainofapplicationType(domainofapplicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.EXP_TYPE: {
				ExpType expType = (ExpType)theEObject;
				T result = caseExpType(expType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.FACTORIAL_TYPE: {
				FactorialType factorialType = (FactorialType)theEObject;
				T result = caseFactorialType(factorialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.FACTOROF_TYPE: {
				FactorofType factorofType = (FactorofType)theEObject;
				T result = caseFactorofType(factorofType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.FLOOR_TYPE: {
				FloorType floorType = (FloorType)theEObject;
				T result = caseFloorType(floorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.FN_TYPE: {
				FnType fnType = (FnType)theEObject;
				T result = caseFnType(fnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.IMAGINARY_TYPE: {
				ImaginaryType imaginaryType = (ImaginaryType)theEObject;
				T result = caseImaginaryType(imaginaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.IMPLIED_MROW: {
				ImpliedMrow impliedMrow = (ImpliedMrow)theEObject;
				T result = caseImpliedMrow(impliedMrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.INT_CLASS_TYPE: {
				IntClassType intClassType = (IntClassType)theEObject;
				T result = caseIntClassType(intClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.INTERVAL_CLASS_TYPE: {
				IntervalClassType intervalClassType = (IntervalClassType)theEObject;
				T result = caseIntervalClassType(intervalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.LAMBDA_CLASS_TYPE: {
				LambdaClassType lambdaClassType = (LambdaClassType)theEObject;
				T result = caseLambdaClassType(lambdaClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.LIMIT_CLASS_TYPE: {
				LimitClassType limitClassType = (LimitClassType)theEObject;
				T result = caseLimitClassType(limitClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.LOGBASE_TYPE: {
				LogbaseType logbaseType = (LogbaseType)theEObject;
				T result = caseLogbaseType(logbaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.LOWLIMIT_TYPE: {
				LowlimitType lowlimitType = (LowlimitType)theEObject;
				T result = caseLowlimitType(lowlimitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MACTION_TYPE: {
				MactionType mactionType = (MactionType)theEObject;
				T result = caseMactionType(mactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MALIGNGROUP_TYPE: {
				MaligngroupType maligngroupType = (MaligngroupType)theEObject;
				T result = caseMaligngroupType(maligngroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MALIGNMARK_TYPE: {
				MalignmarkType malignmarkType = (MalignmarkType)theEObject;
				T result = caseMalignmarkType(malignmarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MATH_TYPE: {
				MathType mathType = (MathType)theEObject;
				T result = caseMathType(mathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MENCLOSE_TYPE: {
				MencloseType mencloseType = (MencloseType)theEObject;
				T result = caseMencloseType(mencloseType);
				if (result == null) result = caseImpliedMrow(mencloseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MERROR_TYPE: {
				MerrorType merrorType = (MerrorType)theEObject;
				T result = caseMerrorType(merrorType);
				if (result == null) result = caseImpliedMrow(merrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MFENCED_TYPE: {
				MfencedType mfencedType = (MfencedType)theEObject;
				T result = caseMfencedType(mfencedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MFRAC_TYPE: {
				MfracType mfracType = (MfracType)theEObject;
				T result = caseMfracType(mfracType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MGLYPH_TYPE: {
				MglyphType mglyphType = (MglyphType)theEObject;
				T result = caseMglyphType(mglyphType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MINUS_TYPE: {
				MinusType minusType = (MinusType)theEObject;
				T result = caseMinusType(minusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MI_TYPE: {
				MiType miType = (MiType)theEObject;
				T result = caseMiType(miType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MLABELEDTR_TYPE: {
				MlabeledtrType mlabeledtrType = (MlabeledtrType)theEObject;
				T result = caseMlabeledtrType(mlabeledtrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MLONGDIV_TYPE: {
				MlongdivType mlongdivType = (MlongdivType)theEObject;
				T result = caseMlongdivType(mlongdivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MMULTISCRIPTS_TYPE: {
				MmultiscriptsType mmultiscriptsType = (MmultiscriptsType)theEObject;
				T result = caseMmultiscriptsType(mmultiscriptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MN_TYPE: {
				MnType mnType = (MnType)theEObject;
				T result = caseMnType(mnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MOMENTABOUT_TYPE: {
				MomentaboutType momentaboutType = (MomentaboutType)theEObject;
				T result = caseMomentaboutType(momentaboutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MO_TYPE: {
				MoType moType = (MoType)theEObject;
				T result = caseMoType(moType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MOVER_TYPE: {
				MoverType moverType = (MoverType)theEObject;
				T result = caseMoverType(moverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MPADDED_TYPE: {
				MpaddedType mpaddedType = (MpaddedType)theEObject;
				T result = caseMpaddedType(mpaddedType);
				if (result == null) result = caseImpliedMrow(mpaddedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MPHANTOM_TYPE: {
				MphantomType mphantomType = (MphantomType)theEObject;
				T result = caseMphantomType(mphantomType);
				if (result == null) result = caseImpliedMrow(mphantomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MPRESCRIPTS_TYPE: {
				MprescriptsType mprescriptsType = (MprescriptsType)theEObject;
				T result = caseMprescriptsType(mprescriptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MROOT_TYPE: {
				MrootType mrootType = (MrootType)theEObject;
				T result = caseMrootType(mrootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MROW_TYPE: {
				MrowType mrowType = (MrowType)theEObject;
				T result = caseMrowType(mrowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSCARRIES_TYPE: {
				MscarriesType mscarriesType = (MscarriesType)theEObject;
				T result = caseMscarriesType(mscarriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSCARRY_TYPE: {
				MscarryType mscarryType = (MscarryType)theEObject;
				T result = caseMscarryType(mscarryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSGROUP_TYPE: {
				MsgroupType msgroupType = (MsgroupType)theEObject;
				T result = caseMsgroupType(msgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSLINE_TYPE: {
				MslineType mslineType = (MslineType)theEObject;
				T result = caseMslineType(mslineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSPACE_TYPE: {
				MspaceType mspaceType = (MspaceType)theEObject;
				T result = caseMspaceType(mspaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSQRT_TYPE: {
				MsqrtType msqrtType = (MsqrtType)theEObject;
				T result = caseMsqrtType(msqrtType);
				if (result == null) result = caseImpliedMrow(msqrtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSROW_TYPE: {
				MsrowType msrowType = (MsrowType)theEObject;
				T result = caseMsrowType(msrowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSTACK_TYPE: {
				MstackType mstackType = (MstackType)theEObject;
				T result = caseMstackType(mstackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSTYLE_TYPE: {
				MstyleType mstyleType = (MstyleType)theEObject;
				T result = caseMstyleType(mstyleType);
				if (result == null) result = caseImpliedMrow(mstyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MS_TYPE: {
				MsType msType = (MsType)theEObject;
				T result = caseMsType(msType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSUBSUP_TYPE: {
				MsubsupType msubsupType = (MsubsupType)theEObject;
				T result = caseMsubsupType(msubsupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSUB_TYPE: {
				MsubType msubType = (MsubType)theEObject;
				T result = caseMsubType(msubType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MSUP_TYPE: {
				MsupType msupType = (MsupType)theEObject;
				T result = caseMsupType(msupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MTABLE_TYPE: {
				MtableType mtableType = (MtableType)theEObject;
				T result = caseMtableType(mtableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MTEXT_TYPE: {
				MtextType mtextType = (MtextType)theEObject;
				T result = caseMtextType(mtextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MTR_TYPE: {
				MtrType mtrType = (MtrType)theEObject;
				T result = caseMtrType(mtrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MUNDEROVER_TYPE: {
				MunderoverType munderoverType = (MunderoverType)theEObject;
				T result = caseMunderoverType(munderoverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.MUNDER_TYPE: {
				MunderType munderType = (MunderType)theEObject;
				T result = caseMunderType(munderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_ARITH_CLASS_TYPE: {
				NaryArithClassType naryArithClassType = (NaryArithClassType)theEObject;
				T result = caseNaryArithClassType(naryArithClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_CONSTRUCTOR_CLASS_TYPE: {
				NaryConstructorClassType naryConstructorClassType = (NaryConstructorClassType)theEObject;
				T result = caseNaryConstructorClassType(naryConstructorClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_FUNCTIONAL_CLASS_TYPE: {
				NaryFunctionalClassType naryFunctionalClassType = (NaryFunctionalClassType)theEObject;
				T result = caseNaryFunctionalClassType(naryFunctionalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_LINALG_CLASS_TYPE: {
				NaryLinalgClassType naryLinalgClassType = (NaryLinalgClassType)theEObject;
				T result = caseNaryLinalgClassType(naryLinalgClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_LOGICAL_CLASS_TYPE: {
				NaryLogicalClassType naryLogicalClassType = (NaryLogicalClassType)theEObject;
				T result = caseNaryLogicalClassType(naryLogicalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_MINMAX_CLASS_TYPE: {
				NaryMinmaxClassType naryMinmaxClassType = (NaryMinmaxClassType)theEObject;
				T result = caseNaryMinmaxClassType(naryMinmaxClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_RELN_CLASS_TYPE: {
				NaryRelnClassType naryRelnClassType = (NaryRelnClassType)theEObject;
				T result = caseNaryRelnClassType(naryRelnClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_SET_CLASS_TYPE: {
				NarySetClassType narySetClassType = (NarySetClassType)theEObject;
				T result = caseNarySetClassType(narySetClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_SET_RELN_CLASS_TYPE: {
				NarySetRelnClassType narySetRelnClassType = (NarySetRelnClassType)theEObject;
				T result = caseNarySetRelnClassType(narySetRelnClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NARY_STATS_CLASS_TYPE: {
				NaryStatsClassType naryStatsClassType = (NaryStatsClassType)theEObject;
				T result = caseNaryStatsClassType(naryStatsClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NEQ_TYPE: {
				NeqType neqType = (NeqType)theEObject;
				T result = caseNeqType(neqType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.NONE_TYPE: {
				NoneType noneType = (NoneType)theEObject;
				T result = caseNoneType(noneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.OTHERWISE_TYPE: {
				OtherwiseType otherwiseType = (OtherwiseType)theEObject;
				T result = caseOtherwiseType(otherwiseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.PARTIALDIFF_CLASS_TYPE: {
				PartialdiffClassType partialdiffClassType = (PartialdiffClassType)theEObject;
				T result = casePartialdiffClassType(partialdiffClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.PIECE_TYPE: {
				PieceType pieceType = (PieceType)theEObject;
				T result = casePieceType(pieceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.PIECEWISE_TYPE: {
				PiecewiseType piecewiseType = (PiecewiseType)theEObject;
				T result = casePiecewiseType(piecewiseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.POWER_TYPE: {
				PowerType powerType = (PowerType)theEObject;
				T result = casePowerType(powerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.PRODUCT_CLASS_TYPE: {
				ProductClassType productClassType = (ProductClassType)theEObject;
				T result = caseProductClassType(productClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.QUANTIFIER_CLASS_TYPE: {
				QuantifierClassType quantifierClassType = (QuantifierClassType)theEObject;
				T result = caseQuantifierClassType(quantifierClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.QUOTIENT_TYPE: {
				QuotientType quotientType = (QuotientType)theEObject;
				T result = caseQuotientType(quotientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.RELN_TYPE: {
				RelnType relnType = (RelnType)theEObject;
				T result = caseRelnType(relnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.REM_TYPE: {
				RemType remType = (RemType)theEObject;
				T result = caseRemType(remType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.ROOT_TYPE: {
				RootType rootType = (RootType)theEObject;
				T result = caseRootType(rootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.SEP_TYPE: {
				SepType sepType = (SepType)theEObject;
				T result = caseSepType(sepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.SHARE_TYPE: {
				ShareType shareType = (ShareType)theEObject;
				T result = caseShareType(shareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.SUM_CLASS_TYPE: {
				SumClassType sumClassType = (SumClassType)theEObject;
				T result = caseSumClassType(sumClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE: {
				TableCellExpressionType tableCellExpressionType = (TableCellExpressionType)theEObject;
				T result = caseTableCellExpressionType(tableCellExpressionType);
				if (result == null) result = caseImpliedMrow(tableCellExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.TENDSTO_TYPE: {
				TendstoType tendstoType = (TendstoType)theEObject;
				T result = caseTendstoType(tendstoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UNARY_ELEMENTARY_CLASS_TYPE: {
				UnaryElementaryClassType unaryElementaryClassType = (UnaryElementaryClassType)theEObject;
				T result = caseUnaryElementaryClassType(unaryElementaryClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UNARY_FUNCTIONAL_CLASS_TYPE: {
				UnaryFunctionalClassType unaryFunctionalClassType = (UnaryFunctionalClassType)theEObject;
				T result = caseUnaryFunctionalClassType(unaryFunctionalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UNARY_LINALG_CLASS_TYPE: {
				UnaryLinalgClassType unaryLinalgClassType = (UnaryLinalgClassType)theEObject;
				T result = caseUnaryLinalgClassType(unaryLinalgClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UNARY_LOGICAL_CLASS_TYPE: {
				UnaryLogicalClassType unaryLogicalClassType = (UnaryLogicalClassType)theEObject;
				T result = caseUnaryLogicalClassType(unaryLogicalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UNARY_SET_CLASS_TYPE: {
				UnarySetClassType unarySetClassType = (UnarySetClassType)theEObject;
				T result = caseUnarySetClassType(unarySetClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UNARY_VECCALC_CLASS_TYPE: {
				UnaryVeccalcClassType unaryVeccalcClassType = (UnaryVeccalcClassType)theEObject;
				T result = caseUnaryVeccalcClassType(unaryVeccalcClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.UPLIMIT_TYPE: {
				UplimitType uplimitType = (UplimitType)theEObject;
				T result = caseUplimitType(uplimitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsType(AbsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Xml Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Xml Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationXmlModel(AnnotationXmlModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Xml Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Xml Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationXmlType(AnnotationXmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyContent(ApplyContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyType(ApplyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approx Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approx Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApproxType(ApproxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgType(ArgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Linalg Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Linalg Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLinalgClassType(BinaryLinalgClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logical Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logical Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLogicalClassType(BinaryLogicalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Set Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Set Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySetClassType(BinarySetClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bind Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bind Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindContent(BindContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindType(BindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bvar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bvar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBvarType(BvarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cbytes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cbytes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCbytesType(CbytesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ceiling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ceiling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilingType(CeilingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cerror Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cerror Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCerrorType(CerrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ci Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ci Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCiContent(CiContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ci Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ci Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCiType(CiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cn Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cn Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCnContent(CnContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCnType(CnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjugate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjugate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjugateType(ConjugateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Arith Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Arith Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantArithClassType(ConstantArithClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Set Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Set Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantSetClassType(ConstantSetClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsType(CsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csymbol Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csymbol Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsymbolContent(CsymbolContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csymbol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csymbol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsymbolType(CsymbolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareType(DeclareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreeType(DegreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Differential Operator Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Differential Operator Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentialOperatorClassType(DifferentialOperatorClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivideType(DivideType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domainofapplication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domainofapplication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainofapplicationType(DomainofapplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpType(ExpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factorial Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factorial Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactorialType(FactorialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factorof Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factorof Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactorofType(FactorofType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloorType(FloorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFnType(FnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaginary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaginary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImaginaryType(ImaginaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implied Mrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implied Mrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliedMrow(ImpliedMrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntClassType(IntClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalClassType(IntervalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaClassType(LambdaClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimitClassType(LimitClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logbase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logbase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogbaseType(LogbaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lowlimit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lowlimit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowlimitType(LowlimitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMactionType(MactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maligngroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maligngroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaligngroupType(MaligngroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Malignmark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Malignmark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMalignmarkType(MalignmarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathType(MathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menclose Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menclose Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMencloseType(MencloseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merror Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merror Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerrorType(MerrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mfenced Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mfenced Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMfencedType(MfencedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mfrac Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mfrac Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMfracType(MfracType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mglyph Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mglyph Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMglyphType(MglyphType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusType(MinusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mi Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mi Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiType(MiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mlabeledtr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mlabeledtr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMlabeledtrType(MlabeledtrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mlongdiv Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mlongdiv Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMlongdivType(MlongdivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mmultiscripts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mmultiscripts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMmultiscriptsType(MmultiscriptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMnType(MnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Momentabout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Momentabout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMomentaboutType(MomentaboutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoType(MoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mover Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mover Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoverType(MoverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mpadded Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mpadded Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMpaddedType(MpaddedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mphantom Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mphantom Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMphantomType(MphantomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mprescripts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mprescripts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMprescriptsType(MprescriptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mroot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mroot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMrootType(MrootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mrow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mrow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMrowType(MrowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mscarries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mscarries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMscarriesType(MscarriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mscarry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mscarry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMscarryType(MscarryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsgroupType(MsgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMslineType(MslineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mspace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mspace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMspaceType(MspaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msqrt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msqrt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsqrtType(MsqrtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msrow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msrow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsrowType(MsrowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mstack Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mstack Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMstackType(MstackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mstyle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mstyle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMstyleType(MstyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsType(MsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msubsup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msubsup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsubsupType(MsubsupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsubType(MsubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsupType(MsupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mtable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mtable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMtableType(MtableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mtext Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mtext Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMtextType(MtextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mtr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mtr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMtrType(MtrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Munderover Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Munderover Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMunderoverType(MunderoverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Munder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Munder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMunderType(MunderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Arith Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Arith Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryArithClassType(NaryArithClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Constructor Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Constructor Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryConstructorClassType(NaryConstructorClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Functional Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Functional Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryFunctionalClassType(NaryFunctionalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Linalg Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Linalg Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryLinalgClassType(NaryLinalgClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Logical Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Logical Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryLogicalClassType(NaryLogicalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Minmax Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Minmax Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryMinmaxClassType(NaryMinmaxClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Reln Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Reln Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryRelnClassType(NaryRelnClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Set Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Set Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarySetClassType(NarySetClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Set Reln Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Set Reln Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarySetRelnClassType(NarySetRelnClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Stats Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Stats Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryStatsClassType(NaryStatsClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neq Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neq Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeqType(NeqType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneType(NoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Otherwise Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Otherwise Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherwiseType(OtherwiseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partialdiff Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partialdiff Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialdiffClassType(PartialdiffClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piece Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePieceType(PieceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piecewise Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piecewise Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiecewiseType(PiecewiseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerType(PowerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductClassType(ProductClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierClassType(QuantifierClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quotient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quotient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuotientType(QuotientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reln Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reln Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelnType(RelnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemType(RemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootType(RootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sep Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sep Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSepType(SepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Share Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Share Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareType(ShareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSumClassType(SumClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Cell Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Cell Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCellExpressionType(TableCellExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tendsto Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tendsto Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTendstoType(TendstoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Elementary Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Elementary Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryElementaryClassType(UnaryElementaryClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Functional Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Functional Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryFunctionalClassType(UnaryFunctionalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Linalg Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Linalg Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryLinalgClassType(UnaryLinalgClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Logical Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Logical Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryLogicalClassType(UnaryLogicalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Set Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Set Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnarySetClassType(UnarySetClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Veccalc Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Veccalc Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryVeccalcClassType(UnaryVeccalcClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uplimit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uplimit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUplimitType(UplimitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MlSwitch
