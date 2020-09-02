/**
 */
package org.crossref.relations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  
 *             This schema provides for creating relationships between items identified by Crossref DOIs, non-Crossref DOIs, and other identifiers. See: https://support.crossref.org/hc/en-us/articles/214357426
 *        
 *         
 * <!-- end-model-doc -->
 * @see org.crossref.relations.RelationsFactory
 * @model kind="package"
 * @generated
 */
public interface RelationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.crossref.org/relations.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationsPackage eINSTANCE = org.crossref.relations.impl.RelationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.DescriptionTypeImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__FONT = 12;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__LANGUAGE = 13;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.DocumentRootImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__B = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EM = 5;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT = 6;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__I = 7;

	/**
	 * The feature id for the '<em><b>Inter Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTER_WORK_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Intra Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTRA_WORK_RELATION = 9;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVL = 10;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROGRAM = 11;

	/**
	 * The feature id for the '<em><b>Related Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATED_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCP = 13;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRONG = 14;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB = 15;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUP = 16;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TT = 17;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__U = 18;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.InterWorkRelationTypeImpl <em>Inter Work Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.InterWorkRelationTypeImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getInterWorkRelationType()
	 * @generated
	 */
	int INTER_WORK_RELATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WORK_RELATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WORK_RELATION_TYPE__NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Inter Work Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WORK_RELATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inter Work Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WORK_RELATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.IntraWorkRelationTypeImpl <em>Intra Work Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.IntraWorkRelationTypeImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getIntraWorkRelationType()
	 * @generated
	 */
	int INTRA_WORK_RELATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_WORK_RELATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_WORK_RELATION_TYPE__IDENTIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_WORK_RELATION_TYPE__NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_WORK_RELATION_TYPE__RELATIONSHIP_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Intra Work Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_WORK_RELATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Intra Work Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_WORK_RELATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.ProgramTypeImpl <em>Program Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.ProgramTypeImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getProgramType()
	 * @generated
	 */
	int PROGRAM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Related Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__RELATED_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.RelatedItemTypeImpl <em>Related Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.RelatedItemTypeImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelatedItemType()
	 * @generated
	 */
	int RELATED_ITEM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Inter Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_TYPE__INTER_WORK_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Intra Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_TYPE__INTRA_WORK_RELATION = 2;

	/**
	 * The number of structural features of the '<em>Related Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Related Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.impl.XrefFacesImpl <em>Xref Faces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.impl.XrefFacesImpl
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getXrefFaces()
	 * @generated
	 */
	int XREF_FACES = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Face Markup</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__FACE_MARKUP = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__B = 2;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__I = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__STRONG = 5;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__U = 6;

	/**
	 * The feature id for the '<em><b>Ovl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__OVL = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__SUP = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__SUB = 9;

	/**
	 * The feature id for the '<em><b>Scp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__SCP = 10;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__TT = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES__FONT = 12;

	/**
	 * The number of structural features of the '<em>Xref Faces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Xref Faces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.relations.IdentifierTypeType <em>Identifier Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.IdentifierTypeType
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getIdentifierTypeType()
	 * @generated
	 */
	int IDENTIFIER_TYPE_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.crossref.relations.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.LanguageType
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.crossref.relations.RelationshipTypeType <em>Relationship Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.RelationshipTypeType
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.crossref.relations.RelationshipTypeType1 <em>Relationship Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.RelationshipTypeType1
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeType1()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_TYPE1 = 10;

	/**
	 * The meta object id for the '<em>Identifier Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.IdentifierTypeType
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getIdentifierTypeTypeObject()
	 * @generated
	 */
	int IDENTIFIER_TYPE_TYPE_OBJECT = 11;

	/**
	 * The meta object id for the '<em>Language Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.LanguageType
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getLanguageTypeObject()
	 * @generated
	 */
	int LANGUAGE_TYPE_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Namespace Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getNamespaceType()
	 * @generated
	 */
	int NAMESPACE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Relationship Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.RelationshipTypeType
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeTypeObject()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Relationship Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.relations.RelationshipTypeType1
	 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeTypeObject1()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_TYPE_OBJECT1 = 15;


	/**
	 * Returns the meta object for class '{@link org.crossref.relations.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see org.crossref.relations.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.relations.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.DescriptionType#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.relations.DescriptionType#getFaceMarkup()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.relations.DescriptionType#getB()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.relations.DescriptionType#getI()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.relations.DescriptionType#getEm()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.relations.DescriptionType#getStrong()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.relations.DescriptionType#getU()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.relations.DescriptionType#getOvl()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.relations.DescriptionType#getSup()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.relations.DescriptionType#getSub()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.relations.DescriptionType#getScp()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.relations.DescriptionType#getTt()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.DescriptionType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.relations.DescriptionType#getFont()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EReference getDescriptionType_Font();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.DescriptionType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.crossref.relations.DescriptionType#getLanguage()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Language();

	/**
	 * Returns the meta object for class '{@link org.crossref.relations.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.crossref.relations.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.relations.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.crossref.relations.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.crossref.relations.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.crossref.relations.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.crossref.relations.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see org.crossref.relations.DocumentRoot#getB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_B();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.crossref.relations.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Em</em>'.
	 * @see org.crossref.relations.DocumentRoot#getEm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Em();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.crossref.relations.DocumentRoot#getFont()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see org.crossref.relations.DocumentRoot#getI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_I();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getInterWorkRelation <em>Inter Work Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Work Relation</em>'.
	 * @see org.crossref.relations.DocumentRoot#getInterWorkRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterWorkRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getIntraWorkRelation <em>Intra Work Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intra Work Relation</em>'.
	 * @see org.crossref.relations.DocumentRoot#getIntraWorkRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntraWorkRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ovl</em>'.
	 * @see org.crossref.relations.DocumentRoot#getOvl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ovl();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.relations.DocumentRoot#getProgram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getRelatedItem <em>Related Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Item</em>'.
	 * @see org.crossref.relations.DocumentRoot#getRelatedItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RelatedItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scp</em>'.
	 * @see org.crossref.relations.DocumentRoot#getScp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scp();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strong</em>'.
	 * @see org.crossref.relations.DocumentRoot#getStrong()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Strong();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.crossref.relations.DocumentRoot#getSub()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sup</em>'.
	 * @see org.crossref.relations.DocumentRoot#getSup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sup();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tt</em>'.
	 * @see org.crossref.relations.DocumentRoot#getTt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tt();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.DocumentRoot#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>U</em>'.
	 * @see org.crossref.relations.DocumentRoot#getU()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_U();

	/**
	 * Returns the meta object for class '{@link org.crossref.relations.InterWorkRelationType <em>Inter Work Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Work Relation Type</em>'.
	 * @see org.crossref.relations.InterWorkRelationType
	 * @generated
	 */
	EClass getInterWorkRelationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.InterWorkRelationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.relations.InterWorkRelationType#getMixed()
	 * @see #getInterWorkRelationType()
	 * @generated
	 */
	EAttribute getInterWorkRelationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.InterWorkRelationType#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see org.crossref.relations.InterWorkRelationType#getIdentifierType()
	 * @see #getInterWorkRelationType()
	 * @generated
	 */
	EAttribute getInterWorkRelationType_IdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.InterWorkRelationType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.crossref.relations.InterWorkRelationType#getNamespace()
	 * @see #getInterWorkRelationType()
	 * @generated
	 */
	EAttribute getInterWorkRelationType_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.InterWorkRelationType#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see org.crossref.relations.InterWorkRelationType#getRelationshipType()
	 * @see #getInterWorkRelationType()
	 * @generated
	 */
	EAttribute getInterWorkRelationType_RelationshipType();

	/**
	 * Returns the meta object for class '{@link org.crossref.relations.IntraWorkRelationType <em>Intra Work Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intra Work Relation Type</em>'.
	 * @see org.crossref.relations.IntraWorkRelationType
	 * @generated
	 */
	EClass getIntraWorkRelationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.IntraWorkRelationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.relations.IntraWorkRelationType#getMixed()
	 * @see #getIntraWorkRelationType()
	 * @generated
	 */
	EAttribute getIntraWorkRelationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.IntraWorkRelationType#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see org.crossref.relations.IntraWorkRelationType#getIdentifierType()
	 * @see #getIntraWorkRelationType()
	 * @generated
	 */
	EAttribute getIntraWorkRelationType_IdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.IntraWorkRelationType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.crossref.relations.IntraWorkRelationType#getNamespace()
	 * @see #getIntraWorkRelationType()
	 * @generated
	 */
	EAttribute getIntraWorkRelationType_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.IntraWorkRelationType#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see org.crossref.relations.IntraWorkRelationType#getRelationshipType()
	 * @see #getIntraWorkRelationType()
	 * @generated
	 */
	EAttribute getIntraWorkRelationType_RelationshipType();

	/**
	 * Returns the meta object for class '{@link org.crossref.relations.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Type</em>'.
	 * @see org.crossref.relations.ProgramType
	 * @generated
	 */
	EClass getProgramType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.ProgramType#getRelatedItem <em>Related Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Item</em>'.
	 * @see org.crossref.relations.ProgramType#getRelatedItem()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_RelatedItem();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.relations.ProgramType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.crossref.relations.ProgramType#getName()
	 * @see #getProgramType()
	 * @generated
	 */
	EAttribute getProgramType_Name();

	/**
	 * Returns the meta object for class '{@link org.crossref.relations.RelatedItemType <em>Related Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Item Type</em>'.
	 * @see org.crossref.relations.RelatedItemType
	 * @generated
	 */
	EClass getRelatedItemType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.RelatedItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.crossref.relations.RelatedItemType#getDescription()
	 * @see #getRelatedItemType()
	 * @generated
	 */
	EReference getRelatedItemType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.RelatedItemType#getInterWorkRelation <em>Inter Work Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Work Relation</em>'.
	 * @see org.crossref.relations.RelatedItemType#getInterWorkRelation()
	 * @see #getRelatedItemType()
	 * @generated
	 */
	EReference getRelatedItemType_InterWorkRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.relations.RelatedItemType#getIntraWorkRelation <em>Intra Work Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intra Work Relation</em>'.
	 * @see org.crossref.relations.RelatedItemType#getIntraWorkRelation()
	 * @see #getRelatedItemType()
	 * @generated
	 */
	EReference getRelatedItemType_IntraWorkRelation();

	/**
	 * Returns the meta object for class '{@link org.crossref.relations.XrefFaces <em>Xref Faces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xref Faces</em>'.
	 * @see org.crossref.relations.XrefFaces
	 * @generated
	 */
	EClass getXrefFaces();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.XrefFaces#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.relations.XrefFaces#getMixed()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EAttribute getXrefFaces_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.relations.XrefFaces#getFaceMarkup <em>Face Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Face Markup</em>'.
	 * @see org.crossref.relations.XrefFaces#getFaceMarkup()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EAttribute getXrefFaces_FaceMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.crossref.relations.XrefFaces#getB()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.crossref.relations.XrefFaces#getI()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.crossref.relations.XrefFaces#getEm()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.crossref.relations.XrefFaces#getStrong()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.crossref.relations.XrefFaces#getU()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getOvl <em>Ovl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ovl</em>'.
	 * @see org.crossref.relations.XrefFaces#getOvl()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Ovl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.crossref.relations.XrefFaces#getSup()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.crossref.relations.XrefFaces#getSub()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getScp <em>Scp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scp</em>'.
	 * @see org.crossref.relations.XrefFaces#getScp()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Scp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.crossref.relations.XrefFaces#getTt()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.relations.XrefFaces#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Font</em>'.
	 * @see org.crossref.relations.XrefFaces#getFont()
	 * @see #getXrefFaces()
	 * @generated
	 */
	EReference getXrefFaces_Font();

	/**
	 * Returns the meta object for enum '{@link org.crossref.relations.IdentifierTypeType <em>Identifier Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type Type</em>'.
	 * @see org.crossref.relations.IdentifierTypeType
	 * @generated
	 */
	EEnum getIdentifierTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.relations.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see org.crossref.relations.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.relations.RelationshipTypeType <em>Relationship Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type Type</em>'.
	 * @see org.crossref.relations.RelationshipTypeType
	 * @generated
	 */
	EEnum getRelationshipTypeType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.relations.RelationshipTypeType1 <em>Relationship Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type Type1</em>'.
	 * @see org.crossref.relations.RelationshipTypeType1
	 * @generated
	 */
	EEnum getRelationshipTypeType1();

	/**
	 * Returns the meta object for data type '{@link org.crossref.relations.IdentifierTypeType <em>Identifier Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier Type Type Object</em>'.
	 * @see org.crossref.relations.IdentifierTypeType
	 * @model instanceClass="org.crossref.relations.IdentifierTypeType"
	 *        extendedMetaData="name='identifier-type_._type:Object' baseType='identifier-type_._type'"
	 * @generated
	 */
	EDataType getIdentifierTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.relations.LanguageType <em>Language Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Type Object</em>'.
	 * @see org.crossref.relations.LanguageType
	 * @model instanceClass="org.crossref.relations.LanguageType"
	 *        extendedMetaData="name='language_._type:Object' baseType='language_._type'"
	 * @generated
	 */
	EDataType getLanguageTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Namespace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='namespace_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024' minLength='4'"
	 * @generated
	 */
	EDataType getNamespaceType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.relations.RelationshipTypeType <em>Relationship Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Type Object</em>'.
	 * @see org.crossref.relations.RelationshipTypeType
	 * @model instanceClass="org.crossref.relations.RelationshipTypeType"
	 *        extendedMetaData="name='relationship-type_._type:Object' baseType='relationship-type_._type'"
	 * @generated
	 */
	EDataType getRelationshipTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.relations.RelationshipTypeType1 <em>Relationship Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relationship Type Type Object1</em>'.
	 * @see org.crossref.relations.RelationshipTypeType1
	 * @model instanceClass="org.crossref.relations.RelationshipTypeType1"
	 *        extendedMetaData="name='relationship-type_._1_._type:Object' baseType='relationship-type_._1_._type'"
	 * @generated
	 */
	EDataType getRelationshipTypeTypeObject1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationsFactory getRelationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.DescriptionTypeImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__MIXED = eINSTANCE.getDescriptionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Face Markup</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__FACE_MARKUP = eINSTANCE.getDescriptionType_FaceMarkup();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__B = eINSTANCE.getDescriptionType_B();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__I = eINSTANCE.getDescriptionType_I();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__EM = eINSTANCE.getDescriptionType_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__STRONG = eINSTANCE.getDescriptionType_Strong();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__U = eINSTANCE.getDescriptionType_U();

		/**
		 * The meta object literal for the '<em><b>Ovl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__OVL = eINSTANCE.getDescriptionType_Ovl();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__SUP = eINSTANCE.getDescriptionType_Sup();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__SUB = eINSTANCE.getDescriptionType_Sub();

		/**
		 * The meta object literal for the '<em><b>Scp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__SCP = eINSTANCE.getDescriptionType_Scp();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__TT = eINSTANCE.getDescriptionType_Tt();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_TYPE__FONT = eINSTANCE.getDescriptionType_Font();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__LANGUAGE = eINSTANCE.getDescriptionType_Language();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.DocumentRootImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__B = eINSTANCE.getDocumentRoot_B();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EM = eINSTANCE.getDocumentRoot_Em();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FONT = eINSTANCE.getDocumentRoot_Font();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__I = eINSTANCE.getDocumentRoot_I();

		/**
		 * The meta object literal for the '<em><b>Inter Work Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTER_WORK_RELATION = eINSTANCE.getDocumentRoot_InterWorkRelation();

		/**
		 * The meta object literal for the '<em><b>Intra Work Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTRA_WORK_RELATION = eINSTANCE.getDocumentRoot_IntraWorkRelation();

		/**
		 * The meta object literal for the '<em><b>Ovl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OVL = eINSTANCE.getDocumentRoot_Ovl();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROGRAM = eINSTANCE.getDocumentRoot_Program();

		/**
		 * The meta object literal for the '<em><b>Related Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATED_ITEM = eINSTANCE.getDocumentRoot_RelatedItem();

		/**
		 * The meta object literal for the '<em><b>Scp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCP = eINSTANCE.getDocumentRoot_Scp();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRONG = eINSTANCE.getDocumentRoot_Strong();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUB = eINSTANCE.getDocumentRoot_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUP = eINSTANCE.getDocumentRoot_Sup();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TT = eINSTANCE.getDocumentRoot_Tt();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__U = eINSTANCE.getDocumentRoot_U();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.InterWorkRelationTypeImpl <em>Inter Work Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.InterWorkRelationTypeImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getInterWorkRelationType()
		 * @generated
		 */
		EClass INTER_WORK_RELATION_TYPE = eINSTANCE.getInterWorkRelationType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_WORK_RELATION_TYPE__MIXED = eINSTANCE.getInterWorkRelationType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Identifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE = eINSTANCE.getInterWorkRelationType_IdentifierType();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_WORK_RELATION_TYPE__NAMESPACE = eINSTANCE.getInterWorkRelationType_Namespace();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE = eINSTANCE.getInterWorkRelationType_RelationshipType();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.IntraWorkRelationTypeImpl <em>Intra Work Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.IntraWorkRelationTypeImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getIntraWorkRelationType()
		 * @generated
		 */
		EClass INTRA_WORK_RELATION_TYPE = eINSTANCE.getIntraWorkRelationType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRA_WORK_RELATION_TYPE__MIXED = eINSTANCE.getIntraWorkRelationType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Identifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRA_WORK_RELATION_TYPE__IDENTIFIER_TYPE = eINSTANCE.getIntraWorkRelationType_IdentifierType();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRA_WORK_RELATION_TYPE__NAMESPACE = eINSTANCE.getIntraWorkRelationType_Namespace();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRA_WORK_RELATION_TYPE__RELATIONSHIP_TYPE = eINSTANCE.getIntraWorkRelationType_RelationshipType();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.ProgramTypeImpl <em>Program Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.ProgramTypeImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getProgramType()
		 * @generated
		 */
		EClass PROGRAM_TYPE = eINSTANCE.getProgramType();

		/**
		 * The meta object literal for the '<em><b>Related Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__RELATED_ITEM = eINSTANCE.getProgramType_RelatedItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_TYPE__NAME = eINSTANCE.getProgramType_Name();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.RelatedItemTypeImpl <em>Related Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.RelatedItemTypeImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelatedItemType()
		 * @generated
		 */
		EClass RELATED_ITEM_TYPE = eINSTANCE.getRelatedItemType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ITEM_TYPE__DESCRIPTION = eINSTANCE.getRelatedItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Inter Work Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ITEM_TYPE__INTER_WORK_RELATION = eINSTANCE.getRelatedItemType_InterWorkRelation();

		/**
		 * The meta object literal for the '<em><b>Intra Work Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ITEM_TYPE__INTRA_WORK_RELATION = eINSTANCE.getRelatedItemType_IntraWorkRelation();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.impl.XrefFacesImpl <em>Xref Faces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.impl.XrefFacesImpl
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getXrefFaces()
		 * @generated
		 */
		EClass XREF_FACES = eINSTANCE.getXrefFaces();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XREF_FACES__MIXED = eINSTANCE.getXrefFaces_Mixed();

		/**
		 * The meta object literal for the '<em><b>Face Markup</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XREF_FACES__FACE_MARKUP = eINSTANCE.getXrefFaces_FaceMarkup();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__B = eINSTANCE.getXrefFaces_B();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__I = eINSTANCE.getXrefFaces_I();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__EM = eINSTANCE.getXrefFaces_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__STRONG = eINSTANCE.getXrefFaces_Strong();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__U = eINSTANCE.getXrefFaces_U();

		/**
		 * The meta object literal for the '<em><b>Ovl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__OVL = eINSTANCE.getXrefFaces_Ovl();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__SUP = eINSTANCE.getXrefFaces_Sup();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__SUB = eINSTANCE.getXrefFaces_Sub();

		/**
		 * The meta object literal for the '<em><b>Scp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__SCP = eINSTANCE.getXrefFaces_Scp();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__TT = eINSTANCE.getXrefFaces_Tt();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XREF_FACES__FONT = eINSTANCE.getXrefFaces_Font();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.IdentifierTypeType <em>Identifier Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.IdentifierTypeType
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getIdentifierTypeType()
		 * @generated
		 */
		EEnum IDENTIFIER_TYPE_TYPE = eINSTANCE.getIdentifierTypeType();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.LanguageType <em>Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.LanguageType
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.RelationshipTypeType <em>Relationship Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.RelationshipTypeType
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE_TYPE = eINSTANCE.getRelationshipTypeType();

		/**
		 * The meta object literal for the '{@link org.crossref.relations.RelationshipTypeType1 <em>Relationship Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.RelationshipTypeType1
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeType1()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE_TYPE1 = eINSTANCE.getRelationshipTypeType1();

		/**
		 * The meta object literal for the '<em>Identifier Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.IdentifierTypeType
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getIdentifierTypeTypeObject()
		 * @generated
		 */
		EDataType IDENTIFIER_TYPE_TYPE_OBJECT = eINSTANCE.getIdentifierTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Language Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.LanguageType
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getLanguageTypeObject()
		 * @generated
		 */
		EDataType LANGUAGE_TYPE_OBJECT = eINSTANCE.getLanguageTypeObject();

		/**
		 * The meta object literal for the '<em>Namespace Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getNamespaceType()
		 * @generated
		 */
		EDataType NAMESPACE_TYPE = eINSTANCE.getNamespaceType();

		/**
		 * The meta object literal for the '<em>Relationship Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.RelationshipTypeType
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeTypeObject()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_TYPE_OBJECT = eINSTANCE.getRelationshipTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Relationship Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.relations.RelationshipTypeType1
		 * @see org.crossref.relations.impl.RelationsPackageImpl#getRelationshipTypeTypeObject1()
		 * @generated
		 */
		EDataType RELATIONSHIP_TYPE_TYPE_OBJECT1 = eINSTANCE.getRelationshipTypeTypeObject1();

	}

} //RelationsPackage
