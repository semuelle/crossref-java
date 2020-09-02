/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Statement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getA <em>A</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.IntentStatementType#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getIntentStatementType()
 * @model extendedMetaData="name='intent_statement_._type' kind='mixed'"
 * @generated
 */
public interface IntentStatementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<XrefFaces> getB();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<XrefFaces> getI();

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_U()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<XrefFaces> getU();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.AType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  content is "Inline" except that anchors shouldn't be nested
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AType> getA();

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
	 * @see org.crossref.schema._4._4._4Package#getIntentStatementType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.IntentStatementType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.IntentStatementType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.IntentStatementType#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	boolean isSetLanguage();

} // IntentStatementType
