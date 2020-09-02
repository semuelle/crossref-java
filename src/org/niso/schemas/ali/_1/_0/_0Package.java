/**
 */
package org.niso.schemas.ali._1._0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.niso.schemas.ali._1._0._0Factory
 * @model kind="package"
 * @generated
 */
public interface _0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.niso.org/schemas/ali/1.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_0Package eINSTANCE = org.niso.schemas.ali._1._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.niso.schemas.ali._1._0.impl.FreeToReadTypeImpl <em>Free To Read Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.niso.schemas.ali._1._0.impl.FreeToReadTypeImpl
	 * @see org.niso.schemas.ali._1._0.impl._0PackageImpl#getFreeToReadType()
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
	 * The meta object id for the '{@link org.niso.schemas.ali._1._0.impl.LicenseRefTypeImpl <em>License Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.niso.schemas.ali._1._0.impl.LicenseRefTypeImpl
	 * @see org.niso.schemas.ali._1._0.impl._0PackageImpl#getLicenseRefType()
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
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE__START_DATE = 1;

	/**
	 * The number of structural features of the '<em>License Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>License Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.niso.schemas.ali._1._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.niso.schemas.ali._1._0.impl.DocumentRootImpl
	 * @see org.niso.schemas.ali._1._0.impl._0PackageImpl#getDocumentRoot()
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
	 * Returns the meta object for class '{@link org.niso.schemas.ali._1._0.FreeToReadType <em>Free To Read Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free To Read Type</em>'.
	 * @see org.niso.schemas.ali._1._0.FreeToReadType
	 * @generated
	 */
	EClass getFreeToReadType();

	/**
	 * Returns the meta object for the attribute '{@link org.niso.schemas.ali._1._0.FreeToReadType#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.niso.schemas.ali._1._0.FreeToReadType#getEndDate()
	 * @see #getFreeToReadType()
	 * @generated
	 */
	EAttribute getFreeToReadType_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.niso.schemas.ali._1._0.FreeToReadType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.niso.schemas.ali._1._0.FreeToReadType#getStartDate()
	 * @see #getFreeToReadType()
	 * @generated
	 */
	EAttribute getFreeToReadType_StartDate();

	/**
	 * Returns the meta object for class '{@link org.niso.schemas.ali._1._0.LicenseRefType <em>License Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Ref Type</em>'.
	 * @see org.niso.schemas.ali._1._0.LicenseRefType
	 * @generated
	 */
	EClass getLicenseRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.niso.schemas.ali._1._0.LicenseRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.niso.schemas.ali._1._0.LicenseRefType#getValue()
	 * @see #getLicenseRefType()
	 * @generated
	 */
	EAttribute getLicenseRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.niso.schemas.ali._1._0.LicenseRefType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.niso.schemas.ali._1._0.LicenseRefType#getStartDate()
	 * @see #getLicenseRefType()
	 * @generated
	 */
	EAttribute getLicenseRefType_StartDate();

	/**
	 * Returns the meta object for class '{@link org.niso.schemas.ali._1._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.niso.schemas.ali._1._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.niso.schemas.ali._1._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.niso.schemas.ali._1._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.niso.schemas.ali._1._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.niso.schemas.ali._1._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.niso.schemas.ali._1._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.niso.schemas.ali._1._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.niso.schemas.ali._1._0.DocumentRoot#getFreeToRead <em>Free To Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Free To Read</em>'.
	 * @see org.niso.schemas.ali._1._0.DocumentRoot#getFreeToRead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FreeToRead();

	/**
	 * Returns the meta object for the containment reference '{@link org.niso.schemas.ali._1._0.DocumentRoot#getLicenseRef <em>License Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License Ref</em>'.
	 * @see org.niso.schemas.ali._1._0.DocumentRoot#getLicenseRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LicenseRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

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
		 * The meta object literal for the '{@link org.niso.schemas.ali._1._0.impl.FreeToReadTypeImpl <em>Free To Read Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.niso.schemas.ali._1._0.impl.FreeToReadTypeImpl
		 * @see org.niso.schemas.ali._1._0.impl._0PackageImpl#getFreeToReadType()
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
		 * The meta object literal for the '{@link org.niso.schemas.ali._1._0.impl.LicenseRefTypeImpl <em>License Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.niso.schemas.ali._1._0.impl.LicenseRefTypeImpl
		 * @see org.niso.schemas.ali._1._0.impl._0PackageImpl#getLicenseRefType()
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
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_REF_TYPE__START_DATE = eINSTANCE.getLicenseRefType_StartDate();

		/**
		 * The meta object literal for the '{@link org.niso.schemas.ali._1._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.niso.schemas.ali._1._0.impl.DocumentRootImpl
		 * @see org.niso.schemas.ali._1._0.impl._0PackageImpl#getDocumentRoot()
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

	}

} //_0Package
