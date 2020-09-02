/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.AnonymousType#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AnonymousType#getContributorRole <em>Contributor Role</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AnonymousType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AnonymousType#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AnonymousType#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getAnonymousType()
 * @model extendedMetaData="name='anonymous_._type' kind='elementOnly'"
 * @generated
 */
public interface AnonymousType extends EObject {
	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The institution(s) with which a contributor is affiliated. This
	 * 				element may hold the name and location of an affiliation with which a contributor is
	 * 				affiliated. Please note the following points when using this element: 1. A
	 * 				contributor may have up to five affiliations. Each affiliation should be in a unique
	 * 				<affiliation> element. The following is correct: <affiliation>University
	 * 				of New Mexico</affiliation> <affiliation>Sandia National
	 * 				Laboratories</affiliation> The following is NOT correct
	 * 				<affiliation>University of New Mexico; Sandia National
	 * 				Laboratories</affiliation> 2. The name of the institution is required in this
	 * 				element. The location is optional. Both of the following are correct:
	 * 				<affiliation>Harvard University</affiliation> <affiliation>Harvard
	 * 				University, Cambridge, MA</affiliation> 3. Additional address information such
	 * 				as a URL or email address should NOT be deposited in this element 4. Visual linking
	 * 				indicators used in publication to connect authors with their affiliations such as
	 * 				footnote symbols or initials should NOT be included in the <affiliation>
	 * 				element 5. If you have only a single string that has the affiliation for multiple
	 * 				contributors to a work and that string is not broken out into the individual
	 * 				affliations for each author, please do NOT deposit the affilation information. This
	 * 				element is to be used only for affiliation information that is directly connected to
	 * 				the author with whom this information is included within the person_name element.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affiliation</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getAnonymousType_Affiliation()
	 * @model unique="false" dataType="org.crossref.schema._4._4.AffiliationType" upper="5"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAffiliation();

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
	 * @see org.crossref.schema._4._4._4Package#getAnonymousType_ContributorRole()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='contributor_role'"
	 * @generated
	 */
	ContributorRoleType getContributorRole();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getContributorRole <em>Contributor Role</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getContributorRole <em>Contributor Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContributorRole()
	 * @see #getContributorRole()
	 * @see #setContributorRole(ContributorRoleType)
	 * @generated
	 */
	void unsetContributorRole();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.AnonymousType#getContributorRole <em>Contributor Role</em>}' attribute is set.
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
	 * @see org.crossref.schema._4._4._4Package#getAnonymousType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.AnonymousType#getLanguage <em>Language</em>}' attribute is set.
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
	 * @see org.crossref.schema._4._4._4Package#getAnonymousType_NameStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='name-style'"
	 * @generated
	 */
	NameStyleType getNameStyle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getNameStyle <em>Name Style</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType)
	 * @generated
	 */
	void unsetNameStyle();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.AnonymousType#getNameStyle <em>Name Style</em>}' attribute is set.
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
	 * @see org.crossref.schema._4._4._4Package#getAnonymousType_Sequence()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='sequence'"
	 * @generated
	 */
	SequenceType getSequence();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getSequence <em>Sequence</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.AnonymousType#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequence()
	 * @see #getSequence()
	 * @see #setSequence(SequenceType)
	 * @generated
	 */
	void unsetSequence();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.AnonymousType#getSequence <em>Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence</em>' attribute is set.
	 * @see #unsetSequence()
	 * @see #getSequence()
	 * @see #setSequence(SequenceType)
	 * @generated
	 */
	boolean isSetSequence();

} // AnonymousType
