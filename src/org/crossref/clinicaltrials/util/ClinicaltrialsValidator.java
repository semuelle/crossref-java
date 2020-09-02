/**
 */
package org.crossref.clinicaltrials.util;

import java.util.Map;

import org.crossref.clinicaltrials.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage
 * @generated
 */
public class ClinicaltrialsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ClinicaltrialsValidator INSTANCE = new ClinicaltrialsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.crossref.clinicaltrials";

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
	public ClinicaltrialsValidator() {
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
	  return ClinicaltrialsPackage.eINSTANCE;
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
			case ClinicaltrialsPackage.CLINICAL_TRIAL_NUMBER_TYPE:
				return validateClinicalTrialNumberType((ClinicalTrialNumberType)value, diagnostics, context);
			case ClinicaltrialsPackage.PROGRAM_TYPE:
				return validateProgramType((ProgramType)value, diagnostics, context);
			case ClinicaltrialsPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ClinicaltrialsPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case ClinicaltrialsPackage.REGISTRY_TYPE:
				return validateRegistryType((String)value, diagnostics, context);
			case ClinicaltrialsPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalTrialNumberType(ClinicalTrialNumberType clinicalTrialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalTrialNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramType(ProgramType programType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programType, diagnostics, context);
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
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryType(String registryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRegistryType_Pattern(registryType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegistryType_MinLength(registryType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegistryType_MaxLength(registryType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRegistryType_Pattern
	 */
	public static final  PatternMatcher [][] REGISTRY_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("10.18810/[a-z-]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Registry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryType_Pattern(String registryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ClinicaltrialsPackage.Literals.REGISTRY_TYPE, registryType, REGISTRY_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Registry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryType_MinLength(String registryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = registryType.length();
		boolean result = length >= 12;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ClinicaltrialsPackage.Literals.REGISTRY_TYPE, registryType, length, 12, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Registry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryType_MaxLength(String registryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = registryType.length();
		boolean result = length <= 200;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ClinicaltrialsPackage.Literals.REGISTRY_TYPE, registryType, length, 200, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ClinicaltrialsValidator
