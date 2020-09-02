/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getGivenName1 <em>Given Name1</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.NameType1#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getNameType1()
 * @model extendedMetaData="name='name_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface NameType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
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
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_Surname()
	 * @model dataType="org.crossref.schema._4._4.SurnameType"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
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
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_GivenName()
	 * @model dataType="org.crossref.schema._4._4.GivenNameType"
	 *        extendedMetaData="kind='element' name='given_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Given Name1</b></em>' attribute.
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
	 * @return the value of the '<em>Given Name1</em>' attribute.
	 * @see #setGivenName1(String)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_GivenName1()
	 * @model dataType="org.crossref.schema._4._4.GivenNameType"
	 *        extendedMetaData="kind='element' name='given_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGivenName1();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getGivenName1 <em>Given Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name1</em>' attribute.
	 * @see #getGivenName1()
	 * @generated
	 */
	void setGivenName1(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(PrefixType)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_Prefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	PrefixType getPrefix();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(PrefixType value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The suffix of an author name, e.g. junior or senior. A name suffix,
	 * 				that typically denotes a generation distinction, is tagged with suffix. Author
	 * 				degrees (e.g. M.D., Ph.D.) should not be included in Crossref
	 * 				submissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_Suffix()
	 * @model dataType="org.crossref.schema._4._4.SuffixType"
	 *        extendedMetaData="kind='element' name='suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(Object)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_ContentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	Object getContentType();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getContentType <em>Content Type</em>}' attribute.
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
	 * @see org.crossref.schema._4._4._4Package#getNameType1_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.NameType1#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.NameType1#getLanguage <em>Language</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.NameStyleType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Style</em>' attribute.
	 * @see org.crossref.schema._4._4.NameStyleType2
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #setNameStyle(NameStyleType2)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_NameStyle()
	 * @model default="western" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='name-style'"
	 * @generated
	 */
	NameStyleType2 getNameStyle();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Style</em>' attribute.
	 * @see org.crossref.schema._4._4.NameStyleType2
	 * @see #isSetNameStyle()
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @generated
	 */
	void setNameStyle(NameStyleType2 value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.NameType1#getNameStyle <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType2)
	 * @generated
	 */
	void unsetNameStyle();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.NameType1#getNameStyle <em>Name Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Style</em>' attribute is set.
	 * @see #unsetNameStyle()
	 * @see #getNameStyle()
	 * @see #setNameStyle(NameStyleType2)
	 * @generated
	 */
	boolean isSetNameStyle();

	/**
	 * Returns the value of the '<em><b>Specific Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Use</em>' attribute.
	 * @see #setSpecificUse(Object)
	 * @see org.crossref.schema._4._4._4Package#getNameType1_SpecificUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='specific-use'"
	 * @generated
	 */
	Object getSpecificUse();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.NameType1#getSpecificUse <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Use</em>' attribute.
	 * @see #getSpecificUse()
	 * @generated
	 */
	void setSpecificUse(Object value);

} // NameType1
