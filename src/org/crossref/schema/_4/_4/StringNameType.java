/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.StringNameType#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getStringNameType()
 * @model extendedMetaData="name='string-name_._type' kind='mixed'"
 * @generated
 */
public interface StringNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Mixed()
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
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.DegreesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Degrees()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DegreesType> getDegrees();

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contributor's given name. The given_name, combined with surname,
	 * 				forms the name of an author or editor. given_name may be submitted as either
	 * 				initials or a full name. Do not place given_name within the surname unless it is
	 * 				unclear how to distinguish the given name from the surname, as may be the case in
	 * 				non-Western names. Do not include titles such as "Dr.", "Prof.", or "President" in
	 * 				given_name. These titles should not be submitted to Crossref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_GivenName()
	 * @model unique="false" dataType="org.crossref.schema._4._4.GivenNameType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='given_name' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getGivenName();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.PrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Prefix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PrefixType> getPrefix();

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   The surname of an author or editor. The surname, combined with
	 * 				given_name, forms the name of an author or editor. Whenever possible, the given name
	 * 				should not be included in the surname element. In cases where the given name is not
	 * 				clear, as may happen with non-Western names or some societies in which surnames are
	 * 				not distinguished, you may place the entire name in surname, e.g.: 
	 *   <surname>Leonardo
	 * 					da Vinci</surname>
	 *    If an author is an organization, you should use organization,
	 * 				not surname. Suffixes should be tagged with suffix. Author degrees (e.g. M.D.,
	 * 				Ph.D.) should not be included in Crossref submissions.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Surname()
	 * @model unique="false" dataType="org.crossref.schema._4._4.SurnameType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getSurname();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The suffix of an author name, e.g. junior or senior. A name suffix,
	 * 				that typically denotes a generation distinction, is tagged with suffix. Author
	 * 				degrees (e.g. M.D., Ph.D.) should not be included in Crossref
	 * 				submissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Suffix()
	 * @model unique="false" dataType="org.crossref.schema._4._4.SuffixType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='suffix' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getSuffix();

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(Object)
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	Object getContentType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StringNameType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Object value);

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
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StringNameType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.StringNameType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.StringNameType#getLanguage <em>Language</em>}' attribute is set.
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
	 * The default value is <code>"western"</code>.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.NameStyleType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Style</em>' attribute.
	 * @see org.crossref.schema._4._4.NameStyleType1
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #setNameStyle(NameStyleType1)
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_NameStyle()
	 * @model default="western" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='name-style'"
	 * @generated
	 */
	NameStyleType1 getNameStyle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StringNameType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Style</em>' attribute.
	 * @see org.crossref.schema._4._4.NameStyleType1
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @generated
	 */
	void setNameStyle(NameStyleType1 value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.StringNameType#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType1)
	 * @generated
	 */
	void unsetNameStyle();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.StringNameType#getNameStyle <em>Name Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Style</em>' attribute is set.
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType1)
	 * @generated
	 */
	boolean isSetNameStyle();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(Object)
	 * @see org.crossref.schema._4._4._4Package#getStringNameType_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	Object getSpecificUse();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.StringNameType#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(Object value);

} // StringNameType
