/**
 */
package org.w3._1998.math.math.ml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1998.math.math.ml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MlFactoryImpl extends EFactoryImpl implements MlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MlFactory init() {
		try {
			MlFactory theMlFactory = (MlFactory)EPackage.Registry.INSTANCE.getEFactory(MlPackage.eNS_URI);
			if (theMlFactory != null) {
				return theMlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MlPackage.ABS_TYPE: return createAbsType();
			case MlPackage.ANNOTATION_TYPE: return createAnnotationType();
			case MlPackage.ANNOTATION_XML_MODEL: return createAnnotationXmlModel();
			case MlPackage.ANNOTATION_XML_TYPE: return createAnnotationXmlType();
			case MlPackage.APPLY_CONTENT: return createApplyContent();
			case MlPackage.APPLY_TYPE: return createApplyType();
			case MlPackage.APPROX_TYPE: return createApproxType();
			case MlPackage.ARG_TYPE: return createArgType();
			case MlPackage.BINARY_LINALG_CLASS_TYPE: return createBinaryLinalgClassType();
			case MlPackage.BINARY_LOGICAL_CLASS_TYPE: return createBinaryLogicalClassType();
			case MlPackage.BINARY_SET_CLASS_TYPE: return createBinarySetClassType();
			case MlPackage.BIND_CONTENT: return createBindContent();
			case MlPackage.BIND_TYPE: return createBindType();
			case MlPackage.BVAR_TYPE: return createBvarType();
			case MlPackage.CBYTES_TYPE: return createCbytesType();
			case MlPackage.CEILING_TYPE: return createCeilingType();
			case MlPackage.CERROR_TYPE: return createCerrorType();
			case MlPackage.CI_CONTENT: return createCiContent();
			case MlPackage.CI_TYPE: return createCiType();
			case MlPackage.CN_CONTENT: return createCnContent();
			case MlPackage.CN_TYPE: return createCnType();
			case MlPackage.CONDITION_TYPE: return createConditionType();
			case MlPackage.CONJUGATE_TYPE: return createConjugateType();
			case MlPackage.CONSTANT_ARITH_CLASS_TYPE: return createConstantArithClassType();
			case MlPackage.CONSTANT_SET_CLASS_TYPE: return createConstantSetClassType();
			case MlPackage.CS_TYPE: return createCsType();
			case MlPackage.CSYMBOL_CONTENT: return createCsymbolContent();
			case MlPackage.CSYMBOL_TYPE: return createCsymbolType();
			case MlPackage.DECLARE_TYPE: return createDeclareType();
			case MlPackage.DEGREE_TYPE: return createDegreeType();
			case MlPackage.DIFFERENTIAL_OPERATOR_CLASS_TYPE: return createDifferentialOperatorClassType();
			case MlPackage.DIVIDE_TYPE: return createDivideType();
			case MlPackage.DOMAINOFAPPLICATION_TYPE: return createDomainofapplicationType();
			case MlPackage.EXP_TYPE: return createExpType();
			case MlPackage.FACTORIAL_TYPE: return createFactorialType();
			case MlPackage.FACTOROF_TYPE: return createFactorofType();
			case MlPackage.FLOOR_TYPE: return createFloorType();
			case MlPackage.FN_TYPE: return createFnType();
			case MlPackage.IMAGINARY_TYPE: return createImaginaryType();
			case MlPackage.IMPLIED_MROW: return createImpliedMrow();
			case MlPackage.INT_CLASS_TYPE: return createIntClassType();
			case MlPackage.INTERVAL_CLASS_TYPE: return createIntervalClassType();
			case MlPackage.LAMBDA_CLASS_TYPE: return createLambdaClassType();
			case MlPackage.LIMIT_CLASS_TYPE: return createLimitClassType();
			case MlPackage.LIST_TYPE: return createListType();
			case MlPackage.LOGBASE_TYPE: return createLogbaseType();
			case MlPackage.LOWLIMIT_TYPE: return createLowlimitType();
			case MlPackage.MACTION_TYPE: return createMactionType();
			case MlPackage.MALIGNGROUP_TYPE: return createMaligngroupType();
			case MlPackage.MALIGNMARK_TYPE: return createMalignmarkType();
			case MlPackage.MATH_TYPE: return createMathType();
			case MlPackage.MENCLOSE_TYPE: return createMencloseType();
			case MlPackage.MERROR_TYPE: return createMerrorType();
			case MlPackage.MFENCED_TYPE: return createMfencedType();
			case MlPackage.MFRAC_TYPE: return createMfracType();
			case MlPackage.MGLYPH_TYPE: return createMglyphType();
			case MlPackage.MINUS_TYPE: return createMinusType();
			case MlPackage.MI_TYPE: return createMiType();
			case MlPackage.MLABELEDTR_TYPE: return createMlabeledtrType();
			case MlPackage.MLONGDIV_TYPE: return createMlongdivType();
			case MlPackage.MMULTISCRIPTS_TYPE: return createMmultiscriptsType();
			case MlPackage.MN_TYPE: return createMnType();
			case MlPackage.MOMENTABOUT_TYPE: return createMomentaboutType();
			case MlPackage.MO_TYPE: return createMoType();
			case MlPackage.MOVER_TYPE: return createMoverType();
			case MlPackage.MPADDED_TYPE: return createMpaddedType();
			case MlPackage.MPHANTOM_TYPE: return createMphantomType();
			case MlPackage.MPRESCRIPTS_TYPE: return createMprescriptsType();
			case MlPackage.MROOT_TYPE: return createMrootType();
			case MlPackage.MROW_TYPE: return createMrowType();
			case MlPackage.MSCARRIES_TYPE: return createMscarriesType();
			case MlPackage.MSCARRY_TYPE: return createMscarryType();
			case MlPackage.MSGROUP_TYPE: return createMsgroupType();
			case MlPackage.MSLINE_TYPE: return createMslineType();
			case MlPackage.MSPACE_TYPE: return createMspaceType();
			case MlPackage.MSQRT_TYPE: return createMsqrtType();
			case MlPackage.MSROW_TYPE: return createMsrowType();
			case MlPackage.MSTACK_TYPE: return createMstackType();
			case MlPackage.MSTYLE_TYPE: return createMstyleType();
			case MlPackage.MS_TYPE: return createMsType();
			case MlPackage.MSUBSUP_TYPE: return createMsubsupType();
			case MlPackage.MSUB_TYPE: return createMsubType();
			case MlPackage.MSUP_TYPE: return createMsupType();
			case MlPackage.MTABLE_TYPE: return createMtableType();
			case MlPackage.MTEXT_TYPE: return createMtextType();
			case MlPackage.MTR_TYPE: return createMtrType();
			case MlPackage.MUNDEROVER_TYPE: return createMunderoverType();
			case MlPackage.MUNDER_TYPE: return createMunderType();
			case MlPackage.NARY_ARITH_CLASS_TYPE: return createNaryArithClassType();
			case MlPackage.NARY_CONSTRUCTOR_CLASS_TYPE: return createNaryConstructorClassType();
			case MlPackage.NARY_FUNCTIONAL_CLASS_TYPE: return createNaryFunctionalClassType();
			case MlPackage.NARY_LINALG_CLASS_TYPE: return createNaryLinalgClassType();
			case MlPackage.NARY_LOGICAL_CLASS_TYPE: return createNaryLogicalClassType();
			case MlPackage.NARY_MINMAX_CLASS_TYPE: return createNaryMinmaxClassType();
			case MlPackage.NARY_RELN_CLASS_TYPE: return createNaryRelnClassType();
			case MlPackage.NARY_SET_CLASS_TYPE: return createNarySetClassType();
			case MlPackage.NARY_SET_RELN_CLASS_TYPE: return createNarySetRelnClassType();
			case MlPackage.NARY_STATS_CLASS_TYPE: return createNaryStatsClassType();
			case MlPackage.NEQ_TYPE: return createNeqType();
			case MlPackage.NONE_TYPE: return createNoneType();
			case MlPackage.OTHERWISE_TYPE: return createOtherwiseType();
			case MlPackage.PARTIALDIFF_CLASS_TYPE: return createPartialdiffClassType();
			case MlPackage.PIECE_TYPE: return createPieceType();
			case MlPackage.PIECEWISE_TYPE: return createPiecewiseType();
			case MlPackage.POWER_TYPE: return createPowerType();
			case MlPackage.PRODUCT_CLASS_TYPE: return createProductClassType();
			case MlPackage.QUANTIFIER_CLASS_TYPE: return createQuantifierClassType();
			case MlPackage.QUOTIENT_TYPE: return createQuotientType();
			case MlPackage.REAL_TYPE: return createRealType();
			case MlPackage.RELN_TYPE: return createRelnType();
			case MlPackage.REM_TYPE: return createRemType();
			case MlPackage.ROOT_TYPE: return createRootType();
			case MlPackage.SEP_TYPE: return createSepType();
			case MlPackage.SET_TYPE: return createSetType();
			case MlPackage.SHARE_TYPE: return createShareType();
			case MlPackage.SUM_CLASS_TYPE: return createSumClassType();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE: return createTableCellExpressionType();
			case MlPackage.TENDSTO_TYPE: return createTendstoType();
			case MlPackage.UNARY_ELEMENTARY_CLASS_TYPE: return createUnaryElementaryClassType();
			case MlPackage.UNARY_FUNCTIONAL_CLASS_TYPE: return createUnaryFunctionalClassType();
			case MlPackage.UNARY_LINALG_CLASS_TYPE: return createUnaryLinalgClassType();
			case MlPackage.UNARY_LOGICAL_CLASS_TYPE: return createUnaryLogicalClassType();
			case MlPackage.UNARY_SET_CLASS_TYPE: return createUnarySetClassType();
			case MlPackage.UNARY_VECCALC_CLASS_TYPE: return createUnaryVeccalcClassType();
			case MlPackage.UPLIMIT_TYPE: return createUplimitType();
			case MlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MlPackage.ACCENT_TYPE:
				return createAccentTypeFromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE1:
				return createAccentType1FromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE2:
				return createAccentType2FromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE3:
				return createAccentType3FromString(eDataType, initialValue);
			case MlPackage.ACCENTUNDER_TYPE:
				return createAccentunderTypeFromString(eDataType, initialValue);
			case MlPackage.ACCENTUNDER_TYPE1:
				return createAccentunderType1FromString(eDataType, initialValue);
			case MlPackage.ACCENTUNDER_TYPE2:
				return createAccentunderType2FromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM:
				return createAlignmentscopeTypeBaseItemFromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM1:
				return createAlignmentscopeTypeBaseItem1FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE1:
				return createAlignType1FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE2:
				return createAlignType2FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE5:
				return createAlignType5FromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER1:
				return createAltimgValignTypeMember1FromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER2:
				return createAltimgValignTypeMember2FromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER3:
				return createAltimgValignTypeMember3FromString(eDataType, initialValue);
			case MlPackage.BACKGROUND_TYPE_MEMBER1:
				return createBackgroundTypeMember1FromString(eDataType, initialValue);
			case MlPackage.BEVELLED_TYPE:
				return createBevelledTypeFromString(eDataType, initialValue);
			case MlPackage.BEVELLED_TYPE1:
				return createBevelledType1FromString(eDataType, initialValue);
			case MlPackage.CHARALIGN_TYPE:
				return createCharalignTypeFromString(eDataType, initialValue);
			case MlPackage.CHARALIGN_TYPE1:
				return createCharalignType1FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER1:
				return createCharspacingTypeMember1FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER11:
				return createCharspacingTypeMember11FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER2:
				return createCharspacingTypeMember2FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER21:
				return createCharspacingTypeMember21FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER3:
				return createCharspacingTypeMember3FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER31:
				return createCharspacingTypeMember31FromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGNSTYLE:
				return createColumnalignstyleFromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1:
				return createColumnwidthTypeBaseItemMember1FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER11:
				return createColumnwidthTypeBaseItemMember11FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2:
				return createColumnwidthTypeBaseItemMember2FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER21:
				return createColumnwidthTypeBaseItemMember21FromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE_ITEM:
				return createCrossoutTypeItemFromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE_ITEM1:
				return createCrossoutTypeItem1FromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE_ITEM2:
				return createCrossoutTypeItem2FromString(eDataType, initialValue);
			case MlPackage.DENOMALIGN_TYPE:
				return createDenomalignTypeFromString(eDataType, initialValue);
			case MlPackage.DENOMALIGN_TYPE1:
				return createDenomalignType1FromString(eDataType, initialValue);
			case MlPackage.DIR_TYPE:
				return createDirTypeFromString(eDataType, initialValue);
			case MlPackage.DIR_TYPE1:
				return createDirType1FromString(eDataType, initialValue);
			case MlPackage.DIR_TYPE2:
				return createDirType2FromString(eDataType, initialValue);
			case MlPackage.DISPLAYSTYLE_TYPE:
				return createDisplaystyleTypeFromString(eDataType, initialValue);
			case MlPackage.DISPLAYSTYLE_TYPE1:
				return createDisplaystyleType1FromString(eDataType, initialValue);
			case MlPackage.DISPLAY_TYPE:
				return createDisplayTypeFromString(eDataType, initialValue);
			case MlPackage.EDGE_TYPE:
				return createEdgeTypeFromString(eDataType, initialValue);
			case MlPackage.EDGE_TYPE1:
				return createEdgeType1FromString(eDataType, initialValue);
			case MlPackage.EQUALCOLUMNS_TYPE:
				return createEqualcolumnsTypeFromString(eDataType, initialValue);
			case MlPackage.EQUALCOLUMNS_TYPE1:
				return createEqualcolumnsType1FromString(eDataType, initialValue);
			case MlPackage.EQUALROWS_TYPE:
				return createEqualrowsTypeFromString(eDataType, initialValue);
			case MlPackage.EQUALROWS_TYPE1:
				return createEqualrowsType1FromString(eDataType, initialValue);
			case MlPackage.FENCE_TYPE:
				return createFenceTypeFromString(eDataType, initialValue);
			case MlPackage.FENCE_TYPE1:
				return createFenceType1FromString(eDataType, initialValue);
			case MlPackage.FONTSTYLE_TYPE:
				return createFontstyleTypeFromString(eDataType, initialValue);
			case MlPackage.FONTWEIGHT_TYPE:
				return createFontweightTypeFromString(eDataType, initialValue);
			case MlPackage.FORM_TYPE:
				return createFormTypeFromString(eDataType, initialValue);
			case MlPackage.FORM_TYPE1:
				return createFormType1FromString(eDataType, initialValue);
			case MlPackage.GROUP_ALIGNMENT:
				return createGroupAlignmentFromString(eDataType, initialValue);
			case MlPackage.GROUPALIGN_TYPE:
				return createGroupalignTypeFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNFIRST_TYPE:
				return createIndentalignfirstTypeFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNFIRST_TYPE1:
				return createIndentalignfirstType1FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNFIRST_TYPE2:
				return createIndentalignfirstType2FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNLAST_TYPE:
				return createIndentalignlastTypeFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNLAST_TYPE1:
				return createIndentalignlastType1FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNLAST_TYPE2:
				return createIndentalignlastType2FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGN_TYPE:
				return createIndentalignTypeFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGN_TYPE1:
				return createIndentalignType1FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGN_TYPE2:
				return createIndentalignType2FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1:
				return createIndentshiftfirstTypeMember1FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER11:
				return createIndentshiftfirstTypeMember11FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER12:
				return createIndentshiftfirstTypeMember12FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1:
				return createIndentshiftlastTypeMember1FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER11:
				return createIndentshiftlastTypeMember11FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER12:
				return createIndentshiftlastTypeMember12FromString(eDataType, initialValue);
			case MlPackage.INFIXLINEBREAKSTYLE_TYPE:
				return createInfixlinebreakstyleTypeFromString(eDataType, initialValue);
			case MlPackage.LARGEOP_TYPE:
				return createLargeopTypeFromString(eDataType, initialValue);
			case MlPackage.LARGEOP_TYPE1:
				return createLargeopType1FromString(eDataType, initialValue);
			case MlPackage.LINEBREAKSTYLE_TYPE:
				return createLinebreakstyleTypeFromString(eDataType, initialValue);
			case MlPackage.LINEBREAKSTYLE_TYPE1:
				return createLinebreakstyleType1FromString(eDataType, initialValue);
			case MlPackage.LINEBREAK_TYPE:
				return createLinebreakTypeFromString(eDataType, initialValue);
			case MlPackage.LINEBREAK_TYPE1:
				return createLinebreakType1FromString(eDataType, initialValue);
			case MlPackage.LINEBREAK_TYPE2:
				return createLinebreakType2FromString(eDataType, initialValue);
			case MlPackage.LINESTYLE:
				return createLinestyleFromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1:
				return createLinethicknessTypeMember1FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER11:
				return createLinethicknessTypeMember11FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2:
				return createLinethicknessTypeMember2FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER21:
				return createLinethicknessTypeMember21FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3:
				return createLinethicknessTypeMember3FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER31:
				return createLinethicknessTypeMember31FromString(eDataType, initialValue);
			case MlPackage.LOCATION_TYPE:
				return createLocationTypeFromString(eDataType, initialValue);
			case MlPackage.LOCATION_TYPE1:
				return createLocationType1FromString(eDataType, initialValue);
			case MlPackage.LOCATION_TYPE2:
				return createLocationType2FromString(eDataType, initialValue);
			case MlPackage.LONGDIVSTYLE_TYPE:
				return createLongdivstyleTypeFromString(eDataType, initialValue);
			case MlPackage.LONGDIVSTYLE_TYPE1:
				return createLongdivstyleType1FromString(eDataType, initialValue);
			case MlPackage.MATHBACKGROUND_TYPE_MEMBER1:
				return createMathbackgroundTypeMember1FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1:
				return createMathsizeTypeMember1FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER11:
				return createMathsizeTypeMember11FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER12:
				return createMathsizeTypeMember12FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2:
				return createMathsizeTypeMember2FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER21:
				return createMathsizeTypeMember21FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER22:
				return createMathsizeTypeMember22FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3:
				return createMathsizeTypeMember3FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER31:
				return createMathsizeTypeMember31FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER32:
				return createMathsizeTypeMember32FromString(eDataType, initialValue);
			case MlPackage.MATHVARIANT_TYPE:
				return createMathvariantTypeFromString(eDataType, initialValue);
			case MlPackage.MATHVARIANT_TYPE1:
				return createMathvariantType1FromString(eDataType, initialValue);
			case MlPackage.MATHVARIANT_TYPE2:
				return createMathvariantType2FromString(eDataType, initialValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER1:
				return createMaxsizeTypeMember1FromString(eDataType, initialValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER11:
				return createMaxsizeTypeMember11FromString(eDataType, initialValue);
			case MlPackage.MOVABLELIMITS_TYPE:
				return createMovablelimitsTypeFromString(eDataType, initialValue);
			case MlPackage.MOVABLELIMITS_TYPE1:
				return createMovablelimitsType1FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1:
				return createMslinethicknessTypeMember1FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER11:
				return createMslinethicknessTypeMember11FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2:
				return createMslinethicknessTypeMember2FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER21:
				return createMslinethicknessTypeMember21FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3:
				return createMslinethicknessTypeMember3FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER31:
				return createMslinethicknessTypeMember31FromString(eDataType, initialValue);
			case MlPackage.NOTATIONSTYLE:
				return createNotationstyleFromString(eDataType, initialValue);
			case MlPackage.NUMALIGN_TYPE:
				return createNumalignTypeFromString(eDataType, initialValue);
			case MlPackage.NUMALIGN_TYPE1:
				return createNumalignType1FromString(eDataType, initialValue);
			case MlPackage.OCCURRENCE_TYPE:
				return createOccurrenceTypeFromString(eDataType, initialValue);
			case MlPackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case MlPackage.OVERFLOW_TYPE:
				return createOverflowTypeFromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE:
				return createRowalignTypeFromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE2:
				return createRowalignType2FromString(eDataType, initialValue);
			case MlPackage.SEPARATOR_TYPE:
				return createSeparatorTypeFromString(eDataType, initialValue);
			case MlPackage.SEPARATOR_TYPE1:
				return createSeparatorType1FromString(eDataType, initialValue);
			case MlPackage.SIDE_TYPE:
				return createSideTypeFromString(eDataType, initialValue);
			case MlPackage.SIDE_TYPE1:
				return createSideType1FromString(eDataType, initialValue);
			case MlPackage.STACKALIGN_TYPE:
				return createStackalignTypeFromString(eDataType, initialValue);
			case MlPackage.STACKALIGN_TYPE1:
				return createStackalignType1FromString(eDataType, initialValue);
			case MlPackage.STRETCHY_TYPE:
				return createStretchyTypeFromString(eDataType, initialValue);
			case MlPackage.STRETCHY_TYPE1:
				return createStretchyType1FromString(eDataType, initialValue);
			case MlPackage.SYMMETRIC_TYPE:
				return createSymmetricTypeFromString(eDataType, initialValue);
			case MlPackage.SYMMETRIC_TYPE1:
				return createSymmetricType1FromString(eDataType, initialValue);
			case MlPackage.VERTICALALIGN:
				return createVerticalalignFromString(eDataType, initialValue);
			case MlPackage.WIDTH_TYPE_MEMBER1:
				return createWidthTypeMember1FromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE_OBJECT:
				return createAccentTypeObjectFromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE_OBJECT1:
				return createAccentTypeObject1FromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE_OBJECT2:
				return createAccentTypeObject2FromString(eDataType, initialValue);
			case MlPackage.ACCENT_TYPE_OBJECT3:
				return createAccentTypeObject3FromString(eDataType, initialValue);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT:
				return createAccentunderTypeObjectFromString(eDataType, initialValue);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT1:
				return createAccentunderTypeObject1FromString(eDataType, initialValue);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT2:
				return createAccentunderTypeObject2FromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE:
				return createAlignmentscopeTypeFromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE1:
				return createAlignmentscopeType1FromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE:
				return createAlignmentscopeTypeBaseFromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE1:
				return createAlignmentscopeTypeBase1FromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM_OBJECT:
				return createAlignmentscopeTypeBaseItemObjectFromString(eDataType, initialValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM_OBJECT1:
				return createAlignmentscopeTypeBaseItemObject1FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE3:
				return createAlignType3FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE4:
				return createAlignType4FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE_OBJECT1:
				return createAlignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE_OBJECT2:
				return createAlignTypeObject2FromString(eDataType, initialValue);
			case MlPackage.ALIGN_TYPE_OBJECT3:
				return createAlignTypeObject3FromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE:
				return createAltimgValignTypeFromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER1_OBJECT:
				return createAltimgValignTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER2_OBJECT:
				return createAltimgValignTypeMember2ObjectFromString(eDataType, initialValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER3_OBJECT:
				return createAltimgValignTypeMember3ObjectFromString(eDataType, initialValue);
			case MlPackage.BACKGROUND_TYPE:
				return createBackgroundTypeFromString(eDataType, initialValue);
			case MlPackage.BACKGROUND_TYPE_MEMBER1_OBJECT:
				return createBackgroundTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.BASE64:
				return createBase64FromString(eDataType, initialValue);
			case MlPackage.BEVELLED_TYPE_OBJECT:
				return createBevelledTypeObjectFromString(eDataType, initialValue);
			case MlPackage.BEVELLED_TYPE_OBJECT1:
				return createBevelledTypeObject1FromString(eDataType, initialValue);
			case MlPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case MlPackage.CHARALIGN_TYPE_OBJECT:
				return createCharalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.CHARALIGN_TYPE_OBJECT1:
				return createCharalignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE:
				return createCharspacingTypeFromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE1:
				return createCharspacingType1FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER1_OBJECT:
				return createCharspacingTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER1_OBJECT1:
				return createCharspacingTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER2_OBJECT:
				return createCharspacingTypeMember2ObjectFromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER2_OBJECT1:
				return createCharspacingTypeMember2Object1FromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER3_OBJECT:
				return createCharspacingTypeMember3ObjectFromString(eDataType, initialValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER3_OBJECT1:
				return createCharspacingTypeMember3Object1FromString(eDataType, initialValue);
			case MlPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGNSTYLE_OBJECT:
				return createColumnalignstyleObjectFromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGN_TYPE:
				return createColumnalignTypeFromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGN_TYPE1:
				return createColumnalignType1FromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGN_TYPE2:
				return createColumnalignType2FromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGN_TYPE_BASE:
				return createColumnalignTypeBaseFromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGN_TYPE_BASE1:
				return createColumnalignTypeBase1FromString(eDataType, initialValue);
			case MlPackage.COLUMNALIGN_TYPE_BASE2:
				return createColumnalignTypeBase2FromString(eDataType, initialValue);
			case MlPackage.COLUMNLINES_TYPE:
				return createColumnlinesTypeFromString(eDataType, initialValue);
			case MlPackage.COLUMNLINES_TYPE1:
				return createColumnlinesType1FromString(eDataType, initialValue);
			case MlPackage.COLUMNLINES_TYPE_BASE:
				return createColumnlinesTypeBaseFromString(eDataType, initialValue);
			case MlPackage.COLUMNLINES_TYPE_BASE1:
				return createColumnlinesTypeBase1FromString(eDataType, initialValue);
			case MlPackage.COLUMNSPACING_TYPE:
				return createColumnspacingTypeFromString(eDataType, initialValue);
			case MlPackage.COLUMNSPACING_TYPE1:
				return createColumnspacingType1FromString(eDataType, initialValue);
			case MlPackage.COLUMNSPACING_TYPE_BASE:
				return createColumnspacingTypeBaseFromString(eDataType, initialValue);
			case MlPackage.COLUMNSPACING_TYPE_BASE1:
				return createColumnspacingTypeBase1FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE:
				return createColumnwidthTypeFromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE1:
				return createColumnwidthType1FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE:
				return createColumnwidthTypeBaseFromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE1:
				return createColumnwidthTypeBase1FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM:
				return createColumnwidthTypeBaseItemFromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM1:
				return createColumnwidthTypeBaseItem1FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1_OBJECT:
				return createColumnwidthTypeBaseItemMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1_OBJECT1:
				return createColumnwidthTypeBaseItemMember1Object1FromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2_OBJECT:
				return createColumnwidthTypeBaseItemMember2ObjectFromString(eDataType, initialValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2_OBJECT1:
				return createColumnwidthTypeBaseItemMember2Object1FromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE:
				return createCrossoutTypeFromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE1:
				return createCrossoutType1FromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE2:
				return createCrossoutType2FromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT:
				return createCrossoutTypeItemObjectFromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT1:
				return createCrossoutTypeItemObject1FromString(eDataType, initialValue);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT2:
				return createCrossoutTypeItemObject2FromString(eDataType, initialValue);
			case MlPackage.DENOMALIGN_TYPE_OBJECT:
				return createDenomalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.DENOMALIGN_TYPE_OBJECT1:
				return createDenomalignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.DIR_TYPE_OBJECT:
				return createDirTypeObjectFromString(eDataType, initialValue);
			case MlPackage.DIR_TYPE_OBJECT1:
				return createDirTypeObject1FromString(eDataType, initialValue);
			case MlPackage.DIR_TYPE_OBJECT2:
				return createDirTypeObject2FromString(eDataType, initialValue);
			case MlPackage.DISPLAYSTYLE_TYPE_OBJECT:
				return createDisplaystyleTypeObjectFromString(eDataType, initialValue);
			case MlPackage.DISPLAYSTYLE_TYPE_OBJECT1:
				return createDisplaystyleTypeObject1FromString(eDataType, initialValue);
			case MlPackage.DISPLAY_TYPE_OBJECT:
				return createDisplayTypeObjectFromString(eDataType, initialValue);
			case MlPackage.EDGE_TYPE_OBJECT:
				return createEdgeTypeObjectFromString(eDataType, initialValue);
			case MlPackage.EDGE_TYPE_OBJECT1:
				return createEdgeTypeObject1FromString(eDataType, initialValue);
			case MlPackage.EQUALCOLUMNS_TYPE_OBJECT:
				return createEqualcolumnsTypeObjectFromString(eDataType, initialValue);
			case MlPackage.EQUALCOLUMNS_TYPE_OBJECT1:
				return createEqualcolumnsTypeObject1FromString(eDataType, initialValue);
			case MlPackage.EQUALROWS_TYPE_OBJECT:
				return createEqualrowsTypeObjectFromString(eDataType, initialValue);
			case MlPackage.EQUALROWS_TYPE_OBJECT1:
				return createEqualrowsTypeObject1FromString(eDataType, initialValue);
			case MlPackage.FENCE_TYPE_OBJECT:
				return createFenceTypeObjectFromString(eDataType, initialValue);
			case MlPackage.FENCE_TYPE_OBJECT1:
				return createFenceTypeObject1FromString(eDataType, initialValue);
			case MlPackage.FONTSTYLE_TYPE_OBJECT:
				return createFontstyleTypeObjectFromString(eDataType, initialValue);
			case MlPackage.FONTWEIGHT_TYPE_OBJECT:
				return createFontweightTypeObjectFromString(eDataType, initialValue);
			case MlPackage.FORM_TYPE_OBJECT:
				return createFormTypeObjectFromString(eDataType, initialValue);
			case MlPackage.FORM_TYPE_OBJECT1:
				return createFormTypeObject1FromString(eDataType, initialValue);
			case MlPackage.FRAMESPACING_TYPE:
				return createFramespacingTypeFromString(eDataType, initialValue);
			case MlPackage.FRAMESPACING_TYPE1:
				return createFramespacingType1FromString(eDataType, initialValue);
			case MlPackage.FRAMESPACING_TYPE_BASE:
				return createFramespacingTypeBaseFromString(eDataType, initialValue);
			case MlPackage.FRAMESPACING_TYPE_BASE1:
				return createFramespacingTypeBase1FromString(eDataType, initialValue);
			case MlPackage.FRAMESPACING_TYPE_BASE_ITEM:
				return createFramespacingTypeBaseItemFromString(eDataType, initialValue);
			case MlPackage.FRAMESPACING_TYPE_BASE_ITEM1:
				return createFramespacingTypeBaseItem1FromString(eDataType, initialValue);
			case MlPackage.GROUP_ALIGNMENT_LIST:
				return createGroupAlignmentListFromString(eDataType, initialValue);
			case MlPackage.GROUP_ALIGNMENT_LIST_BASE:
				return createGroupAlignmentListBaseFromString(eDataType, initialValue);
			case MlPackage.GROUP_ALIGNMENT_LIST_LIST:
				return createGroupAlignmentListListFromString(eDataType, initialValue);
			case MlPackage.GROUP_ALIGNMENT_OBJECT:
				return createGroupAlignmentObjectFromString(eDataType, initialValue);
			case MlPackage.GROUPALIGN_TYPE_OBJECT:
				return createGroupalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT:
				return createIndentalignfirstTypeObjectFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT1:
				return createIndentalignfirstTypeObject1FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT2:
				return createIndentalignfirstTypeObject2FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT:
				return createIndentalignlastTypeObjectFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT1:
				return createIndentalignlastTypeObject1FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT2:
				return createIndentalignlastTypeObject2FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGN_TYPE_OBJECT:
				return createIndentalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.INDENTALIGN_TYPE_OBJECT1:
				return createIndentalignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.INDENTALIGN_TYPE_OBJECT2:
				return createIndentalignTypeObject2FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE:
				return createIndentshiftfirstTypeFromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE1:
				return createIndentshiftfirstType1FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE2:
				return createIndentshiftfirstType2FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT:
				return createIndentshiftfirstTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT1:
				return createIndentshiftfirstTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT2:
				return createIndentshiftfirstTypeMember1Object2FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE:
				return createIndentshiftlastTypeFromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE1:
				return createIndentshiftlastType1FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE2:
				return createIndentshiftlastType2FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT:
				return createIndentshiftlastTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT1:
				return createIndentshiftlastTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT2:
				return createIndentshiftlastTypeMember1Object2FromString(eDataType, initialValue);
			case MlPackage.INFIXLINEBREAKSTYLE_TYPE_OBJECT:
				return createInfixlinebreakstyleTypeObjectFromString(eDataType, initialValue);
			case MlPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case MlPackage.LARGEOP_TYPE_OBJECT:
				return createLargeopTypeObjectFromString(eDataType, initialValue);
			case MlPackage.LARGEOP_TYPE_OBJECT1:
				return createLargeopTypeObject1FromString(eDataType, initialValue);
			case MlPackage.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case MlPackage.LINEBREAKSTYLE_TYPE_OBJECT:
				return createLinebreakstyleTypeObjectFromString(eDataType, initialValue);
			case MlPackage.LINEBREAKSTYLE_TYPE_OBJECT1:
				return createLinebreakstyleTypeObject1FromString(eDataType, initialValue);
			case MlPackage.LINEBREAK_TYPE_OBJECT:
				return createLinebreakTypeObjectFromString(eDataType, initialValue);
			case MlPackage.LINEBREAK_TYPE_OBJECT1:
				return createLinebreakTypeObject1FromString(eDataType, initialValue);
			case MlPackage.LINEBREAK_TYPE_OBJECT2:
				return createLinebreakTypeObject2FromString(eDataType, initialValue);
			case MlPackage.LINESTYLE_OBJECT:
				return createLinestyleObjectFromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE:
				return createLinethicknessTypeFromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE1:
				return createLinethicknessType1FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1_OBJECT:
				return createLinethicknessTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1_OBJECT1:
				return createLinethicknessTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2_OBJECT:
				return createLinethicknessTypeMember2ObjectFromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2_OBJECT1:
				return createLinethicknessTypeMember2Object1FromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3_OBJECT:
				return createLinethicknessTypeMember3ObjectFromString(eDataType, initialValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3_OBJECT1:
				return createLinethicknessTypeMember3Object1FromString(eDataType, initialValue);
			case MlPackage.LOCATION_TYPE_OBJECT:
				return createLocationTypeObjectFromString(eDataType, initialValue);
			case MlPackage.LOCATION_TYPE_OBJECT1:
				return createLocationTypeObject1FromString(eDataType, initialValue);
			case MlPackage.LOCATION_TYPE_OBJECT2:
				return createLocationTypeObject2FromString(eDataType, initialValue);
			case MlPackage.LONGDIVSTYLE_TYPE_OBJECT:
				return createLongdivstyleTypeObjectFromString(eDataType, initialValue);
			case MlPackage.LONGDIVSTYLE_TYPE_OBJECT1:
				return createLongdivstyleTypeObject1FromString(eDataType, initialValue);
			case MlPackage.MATHBACKGROUND_TYPE:
				return createMathbackgroundTypeFromString(eDataType, initialValue);
			case MlPackage.MATHBACKGROUND_TYPE_MEMBER1_OBJECT:
				return createMathbackgroundTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE:
				return createMathsizeTypeFromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE1:
				return createMathsizeType1FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE2:
				return createMathsizeType2FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT:
				return createMathsizeTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT1:
				return createMathsizeTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT2:
				return createMathsizeTypeMember1Object2FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT:
				return createMathsizeTypeMember2ObjectFromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT1:
				return createMathsizeTypeMember2Object1FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT2:
				return createMathsizeTypeMember2Object2FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT:
				return createMathsizeTypeMember3ObjectFromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT1:
				return createMathsizeTypeMember3Object1FromString(eDataType, initialValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT2:
				return createMathsizeTypeMember3Object2FromString(eDataType, initialValue);
			case MlPackage.MATHVARIANT_TYPE_OBJECT:
				return createMathvariantTypeObjectFromString(eDataType, initialValue);
			case MlPackage.MATHVARIANT_TYPE_OBJECT1:
				return createMathvariantTypeObject1FromString(eDataType, initialValue);
			case MlPackage.MATHVARIANT_TYPE_OBJECT2:
				return createMathvariantTypeObject2FromString(eDataType, initialValue);
			case MlPackage.MAXSIZE_TYPE:
				return createMaxsizeTypeFromString(eDataType, initialValue);
			case MlPackage.MAXSIZE_TYPE1:
				return createMaxsizeType1FromString(eDataType, initialValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER1_OBJECT:
				return createMaxsizeTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER1_OBJECT1:
				return createMaxsizeTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.MOVABLELIMITS_TYPE_OBJECT:
				return createMovablelimitsTypeObjectFromString(eDataType, initialValue);
			case MlPackage.MOVABLELIMITS_TYPE_OBJECT1:
				return createMovablelimitsTypeObject1FromString(eDataType, initialValue);
			case MlPackage.MPADDED_LENGTH:
				return createMpaddedLengthFromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE:
				return createMslinethicknessTypeFromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE1:
				return createMslinethicknessType1FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1_OBJECT:
				return createMslinethicknessTypeMember1ObjectFromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1_OBJECT1:
				return createMslinethicknessTypeMember1Object1FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2_OBJECT:
				return createMslinethicknessTypeMember2ObjectFromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2_OBJECT1:
				return createMslinethicknessTypeMember2Object1FromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3_OBJECT:
				return createMslinethicknessTypeMember3ObjectFromString(eDataType, initialValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3_OBJECT1:
				return createMslinethicknessTypeMember3Object1FromString(eDataType, initialValue);
			case MlPackage.NOTATIONSTYLE_OBJECT:
				return createNotationstyleObjectFromString(eDataType, initialValue);
			case MlPackage.NUMALIGN_TYPE_OBJECT:
				return createNumalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.NUMALIGN_TYPE_OBJECT1:
				return createNumalignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case MlPackage.OCCURRENCE_TYPE_OBJECT:
				return createOccurrenceTypeObjectFromString(eDataType, initialValue);
			case MlPackage.ORDER_TYPE_OBJECT:
				return createOrderTypeObjectFromString(eDataType, initialValue);
			case MlPackage.OVERFLOW_TYPE_OBJECT:
				return createOverflowTypeObjectFromString(eDataType, initialValue);
			case MlPackage.POSITIVE_INTEGER:
				return createPositiveIntegerFromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE1:
				return createRowalignType1FromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE3:
				return createRowalignType3FromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE_BASE:
				return createRowalignTypeBaseFromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE_BASE1:
				return createRowalignTypeBase1FromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE_OBJECT:
				return createRowalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.ROWALIGN_TYPE_OBJECT1:
				return createRowalignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.ROWLINES_TYPE:
				return createRowlinesTypeFromString(eDataType, initialValue);
			case MlPackage.ROWLINES_TYPE1:
				return createRowlinesType1FromString(eDataType, initialValue);
			case MlPackage.ROWLINES_TYPE_BASE:
				return createRowlinesTypeBaseFromString(eDataType, initialValue);
			case MlPackage.ROWLINES_TYPE_BASE1:
				return createRowlinesTypeBase1FromString(eDataType, initialValue);
			case MlPackage.ROWSPACING_TYPE:
				return createRowspacingTypeFromString(eDataType, initialValue);
			case MlPackage.ROWSPACING_TYPE1:
				return createRowspacingType1FromString(eDataType, initialValue);
			case MlPackage.ROWSPACING_TYPE_BASE:
				return createRowspacingTypeBaseFromString(eDataType, initialValue);
			case MlPackage.ROWSPACING_TYPE_BASE1:
				return createRowspacingTypeBase1FromString(eDataType, initialValue);
			case MlPackage.SEPARATOR_TYPE_OBJECT:
				return createSeparatorTypeObjectFromString(eDataType, initialValue);
			case MlPackage.SEPARATOR_TYPE_OBJECT1:
				return createSeparatorTypeObject1FromString(eDataType, initialValue);
			case MlPackage.SIDE_TYPE_OBJECT:
				return createSideTypeObjectFromString(eDataType, initialValue);
			case MlPackage.SIDE_TYPE_OBJECT1:
				return createSideTypeObject1FromString(eDataType, initialValue);
			case MlPackage.STACKALIGN_TYPE_OBJECT:
				return createStackalignTypeObjectFromString(eDataType, initialValue);
			case MlPackage.STACKALIGN_TYPE_OBJECT1:
				return createStackalignTypeObject1FromString(eDataType, initialValue);
			case MlPackage.STRETCHY_TYPE_OBJECT:
				return createStretchyTypeObjectFromString(eDataType, initialValue);
			case MlPackage.STRETCHY_TYPE_OBJECT1:
				return createStretchyTypeObject1FromString(eDataType, initialValue);
			case MlPackage.SYMBOL_NAME:
				return createSymbolNameFromString(eDataType, initialValue);
			case MlPackage.SYMMETRIC_TYPE_OBJECT:
				return createSymmetricTypeObjectFromString(eDataType, initialValue);
			case MlPackage.SYMMETRIC_TYPE_OBJECT1:
				return createSymmetricTypeObject1FromString(eDataType, initialValue);
			case MlPackage.UNSIGNED_INTEGER:
				return createUnsignedIntegerFromString(eDataType, initialValue);
			case MlPackage.VERTICALALIGN_OBJECT:
				return createVerticalalignObjectFromString(eDataType, initialValue);
			case MlPackage.WIDTH_TYPE:
				return createWidthTypeFromString(eDataType, initialValue);
			case MlPackage.WIDTH_TYPE_MEMBER1_OBJECT:
				return createWidthTypeMember1ObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MlPackage.ACCENT_TYPE:
				return convertAccentTypeToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE1:
				return convertAccentType1ToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE2:
				return convertAccentType2ToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE3:
				return convertAccentType3ToString(eDataType, instanceValue);
			case MlPackage.ACCENTUNDER_TYPE:
				return convertAccentunderTypeToString(eDataType, instanceValue);
			case MlPackage.ACCENTUNDER_TYPE1:
				return convertAccentunderType1ToString(eDataType, instanceValue);
			case MlPackage.ACCENTUNDER_TYPE2:
				return convertAccentunderType2ToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM:
				return convertAlignmentscopeTypeBaseItemToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM1:
				return convertAlignmentscopeTypeBaseItem1ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE1:
				return convertAlignType1ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE2:
				return convertAlignType2ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE5:
				return convertAlignType5ToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER1:
				return convertAltimgValignTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER2:
				return convertAltimgValignTypeMember2ToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER3:
				return convertAltimgValignTypeMember3ToString(eDataType, instanceValue);
			case MlPackage.BACKGROUND_TYPE_MEMBER1:
				return convertBackgroundTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.BEVELLED_TYPE:
				return convertBevelledTypeToString(eDataType, instanceValue);
			case MlPackage.BEVELLED_TYPE1:
				return convertBevelledType1ToString(eDataType, instanceValue);
			case MlPackage.CHARALIGN_TYPE:
				return convertCharalignTypeToString(eDataType, instanceValue);
			case MlPackage.CHARALIGN_TYPE1:
				return convertCharalignType1ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER1:
				return convertCharspacingTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER11:
				return convertCharspacingTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER2:
				return convertCharspacingTypeMember2ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER21:
				return convertCharspacingTypeMember21ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER3:
				return convertCharspacingTypeMember3ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER31:
				return convertCharspacingTypeMember31ToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGNSTYLE:
				return convertColumnalignstyleToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1:
				return convertColumnwidthTypeBaseItemMember1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER11:
				return convertColumnwidthTypeBaseItemMember11ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2:
				return convertColumnwidthTypeBaseItemMember2ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER21:
				return convertColumnwidthTypeBaseItemMember21ToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE_ITEM:
				return convertCrossoutTypeItemToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE_ITEM1:
				return convertCrossoutTypeItem1ToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE_ITEM2:
				return convertCrossoutTypeItem2ToString(eDataType, instanceValue);
			case MlPackage.DENOMALIGN_TYPE:
				return convertDenomalignTypeToString(eDataType, instanceValue);
			case MlPackage.DENOMALIGN_TYPE1:
				return convertDenomalignType1ToString(eDataType, instanceValue);
			case MlPackage.DIR_TYPE:
				return convertDirTypeToString(eDataType, instanceValue);
			case MlPackage.DIR_TYPE1:
				return convertDirType1ToString(eDataType, instanceValue);
			case MlPackage.DIR_TYPE2:
				return convertDirType2ToString(eDataType, instanceValue);
			case MlPackage.DISPLAYSTYLE_TYPE:
				return convertDisplaystyleTypeToString(eDataType, instanceValue);
			case MlPackage.DISPLAYSTYLE_TYPE1:
				return convertDisplaystyleType1ToString(eDataType, instanceValue);
			case MlPackage.DISPLAY_TYPE:
				return convertDisplayTypeToString(eDataType, instanceValue);
			case MlPackage.EDGE_TYPE:
				return convertEdgeTypeToString(eDataType, instanceValue);
			case MlPackage.EDGE_TYPE1:
				return convertEdgeType1ToString(eDataType, instanceValue);
			case MlPackage.EQUALCOLUMNS_TYPE:
				return convertEqualcolumnsTypeToString(eDataType, instanceValue);
			case MlPackage.EQUALCOLUMNS_TYPE1:
				return convertEqualcolumnsType1ToString(eDataType, instanceValue);
			case MlPackage.EQUALROWS_TYPE:
				return convertEqualrowsTypeToString(eDataType, instanceValue);
			case MlPackage.EQUALROWS_TYPE1:
				return convertEqualrowsType1ToString(eDataType, instanceValue);
			case MlPackage.FENCE_TYPE:
				return convertFenceTypeToString(eDataType, instanceValue);
			case MlPackage.FENCE_TYPE1:
				return convertFenceType1ToString(eDataType, instanceValue);
			case MlPackage.FONTSTYLE_TYPE:
				return convertFontstyleTypeToString(eDataType, instanceValue);
			case MlPackage.FONTWEIGHT_TYPE:
				return convertFontweightTypeToString(eDataType, instanceValue);
			case MlPackage.FORM_TYPE:
				return convertFormTypeToString(eDataType, instanceValue);
			case MlPackage.FORM_TYPE1:
				return convertFormType1ToString(eDataType, instanceValue);
			case MlPackage.GROUP_ALIGNMENT:
				return convertGroupAlignmentToString(eDataType, instanceValue);
			case MlPackage.GROUPALIGN_TYPE:
				return convertGroupalignTypeToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNFIRST_TYPE:
				return convertIndentalignfirstTypeToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNFIRST_TYPE1:
				return convertIndentalignfirstType1ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNFIRST_TYPE2:
				return convertIndentalignfirstType2ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNLAST_TYPE:
				return convertIndentalignlastTypeToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNLAST_TYPE1:
				return convertIndentalignlastType1ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNLAST_TYPE2:
				return convertIndentalignlastType2ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGN_TYPE:
				return convertIndentalignTypeToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGN_TYPE1:
				return convertIndentalignType1ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGN_TYPE2:
				return convertIndentalignType2ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1:
				return convertIndentshiftfirstTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER11:
				return convertIndentshiftfirstTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER12:
				return convertIndentshiftfirstTypeMember12ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1:
				return convertIndentshiftlastTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER11:
				return convertIndentshiftlastTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER12:
				return convertIndentshiftlastTypeMember12ToString(eDataType, instanceValue);
			case MlPackage.INFIXLINEBREAKSTYLE_TYPE:
				return convertInfixlinebreakstyleTypeToString(eDataType, instanceValue);
			case MlPackage.LARGEOP_TYPE:
				return convertLargeopTypeToString(eDataType, instanceValue);
			case MlPackage.LARGEOP_TYPE1:
				return convertLargeopType1ToString(eDataType, instanceValue);
			case MlPackage.LINEBREAKSTYLE_TYPE:
				return convertLinebreakstyleTypeToString(eDataType, instanceValue);
			case MlPackage.LINEBREAKSTYLE_TYPE1:
				return convertLinebreakstyleType1ToString(eDataType, instanceValue);
			case MlPackage.LINEBREAK_TYPE:
				return convertLinebreakTypeToString(eDataType, instanceValue);
			case MlPackage.LINEBREAK_TYPE1:
				return convertLinebreakType1ToString(eDataType, instanceValue);
			case MlPackage.LINEBREAK_TYPE2:
				return convertLinebreakType2ToString(eDataType, instanceValue);
			case MlPackage.LINESTYLE:
				return convertLinestyleToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1:
				return convertLinethicknessTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER11:
				return convertLinethicknessTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2:
				return convertLinethicknessTypeMember2ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER21:
				return convertLinethicknessTypeMember21ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3:
				return convertLinethicknessTypeMember3ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER31:
				return convertLinethicknessTypeMember31ToString(eDataType, instanceValue);
			case MlPackage.LOCATION_TYPE:
				return convertLocationTypeToString(eDataType, instanceValue);
			case MlPackage.LOCATION_TYPE1:
				return convertLocationType1ToString(eDataType, instanceValue);
			case MlPackage.LOCATION_TYPE2:
				return convertLocationType2ToString(eDataType, instanceValue);
			case MlPackage.LONGDIVSTYLE_TYPE:
				return convertLongdivstyleTypeToString(eDataType, instanceValue);
			case MlPackage.LONGDIVSTYLE_TYPE1:
				return convertLongdivstyleType1ToString(eDataType, instanceValue);
			case MlPackage.MATHBACKGROUND_TYPE_MEMBER1:
				return convertMathbackgroundTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1:
				return convertMathsizeTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER11:
				return convertMathsizeTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER12:
				return convertMathsizeTypeMember12ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2:
				return convertMathsizeTypeMember2ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER21:
				return convertMathsizeTypeMember21ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER22:
				return convertMathsizeTypeMember22ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3:
				return convertMathsizeTypeMember3ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER31:
				return convertMathsizeTypeMember31ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER32:
				return convertMathsizeTypeMember32ToString(eDataType, instanceValue);
			case MlPackage.MATHVARIANT_TYPE:
				return convertMathvariantTypeToString(eDataType, instanceValue);
			case MlPackage.MATHVARIANT_TYPE1:
				return convertMathvariantType1ToString(eDataType, instanceValue);
			case MlPackage.MATHVARIANT_TYPE2:
				return convertMathvariantType2ToString(eDataType, instanceValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER1:
				return convertMaxsizeTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER11:
				return convertMaxsizeTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.MOVABLELIMITS_TYPE:
				return convertMovablelimitsTypeToString(eDataType, instanceValue);
			case MlPackage.MOVABLELIMITS_TYPE1:
				return convertMovablelimitsType1ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1:
				return convertMslinethicknessTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER11:
				return convertMslinethicknessTypeMember11ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2:
				return convertMslinethicknessTypeMember2ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER21:
				return convertMslinethicknessTypeMember21ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3:
				return convertMslinethicknessTypeMember3ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER31:
				return convertMslinethicknessTypeMember31ToString(eDataType, instanceValue);
			case MlPackage.NOTATIONSTYLE:
				return convertNotationstyleToString(eDataType, instanceValue);
			case MlPackage.NUMALIGN_TYPE:
				return convertNumalignTypeToString(eDataType, instanceValue);
			case MlPackage.NUMALIGN_TYPE1:
				return convertNumalignType1ToString(eDataType, instanceValue);
			case MlPackage.OCCURRENCE_TYPE:
				return convertOccurrenceTypeToString(eDataType, instanceValue);
			case MlPackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case MlPackage.OVERFLOW_TYPE:
				return convertOverflowTypeToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE:
				return convertRowalignTypeToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE2:
				return convertRowalignType2ToString(eDataType, instanceValue);
			case MlPackage.SEPARATOR_TYPE:
				return convertSeparatorTypeToString(eDataType, instanceValue);
			case MlPackage.SEPARATOR_TYPE1:
				return convertSeparatorType1ToString(eDataType, instanceValue);
			case MlPackage.SIDE_TYPE:
				return convertSideTypeToString(eDataType, instanceValue);
			case MlPackage.SIDE_TYPE1:
				return convertSideType1ToString(eDataType, instanceValue);
			case MlPackage.STACKALIGN_TYPE:
				return convertStackalignTypeToString(eDataType, instanceValue);
			case MlPackage.STACKALIGN_TYPE1:
				return convertStackalignType1ToString(eDataType, instanceValue);
			case MlPackage.STRETCHY_TYPE:
				return convertStretchyTypeToString(eDataType, instanceValue);
			case MlPackage.STRETCHY_TYPE1:
				return convertStretchyType1ToString(eDataType, instanceValue);
			case MlPackage.SYMMETRIC_TYPE:
				return convertSymmetricTypeToString(eDataType, instanceValue);
			case MlPackage.SYMMETRIC_TYPE1:
				return convertSymmetricType1ToString(eDataType, instanceValue);
			case MlPackage.VERTICALALIGN:
				return convertVerticalalignToString(eDataType, instanceValue);
			case MlPackage.WIDTH_TYPE_MEMBER1:
				return convertWidthTypeMember1ToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE_OBJECT:
				return convertAccentTypeObjectToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE_OBJECT1:
				return convertAccentTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE_OBJECT2:
				return convertAccentTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.ACCENT_TYPE_OBJECT3:
				return convertAccentTypeObject3ToString(eDataType, instanceValue);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT:
				return convertAccentunderTypeObjectToString(eDataType, instanceValue);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT1:
				return convertAccentunderTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.ACCENTUNDER_TYPE_OBJECT2:
				return convertAccentunderTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE:
				return convertAlignmentscopeTypeToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE1:
				return convertAlignmentscopeType1ToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE:
				return convertAlignmentscopeTypeBaseToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE1:
				return convertAlignmentscopeTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM_OBJECT:
				return convertAlignmentscopeTypeBaseItemObjectToString(eDataType, instanceValue);
			case MlPackage.ALIGNMENTSCOPE_TYPE_BASE_ITEM_OBJECT1:
				return convertAlignmentscopeTypeBaseItemObject1ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE3:
				return convertAlignType3ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE4:
				return convertAlignType4ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE_OBJECT1:
				return convertAlignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE_OBJECT2:
				return convertAlignTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.ALIGN_TYPE_OBJECT3:
				return convertAlignTypeObject3ToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE:
				return convertAltimgValignTypeToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER1_OBJECT:
				return convertAltimgValignTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER2_OBJECT:
				return convertAltimgValignTypeMember2ObjectToString(eDataType, instanceValue);
			case MlPackage.ALTIMG_VALIGN_TYPE_MEMBER3_OBJECT:
				return convertAltimgValignTypeMember3ObjectToString(eDataType, instanceValue);
			case MlPackage.BACKGROUND_TYPE:
				return convertBackgroundTypeToString(eDataType, instanceValue);
			case MlPackage.BACKGROUND_TYPE_MEMBER1_OBJECT:
				return convertBackgroundTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.BASE64:
				return convertBase64ToString(eDataType, instanceValue);
			case MlPackage.BEVELLED_TYPE_OBJECT:
				return convertBevelledTypeObjectToString(eDataType, instanceValue);
			case MlPackage.BEVELLED_TYPE_OBJECT1:
				return convertBevelledTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case MlPackage.CHARALIGN_TYPE_OBJECT:
				return convertCharalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.CHARALIGN_TYPE_OBJECT1:
				return convertCharalignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE:
				return convertCharspacingTypeToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE1:
				return convertCharspacingType1ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER1_OBJECT:
				return convertCharspacingTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER1_OBJECT1:
				return convertCharspacingTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER2_OBJECT:
				return convertCharspacingTypeMember2ObjectToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER2_OBJECT1:
				return convertCharspacingTypeMember2Object1ToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER3_OBJECT:
				return convertCharspacingTypeMember3ObjectToString(eDataType, instanceValue);
			case MlPackage.CHARSPACING_TYPE_MEMBER3_OBJECT1:
				return convertCharspacingTypeMember3Object1ToString(eDataType, instanceValue);
			case MlPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGNSTYLE_OBJECT:
				return convertColumnalignstyleObjectToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGN_TYPE:
				return convertColumnalignTypeToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGN_TYPE1:
				return convertColumnalignType1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGN_TYPE2:
				return convertColumnalignType2ToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGN_TYPE_BASE:
				return convertColumnalignTypeBaseToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGN_TYPE_BASE1:
				return convertColumnalignTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNALIGN_TYPE_BASE2:
				return convertColumnalignTypeBase2ToString(eDataType, instanceValue);
			case MlPackage.COLUMNLINES_TYPE:
				return convertColumnlinesTypeToString(eDataType, instanceValue);
			case MlPackage.COLUMNLINES_TYPE1:
				return convertColumnlinesType1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNLINES_TYPE_BASE:
				return convertColumnlinesTypeBaseToString(eDataType, instanceValue);
			case MlPackage.COLUMNLINES_TYPE_BASE1:
				return convertColumnlinesTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNSPACING_TYPE:
				return convertColumnspacingTypeToString(eDataType, instanceValue);
			case MlPackage.COLUMNSPACING_TYPE1:
				return convertColumnspacingType1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNSPACING_TYPE_BASE:
				return convertColumnspacingTypeBaseToString(eDataType, instanceValue);
			case MlPackage.COLUMNSPACING_TYPE_BASE1:
				return convertColumnspacingTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE:
				return convertColumnwidthTypeToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE1:
				return convertColumnwidthType1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE:
				return convertColumnwidthTypeBaseToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE1:
				return convertColumnwidthTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM:
				return convertColumnwidthTypeBaseItemToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM1:
				return convertColumnwidthTypeBaseItem1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1_OBJECT:
				return convertColumnwidthTypeBaseItemMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER1_OBJECT1:
				return convertColumnwidthTypeBaseItemMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2_OBJECT:
				return convertColumnwidthTypeBaseItemMember2ObjectToString(eDataType, instanceValue);
			case MlPackage.COLUMNWIDTH_TYPE_BASE_ITEM_MEMBER2_OBJECT1:
				return convertColumnwidthTypeBaseItemMember2Object1ToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE:
				return convertCrossoutTypeToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE1:
				return convertCrossoutType1ToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE2:
				return convertCrossoutType2ToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT:
				return convertCrossoutTypeItemObjectToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT1:
				return convertCrossoutTypeItemObject1ToString(eDataType, instanceValue);
			case MlPackage.CROSSOUT_TYPE_ITEM_OBJECT2:
				return convertCrossoutTypeItemObject2ToString(eDataType, instanceValue);
			case MlPackage.DENOMALIGN_TYPE_OBJECT:
				return convertDenomalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.DENOMALIGN_TYPE_OBJECT1:
				return convertDenomalignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.DIR_TYPE_OBJECT:
				return convertDirTypeObjectToString(eDataType, instanceValue);
			case MlPackage.DIR_TYPE_OBJECT1:
				return convertDirTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.DIR_TYPE_OBJECT2:
				return convertDirTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.DISPLAYSTYLE_TYPE_OBJECT:
				return convertDisplaystyleTypeObjectToString(eDataType, instanceValue);
			case MlPackage.DISPLAYSTYLE_TYPE_OBJECT1:
				return convertDisplaystyleTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.DISPLAY_TYPE_OBJECT:
				return convertDisplayTypeObjectToString(eDataType, instanceValue);
			case MlPackage.EDGE_TYPE_OBJECT:
				return convertEdgeTypeObjectToString(eDataType, instanceValue);
			case MlPackage.EDGE_TYPE_OBJECT1:
				return convertEdgeTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.EQUALCOLUMNS_TYPE_OBJECT:
				return convertEqualcolumnsTypeObjectToString(eDataType, instanceValue);
			case MlPackage.EQUALCOLUMNS_TYPE_OBJECT1:
				return convertEqualcolumnsTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.EQUALROWS_TYPE_OBJECT:
				return convertEqualrowsTypeObjectToString(eDataType, instanceValue);
			case MlPackage.EQUALROWS_TYPE_OBJECT1:
				return convertEqualrowsTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.FENCE_TYPE_OBJECT:
				return convertFenceTypeObjectToString(eDataType, instanceValue);
			case MlPackage.FENCE_TYPE_OBJECT1:
				return convertFenceTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.FONTSTYLE_TYPE_OBJECT:
				return convertFontstyleTypeObjectToString(eDataType, instanceValue);
			case MlPackage.FONTWEIGHT_TYPE_OBJECT:
				return convertFontweightTypeObjectToString(eDataType, instanceValue);
			case MlPackage.FORM_TYPE_OBJECT:
				return convertFormTypeObjectToString(eDataType, instanceValue);
			case MlPackage.FORM_TYPE_OBJECT1:
				return convertFormTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.FRAMESPACING_TYPE:
				return convertFramespacingTypeToString(eDataType, instanceValue);
			case MlPackage.FRAMESPACING_TYPE1:
				return convertFramespacingType1ToString(eDataType, instanceValue);
			case MlPackage.FRAMESPACING_TYPE_BASE:
				return convertFramespacingTypeBaseToString(eDataType, instanceValue);
			case MlPackage.FRAMESPACING_TYPE_BASE1:
				return convertFramespacingTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.FRAMESPACING_TYPE_BASE_ITEM:
				return convertFramespacingTypeBaseItemToString(eDataType, instanceValue);
			case MlPackage.FRAMESPACING_TYPE_BASE_ITEM1:
				return convertFramespacingTypeBaseItem1ToString(eDataType, instanceValue);
			case MlPackage.GROUP_ALIGNMENT_LIST:
				return convertGroupAlignmentListToString(eDataType, instanceValue);
			case MlPackage.GROUP_ALIGNMENT_LIST_BASE:
				return convertGroupAlignmentListBaseToString(eDataType, instanceValue);
			case MlPackage.GROUP_ALIGNMENT_LIST_LIST:
				return convertGroupAlignmentListListToString(eDataType, instanceValue);
			case MlPackage.GROUP_ALIGNMENT_OBJECT:
				return convertGroupAlignmentObjectToString(eDataType, instanceValue);
			case MlPackage.GROUPALIGN_TYPE_OBJECT:
				return convertGroupalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT:
				return convertIndentalignfirstTypeObjectToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT1:
				return convertIndentalignfirstTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNFIRST_TYPE_OBJECT2:
				return convertIndentalignfirstTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT:
				return convertIndentalignlastTypeObjectToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT1:
				return convertIndentalignlastTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGNLAST_TYPE_OBJECT2:
				return convertIndentalignlastTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGN_TYPE_OBJECT:
				return convertIndentalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGN_TYPE_OBJECT1:
				return convertIndentalignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.INDENTALIGN_TYPE_OBJECT2:
				return convertIndentalignTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE:
				return convertIndentshiftfirstTypeToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE1:
				return convertIndentshiftfirstType1ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE2:
				return convertIndentshiftfirstType2ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT:
				return convertIndentshiftfirstTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT1:
				return convertIndentshiftfirstTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTFIRST_TYPE_MEMBER1_OBJECT2:
				return convertIndentshiftfirstTypeMember1Object2ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE:
				return convertIndentshiftlastTypeToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE1:
				return convertIndentshiftlastType1ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE2:
				return convertIndentshiftlastType2ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT:
				return convertIndentshiftlastTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT1:
				return convertIndentshiftlastTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.INDENTSHIFTLAST_TYPE_MEMBER1_OBJECT2:
				return convertIndentshiftlastTypeMember1Object2ToString(eDataType, instanceValue);
			case MlPackage.INFIXLINEBREAKSTYLE_TYPE_OBJECT:
				return convertInfixlinebreakstyleTypeObjectToString(eDataType, instanceValue);
			case MlPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case MlPackage.LARGEOP_TYPE_OBJECT:
				return convertLargeopTypeObjectToString(eDataType, instanceValue);
			case MlPackage.LARGEOP_TYPE_OBJECT1:
				return convertLargeopTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case MlPackage.LINEBREAKSTYLE_TYPE_OBJECT:
				return convertLinebreakstyleTypeObjectToString(eDataType, instanceValue);
			case MlPackage.LINEBREAKSTYLE_TYPE_OBJECT1:
				return convertLinebreakstyleTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.LINEBREAK_TYPE_OBJECT:
				return convertLinebreakTypeObjectToString(eDataType, instanceValue);
			case MlPackage.LINEBREAK_TYPE_OBJECT1:
				return convertLinebreakTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.LINEBREAK_TYPE_OBJECT2:
				return convertLinebreakTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.LINESTYLE_OBJECT:
				return convertLinestyleObjectToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE:
				return convertLinethicknessTypeToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE1:
				return convertLinethicknessType1ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1_OBJECT:
				return convertLinethicknessTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER1_OBJECT1:
				return convertLinethicknessTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2_OBJECT:
				return convertLinethicknessTypeMember2ObjectToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER2_OBJECT1:
				return convertLinethicknessTypeMember2Object1ToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3_OBJECT:
				return convertLinethicknessTypeMember3ObjectToString(eDataType, instanceValue);
			case MlPackage.LINETHICKNESS_TYPE_MEMBER3_OBJECT1:
				return convertLinethicknessTypeMember3Object1ToString(eDataType, instanceValue);
			case MlPackage.LOCATION_TYPE_OBJECT:
				return convertLocationTypeObjectToString(eDataType, instanceValue);
			case MlPackage.LOCATION_TYPE_OBJECT1:
				return convertLocationTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.LOCATION_TYPE_OBJECT2:
				return convertLocationTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.LONGDIVSTYLE_TYPE_OBJECT:
				return convertLongdivstyleTypeObjectToString(eDataType, instanceValue);
			case MlPackage.LONGDIVSTYLE_TYPE_OBJECT1:
				return convertLongdivstyleTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.MATHBACKGROUND_TYPE:
				return convertMathbackgroundTypeToString(eDataType, instanceValue);
			case MlPackage.MATHBACKGROUND_TYPE_MEMBER1_OBJECT:
				return convertMathbackgroundTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE:
				return convertMathsizeTypeToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE1:
				return convertMathsizeType1ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE2:
				return convertMathsizeType2ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT:
				return convertMathsizeTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT1:
				return convertMathsizeTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER1_OBJECT2:
				return convertMathsizeTypeMember1Object2ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT:
				return convertMathsizeTypeMember2ObjectToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT1:
				return convertMathsizeTypeMember2Object1ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER2_OBJECT2:
				return convertMathsizeTypeMember2Object2ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT:
				return convertMathsizeTypeMember3ObjectToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT1:
				return convertMathsizeTypeMember3Object1ToString(eDataType, instanceValue);
			case MlPackage.MATHSIZE_TYPE_MEMBER3_OBJECT2:
				return convertMathsizeTypeMember3Object2ToString(eDataType, instanceValue);
			case MlPackage.MATHVARIANT_TYPE_OBJECT:
				return convertMathvariantTypeObjectToString(eDataType, instanceValue);
			case MlPackage.MATHVARIANT_TYPE_OBJECT1:
				return convertMathvariantTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.MATHVARIANT_TYPE_OBJECT2:
				return convertMathvariantTypeObject2ToString(eDataType, instanceValue);
			case MlPackage.MAXSIZE_TYPE:
				return convertMaxsizeTypeToString(eDataType, instanceValue);
			case MlPackage.MAXSIZE_TYPE1:
				return convertMaxsizeType1ToString(eDataType, instanceValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER1_OBJECT:
				return convertMaxsizeTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.MAXSIZE_TYPE_MEMBER1_OBJECT1:
				return convertMaxsizeTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.MOVABLELIMITS_TYPE_OBJECT:
				return convertMovablelimitsTypeObjectToString(eDataType, instanceValue);
			case MlPackage.MOVABLELIMITS_TYPE_OBJECT1:
				return convertMovablelimitsTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.MPADDED_LENGTH:
				return convertMpaddedLengthToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE:
				return convertMslinethicknessTypeToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE1:
				return convertMslinethicknessType1ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1_OBJECT:
				return convertMslinethicknessTypeMember1ObjectToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER1_OBJECT1:
				return convertMslinethicknessTypeMember1Object1ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2_OBJECT:
				return convertMslinethicknessTypeMember2ObjectToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER2_OBJECT1:
				return convertMslinethicknessTypeMember2Object1ToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3_OBJECT:
				return convertMslinethicknessTypeMember3ObjectToString(eDataType, instanceValue);
			case MlPackage.MSLINETHICKNESS_TYPE_MEMBER3_OBJECT1:
				return convertMslinethicknessTypeMember3Object1ToString(eDataType, instanceValue);
			case MlPackage.NOTATIONSTYLE_OBJECT:
				return convertNotationstyleObjectToString(eDataType, instanceValue);
			case MlPackage.NUMALIGN_TYPE_OBJECT:
				return convertNumalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.NUMALIGN_TYPE_OBJECT1:
				return convertNumalignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case MlPackage.OCCURRENCE_TYPE_OBJECT:
				return convertOccurrenceTypeObjectToString(eDataType, instanceValue);
			case MlPackage.ORDER_TYPE_OBJECT:
				return convertOrderTypeObjectToString(eDataType, instanceValue);
			case MlPackage.OVERFLOW_TYPE_OBJECT:
				return convertOverflowTypeObjectToString(eDataType, instanceValue);
			case MlPackage.POSITIVE_INTEGER:
				return convertPositiveIntegerToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE1:
				return convertRowalignType1ToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE3:
				return convertRowalignType3ToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE_BASE:
				return convertRowalignTypeBaseToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE_BASE1:
				return convertRowalignTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE_OBJECT:
				return convertRowalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.ROWALIGN_TYPE_OBJECT1:
				return convertRowalignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.ROWLINES_TYPE:
				return convertRowlinesTypeToString(eDataType, instanceValue);
			case MlPackage.ROWLINES_TYPE1:
				return convertRowlinesType1ToString(eDataType, instanceValue);
			case MlPackage.ROWLINES_TYPE_BASE:
				return convertRowlinesTypeBaseToString(eDataType, instanceValue);
			case MlPackage.ROWLINES_TYPE_BASE1:
				return convertRowlinesTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.ROWSPACING_TYPE:
				return convertRowspacingTypeToString(eDataType, instanceValue);
			case MlPackage.ROWSPACING_TYPE1:
				return convertRowspacingType1ToString(eDataType, instanceValue);
			case MlPackage.ROWSPACING_TYPE_BASE:
				return convertRowspacingTypeBaseToString(eDataType, instanceValue);
			case MlPackage.ROWSPACING_TYPE_BASE1:
				return convertRowspacingTypeBase1ToString(eDataType, instanceValue);
			case MlPackage.SEPARATOR_TYPE_OBJECT:
				return convertSeparatorTypeObjectToString(eDataType, instanceValue);
			case MlPackage.SEPARATOR_TYPE_OBJECT1:
				return convertSeparatorTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.SIDE_TYPE_OBJECT:
				return convertSideTypeObjectToString(eDataType, instanceValue);
			case MlPackage.SIDE_TYPE_OBJECT1:
				return convertSideTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.STACKALIGN_TYPE_OBJECT:
				return convertStackalignTypeObjectToString(eDataType, instanceValue);
			case MlPackage.STACKALIGN_TYPE_OBJECT1:
				return convertStackalignTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.STRETCHY_TYPE_OBJECT:
				return convertStretchyTypeObjectToString(eDataType, instanceValue);
			case MlPackage.STRETCHY_TYPE_OBJECT1:
				return convertStretchyTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.SYMBOL_NAME:
				return convertSymbolNameToString(eDataType, instanceValue);
			case MlPackage.SYMMETRIC_TYPE_OBJECT:
				return convertSymmetricTypeObjectToString(eDataType, instanceValue);
			case MlPackage.SYMMETRIC_TYPE_OBJECT1:
				return convertSymmetricTypeObject1ToString(eDataType, instanceValue);
			case MlPackage.UNSIGNED_INTEGER:
				return convertUnsignedIntegerToString(eDataType, instanceValue);
			case MlPackage.VERTICALALIGN_OBJECT:
				return convertVerticalalignObjectToString(eDataType, instanceValue);
			case MlPackage.WIDTH_TYPE:
				return convertWidthTypeToString(eDataType, instanceValue);
			case MlPackage.WIDTH_TYPE_MEMBER1_OBJECT:
				return convertWidthTypeMember1ObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsType createAbsType() {
		AbsTypeImpl absType = new AbsTypeImpl();
		return absType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationXmlModel createAnnotationXmlModel() {
		AnnotationXmlModelImpl annotationXmlModel = new AnnotationXmlModelImpl();
		return annotationXmlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationXmlType createAnnotationXmlType() {
		AnnotationXmlTypeImpl annotationXmlType = new AnnotationXmlTypeImpl();
		return annotationXmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplyContent createApplyContent() {
		ApplyContentImpl applyContent = new ApplyContentImpl();
		return applyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplyType createApplyType() {
		ApplyTypeImpl applyType = new ApplyTypeImpl();
		return applyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApproxType createApproxType() {
		ApproxTypeImpl approxType = new ApproxTypeImpl();
		return approxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgType createArgType() {
		ArgTypeImpl argType = new ArgTypeImpl();
		return argType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLinalgClassType createBinaryLinalgClassType() {
		BinaryLinalgClassTypeImpl binaryLinalgClassType = new BinaryLinalgClassTypeImpl();
		return binaryLinalgClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalClassType createBinaryLogicalClassType() {
		BinaryLogicalClassTypeImpl binaryLogicalClassType = new BinaryLogicalClassTypeImpl();
		return binaryLogicalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySetClassType createBinarySetClassType() {
		BinarySetClassTypeImpl binarySetClassType = new BinarySetClassTypeImpl();
		return binarySetClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindContent createBindContent() {
		BindContentImpl bindContent = new BindContentImpl();
		return bindContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindType createBindType() {
		BindTypeImpl bindType = new BindTypeImpl();
		return bindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BvarType createBvarType() {
		BvarTypeImpl bvarType = new BvarTypeImpl();
		return bvarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CbytesType createCbytesType() {
		CbytesTypeImpl cbytesType = new CbytesTypeImpl();
		return cbytesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CeilingType createCeilingType() {
		CeilingTypeImpl ceilingType = new CeilingTypeImpl();
		return ceilingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CerrorType createCerrorType() {
		CerrorTypeImpl cerrorType = new CerrorTypeImpl();
		return cerrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiContent createCiContent() {
		CiContentImpl ciContent = new CiContentImpl();
		return ciContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiType createCiType() {
		CiTypeImpl ciType = new CiTypeImpl();
		return ciType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnContent createCnContent() {
		CnContentImpl cnContent = new CnContentImpl();
		return cnContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnType createCnType() {
		CnTypeImpl cnType = new CnTypeImpl();
		return cnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugateType createConjugateType() {
		ConjugateTypeImpl conjugateType = new ConjugateTypeImpl();
		return conjugateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantArithClassType createConstantArithClassType() {
		ConstantArithClassTypeImpl constantArithClassType = new ConstantArithClassTypeImpl();
		return constantArithClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantSetClassType createConstantSetClassType() {
		ConstantSetClassTypeImpl constantSetClassType = new ConstantSetClassTypeImpl();
		return constantSetClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsType createCsType() {
		CsTypeImpl csType = new CsTypeImpl();
		return csType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsymbolContent createCsymbolContent() {
		CsymbolContentImpl csymbolContent = new CsymbolContentImpl();
		return csymbolContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CsymbolType createCsymbolType() {
		CsymbolTypeImpl csymbolType = new CsymbolTypeImpl();
		return csymbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclareType createDeclareType() {
		DeclareTypeImpl declareType = new DeclareTypeImpl();
		return declareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeType createDegreeType() {
		DegreeTypeImpl degreeType = new DegreeTypeImpl();
		return degreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifferentialOperatorClassType createDifferentialOperatorClassType() {
		DifferentialOperatorClassTypeImpl differentialOperatorClassType = new DifferentialOperatorClassTypeImpl();
		return differentialOperatorClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivideType createDivideType() {
		DivideTypeImpl divideType = new DivideTypeImpl();
		return divideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainofapplicationType createDomainofapplicationType() {
		DomainofapplicationTypeImpl domainofapplicationType = new DomainofapplicationTypeImpl();
		return domainofapplicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpType createExpType() {
		ExpTypeImpl expType = new ExpTypeImpl();
		return expType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FactorialType createFactorialType() {
		FactorialTypeImpl factorialType = new FactorialTypeImpl();
		return factorialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FactorofType createFactorofType() {
		FactorofTypeImpl factorofType = new FactorofTypeImpl();
		return factorofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorType createFloorType() {
		FloorTypeImpl floorType = new FloorTypeImpl();
		return floorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FnType createFnType() {
		FnTypeImpl fnType = new FnTypeImpl();
		return fnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImaginaryType createImaginaryType() {
		ImaginaryTypeImpl imaginaryType = new ImaginaryTypeImpl();
		return imaginaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpliedMrow createImpliedMrow() {
		ImpliedMrowImpl impliedMrow = new ImpliedMrowImpl();
		return impliedMrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntClassType createIntClassType() {
		IntClassTypeImpl intClassType = new IntClassTypeImpl();
		return intClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervalClassType createIntervalClassType() {
		IntervalClassTypeImpl intervalClassType = new IntervalClassTypeImpl();
		return intervalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaClassType createLambdaClassType() {
		LambdaClassTypeImpl lambdaClassType = new LambdaClassTypeImpl();
		return lambdaClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LimitClassType createLimitClassType() {
		LimitClassTypeImpl limitClassType = new LimitClassTypeImpl();
		return limitClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogbaseType createLogbaseType() {
		LogbaseTypeImpl logbaseType = new LogbaseTypeImpl();
		return logbaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowlimitType createLowlimitType() {
		LowlimitTypeImpl lowlimitType = new LowlimitTypeImpl();
		return lowlimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MactionType createMactionType() {
		MactionTypeImpl mactionType = new MactionTypeImpl();
		return mactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaligngroupType createMaligngroupType() {
		MaligngroupTypeImpl maligngroupType = new MaligngroupTypeImpl();
		return maligngroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MalignmarkType createMalignmarkType() {
		MalignmarkTypeImpl malignmarkType = new MalignmarkTypeImpl();
		return malignmarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathType createMathType() {
		MathTypeImpl mathType = new MathTypeImpl();
		return mathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MencloseType createMencloseType() {
		MencloseTypeImpl mencloseType = new MencloseTypeImpl();
		return mencloseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MerrorType createMerrorType() {
		MerrorTypeImpl merrorType = new MerrorTypeImpl();
		return merrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MfencedType createMfencedType() {
		MfencedTypeImpl mfencedType = new MfencedTypeImpl();
		return mfencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MfracType createMfracType() {
		MfracTypeImpl mfracType = new MfracTypeImpl();
		return mfracType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MglyphType createMglyphType() {
		MglyphTypeImpl mglyphType = new MglyphTypeImpl();
		return mglyphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinusType createMinusType() {
		MinusTypeImpl minusType = new MinusTypeImpl();
		return minusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiType createMiType() {
		MiTypeImpl miType = new MiTypeImpl();
		return miType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlabeledtrType createMlabeledtrType() {
		MlabeledtrTypeImpl mlabeledtrType = new MlabeledtrTypeImpl();
		return mlabeledtrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlongdivType createMlongdivType() {
		MlongdivTypeImpl mlongdivType = new MlongdivTypeImpl();
		return mlongdivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MmultiscriptsType createMmultiscriptsType() {
		MmultiscriptsTypeImpl mmultiscriptsType = new MmultiscriptsTypeImpl();
		return mmultiscriptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MnType createMnType() {
		MnTypeImpl mnType = new MnTypeImpl();
		return mnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MomentaboutType createMomentaboutType() {
		MomentaboutTypeImpl momentaboutType = new MomentaboutTypeImpl();
		return momentaboutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoType createMoType() {
		MoTypeImpl moType = new MoTypeImpl();
		return moType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoverType createMoverType() {
		MoverTypeImpl moverType = new MoverTypeImpl();
		return moverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MpaddedType createMpaddedType() {
		MpaddedTypeImpl mpaddedType = new MpaddedTypeImpl();
		return mpaddedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MphantomType createMphantomType() {
		MphantomTypeImpl mphantomType = new MphantomTypeImpl();
		return mphantomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MprescriptsType createMprescriptsType() {
		MprescriptsTypeImpl mprescriptsType = new MprescriptsTypeImpl();
		return mprescriptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrootType createMrootType() {
		MrootTypeImpl mrootType = new MrootTypeImpl();
		return mrootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrowType createMrowType() {
		MrowTypeImpl mrowType = new MrowTypeImpl();
		return mrowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MscarriesType createMscarriesType() {
		MscarriesTypeImpl mscarriesType = new MscarriesTypeImpl();
		return mscarriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MscarryType createMscarryType() {
		MscarryTypeImpl mscarryType = new MscarryTypeImpl();
		return mscarryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsgroupType createMsgroupType() {
		MsgroupTypeImpl msgroupType = new MsgroupTypeImpl();
		return msgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MslineType createMslineType() {
		MslineTypeImpl mslineType = new MslineTypeImpl();
		return mslineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MspaceType createMspaceType() {
		MspaceTypeImpl mspaceType = new MspaceTypeImpl();
		return mspaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsqrtType createMsqrtType() {
		MsqrtTypeImpl msqrtType = new MsqrtTypeImpl();
		return msqrtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsrowType createMsrowType() {
		MsrowTypeImpl msrowType = new MsrowTypeImpl();
		return msrowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MstackType createMstackType() {
		MstackTypeImpl mstackType = new MstackTypeImpl();
		return mstackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MstyleType createMstyleType() {
		MstyleTypeImpl mstyleType = new MstyleTypeImpl();
		return mstyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsType createMsType() {
		MsTypeImpl msType = new MsTypeImpl();
		return msType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsubsupType createMsubsupType() {
		MsubsupTypeImpl msubsupType = new MsubsupTypeImpl();
		return msubsupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsubType createMsubType() {
		MsubTypeImpl msubType = new MsubTypeImpl();
		return msubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsupType createMsupType() {
		MsupTypeImpl msupType = new MsupTypeImpl();
		return msupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MtableType createMtableType() {
		MtableTypeImpl mtableType = new MtableTypeImpl();
		return mtableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MtextType createMtextType() {
		MtextTypeImpl mtextType = new MtextTypeImpl();
		return mtextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MtrType createMtrType() {
		MtrTypeImpl mtrType = new MtrTypeImpl();
		return mtrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MunderoverType createMunderoverType() {
		MunderoverTypeImpl munderoverType = new MunderoverTypeImpl();
		return munderoverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MunderType createMunderType() {
		MunderTypeImpl munderType = new MunderTypeImpl();
		return munderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryArithClassType createNaryArithClassType() {
		NaryArithClassTypeImpl naryArithClassType = new NaryArithClassTypeImpl();
		return naryArithClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryConstructorClassType createNaryConstructorClassType() {
		NaryConstructorClassTypeImpl naryConstructorClassType = new NaryConstructorClassTypeImpl();
		return naryConstructorClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryFunctionalClassType createNaryFunctionalClassType() {
		NaryFunctionalClassTypeImpl naryFunctionalClassType = new NaryFunctionalClassTypeImpl();
		return naryFunctionalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLinalgClassType createNaryLinalgClassType() {
		NaryLinalgClassTypeImpl naryLinalgClassType = new NaryLinalgClassTypeImpl();
		return naryLinalgClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryLogicalClassType createNaryLogicalClassType() {
		NaryLogicalClassTypeImpl naryLogicalClassType = new NaryLogicalClassTypeImpl();
		return naryLogicalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryMinmaxClassType createNaryMinmaxClassType() {
		NaryMinmaxClassTypeImpl naryMinmaxClassType = new NaryMinmaxClassTypeImpl();
		return naryMinmaxClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelnClassType createNaryRelnClassType() {
		NaryRelnClassTypeImpl naryRelnClassType = new NaryRelnClassTypeImpl();
		return naryRelnClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetClassType createNarySetClassType() {
		NarySetClassTypeImpl narySetClassType = new NarySetClassTypeImpl();
		return narySetClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarySetRelnClassType createNarySetRelnClassType() {
		NarySetRelnClassTypeImpl narySetRelnClassType = new NarySetRelnClassTypeImpl();
		return narySetRelnClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryStatsClassType createNaryStatsClassType() {
		NaryStatsClassTypeImpl naryStatsClassType = new NaryStatsClassTypeImpl();
		return naryStatsClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeqType createNeqType() {
		NeqTypeImpl neqType = new NeqTypeImpl();
		return neqType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoneType createNoneType() {
		NoneTypeImpl noneType = new NoneTypeImpl();
		return noneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherwiseType createOtherwiseType() {
		OtherwiseTypeImpl otherwiseType = new OtherwiseTypeImpl();
		return otherwiseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialdiffClassType createPartialdiffClassType() {
		PartialdiffClassTypeImpl partialdiffClassType = new PartialdiffClassTypeImpl();
		return partialdiffClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PieceType createPieceType() {
		PieceTypeImpl pieceType = new PieceTypeImpl();
		return pieceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PiecewiseType createPiecewiseType() {
		PiecewiseTypeImpl piecewiseType = new PiecewiseTypeImpl();
		return piecewiseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType createPowerType() {
		PowerTypeImpl powerType = new PowerTypeImpl();
		return powerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductClassType createProductClassType() {
		ProductClassTypeImpl productClassType = new ProductClassTypeImpl();
		return productClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierClassType createQuantifierClassType() {
		QuantifierClassTypeImpl quantifierClassType = new QuantifierClassTypeImpl();
		return quantifierClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuotientType createQuotientType() {
		QuotientTypeImpl quotientType = new QuotientTypeImpl();
		return quotientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelnType createRelnType() {
		RelnTypeImpl relnType = new RelnTypeImpl();
		return relnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemType createRemType() {
		RemTypeImpl remType = new RemTypeImpl();
		return remType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootType createRootType() {
		RootTypeImpl rootType = new RootTypeImpl();
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SepType createSepType() {
		SepTypeImpl sepType = new SepTypeImpl();
		return sepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShareType createShareType() {
		ShareTypeImpl shareType = new ShareTypeImpl();
		return shareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SumClassType createSumClassType() {
		SumClassTypeImpl sumClassType = new SumClassTypeImpl();
		return sumClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCellExpressionType createTableCellExpressionType() {
		TableCellExpressionTypeImpl tableCellExpressionType = new TableCellExpressionTypeImpl();
		return tableCellExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TendstoType createTendstoType() {
		TendstoTypeImpl tendstoType = new TendstoTypeImpl();
		return tendstoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementaryClassType createUnaryElementaryClassType() {
		UnaryElementaryClassTypeImpl unaryElementaryClassType = new UnaryElementaryClassTypeImpl();
		return unaryElementaryClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryFunctionalClassType createUnaryFunctionalClassType() {
		UnaryFunctionalClassTypeImpl unaryFunctionalClassType = new UnaryFunctionalClassTypeImpl();
		return unaryFunctionalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLinalgClassType createUnaryLinalgClassType() {
		UnaryLinalgClassTypeImpl unaryLinalgClassType = new UnaryLinalgClassTypeImpl();
		return unaryLinalgClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicalClassType createUnaryLogicalClassType() {
		UnaryLogicalClassTypeImpl unaryLogicalClassType = new UnaryLogicalClassTypeImpl();
		return unaryLogicalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnarySetClassType createUnarySetClassType() {
		UnarySetClassTypeImpl unarySetClassType = new UnarySetClassTypeImpl();
		return unarySetClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryVeccalcClassType createUnaryVeccalcClassType() {
		UnaryVeccalcClassTypeImpl unaryVeccalcClassType = new UnaryVeccalcClassTypeImpl();
		return unaryVeccalcClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UplimitType createUplimitType() {
		UplimitTypeImpl uplimitType = new UplimitTypeImpl();
		return uplimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType createAccentTypeFromString(EDataType eDataType, String initialValue) {
		AccentType result = AccentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType1 createAccentType1FromString(EDataType eDataType, String initialValue) {
		AccentType1 result = AccentType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType2 createAccentType2FromString(EDataType eDataType, String initialValue) {
		AccentType2 result = AccentType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType3 createAccentType3FromString(EDataType eDataType, String initialValue) {
		AccentType3 result = AccentType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentunderType createAccentunderTypeFromString(EDataType eDataType, String initialValue) {
		AccentunderType result = AccentunderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentunderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentunderType1 createAccentunderType1FromString(EDataType eDataType, String initialValue) {
		AccentunderType1 result = AccentunderType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentunderType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentunderType2 createAccentunderType2FromString(EDataType eDataType, String initialValue) {
		AccentunderType2 result = AccentunderType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentunderType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentscopeTypeBaseItem createAlignmentscopeTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		AlignmentscopeTypeBaseItem result = AlignmentscopeTypeBaseItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentscopeTypeBaseItem1 createAlignmentscopeTypeBaseItem1FromString(EDataType eDataType, String initialValue) {
		AlignmentscopeTypeBaseItem1 result = AlignmentscopeTypeBaseItem1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeBaseItem1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType1 createAlignType1FromString(EDataType eDataType, String initialValue) {
		AlignType1 result = AlignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType2 createAlignType2FromString(EDataType eDataType, String initialValue) {
		AlignType2 result = AlignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType5 createAlignType5FromString(EDataType eDataType, String initialValue) {
		AlignType5 result = AlignType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltimgValignTypeMember1 createAltimgValignTypeMember1FromString(EDataType eDataType, String initialValue) {
		AltimgValignTypeMember1 result = AltimgValignTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltimgValignTypeMember2 createAltimgValignTypeMember2FromString(EDataType eDataType, String initialValue) {
		AltimgValignTypeMember2 result = AltimgValignTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltimgValignTypeMember3 createAltimgValignTypeMember3FromString(EDataType eDataType, String initialValue) {
		AltimgValignTypeMember3 result = AltimgValignTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundTypeMember1 createBackgroundTypeMember1FromString(EDataType eDataType, String initialValue) {
		BackgroundTypeMember1 result = BackgroundTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BevelledType createBevelledTypeFromString(EDataType eDataType, String initialValue) {
		BevelledType result = BevelledType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBevelledTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BevelledType1 createBevelledType1FromString(EDataType eDataType, String initialValue) {
		BevelledType1 result = BevelledType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBevelledType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharalignType createCharalignTypeFromString(EDataType eDataType, String initialValue) {
		CharalignType result = CharalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharalignType1 createCharalignType1FromString(EDataType eDataType, String initialValue) {
		CharalignType1 result = CharalignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharalignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember1 createCharspacingTypeMember1FromString(EDataType eDataType, String initialValue) {
		CharspacingTypeMember1 result = CharspacingTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember11 createCharspacingTypeMember11FromString(EDataType eDataType, String initialValue) {
		CharspacingTypeMember11 result = CharspacingTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember2 createCharspacingTypeMember2FromString(EDataType eDataType, String initialValue) {
		CharspacingTypeMember2 result = CharspacingTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember21 createCharspacingTypeMember21FromString(EDataType eDataType, String initialValue) {
		CharspacingTypeMember21 result = CharspacingTypeMember21.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember21ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember3 createCharspacingTypeMember3FromString(EDataType eDataType, String initialValue) {
		CharspacingTypeMember3 result = CharspacingTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember31 createCharspacingTypeMember31FromString(EDataType eDataType, String initialValue) {
		CharspacingTypeMember31 result = CharspacingTypeMember31.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember31ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnalignstyle createColumnalignstyleFromString(EDataType eDataType, String initialValue) {
		Columnalignstyle result = Columnalignstyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignstyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember1 createColumnwidthTypeBaseItemMember1FromString(EDataType eDataType, String initialValue) {
		ColumnwidthTypeBaseItemMember1 result = ColumnwidthTypeBaseItemMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember11 createColumnwidthTypeBaseItemMember11FromString(EDataType eDataType, String initialValue) {
		ColumnwidthTypeBaseItemMember11 result = ColumnwidthTypeBaseItemMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember2 createColumnwidthTypeBaseItemMember2FromString(EDataType eDataType, String initialValue) {
		ColumnwidthTypeBaseItemMember2 result = ColumnwidthTypeBaseItemMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember21 createColumnwidthTypeBaseItemMember21FromString(EDataType eDataType, String initialValue) {
		ColumnwidthTypeBaseItemMember21 result = ColumnwidthTypeBaseItemMember21.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember21ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossoutTypeItem createCrossoutTypeItemFromString(EDataType eDataType, String initialValue) {
		CrossoutTypeItem result = CrossoutTypeItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossoutTypeItem1 createCrossoutTypeItem1FromString(EDataType eDataType, String initialValue) {
		CrossoutTypeItem1 result = CrossoutTypeItem1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeItem1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossoutTypeItem2 createCrossoutTypeItem2FromString(EDataType eDataType, String initialValue) {
		CrossoutTypeItem2 result = CrossoutTypeItem2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeItem2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DenomalignType createDenomalignTypeFromString(EDataType eDataType, String initialValue) {
		DenomalignType result = DenomalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDenomalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DenomalignType1 createDenomalignType1FromString(EDataType eDataType, String initialValue) {
		DenomalignType1 result = DenomalignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDenomalignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeFromString(EDataType eDataType, String initialValue) {
		DirType result = DirType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirType1FromString(EDataType eDataType, String initialValue) {
		DirType1 result = DirType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType2 createDirType2FromString(EDataType eDataType, String initialValue) {
		DirType2 result = DirType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplaystyleType createDisplaystyleTypeFromString(EDataType eDataType, String initialValue) {
		DisplaystyleType result = DisplaystyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplaystyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplaystyleType1 createDisplaystyleType1FromString(EDataType eDataType, String initialValue) {
		DisplaystyleType1 result = DisplaystyleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplaystyleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType createDisplayTypeFromString(EDataType eDataType, String initialValue) {
		DisplayType result = DisplayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType createEdgeTypeFromString(EDataType eDataType, String initialValue) {
		EdgeType result = EdgeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType1 createEdgeType1FromString(EDataType eDataType, String initialValue) {
		EdgeType1 result = EdgeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualcolumnsType createEqualcolumnsTypeFromString(EDataType eDataType, String initialValue) {
		EqualcolumnsType result = EqualcolumnsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualcolumnsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualcolumnsType1 createEqualcolumnsType1FromString(EDataType eDataType, String initialValue) {
		EqualcolumnsType1 result = EqualcolumnsType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualcolumnsType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualrowsType createEqualrowsTypeFromString(EDataType eDataType, String initialValue) {
		EqualrowsType result = EqualrowsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualrowsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualrowsType1 createEqualrowsType1FromString(EDataType eDataType, String initialValue) {
		EqualrowsType1 result = EqualrowsType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualrowsType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FenceType createFenceTypeFromString(EDataType eDataType, String initialValue) {
		FenceType result = FenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FenceType1 createFenceType1FromString(EDataType eDataType, String initialValue) {
		FenceType1 result = FenceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFenceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontstyleType createFontstyleTypeFromString(EDataType eDataType, String initialValue) {
		FontstyleType result = FontstyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontstyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontweightType createFontweightTypeFromString(EDataType eDataType, String initialValue) {
		FontweightType result = FontweightType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontweightTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType createFormTypeFromString(EDataType eDataType, String initialValue) {
		FormType result = FormType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType1 createFormType1FromString(EDataType eDataType, String initialValue) {
		FormType1 result = FormType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupAlignment createGroupAlignmentFromString(EDataType eDataType, String initialValue) {
		GroupAlignment result = GroupAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupalignType createGroupalignTypeFromString(EDataType eDataType, String initialValue) {
		GroupalignType result = GroupalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignfirstType createIndentalignfirstTypeFromString(EDataType eDataType, String initialValue) {
		IndentalignfirstType result = IndentalignfirstType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignfirstTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignfirstType1 createIndentalignfirstType1FromString(EDataType eDataType, String initialValue) {
		IndentalignfirstType1 result = IndentalignfirstType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignfirstType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignfirstType2 createIndentalignfirstType2FromString(EDataType eDataType, String initialValue) {
		IndentalignfirstType2 result = IndentalignfirstType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignfirstType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignlastType createIndentalignlastTypeFromString(EDataType eDataType, String initialValue) {
		IndentalignlastType result = IndentalignlastType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignlastTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignlastType1 createIndentalignlastType1FromString(EDataType eDataType, String initialValue) {
		IndentalignlastType1 result = IndentalignlastType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignlastType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignlastType2 createIndentalignlastType2FromString(EDataType eDataType, String initialValue) {
		IndentalignlastType2 result = IndentalignlastType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignlastType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignType createIndentalignTypeFromString(EDataType eDataType, String initialValue) {
		IndentalignType result = IndentalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignType1 createIndentalignType1FromString(EDataType eDataType, String initialValue) {
		IndentalignType1 result = IndentalignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignType2 createIndentalignType2FromString(EDataType eDataType, String initialValue) {
		IndentalignType2 result = IndentalignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftfirstTypeMember1 createIndentshiftfirstTypeMember1FromString(EDataType eDataType, String initialValue) {
		IndentshiftfirstTypeMember1 result = IndentshiftfirstTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftfirstTypeMember11 createIndentshiftfirstTypeMember11FromString(EDataType eDataType, String initialValue) {
		IndentshiftfirstTypeMember11 result = IndentshiftfirstTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftfirstTypeMember12 createIndentshiftfirstTypeMember12FromString(EDataType eDataType, String initialValue) {
		IndentshiftfirstTypeMember12 result = IndentshiftfirstTypeMember12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeMember12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftlastTypeMember1 createIndentshiftlastTypeMember1FromString(EDataType eDataType, String initialValue) {
		IndentshiftlastTypeMember1 result = IndentshiftlastTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftlastTypeMember11 createIndentshiftlastTypeMember11FromString(EDataType eDataType, String initialValue) {
		IndentshiftlastTypeMember11 result = IndentshiftlastTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftlastTypeMember12 createIndentshiftlastTypeMember12FromString(EDataType eDataType, String initialValue) {
		IndentshiftlastTypeMember12 result = IndentshiftlastTypeMember12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeMember12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixlinebreakstyleType createInfixlinebreakstyleTypeFromString(EDataType eDataType, String initialValue) {
		InfixlinebreakstyleType result = InfixlinebreakstyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfixlinebreakstyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeopType createLargeopTypeFromString(EDataType eDataType, String initialValue) {
		LargeopType result = LargeopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLargeopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeopType1 createLargeopType1FromString(EDataType eDataType, String initialValue) {
		LargeopType1 result = LargeopType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLargeopType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakstyleType createLinebreakstyleTypeFromString(EDataType eDataType, String initialValue) {
		LinebreakstyleType result = LinebreakstyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakstyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakstyleType1 createLinebreakstyleType1FromString(EDataType eDataType, String initialValue) {
		LinebreakstyleType1 result = LinebreakstyleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakstyleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakType createLinebreakTypeFromString(EDataType eDataType, String initialValue) {
		LinebreakType result = LinebreakType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakType1 createLinebreakType1FromString(EDataType eDataType, String initialValue) {
		LinebreakType1 result = LinebreakType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakType2 createLinebreakType2FromString(EDataType eDataType, String initialValue) {
		LinebreakType2 result = LinebreakType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linestyle createLinestyleFromString(EDataType eDataType, String initialValue) {
		Linestyle result = Linestyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinestyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember1 createLinethicknessTypeMember1FromString(EDataType eDataType, String initialValue) {
		LinethicknessTypeMember1 result = LinethicknessTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember11 createLinethicknessTypeMember11FromString(EDataType eDataType, String initialValue) {
		LinethicknessTypeMember11 result = LinethicknessTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember2 createLinethicknessTypeMember2FromString(EDataType eDataType, String initialValue) {
		LinethicknessTypeMember2 result = LinethicknessTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember21 createLinethicknessTypeMember21FromString(EDataType eDataType, String initialValue) {
		LinethicknessTypeMember21 result = LinethicknessTypeMember21.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember21ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember3 createLinethicknessTypeMember3FromString(EDataType eDataType, String initialValue) {
		LinethicknessTypeMember3 result = LinethicknessTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember31 createLinethicknessTypeMember31FromString(EDataType eDataType, String initialValue) {
		LinethicknessTypeMember31 result = LinethicknessTypeMember31.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember31ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationTypeFromString(EDataType eDataType, String initialValue) {
		LocationType result = LocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType1 createLocationType1FromString(EDataType eDataType, String initialValue) {
		LocationType1 result = LocationType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType2 createLocationType2FromString(EDataType eDataType, String initialValue) {
		LocationType2 result = LocationType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongdivstyleType createLongdivstyleTypeFromString(EDataType eDataType, String initialValue) {
		LongdivstyleType result = LongdivstyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongdivstyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongdivstyleType1 createLongdivstyleType1FromString(EDataType eDataType, String initialValue) {
		LongdivstyleType1 result = LongdivstyleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongdivstyleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathbackgroundTypeMember1 createMathbackgroundTypeMember1FromString(EDataType eDataType, String initialValue) {
		MathbackgroundTypeMember1 result = MathbackgroundTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathbackgroundTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember1 createMathsizeTypeMember1FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember1 result = MathsizeTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember11 createMathsizeTypeMember11FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember11 result = MathsizeTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember12 createMathsizeTypeMember12FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember12 result = MathsizeTypeMember12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember2 createMathsizeTypeMember2FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember2 result = MathsizeTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember21 createMathsizeTypeMember21FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember21 result = MathsizeTypeMember21.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember21ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember22 createMathsizeTypeMember22FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember22 result = MathsizeTypeMember22.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember22ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember3 createMathsizeTypeMember3FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember3 result = MathsizeTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember31 createMathsizeTypeMember31FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember31 result = MathsizeTypeMember31.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember31ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember32 createMathsizeTypeMember32FromString(EDataType eDataType, String initialValue) {
		MathsizeTypeMember32 result = MathsizeTypeMember32.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember32ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathvariantType createMathvariantTypeFromString(EDataType eDataType, String initialValue) {
		MathvariantType result = MathvariantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathvariantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathvariantType1 createMathvariantType1FromString(EDataType eDataType, String initialValue) {
		MathvariantType1 result = MathvariantType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathvariantType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathvariantType2 createMathvariantType2FromString(EDataType eDataType, String initialValue) {
		MathvariantType2 result = MathvariantType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathvariantType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxsizeTypeMember1 createMaxsizeTypeMember1FromString(EDataType eDataType, String initialValue) {
		MaxsizeTypeMember1 result = MaxsizeTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxsizeTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxsizeTypeMember11 createMaxsizeTypeMember11FromString(EDataType eDataType, String initialValue) {
		MaxsizeTypeMember11 result = MaxsizeTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxsizeTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovablelimitsType createMovablelimitsTypeFromString(EDataType eDataType, String initialValue) {
		MovablelimitsType result = MovablelimitsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovablelimitsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovablelimitsType1 createMovablelimitsType1FromString(EDataType eDataType, String initialValue) {
		MovablelimitsType1 result = MovablelimitsType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovablelimitsType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember1 createMslinethicknessTypeMember1FromString(EDataType eDataType, String initialValue) {
		MslinethicknessTypeMember1 result = MslinethicknessTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember11 createMslinethicknessTypeMember11FromString(EDataType eDataType, String initialValue) {
		MslinethicknessTypeMember11 result = MslinethicknessTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember2 createMslinethicknessTypeMember2FromString(EDataType eDataType, String initialValue) {
		MslinethicknessTypeMember2 result = MslinethicknessTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember21 createMslinethicknessTypeMember21FromString(EDataType eDataType, String initialValue) {
		MslinethicknessTypeMember21 result = MslinethicknessTypeMember21.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember21ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember3 createMslinethicknessTypeMember3FromString(EDataType eDataType, String initialValue) {
		MslinethicknessTypeMember3 result = MslinethicknessTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember31 createMslinethicknessTypeMember31FromString(EDataType eDataType, String initialValue) {
		MslinethicknessTypeMember31 result = MslinethicknessTypeMember31.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember31ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notationstyle createNotationstyleFromString(EDataType eDataType, String initialValue) {
		Notationstyle result = Notationstyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationstyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumalignType createNumalignTypeFromString(EDataType eDataType, String initialValue) {
		NumalignType result = NumalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumalignType1 createNumalignType1FromString(EDataType eDataType, String initialValue) {
		NumalignType1 result = NumalignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumalignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceType createOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		OccurrenceType result = OccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowType createOverflowTypeFromString(EDataType eDataType, String initialValue) {
		OverflowType result = OverflowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowalignType createRowalignTypeFromString(EDataType eDataType, String initialValue) {
		RowalignType result = RowalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowalignType2 createRowalignType2FromString(EDataType eDataType, String initialValue) {
		RowalignType2 result = RowalignType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparatorType createSeparatorTypeFromString(EDataType eDataType, String initialValue) {
		SeparatorType result = SeparatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparatorType1 createSeparatorType1FromString(EDataType eDataType, String initialValue) {
		SeparatorType1 result = SeparatorType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparatorType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SideType createSideTypeFromString(EDataType eDataType, String initialValue) {
		SideType result = SideType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SideType1 createSideType1FromString(EDataType eDataType, String initialValue) {
		SideType1 result = SideType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackalignType createStackalignTypeFromString(EDataType eDataType, String initialValue) {
		StackalignType result = StackalignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackalignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackalignType1 createStackalignType1FromString(EDataType eDataType, String initialValue) {
		StackalignType1 result = StackalignType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackalignType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchyType createStretchyTypeFromString(EDataType eDataType, String initialValue) {
		StretchyType result = StretchyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStretchyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchyType1 createStretchyType1FromString(EDataType eDataType, String initialValue) {
		StretchyType1 result = StretchyType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStretchyType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricType createSymmetricTypeFromString(EDataType eDataType, String initialValue) {
		SymmetricType result = SymmetricType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetricTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricType1 createSymmetricType1FromString(EDataType eDataType, String initialValue) {
		SymmetricType1 result = SymmetricType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetricType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verticalalign createVerticalalignFromString(EDataType eDataType, String initialValue) {
		Verticalalign result = Verticalalign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalalignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthTypeMember1 createWidthTypeMember1FromString(EDataType eDataType, String initialValue) {
		WidthTypeMember1 result = WidthTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidthTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType createAccentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccentTypeFromString(MlPackage.eINSTANCE.getAccentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccentTypeToString(MlPackage.eINSTANCE.getAccentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType1 createAccentTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAccentType1FromString(MlPackage.eINSTANCE.getAccentType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAccentType1ToString(MlPackage.eINSTANCE.getAccentType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType2 createAccentTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createAccentType2FromString(MlPackage.eINSTANCE.getAccentType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertAccentType2ToString(MlPackage.eINSTANCE.getAccentType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentType3 createAccentTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createAccentType3FromString(MlPackage.eINSTANCE.getAccentType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertAccentType3ToString(MlPackage.eINSTANCE.getAccentType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentunderType1 createAccentunderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccentunderType1FromString(MlPackage.eINSTANCE.getAccentunderType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentunderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccentunderType1ToString(MlPackage.eINSTANCE.getAccentunderType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentunderType createAccentunderTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAccentunderTypeFromString(MlPackage.eINSTANCE.getAccentunderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentunderTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAccentunderTypeToString(MlPackage.eINSTANCE.getAccentunderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccentunderType2 createAccentunderTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createAccentunderType2FromString(MlPackage.eINSTANCE.getAccentunderType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccentunderTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertAccentunderType2ToString(MlPackage.eINSTANCE.getAccentunderType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AlignmentscopeTypeBaseItem> createAlignmentscopeTypeFromString(EDataType eDataType, String initialValue) {
		return createAlignmentscopeTypeBaseFromString(MlPackage.eINSTANCE.getAlignmentscopeTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentscopeTypeBaseToString(MlPackage.eINSTANCE.getAlignmentscopeTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AlignmentscopeTypeBaseItem1> createAlignmentscopeType1FromString(EDataType eDataType, String initialValue) {
		return createAlignmentscopeTypeBase1FromString(MlPackage.eINSTANCE.getAlignmentscopeTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeType1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentscopeTypeBase1ToString(MlPackage.eINSTANCE.getAlignmentscopeTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AlignmentscopeTypeBaseItem> createAlignmentscopeTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<AlignmentscopeTypeBaseItem> result = new ArrayList<AlignmentscopeTypeBaseItem>();
		for (String item : split(initialValue)) {
			result.add(createAlignmentscopeTypeBaseItemFromString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertAlignmentscopeTypeBaseItemToString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AlignmentscopeTypeBaseItem1> createAlignmentscopeTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<AlignmentscopeTypeBaseItem1> result = new ArrayList<AlignmentscopeTypeBaseItem1>();
		for (String item : split(initialValue)) {
			result.add(createAlignmentscopeTypeBaseItem1FromString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem1(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertAlignmentscopeTypeBaseItem1ToString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem1(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentscopeTypeBaseItem createAlignmentscopeTypeBaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignmentscopeTypeBaseItemFromString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeBaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentscopeTypeBaseItemToString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentscopeTypeBaseItem1 createAlignmentscopeTypeBaseItemObject1FromString(EDataType eDataType, String initialValue) {
		return createAlignmentscopeTypeBaseItem1FromString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentscopeTypeBaseItemObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentscopeTypeBaseItem1ToString(MlPackage.eINSTANCE.getAlignmentscopeTypeBaseItem1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAlignType3FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAlignType4FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignType4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(MlPackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(MlPackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType2 createAlignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAlignType2FromString(MlPackage.eINSTANCE.getAlignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType2ToString(MlPackage.eINSTANCE.getAlignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType1 createAlignTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createAlignType1FromString(MlPackage.eINSTANCE.getAlignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType1ToString(MlPackage.eINSTANCE.getAlignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType5 createAlignTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createAlignType5FromString(MlPackage.eINSTANCE.getAlignType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertAlignType5ToString(MlPackage.eINSTANCE.getAlignType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAltimgValignTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createAltimgValignTypeMember1FromString(MlPackage.eINSTANCE.getAltimgValignTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createAltimgValignTypeMember2FromString(MlPackage.eINSTANCE.getAltimgValignTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createAltimgValignTypeMember3FromString(MlPackage.eINSTANCE.getAltimgValignTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getAltimgValignTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertAltimgValignTypeMember1ToString(MlPackage.eINSTANCE.getAltimgValignTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getAltimgValignTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertAltimgValignTypeMember2ToString(MlPackage.eINSTANCE.getAltimgValignTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getAltimgValignTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertAltimgValignTypeMember3ToString(MlPackage.eINSTANCE.getAltimgValignTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltimgValignTypeMember1 createAltimgValignTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createAltimgValignTypeMember1FromString(MlPackage.eINSTANCE.getAltimgValignTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAltimgValignTypeMember1ToString(MlPackage.eINSTANCE.getAltimgValignTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltimgValignTypeMember2 createAltimgValignTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createAltimgValignTypeMember2FromString(MlPackage.eINSTANCE.getAltimgValignTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAltimgValignTypeMember2ToString(MlPackage.eINSTANCE.getAltimgValignTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltimgValignTypeMember3 createAltimgValignTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createAltimgValignTypeMember3FromString(MlPackage.eINSTANCE.getAltimgValignTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltimgValignTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAltimgValignTypeMember3ToString(MlPackage.eINSTANCE.getAltimgValignTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBackgroundTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createColorFromString(MlPackage.eINSTANCE.getColor(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBackgroundTypeMember1FromString(MlPackage.eINSTANCE.getBackgroundTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getColor().isInstance(instanceValue)) {
			try {
				String value = convertColorToString(MlPackage.eINSTANCE.getColor(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getBackgroundTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertBackgroundTypeMember1ToString(MlPackage.eINSTANCE.getBackgroundTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundTypeMember1 createBackgroundTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createBackgroundTypeMember1FromString(MlPackage.eINSTANCE.getBackgroundTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBackgroundTypeMember1ToString(MlPackage.eINSTANCE.getBackgroundTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64FromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BevelledType createBevelledTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBevelledTypeFromString(MlPackage.eINSTANCE.getBevelledType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBevelledTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBevelledTypeToString(MlPackage.eINSTANCE.getBevelledType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BevelledType1 createBevelledTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createBevelledType1FromString(MlPackage.eINSTANCE.getBevelledType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBevelledTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertBevelledType1ToString(MlPackage.eINSTANCE.getBevelledType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharacterFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharalignType createCharalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCharalignTypeFromString(MlPackage.eINSTANCE.getCharalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCharalignTypeToString(MlPackage.eINSTANCE.getCharalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharalignType1 createCharalignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createCharalignType1FromString(MlPackage.eINSTANCE.getCharalignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharalignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertCharalignType1ToString(MlPackage.eINSTANCE.getCharalignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCharspacingTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCharspacingTypeMember1FromString(MlPackage.eINSTANCE.getCharspacingTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCharspacingTypeMember2FromString(MlPackage.eINSTANCE.getCharspacingTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCharspacingTypeMember3FromString(MlPackage.eINSTANCE.getCharspacingTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getCharspacingTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertCharspacingTypeMember1ToString(MlPackage.eINSTANCE.getCharspacingTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getCharspacingTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertCharspacingTypeMember2ToString(MlPackage.eINSTANCE.getCharspacingTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getCharspacingTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertCharspacingTypeMember3ToString(MlPackage.eINSTANCE.getCharspacingTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCharspacingType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCharspacingTypeMember11FromString(MlPackage.eINSTANCE.getCharspacingTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCharspacingTypeMember21FromString(MlPackage.eINSTANCE.getCharspacingTypeMember21(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCharspacingTypeMember31FromString(MlPackage.eINSTANCE.getCharspacingTypeMember31(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getCharspacingTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertCharspacingTypeMember11ToString(MlPackage.eINSTANCE.getCharspacingTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getCharspacingTypeMember21().isInstance(instanceValue)) {
			try {
				String value = convertCharspacingTypeMember21ToString(MlPackage.eINSTANCE.getCharspacingTypeMember21(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getCharspacingTypeMember31().isInstance(instanceValue)) {
			try {
				String value = convertCharspacingTypeMember31ToString(MlPackage.eINSTANCE.getCharspacingTypeMember31(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember1 createCharspacingTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createCharspacingTypeMember1FromString(MlPackage.eINSTANCE.getCharspacingTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCharspacingTypeMember1ToString(MlPackage.eINSTANCE.getCharspacingTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember11 createCharspacingTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createCharspacingTypeMember11FromString(MlPackage.eINSTANCE.getCharspacingTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertCharspacingTypeMember11ToString(MlPackage.eINSTANCE.getCharspacingTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember2 createCharspacingTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createCharspacingTypeMember2FromString(MlPackage.eINSTANCE.getCharspacingTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCharspacingTypeMember2ToString(MlPackage.eINSTANCE.getCharspacingTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember21 createCharspacingTypeMember2Object1FromString(EDataType eDataType, String initialValue) {
		return createCharspacingTypeMember21FromString(MlPackage.eINSTANCE.getCharspacingTypeMember21(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember2Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertCharspacingTypeMember21ToString(MlPackage.eINSTANCE.getCharspacingTypeMember21(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember3 createCharspacingTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createCharspacingTypeMember3FromString(MlPackage.eINSTANCE.getCharspacingTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCharspacingTypeMember3ToString(MlPackage.eINSTANCE.getCharspacingTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharspacingTypeMember31 createCharspacingTypeMember3Object1FromString(EDataType eDataType, String initialValue) {
		return createCharspacingTypeMember31FromString(MlPackage.eINSTANCE.getCharspacingTypeMember31(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharspacingTypeMember3Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertCharspacingTypeMember31ToString(MlPackage.eINSTANCE.getCharspacingTypeMember31(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnalignstyle createColumnalignstyleObjectFromString(EDataType eDataType, String initialValue) {
		return createColumnalignstyleFromString(MlPackage.eINSTANCE.getColumnalignstyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignstyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColumnalignstyleToString(MlPackage.eINSTANCE.getColumnalignstyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Columnalignstyle> createColumnalignTypeFromString(EDataType eDataType, String initialValue) {
		return createColumnalignTypeBaseFromString(MlPackage.eINSTANCE.getColumnalignTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignTypeToString(EDataType eDataType, Object instanceValue) {
		return convertColumnalignTypeBaseToString(MlPackage.eINSTANCE.getColumnalignTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Columnalignstyle> createColumnalignType1FromString(EDataType eDataType, String initialValue) {
		return createColumnalignTypeBase1FromString(MlPackage.eINSTANCE.getColumnalignTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignType1ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnalignTypeBase1ToString(MlPackage.eINSTANCE.getColumnalignTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Columnalignstyle> createColumnalignType2FromString(EDataType eDataType, String initialValue) {
		return createColumnalignTypeBase2FromString(MlPackage.eINSTANCE.getColumnalignTypeBase2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignType2ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnalignTypeBase2ToString(MlPackage.eINSTANCE.getColumnalignTypeBase2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Columnalignstyle> createColumnalignTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Columnalignstyle> result = new ArrayList<Columnalignstyle>();
		for (String item : split(initialValue)) {
			result.add(createColumnalignstyleFromString(MlPackage.eINSTANCE.getColumnalignstyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertColumnalignstyleToString(MlPackage.eINSTANCE.getColumnalignstyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Columnalignstyle> createColumnalignTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Columnalignstyle> result = new ArrayList<Columnalignstyle>();
		for (String item : split(initialValue)) {
			result.add(createColumnalignstyleFromString(MlPackage.eINSTANCE.getColumnalignstyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertColumnalignstyleToString(MlPackage.eINSTANCE.getColumnalignstyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Columnalignstyle> createColumnalignTypeBase2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Columnalignstyle> result = new ArrayList<Columnalignstyle>();
		for (String item : split(initialValue)) {
			result.add(createColumnalignstyleFromString(MlPackage.eINSTANCE.getColumnalignstyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnalignTypeBase2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertColumnalignstyleToString(MlPackage.eINSTANCE.getColumnalignstyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createColumnlinesTypeFromString(EDataType eDataType, String initialValue) {
		return createColumnlinesTypeBaseFromString(MlPackage.eINSTANCE.getColumnlinesTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnlinesTypeToString(EDataType eDataType, Object instanceValue) {
		return convertColumnlinesTypeBaseToString(MlPackage.eINSTANCE.getColumnlinesTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createColumnlinesType1FromString(EDataType eDataType, String initialValue) {
		return createColumnlinesTypeBase1FromString(MlPackage.eINSTANCE.getColumnlinesTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnlinesType1ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnlinesTypeBase1ToString(MlPackage.eINSTANCE.getColumnlinesTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createColumnlinesTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Linestyle> result = new ArrayList<Linestyle>();
		for (String item : split(initialValue)) {
			result.add(createLinestyleFromString(MlPackage.eINSTANCE.getLinestyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnlinesTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLinestyleToString(MlPackage.eINSTANCE.getLinestyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createColumnlinesTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Linestyle> result = new ArrayList<Linestyle>();
		for (String item : split(initialValue)) {
			result.add(createLinestyleFromString(MlPackage.eINSTANCE.getLinestyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnlinesTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLinestyleToString(MlPackage.eINSTANCE.getLinestyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createColumnspacingTypeFromString(EDataType eDataType, String initialValue) {
		return createColumnspacingTypeBaseFromString(MlPackage.eINSTANCE.getColumnspacingTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnspacingTypeToString(EDataType eDataType, Object instanceValue) {
		return convertColumnspacingTypeBaseToString(MlPackage.eINSTANCE.getColumnspacingTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createColumnspacingType1FromString(EDataType eDataType, String initialValue) {
		return createColumnspacingTypeBase1FromString(MlPackage.eINSTANCE.getColumnspacingTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnspacingType1ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnspacingTypeBase1ToString(MlPackage.eINSTANCE.getColumnspacingTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createColumnspacingTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createLengthFromString(MlPackage.eINSTANCE.getLength(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnspacingTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLengthToString(MlPackage.eINSTANCE.getLength(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createColumnspacingTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createLengthFromString(MlPackage.eINSTANCE.getLength(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnspacingTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLengthToString(MlPackage.eINSTANCE.getLength(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createColumnwidthTypeFromString(EDataType eDataType, String initialValue) {
		return createColumnwidthTypeBaseFromString(MlPackage.eINSTANCE.getColumnwidthTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeToString(EDataType eDataType, Object instanceValue) {
		return convertColumnwidthTypeBaseToString(MlPackage.eINSTANCE.getColumnwidthTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createColumnwidthType1FromString(EDataType eDataType, String initialValue) {
		return createColumnwidthTypeBase1FromString(MlPackage.eINSTANCE.getColumnwidthTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthType1ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnwidthTypeBase1ToString(MlPackage.eINSTANCE.getColumnwidthTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createColumnwidthTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createColumnwidthTypeBaseItemFromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertColumnwidthTypeBaseItemToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createColumnwidthTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createColumnwidthTypeBaseItem1FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItem1(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertColumnwidthTypeBaseItem1ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItem1(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createColumnwidthTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColumnwidthTypeBaseItemMember1FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColumnwidthTypeBaseItemMember2FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1().isInstance(instanceValue)) {
			try {
				String value = convertColumnwidthTypeBaseItemMember1ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2().isInstance(instanceValue)) {
			try {
				String value = convertColumnwidthTypeBaseItemMember2ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createColumnwidthTypeBaseItem1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColumnwidthTypeBaseItemMember11FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createColumnwidthTypeBaseItemMember21FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItem1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11().isInstance(instanceValue)) {
			try {
				String value = convertColumnwidthTypeBaseItemMember11ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21().isInstance(instanceValue)) {
			try {
				String value = convertColumnwidthTypeBaseItemMember21ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember1 createColumnwidthTypeBaseItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createColumnwidthTypeBaseItemMember1FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColumnwidthTypeBaseItemMember1ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember11 createColumnwidthTypeBaseItemMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createColumnwidthTypeBaseItemMember11FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnwidthTypeBaseItemMember11ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember2 createColumnwidthTypeBaseItemMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createColumnwidthTypeBaseItemMember2FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColumnwidthTypeBaseItemMember2ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnwidthTypeBaseItemMember21 createColumnwidthTypeBaseItemMember2Object1FromString(EDataType eDataType, String initialValue) {
		return createColumnwidthTypeBaseItemMember21FromString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnwidthTypeBaseItemMember2Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertColumnwidthTypeBaseItemMember21ToString(MlPackage.eINSTANCE.getColumnwidthTypeBaseItemMember21(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CrossoutTypeItem1> createCrossoutTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<CrossoutTypeItem1> result = new ArrayList<CrossoutTypeItem1>();
		for (String item : split(initialValue)) {
			result.add(createCrossoutTypeItem1FromString(MlPackage.eINSTANCE.getCrossoutTypeItem1(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertCrossoutTypeItem1ToString(MlPackage.eINSTANCE.getCrossoutTypeItem1(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CrossoutTypeItem> createCrossoutType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<CrossoutTypeItem> result = new ArrayList<CrossoutTypeItem>();
		for (String item : split(initialValue)) {
			result.add(createCrossoutTypeItemFromString(MlPackage.eINSTANCE.getCrossoutTypeItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertCrossoutTypeItemToString(MlPackage.eINSTANCE.getCrossoutTypeItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CrossoutTypeItem2> createCrossoutType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<CrossoutTypeItem2> result = new ArrayList<CrossoutTypeItem2>();
		for (String item : split(initialValue)) {
			result.add(createCrossoutTypeItem2FromString(MlPackage.eINSTANCE.getCrossoutTypeItem2(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertCrossoutTypeItem2ToString(MlPackage.eINSTANCE.getCrossoutTypeItem2(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossoutTypeItem createCrossoutTypeItemObjectFromString(EDataType eDataType, String initialValue) {
		return createCrossoutTypeItemFromString(MlPackage.eINSTANCE.getCrossoutTypeItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCrossoutTypeItemToString(MlPackage.eINSTANCE.getCrossoutTypeItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossoutTypeItem1 createCrossoutTypeItemObject1FromString(EDataType eDataType, String initialValue) {
		return createCrossoutTypeItem1FromString(MlPackage.eINSTANCE.getCrossoutTypeItem1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeItemObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertCrossoutTypeItem1ToString(MlPackage.eINSTANCE.getCrossoutTypeItem1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossoutTypeItem2 createCrossoutTypeItemObject2FromString(EDataType eDataType, String initialValue) {
		return createCrossoutTypeItem2FromString(MlPackage.eINSTANCE.getCrossoutTypeItem2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCrossoutTypeItemObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertCrossoutTypeItem2ToString(MlPackage.eINSTANCE.getCrossoutTypeItem2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DenomalignType createDenomalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDenomalignTypeFromString(MlPackage.eINSTANCE.getDenomalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDenomalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDenomalignTypeToString(MlPackage.eINSTANCE.getDenomalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DenomalignType1 createDenomalignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDenomalignType1FromString(MlPackage.eINSTANCE.getDenomalignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDenomalignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDenomalignType1ToString(MlPackage.eINSTANCE.getDenomalignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirTypeFromString(MlPackage.eINSTANCE.getDirType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirTypeToString(MlPackage.eINSTANCE.getDirType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDirType1FromString(MlPackage.eINSTANCE.getDirType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDirType1ToString(MlPackage.eINSTANCE.getDirType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType2 createDirTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createDirType2FromString(MlPackage.eINSTANCE.getDirType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertDirType2ToString(MlPackage.eINSTANCE.getDirType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplaystyleType createDisplaystyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplaystyleTypeFromString(MlPackage.eINSTANCE.getDisplaystyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplaystyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplaystyleTypeToString(MlPackage.eINSTANCE.getDisplaystyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplaystyleType1 createDisplaystyleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDisplaystyleType1FromString(MlPackage.eINSTANCE.getDisplaystyleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplaystyleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplaystyleType1ToString(MlPackage.eINSTANCE.getDisplaystyleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType createDisplayTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayTypeFromString(MlPackage.eINSTANCE.getDisplayType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayTypeToString(MlPackage.eINSTANCE.getDisplayType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType createEdgeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEdgeTypeFromString(MlPackage.eINSTANCE.getEdgeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEdgeTypeToString(MlPackage.eINSTANCE.getEdgeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType1 createEdgeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEdgeType1FromString(MlPackage.eINSTANCE.getEdgeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEdgeType1ToString(MlPackage.eINSTANCE.getEdgeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualcolumnsType createEqualcolumnsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEqualcolumnsTypeFromString(MlPackage.eINSTANCE.getEqualcolumnsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualcolumnsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEqualcolumnsTypeToString(MlPackage.eINSTANCE.getEqualcolumnsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualcolumnsType1 createEqualcolumnsTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEqualcolumnsType1FromString(MlPackage.eINSTANCE.getEqualcolumnsType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualcolumnsTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEqualcolumnsType1ToString(MlPackage.eINSTANCE.getEqualcolumnsType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualrowsType createEqualrowsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEqualrowsTypeFromString(MlPackage.eINSTANCE.getEqualrowsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualrowsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEqualrowsTypeToString(MlPackage.eINSTANCE.getEqualrowsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualrowsType1 createEqualrowsTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEqualrowsType1FromString(MlPackage.eINSTANCE.getEqualrowsType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualrowsTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEqualrowsType1ToString(MlPackage.eINSTANCE.getEqualrowsType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FenceType createFenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFenceTypeFromString(MlPackage.eINSTANCE.getFenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFenceTypeToString(MlPackage.eINSTANCE.getFenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FenceType1 createFenceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createFenceType1FromString(MlPackage.eINSTANCE.getFenceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFenceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertFenceType1ToString(MlPackage.eINSTANCE.getFenceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontstyleType createFontstyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontstyleTypeFromString(MlPackage.eINSTANCE.getFontstyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontstyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontstyleTypeToString(MlPackage.eINSTANCE.getFontstyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontweightType createFontweightTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontweightTypeFromString(MlPackage.eINSTANCE.getFontweightType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontweightTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontweightTypeToString(MlPackage.eINSTANCE.getFontweightType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType createFormTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormTypeFromString(MlPackage.eINSTANCE.getFormType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormTypeToString(MlPackage.eINSTANCE.getFormType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType1 createFormTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createFormType1FromString(MlPackage.eINSTANCE.getFormType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertFormType1ToString(MlPackage.eINSTANCE.getFormType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createFramespacingTypeFromString(EDataType eDataType, String initialValue) {
		return createFramespacingTypeBaseFromString(MlPackage.eINSTANCE.getFramespacingTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFramespacingTypeToString(EDataType eDataType, Object instanceValue) {
		return convertFramespacingTypeBaseToString(MlPackage.eINSTANCE.getFramespacingTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createFramespacingType1FromString(EDataType eDataType, String initialValue) {
		return createFramespacingTypeBase1FromString(MlPackage.eINSTANCE.getFramespacingTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFramespacingType1ToString(EDataType eDataType, Object instanceValue) {
		return convertFramespacingTypeBase1ToString(MlPackage.eINSTANCE.getFramespacingTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createFramespacingTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createFramespacingTypeBaseItemFromString(MlPackage.eINSTANCE.getFramespacingTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFramespacingTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertFramespacingTypeBaseItemToString(MlPackage.eINSTANCE.getFramespacingTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createFramespacingTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createFramespacingTypeBaseItem1FromString(MlPackage.eINSTANCE.getFramespacingTypeBaseItem1(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFramespacingTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertFramespacingTypeBaseItem1ToString(MlPackage.eINSTANCE.getFramespacingTypeBaseItem1(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFramespacingTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFramespacingTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFramespacingTypeBaseItem1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFramespacingTypeBaseItem1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<GroupAlignment> createGroupAlignmentListFromString(EDataType eDataType, String initialValue) {
		return createGroupAlignmentListBaseFromString(MlPackage.eINSTANCE.getGroupAlignmentListBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupAlignmentListToString(EDataType eDataType, Object instanceValue) {
		return convertGroupAlignmentListBaseToString(MlPackage.eINSTANCE.getGroupAlignmentListBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<GroupAlignment> createGroupAlignmentListBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<GroupAlignment> result = new ArrayList<GroupAlignment>();
		for (String item : split(initialValue)) {
			result.add(createGroupAlignmentFromString(MlPackage.eINSTANCE.getGroupAlignment(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupAlignmentListBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertGroupAlignmentToString(MlPackage.eINSTANCE.getGroupAlignment(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGroupAlignmentListListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupAlignmentListListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupAlignment createGroupAlignmentObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupAlignmentFromString(MlPackage.eINSTANCE.getGroupAlignment(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupAlignmentObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupAlignmentToString(MlPackage.eINSTANCE.getGroupAlignment(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupalignType createGroupalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupalignTypeFromString(MlPackage.eINSTANCE.getGroupalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupalignTypeToString(MlPackage.eINSTANCE.getGroupalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignfirstType createIndentalignfirstTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIndentalignfirstTypeFromString(MlPackage.eINSTANCE.getIndentalignfirstType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignfirstTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignfirstTypeToString(MlPackage.eINSTANCE.getIndentalignfirstType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignfirstType1 createIndentalignfirstTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createIndentalignfirstType1FromString(MlPackage.eINSTANCE.getIndentalignfirstType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignfirstTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignfirstType1ToString(MlPackage.eINSTANCE.getIndentalignfirstType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignfirstType2 createIndentalignfirstTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createIndentalignfirstType2FromString(MlPackage.eINSTANCE.getIndentalignfirstType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignfirstTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignfirstType2ToString(MlPackage.eINSTANCE.getIndentalignfirstType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignlastType createIndentalignlastTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIndentalignlastTypeFromString(MlPackage.eINSTANCE.getIndentalignlastType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignlastTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignlastTypeToString(MlPackage.eINSTANCE.getIndentalignlastType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignlastType1 createIndentalignlastTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createIndentalignlastType1FromString(MlPackage.eINSTANCE.getIndentalignlastType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignlastTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignlastType1ToString(MlPackage.eINSTANCE.getIndentalignlastType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignlastType2 createIndentalignlastTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createIndentalignlastType2FromString(MlPackage.eINSTANCE.getIndentalignlastType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignlastTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignlastType2ToString(MlPackage.eINSTANCE.getIndentalignlastType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignType createIndentalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIndentalignTypeFromString(MlPackage.eINSTANCE.getIndentalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignTypeToString(MlPackage.eINSTANCE.getIndentalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignType1 createIndentalignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createIndentalignType1FromString(MlPackage.eINSTANCE.getIndentalignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignType1ToString(MlPackage.eINSTANCE.getIndentalignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentalignType2 createIndentalignTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createIndentalignType2FromString(MlPackage.eINSTANCE.getIndentalignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentalignTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentalignType2ToString(MlPackage.eINSTANCE.getIndentalignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIndentshiftfirstTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIndentshiftfirstTypeMember1FromString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertIndentshiftfirstTypeMember1ToString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIndentshiftfirstType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIndentshiftfirstTypeMember11FromString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertIndentshiftfirstTypeMember11ToString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIndentshiftfirstType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIndentshiftfirstTypeMember12FromString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12().isInstance(instanceValue)) {
			try {
				String value = convertIndentshiftfirstTypeMember12ToString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftfirstTypeMember11 createIndentshiftfirstTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createIndentshiftfirstTypeMember11FromString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndentshiftfirstTypeMember11ToString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftfirstTypeMember1 createIndentshiftfirstTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createIndentshiftfirstTypeMember1FromString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentshiftfirstTypeMember1ToString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftfirstTypeMember12 createIndentshiftfirstTypeMember1Object2FromString(EDataType eDataType, String initialValue) {
		return createIndentshiftfirstTypeMember12FromString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftfirstTypeMember1Object2ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentshiftfirstTypeMember12ToString(MlPackage.eINSTANCE.getIndentshiftfirstTypeMember12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIndentshiftlastTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIndentshiftlastTypeMember11FromString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertIndentshiftlastTypeMember11ToString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIndentshiftlastType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIndentshiftlastTypeMember1FromString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertIndentshiftlastTypeMember1ToString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIndentshiftlastType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createIndentshiftlastTypeMember12FromString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember12(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getIndentshiftlastTypeMember12().isInstance(instanceValue)) {
			try {
				String value = convertIndentshiftlastTypeMember12ToString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember12(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftlastTypeMember1 createIndentshiftlastTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createIndentshiftlastTypeMember1FromString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndentshiftlastTypeMember1ToString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftlastTypeMember11 createIndentshiftlastTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createIndentshiftlastTypeMember11FromString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentshiftlastTypeMember11ToString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndentshiftlastTypeMember12 createIndentshiftlastTypeMember1Object2FromString(EDataType eDataType, String initialValue) {
		return createIndentshiftlastTypeMember12FromString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndentshiftlastTypeMember1Object2ToString(EDataType eDataType, Object instanceValue) {
		return convertIndentshiftlastTypeMember12ToString(MlPackage.eINSTANCE.getIndentshiftlastTypeMember12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixlinebreakstyleType createInfixlinebreakstyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInfixlinebreakstyleTypeFromString(MlPackage.eINSTANCE.getInfixlinebreakstyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfixlinebreakstyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInfixlinebreakstyleTypeToString(MlPackage.eINSTANCE.getInfixlinebreakstyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeopType createLargeopTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLargeopTypeFromString(MlPackage.eINSTANCE.getLargeopType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLargeopTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLargeopTypeToString(MlPackage.eINSTANCE.getLargeopType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeopType1 createLargeopTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLargeopType1FromString(MlPackage.eINSTANCE.getLargeopType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLargeopTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLargeopType1ToString(MlPackage.eINSTANCE.getLargeopType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakstyleType createLinebreakstyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLinebreakstyleTypeFromString(MlPackage.eINSTANCE.getLinebreakstyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakstyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinebreakstyleTypeToString(MlPackage.eINSTANCE.getLinebreakstyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakstyleType1 createLinebreakstyleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLinebreakstyleType1FromString(MlPackage.eINSTANCE.getLinebreakstyleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakstyleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLinebreakstyleType1ToString(MlPackage.eINSTANCE.getLinebreakstyleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakType createLinebreakTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLinebreakTypeFromString(MlPackage.eINSTANCE.getLinebreakType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinebreakTypeToString(MlPackage.eINSTANCE.getLinebreakType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakType1 createLinebreakTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLinebreakType1FromString(MlPackage.eINSTANCE.getLinebreakType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLinebreakType1ToString(MlPackage.eINSTANCE.getLinebreakType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakType2 createLinebreakTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createLinebreakType2FromString(MlPackage.eINSTANCE.getLinebreakType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertLinebreakType2ToString(MlPackage.eINSTANCE.getLinebreakType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linestyle createLinestyleObjectFromString(EDataType eDataType, String initialValue) {
		return createLinestyleFromString(MlPackage.eINSTANCE.getLinestyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinestyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinestyleToString(MlPackage.eINSTANCE.getLinestyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLinethicknessTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLinethicknessTypeMember1FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLinethicknessTypeMember2FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLinethicknessTypeMember3FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getLinethicknessTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertLinethicknessTypeMember1ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getLinethicknessTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertLinethicknessTypeMember2ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getLinethicknessTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertLinethicknessTypeMember3ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLinethicknessType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLinethicknessTypeMember11FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLinethicknessTypeMember21FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember21(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLinethicknessTypeMember31FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember31(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getLinethicknessTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertLinethicknessTypeMember11ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getLinethicknessTypeMember21().isInstance(instanceValue)) {
			try {
				String value = convertLinethicknessTypeMember21ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember21(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getLinethicknessTypeMember31().isInstance(instanceValue)) {
			try {
				String value = convertLinethicknessTypeMember31ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember31(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember1 createLinethicknessTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createLinethicknessTypeMember1FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinethicknessTypeMember1ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember11 createLinethicknessTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createLinethicknessTypeMember11FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertLinethicknessTypeMember11ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember2 createLinethicknessTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createLinethicknessTypeMember2FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinethicknessTypeMember2ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember21 createLinethicknessTypeMember2Object1FromString(EDataType eDataType, String initialValue) {
		return createLinethicknessTypeMember21FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember21(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember2Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertLinethicknessTypeMember21ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember21(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember3 createLinethicknessTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createLinethicknessTypeMember3FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinethicknessTypeMember3ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinethicknessTypeMember31 createLinethicknessTypeMember3Object1FromString(EDataType eDataType, String initialValue) {
		return createLinethicknessTypeMember31FromString(MlPackage.eINSTANCE.getLinethicknessTypeMember31(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinethicknessTypeMember3Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertLinethicknessTypeMember31ToString(MlPackage.eINSTANCE.getLinethicknessTypeMember31(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationTypeFromString(MlPackage.eINSTANCE.getLocationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationTypeToString(MlPackage.eINSTANCE.getLocationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType1 createLocationTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLocationType1FromString(MlPackage.eINSTANCE.getLocationType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLocationType1ToString(MlPackage.eINSTANCE.getLocationType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType2 createLocationTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createLocationType2FromString(MlPackage.eINSTANCE.getLocationType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertLocationType2ToString(MlPackage.eINSTANCE.getLocationType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongdivstyleType createLongdivstyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLongdivstyleTypeFromString(MlPackage.eINSTANCE.getLongdivstyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongdivstyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLongdivstyleTypeToString(MlPackage.eINSTANCE.getLongdivstyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongdivstyleType1 createLongdivstyleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLongdivstyleType1FromString(MlPackage.eINSTANCE.getLongdivstyleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongdivstyleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLongdivstyleType1ToString(MlPackage.eINSTANCE.getLongdivstyleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMathbackgroundTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createColorFromString(MlPackage.eINSTANCE.getColor(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathbackgroundTypeMember1FromString(MlPackage.eINSTANCE.getMathbackgroundTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathbackgroundTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getColor().isInstance(instanceValue)) {
			try {
				String value = convertColorToString(MlPackage.eINSTANCE.getColor(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathbackgroundTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMathbackgroundTypeMember1ToString(MlPackage.eINSTANCE.getMathbackgroundTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathbackgroundTypeMember1 createMathbackgroundTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMathbackgroundTypeMember1FromString(MlPackage.eINSTANCE.getMathbackgroundTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathbackgroundTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMathbackgroundTypeMember1ToString(MlPackage.eINSTANCE.getMathbackgroundTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMathsizeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember11FromString(MlPackage.eINSTANCE.getMathsizeTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember2FromString(MlPackage.eINSTANCE.getMathsizeTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember3FromString(MlPackage.eINSTANCE.getMathsizeTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember11ToString(MlPackage.eINSTANCE.getMathsizeTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember2ToString(MlPackage.eINSTANCE.getMathsizeTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember3ToString(MlPackage.eINSTANCE.getMathsizeTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMathsizeType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember1FromString(MlPackage.eINSTANCE.getMathsizeTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember21FromString(MlPackage.eINSTANCE.getMathsizeTypeMember21(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember31FromString(MlPackage.eINSTANCE.getMathsizeTypeMember31(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember1ToString(MlPackage.eINSTANCE.getMathsizeTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember21().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember21ToString(MlPackage.eINSTANCE.getMathsizeTypeMember21(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember31().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember31ToString(MlPackage.eINSTANCE.getMathsizeTypeMember31(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMathsizeType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember12FromString(MlPackage.eINSTANCE.getMathsizeTypeMember12(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember22FromString(MlPackage.eINSTANCE.getMathsizeTypeMember22(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMathsizeTypeMember32FromString(MlPackage.eINSTANCE.getMathsizeTypeMember32(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember12().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember12ToString(MlPackage.eINSTANCE.getMathsizeTypeMember12(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember22().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember22ToString(MlPackage.eINSTANCE.getMathsizeTypeMember22(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMathsizeTypeMember32().isInstance(instanceValue)) {
			try {
				String value = convertMathsizeTypeMember32ToString(MlPackage.eINSTANCE.getMathsizeTypeMember32(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember1 createMathsizeTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember1FromString(MlPackage.eINSTANCE.getMathsizeTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember1ToString(MlPackage.eINSTANCE.getMathsizeTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember11 createMathsizeTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember11FromString(MlPackage.eINSTANCE.getMathsizeTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember11ToString(MlPackage.eINSTANCE.getMathsizeTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember12 createMathsizeTypeMember1Object2FromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember12FromString(MlPackage.eINSTANCE.getMathsizeTypeMember12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember1Object2ToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember12ToString(MlPackage.eINSTANCE.getMathsizeTypeMember12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember2 createMathsizeTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember2FromString(MlPackage.eINSTANCE.getMathsizeTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember2ToString(MlPackage.eINSTANCE.getMathsizeTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember21 createMathsizeTypeMember2Object1FromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember21FromString(MlPackage.eINSTANCE.getMathsizeTypeMember21(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember2Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember21ToString(MlPackage.eINSTANCE.getMathsizeTypeMember21(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember22 createMathsizeTypeMember2Object2FromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember22FromString(MlPackage.eINSTANCE.getMathsizeTypeMember22(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember2Object2ToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember22ToString(MlPackage.eINSTANCE.getMathsizeTypeMember22(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember3 createMathsizeTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember3FromString(MlPackage.eINSTANCE.getMathsizeTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember3ToString(MlPackage.eINSTANCE.getMathsizeTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember31 createMathsizeTypeMember3Object1FromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember31FromString(MlPackage.eINSTANCE.getMathsizeTypeMember31(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember3Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember31ToString(MlPackage.eINSTANCE.getMathsizeTypeMember31(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathsizeTypeMember32 createMathsizeTypeMember3Object2FromString(EDataType eDataType, String initialValue) {
		return createMathsizeTypeMember32FromString(MlPackage.eINSTANCE.getMathsizeTypeMember32(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathsizeTypeMember3Object2ToString(EDataType eDataType, Object instanceValue) {
		return convertMathsizeTypeMember32ToString(MlPackage.eINSTANCE.getMathsizeTypeMember32(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathvariantType1 createMathvariantTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMathvariantType1FromString(MlPackage.eINSTANCE.getMathvariantType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathvariantTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMathvariantType1ToString(MlPackage.eINSTANCE.getMathvariantType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathvariantType createMathvariantTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createMathvariantTypeFromString(MlPackage.eINSTANCE.getMathvariantType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathvariantTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertMathvariantTypeToString(MlPackage.eINSTANCE.getMathvariantType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathvariantType2 createMathvariantTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createMathvariantType2FromString(MlPackage.eINSTANCE.getMathvariantType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathvariantTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertMathvariantType2ToString(MlPackage.eINSTANCE.getMathvariantType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMaxsizeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMaxsizeTypeMember1FromString(MlPackage.eINSTANCE.getMaxsizeTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxsizeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMaxsizeTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMaxsizeTypeMember1ToString(MlPackage.eINSTANCE.getMaxsizeTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMaxsizeType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMaxsizeTypeMember11FromString(MlPackage.eINSTANCE.getMaxsizeTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxsizeType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMaxsizeTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertMaxsizeTypeMember11ToString(MlPackage.eINSTANCE.getMaxsizeTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxsizeTypeMember1 createMaxsizeTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMaxsizeTypeMember1FromString(MlPackage.eINSTANCE.getMaxsizeTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxsizeTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaxsizeTypeMember1ToString(MlPackage.eINSTANCE.getMaxsizeTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxsizeTypeMember11 createMaxsizeTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createMaxsizeTypeMember11FromString(MlPackage.eINSTANCE.getMaxsizeTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxsizeTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMaxsizeTypeMember11ToString(MlPackage.eINSTANCE.getMaxsizeTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovablelimitsType createMovablelimitsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMovablelimitsTypeFromString(MlPackage.eINSTANCE.getMovablelimitsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovablelimitsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMovablelimitsTypeToString(MlPackage.eINSTANCE.getMovablelimitsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovablelimitsType1 createMovablelimitsTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createMovablelimitsType1FromString(MlPackage.eINSTANCE.getMovablelimitsType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovablelimitsTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertMovablelimitsType1ToString(MlPackage.eINSTANCE.getMovablelimitsType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMpaddedLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMpaddedLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMslinethicknessTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMslinethicknessTypeMember1FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMslinethicknessTypeMember2FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMslinethicknessTypeMember3FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMslinethicknessTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMslinethicknessTypeMember1ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMslinethicknessTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertMslinethicknessTypeMember2ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMslinethicknessTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertMslinethicknessTypeMember3ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMslinethicknessType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMslinethicknessTypeMember11FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMslinethicknessTypeMember21FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember21(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMslinethicknessTypeMember31FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember31(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMslinethicknessTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertMslinethicknessTypeMember11ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMslinethicknessTypeMember21().isInstance(instanceValue)) {
			try {
				String value = convertMslinethicknessTypeMember21ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember21(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getMslinethicknessTypeMember31().isInstance(instanceValue)) {
			try {
				String value = convertMslinethicknessTypeMember31ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember31(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember1 createMslinethicknessTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMslinethicknessTypeMember1FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMslinethicknessTypeMember1ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember11 createMslinethicknessTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createMslinethicknessTypeMember11FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMslinethicknessTypeMember11ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember2 createMslinethicknessTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createMslinethicknessTypeMember2FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMslinethicknessTypeMember2ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember21 createMslinethicknessTypeMember2Object1FromString(EDataType eDataType, String initialValue) {
		return createMslinethicknessTypeMember21FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember21(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember2Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMslinethicknessTypeMember21ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember21(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember3 createMslinethicknessTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createMslinethicknessTypeMember3FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMslinethicknessTypeMember3ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MslinethicknessTypeMember31 createMslinethicknessTypeMember3Object1FromString(EDataType eDataType, String initialValue) {
		return createMslinethicknessTypeMember31FromString(MlPackage.eINSTANCE.getMslinethicknessTypeMember31(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMslinethicknessTypeMember3Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertMslinethicknessTypeMember31ToString(MlPackage.eINSTANCE.getMslinethicknessTypeMember31(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notationstyle createNotationstyleObjectFromString(EDataType eDataType, String initialValue) {
		return createNotationstyleFromString(MlPackage.eINSTANCE.getNotationstyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationstyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNotationstyleToString(MlPackage.eINSTANCE.getNotationstyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumalignType createNumalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumalignTypeFromString(MlPackage.eINSTANCE.getNumalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumalignTypeToString(MlPackage.eINSTANCE.getNumalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumalignType1 createNumalignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createNumalignType1FromString(MlPackage.eINSTANCE.getNumalignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumalignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertNumalignType1ToString(MlPackage.eINSTANCE.getNumalignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createNumberFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceType createOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOccurrenceTypeFromString(MlPackage.eINSTANCE.getOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOccurrenceTypeToString(MlPackage.eINSTANCE.getOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderTypeFromString(MlPackage.eINSTANCE.getOrderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderTypeToString(MlPackage.eINSTANCE.getOrderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowType createOverflowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOverflowTypeFromString(MlPackage.eINSTANCE.getOverflowType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOverflowTypeToString(MlPackage.eINSTANCE.getOverflowType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Verticalalign> createRowalignType1FromString(EDataType eDataType, String initialValue) {
		return createRowalignTypeBaseFromString(MlPackage.eINSTANCE.getRowalignTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignType1ToString(EDataType eDataType, Object instanceValue) {
		return convertRowalignTypeBaseToString(MlPackage.eINSTANCE.getRowalignTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Verticalalign> createRowalignType3FromString(EDataType eDataType, String initialValue) {
		return createRowalignTypeBase1FromString(MlPackage.eINSTANCE.getRowalignTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignType3ToString(EDataType eDataType, Object instanceValue) {
		return convertRowalignTypeBase1ToString(MlPackage.eINSTANCE.getRowalignTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Verticalalign> createRowalignTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Verticalalign> result = new ArrayList<Verticalalign>();
		for (String item : split(initialValue)) {
			result.add(createVerticalalignFromString(MlPackage.eINSTANCE.getVerticalalign(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertVerticalalignToString(MlPackage.eINSTANCE.getVerticalalign(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Verticalalign> createRowalignTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Verticalalign> result = new ArrayList<Verticalalign>();
		for (String item : split(initialValue)) {
			result.add(createVerticalalignFromString(MlPackage.eINSTANCE.getVerticalalign(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertVerticalalignToString(MlPackage.eINSTANCE.getVerticalalign(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowalignType createRowalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRowalignTypeFromString(MlPackage.eINSTANCE.getRowalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRowalignTypeToString(MlPackage.eINSTANCE.getRowalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowalignType2 createRowalignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRowalignType2FromString(MlPackage.eINSTANCE.getRowalignType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowalignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRowalignType2ToString(MlPackage.eINSTANCE.getRowalignType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createRowlinesTypeFromString(EDataType eDataType, String initialValue) {
		return createRowlinesTypeBaseFromString(MlPackage.eINSTANCE.getRowlinesTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowlinesTypeToString(EDataType eDataType, Object instanceValue) {
		return convertRowlinesTypeBaseToString(MlPackage.eINSTANCE.getRowlinesTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createRowlinesType1FromString(EDataType eDataType, String initialValue) {
		return createRowlinesTypeBase1FromString(MlPackage.eINSTANCE.getRowlinesTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowlinesType1ToString(EDataType eDataType, Object instanceValue) {
		return convertRowlinesTypeBase1ToString(MlPackage.eINSTANCE.getRowlinesTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createRowlinesTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Linestyle> result = new ArrayList<Linestyle>();
		for (String item : split(initialValue)) {
			result.add(createLinestyleFromString(MlPackage.eINSTANCE.getLinestyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowlinesTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLinestyleToString(MlPackage.eINSTANCE.getLinestyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Linestyle> createRowlinesTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Linestyle> result = new ArrayList<Linestyle>();
		for (String item : split(initialValue)) {
			result.add(createLinestyleFromString(MlPackage.eINSTANCE.getLinestyle(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowlinesTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLinestyleToString(MlPackage.eINSTANCE.getLinestyle(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createRowspacingTypeFromString(EDataType eDataType, String initialValue) {
		return createRowspacingTypeBaseFromString(MlPackage.eINSTANCE.getRowspacingTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowspacingTypeToString(EDataType eDataType, Object instanceValue) {
		return convertRowspacingTypeBaseToString(MlPackage.eINSTANCE.getRowspacingTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createRowspacingType1FromString(EDataType eDataType, String initialValue) {
		return createRowspacingTypeBase1FromString(MlPackage.eINSTANCE.getRowspacingTypeBase1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowspacingType1ToString(EDataType eDataType, Object instanceValue) {
		return convertRowspacingTypeBase1ToString(MlPackage.eINSTANCE.getRowspacingTypeBase1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createRowspacingTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createLengthFromString(MlPackage.eINSTANCE.getLength(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowspacingTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLengthToString(MlPackage.eINSTANCE.getLength(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createRowspacingTypeBase1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createLengthFromString(MlPackage.eINSTANCE.getLength(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowspacingTypeBase1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLengthToString(MlPackage.eINSTANCE.getLength(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparatorType createSeparatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSeparatorTypeFromString(MlPackage.eINSTANCE.getSeparatorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSeparatorTypeToString(MlPackage.eINSTANCE.getSeparatorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeparatorType1 createSeparatorTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSeparatorType1FromString(MlPackage.eINSTANCE.getSeparatorType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparatorTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSeparatorType1ToString(MlPackage.eINSTANCE.getSeparatorType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SideType createSideTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSideTypeFromString(MlPackage.eINSTANCE.getSideType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSideTypeToString(MlPackage.eINSTANCE.getSideType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SideType1 createSideTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSideType1FromString(MlPackage.eINSTANCE.getSideType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSideTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSideType1ToString(MlPackage.eINSTANCE.getSideType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackalignType createStackalignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStackalignTypeFromString(MlPackage.eINSTANCE.getStackalignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackalignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStackalignTypeToString(MlPackage.eINSTANCE.getStackalignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackalignType1 createStackalignTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createStackalignType1FromString(MlPackage.eINSTANCE.getStackalignType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackalignTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertStackalignType1ToString(MlPackage.eINSTANCE.getStackalignType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchyType createStretchyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStretchyTypeFromString(MlPackage.eINSTANCE.getStretchyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStretchyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStretchyTypeToString(MlPackage.eINSTANCE.getStretchyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StretchyType1 createStretchyTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createStretchyType1FromString(MlPackage.eINSTANCE.getStretchyType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStretchyTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertStretchyType1ToString(MlPackage.eINSTANCE.getStretchyType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSymbolNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricType createSymmetricTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymmetricTypeFromString(MlPackage.eINSTANCE.getSymmetricType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetricTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetricTypeToString(MlPackage.eINSTANCE.getSymmetricType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricType1 createSymmetricTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSymmetricType1FromString(MlPackage.eINSTANCE.getSymmetricType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetricTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetricType1ToString(MlPackage.eINSTANCE.getSymmetricType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnsignedIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verticalalign createVerticalalignObjectFromString(EDataType eDataType, String initialValue) {
		return createVerticalalignFromString(MlPackage.eINSTANCE.getVerticalalign(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalalignObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerticalalignToString(MlPackage.eINSTANCE.getVerticalalign(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createWidthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthFromString(MlPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createWidthTypeMember1FromString(MlPackage.eINSTANCE.getWidthTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (MlPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = convertLengthToString(MlPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (MlPackage.eINSTANCE.getWidthTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertWidthTypeMember1ToString(MlPackage.eINSTANCE.getWidthTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthTypeMember1 createWidthTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createWidthTypeMember1FromString(MlPackage.eINSTANCE.getWidthTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidthTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWidthTypeMember1ToString(MlPackage.eINSTANCE.getWidthTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlPackage getMlPackage() {
		return (MlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MlPackage getPackage() {
		return MlPackage.eINSTANCE;
	}

} //MlFactoryImpl
