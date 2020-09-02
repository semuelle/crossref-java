/**
 */
package org.crossref.relations.util;

import java.util.Map;

import org.crossref.relations.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.crossref.relations.RelationsPackage
 * @generated
 */
public class RelationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationsValidator INSTANCE = new RelationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.crossref.relations";

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
	public RelationsValidator() {
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
	  return RelationsPackage.eINSTANCE;
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
			case RelationsPackage.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case RelationsPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case RelationsPackage.INTER_WORK_RELATION_TYPE:
				return validateInterWorkRelationType((InterWorkRelationType)value, diagnostics, context);
			case RelationsPackage.INTRA_WORK_RELATION_TYPE:
				return validateIntraWorkRelationType((IntraWorkRelationType)value, diagnostics, context);
			case RelationsPackage.PROGRAM_TYPE:
				return validateProgramType((ProgramType)value, diagnostics, context);
			case RelationsPackage.RELATED_ITEM_TYPE:
				return validateRelatedItemType((RelatedItemType)value, diagnostics, context);
			case RelationsPackage.XREF_FACES:
				return validateXrefFaces((XrefFaces)value, diagnostics, context);
			case RelationsPackage.IDENTIFIER_TYPE_TYPE:
				return validateIdentifierTypeType((IdentifierTypeType)value, diagnostics, context);
			case RelationsPackage.LANGUAGE_TYPE:
				return validateLanguageType((LanguageType)value, diagnostics, context);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE:
				return validateRelationshipTypeType((RelationshipTypeType)value, diagnostics, context);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE1:
				return validateRelationshipTypeType1((RelationshipTypeType1)value, diagnostics, context);
			case RelationsPackage.IDENTIFIER_TYPE_TYPE_OBJECT:
				return validateIdentifierTypeTypeObject((IdentifierTypeType)value, diagnostics, context);
			case RelationsPackage.LANGUAGE_TYPE_OBJECT:
				return validateLanguageTypeObject((LanguageType)value, diagnostics, context);
			case RelationsPackage.NAMESPACE_TYPE:
				return validateNamespaceType((String)value, diagnostics, context);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE_OBJECT:
				return validateRelationshipTypeTypeObject((RelationshipTypeType)value, diagnostics, context);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE_OBJECT1:
				return validateRelationshipTypeTypeObject1((RelationshipTypeType1)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
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
	public boolean validateInterWorkRelationType(InterWorkRelationType interWorkRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interWorkRelationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntraWorkRelationType(IntraWorkRelationType intraWorkRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intraWorkRelationType, diagnostics, context);
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
	public boolean validateRelatedItemType(RelatedItemType relatedItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXrefFaces(XrefFaces xrefFaces, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xrefFaces, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierTypeType(IdentifierTypeType identifierTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageType(LanguageType languageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeType(RelationshipTypeType relationshipTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeType1(RelationshipTypeType1 relationshipTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierTypeTypeObject(IdentifierTypeType identifierTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageTypeObject(LanguageType languageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceType(String namespaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNamespaceType_MinLength(namespaceType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespaceType_MaxLength(namespaceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Namespace Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceType_MinLength(String namespaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = namespaceType.length();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(RelationsPackage.Literals.NAMESPACE_TYPE, namespaceType, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Namespace Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceType_MaxLength(String namespaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = namespaceType.length();
		boolean result = length <= 1024;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(RelationsPackage.Literals.NAMESPACE_TYPE, namespaceType, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeTypeObject(RelationshipTypeType relationshipTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeTypeObject1(RelationshipTypeType1 relationshipTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //RelationsValidator
