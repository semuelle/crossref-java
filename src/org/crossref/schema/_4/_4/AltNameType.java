/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.AltNameType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AltNameType#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AltNameType#getStringName <em>String Name</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getAltNameType()
 * @model extendedMetaData="name='alt-name_._type' kind='elementOnly'"
 * @generated
 */
public interface AltNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getAltNameType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.NameType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAltNameType_Name()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NameType1> getName();

	/**
	 * Returns the value of the '<em><b>String Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.StringNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Name</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAltNameType_StringName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-name' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StringNameType> getStringName();

} // AltNameType
