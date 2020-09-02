/**
 */
package org.crossref.clinicaltrials;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *   
 *          Linked Clinical Trials is a CrossRef initiative helping to connect the published literature to registered clinical trials associated with the research,
 *          
 *             - version 1.0 (initial release) September 24, 2015
 *         
 * <!-- end-model-doc -->
 * @see org.crossref.clinicaltrials.ClinicaltrialsFactory
 * @model kind="package"
 * @generated
 */
public interface ClinicaltrialsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clinicaltrials";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.crossref.org/clinicaltrials.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "clinicaltrials";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClinicaltrialsPackage eINSTANCE = org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.crossref.clinicaltrials.impl.ClinicalTrialNumberTypeImpl <em>Clinical Trial Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.clinicaltrials.impl.ClinicalTrialNumberTypeImpl
	 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getClinicalTrialNumberType()
	 * @generated
	 */
	int CLINICAL_TRIAL_NUMBER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_TRIAL_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_TRIAL_NUMBER_TYPE__REGISTRY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_TRIAL_NUMBER_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Clinical Trial Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_TRIAL_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Clinical Trial Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_TRIAL_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.clinicaltrials.impl.ProgramTypeImpl <em>Program Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.clinicaltrials.impl.ProgramTypeImpl
	 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getProgramType()
	 * @generated
	 */
	int PROGRAM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Clinical Trial Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.clinicaltrials.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.clinicaltrials.impl.DocumentRootImpl
	 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Clinical Trial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLINICAL_TRIAL_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROGRAM = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.clinicaltrials.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.clinicaltrials.TypeType
	 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Registry Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getRegistryType()
	 * @generated
	 */
	int REGISTRY_TYPE = 4;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.clinicaltrials.TypeType
	 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 5;


	/**
	 * Returns the meta object for class '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType <em>Clinical Trial Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clinical Trial Number Type</em>'.
	 * @see org.crossref.clinicaltrials.ClinicalTrialNumberType
	 * @generated
	 */
	EClass getClinicalTrialNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.clinicaltrials.ClinicalTrialNumberType#getMixed()
	 * @see #getClinicalTrialNumberType()
	 * @generated
	 */
	EAttribute getClinicalTrialNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry</em>'.
	 * @see org.crossref.clinicaltrials.ClinicalTrialNumberType#getRegistry()
	 * @see #getClinicalTrialNumberType()
	 * @generated
	 */
	EAttribute getClinicalTrialNumberType_Registry();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.clinicaltrials.ClinicalTrialNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.crossref.clinicaltrials.ClinicalTrialNumberType#getType()
	 * @see #getClinicalTrialNumberType()
	 * @generated
	 */
	EAttribute getClinicalTrialNumberType_Type();

	/**
	 * Returns the meta object for class '{@link org.crossref.clinicaltrials.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Type</em>'.
	 * @see org.crossref.clinicaltrials.ProgramType
	 * @generated
	 */
	EClass getProgramType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.clinicaltrials.ProgramType#getClinicalTrialNumber <em>Clinical Trial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clinical Trial Number</em>'.
	 * @see org.crossref.clinicaltrials.ProgramType#getClinicalTrialNumber()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_ClinicalTrialNumber();

	/**
	 * Returns the meta object for class '{@link org.crossref.clinicaltrials.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.crossref.clinicaltrials.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.clinicaltrials.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.clinicaltrials.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.crossref.clinicaltrials.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.crossref.clinicaltrials.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.crossref.clinicaltrials.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.crossref.clinicaltrials.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.clinicaltrials.DocumentRoot#getClinicalTrialNumber <em>Clinical Trial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clinical Trial Number</em>'.
	 * @see org.crossref.clinicaltrials.DocumentRoot#getClinicalTrialNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClinicalTrialNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.clinicaltrials.DocumentRoot#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.clinicaltrials.DocumentRoot#getProgram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Program();

	/**
	 * Returns the meta object for enum '{@link org.crossref.clinicaltrials.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.crossref.clinicaltrials.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Registry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registry Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='registry_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='200' minLength='12' pattern='10.18810/[a-z-]+'"
	 * @generated
	 */
	EDataType getRegistryType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.clinicaltrials.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.crossref.clinicaltrials.TypeType
	 * @model instanceClass="org.crossref.clinicaltrials.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClinicaltrialsFactory getClinicaltrialsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.crossref.clinicaltrials.impl.ClinicalTrialNumberTypeImpl <em>Clinical Trial Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.clinicaltrials.impl.ClinicalTrialNumberTypeImpl
		 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getClinicalTrialNumberType()
		 * @generated
		 */
		EClass CLINICAL_TRIAL_NUMBER_TYPE = eINSTANCE.getClinicalTrialNumberType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_TRIAL_NUMBER_TYPE__MIXED = eINSTANCE.getClinicalTrialNumberType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_TRIAL_NUMBER_TYPE__REGISTRY = eINSTANCE.getClinicalTrialNumberType_Registry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_TRIAL_NUMBER_TYPE__TYPE = eINSTANCE.getClinicalTrialNumberType_Type();

		/**
		 * The meta object literal for the '{@link org.crossref.clinicaltrials.impl.ProgramTypeImpl <em>Program Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.clinicaltrials.impl.ProgramTypeImpl
		 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getProgramType()
		 * @generated
		 */
		EClass PROGRAM_TYPE = eINSTANCE.getProgramType();

		/**
		 * The meta object literal for the '<em><b>Clinical Trial Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER = eINSTANCE.getProgramType_ClinicalTrialNumber();

		/**
		 * The meta object literal for the '{@link org.crossref.clinicaltrials.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.clinicaltrials.impl.DocumentRootImpl
		 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Clinical Trial Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLINICAL_TRIAL_NUMBER = eINSTANCE.getDocumentRoot_ClinicalTrialNumber();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROGRAM = eINSTANCE.getDocumentRoot_Program();

		/**
		 * The meta object literal for the '{@link org.crossref.clinicaltrials.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.clinicaltrials.TypeType
		 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Registry Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getRegistryType()
		 * @generated
		 */
		EDataType REGISTRY_TYPE = eINSTANCE.getRegistryType();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.clinicaltrials.TypeType
		 * @see org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //ClinicaltrialsPackage
