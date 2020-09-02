/**
 */
package org.crossref.relations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.crossref.relations.RelationsPackage
 * @generated
 */
public interface RelationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationsFactory eINSTANCE = org.crossref.relations.impl.RelationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Type</em>'.
	 * @generated
	 */
	DescriptionType createDescriptionType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Inter Work Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Work Relation Type</em>'.
	 * @generated
	 */
	InterWorkRelationType createInterWorkRelationType();

	/**
	 * Returns a new object of class '<em>Intra Work Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intra Work Relation Type</em>'.
	 * @generated
	 */
	IntraWorkRelationType createIntraWorkRelationType();

	/**
	 * Returns a new object of class '<em>Program Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Type</em>'.
	 * @generated
	 */
	ProgramType createProgramType();

	/**
	 * Returns a new object of class '<em>Related Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Item Type</em>'.
	 * @generated
	 */
	RelatedItemType createRelatedItemType();

	/**
	 * Returns a new object of class '<em>Xref Faces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xref Faces</em>'.
	 * @generated
	 */
	XrefFaces createXrefFaces();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelationsPackage getRelationsPackage();

} //RelationsFactory
