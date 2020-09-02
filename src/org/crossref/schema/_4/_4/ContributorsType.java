/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ContributorsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContributorsType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContributorsType#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ContributorsType#getAnonymous <em>Anonymous</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getContributorsType()
 * @model extendedMetaData="name='contributors_._type' kind='elementOnly'"
 * @generated
 */
public interface ContributorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getContributorsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organization (as opposed to a person) that contributed
	 * 				to authoring an entity. If multiple organizations authored an entity, each one
	 * 				should be captured in a unique organization element. If an entity was authored by
	 * 				individuals in addition to one or more organizations, person_name and organization
	 * 				may be freely intermixed within contributors. contributor_role should be set, as
	 * 				appropriate, to author or editor. When a contributor translated a work, set
	 * 				contributor_role to "translator". "chair" should only be used for conference
	 * 				proceedings to indicate a conference chair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getContributorsType_Organization()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PersonNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a person (as opposed to an organization) that contributed
	 * 				to authoring an entity. Authors with name suffixes should have the suffix captured
	 * 				in suffix, not in surname. Author prefixes such as "Dr.", "Prof.", or "President"
	 * 				should not be included in person_name or any other element. Author degrees (e.g.
	 * 				M.D., Ph.D.) also should not be included in Crossref submissions. contributor_role
	 * 				should be set, as appropriate, to author or editor. When a contributor translated a
	 * 				work, set contributor_role to "translator". "chair" should only be used for
	 * 				conference proceedings to indicate a conference chair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getContributorsType_PersonName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person_name' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PersonNameType> getPersonName();

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.AnonymousType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anonymous</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getContributorsType_Anonymous()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='anonymous' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnonymousType> getAnonymous();

} // ContributorsType
