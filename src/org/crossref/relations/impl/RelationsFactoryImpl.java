/**
 */
package org.crossref.relations.impl;

import org.crossref.relations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationsFactoryImpl extends EFactoryImpl implements RelationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationsFactory init() {
		try {
			RelationsFactory theRelationsFactory = (RelationsFactory)EPackage.Registry.INSTANCE.getEFactory(RelationsPackage.eNS_URI);
			if (theRelationsFactory != null) {
				return theRelationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsFactoryImpl() {
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
			case RelationsPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case RelationsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RelationsPackage.INTER_WORK_RELATION_TYPE: return createInterWorkRelationType();
			case RelationsPackage.INTRA_WORK_RELATION_TYPE: return createIntraWorkRelationType();
			case RelationsPackage.PROGRAM_TYPE: return createProgramType();
			case RelationsPackage.RELATED_ITEM_TYPE: return createRelatedItemType();
			case RelationsPackage.XREF_FACES: return createXrefFaces();
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
			case RelationsPackage.IDENTIFIER_TYPE_TYPE:
				return createIdentifierTypeTypeFromString(eDataType, initialValue);
			case RelationsPackage.LANGUAGE_TYPE:
				return createLanguageTypeFromString(eDataType, initialValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE:
				return createRelationshipTypeTypeFromString(eDataType, initialValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE1:
				return createRelationshipTypeType1FromString(eDataType, initialValue);
			case RelationsPackage.IDENTIFIER_TYPE_TYPE_OBJECT:
				return createIdentifierTypeTypeObjectFromString(eDataType, initialValue);
			case RelationsPackage.LANGUAGE_TYPE_OBJECT:
				return createLanguageTypeObjectFromString(eDataType, initialValue);
			case RelationsPackage.NAMESPACE_TYPE:
				return createNamespaceTypeFromString(eDataType, initialValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE_OBJECT:
				return createRelationshipTypeTypeObjectFromString(eDataType, initialValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE_OBJECT1:
				return createRelationshipTypeTypeObject1FromString(eDataType, initialValue);
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
			case RelationsPackage.IDENTIFIER_TYPE_TYPE:
				return convertIdentifierTypeTypeToString(eDataType, instanceValue);
			case RelationsPackage.LANGUAGE_TYPE:
				return convertLanguageTypeToString(eDataType, instanceValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE:
				return convertRelationshipTypeTypeToString(eDataType, instanceValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE1:
				return convertRelationshipTypeType1ToString(eDataType, instanceValue);
			case RelationsPackage.IDENTIFIER_TYPE_TYPE_OBJECT:
				return convertIdentifierTypeTypeObjectToString(eDataType, instanceValue);
			case RelationsPackage.LANGUAGE_TYPE_OBJECT:
				return convertLanguageTypeObjectToString(eDataType, instanceValue);
			case RelationsPackage.NAMESPACE_TYPE:
				return convertNamespaceTypeToString(eDataType, instanceValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE_OBJECT:
				return convertRelationshipTypeTypeObjectToString(eDataType, instanceValue);
			case RelationsPackage.RELATIONSHIP_TYPE_TYPE_OBJECT1:
				return convertRelationshipTypeTypeObject1ToString(eDataType, instanceValue);
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
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
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
	@Override
	public InterWorkRelationType createInterWorkRelationType() {
		InterWorkRelationTypeImpl interWorkRelationType = new InterWorkRelationTypeImpl();
		return interWorkRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntraWorkRelationType createIntraWorkRelationType() {
		IntraWorkRelationTypeImpl intraWorkRelationType = new IntraWorkRelationTypeImpl();
		return intraWorkRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType createProgramType() {
		ProgramTypeImpl programType = new ProgramTypeImpl();
		return programType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedItemType createRelatedItemType() {
		RelatedItemTypeImpl relatedItemType = new RelatedItemTypeImpl();
		return relatedItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces createXrefFaces() {
		XrefFacesImpl xrefFaces = new XrefFacesImpl();
		return xrefFaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierTypeType createIdentifierTypeTypeFromString(EDataType eDataType, String initialValue) {
		IdentifierTypeType result = IdentifierTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeFromString(EDataType eDataType, String initialValue) {
		LanguageType result = LanguageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType createRelationshipTypeTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipTypeType result = RelationshipTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType1 createRelationshipTypeType1FromString(EDataType eDataType, String initialValue) {
		RelationshipTypeType1 result = RelationshipTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierTypeType createIdentifierTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierTypeTypeFromString(RelationsPackage.Literals.IDENTIFIER_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierTypeTypeToString(RelationsPackage.Literals.IDENTIFIER_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLanguageTypeFromString(RelationsPackage.Literals.LANGUAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLanguageTypeToString(RelationsPackage.Literals.LANGUAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNamespaceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamespaceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType createRelationshipTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationshipTypeTypeFromString(RelationsPackage.Literals.RELATIONSHIP_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeTypeToString(RelationsPackage.Literals.RELATIONSHIP_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType1 createRelationshipTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRelationshipTypeType1FromString(RelationsPackage.Literals.RELATIONSHIP_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeType1ToString(RelationsPackage.Literals.RELATIONSHIP_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationsPackage getRelationsPackage() {
		return (RelationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationsPackage getPackage() {
		return RelationsPackage.eINSTANCE;
	}

} //RelationsFactoryImpl
