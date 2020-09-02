/**
 */
package org.crossref.fundref;

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
 * @see org.crossref.fundref.FundrefFactory
 * @model kind="package"
 * @generated
 */
public interface FundrefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fundref";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.crossref.org/fundref.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fundref";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FundrefPackage eINSTANCE = org.crossref.fundref.impl.FundrefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.crossref.fundref.impl.AssertionTypeImpl <em>Assertion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.impl.AssertionTypeImpl
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getAssertionType()
	 * @generated
	 */
	int ASSERTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__ASSERTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE__PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Assertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Assertion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.fundref.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.impl.DocumentRootImpl
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSERTION = 3;

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
	 * The meta object id for the '{@link org.crossref.fundref.impl.ProgramTypeImpl <em>Program Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.impl.ProgramTypeImpl
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getProgramType()
	 * @generated
	 */
	int PROGRAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__ASSERTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.crossref.fundref.NameType <em>Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.NameType
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.crossref.fundref.ProviderType <em>Provider Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.ProviderType
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getProviderType()
	 * @generated
	 */
	int PROVIDER_TYPE = 4;

	/**
	 * The meta object id for the '<em>Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.NameType
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getNameTypeObject()
	 * @generated
	 */
	int NAME_TYPE_OBJECT = 5;

	/**
	 * The meta object id for the '<em>Provider Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.crossref.fundref.ProviderType
	 * @see org.crossref.fundref.impl.FundrefPackageImpl#getProviderTypeObject()
	 * @generated
	 */
	int PROVIDER_TYPE_OBJECT = 6;


	/**
	 * Returns the meta object for class '{@link org.crossref.fundref.AssertionType <em>Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Type</em>'.
	 * @see org.crossref.fundref.AssertionType
	 * @generated
	 */
	EClass getAssertionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.fundref.AssertionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.fundref.AssertionType#getMixed()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.fundref.AssertionType#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertion</em>'.
	 * @see org.crossref.fundref.AssertionType#getAssertion()
	 * @see #getAssertionType()
	 * @generated
	 */
	EReference getAssertionType_Assertion();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.fundref.AssertionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.crossref.fundref.AssertionType#getName()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.fundref.AssertionType#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.crossref.fundref.AssertionType#getProvider()
	 * @see #getAssertionType()
	 * @generated
	 */
	EAttribute getAssertionType_Provider();

	/**
	 * Returns the meta object for class '{@link org.crossref.fundref.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.crossref.fundref.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.crossref.fundref.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.crossref.fundref.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.crossref.fundref.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.crossref.fundref.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.crossref.fundref.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.crossref.fundref.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.fundref.DocumentRoot#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see org.crossref.fundref.DocumentRoot#getAssertion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.crossref.fundref.DocumentRoot#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see org.crossref.fundref.DocumentRoot#getProgram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Program();

	/**
	 * Returns the meta object for class '{@link org.crossref.fundref.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Type</em>'.
	 * @see org.crossref.fundref.ProgramType
	 * @generated
	 */
	EClass getProgramType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.crossref.fundref.ProgramType#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertion</em>'.
	 * @see org.crossref.fundref.ProgramType#getAssertion()
	 * @see #getProgramType()
	 * @generated
	 */
	EReference getProgramType_Assertion();

	/**
	 * Returns the meta object for the attribute '{@link org.crossref.fundref.ProgramType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.crossref.fundref.ProgramType#getName()
	 * @see #getProgramType()
	 * @generated
	 */
	EAttribute getProgramType_Name();

	/**
	 * Returns the meta object for enum '{@link org.crossref.fundref.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Type</em>'.
	 * @see org.crossref.fundref.NameType
	 * @generated
	 */
	EEnum getNameType();

	/**
	 * Returns the meta object for enum '{@link org.crossref.fundref.ProviderType <em>Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provider Type</em>'.
	 * @see org.crossref.fundref.ProviderType
	 * @generated
	 */
	EEnum getProviderType();

	/**
	 * Returns the meta object for data type '{@link org.crossref.fundref.NameType <em>Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type Object</em>'.
	 * @see org.crossref.fundref.NameType
	 * @model instanceClass="org.crossref.fundref.NameType"
	 *        extendedMetaData="name='name_._type:Object' baseType='name_._type'"
	 * @generated
	 */
	EDataType getNameTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.crossref.fundref.ProviderType <em>Provider Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Provider Type Object</em>'.
	 * @see org.crossref.fundref.ProviderType
	 * @model instanceClass="org.crossref.fundref.ProviderType"
	 *        extendedMetaData="name='provider_._type:Object' baseType='provider_._type'"
	 * @generated
	 */
	EDataType getProviderTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FundrefFactory getFundrefFactory();

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
		 * The meta object literal for the '{@link org.crossref.fundref.impl.AssertionTypeImpl <em>Assertion Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.impl.AssertionTypeImpl
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getAssertionType()
		 * @generated
		 */
		EClass ASSERTION_TYPE = eINSTANCE.getAssertionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_TYPE__MIXED = eINSTANCE.getAssertionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_TYPE__ASSERTION = eINSTANCE.getAssertionType_Assertion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_TYPE__NAME = eINSTANCE.getAssertionType_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_TYPE__PROVIDER = eINSTANCE.getAssertionType_Provider();

		/**
		 * The meta object literal for the '{@link org.crossref.fundref.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.impl.DocumentRootImpl
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSERTION = eINSTANCE.getDocumentRoot_Assertion();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROGRAM = eINSTANCE.getDocumentRoot_Program();

		/**
		 * The meta object literal for the '{@link org.crossref.fundref.impl.ProgramTypeImpl <em>Program Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.impl.ProgramTypeImpl
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getProgramType()
		 * @generated
		 */
		EClass PROGRAM_TYPE = eINSTANCE.getProgramType();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TYPE__ASSERTION = eINSTANCE.getProgramType_Assertion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_TYPE__NAME = eINSTANCE.getProgramType_Name();

		/**
		 * The meta object literal for the '{@link org.crossref.fundref.NameType <em>Name Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.NameType
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getNameType()
		 * @generated
		 */
		EEnum NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '{@link org.crossref.fundref.ProviderType <em>Provider Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.ProviderType
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getProviderType()
		 * @generated
		 */
		EEnum PROVIDER_TYPE = eINSTANCE.getProviderType();

		/**
		 * The meta object literal for the '<em>Name Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.NameType
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getNameTypeObject()
		 * @generated
		 */
		EDataType NAME_TYPE_OBJECT = eINSTANCE.getNameTypeObject();

		/**
		 * The meta object literal for the '<em>Provider Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.crossref.fundref.ProviderType
		 * @see org.crossref.fundref.impl.FundrefPackageImpl#getProviderTypeObject()
		 * @generated
		 */
		EDataType PROVIDER_TYPE_OBJECT = eINSTANCE.getProviderTypeObject();

	}

} //FundrefPackage
