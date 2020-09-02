/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.DatabaseType#getDatabaseMetadata <em>Database Metadata</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DatabaseType#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.DatabaseType#getComponentList <em>Component List</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getDatabaseType()
 * @model extendedMetaData="name='database_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Database Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * database_metadata contains metadata about the database. contributors
	 * 				contains the author(s) of the database. In most cases, it is expected that the
	 * 				organization element will be used rather than person_name element for the primary
	 * 				database authoring information. contributors should not be confused with publisher
	 * 				and institution. In many cases, databases are more likely to have one or both of the
	 * 				latter elements rather than contributors at the top level (dataset elements are more
	 * 				likely to have contributors). In most cases, the institution element may be the best
	 * 				choice to deposit the database host organization because it includes the
	 * 				institution_acronym element along with the name. The titles element is used to
	 * 				capture the name of the database. The description element can be used to capture a
	 * 				fuller description of the nature of the database than might be inferred from the
	 * 				title. database_date should be used to capture the date that a database was first
	 * 				created. Whenever updated records are deposited with Crossref, the update_date
	 * 				should be set to the date of the most recent Crossref deposit. publisher_item may be
	 * 				used to record an identifying number for the database other than the
	 * 				DOI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Metadata</em>' containment reference.
	 * @see #setDatabaseMetadata(DatabaseMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getDatabaseType_DatabaseMetadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='database_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseMetadataType getDatabaseMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DatabaseType#getDatabaseMetadata <em>Database Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Metadata</em>' containment reference.
	 * @see #getDatabaseMetadata()
	 * @generated
	 */
	void setDatabaseMetadata(DatabaseMetadataType value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.DatasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dataset is used to capture information about one or more database
	 * 				records or collections. The dataset_type attribute should be set to either "record"
	 * 				or "collection" to indicate the type of deposit. The default value of this attribute
	 * 				is "record". dataset entries are not intended to contain the entire database record
	 * 				or collection. They are only intended to contain the metadata for each database
	 * 				record or collection. The metadata can include: contributors: the author(s) of a
	 * 				database record or collection titles: the title of a database record or collection
	 * 				database_date: the creation date, publication date (if different from the creation
	 * 				date) and the date of last update of the record publisher_item: the record number of
	 * 				the dataset item. In this context, publisher_item can be used for the record number
	 * 				of each item in the database. description: a brief summary description of the
	 * 				contents of the database format: the format type of the dataset item if it includes
	 * 				files rather than just text. Note the format element here should not be used to
	 * 				describe the format of items deposited as part of the component_list doi_data: the
	 * 				doi of the item. citation_list: a list of items (e.g. journal articles) cited by the
	 * 				dataset item. For example, dataset entry from a taxonomy might cite the article in
	 * 				which a species was first identified. component_list: a list of components included
	 * 				in the dataset item such as supporting figures 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getDatabaseType_Dataset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatasetType> getDataset();

	/**
	 * Returns the value of the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The wrapper element for including a group of components under a
	 * 				journal article, conference proceeding, book chapter, stand alone component,
	 * 				dissertation, technical report or working paper, standard, or
	 * 				database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component List</em>' containment reference.
	 * @see #setComponentList(ComponentListType)
	 * @see org.crossref.schema._4._4._4Package#getDatabaseType_ComponentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component_list' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentListType getComponentList();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.DatabaseType#getComponentList <em>Component List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component List</em>' containment reference.
	 * @see #getComponentList()
	 * @generated
	 */
	void setComponentList(ComponentListType value);

} // DatabaseType
