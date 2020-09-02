/**
 */
package org.w3._1998.math.math.ml.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.w3._1998.math.math.ml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3._1998.math.math.ml.MlPackage
 * @generated
 */
public class MlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MlValidator INSTANCE = new MlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3._1998.math.math.ml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MlPackage.ABS_TYPE:
				return validateAbsType((AbsType)value, diagnostics, context);
			case MlPackage.ANNOTATION_TYPE:
				return validateAnnotationType((AnnotationType)value, diagnostics, context);
			case MlPackage.ANNOTATION_XML_MODEL:
				return validateAnnotationXmlModel((AnnotationXmlModel)value, diagnostics, context);
			case MlPackage.ANNOTATION_XML_TYPE:
				return validateAnnotationXmlType((AnnotationXmlType)value, diagnostics, context);
			case MlPackage.APPLY_CONTENT:
				return validateApplyContent((ApplyContent)value, diagnostics, context);
			case MlPackage.APPLY_TYPE:
				return validateApplyType((ApplyType)value, diagnostics, context);
			case MlPackage.APPROX_TYPE:
				return validateApproxType((ApproxType)value, diagnostics, context);
			case MlPackage.ARG_TYPE:
				return validateArgType((ArgType)value, diagnostics, context);
			case MlPackage.BINARY_LINALG_CLASS_TYPE:
				return validateBinaryLinalgClassType((BinaryLinalgClassType)value, diagnostics, context);
			case MlPackage.BINARY_LOGICAL_CLASS_TYPE:
				return validateBinaryLogicalClassType((BinaryLogicalClassType)value, diagnostics, context);
			case MlPackage.BINARY_SET_CLASS_TYPE:
				return validateBinarySetClassType((BinarySetClassType)value, diagnostics, context);
			case MlPackage.BIND_CONTENT:
				return validateBindContent((BindContent)value, diagnostics, context);
			case MlPackage.BIND_TYPE:
				return validateBindType((BindType)value, diagnostics, context);
			case MlPackage.BVAR_TYPE:
				return validateBvarType((BvarType)value, diagnostics, context);
			case MlPackage.CBYTES_TYPE:
				return validateCbytesType((CbytesType)value, diagnostics, context);
			case MlPackage.CEILING_TYPE:
				return validateCeilingType((CeilingType)value, diagnostics, context);
			case MlPackage.CERROR_TYPE:
				return validateCerrorType((CerrorType)value, diagnostics, context);
			case MlPackage.CI_CONTENT:
				return validateCiContent((CiContent)value, diagnostics, context);
			case MlPackage.CI_TYPE:
				return validateCiType((CiType)value, diagnostics, context);
			case MlPackage.CN_CONTENT:
				return validateCnContent((CnContent)value, diagnostics, context);
			case MlPackage.CN_TYPE:
				return validateCnType((CnType)value, diagnostics, context);
			case MlPackage.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case MlPackage.CONJUGATE_TYPE:
				return validateConjugateType((ConjugateType)value, diagnostics, context);
			case MlPackage.CONSTANT_ARITH_CLASS_TYPE:
				return validateConstantArithClassType((ConstantArithClassType)value, diagnostics, context);
			case MlPackage.CONSTANT_SET_CLASS_TYPE:
				return validateConstantSetClassType((ConstantSetClassType)value, diagnostics, context);
			case MlPackage.CS_TYPE:
				return validateCsType((CsType)value, diagnostics, context);
			case MlPackage.CSYMBOL_CONTENT:
				return validateCsymbolContent((CsymbolContent)value, diagnostics, context);
			case MlPackage.CSYMBOL_TYPE:
				return validateCsymbolType((CsymbolType)value, diagnostics, context);
			case MlPackage.DECLARE_TYPE:
				return validateDeclareType((DeclareType)value, diagnostics, context);
			case MlPackage.DEGREE_TYPE:
				return validateDegreeType((DegreeType)value, diagnostics, context);
			case MlPackage.DIFFERENTIAL_OPERATOR_CLASS_TYPE:
				return validateDifferentialOperatorClassType((DifferentialOperatorClassType)value, diagnostics, context);
			case MlPackage.DIVIDE_TYPE:
				return validateDivideType((DivideType)value, diagnostics, context);
			case MlPackage.DOMAINOFAPPLICATION_TYPE:
				return validateDomainofapplicationType((DomainofapplicationType)value, diagnostics, context);
			case MlPackage.EXP_TYPE:
				return validateExpType((ExpType)value, diagnostics, context);
			case MlPackage.FACTORIAL_TYPE:
				return validateFactorialType((FactorialType)value, diagnostics, context);
			case MlPackage.FACTOROF_TYPE:
				return validateFactorofType((FactorofType)value, diagnostics, context);
			case MlPackage.FLOOR_TYPE:
				return validateFloorType((FloorType)value, diagnostics, context);
			case MlPackage.FN_TYPE:
				return validateFnType((FnType)value, diagnostics, context);
			case MlPackage.IMAGINARY_TYPE:
				return validateImaginaryType((ImaginaryType)value, diagnostics, context);
			case MlPackage.IMPLIED_MROW:
				return validateImpliedMrow((ImpliedMrow)value, diagnostics, context);
			case MlPackage.INT_CLASS_TYPE:
				return validateIntClassType((IntClassType)value, diagnostics, context);
			case MlPackage.INTERVAL_CLASS_TYPE:
				return validateIntervalClassType((IntervalClassType)value, diagnostics, context);
			case MlPackage.LAMBDA_CLASS_TYPE:
				return validateLambdaClassType((LambdaClassType)value, diagnostics, context);
			case MlPackage.LIMIT_CLASS_TYPE:
				return validateLimitClassType((LimitClassType)value, diagnostics, context);
			case MlPackage.LIST_TYPE:
				return validateListType((ListType)value, diagnostics, context);
			case MlPackage.LOGBASE_TYPE:
				return validateLogbaseType((LogbaseType)value, diagnostics, context);
			case MlPackage.LOWLIMIT_TYPE:
				return validateLowlimitType((LowlimitType)value, diagnostics, context);
			case MlPackage.MACTION_TYPE:
				return validateMactionType((MactionType)value, diagnostics, context);
			case MlPackage.MALIGNGROUP_TYPE:
				return validateMaligngroupType((MaligngroupType)value, diagnostics, context);
			case MlPackage.MALIGNMARK_TYPE:
				return validateMalignmarkType((MalignmarkType)value, diagnostics, context);
			case MlPackage.MATH_TYPE:
				return validateMathType((MathType)value, diagnostics, context);
			case MlPackage.MENCLOSE_TYPE:
				return validateMencloseType((MencloseType)value, diagnostics, context);
			case MlPackage.MERROR_TYPE:
				return validateMerrorType((MerrorType)value, diagnostics, context);
			case MlPackage.MFENCED_TYPE:
				return validateMfencedType((MfencedType)value, diagnostics, context);
			case MlPackage.MFRAC_TYPE:
				return validateMfracType((MfracType)value, diagnostics, context);
			case MlPackage.MGLYPH_TYPE:
				return validateMglyphType((MglyphType)value, diagnostics, context);
			case MlPackage.MINUS_TYPE:
				return validateMinusType((MinusType)value, diagnostics, context);
			case MlPackage.MI_TYPE:
				return validateMiType((MiType)value, diagnostics, context);
			case MlPackage.MLABELEDTR_TYPE:
				return validateMlabeledtrType((MlabeledtrType)value, diagnostics, context);
			case MlPackage.MLONGDIV_TYPE:
				return validateMlongdivType((MlongdivType)value, diagnostics, context);
			case MlPackage.MMULTISCRIPTS_TYPE:
				return validateMmultiscriptsType((MmultiscriptsType)value, diagnostics, context);
			case MlPackage.MN_TYPE:
				return validateMnType((MnType)value, diagnostics, context);
			case MlPackage.MOMENTABOUT_TYPE:
				return validateMomentaboutType((MomentaboutType)value, diagnostics, context);
			case MlPackage.MO_TYPE:
				return validateMoType((MoType)value, diagnostics, context);
			case MlPackage.MOVER_TYPE:
				return validateMoverType((MoverType)value, diagnostics, context);
			case MlPackage.MPADDED_TYPE:
				return validateMpaddedType((MpaddedType)value, diagnostics, context);
			case MlPackage.MPHANTOM_TYPE:
				return validateMphantomType((MphantomType)value, diagnostics, context);
			case MlPackage.MPRESCRIPTS_TYPE:
				return validateMprescriptsType((MprescriptsType)value, diagnostics, context);
			case MlPackage.MROOT_TYPE:
				return validateMrootType((MrootType)value, diagnostics, context);
			case MlPackage.MROW_TYPE:
				return validateMrowType((MrowType)value, diagnostics, context);
			case MlPackage.MSCARRIES_TYPE:
				return validateMscarriesType((MscarriesType)value, diagnostics, context);
			case MlPackage.MSCARRY_TYPE:
				return validateMscarryType((MscarryType)value, diagnostics, context);
			case MlPackage.MSGROUP_TYPE:
				return validateMsgroupType((MsgroupType)value, diagnostics, context);
			case MlPackage.MSLINE_TYPE:
				return validateMslineType((MslineType)value, diagnostics, context);
			case MlPackage.MSPACE_TYPE:
				return validateMspaceType((MspaceType)value, diagnostics, context);
			case MlPackage.MSQRT_TYPE:
				return validateMsqrtType((MsqrtType)value, diagnostics, context);
			case MlPackage.MSROW_TYPE:
				return validateMsrowType((MsrowType)value, diagnostics, context);
			case MlPackage.MSTACK_TYPE:
				return validateMstackType((MstackType)value, diagnostics, context);
			case MlPackage.MSTYLE_TYPE:
				return validateMstyleType((MstyleType)value, diagnostics, context);
			case MlPackage.MS_TYPE:
				return validateMsType((MsType)value, diagnostics, context);
			case MlPackage.MSUBSUP_TYPE:
				return validateMsubsupType((MsubsupType)value, diagnostics, context);
			case MlPackage.MSUB_TYPE:
				return validateMsubType((MsubType)value, diagnostics, context);
			case MlPackage.MSUP_TYPE:
				return validateMsupType((MsupType)value, diagnostics, context);
			case MlPackage.MTABLE_TYPE:
				return validateMtableType((MtableType)value, diagnostics, context);
			case MlPackage.MTEXT_TYPE:
				return validateMtextType((MtextType)value, diagnostics, context);
			case MlPackage.MTR_TYPE:
				return validateMtrType((MtrType)value, diagnostics, context);
			case MlPackage.MUNDEROVER_TYPE:
				return validateMunderoverType((MunderoverType)value, diagnostics, context);
			case MlPackage.MUNDER_TYPE:
				return validateMunderType((MunderType)value, diagnostics, context);
			case MlPackage.NARY_ARITH_CLASS_TYPE:
				return validateNaryArithClassType((NaryArithClassType)value, diagnostics, context);
			case MlPackage.NARY_CONSTRUCTOR_CLASS_TYPE:
				return validateNaryConstructorClassType((NaryConstructorClassType)value, diagnostics, context);
			case MlPackage.NARY_FUNCTIONAL_CLASS_TYPE:
				return validateNaryFunctionalClassType((NaryFunctionalClassType)value, diagnostics, context);
			case MlPackage.NARY_LINALG_CLASS_TYPE:
				return validateNaryLinalgClassType((NaryLinalgClassType)value, diagnostics, context);
			case MlPackage.NARY_LOGICAL_CLASS_TYPE:
				return validateNaryLogicalClassType((NaryLogicalClassType)value, diagnostics, context);
			case MlPackage.NARY_MINMAX_CLASS_TYPE:
				return validateNaryMinmaxClassType((NaryMinmaxClassType)value, diagnostics, context);
			case MlPackage.NARY_RELN_CLASS_TYPE:
				return validateNaryRelnClassType((NaryRelnClassType)value, diagnostics, context);
			case MlPackage.NARY_SET_CLASS_TYPE:
				return validateNarySetClassType((NarySetClassType)value, diagnostics, context);
			case MlPackage.NARY_SET_RELN_CLASS_TYPE:
				return validateNarySetRelnClassType((NarySetRelnClassType)value, diagnostics, context);
			case MlPackage.NARY_STATS_CLASS_TYPE:
				return validateNaryStatsClassType((NaryStatsClassType)value, diagnostics, context);
			case MlPackage.NEQ_TYPE:
				return validateNeqType((NeqType)value, diagnostics, context);
			case MlPackage.NONE_TYPE:
				return validateNoneType((NoneType)value, diagnostics, context);
			case MlPackage.OTHERWISE_TYPE:
				return validateOtherwiseType((OtherwiseType)value, diagnostics, context);
			case MlPackage.PARTIALDIFF_CLASS_TYPE:
				return validatePartialdiffClassType((PartialdiffClassType)value, diagnostics, context);
			case MlPackage.PIECE_TYPE:
				return validatePieceType((PieceType)value, diagnostics, context);
			case MlPackage.PIECEWISE_TYPE:
				return validatePiecewiseType((PiecewiseType)value, diagnostics, context);
			case MlPackage.POWER_TYPE:
				return validatePowerType((PowerType)value, diagnostics, context);
			case MlPackage.PRODUCT_CLASS_TYPE:
				return validateProductClassType((ProductClassType)value, diagnostics, context);
			case MlPackage.QUANTIFIER_CLASS_TYPE:
				return validateQuantifierClassType((QuantifierClassType)value, diagnostics, context);
			case MlPackage.QUOTIENT_TYPE:
				return validateQuotientType((QuotientType)value, diagnostics, context);
			case MlPackage.REAL_TYPE:
				return validateRealType((RealType)value, diagnostics, context);
			case MlPackage.RELN_TYPE:
				return validateRelnType((RelnType)value, diagnostics, context);
			case MlPackage.REM_TYPE:
				return validateRemType((RemType)value, diagnostics, context);
			case MlPackage.ROOT_TYPE:
				return validateRootType((RootType)value, diagnostics, context);
			case MlPackage.SEP_TYPE:
				return validateSepType((SepType)value, diagnostics, context);
			case MlPackage.SET_TYPE:
				return validateSetType((SetType)value, diagnostics, context);
			case MlPackage.SHARE_TYPE:
				return validateShareType((ShareType)value, diagnostics, context);
			case MlPackage.SUM_CLASS_TYPE:
				return validateSumClassType((SumClassType)value, diagnostics, context);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE:
				return validateTableCellExpressionType((TableCellExpressionType)value, diagnostics, context);
			case MlPackage.TENDSTO_TYPE:
				return validateTendstoType((TendstoType)value, diagnostics, context);
			case MlPackage.UNARY_ELEMENTARY_CLASS_TYPE:
				return validateUnaryElementaryClassType((UnaryElementaryClassType)value, diagnostics, context);
			case MlPackage.UNARY_FUNCTIONAL_CLASS_TYPE:
				return validateUnaryFunctionalClassType((UnaryFunctionalClassType)value, diagnostics, context);
			case MlPackage.UNARY_LINALG_CLASS_TYPE:
				return validateUnaryLinalgClassType((UnaryLinalgClassType)value, diagnostics, context);
			case MlPackage.UNARY_LOGICAL_CLASS_TYPE:
				return validateUnaryLogicalClassType((UnaryLogicalClassType)value, diagnostics, context);
			case MlPackage.UNARY_SET_CLASS_TYPE:
				return validateUnarySetClassType((UnarySetClassType)value, diagnostics, context);
			case MlPackage.UNARY_VECCALC_CLASS_TYPE:
				return validateUnaryVeccalcClassType((UnaryVeccalcClassType)value, diagnostics, context);
			case MlPackage.UPLIMIT_TYPE:
				return validateUplimitType((UplimitType)value, diagnostics, context);
			case MlPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE:
				return validateAccentType((AccentType)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE1:
				return validateAccentType1((AccentType1)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE2:
				return validateAccentType2((AccentType2)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE3:
				return validateAccentType3((AccentType3)value, diagnostics, context);
			case MlPackage.ACCENTUNDER_TYPE:
				return validateAccentunderType((AccentunderType)value, diagnostics, context);
			case MlPackage.ACCENTUNDER_TYPE1:
				return validateAccentunderType1((AccentunderType1)value, diagnostics, context);
			case MlPackage.ACCENTUNDER_TYPE2:
				return validateAccentunderType2((AccentunderType2)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM:
				return validateAlignmentscopeTypeBaseItem((AlignmentscopeTypeBaseItem)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM1:
				return validateAlignmentscopeTypeBaseItem1((AlignmentscopeTypeBaseItem1)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE:
				return validateAlignType((AlignType)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE1:
				return validateAlignType1((AlignType1)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE2:
				return validateAlignType2((AlignType2)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE5:
				return validateAlignType5((AlignType5)value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER1:
				return validateAltimgValignTypeMember1((AltimgValignTypeMember1)value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER2:
				return validateAltimgValignTypeMember2((AltimgValignTypeMember2)value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER3:
				return validateAltimgValignTypeMember3((AltimgValignTypeMember3)value, diagnostics, context);
			case MlPackage.BACKGROUND_TYPE_MEMBER1:
				return validateBackgroundTypeMember1((BackgroundTypeMember1)value, diagnostics, context);
			case MlPackage.BEVELLED_TYPE:
				return validateBevelledType((BevelledType)value, diagnostics, context);
			case MlPackage.BEVELLED_TYPE1:
				return validateBevelledType1((BevelledType1)value, diagnostics, context);
			case MlPackage.CHARALIGN_TYPE:
				return validateCharalignType((CharalignType)value, diagnostics, context);
			case MlPackage.CHARALIGN_TYPE1:
				return validateCharalignType1((CharalignType1)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER1:
				return validateCharspacingTypeMember1((CharspacingTypeMember1)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER11:
				return validateCharspacingTypeMember11((CharspacingTypeMember11)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER2:
				return validateCharspacingTypeMember2((CharspacingTypeMember2)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER21:
				return validateCharspacingTypeMember21((CharspacingTypeMember21)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER3:
				return validateCharspacingTypeMember3((CharspacingTypeMember3)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER31:
				return validateCharspacingTypeMember31((CharspacingTypeMember31)value, diagnostics, context);
			case MlPackage.COLUMNALIGNSTYLE:
				return validateColumnalignstyle((Columnalignstyle)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1:
				return validateColumnwidthTypeBaseItemMember1((ColumnwidthTypeBaseItemMember1)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER11:
				return validateColumnwidthTypeBaseItemMember11((ColumnwidthTypeBaseItemMember11)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2:
				return validateColumnwidthTypeBaseItemMember2((ColumnwidthTypeBaseItemMember2)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER21:
				return validateColumnwidthTypeBaseItemMember21((ColumnwidthTypeBaseItemMember21)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE_ITEM:
				return validateCrossoutTypeItem((CrossoutTypeItem)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE_ITEM1:
				return validateCrossoutTypeItem1((CrossoutTypeItem1)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE_ITEM2:
				return validateCrossoutTypeItem2((CrossoutTypeItem2)value, diagnostics, context);
			case MlPackage.DENOMALIGN_TYPE:
				return validateDenomalignType((DenomalignType)value, diagnostics, context);
			case MlPackage.DENOMALIGN_TYPE1:
				return validateDenomalignType1((DenomalignType1)value, diagnostics, context);
			case MlPackage.DIR_TYPE:
				return validateDirType((DirType)value, diagnostics, context);
			case MlPackage.DIR_TYPE1:
				return validateDirType1((DirType1)value, diagnostics, context);
			case MlPackage.DIR_TYPE2:
				return validateDirType2((DirType2)value, diagnostics, context);
			case MlPackage.DISPLAYSTYLE_TYPE:
				return validateDisplaystyleType((DisplaystyleType)value, diagnostics, context);
			case MlPackage.DISPLAYSTYLE_TYPE1:
				return validateDisplaystyleType1((DisplaystyleType1)value, diagnostics, context);
			case MlPackage.DISPLAY_TYPE:
				return validateDisplayType((DisplayType)value, diagnostics, context);
			case MlPackage.EDGE_TYPE:
				return validateEdgeType((EdgeType)value, diagnostics, context);
			case MlPackage.EDGE_TYPE1:
				return validateEdgeType1((EdgeType1)value, diagnostics, context);
			case MlPackage.EQUALCOLUMNS_TYPE:
				return validateEqualcolumnsType((EqualcolumnsType)value, diagnostics, context);
			case MlPackage.EQUALCOLUMNS_TYPE1:
				return validateEqualcolumnsType1((EqualcolumnsType1)value, diagnostics, context);
			case MlPackage.EQUALROWS_TYPE:
				return validateEqualrowsType((EqualrowsType)value, diagnostics, context);
			case MlPackage.EQUALROWS_TYPE1:
				return validateEqualrowsType1((EqualrowsType1)value, diagnostics, context);
			case MlPackage.FENCE_TYPE:
				return validateFenceType((FenceType)value, diagnostics, context);
			case MlPackage.FENCE_TYPE1:
				return validateFenceType1((FenceType1)value, diagnostics, context);
			case MlPackage.FONTSTYLE_TYPE:
				return validateFontstyleType((FontstyleType)value, diagnostics, context);
			case MlPackage.FONTWEIGHT_TYPE:
				return validateFontweightType((FontweightType)value, diagnostics, context);
			case MlPackage.FORM_TYPE:
				return validateFormType((FormType)value, diagnostics, context);
			case MlPackage.FORM_TYPE1:
				return validateFormType1((FormType1)value, diagnostics, context);
			case MlPackage.GROUP_ALIGNMENT:
				return validateGroupAlignment((GroupAlignment)value, diagnostics, context);
			case MlPackage.GROUPALIGN_TYPE:
				return validateGroupalignType((GroupalignType)value, diagnostics, context);
			case MlPackage.INDENTALIGNFIRST_TYPE:
				return validateIndentalignfirstType((IndentalignfirstType)value, diagnostics, context);
			case MlPackage.INDENTALIGNFIRST_TYPE1:
				return validateIndentalignfirstType1((IndentalignfirstType1)value, diagnostics, context);
			case MlPackage.INDENTALIGNFIRST_TYPE2:
				return validateIndentalignfirstType2((IndentalignfirstType2)value, diagnostics, context);
			case MlPackage.INDENTALIGNLAST_TYPE:
				return validateIndentalignlastType((IndentalignlastType)value, diagnostics, context);
			case MlPackage.INDENTALIGNLAST_TYPE1:
				return validateIndentalignlastType1((IndentalignlastType1)value, diagnostics, context);
			case MlPackage.INDENTALIGNLAST_TYPE2:
				return validateIndentalignlastType2((IndentalignlastType2)value, diagnostics, context);
			case MlPackage.INDENTALIGN_TYPE:
				return validateIndentalignType((IndentalignType)value, diagnostics, context);
			case MlPackage.INDENTALIGN_TYPE1:
				return validateIndentalignType1((IndentalignType1)value, diagnostics, context);
			case MlPackage.INDENTALIGN_TYPE2:
				return validateIndentalignType2((IndentalignType2)value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1:
				return validateIndentshiftfirstTypeMember1((IndentshiftfirstTypeMember1)value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER11:
				return validateIndentshiftfirstTypeMember11((IndentshiftfirstTypeMember11)value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER12:
				return validateIndentshiftfirstTypeMember12((IndentshiftfirstTypeMember12)value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1:
				return validateIndentshiftlastTypeMember1((IndentshiftlastTypeMember1)value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER11:
				return validateIndentshiftlastTypeMember11((IndentshiftlastTypeMember11)value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER12:
				return validateIndentshiftlastTypeMember12((IndentshiftlastTypeMember12)value, diagnostics, context);
			case MlPackage.INFIXLINEBREAKSTYLE_TYPE:
				return validateInfixlinebreakstyleType((InfixlinebreakstyleType)value, diagnostics, context);
			case MlPackage.LARGEOP_TYPE:
				return validateLargeopType((LargeopType)value, diagnostics, context);
			case MlPackage.LARGEOP_TYPE1:
				return validateLargeopType1((LargeopType1)value, diagnostics, context);
			case MlPackage.LINEBREAKSTYLE_TYPE:
				return validateLinebreakstyleType((LinebreakstyleType)value, diagnostics, context);
			case MlPackage.LINEBREAKSTYLE_TYPE1:
				return validateLinebreakstyleType1((LinebreakstyleType1)value, diagnostics, context);
			case MlPackage.LINEBREAK_TYPE:
				return validateLinebreakType((LinebreakType)value, diagnostics, context);
			case MlPackage.LINEBREAK_TYPE1:
				return validateLinebreakType1((LinebreakType1)value, diagnostics, context);
			case MlPackage.LINEBREAK_TYPE2:
				return validateLinebreakType2((LinebreakType2)value, diagnostics, context);
			case MlPackage.LINESTYLE:
				return validateLinestyle((Linestyle)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1:
				return validateLinethicknessTypeMember1((LinethicknessTypeMember1)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER11:
				return validateLinethicknessTypeMember11((LinethicknessTypeMember11)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2:
				return validateLinethicknessTypeMember2((LinethicknessTypeMember2)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER21:
				return validateLinethicknessTypeMember21((LinethicknessTypeMember21)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3:
				return validateLinethicknessTypeMember3((LinethicknessTypeMember3)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER31:
				return validateLinethicknessTypeMember31((LinethicknessTypeMember31)value, diagnostics, context);
			case MlPackage.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case MlPackage.LOCATION_TYPE1:
				return validateLocationType1((LocationType1)value, diagnostics, context);
			case MlPackage.LOCATION_TYPE2:
				return validateLocationType2((LocationType2)value, diagnostics, context);
			case MlPackage.LONGDIVSTYLE_TYPE:
				return validateLongdivstyleType((LongdivstyleType)value, diagnostics, context);
			case MlPackage.LONGDIVSTYLE_TYPE1:
				return validateLongdivstyleType1((LongdivstyleType1)value, diagnostics, context);
			case MlPackage.MATHBACKGROUND_TYPE_MEMBER1:
				return validateMathbackgroundTypeMember1((MathbackgroundTypeMember1)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER1:
				return validateMathsizeTypeMember1((MathsizeTypeMember1)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER11:
				return validateMathsizeTypeMember11((MathsizeTypeMember11)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER12:
				return validateMathsizeTypeMember12((MathsizeTypeMember12)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER2:
				return validateMathsizeTypeMember2((MathsizeTypeMember2)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER21:
				return validateMathsizeTypeMember21((MathsizeTypeMember21)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER22:
				return validateMathsizeTypeMember22((MathsizeTypeMember22)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER3:
				return validateMathsizeTypeMember3((MathsizeTypeMember3)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER31:
				return validateMathsizeTypeMember31((MathsizeTypeMember31)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER32:
				return validateMathsizeTypeMember32((MathsizeTypeMember32)value, diagnostics, context);
			case MlPackage.MATHVARIANT_TYPE:
				return validateMathvariantType((MathvariantType)value, diagnostics, context);
			case MlPackage.MATHVARIANT_TYPE1:
				return validateMathvariantType1((MathvariantType1)value, diagnostics, context);
			case MlPackage.MATHVARIANT_TYPE2:
				return validateMathvariantType2((MathvariantType2)value, diagnostics, context);
			case MlPackage.MAXSIZE_TYPE_MEMBER1:
				return validateMaxsizeTypeMember1((MaxsizeTypeMember1)value, diagnostics, context);
			case MlPackage.MAXSIZE_TYPE_MEMBER11:
				return validateMaxsizeTypeMember11((MaxsizeTypeMember11)value, diagnostics, context);
			case MlPackage.MOVABLELIMITS_TYPE:
				return validateMovablelimitsType((MovablelimitsType)value, diagnostics, context);
			case MlPackage.MOVABLELIMITS_TYPE1:
				return validateMovablelimitsType1((MovablelimitsType1)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1:
				return validateMslinethicknessTypeMember1((MslinethicknessTypeMember1)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER11:
				return validateMslinethicknessTypeMember11((MslinethicknessTypeMember11)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2:
				return validateMslinethicknessTypeMember2((MslinethicknessTypeMember2)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER21:
				return validateMslinethicknessTypeMember21((MslinethicknessTypeMember21)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3:
				return validateMslinethicknessTypeMember3((MslinethicknessTypeMember3)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER31:
				return validateMslinethicknessTypeMember31((MslinethicknessTypeMember31)value, diagnostics, context);
			case MlPackage.NOTATIONSTYLE:
				return validateNotationstyle((Notationstyle)value, diagnostics, context);
			case MlPackage.NUMALIGN_TYPE:
				return validateNumalignType((NumalignType)value, diagnostics, context);
			case MlPackage.NUMALIGN_TYPE1:
				return validateNumalignType1((NumalignType1)value, diagnostics, context);
			case MlPackage.OCCURRENCE_TYPE:
				return validateOccurrenceType((OccurrenceType)value, diagnostics, context);
			case MlPackage.ORDER_TYPE:
				return validateOrderType((OrderType)value, diagnostics, context);
			case MlPackage.OVERFLOW_TYPE:
				return validateOverflowType((OverflowType)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE:
				return validateRowalignType((RowalignType)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE2:
				return validateRowalignType2((RowalignType2)value, diagnostics, context);
			case MlPackage.SEPARATOR_TYPE:
				return validateSeparatorType((SeparatorType)value, diagnostics, context);
			case MlPackage.SEPARATOR_TYPE1:
				return validateSeparatorType1((SeparatorType1)value, diagnostics, context);
			case MlPackage.SIDE_TYPE:
				return validateSideType((SideType)value, diagnostics, context);
			case MlPackage.SIDE_TYPE1:
				return validateSideType1((SideType1)value, diagnostics, context);
			case MlPackage.STACKALIGN_TYPE:
				return validateStackalignType((StackalignType)value, diagnostics, context);
			case MlPackage.STACKALIGN_TYPE1:
				return validateStackalignType1((StackalignType1)value, diagnostics, context);
			case MlPackage.STRETCHY_TYPE:
				return validateStretchyType((StretchyType)value, diagnostics, context);
			case MlPackage.STRETCHY_TYPE1:
				return validateStretchyType1((StretchyType1)value, diagnostics, context);
			case MlPackage.SYMMETRIC_TYPE:
				return validateSymmetricType((SymmetricType)value, diagnostics, context);
			case MlPackage.SYMMETRIC_TYPE1:
				return validateSymmetricType1((SymmetricType1)value, diagnostics, context);
			case MlPackage.VERTICALALIGN:
				return validateVerticalalign((Verticalalign)value, diagnostics, context);
			case MlPackage.WIDTH_TYPE_MEMBER1:
				return validateWidthTypeMember1((WidthTypeMember1)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE_OBJECT:
				return validateAccentTypeObject((AccentType)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE_OBJECT1:
				return validateAccentTypeObject1((AccentType1)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE_OBJECT2:
				return validateAccentTypeObject2((AccentType2)value, diagnostics, context);
			case MlPackage.ACCENT_TYPE_OBJECT3:
				return validateAccentTypeObject3((AccentType3)value, diagnostics, context);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT:
				return validateAccentunderTypeObject((AccentunderType1)value, diagnostics, context);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT1:
				return validateAccentunderTypeObject1((AccentunderType)value, diagnostics, context);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT2:
				return validateAccentunderTypeObject2((AccentunderType2)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE:
				return validateAlignmentscopeType((List<?>)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE1:
				return validateAlignmentscopeType1((List<?>)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE:
				return validateAlignmentscopeTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE1:
				return validateAlignmentscopeTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM_OBJECT:
				return validateAlignmentscopeTypeBaseItemObject((AlignmentscopeTypeBaseItem)value, diagnostics, context);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM_OBJECT1:
				return validateAlignmentscopeTypeBaseItemObject1((AlignmentscopeTypeBaseItem1)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE3:
				return validateAlignType3((String)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE4:
				return validateAlignType4((String)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE_OBJECT:
				return validateAlignTypeObject((AlignType)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE_OBJECT1:
				return validateAlignTypeObject1((AlignType2)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE_OBJECT2:
				return validateAlignTypeObject2((AlignType1)value, diagnostics, context);
			case MlPackage.ALIGN_TYPE_OBJECT3:
				return validateAlignTypeObject3((AlignType5)value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE:
				return validateAltimgValignType(value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER1_OBJECT:
				return validateAltimgValignTypeMember1Object((AltimgValignTypeMember1)value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER2_OBJECT:
				return validateAltimgValignTypeMember2Object((AltimgValignTypeMember2)value, diagnostics, context);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER3_OBJECT:
				return validateAltimgValignTypeMember3Object((AltimgValignTypeMember3)value, diagnostics, context);
			case MlPackage.BACKGROUND_TYPE:
				return validateBackgroundType(value, diagnostics, context);
			case MlPackage.BACKGROUND_TYPE_MEMBER1_OBJECT:
				return validateBackgroundTypeMember1Object((BackgroundTypeMember1)value, diagnostics, context);
			case MlPackage.BASE64:
				return validateBase64((byte[])value, diagnostics, context);
			case MlPackage.BEVELLED_TYPE_OBJECT:
				return validateBevelledTypeObject((BevelledType)value, diagnostics, context);
			case MlPackage.BEVELLED_TYPE_OBJECT1:
				return validateBevelledTypeObject1((BevelledType1)value, diagnostics, context);
			case MlPackage.CHARACTER:
				return validateCharacter((String)value, diagnostics, context);
			case MlPackage.CHARALIGN_TYPE_OBJECT:
				return validateCharalignTypeObject((CharalignType)value, diagnostics, context);
			case MlPackage.CHARALIGN_TYPE_OBJECT1:
				return validateCharalignTypeObject1((CharalignType1)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE:
				return validateCharspacingType(value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE1:
				return validateCharspacingType1(value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER1_OBJECT:
				return validateCharspacingTypeMember1Object((CharspacingTypeMember1)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER1_OBJECT1:
				return validateCharspacingTypeMember1Object1((CharspacingTypeMember11)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER2_OBJECT:
				return validateCharspacingTypeMember2Object((CharspacingTypeMember2)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER2_OBJECT1:
				return validateCharspacingTypeMember2Object1((CharspacingTypeMember21)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER3_OBJECT:
				return validateCharspacingTypeMember3Object((CharspacingTypeMember3)value, diagnostics, context);
			case MlPackage.CHARSPACING_TYPE_MEMBER3_OBJECT1:
				return validateCharspacingTypeMember3Object1((CharspacingTypeMember31)value, diagnostics, context);
			case MlPackage.COLOR:
				return validateColor((String)value, diagnostics, context);
			case MlPackage.COLUMNALIGNSTYLE_OBJECT:
				return validateColumnalignstyleObject((Columnalignstyle)value, diagnostics, context);
			case MlPackage.COLUMNALIGN_TYPE:
				return validateColumnalignType((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNALIGN_TYPE1:
				return validateColumnalignType1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNALIGN_TYPE2:
				return validateColumnalignType2((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNALIGN_TYPE_BASE:
				return validateColumnalignTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNALIGN_TYPE_BASE1:
				return validateColumnalignTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNALIGN_TYPE_BASE2:
				return validateColumnalignTypeBase2((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNLINES_TYPE:
				return validateColumnlinesType((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNLINES_TYPE1:
				return validateColumnlinesType1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNLINES_TYPE_BASE:
				return validateColumnlinesTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNLINES_TYPE_BASE1:
				return validateColumnlinesTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNSPACING_TYPE:
				return validateColumnspacingType((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNSPACING_TYPE1:
				return validateColumnspacingType1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNSPACING_TYPE_BASE:
				return validateColumnspacingTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNSPACING_TYPE_BASE1:
				return validateColumnspacingTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE:
				return validateColumnwidthType((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE1:
				return validateColumnwidthType1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE:
				return validateColumnwidthTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE1:
				return validateColumnwidthTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM:
				return validateColumnwidthTypeBaseItem(value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM1:
				return validateColumnwidthTypeBaseItem1(value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1_OBJECT:
				return validateColumnwidthTypeBaseItemMember1Object((ColumnwidthTypeBaseItemMember1)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1_OBJECT1:
				return validateColumnwidthTypeBaseItemMember1Object1((ColumnwidthTypeBaseItemMember11)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2_OBJECT:
				return validateColumnwidthTypeBaseItemMember2Object((ColumnwidthTypeBaseItemMember2)value, diagnostics, context);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2_OBJECT1:
				return validateColumnwidthTypeBaseItemMember2Object1((ColumnwidthTypeBaseItemMember21)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE:
				return validateCrossoutType((List<?>)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE1:
				return validateCrossoutType1((List<?>)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE2:
				return validateCrossoutType2((List<?>)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT:
				return validateCrossoutTypeItemObject((CrossoutTypeItem)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT1:
				return validateCrossoutTypeItemObject1((CrossoutTypeItem1)value, diagnostics, context);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT2:
				return validateCrossoutTypeItemObject2((CrossoutTypeItem2)value, diagnostics, context);
			case MlPackage.DENOMALIGN_TYPE_OBJECT:
				return validateDenomalignTypeObject((DenomalignType)value, diagnostics, context);
			case MlPackage.DENOMALIGN_TYPE_OBJECT1:
				return validateDenomalignTypeObject1((DenomalignType1)value, diagnostics, context);
			case MlPackage.DIR_TYPE_OBJECT:
				return validateDirTypeObject((DirType)value, diagnostics, context);
			case MlPackage.DIR_TYPE_OBJECT1:
				return validateDirTypeObject1((DirType1)value, diagnostics, context);
			case MlPackage.DIR_TYPE_OBJECT2:
				return validateDirTypeObject2((DirType2)value, diagnostics, context);
			case MlPackage.DISPLAYSTYLE_TYPE_OBJECT:
				return validateDisplaystyleTypeObject((DisplaystyleType)value, diagnostics, context);
			case MlPackage.DISPLAYSTYLE_TYPE_OBJECT1:
				return validateDisplaystyleTypeObject1((DisplaystyleType1)value, diagnostics, context);
			case MlPackage.DISPLAY_TYPE_OBJECT:
				return validateDisplayTypeObject((DisplayType)value, diagnostics, context);
			case MlPackage.EDGE_TYPE_OBJECT:
				return validateEdgeTypeObject((EdgeType)value, diagnostics, context);
			case MlPackage.EDGE_TYPE_OBJECT1:
				return validateEdgeTypeObject1((EdgeType1)value, diagnostics, context);
			case MlPackage.EQUALCOLUMNS_TYPE_OBJECT:
				return validateEqualcolumnsTypeObject((EqualcolumnsType)value, diagnostics, context);
			case MlPackage.EQUALCOLUMNS_TYPE_OBJECT1:
				return validateEqualcolumnsTypeObject1((EqualcolumnsType1)value, diagnostics, context);
			case MlPackage.EQUALROWS_TYPE_OBJECT:
				return validateEqualrowsTypeObject((EqualrowsType)value, diagnostics, context);
			case MlPackage.EQUALROWS_TYPE_OBJECT1:
				return validateEqualrowsTypeObject1((EqualrowsType1)value, diagnostics, context);
			case MlPackage.FENCE_TYPE_OBJECT:
				return validateFenceTypeObject((FenceType)value, diagnostics, context);
			case MlPackage.FENCE_TYPE_OBJECT1:
				return validateFenceTypeObject1((FenceType1)value, diagnostics, context);
			case MlPackage.FONTSTYLE_TYPE_OBJECT:
				return validateFontstyleTypeObject((FontstyleType)value, diagnostics, context);
			case MlPackage.FONTWEIGHT_TYPE_OBJECT:
				return validateFontweightTypeObject((FontweightType)value, diagnostics, context);
			case MlPackage.FORM_TYPE_OBJECT:
				return validateFormTypeObject((FormType)value, diagnostics, context);
			case MlPackage.FORM_TYPE_OBJECT1:
				return validateFormTypeObject1((FormType1)value, diagnostics, context);
			case MlPackage.FRAMESPACING_TYPE:
				return validateFramespacingType((List<?>)value, diagnostics, context);
			case MlPackage.FRAMESPACING_TYPE1:
				return validateFramespacingType1((List<?>)value, diagnostics, context);
			case MlPackage.FRAMESPACING_TYPE_BASE:
				return validateFramespacingTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.FRAMESPACING_TYPE_BASE1:
				return validateFramespacingTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.FRAMESPACING_TYPE_BASE_ITEM:
				return validateFramespacingTypeBaseItem((String)value, diagnostics, context);
			case MlPackage.FRAMESPACING_TYPE_BASE_ITEM1:
				return validateFramespacingTypeBaseItem1((String)value, diagnostics, context);
			case MlPackage.GROUP_ALIGNMENT_LIST:
				return validateGroupAlignmentList((List<?>)value, diagnostics, context);
			case MlPackage.GROUP_ALIGNMENT_LIST_BASE:
				return validateGroupAlignmentListBase((List<?>)value, diagnostics, context);
			case MlPackage.GROUP_ALIGNMENT_LIST_LIST:
				return validateGroupAlignmentListList((String)value, diagnostics, context);
			case MlPackage.GROUP_ALIGNMENT_OBJECT:
				return validateGroupAlignmentObject((GroupAlignment)value, diagnostics, context);
			case MlPackage.GROUPALIGN_TYPE_OBJECT:
				return validateGroupalignTypeObject((GroupalignType)value, diagnostics, context);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT:
				return validateIndentalignfirstTypeObject((IndentalignfirstType)value, diagnostics, context);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT1:
				return validateIndentalignfirstTypeObject1((IndentalignfirstType1)value, diagnostics, context);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT2:
				return validateIndentalignfirstTypeObject2((IndentalignfirstType2)value, diagnostics, context);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT:
				return validateIndentalignlastTypeObject((IndentalignlastType)value, diagnostics, context);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT1:
				return validateIndentalignlastTypeObject1((IndentalignlastType1)value, diagnostics, context);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT2:
				return validateIndentalignlastTypeObject2((IndentalignlastType2)value, diagnostics, context);
			case MlPackage.INDENTALIGN_TYPE_OBJECT:
				return validateIndentalignTypeObject((IndentalignType)value, diagnostics, context);
			case MlPackage.INDENTALIGN_TYPE_OBJECT1:
				return validateIndentalignTypeObject1((IndentalignType1)value, diagnostics, context);
			case MlPackage.INDENTALIGN_TYPE_OBJECT2:
				return validateIndentalignTypeObject2((IndentalignType2)value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE:
				return validateIndentshiftfirstType(value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE1:
				return validateIndentshiftfirstType1(value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE2:
				return validateIndentshiftfirstType2(value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT:
				return validateIndentshiftfirstTypeMember1Object((IndentshiftfirstTypeMember11)value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT1:
				return validateIndentshiftfirstTypeMember1Object1((IndentshiftfirstTypeMember1)value, diagnostics, context);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT2:
				return validateIndentshiftfirstTypeMember1Object2((IndentshiftfirstTypeMember12)value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE:
				return validateIndentshiftlastType(value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE1:
				return validateIndentshiftlastType1(value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE2:
				return validateIndentshiftlastType2(value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT:
				return validateIndentshiftlastTypeMember1Object((IndentshiftlastTypeMember1)value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT1:
				return validateIndentshiftlastTypeMember1Object1((IndentshiftlastTypeMember11)value, diagnostics, context);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT2:
				return validateIndentshiftlastTypeMember1Object2((IndentshiftlastTypeMember12)value, diagnostics, context);
			case MlPackage.INFIXLINEBREAKSTYLE_TYPE_OBJECT:
				return validateInfixlinebreakstyleTypeObject((InfixlinebreakstyleType)value, diagnostics, context);
			case MlPackage.INTEGER:
				return validateInteger((BigInteger)value, diagnostics, context);
			case MlPackage.LARGEOP_TYPE_OBJECT:
				return validateLargeopTypeObject((LargeopType)value, diagnostics, context);
			case MlPackage.LARGEOP_TYPE_OBJECT1:
				return validateLargeopTypeObject1((LargeopType1)value, diagnostics, context);
			case MlPackage.LENGTH:
				return validateLength((String)value, diagnostics, context);
			case MlPackage.LINEBREAKSTYLE_TYPE_OBJECT:
				return validateLinebreakstyleTypeObject((LinebreakstyleType)value, diagnostics, context);
			case MlPackage.LINEBREAKSTYLE_TYPE_OBJECT1:
				return validateLinebreakstyleTypeObject1((LinebreakstyleType1)value, diagnostics, context);
			case MlPackage.LINEBREAK_TYPE_OBJECT:
				return validateLinebreakTypeObject((LinebreakType)value, diagnostics, context);
			case MlPackage.LINEBREAK_TYPE_OBJECT1:
				return validateLinebreakTypeObject1((LinebreakType1)value, diagnostics, context);
			case MlPackage.LINEBREAK_TYPE_OBJECT2:
				return validateLinebreakTypeObject2((LinebreakType2)value, diagnostics, context);
			case MlPackage.LINESTYLE_OBJECT:
				return validateLinestyleObject((Linestyle)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE:
				return validateLinethicknessType(value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE1:
				return validateLinethicknessType1(value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1_OBJECT:
				return validateLinethicknessTypeMember1Object((LinethicknessTypeMember1)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1_OBJECT1:
				return validateLinethicknessTypeMember1Object1((LinethicknessTypeMember11)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2_OBJECT:
				return validateLinethicknessTypeMember2Object((LinethicknessTypeMember2)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2_OBJECT1:
				return validateLinethicknessTypeMember2Object1((LinethicknessTypeMember21)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3_OBJECT:
				return validateLinethicknessTypeMember3Object((LinethicknessTypeMember3)value, diagnostics, context);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3_OBJECT1:
				return validateLinethicknessTypeMember3Object1((LinethicknessTypeMember31)value, diagnostics, context);
			case MlPackage.LOCATION_TYPE_OBJECT:
				return validateLocationTypeObject((LocationType)value, diagnostics, context);
			case MlPackage.LOCATION_TYPE_OBJECT1:
				return validateLocationTypeObject1((LocationType1)value, diagnostics, context);
			case MlPackage.LOCATION_TYPE_OBJECT2:
				return validateLocationTypeObject2((LocationType2)value, diagnostics, context);
			case MlPackage.LONGDIVSTYLE_TYPE_OBJECT:
				return validateLongdivstyleTypeObject((LongdivstyleType)value, diagnostics, context);
			case MlPackage.LONGDIVSTYLE_TYPE_OBJECT1:
				return validateLongdivstyleTypeObject1((LongdivstyleType1)value, diagnostics, context);
			case MlPackage.MATHBACKGROUND_TYPE:
				return validateMathbackgroundType(value, diagnostics, context);
			case MlPackage.MATHBACKGROUND_TYPE_MEMBER1_OBJECT:
				return validateMathbackgroundTypeMember1Object((MathbackgroundTypeMember1)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE:
				return validateMathsizeType(value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE1:
				return validateMathsizeType1(value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE2:
				return validateMathsizeType2(value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT:
				return validateMathsizeTypeMember1Object((MathsizeTypeMember1)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT1:
				return validateMathsizeTypeMember1Object1((MathsizeTypeMember11)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT2:
				return validateMathsizeTypeMember1Object2((MathsizeTypeMember12)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT:
				return validateMathsizeTypeMember2Object((MathsizeTypeMember2)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT1:
				return validateMathsizeTypeMember2Object1((MathsizeTypeMember21)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT2:
				return validateMathsizeTypeMember2Object2((MathsizeTypeMember22)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT:
				return validateMathsizeTypeMember3Object((MathsizeTypeMember3)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT1:
				return validateMathsizeTypeMember3Object1((MathsizeTypeMember31)value, diagnostics, context);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT2:
				return validateMathsizeTypeMember3Object2((MathsizeTypeMember32)value, diagnostics, context);
			case MlPackage.MATHVARIANT_TYPE_OBJECT:
				return validateMathvariantTypeObject((MathvariantType1)value, diagnostics, context);
			case MlPackage.MATHVARIANT_TYPE_OBJECT1:
				return validateMathvariantTypeObject1((MathvariantType)value, diagnostics, context);
			case MlPackage.MATHVARIANT_TYPE_OBJECT2:
				return validateMathvariantTypeObject2((MathvariantType2)value, diagnostics, context);
			case MlPackage.MAXSIZE_TYPE:
				return validateMaxsizeType(value, diagnostics, context);
			case MlPackage.MAXSIZE_TYPE1:
				return validateMaxsizeType1(value, diagnostics, context);
			case MlPackage.MAXSIZE_TYPE_MEMBER1_OBJECT:
				return validateMaxsizeTypeMember1Object((MaxsizeTypeMember1)value, diagnostics, context);
			case MlPackage.MAXSIZE_TYPE_MEMBER1_OBJECT1:
				return validateMaxsizeTypeMember1Object1((MaxsizeTypeMember11)value, diagnostics, context);
			case MlPackage.MOVABLELIMITS_TYPE_OBJECT:
				return validateMovablelimitsTypeObject((MovablelimitsType)value, diagnostics, context);
			case MlPackage.MOVABLELIMITS_TYPE_OBJECT1:
				return validateMovablelimitsTypeObject1((MovablelimitsType1)value, diagnostics, context);
			case MlPackage.MPADDED_LENGTH:
				return validateMpaddedLength((String)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE:
				return validateMslinethicknessType(value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE1:
				return validateMslinethicknessType1(value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1_OBJECT:
				return validateMslinethicknessTypeMember1Object((MslinethicknessTypeMember1)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1_OBJECT1:
				return validateMslinethicknessTypeMember1Object1((MslinethicknessTypeMember11)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2_OBJECT:
				return validateMslinethicknessTypeMember2Object((MslinethicknessTypeMember2)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2_OBJECT1:
				return validateMslinethicknessTypeMember2Object1((MslinethicknessTypeMember21)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3_OBJECT:
				return validateMslinethicknessTypeMember3Object((MslinethicknessTypeMember3)value, diagnostics, context);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3_OBJECT1:
				return validateMslinethicknessTypeMember3Object1((MslinethicknessTypeMember31)value, diagnostics, context);
			case MlPackage.NOTATIONSTYLE_OBJECT:
				return validateNotationstyleObject((Notationstyle)value, diagnostics, context);
			case MlPackage.NUMALIGN_TYPE_OBJECT:
				return validateNumalignTypeObject((NumalignType)value, diagnostics, context);
			case MlPackage.NUMALIGN_TYPE_OBJECT1:
				return validateNumalignTypeObject1((NumalignType1)value, diagnostics, context);
			case MlPackage.NUMBER:
				return validateNumber((BigDecimal)value, diagnostics, context);
			case MlPackage.OCCURRENCE_TYPE_OBJECT:
				return validateOccurrenceTypeObject((OccurrenceType)value, diagnostics, context);
			case MlPackage.ORDER_TYPE_OBJECT:
				return validateOrderTypeObject((OrderType)value, diagnostics, context);
			case MlPackage.OVERFLOW_TYPE_OBJECT:
				return validateOverflowTypeObject((OverflowType)value, diagnostics, context);
			case MlPackage.POSITIVE_INTEGER:
				return validatePositiveInteger((BigInteger)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE1:
				return validateRowalignType1((List<?>)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE3:
				return validateRowalignType3((List<?>)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE_BASE:
				return validateRowalignTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE_BASE1:
				return validateRowalignTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE_OBJECT:
				return validateRowalignTypeObject((RowalignType)value, diagnostics, context);
			case MlPackage.ROWALIGN_TYPE_OBJECT1:
				return validateRowalignTypeObject1((RowalignType2)value, diagnostics, context);
			case MlPackage.ROWLINES_TYPE:
				return validateRowlinesType((List<?>)value, diagnostics, context);
			case MlPackage.ROWLINES_TYPE1:
				return validateRowlinesType1((List<?>)value, diagnostics, context);
			case MlPackage.ROWLINES_TYPE_BASE:
				return validateRowlinesTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.ROWLINES_TYPE_BASE1:
				return validateRowlinesTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.ROWSPACING_TYPE:
				return validateRowspacingType((List<?>)value, diagnostics, context);
			case MlPackage.ROWSPACING_TYPE1:
				return validateRowspacingType1((List<?>)value, diagnostics, context);
			case MlPackage.ROWSPACING_TYPE_BASE:
				return validateRowspacingTypeBase((List<?>)value, diagnostics, context);
			case MlPackage.ROWSPACING_TYPE_BASE1:
				return validateRowspacingTypeBase1((List<?>)value, diagnostics, context);
			case MlPackage.SEPARATOR_TYPE_OBJECT:
				return validateSeparatorTypeObject((SeparatorType)value, diagnostics, context);
			case MlPackage.SEPARATOR_TYPE_OBJECT1:
				return validateSeparatorTypeObject1((SeparatorType1)value, diagnostics, context);
			case MlPackage.SIDE_TYPE_OBJECT:
				return validateSideTypeObject((SideType)value, diagnostics, context);
			case MlPackage.SIDE_TYPE_OBJECT1:
				return validateSideTypeObject1((SideType1)value, diagnostics, context);
			case MlPackage.STACKALIGN_TYPE_OBJECT:
				return validateStackalignTypeObject((StackalignType)value, diagnostics, context);
			case MlPackage.STACKALIGN_TYPE_OBJECT1:
				return validateStackalignTypeObject1((StackalignType1)value, diagnostics, context);
			case MlPackage.STRETCHY_TYPE_OBJECT:
				return validateStretchyTypeObject((StretchyType)value, diagnostics, context);
			case MlPackage.STRETCHY_TYPE_OBJECT1:
				return validateStretchyTypeObject1((StretchyType1)value, diagnostics, context);
			case MlPackage.SYMBOL_NAME:
				return validateSymbolName((String)value, diagnostics, context);
			case MlPackage.SYMMETRIC_TYPE_OBJECT:
				return validateSymmetricTypeObject((SymmetricType)value, diagnostics, context);
			case MlPackage.SYMMETRIC_TYPE_OBJECT1:
				return validateSymmetricTypeObject1((SymmetricType1)value, diagnostics, context);
			case MlPackage.UNSIGNED_INTEGER:
				return validateUnsignedInteger((BigInteger)value, diagnostics, context);
			case MlPackage.VERTICALALIGN_OBJECT:
				return validateVerticalalignObject((Verticalalign)value, diagnostics, context);
			case MlPackage.WIDTH_TYPE:
				return validateWidthType(value, diagnostics, context);
			case MlPackage.WIDTH_TYPE_MEMBER1_OBJECT:
				return validateWidthTypeMember1Object((WidthTypeMember1)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsType(AbsType absType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationType(AnnotationType annotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationXmlModel(AnnotationXmlModel annotationXmlModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationXmlModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationXmlType(AnnotationXmlType annotationXmlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationXmlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyContent(ApplyContent applyContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applyContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyType(ApplyType applyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApproxType(ApproxType approxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgType(ArgType argType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryLinalgClassType(BinaryLinalgClassType binaryLinalgClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryLinalgClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryLogicalClassType(BinaryLogicalClassType binaryLogicalClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryLogicalClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySetClassType(BinarySetClassType binarySetClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binarySetClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindContent(BindContent bindContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindType(BindType bindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBvarType(BvarType bvarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bvarType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCbytesType(CbytesType cbytesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cbytesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCeilingType(CeilingType ceilingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ceilingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCerrorType(CerrorType cerrorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cerrorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiContent(CiContent ciContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ciContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiType(CiType ciType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ciType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCnContent(CnContent cnContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cnContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCnType(CnType cnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConjugateType(ConjugateType conjugateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conjugateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantArithClassType(ConstantArithClassType constantArithClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantArithClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantSetClassType(ConstantSetClassType constantSetClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantSetClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCsType(CsType csType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(csType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCsymbolContent(CsymbolContent csymbolContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(csymbolContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCsymbolType(CsymbolType csymbolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(csymbolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclareType(DeclareType declareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declareType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeType(DegreeType degreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degreeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferentialOperatorClassType(DifferentialOperatorClassType differentialOperatorClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(differentialOperatorClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivideType(DivideType divideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(divideType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainofapplicationType(DomainofapplicationType domainofapplicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainofapplicationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpType(ExpType expType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactorialType(FactorialType factorialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factorialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactorofType(FactorofType factorofType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factorofType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloorType(FloorType floorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFnType(FnType fnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImaginaryType(ImaginaryType imaginaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imaginaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpliedMrow(ImpliedMrow impliedMrow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impliedMrow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntClassType(IntClassType intClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalClassType(IntervalClassType intervalClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intervalClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLambdaClassType(LambdaClassType lambdaClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lambdaClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitClassType(LimitClassType limitClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(limitClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListType(ListType listType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogbaseType(LogbaseType logbaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logbaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowlimitType(LowlimitType lowlimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lowlimitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMactionType(MactionType mactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaligngroupType(MaligngroupType maligngroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maligngroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMalignmarkType(MalignmarkType malignmarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(malignmarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathType(MathType mathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMencloseType(MencloseType mencloseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mencloseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerrorType(MerrorType merrorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(merrorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMfencedType(MfencedType mfencedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mfencedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMfracType(MfracType mfracType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mfracType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMglyphType(MglyphType mglyphType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mglyphType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinusType(MinusType minusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiType(MiType miType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMlabeledtrType(MlabeledtrType mlabeledtrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mlabeledtrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMlongdivType(MlongdivType mlongdivType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mlongdivType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMmultiscriptsType(MmultiscriptsType mmultiscriptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mmultiscriptsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMnType(MnType mnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMomentaboutType(MomentaboutType momentaboutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(momentaboutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoType(MoType moType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoverType(MoverType moverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMpaddedType(MpaddedType mpaddedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mpaddedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMphantomType(MphantomType mphantomType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mphantomType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMprescriptsType(MprescriptsType mprescriptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mprescriptsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMrootType(MrootType mrootType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mrootType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMrowType(MrowType mrowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mrowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMscarriesType(MscarriesType mscarriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mscarriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMscarryType(MscarryType mscarryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mscarryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsgroupType(MsgroupType msgroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msgroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslineType(MslineType mslineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mslineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMspaceType(MspaceType mspaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mspaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsqrtType(MsqrtType msqrtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msqrtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsrowType(MsrowType msrowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msrowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMstackType(MstackType mstackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mstackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMstyleType(MstyleType mstyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mstyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsType(MsType msType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsubsupType(MsubsupType msubsupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msubsupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsubType(MsubType msubType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msubType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsupType(MsupType msupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMtableType(MtableType mtableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mtableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMtextType(MtextType mtextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mtextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMtrType(MtrType mtrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mtrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMunderoverType(MunderoverType munderoverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(munderoverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMunderType(MunderType munderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(munderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryArithClassType(NaryArithClassType naryArithClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryArithClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryConstructorClassType(NaryConstructorClassType naryConstructorClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryConstructorClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryFunctionalClassType(NaryFunctionalClassType naryFunctionalClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryFunctionalClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryLinalgClassType(NaryLinalgClassType naryLinalgClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryLinalgClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryLogicalClassType(NaryLogicalClassType naryLogicalClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryLogicalClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryMinmaxClassType(NaryMinmaxClassType naryMinmaxClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryMinmaxClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryRelnClassType(NaryRelnClassType naryRelnClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryRelnClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarySetClassType(NarySetClassType narySetClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narySetClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarySetRelnClassType(NarySetRelnClassType narySetRelnClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narySetRelnClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaryStatsClassType(NaryStatsClassType naryStatsClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naryStatsClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeqType(NeqType neqType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(neqType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoneType(NoneType noneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noneType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherwiseType(OtherwiseType otherwiseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherwiseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartialdiffClassType(PartialdiffClassType partialdiffClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partialdiffClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePieceType(PieceType pieceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pieceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePiecewiseType(PiecewiseType piecewiseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(piecewiseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerType(PowerType powerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductClassType(ProductClassType productClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantifierClassType(QuantifierClassType quantifierClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantifierClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuotientType(QuotientType quotientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quotientType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType(RealType realType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelnType(RelnType relnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemType(RemType remType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootType(RootType rootType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSepType(SepType sepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetType(SetType setType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShareType(ShareType shareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shareType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSumClassType(SumClassType sumClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sumClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableCellExpressionType(TableCellExpressionType tableCellExpressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableCellExpressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTendstoType(TendstoType tendstoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tendstoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryElementaryClassType(UnaryElementaryClassType unaryElementaryClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryElementaryClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryFunctionalClassType(UnaryFunctionalClassType unaryFunctionalClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryFunctionalClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryLinalgClassType(UnaryLinalgClassType unaryLinalgClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryLinalgClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryLogicalClassType(UnaryLogicalClassType unaryLogicalClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryLogicalClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnarySetClassType(UnarySetClassType unarySetClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unarySetClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryVeccalcClassType(UnaryVeccalcClassType unaryVeccalcClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryVeccalcClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUplimitType(UplimitType uplimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uplimitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentType(AccentType accentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentType1(AccentType1 accentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentType2(AccentType2 accentType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentType3(AccentType3 accentType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentunderType(AccentunderType accentunderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentunderType1(AccentunderType1 accentunderType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentunderType2(AccentunderType2 accentunderType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBaseItem(AlignmentscopeTypeBaseItem alignmentscopeTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBaseItem1(AlignmentscopeTypeBaseItem1 alignmentscopeTypeBaseItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType(AlignType alignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType1(AlignType1 alignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType2(AlignType2 alignType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType5(AlignType5 alignType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignTypeMember1(AltimgValignTypeMember1 altimgValignTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignTypeMember2(AltimgValignTypeMember2 altimgValignTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignTypeMember3(AltimgValignTypeMember3 altimgValignTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundTypeMember1(BackgroundTypeMember1 backgroundTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBevelledType(BevelledType bevelledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBevelledType1(BevelledType1 bevelledType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharalignType(CharalignType charalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharalignType1(CharalignType1 charalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember1(CharspacingTypeMember1 charspacingTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember11(CharspacingTypeMember11 charspacingTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember2(CharspacingTypeMember2 charspacingTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember21(CharspacingTypeMember21 charspacingTypeMember21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember3(CharspacingTypeMember3 charspacingTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember31(CharspacingTypeMember31 charspacingTypeMember31, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignstyle(Columnalignstyle columnalignstyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember1(ColumnwidthTypeBaseItemMember1 columnwidthTypeBaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember11(ColumnwidthTypeBaseItemMember11 columnwidthTypeBaseItemMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember2(ColumnwidthTypeBaseItemMember2 columnwidthTypeBaseItemMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember21(ColumnwidthTypeBaseItemMember21 columnwidthTypeBaseItemMember21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutTypeItem(CrossoutTypeItem crossoutTypeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutTypeItem1(CrossoutTypeItem1 crossoutTypeItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutTypeItem2(CrossoutTypeItem2 crossoutTypeItem2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDenomalignType(DenomalignType denomalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDenomalignType1(DenomalignType1 denomalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType(DirType dirType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType1(DirType1 dirType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType2(DirType2 dirType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplaystyleType(DisplaystyleType displaystyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplaystyleType1(DisplaystyleType1 displaystyleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType(DisplayType displayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeType(EdgeType edgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeType1(EdgeType1 edgeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualcolumnsType(EqualcolumnsType equalcolumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualcolumnsType1(EqualcolumnsType1 equalcolumnsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualrowsType(EqualrowsType equalrowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualrowsType1(EqualrowsType1 equalrowsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFenceType(FenceType fenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFenceType1(FenceType1 fenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontstyleType(FontstyleType fontstyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontweightType(FontweightType fontweightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormType(FormType formType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormType1(FormType1 formType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignment(GroupAlignment groupAlignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupalignType(GroupalignType groupalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignfirstType(IndentalignfirstType indentalignfirstType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignfirstType1(IndentalignfirstType1 indentalignfirstType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignfirstType2(IndentalignfirstType2 indentalignfirstType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignlastType(IndentalignlastType indentalignlastType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignlastType1(IndentalignlastType1 indentalignlastType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignlastType2(IndentalignlastType2 indentalignlastType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignType(IndentalignType indentalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignType1(IndentalignType1 indentalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignType2(IndentalignType2 indentalignType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstTypeMember1(IndentshiftfirstTypeMember1 indentshiftfirstTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstTypeMember11(IndentshiftfirstTypeMember11 indentshiftfirstTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstTypeMember12(IndentshiftfirstTypeMember12 indentshiftfirstTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastTypeMember1(IndentshiftlastTypeMember1 indentshiftlastTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastTypeMember11(IndentshiftlastTypeMember11 indentshiftlastTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastTypeMember12(IndentshiftlastTypeMember12 indentshiftlastTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfixlinebreakstyleType(InfixlinebreakstyleType infixlinebreakstyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLargeopType(LargeopType largeopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLargeopType1(LargeopType1 largeopType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakstyleType(LinebreakstyleType linebreakstyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakstyleType1(LinebreakstyleType1 linebreakstyleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakType(LinebreakType linebreakType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakType1(LinebreakType1 linebreakType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakType2(LinebreakType2 linebreakType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinestyle(Linestyle linestyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember1(LinethicknessTypeMember1 linethicknessTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember11(LinethicknessTypeMember11 linethicknessTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember2(LinethicknessTypeMember2 linethicknessTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember21(LinethicknessTypeMember21 linethicknessTypeMember21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember3(LinethicknessTypeMember3 linethicknessTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember31(LinethicknessTypeMember31 linethicknessTypeMember31, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType1(LocationType1 locationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType2(LocationType2 locationType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongdivstyleType(LongdivstyleType longdivstyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongdivstyleType1(LongdivstyleType1 longdivstyleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathbackgroundTypeMember1(MathbackgroundTypeMember1 mathbackgroundTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember1(MathsizeTypeMember1 mathsizeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember11(MathsizeTypeMember11 mathsizeTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember12(MathsizeTypeMember12 mathsizeTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember2(MathsizeTypeMember2 mathsizeTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember21(MathsizeTypeMember21 mathsizeTypeMember21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember22(MathsizeTypeMember22 mathsizeTypeMember22, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember3(MathsizeTypeMember3 mathsizeTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember31(MathsizeTypeMember31 mathsizeTypeMember31, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember32(MathsizeTypeMember32 mathsizeTypeMember32, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathvariantType(MathvariantType mathvariantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathvariantType1(MathvariantType1 mathvariantType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathvariantType2(MathvariantType2 mathvariantType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeTypeMember1(MaxsizeTypeMember1 maxsizeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeTypeMember11(MaxsizeTypeMember11 maxsizeTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovablelimitsType(MovablelimitsType movablelimitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovablelimitsType1(MovablelimitsType1 movablelimitsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember1(MslinethicknessTypeMember1 mslinethicknessTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember11(MslinethicknessTypeMember11 mslinethicknessTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember2(MslinethicknessTypeMember2 mslinethicknessTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember21(MslinethicknessTypeMember21 mslinethicknessTypeMember21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember3(MslinethicknessTypeMember3 mslinethicknessTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember31(MslinethicknessTypeMember31 mslinethicknessTypeMember31, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotationstyle(Notationstyle notationstyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumalignType(NumalignType numalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumalignType1(NumalignType1 numalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceType(OccurrenceType occurrenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderType(OrderType orderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverflowType(OverflowType overflowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignType(RowalignType rowalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignType2(RowalignType2 rowalignType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparatorType(SeparatorType separatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparatorType1(SeparatorType1 separatorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideType(SideType sideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideType1(SideType1 sideType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackalignType(StackalignType stackalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackalignType1(StackalignType1 stackalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStretchyType(StretchyType stretchyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStretchyType1(StretchyType1 stretchyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetricType(SymmetricType symmetricType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetricType1(SymmetricType1 symmetricType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalalign(Verticalalign verticalalign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthTypeMember1(WidthTypeMember1 widthTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentTypeObject(AccentType accentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentTypeObject1(AccentType1 accentTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentTypeObject2(AccentType2 accentTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentTypeObject3(AccentType3 accentTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentunderTypeObject(AccentunderType1 accentunderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentunderTypeObject1(AccentunderType accentunderTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccentunderTypeObject2(AccentunderType2 accentunderTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeType(List<?> alignmentscopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignmentscopeTypeBase_ItemType(alignmentscopeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlignmentscopeType_MinLength(alignmentscopeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Alignmentscope Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeType_MinLength(List<?> alignmentscopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = alignmentscopeType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getAlignmentscopeType(), alignmentscopeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeType1(List<?> alignmentscopeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignmentscopeTypeBase1_ItemType(alignmentscopeType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlignmentscopeType1_MinLength(alignmentscopeType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Alignmentscope Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeType1_MinLength(List<?> alignmentscopeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = alignmentscopeType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getAlignmentscopeType1(), alignmentscopeType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBase(List<?> alignmentscopeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignmentscopeTypeBase_ItemType(alignmentscopeTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Alignmentscope Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBase_ItemType(List<?> alignmentscopeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = alignmentscopeTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem().isInstance(item)) {
				result &= validateAlignmentscopeTypeBaseItem((AlignmentscopeTypeBaseItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBase1(List<?> alignmentscopeTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignmentscopeTypeBase1_ItemType(alignmentscopeTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Alignmentscope Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBase1_ItemType(List<?> alignmentscopeTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = alignmentscopeTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem1().isInstance(item)) {
				result &= validateAlignmentscopeTypeBaseItem1((AlignmentscopeTypeBaseItem1)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem1(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBaseItemObject(AlignmentscopeTypeBaseItem alignmentscopeTypeBaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentscopeTypeBaseItemObject1(AlignmentscopeTypeBaseItem1 alignmentscopeTypeBaseItemObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType3(String alignType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignType3_Pattern(alignType3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAlignType3_Pattern
	 */
	public static final  PatternMatcher [][] ALIGN_TYPE3__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*(top|bottom|center|baseline|axis)(\\s+-?[0-9]+)?\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Align Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType3_Pattern(String alignType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getAlignType3(), alignType3, ALIGN_TYPE3__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType4(String alignType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlignType4_Pattern(alignType4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAlignType4_Pattern
	 */
	public static final  PatternMatcher [][] ALIGN_TYPE4__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*(top|bottom|center|baseline|axis)(\\s+-?[0-9]+)?\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Align Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType4_Pattern(String alignType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getAlignType4(), alignType4, ALIGN_TYPE4__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject(AlignType alignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject1(AlignType2 alignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject2(AlignType1 alignTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject3(AlignType5 alignTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignType(Object altimgValignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAltimgValignType_MemberTypes(altimgValignType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Altimg Valign Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignType_MemberTypes(Object altimgValignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(altimgValignType)) {
				if (validateLength((String)altimgValignType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getAltimgValignTypeMember1().isInstance(altimgValignType)) {
				if (validateAltimgValignTypeMember1((AltimgValignTypeMember1)altimgValignType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getAltimgValignTypeMember2().isInstance(altimgValignType)) {
				if (validateAltimgValignTypeMember2((AltimgValignTypeMember2)altimgValignType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getAltimgValignTypeMember3().isInstance(altimgValignType)) {
				if (validateAltimgValignTypeMember3((AltimgValignTypeMember3)altimgValignType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(altimgValignType)) {
				if (validateLength((String)altimgValignType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getAltimgValignTypeMember1().isInstance(altimgValignType)) {
				if (validateAltimgValignTypeMember1((AltimgValignTypeMember1)altimgValignType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getAltimgValignTypeMember2().isInstance(altimgValignType)) {
				if (validateAltimgValignTypeMember2((AltimgValignTypeMember2)altimgValignType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getAltimgValignTypeMember3().isInstance(altimgValignType)) {
				if (validateAltimgValignTypeMember3((AltimgValignTypeMember3)altimgValignType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignTypeMember1Object(AltimgValignTypeMember1 altimgValignTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignTypeMember2Object(AltimgValignTypeMember2 altimgValignTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltimgValignTypeMember3Object(AltimgValignTypeMember3 altimgValignTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundType(Object backgroundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBackgroundType_MemberTypes(backgroundType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Background Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundType_MemberTypes(Object backgroundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getColor().isInstance(backgroundType)) {
				if (validateColor((String)backgroundType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getBackgroundTypeMember1().isInstance(backgroundType)) {
				if (validateBackgroundTypeMember1((BackgroundTypeMember1)backgroundType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getColor().isInstance(backgroundType)) {
				if (validateColor((String)backgroundType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getBackgroundTypeMember1().isInstance(backgroundType)) {
				if (validateBackgroundTypeMember1((BackgroundTypeMember1)backgroundType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundTypeMember1Object(BackgroundTypeMember1 backgroundTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64(byte[] base64, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBevelledTypeObject(BevelledType bevelledTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBevelledTypeObject1(BevelledType1 bevelledTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharacter_Pattern(character, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCharacter_Pattern
	 */
	public static final  PatternMatcher [][] CHARACTER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*\\S\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Pattern(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getCharacter(), character, CHARACTER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharalignTypeObject(CharalignType charalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharalignTypeObject1(CharalignType1 charalignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingType(Object charspacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharspacingType_MemberTypes(charspacingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Charspacing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingType_MemberTypes(Object charspacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(charspacingType)) {
				if (validateLength((String)charspacingType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember1().isInstance(charspacingType)) {
				if (validateCharspacingTypeMember1((CharspacingTypeMember1)charspacingType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember2().isInstance(charspacingType)) {
				if (validateCharspacingTypeMember2((CharspacingTypeMember2)charspacingType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember3().isInstance(charspacingType)) {
				if (validateCharspacingTypeMember3((CharspacingTypeMember3)charspacingType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(charspacingType)) {
				if (validateLength((String)charspacingType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember1().isInstance(charspacingType)) {
				if (validateCharspacingTypeMember1((CharspacingTypeMember1)charspacingType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember2().isInstance(charspacingType)) {
				if (validateCharspacingTypeMember2((CharspacingTypeMember2)charspacingType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember3().isInstance(charspacingType)) {
				if (validateCharspacingTypeMember3((CharspacingTypeMember3)charspacingType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingType1(Object charspacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharspacingType1_MemberTypes(charspacingType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Charspacing Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingType1_MemberTypes(Object charspacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(charspacingType1)) {
				if (validateLength((String)charspacingType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember11().isInstance(charspacingType1)) {
				if (validateCharspacingTypeMember11((CharspacingTypeMember11)charspacingType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember21().isInstance(charspacingType1)) {
				if (validateCharspacingTypeMember21((CharspacingTypeMember21)charspacingType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember31().isInstance(charspacingType1)) {
				if (validateCharspacingTypeMember31((CharspacingTypeMember31)charspacingType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(charspacingType1)) {
				if (validateLength((String)charspacingType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember11().isInstance(charspacingType1)) {
				if (validateCharspacingTypeMember11((CharspacingTypeMember11)charspacingType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember21().isInstance(charspacingType1)) {
				if (validateCharspacingTypeMember21((CharspacingTypeMember21)charspacingType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getCharspacingTypeMember31().isInstance(charspacingType1)) {
				if (validateCharspacingTypeMember31((CharspacingTypeMember31)charspacingType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember1Object(CharspacingTypeMember1 charspacingTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember1Object1(CharspacingTypeMember11 charspacingTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember2Object(CharspacingTypeMember2 charspacingTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember2Object1(CharspacingTypeMember21 charspacingTypeMember2Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember3Object(CharspacingTypeMember3 charspacingTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharspacingTypeMember3Object1(CharspacingTypeMember31 charspacingTypeMember3Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(String color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColor_Pattern(color, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateColor_Pattern
	 */
	public static final  PatternMatcher [][] COLOR__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*((#[0-9a-fA-F]{3}([0-9a-fA-F]{3})?)|[aA][qQ][uU][aA]|[bB][lL][aA][cC][kK]|[bB][lL][uU][eE]|[fF][uU][cC][hH][sS][iI][aA]|[gG][rR][aA][yY]|[gG][rR][eE][eE][nN]|[lL][iI][mM][eE]|[mM][aA][rR][oO][oO][nN]|[nN][aA][vV][yY]|[oO][lL][iI][vV][eE]|[pP][uU][rR][pP][lL][eE]|[rR][eE][dD]|[sS][iI][lL][vV][eE][rR]|[tT][eE][aA][lL]|[wW][hH][iI][tT][eE]|[yY][eE][lL][lL][oO][wW])\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_Pattern(String color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getColor(), color, COLOR__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignstyleObject(Columnalignstyle columnalignstyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignType(List<?> columnalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnalignTypeBase_ItemType(columnalignType, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnalignType_MinLength(columnalignType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnalign Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignType_MinLength(List<?> columnalignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnalignType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnalignType(), columnalignType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignType1(List<?> columnalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnalignTypeBase1_ItemType(columnalignType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnalignType1_MinLength(columnalignType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnalign Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignType1_MinLength(List<?> columnalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnalignType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnalignType1(), columnalignType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignType2(List<?> columnalignType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnalignTypeBase2_ItemType(columnalignType2, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnalignType2_MinLength(columnalignType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnalign Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignType2_MinLength(List<?> columnalignType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnalignType2.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnalignType2(), columnalignType2, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignTypeBase(List<?> columnalignTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnalignTypeBase_ItemType(columnalignTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnalign Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignTypeBase_ItemType(List<?> columnalignTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnalignTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getColumnalignstyle().isInstance(item)) {
				result &= validateColumnalignstyle((Columnalignstyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getColumnalignstyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignTypeBase1(List<?> columnalignTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnalignTypeBase1_ItemType(columnalignTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnalign Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignTypeBase1_ItemType(List<?> columnalignTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnalignTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getColumnalignstyle().isInstance(item)) {
				result &= validateColumnalignstyle((Columnalignstyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getColumnalignstyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignTypeBase2(List<?> columnalignTypeBase2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnalignTypeBase2_ItemType(columnalignTypeBase2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnalign Type Base2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnalignTypeBase2_ItemType(List<?> columnalignTypeBase2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnalignTypeBase2.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getColumnalignstyle().isInstance(item)) {
				result &= validateColumnalignstyle((Columnalignstyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getColumnalignstyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesType(List<?> columnlinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnlinesTypeBase_ItemType(columnlinesType, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnlinesType_MinLength(columnlinesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnlines Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesType_MinLength(List<?> columnlinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnlinesType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnlinesType(), columnlinesType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesType1(List<?> columnlinesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnlinesTypeBase1_ItemType(columnlinesType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnlinesType1_MinLength(columnlinesType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnlines Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesType1_MinLength(List<?> columnlinesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnlinesType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnlinesType1(), columnlinesType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesTypeBase(List<?> columnlinesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnlinesTypeBase_ItemType(columnlinesTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnlines Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesTypeBase_ItemType(List<?> columnlinesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnlinesTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLinestyle().isInstance(item)) {
				result &= validateLinestyle((Linestyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLinestyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesTypeBase1(List<?> columnlinesTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnlinesTypeBase1_ItemType(columnlinesTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnlines Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnlinesTypeBase1_ItemType(List<?> columnlinesTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnlinesTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLinestyle().isInstance(item)) {
				result &= validateLinestyle((Linestyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLinestyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingType(List<?> columnspacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnspacingTypeBase_ItemType(columnspacingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnspacingType_MinLength(columnspacingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnspacing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingType_MinLength(List<?> columnspacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnspacingType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnspacingType(), columnspacingType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingType1(List<?> columnspacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnspacingTypeBase1_ItemType(columnspacingType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnspacingType1_MinLength(columnspacingType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnspacing Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingType1_MinLength(List<?> columnspacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnspacingType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnspacingType1(), columnspacingType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingTypeBase(List<?> columnspacingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnspacingTypeBase_ItemType(columnspacingTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnspacing Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingTypeBase_ItemType(List<?> columnspacingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnspacingTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLength().isInstance(item)) {
				result &= validateLength((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLength(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingTypeBase1(List<?> columnspacingTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnspacingTypeBase1_ItemType(columnspacingTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnspacing Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnspacingTypeBase1_ItemType(List<?> columnspacingTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnspacingTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLength().isInstance(item)) {
				result &= validateLength((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLength(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthType(List<?> columnwidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnwidthTypeBase_ItemType(columnwidthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnwidthType_MinLength(columnwidthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnwidth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthType_MinLength(List<?> columnwidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnwidthType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnwidthType(), columnwidthType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthType1(List<?> columnwidthType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnwidthTypeBase1_ItemType(columnwidthType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumnwidthType1_MinLength(columnwidthType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Columnwidth Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthType1_MinLength(List<?> columnwidthType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = columnwidthType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getColumnwidthType1(), columnwidthType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBase(List<?> columnwidthTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnwidthTypeBase_ItemType(columnwidthTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnwidth Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBase_ItemType(List<?> columnwidthTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnwidthTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItem().isInstance(item)) {
				result &= validateColumnwidthTypeBaseItem(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getColumnwidthTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBase1(List<?> columnwidthTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnwidthTypeBase1_ItemType(columnwidthTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Columnwidth Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBase1_ItemType(List<?> columnwidthTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = columnwidthTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItem1().isInstance(item)) {
				result &= validateColumnwidthTypeBaseItem1(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getColumnwidthTypeBaseItem1(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItem(Object columnwidthTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnwidthTypeBaseItem_MemberTypes(columnwidthTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Columnwidth Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItem_MemberTypes(Object columnwidthTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(columnwidthTypeBaseItem)) {
				if (validateLength((String)columnwidthTypeBaseItem, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1().isInstance(columnwidthTypeBaseItem)) {
				if (validateColumnwidthTypeBaseItemMember1((ColumnwidthTypeBaseItemMember1)columnwidthTypeBaseItem, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2().isInstance(columnwidthTypeBaseItem)) {
				if (validateColumnwidthTypeBaseItemMember2((ColumnwidthTypeBaseItemMember2)columnwidthTypeBaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(columnwidthTypeBaseItem)) {
				if (validateLength((String)columnwidthTypeBaseItem, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1().isInstance(columnwidthTypeBaseItem)) {
				if (validateColumnwidthTypeBaseItemMember1((ColumnwidthTypeBaseItemMember1)columnwidthTypeBaseItem, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2().isInstance(columnwidthTypeBaseItem)) {
				if (validateColumnwidthTypeBaseItemMember2((ColumnwidthTypeBaseItemMember2)columnwidthTypeBaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItem1(Object columnwidthTypeBaseItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColumnwidthTypeBaseItem1_MemberTypes(columnwidthTypeBaseItem1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Columnwidth Type Base Item1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItem1_MemberTypes(Object columnwidthTypeBaseItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(columnwidthTypeBaseItem1)) {
				if (validateLength((String)columnwidthTypeBaseItem1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11().isInstance(columnwidthTypeBaseItem1)) {
				if (validateColumnwidthTypeBaseItemMember11((ColumnwidthTypeBaseItemMember11)columnwidthTypeBaseItem1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21().isInstance(columnwidthTypeBaseItem1)) {
				if (validateColumnwidthTypeBaseItemMember21((ColumnwidthTypeBaseItemMember21)columnwidthTypeBaseItem1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(columnwidthTypeBaseItem1)) {
				if (validateLength((String)columnwidthTypeBaseItem1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11().isInstance(columnwidthTypeBaseItem1)) {
				if (validateColumnwidthTypeBaseItemMember11((ColumnwidthTypeBaseItemMember11)columnwidthTypeBaseItem1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21().isInstance(columnwidthTypeBaseItem1)) {
				if (validateColumnwidthTypeBaseItemMember21((ColumnwidthTypeBaseItemMember21)columnwidthTypeBaseItem1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember1Object(ColumnwidthTypeBaseItemMember1 columnwidthTypeBaseItemMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember1Object1(ColumnwidthTypeBaseItemMember11 columnwidthTypeBaseItemMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember2Object(ColumnwidthTypeBaseItemMember2 columnwidthTypeBaseItemMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnwidthTypeBaseItemMember2Object1(ColumnwidthTypeBaseItemMember21 columnwidthTypeBaseItemMember2Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutType(List<?> crossoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCrossoutType_ItemType(crossoutType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Crossout Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutType_ItemType(List<?> crossoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = crossoutType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getCrossoutTypeItem1().isInstance(item)) {
				result &= validateCrossoutTypeItem1((CrossoutTypeItem1)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getCrossoutTypeItem1(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutType1(List<?> crossoutType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCrossoutType1_ItemType(crossoutType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Crossout Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutType1_ItemType(List<?> crossoutType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = crossoutType1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getCrossoutTypeItem().isInstance(item)) {
				result &= validateCrossoutTypeItem((CrossoutTypeItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getCrossoutTypeItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutType2(List<?> crossoutType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCrossoutType2_ItemType(crossoutType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Crossout Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutType2_ItemType(List<?> crossoutType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = crossoutType2.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getCrossoutTypeItem2().isInstance(item)) {
				result &= validateCrossoutTypeItem2((CrossoutTypeItem2)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getCrossoutTypeItem2(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutTypeItemObject(CrossoutTypeItem crossoutTypeItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutTypeItemObject1(CrossoutTypeItem1 crossoutTypeItemObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossoutTypeItemObject2(CrossoutTypeItem2 crossoutTypeItemObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDenomalignTypeObject(DenomalignType denomalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDenomalignTypeObject1(DenomalignType1 denomalignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirTypeObject(DirType dirTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirTypeObject1(DirType1 dirTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirTypeObject2(DirType2 dirTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplaystyleTypeObject(DisplaystyleType displaystyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplaystyleTypeObject1(DisplaystyleType1 displaystyleTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject(DisplayType displayTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeTypeObject(EdgeType edgeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeTypeObject1(EdgeType1 edgeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualcolumnsTypeObject(EqualcolumnsType equalcolumnsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualcolumnsTypeObject1(EqualcolumnsType1 equalcolumnsTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualrowsTypeObject(EqualrowsType equalrowsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqualrowsTypeObject1(EqualrowsType1 equalrowsTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFenceTypeObject(FenceType fenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFenceTypeObject1(FenceType1 fenceTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontstyleTypeObject(FontstyleType fontstyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontweightTypeObject(FontweightType fontweightTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormTypeObject(FormType formTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormTypeObject1(FormType1 formTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingType(List<?> framespacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFramespacingTypeBase_ItemType(framespacingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFramespacingType_MinLength(framespacingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFramespacingType_MaxLength(framespacingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Framespacing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingType_MinLength(List<?> framespacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = framespacingType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getFramespacingType(), framespacingType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Framespacing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingType_MaxLength(List<?> framespacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = framespacingType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MlPackage.eINSTANCE.getFramespacingType(), framespacingType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingType1(List<?> framespacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFramespacingTypeBase1_ItemType(framespacingType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateFramespacingType1_MinLength(framespacingType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateFramespacingType1_MaxLength(framespacingType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Framespacing Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingType1_MinLength(List<?> framespacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = framespacingType1.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getFramespacingType1(), framespacingType1, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Framespacing Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingType1_MaxLength(List<?> framespacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = framespacingType1.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MlPackage.eINSTANCE.getFramespacingType1(), framespacingType1, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBase(List<?> framespacingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFramespacingTypeBase_ItemType(framespacingTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Framespacing Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBase_ItemType(List<?> framespacingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = framespacingTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getFramespacingTypeBaseItem().isInstance(item)) {
				result &= validateFramespacingTypeBaseItem((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getFramespacingTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBase1(List<?> framespacingTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFramespacingTypeBase1_ItemType(framespacingTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Framespacing Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBase1_ItemType(List<?> framespacingTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = framespacingTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getFramespacingTypeBaseItem1().isInstance(item)) {
				result &= validateFramespacingTypeBaseItem1((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getFramespacingTypeBaseItem1(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBaseItem(String framespacingTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFramespacingTypeBaseItem_MemberTypes(framespacingTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Framespacing Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBaseItem_MemberTypes(String framespacingTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(framespacingTypeBaseItem)) {
				if (validateLength(framespacingTypeBaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(framespacingTypeBaseItem)) {
				if (validateLength(framespacingTypeBaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBaseItem1(String framespacingTypeBaseItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFramespacingTypeBaseItem1_MemberTypes(framespacingTypeBaseItem1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Framespacing Type Base Item1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramespacingTypeBaseItem1_MemberTypes(String framespacingTypeBaseItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(framespacingTypeBaseItem1)) {
				if (validateLength(framespacingTypeBaseItem1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(framespacingTypeBaseItem1)) {
				if (validateLength(framespacingTypeBaseItem1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentList(List<?> groupAlignmentList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGroupAlignmentListBase_ItemType(groupAlignmentList, diagnostics, context);
		if (result || diagnostics != null) result &= validateGroupAlignmentList_MinLength(groupAlignmentList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Group Alignment List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentList_MinLength(List<?> groupAlignmentList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = groupAlignmentList.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getGroupAlignmentList(), groupAlignmentList, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentListBase(List<?> groupAlignmentListBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGroupAlignmentListBase_ItemType(groupAlignmentListBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Group Alignment List Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentListBase_ItemType(List<?> groupAlignmentListBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = groupAlignmentListBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getGroupAlignment().isInstance(item)) {
				result &= validateGroupAlignment((GroupAlignment)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getGroupAlignment(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentListList(String groupAlignmentListList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGroupAlignmentListList_Pattern(groupAlignmentListList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGroupAlignmentListList_Pattern
	 */
	public static final  PatternMatcher [][] GROUP_ALIGNMENT_LIST_LIST__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\s*\\{\\s*(left|center|right|decimalpoint)(\\s+(left|center|right|decimalpoint))*\\})*\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Group Alignment List List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentListList_Pattern(String groupAlignmentListList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getGroupAlignmentListList(), groupAlignmentListList, GROUP_ALIGNMENT_LIST_LIST__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupAlignmentObject(GroupAlignment groupAlignmentObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupalignTypeObject(GroupalignType groupalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignfirstTypeObject(IndentalignfirstType indentalignfirstTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignfirstTypeObject1(IndentalignfirstType1 indentalignfirstTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignfirstTypeObject2(IndentalignfirstType2 indentalignfirstTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignlastTypeObject(IndentalignlastType indentalignlastTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignlastTypeObject1(IndentalignlastType1 indentalignlastTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignlastTypeObject2(IndentalignlastType2 indentalignlastTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignTypeObject(IndentalignType indentalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignTypeObject1(IndentalignType1 indentalignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentalignTypeObject2(IndentalignType2 indentalignTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstType(Object indentshiftfirstType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndentshiftfirstType_MemberTypes(indentshiftfirstType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Indentshiftfirst Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstType_MemberTypes(Object indentshiftfirstType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftfirstType)) {
				if (validateLength((String)indentshiftfirstType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1().isInstance(indentshiftfirstType)) {
				if (validateIndentshiftfirstTypeMember1((IndentshiftfirstTypeMember1)indentshiftfirstType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftfirstType)) {
				if (validateLength((String)indentshiftfirstType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1().isInstance(indentshiftfirstType)) {
				if (validateIndentshiftfirstTypeMember1((IndentshiftfirstTypeMember1)indentshiftfirstType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstType1(Object indentshiftfirstType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndentshiftfirstType1_MemberTypes(indentshiftfirstType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Indentshiftfirst Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstType1_MemberTypes(Object indentshiftfirstType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftfirstType1)) {
				if (validateLength((String)indentshiftfirstType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11().isInstance(indentshiftfirstType1)) {
				if (validateIndentshiftfirstTypeMember11((IndentshiftfirstTypeMember11)indentshiftfirstType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftfirstType1)) {
				if (validateLength((String)indentshiftfirstType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11().isInstance(indentshiftfirstType1)) {
				if (validateIndentshiftfirstTypeMember11((IndentshiftfirstTypeMember11)indentshiftfirstType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstType2(Object indentshiftfirstType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndentshiftfirstType2_MemberTypes(indentshiftfirstType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Indentshiftfirst Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstType2_MemberTypes(Object indentshiftfirstType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftfirstType2)) {
				if (validateLength((String)indentshiftfirstType2, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12().isInstance(indentshiftfirstType2)) {
				if (validateIndentshiftfirstTypeMember12((IndentshiftfirstTypeMember12)indentshiftfirstType2, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftfirstType2)) {
				if (validateLength((String)indentshiftfirstType2, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12().isInstance(indentshiftfirstType2)) {
				if (validateIndentshiftfirstTypeMember12((IndentshiftfirstTypeMember12)indentshiftfirstType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstTypeMember1Object(IndentshiftfirstTypeMember11 indentshiftfirstTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstTypeMember1Object1(IndentshiftfirstTypeMember1 indentshiftfirstTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftfirstTypeMember1Object2(IndentshiftfirstTypeMember12 indentshiftfirstTypeMember1Object2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastType(Object indentshiftlastType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndentshiftlastType_MemberTypes(indentshiftlastType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Indentshiftlast Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastType_MemberTypes(Object indentshiftlastType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftlastType)) {
				if (validateLength((String)indentshiftlastType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember11().isInstance(indentshiftlastType)) {
				if (validateIndentshiftlastTypeMember11((IndentshiftlastTypeMember11)indentshiftlastType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftlastType)) {
				if (validateLength((String)indentshiftlastType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember11().isInstance(indentshiftlastType)) {
				if (validateIndentshiftlastTypeMember11((IndentshiftlastTypeMember11)indentshiftlastType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastType1(Object indentshiftlastType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndentshiftlastType1_MemberTypes(indentshiftlastType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Indentshiftlast Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastType1_MemberTypes(Object indentshiftlastType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftlastType1)) {
				if (validateLength((String)indentshiftlastType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember1().isInstance(indentshiftlastType1)) {
				if (validateIndentshiftlastTypeMember1((IndentshiftlastTypeMember1)indentshiftlastType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftlastType1)) {
				if (validateLength((String)indentshiftlastType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember1().isInstance(indentshiftlastType1)) {
				if (validateIndentshiftlastTypeMember1((IndentshiftlastTypeMember1)indentshiftlastType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastType2(Object indentshiftlastType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndentshiftlastType2_MemberTypes(indentshiftlastType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Indentshiftlast Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastType2_MemberTypes(Object indentshiftlastType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftlastType2)) {
				if (validateLength((String)indentshiftlastType2, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember12().isInstance(indentshiftlastType2)) {
				if (validateIndentshiftlastTypeMember12((IndentshiftlastTypeMember12)indentshiftlastType2, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(indentshiftlastType2)) {
				if (validateLength((String)indentshiftlastType2, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember12().isInstance(indentshiftlastType2)) {
				if (validateIndentshiftlastTypeMember12((IndentshiftlastTypeMember12)indentshiftlastType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastTypeMember1Object(IndentshiftlastTypeMember1 indentshiftlastTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastTypeMember1Object1(IndentshiftlastTypeMember11 indentshiftlastTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndentshiftlastTypeMember1Object2(IndentshiftlastTypeMember12 indentshiftlastTypeMember1Object2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfixlinebreakstyleTypeObject(InfixlinebreakstyleType infixlinebreakstyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(BigInteger integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLargeopTypeObject(LargeopType largeopTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLargeopTypeObject1(LargeopType1 largeopTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_Pattern(length, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLength_Pattern
	 */
	public static final  PatternMatcher [][] LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*((-?[0-9]*([0-9]\\.?|\\.[0-9])[0-9]*(e[mx]|in|cm|mm|p[xtc]|%)?)|(negative)?((very){0,2}thi(n|ck)|medium)mathspace)\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_Pattern(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getLength(), length, LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakstyleTypeObject(LinebreakstyleType linebreakstyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakstyleTypeObject1(LinebreakstyleType1 linebreakstyleTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakTypeObject(LinebreakType linebreakTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakTypeObject1(LinebreakType1 linebreakTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinebreakTypeObject2(LinebreakType2 linebreakTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinestyleObject(Linestyle linestyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessType(Object linethicknessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLinethicknessType_MemberTypes(linethicknessType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Linethickness Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessType_MemberTypes(Object linethicknessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(linethicknessType)) {
				if (validateLength((String)linethicknessType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember1().isInstance(linethicknessType)) {
				if (validateLinethicknessTypeMember1((LinethicknessTypeMember1)linethicknessType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember2().isInstance(linethicknessType)) {
				if (validateLinethicknessTypeMember2((LinethicknessTypeMember2)linethicknessType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember3().isInstance(linethicknessType)) {
				if (validateLinethicknessTypeMember3((LinethicknessTypeMember3)linethicknessType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(linethicknessType)) {
				if (validateLength((String)linethicknessType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember1().isInstance(linethicknessType)) {
				if (validateLinethicknessTypeMember1((LinethicknessTypeMember1)linethicknessType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember2().isInstance(linethicknessType)) {
				if (validateLinethicknessTypeMember2((LinethicknessTypeMember2)linethicknessType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember3().isInstance(linethicknessType)) {
				if (validateLinethicknessTypeMember3((LinethicknessTypeMember3)linethicknessType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessType1(Object linethicknessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLinethicknessType1_MemberTypes(linethicknessType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Linethickness Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessType1_MemberTypes(Object linethicknessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(linethicknessType1)) {
				if (validateLength((String)linethicknessType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember11().isInstance(linethicknessType1)) {
				if (validateLinethicknessTypeMember11((LinethicknessTypeMember11)linethicknessType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember21().isInstance(linethicknessType1)) {
				if (validateLinethicknessTypeMember21((LinethicknessTypeMember21)linethicknessType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember31().isInstance(linethicknessType1)) {
				if (validateLinethicknessTypeMember31((LinethicknessTypeMember31)linethicknessType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(linethicknessType1)) {
				if (validateLength((String)linethicknessType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember11().isInstance(linethicknessType1)) {
				if (validateLinethicknessTypeMember11((LinethicknessTypeMember11)linethicknessType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember21().isInstance(linethicknessType1)) {
				if (validateLinethicknessTypeMember21((LinethicknessTypeMember21)linethicknessType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getLinethicknessTypeMember31().isInstance(linethicknessType1)) {
				if (validateLinethicknessTypeMember31((LinethicknessTypeMember31)linethicknessType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember1Object(LinethicknessTypeMember1 linethicknessTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember1Object1(LinethicknessTypeMember11 linethicknessTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember2Object(LinethicknessTypeMember2 linethicknessTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember2Object1(LinethicknessTypeMember21 linethicknessTypeMember2Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember3Object(LinethicknessTypeMember3 linethicknessTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinethicknessTypeMember3Object1(LinethicknessTypeMember31 linethicknessTypeMember3Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObject(LocationType locationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObject1(LocationType1 locationTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObject2(LocationType2 locationTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongdivstyleTypeObject(LongdivstyleType longdivstyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongdivstyleTypeObject1(LongdivstyleType1 longdivstyleTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathbackgroundType(Object mathbackgroundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMathbackgroundType_MemberTypes(mathbackgroundType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mathbackground Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathbackgroundType_MemberTypes(Object mathbackgroundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getColor().isInstance(mathbackgroundType)) {
				if (validateColor((String)mathbackgroundType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathbackgroundTypeMember1().isInstance(mathbackgroundType)) {
				if (validateMathbackgroundTypeMember1((MathbackgroundTypeMember1)mathbackgroundType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getColor().isInstance(mathbackgroundType)) {
				if (validateColor((String)mathbackgroundType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathbackgroundTypeMember1().isInstance(mathbackgroundType)) {
				if (validateMathbackgroundTypeMember1((MathbackgroundTypeMember1)mathbackgroundType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathbackgroundTypeMember1Object(MathbackgroundTypeMember1 mathbackgroundTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeType(Object mathsizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMathsizeType_MemberTypes(mathsizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mathsize Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeType_MemberTypes(Object mathsizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(mathsizeType)) {
				if (validateLength((String)mathsizeType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember11().isInstance(mathsizeType)) {
				if (validateMathsizeTypeMember11((MathsizeTypeMember11)mathsizeType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember2().isInstance(mathsizeType)) {
				if (validateMathsizeTypeMember2((MathsizeTypeMember2)mathsizeType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember3().isInstance(mathsizeType)) {
				if (validateMathsizeTypeMember3((MathsizeTypeMember3)mathsizeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(mathsizeType)) {
				if (validateLength((String)mathsizeType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember11().isInstance(mathsizeType)) {
				if (validateMathsizeTypeMember11((MathsizeTypeMember11)mathsizeType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember2().isInstance(mathsizeType)) {
				if (validateMathsizeTypeMember2((MathsizeTypeMember2)mathsizeType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember3().isInstance(mathsizeType)) {
				if (validateMathsizeTypeMember3((MathsizeTypeMember3)mathsizeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeType1(Object mathsizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMathsizeType1_MemberTypes(mathsizeType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mathsize Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeType1_MemberTypes(Object mathsizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(mathsizeType1)) {
				if (validateLength((String)mathsizeType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember1().isInstance(mathsizeType1)) {
				if (validateMathsizeTypeMember1((MathsizeTypeMember1)mathsizeType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember21().isInstance(mathsizeType1)) {
				if (validateMathsizeTypeMember21((MathsizeTypeMember21)mathsizeType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember31().isInstance(mathsizeType1)) {
				if (validateMathsizeTypeMember31((MathsizeTypeMember31)mathsizeType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(mathsizeType1)) {
				if (validateLength((String)mathsizeType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember1().isInstance(mathsizeType1)) {
				if (validateMathsizeTypeMember1((MathsizeTypeMember1)mathsizeType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember21().isInstance(mathsizeType1)) {
				if (validateMathsizeTypeMember21((MathsizeTypeMember21)mathsizeType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember31().isInstance(mathsizeType1)) {
				if (validateMathsizeTypeMember31((MathsizeTypeMember31)mathsizeType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeType2(Object mathsizeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMathsizeType2_MemberTypes(mathsizeType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mathsize Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeType2_MemberTypes(Object mathsizeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(mathsizeType2)) {
				if (validateLength((String)mathsizeType2, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember12().isInstance(mathsizeType2)) {
				if (validateMathsizeTypeMember12((MathsizeTypeMember12)mathsizeType2, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember22().isInstance(mathsizeType2)) {
				if (validateMathsizeTypeMember22((MathsizeTypeMember22)mathsizeType2, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember32().isInstance(mathsizeType2)) {
				if (validateMathsizeTypeMember32((MathsizeTypeMember32)mathsizeType2, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(mathsizeType2)) {
				if (validateLength((String)mathsizeType2, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember12().isInstance(mathsizeType2)) {
				if (validateMathsizeTypeMember12((MathsizeTypeMember12)mathsizeType2, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember22().isInstance(mathsizeType2)) {
				if (validateMathsizeTypeMember22((MathsizeTypeMember22)mathsizeType2, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMathsizeTypeMember32().isInstance(mathsizeType2)) {
				if (validateMathsizeTypeMember32((MathsizeTypeMember32)mathsizeType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember1Object(MathsizeTypeMember1 mathsizeTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember1Object1(MathsizeTypeMember11 mathsizeTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember1Object2(MathsizeTypeMember12 mathsizeTypeMember1Object2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember2Object(MathsizeTypeMember2 mathsizeTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember2Object1(MathsizeTypeMember21 mathsizeTypeMember2Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember2Object2(MathsizeTypeMember22 mathsizeTypeMember2Object2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember3Object(MathsizeTypeMember3 mathsizeTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember3Object1(MathsizeTypeMember31 mathsizeTypeMember3Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathsizeTypeMember3Object2(MathsizeTypeMember32 mathsizeTypeMember3Object2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathvariantTypeObject(MathvariantType1 mathvariantTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathvariantTypeObject1(MathvariantType mathvariantTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathvariantTypeObject2(MathvariantType2 mathvariantTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeType(Object maxsizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaxsizeType_MemberTypes(maxsizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Maxsize Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeType_MemberTypes(Object maxsizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(maxsizeType)) {
				if (validateLength((String)maxsizeType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMaxsizeTypeMember1().isInstance(maxsizeType)) {
				if (validateMaxsizeTypeMember1((MaxsizeTypeMember1)maxsizeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(maxsizeType)) {
				if (validateLength((String)maxsizeType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMaxsizeTypeMember1().isInstance(maxsizeType)) {
				if (validateMaxsizeTypeMember1((MaxsizeTypeMember1)maxsizeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeType1(Object maxsizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaxsizeType1_MemberTypes(maxsizeType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Maxsize Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeType1_MemberTypes(Object maxsizeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(maxsizeType1)) {
				if (validateLength((String)maxsizeType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMaxsizeTypeMember11().isInstance(maxsizeType1)) {
				if (validateMaxsizeTypeMember11((MaxsizeTypeMember11)maxsizeType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(maxsizeType1)) {
				if (validateLength((String)maxsizeType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMaxsizeTypeMember11().isInstance(maxsizeType1)) {
				if (validateMaxsizeTypeMember11((MaxsizeTypeMember11)maxsizeType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeTypeMember1Object(MaxsizeTypeMember1 maxsizeTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxsizeTypeMember1Object1(MaxsizeTypeMember11 maxsizeTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovablelimitsTypeObject(MovablelimitsType movablelimitsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovablelimitsTypeObject1(MovablelimitsType1 movablelimitsTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMpaddedLength(String mpaddedLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMpaddedLength_Pattern(mpaddedLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMpaddedLength_Pattern
	 */
	public static final  PatternMatcher [][] MPADDED_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*([\\+\\-]?[0-9]*([0-9]\\.?|\\.[0-9])[0-9]*\\s*((%?\\s*(height|depth|width)?)|e[mx]|in|cm|mm|p[xtc]|((negative)?((very){0,2}thi(n|ck)|medium)mathspace))?)\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Mpadded Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMpaddedLength_Pattern(String mpaddedLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MlPackage.eINSTANCE.getMpaddedLength(), mpaddedLength, MPADDED_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessType(Object mslinethicknessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMslinethicknessType_MemberTypes(mslinethicknessType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mslinethickness Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessType_MemberTypes(Object mslinethicknessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(mslinethicknessType)) {
				if (validateLength((String)mslinethicknessType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember1().isInstance(mslinethicknessType)) {
				if (validateMslinethicknessTypeMember1((MslinethicknessTypeMember1)mslinethicknessType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember2().isInstance(mslinethicknessType)) {
				if (validateMslinethicknessTypeMember2((MslinethicknessTypeMember2)mslinethicknessType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember3().isInstance(mslinethicknessType)) {
				if (validateMslinethicknessTypeMember3((MslinethicknessTypeMember3)mslinethicknessType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(mslinethicknessType)) {
				if (validateLength((String)mslinethicknessType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember1().isInstance(mslinethicknessType)) {
				if (validateMslinethicknessTypeMember1((MslinethicknessTypeMember1)mslinethicknessType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember2().isInstance(mslinethicknessType)) {
				if (validateMslinethicknessTypeMember2((MslinethicknessTypeMember2)mslinethicknessType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember3().isInstance(mslinethicknessType)) {
				if (validateMslinethicknessTypeMember3((MslinethicknessTypeMember3)mslinethicknessType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessType1(Object mslinethicknessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMslinethicknessType1_MemberTypes(mslinethicknessType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mslinethickness Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessType1_MemberTypes(Object mslinethicknessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(mslinethicknessType1)) {
				if (validateLength((String)mslinethicknessType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember11().isInstance(mslinethicknessType1)) {
				if (validateMslinethicknessTypeMember11((MslinethicknessTypeMember11)mslinethicknessType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember21().isInstance(mslinethicknessType1)) {
				if (validateMslinethicknessTypeMember21((MslinethicknessTypeMember21)mslinethicknessType1, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember31().isInstance(mslinethicknessType1)) {
				if (validateMslinethicknessTypeMember31((MslinethicknessTypeMember31)mslinethicknessType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(mslinethicknessType1)) {
				if (validateLength((String)mslinethicknessType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember11().isInstance(mslinethicknessType1)) {
				if (validateMslinethicknessTypeMember11((MslinethicknessTypeMember11)mslinethicknessType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember21().isInstance(mslinethicknessType1)) {
				if (validateMslinethicknessTypeMember21((MslinethicknessTypeMember21)mslinethicknessType1, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getMslinethicknessTypeMember31().isInstance(mslinethicknessType1)) {
				if (validateMslinethicknessTypeMember31((MslinethicknessTypeMember31)mslinethicknessType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember1Object(MslinethicknessTypeMember1 mslinethicknessTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember1Object1(MslinethicknessTypeMember11 mslinethicknessTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember2Object(MslinethicknessTypeMember2 mslinethicknessTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember2Object1(MslinethicknessTypeMember21 mslinethicknessTypeMember2Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember3Object(MslinethicknessTypeMember3 mslinethicknessTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMslinethicknessTypeMember3Object1(MslinethicknessTypeMember31 mslinethicknessTypeMember3Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotationstyleObject(Notationstyle notationstyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumalignTypeObject(NumalignType numalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumalignTypeObject1(NumalignType1 numalignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(BigDecimal number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceTypeObject(OccurrenceType occurrenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderTypeObject(OrderType orderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverflowTypeObject(OverflowType overflowTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInteger(BigInteger positiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignType1(List<?> rowalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowalignTypeBase_ItemType(rowalignType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateRowalignType1_MinLength(rowalignType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Rowalign Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignType1_MinLength(List<?> rowalignType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rowalignType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getRowalignType1(), rowalignType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignType3(List<?> rowalignType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowalignTypeBase1_ItemType(rowalignType3, diagnostics, context);
		if (result || diagnostics != null) result &= validateRowalignType3_MinLength(rowalignType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Rowalign Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignType3_MinLength(List<?> rowalignType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rowalignType3.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getRowalignType3(), rowalignType3, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignTypeBase(List<?> rowalignTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowalignTypeBase_ItemType(rowalignTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Rowalign Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignTypeBase_ItemType(List<?> rowalignTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rowalignTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getVerticalalign().isInstance(item)) {
				result &= validateVerticalalign((Verticalalign)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getVerticalalign(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignTypeBase1(List<?> rowalignTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowalignTypeBase1_ItemType(rowalignTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Rowalign Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignTypeBase1_ItemType(List<?> rowalignTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rowalignTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getVerticalalign().isInstance(item)) {
				result &= validateVerticalalign((Verticalalign)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getVerticalalign(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignTypeObject(RowalignType rowalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowalignTypeObject1(RowalignType2 rowalignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesType(List<?> rowlinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowlinesTypeBase_ItemType(rowlinesType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRowlinesType_MinLength(rowlinesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Rowlines Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesType_MinLength(List<?> rowlinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rowlinesType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getRowlinesType(), rowlinesType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesType1(List<?> rowlinesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowlinesTypeBase1_ItemType(rowlinesType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateRowlinesType1_MinLength(rowlinesType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Rowlines Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesType1_MinLength(List<?> rowlinesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rowlinesType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getRowlinesType1(), rowlinesType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesTypeBase(List<?> rowlinesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowlinesTypeBase_ItemType(rowlinesTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Rowlines Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesTypeBase_ItemType(List<?> rowlinesTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rowlinesTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLinestyle().isInstance(item)) {
				result &= validateLinestyle((Linestyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLinestyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesTypeBase1(List<?> rowlinesTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowlinesTypeBase1_ItemType(rowlinesTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Rowlines Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowlinesTypeBase1_ItemType(List<?> rowlinesTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rowlinesTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLinestyle().isInstance(item)) {
				result &= validateLinestyle((Linestyle)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLinestyle(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingType(List<?> rowspacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowspacingTypeBase_ItemType(rowspacingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRowspacingType_MinLength(rowspacingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Rowspacing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingType_MinLength(List<?> rowspacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rowspacingType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getRowspacingType(), rowspacingType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingType1(List<?> rowspacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowspacingTypeBase1_ItemType(rowspacingType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateRowspacingType1_MinLength(rowspacingType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Rowspacing Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingType1_MinLength(List<?> rowspacingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rowspacingType1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MlPackage.eINSTANCE.getRowspacingType1(), rowspacingType1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingTypeBase(List<?> rowspacingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowspacingTypeBase_ItemType(rowspacingTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Rowspacing Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingTypeBase_ItemType(List<?> rowspacingTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rowspacingTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLength().isInstance(item)) {
				result &= validateLength((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLength(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingTypeBase1(List<?> rowspacingTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRowspacingTypeBase1_ItemType(rowspacingTypeBase1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Rowspacing Type Base1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowspacingTypeBase1_ItemType(List<?> rowspacingTypeBase1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rowspacingTypeBase1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (MlPackage.eINSTANCE.getLength().isInstance(item)) {
				result &= validateLength((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(MlPackage.eINSTANCE.getLength(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparatorTypeObject(SeparatorType separatorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparatorTypeObject1(SeparatorType1 separatorTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideTypeObject(SideType sideTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideTypeObject1(SideType1 sideTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackalignTypeObject(StackalignType stackalignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackalignTypeObject1(StackalignType1 stackalignTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStretchyTypeObject(StretchyType stretchyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStretchyTypeObject1(StretchyType1 stretchyTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolName(String symbolName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(symbolName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetricTypeObject(SymmetricType symmetricTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetricTypeObject1(SymmetricType1 symmetricTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedInteger(BigInteger unsignedInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateUnsignedLong_Min(unsignedInteger, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateUnsignedLong_Max(unsignedInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalalignObject(Verticalalign verticalalignObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthType(Object widthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWidthType_MemberTypes(widthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthType_MemberTypes(Object widthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (MlPackage.eINSTANCE.getLength().isInstance(widthType)) {
				if (validateLength((String)widthType, tempDiagnostics, context)) return true;
			}
			if (MlPackage.eINSTANCE.getWidthTypeMember1().isInstance(widthType)) {
				if (validateWidthTypeMember1((WidthTypeMember1)widthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (MlPackage.eINSTANCE.getLength().isInstance(widthType)) {
				if (validateLength((String)widthType, null, context)) return true;
			}
			if (MlPackage.eINSTANCE.getWidthTypeMember1().isInstance(widthType)) {
				if (validateWidthTypeMember1((WidthTypeMember1)widthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthTypeMember1Object(WidthTypeMember1 widthTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MlValidator
