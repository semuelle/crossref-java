/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.crossref.access.indicators.ProgramType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getFormat <em>Format</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getDoiData <em>Doi Data</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getDoi <em>Doi</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getComponentSize <em>Component Size</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getParentRelation <em>Parent Relation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.ComponentType#getRegAgency <em>Reg Agency</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getComponentType()
 * @model extendedMetaData="name='component_._type' kind='elementOnly'"
 * @generated
 */
public interface ComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for the title and original language title
	 * 				elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference.
	 * @see #setTitles(TitlesType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Titles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='titles' namespace='##targetNamespace'"
	 * @generated
	 */
	TitlesType getTitles();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(TitlesType value);

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for all who contributed to authoring or editing an
	 * 				entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributors</em>' containment reference.
	 * @see #setContributors(ContributorsType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Contributors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributors' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributorsType getContributors();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getContributors <em>Contributors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' containment reference.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(ContributorsType value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of publication. In all cases, multiple dates are allowed to
	 * 				allow for different dates of publication for online and print versions. This element
	 * 				was previously called date, but was renamed publication_date to distinguish more
	 * 				clearly from conference_date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(PublicationDateType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_PublicationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publication_date' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationDateType getPublicationDate();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(PublicationDateType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of a file (e.g. a figure caption or video
	 * 				description) which may be independent of the host document context. The description
	 * 				element may be present more than once to provide alternative language
	 * 				values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of a component's file format and/or the file
	 * 				extension (for mime types refer to http://www.iana.org/assignments/media-types/) The
	 * 				format element may contain only the mime_type attribute, or in addition it may
	 * 				contain a narrative description of the file format. Be sure to use the narrative
	 * 				portion to description only the format of the component and not the actual content
	 * 				of the component (use description to describe the component's
	 * 				content).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(FormatType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accommodates deposit of license metadata. The license_ref value will
	 *                 be a URL. Values for the "applies_to" attribute are vor (version of record),am
	 *                 (accepted manuscript), and tdm (text and data mining).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='http://www.crossref.org/AccessIndicators.xsd'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Doi Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container for elements related directly to a DOI. doi_data
	 * 				contains the doi, timestamp (version) and corresponding resource (URI) data for the
	 * 				doi. Cases of single-resolution (i.e. one DOI with a single corresponding URI)
	 * 				should be tagged with a doi/resource pair in doi_data. If additional resources are
	 * 				to be proved the <collection> element may also be used. The single URL
	 * 				provided in the <resource> is mandatory and serves as the single resolution
	 * 				target for the DOI. Note: A timestamp value placed inside doi_data will override any
	 * 				timestamp value placed in the <head> element. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi Data</em>' containment reference.
	 * @see #setDoiData(DoiDataType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_DoiData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doi_data' namespace='##targetNamespace'"
	 * @generated
	 */
	DoiDataType getDoiData();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getDoiData <em>Doi Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi Data</em>' containment reference.
	 * @see #getDoiData()
	 * @generated
	 */
	void setDoiData(DoiDataType value);

	/**
	 * Returns the value of the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOI for an entity being registered with Crossref. In 2008 Crossref
	 * 				restricted DOI suffix characters to the following: "a-z", "A-Z", "0-9" and "-._;()/"
	 * 				Existing DOIs with suffix characters outside of the allowed set are still supported.
	 * 				For additional information on DOI syntax, see
	 * 				https://support.crossref.org/hc/en-us/articles/214669823
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doi</em>' attribute.
	 * @see #setDoi(String)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Doi()
	 * @model dataType="org.crossref.schema._4._4.DoiType"
	 *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDoi();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getDoi <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doi</em>' attribute.
	 * @see #getDoi()
	 * @generated
	 */
	void setDoi(String value);

	/**
	 * Returns the value of the '<em><b>Component Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Size</em>' attribute.
	 * @see #setComponentSize(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_ComponentSize()
	 * @model dataType="org.crossref.schema._4._4.ComponentSizeType"
	 *        extendedMetaData="kind='attribute' name='component_size'"
	 * @generated
	 */
	BigInteger getComponentSize();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getComponentSize <em>Component Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Size</em>' attribute.
	 * @see #getComponentSize()
	 * @generated
	 */
	void setComponentSize(BigInteger value);

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
	 * @see org.crossref.schema._4._4._4Package#getComponentType_Language()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getLanguage <em>Language</em>}' attribute.
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
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ComponentType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(LanguageType)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ComponentType#getLanguage <em>Language</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Parent Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.crossref.schema._4._4.ParentRelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Relation</em>' attribute.
	 * @see org.crossref.schema._4._4.ParentRelationType
	 * @see #isSetParentRelation()
	 * @see #unsetParentRelation()
	 * @see #setParentRelation(ParentRelationType)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_ParentRelation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='parent_relation'"
	 * @generated
	 */
	ParentRelationType getParentRelation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getParentRelation <em>Parent Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Relation</em>' attribute.
	 * @see org.crossref.schema._4._4.ParentRelationType
	 * @see #isSetParentRelation()
	 * @see #unsetParentRelation()
	 * @see #getParentRelation()
	 * @generated
	 */
	void setParentRelation(ParentRelationType value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.ComponentType#getParentRelation <em>Parent Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParentRelation()
	 * @see #getParentRelation()
	 * @see #setParentRelation(ParentRelationType)
	 * @generated
	 */
	void unsetParentRelation();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.ComponentType#getParentRelation <em>Parent Relation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parent Relation</em>' attribute is set.
	 * @see #unsetParentRelation()
	 * @see #getParentRelation()
	 * @see #setParentRelation(ParentRelationType)
	 * @generated
	 */
	boolean isSetParentRelation();

	/**
	 * Returns the value of the '<em><b>Reg Agency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Agency</em>' attribute.
	 * @see #setRegAgency(String)
	 * @see org.crossref.schema._4._4._4Package#getComponentType_RegAgency()
	 * @model dataType="org.crossref.schema._4._4.RegAgencyType"
	 *        extendedMetaData="kind='attribute' name='reg-agency'"
	 * @generated
	 */
	String getRegAgency();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.ComponentType#getRegAgency <em>Reg Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Agency</em>' attribute.
	 * @see #getRegAgency()
	 * @generated
	 */
	void setRegAgency(String value);

} // ComponentType
