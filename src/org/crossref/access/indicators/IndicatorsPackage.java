/**
 */
package org.crossref.access.indicators;

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
 *  Version: 1.1 This is CrossRef's schema for defining the applicable
 *             licenses for a given item. This schema was available and in use prior to the completion
 *             of the NISO working group Access and License Indicators
 *             (http://www.niso.org/publications/rp/rp-22-2015). That effort produced a schema
 *             (http://www.niso.org/schemas/ali/1.0/ali.xsd) that extended the CrossRef definition but
 *             at the same time omitted necessary CrossRef features. This schema will continue as the
 *             basis for CrossRef metadata deposits, but will incorporate the NISO work where possible.
 *             Change history: 2/23/15 CSK added Niso free_to_read element 
 *                             4/21/15 CSK added start and end attributes to the free-to-read element as in the Niso ALI schema
 *                                         but will make both attributes optional.
 *         
 * <!-- end-model-doc -->
 * @see org.crossref.access.indicators.IndicatorsFactory
 * @model kind="package"
 * @generated
 */
public interface IndicatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "indicators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.crossref.org/AccessIndicators.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "indicators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndicatorsPackage eINSTANCE = org.crossref.access.indicators.impl.IndicatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.crossref.access.indicators.impl.FreeToReadTypeImpl <em>Free To Read Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.access.indicators.impl.FreeToReadTypeImpl
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getFreeToReadType()
	 * @generated
	 */
	int FREE_TO_READ_TYPE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TO_READ_TYPE__END_DATE = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TO_READ_TYPE__START_DATE = 1;

	/**
	 * The number of structural features of the '<em>Free To Read Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TO_READ_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Free To Read Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TO_READ_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.access.indicators.impl.LicenseRefTypeImpl <em>License Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.access.indicators.impl.LicenseRefTypeImpl
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getLicenseRefType()
	 * @generated
	 */
	int LICENSE_REF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE__APPLIES_TO = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE__START_DATE = 2;

	/**
	 * The number of structural features of the '<em>License Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>License Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.access.indicators.impl.ProgramTypeImpl <em>Program Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.access.indicators.impl.ProgramTypeImpl
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getProgramType()
	 * @generated
	 */
	int PROGRAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Free To Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__FREE_TO_READ = 0;

	/**
	 * The feature id for the '<em><b>License Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__LICENSE_REF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.access.indicators.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.access.indicators.impl.DocumentRootImpl
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Free To Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FREE_TO_READ = 3;

	/**
	 * The feature id for the '<em><b>License Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LICENSE_REF = 4;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROGRAM = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.access.indicators.AppliesToType <em>Applies To Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.access.indicators.AppliesToType
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getAppliesToType()
	 * @generated
	 */
	int APPLIES_TO_TYPE = 4;

	/**
	 * The meta object id for the '<em>Applies To Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.access.indicators.AppliesToType
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getAppliesToTypeObject()
	 * @generated
	 */
	int APPLIES_TO_TYPE_OBJECT = 5;

	/**
	 * The meta object id for the '<em>License Ref T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getLicenseRefT()
	 * @generated
	 */
	int LICENSE_REF_T = 6;


	/**
	 * Returns the meta object for class '{@link org.crossref.access.indicators.FreeToReadType <em>Free To Read Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free To Read Type</em>'.
	 * @see org.crossref.access.indicators.FreeToReadType
	 * @generated
	 */
	EClass getFreeToReadType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.access.indicators.FreeToReadType#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.crossref.access.indicators.FreeToReadType#getEndDate()
	 * @see #getFreeToReadType()
	 * @generated
	 */
	EAttribute getFreeToReadType_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.access.indicators.FreeToReadType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.crossref.access.indicators.FreeToReadType#getStartDate()
	 * @see #getFreeToReadType()
	 * @generated
	 */
	EAttribute getFreeToReadType_StartDate();

	/**
	 * Returns the meta object for class '{@link org.crossref.access.indicators.LicenseRefType <em>License Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Ref Type</em>'.
	 * @see org.crossref.access.indicators.LicenseRefType
	 * @generated
	 */
	EClass getLicenseRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.access.indicators.LicenseRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.crossref.access.indicators.LicenseRefType#getValue()
	 * @see #getLicenseRefType()
	 * @generated
	 */
	EAttribute getLicenseRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.access.indicators.LicenseRefType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies To</em>'.
	 * @see org.crossref.access.indicators.LicenseRefType#getAppliesTo()
	 * @see #getLicenseRefType()
	 * @generated
	 */
	EAttribute getLicenseRefType_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.access.indicators.LicenseRefType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.crossref.access.indicators.LicenseRefType#getStartDate()
	 * @see #getLicenseRefType()
	 * @generated
	 */
	EAttribute getLicenseRefType_StartDate();

	/**
	 * Returns the meta object for class '{@link org.crossref.access.indicators.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Type</em>'.
	 * @see org.crossref.access.indicators.ProgramType
	 * @generated
	 */
	EClass getProgramType();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.access.indicators.ProgramType#getFreeToRead <em>Free To Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Free To Read</em>'.
	 * @see org.crossref.access.indicators.ProgramType#getFreeToRead()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_FreeToRead();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.access.indicators.ProgramType#getLicenseRef <em>License Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>License Ref</em>'.
	 * @see org.crossref.access.indicators.ProgramType#getLicenseRef()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_LicenseRef();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.access.indicators.ProgramType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.crossref.access.indicators.ProgramType#getName()
	 * @see #getProgramType()
	 * @generated
	 */
	EAttribute getProgramType_Name();

	/**
	 * Returns the meta object for class '{@link org.crossref.access.indicators.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.access.indicators.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.crossref.access.indicators.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.crossref.access.indicators.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.access.indicators.DocumentRoot#getFreeToRead <em>Free To Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Free To Read</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot#getFreeToRead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FreeToRead();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.access.indicators.DocumentRoot#getLicenseRef <em>License Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Ref</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot#getLicenseRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LicenseRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.access.indicators.DocumentRoot#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.access.indicators.DocumentRoot#getProgram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Program();

	/**
	 * Returns the meta object for enum '{@link org.crossref.access.indicators.AppliesToType <em>Applies To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Applies To Type</em>'.
	 * @see org.crossref.access.indicators.AppliesToType
	 * @generated
	 */
	EEnum getAppliesToType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.access.indicators.AppliesToType <em>Applies To Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Applies To Type Object</em>'.
	 * @see org.crossref.access.indicators.AppliesToType
	 * @model instanceClass="org.crossref.access.indicators.AppliesToType"
	 *        extendedMetaData="name='applies_to_._type:Object' baseType='applies_to_._type'"
	 * @generated
	 */
	EDataType getAppliesToTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>License Ref T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>License Ref T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='license_ref_t' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='10' pattern='([hH][tT][tT][pP]|[hH][tT][tT][pP][sS]|[fF][tT][pP])://.*'"
	 * @generated
	 */
	EDataType getLicenseRefT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IndicatorsFactory getIndicatorsFactory();

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
		 * The meta object literal for the '{@link org.crossref.access.indicators.impl.FreeToReadTypeImpl <em>Free To Read Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.access.indicators.impl.FreeToReadTypeImpl
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getFreeToReadType()
		 * @generated
		 */
		EClass FREE_TO_READ_TYPE = eINSTANCE.getFreeToReadType();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TO_READ_TYPE__END_DATE = eINSTANCE.getFreeToReadType_EndDate();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TO_READ_TYPE__START_DATE = eINSTANCE.getFreeToReadType_StartDate();

		/**
		 * The meta object literal for the '{@link org.crossref.access.indicators.impl.LicenseRefTypeImpl <em>License Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.access.indicators.impl.LicenseRefTypeImpl
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getLicenseRefType()
		 * @generated
		 */
		EClass LICENSE_REF_TYPE = eINSTANCE.getLicenseRefType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_REF_TYPE__VALUE = eINSTANCE.getLicenseRefType_Value();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_REF_TYPE__APPLIES_TO = eINSTANCE.getLicenseRefType_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_REF_TYPE__START_DATE = eINSTANCE.getLicenseRefType_StartDate();

		/**
		 * The meta object literal for the '{@link org.crossref.access.indicators.impl.ProgramTypeImpl <em>Program Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.access.indicators.impl.ProgramTypeImpl
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getProgramType()
		 * @generated
		 */
		EClass PROGRAM_TYPE = eINSTANCE.getProgramType();

		/**
		 * The meta object literal for the '<em><b>Free To Read</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__FREE_TO_READ = eINSTANCE.getProgramType_FreeToRead();

		/**
		 * The meta object literal for the '<em><b>License Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__LICENSE_REF = eINSTANCE.getProgramType_LicenseRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_TYPE__NAME = eINSTANCE.getProgramType_Name();

		/**
		 * The meta object literal for the '{@link org.crossref.access.indicators.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.access.indicators.impl.DocumentRootImpl
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Free To Read</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FREE_TO_READ = eINSTANCE.getDocumentRoot_FreeToRead();

		/**
		 * The meta object literal for the '<em><b>License Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LICENSE_REF = eINSTANCE.getDocumentRoot_LicenseRef();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROGRAM = eINSTANCE.getDocumentRoot_Program();

		/**
		 * The meta object literal for the '{@link org.crossref.access.indicators.AppliesToType <em>Applies To Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.access.indicators.AppliesToType
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getAppliesToType()
		 * @generated
		 */
		EEnum APPLIES_TO_TYPE = eINSTANCE.getAppliesToType();

		/**
		 * The meta object literal for the '<em>Applies To Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.access.indicators.AppliesToType
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getAppliesToTypeObject()
		 * @generated
		 */
		EDataType APPLIES_TO_TYPE_OBJECT = eINSTANCE.getAppliesToTypeObject();

		/**
		 * The meta object literal for the '<em>License Ref T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.crossref.access.indicators.impl.IndicatorsPackageImpl#getLicenseRefT()
		 * @generated
		 */
		EDataType LICENSE_REF_T = eINSTANCE.getLicenseRefT();

	}

} //IndicatorsPackage
