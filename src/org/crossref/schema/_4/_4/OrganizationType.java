/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.OrganizationType#getValue <em>Value</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.OrganizationType#getContributorRole <em>Contributor Role</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.OrganizationType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.OrganizationType#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.OrganizationType#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getOrganizationType()
 * @model extendedMetaData="name='organization_._type' kind='simple'"
 * @generated
 */
public interface OrganizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.crossref.schema._4._4._4Package#getOrganizationType_Value()
	 * @model dataType="org.crossref.schema._4._4.OrganizationT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Contributor Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.ContributorRoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor Role</em>' attribute.
	 * @see org.crossref.schema._4._4.ContributorRoleType
	 * @see #isSetContributorRole()
	 * @see #unsetContributorRole()
	 * @see #setContributorRole(ContributorRoleType)
	 * @see org.crossref.schema._4._4._4Package#getOrganizationType_ContributorRole()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='contributor_role'"
	 * @generated
	 */
	ContributorRoleType getContributorRole();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getContributorRole <em>Contributor Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor Role</em>' attribute.
	 * @see org.crossref.schema._4._4.ContributorRoleType
	 * @see #isSetContributorRole()
	 * @see #unsetContributorRole()
	 * @see #getContributorRole()
	 * @generated
	 */
	void setContributorRole(ContributorRoleType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getContributorRole <em>Contributor Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContributorRole()
	 * @see #getContributorRole()
	 * @see #setContributorRole(ContributorRoleType)
	 * @generated
	 */
	void unsetContributorRole();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.OrganizationType#getContributorRole <em>Contributor Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contributor Role</em>' attribute is set.
	 * @see #unsetContributorRole()
	 * @see #getContributorRole()
	 * @see #setContributorRole(ContributorRoleType)
	 * @generated
	 */
	boolean isSetContributorRole();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(LanguageType)
	 * @see org.crossref.schema._4._4._4Package#getOrganizationType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.crossref.schema._4._4.LanguageType
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.OrganizationType#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Name Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.NameStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Style</em>' attribute.
	 * @see org.crossref.schema._4._4.NameStyleType
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @see org.crossref.schema._4._4._4Package#getOrganizationType_NameStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='name-style'"
	 * @generated
	 */
	NameStyleType getNameStyle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Style</em>' attribute.
	 * @see org.crossref.schema._4._4.NameStyleType
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @generated
	 */
	void setNameStyle(NameStyleType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @generated
	 */
	void unsetNameStyle();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.OrganizationType#getNameStyle <em>Name Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Style</em>' attribute is set.
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @generated
	 */
	boolean isSetNameStyle();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see org.crossref.schema._4._4.SequenceType
	 * @see #isSetSequence()
	 * @see #unsetSequence()
	 * @see #setSequence(SequenceType)
	 * @see org.crossref.schema._4._4._4Package#getOrganizationType_Sequence()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='sequence'"
	 * @generated
	 */
	SequenceType getSequence();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see org.crossref.schema._4._4.SequenceType
	 * @see #isSetSequence()
	 * @see #unsetSequence()
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(SequenceType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.OrganizationType#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequence()
	 * @see #getSequence()
	 * @see #setSequence(SequenceType)
	 * @generated
	 */
	void unsetSequence();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.OrganizationType#getSequence <em>Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence</em>' attribute is set.
	 * @see #unsetSequence()
	 * @see #getSequence()
	 * @see #setSequence(SequenceType)
	 * @generated
	 */
	boolean isSetSequence();

} // OrganizationType
