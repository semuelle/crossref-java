/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Designators Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdFamilyDesignator <em>Std Family Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdSetDesignator <em>Std Set Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdUndatedDesignator <em>Std Undated Designator</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdAsPublished <em>Std As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdAltAsPublished <em>Std Alt As Published</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdSupersedes <em>Std Supersedes</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdAdoptedFrom <em>Std Adopted From</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DesignatorsType#getStdRevisionOf <em>Std Revision Of</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDesignatorsType()
 * @model extendedMetaData="name='designators_._type' kind='elementOnly'"
 * @generated
 */
public interface DesignatorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Std Family Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides for defining a DOI for a broad grouping of standards.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Family Designator</em>' containment reference.
	 * @see #setStdFamilyDesignator(StdDesignatorT)
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdFamilyDesignator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='std_family_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	StdDesignatorT getStdFamilyDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DesignatorsType#getStdFamilyDesignator <em>Std Family Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Family Designator</em>' containment reference.
	 * @see #getStdFamilyDesignator()
	 * @generated
	 */
	void setStdFamilyDesignator(StdDesignatorT value);

	/**
	 * Returns the value of the '<em><b>Std Set Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides for defining a DOI for a set of standards (sometimes know as
	 * 				truncated form). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Set Designator</em>' containment reference.
	 * @see #setStdSetDesignator(StdSetDesignatorType)
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdSetDesignator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='std_set_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	StdSetDesignatorType getStdSetDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DesignatorsType#getStdSetDesignator <em>Std Set Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Set Designator</em>' containment reference.
	 * @see #getStdSetDesignator()
	 * @generated
	 */
	void setStdSetDesignator(StdSetDesignatorType value);

	/**
	 * Returns the value of the '<em><b>Std Undated Designator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides for defining a DOI for a group of closely related standard
	 * 				documents (undated form is a stem for any dated form) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Undated Designator</em>' containment reference.
	 * @see #setStdUndatedDesignator(StdUndatedDesignatorType)
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdUndatedDesignator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='std_undated_designator' namespace='##targetNamespace'"
	 * @generated
	 */
	StdUndatedDesignatorType getStdUndatedDesignator();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DesignatorsType#getStdUndatedDesignator <em>Std Undated Designator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Undated Designator</em>' containment reference.
	 * @see #getStdUndatedDesignator()
	 * @generated
	 */
	void setStdUndatedDesignator(StdUndatedDesignatorType value);

	/**
	 * Returns the value of the '<em><b>Std As Published</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator or other primary identifier for the standard being
	 * 				deposited. Required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std As Published</em>' containment reference.
	 * @see #setStdAsPublished(StdAsPublishedType)
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdAsPublished()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='std_as_published' namespace='##targetNamespace'"
	 * @generated
	 */
	StdAsPublishedType getStdAsPublished();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DesignatorsType#getStdAsPublished <em>Std As Published</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std As Published</em>' containment reference.
	 * @see #getStdAsPublished()
	 * @generated
	 */
	void setStdAsPublished(StdAsPublishedType value);

	/**
	 * Returns the value of the '<em><b>Std Alt As Published</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.StdAltAsPublishedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Alt As Published</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdAltAsPublished()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='std_alt_as_published' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StdAltAsPublishedType> getStdAltAsPublished();

	/**
	 * Returns the value of the '<em><b>Std Supersedes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator for standard being replaced by the standard being
	 * 				deposited. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Supersedes</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdSupersedes()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT"
	 *        extendedMetaData="kind='element' name='std_supersedes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStdSupersedes();

	/**
	 * Returns the value of the '<em><b>Std Adopted From</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator for standard from which the current deposit is adopted.
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Adopted From</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdAdoptedFrom()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT"
	 *        extendedMetaData="kind='element' name='std_adopted_from' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStdAdoptedFrom();

	/**
	 * Returns the value of the '<em><b>Std Revision Of</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designator for the previous revision of the standard being deposited.
	 * 				(note: use alt_as_published for revisions within designators having common stem)
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Revision Of</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getDesignatorsType_StdRevisionOf()
	 * @model unique="false" dataType="org.crossref.schema._4._4.StdDesignatorvalueT"
	 *        extendedMetaData="kind='element' name='std_revision_of' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStdRevisionOf();

} // DesignatorsType
