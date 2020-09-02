/**
 */
package org.crossref.access.indicators.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;

import gov.nih.nlm.ncbi.jats1.impl.Jats1PackageImpl;

import org.crossref.access.indicators.AppliesToType;
import org.crossref.access.indicators.DocumentRoot;
import org.crossref.access.indicators.FreeToReadType;
import org.crossref.access.indicators.IndicatorsFactory;
import org.crossref.access.indicators.IndicatorsPackage;
import org.crossref.access.indicators.LicenseRefType;
import org.crossref.access.indicators.ProgramType;

import org.crossref.access.indicators.util.IndicatorsValidator;

import org.crossref.clinicaltrials.ClinicaltrialsPackage;

import org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl;

import org.crossref.fundref.FundrefPackage;

import org.crossref.fundref.impl.FundrefPackageImpl;

import org.crossref.relations.RelationsPackage;

import org.crossref.relations.impl.RelationsPackageImpl;

import org.crossref.schema._4._4._4Package;

import org.crossref.schema._4._4.impl._4PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.niso.schemas.ali._1._0._0Package;

import org.niso.schemas.ali._1._0.impl._0PackageImpl;

import org.w3._1998.math.math.ml.MlPackage;

import org.w3._1998.math.math.ml.impl.MlPackageImpl;

import org.w3._1999.xlink.XlinkPackage;

import org.w3._1999.xlink.impl.XlinkPackageImpl;

import org.w3.xml._1998.namespace.NamespacePackage;

