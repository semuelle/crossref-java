/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Institution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.InstitutionType#getInstitutionName <em>Institution Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.InstitutionType#getInstitutionAcronym <em>Institution Acronym</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.InstitutionType#getInstitutionPlace <em>Institution Place</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.InstitutionType#getInstitutionDepartment <em>Institution Department</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getInstitutionType()
 * @model extendedMetaData="name='institution_._type' kind='elementOnly'"
 * @generated
 */
public interface InstitutionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Institution Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full name of an institution. Examples are: World Health
	 * 				Organization; University of California, Davis. Corresponding institution_acronym
	 * 				content for these organizations would be WHO and UCD,
	 * 				respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Name</em>' attribute.
	 * @see #setInstitutionName(String)
	 * @see org.crossref.schema._4._4._4Package#getInstitutionType_InstitutionName()
	 * @model dataType="org.crossref.schema._4._4.InstitutionNameType" required="true"
	 *        extendedMetaData="kind='element' name='institution_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstitutionName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.InstitutionType#getInstitutionName <em>Institution Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Name</em>' attribute.
	 * @see #getInstitutionName()
	 * @generated
	 */
	void setInstitutionName(String value);

	/**
	 * Returns the value of the '<em><b>Institution Acronym</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The acronym of the institution. Note that authors often cite with
	 * 				acronyms and this information can be important in matching a query Examples: WHO,
	 * 				UCDavis, UCD Note: as shown above, an institution may be know by multiple acronyms,
	 * 				in which case all common acronyms should be deposited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Acronym</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getInstitutionType_InstitutionAcronym()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionAcronymType" upper="6"
	 *        extendedMetaData="kind='element' name='institution_acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInstitutionAcronym();

	/**
	 * Returns the value of the '<em><b>Institution Place</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary city location of the institution. institution_place gives
	 * 				the primary city location of the institution. When the location is a major city
	 * 				(e.g. New York, Amsterdam), no qualifying country or U.S. state need be given. If
	 * 				the city is not a major city, the appropriate country and/or state or province
	 * 				should be added.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Place</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getInstitutionType_InstitutionPlace()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionPlaceType" upper="6"
	 *        extendedMetaData="kind='element' name='institution_place' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInstitutionPlace();

	/**
	 * Returns the value of the '<em><b>Institution Department</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The department within an institution. institution_department gives
	 * 				the department within an institution. A common use is the department under which a
	 * 				dissertation was completed. Note that the institution_department is repeatable. If
	 * 				multiple departments are to be deposited, each one should be given in a unique
	 * 				institution_department element. Example: Department of Psychology
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution Department</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getInstitutionType_InstitutionDepartment()
	 * @model unique="false" dataType="org.crossref.schema._4._4.InstitutionDepartmentType" upper="6"
	 *        extendedMetaData="kind='element' name='institution_department' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInstitutionDepartment();

} // InstitutionType