import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndicatorsPackageImpl extends EPackageImpl implements IndicatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeToReadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appliesToTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType appliesToTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType licenseRefTEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.crossref.access.indicators.IndicatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IndicatorsPackageImpl() {
		super(eNS_URI, IndicatorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IndicatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IndicatorsPackage init() {
		if (isInited) return (IndicatorsPackage)EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIndicatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IndicatorsPackageImpl theIndicatorsPackage = registeredIndicatorsPackage instanceof IndicatorsPackageImpl ? (IndicatorsPackageImpl)registeredIndicatorsPackage : new IndicatorsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI);
		_4PackageImpl the_4Package = (_4PackageImpl)(registeredPackage instanceof _4PackageImpl ? registeredPackage : _4Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Jats1Package.eNS_URI);
		Jats1PackageImpl theJats1Package = (Jats1PackageImpl)(registeredPackage instanceof Jats1PackageImpl ? registeredPackage : Jats1Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(registeredPackage instanceof XlinkPackageImpl ? registeredPackage : XlinkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(registeredPackage instanceof NamespacePackageImpl ? registeredPackage : NamespacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MlPackage.eNS_URI);
		MlPackageImpl theMlPackage = (MlPackageImpl)(registeredPackage instanceof MlPackageImpl ? registeredPackage : MlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);
		_0PackageImpl the_0Package = (_0PackageImpl)(registeredPackage instanceof _0PackageImpl ? registeredPackage : _0Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FundrefPackage.eNS_URI);
		FundrefPackageImpl theFundrefPackage = (FundrefPackageImpl)(registeredPackage instanceof FundrefPackageImpl ? registeredPackage : FundrefPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(registeredPackage instanceof RelationsPackageImpl ? registeredPackage : RelationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClinicaltrialsPackage.eNS_URI);
		ClinicaltrialsPackageImpl theClinicaltrialsPackage = (ClinicaltrialsPackageImpl)(registeredPackage instanceof ClinicaltrialsPackageImpl ? registeredPackage : ClinicaltrialsPackage.eINSTANCE);

		// Load packages
		the_4Package.loadPackage();
		theJats1Package.loadPackage();
		theMlPackage.loadPackage();

		// Create package meta-data objects
		theIndicatorsPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package.createPackageContents();
		theFundrefPackage.createPackageContents();
		theRelationsPackage.createPackageContents();
		theClinicaltrialsPackage.createPackageContents();

		// Initialize created meta-data
		theIndicatorsPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theFundrefPackage.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theClinicaltrialsPackage.initializePackageContents();

		// Fix loaded packages
		the_4Package.fixPackageContents();
		theJats1Package.fixPackageContents();
		theMlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIndicatorsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return IndicatorsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIndicatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IndicatorsPackage.eNS_URI, theIndicatorsPackage);
		return theIndicatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreeToReadType() {
		return freeToReadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeToReadType_EndDate() {
		return (EAttribute)freeToReadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeToReadType_StartDate() {
		return (EAttribute)freeToReadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseRefType() {
		return licenseRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseRefType_Value() {
		return (EAttribute)licenseRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseRefType_AppliesTo() {
		return (EAttribute)licenseRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseRefType_StartDate() {
		return (EAttribute)licenseRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramType() {
		return programTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramType_FreeToRead() {
		return (EReference)programTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramType_LicenseRef() {
		return (EReference)programTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramType_Name() {
		return (EAttribute)programTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FreeToRead() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LicenseRef() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Program() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAppliesToType() {
		return appliesToTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAppliesToTypeObject() {
		return appliesToTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLicenseRefT() {
		return licenseRefTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndicatorsFactory getIndicatorsFactory() {
		return (IndicatorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		freeToReadTypeEClass = createEClass(FREE_TO_READ_TYPE);
		createEAttribute(freeToReadTypeEClass, FREE_TO_READ_TYPE__END_DATE);
		createEAttribute(freeToReadTypeEClass, FREE_TO_READ_TYPE__START_DATE);

		licenseRefTypeEClass = createEClass(LICENSE_REF_TYPE);
		createEAttribute(licenseRefTypeEClass, LICENSE_REF_TYPE__VALUE);
		createEAttribute(licenseRefTypeEClass, LICENSE_REF_TYPE__APPLIES_TO);
		createEAttribute(licenseRefTypeEClass, LICENSE_REF_TYPE__START_DATE);

		programTypeEClass = createEClass(PROGRAM_TYPE);
		createEReference(programTypeEClass, PROGRAM_TYPE__FREE_TO_READ);
		createEReference(programTypeEClass, PROGRAM_TYPE__LICENSE_REF);
		createEAttribute(programTypeEClass, PROGRAM_TYPE__NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FREE_TO_READ);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LICENSE_REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROGRAM);

		// Create enums
		appliesToTypeEEnum = createEEnum(APPLIES_TO_TYPE);

		// Create data types
		appliesToTypeObjectEDataType = createEDataType(APPLIES_TO_TYPE_OBJECT);
		licenseRefTEDataType = createEDataType(LICENSE_REF_T);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(freeToReadTypeEClass, FreeToReadType.class, "FreeToReadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeToReadType_EndDate(), theXMLTypePackage.getDate(), "endDate", null, 0, 1, FreeToReadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeToReadType_StartDate(), theXMLTypePackage.getDate(), "startDate", null, 0, 1, FreeToReadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseRefTypeEClass, LicenseRefType.class, "LicenseRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicenseRefType_Value(), this.getLicenseRefT(), "value", null, 0, 1, LicenseRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseRefType_AppliesTo(), this.getAppliesToType(), "appliesTo", null, 0, 1, LicenseRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseRefType_StartDate(), theXMLTypePackage.getDate(), "startDate", null, 0, 1, LicenseRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programTypeEClass, ProgramType.class, "ProgramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramType_FreeToRead(), this.getFreeToReadType(), null, "freeToRead", null, 0, 1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramType_LicenseRef(), this.getLicenseRefType(), null, "licenseRef", null, 0, -1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramType_Name(), theXMLTypePackage.getString(), "name", "AccessIndicators", 0, 1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FreeToRead(), this.getFreeToReadType(), null, "freeToRead", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LicenseRef(), this.getLicenseRefType(), null, "licenseRef", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Program(), this.getProgramType(), null, "program", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(appliesToTypeEEnum, AppliesToType.class, "AppliesToType");
		addEEnumLiteral(appliesToTypeEEnum, AppliesToType.VOR);
		addEEnumLiteral(appliesToTypeEEnum, AppliesToType.AM);
		addEEnumLiteral(appliesToTypeEEnum, AppliesToType.TDM);

		// Initialize data types
		initEDataType(appliesToTypeObjectEDataType, AppliesToType.class, "AppliesToTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(licenseRefTEDataType, String.class, "LicenseRefT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (appliesToTypeEEnum,
		   source,
		   new String[] {
			   "name", "applies_to_._type"
		   });
		addAnnotation
		  (appliesToTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "applies_to_._type:Object",
			   "baseType", "applies_to_._type"
		   });
		addAnnotation
		  (freeToReadTypeEClass,
		   source,
		   new String[] {
			   "name", "free_to_read_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getFreeToReadType_EndDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "end_date"
		   });
		addAnnotation
		  (getFreeToReadType_StartDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "start_date"
		   });
		addAnnotation
		  (licenseRefTEDataType,
		   source,
		   new String[] {
			   "name", "license_ref_t",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			   "minLength", "10",
			   "pattern", "([hH][tT][tT][pP]|[hH][tT][tT][pP][sS]|[fF][tT][pP])://.*"
		   });
		addAnnotation
		  (licenseRefTypeEClass,
		   source,
		   new String[] {
			   "name", "license_ref_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLicenseRefType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLicenseRefType_AppliesTo(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "applies_to"
		   });
		addAnnotation
		  (getLicenseRefType_StartDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "start_date"
		   });
		addAnnotation
		  (programTypeEClass,
		   source,
		   new String[] {
			   "name", "program_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProgramType_FreeToRead(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "free_to_read",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProgramType_LicenseRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license_ref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProgramType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_FreeToRead(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "free_to_read",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LicenseRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license_ref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Program(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "program",
			   "namespace", "##targetNamespace"
		   });
	}

} //IndicatorsPackageImpl
