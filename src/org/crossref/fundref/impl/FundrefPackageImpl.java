/**
 */
package org.crossref.fundref.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;

import gov.nih.nlm.ncbi.jats1.impl.Jats1PackageImpl;

import org.crossref.access.indicators.IndicatorsPackage;

import org.crossref.access.indicators.impl.IndicatorsPackageImpl;

import org.crossref.clinicaltrials.ClinicaltrialsPackage;

import org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl;

import org.crossref.fundref.AssertionType;
import org.crossref.fundref.DocumentRoot;
import org.crossref.fundref.FundrefFactory;
import org.crossref.fundref.FundrefPackage;
import org.crossref.fundref.NameType;
import org.crossref.fundref.ProgramType;
import org.crossref.fundref.ProviderType;

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
public class FundrefPackageImpl extends EPackageImpl implements FundrefPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionTypeEClass = null;

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
	private EClass programTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType providerTypeObjectEDataType = null;

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
	 * @see org.crossref.fundref.FundrefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FundrefPackageImpl() {
		super(eNS_URI, FundrefFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FundrefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FundrefPackage init() {
		if (isInited) return (FundrefPackage)EPackage.Registry.INSTANCE.getEPackage(FundrefPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFundrefPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FundrefPackageImpl theFundrefPackage = registeredFundrefPackage instanceof FundrefPackageImpl ? (FundrefPackageImpl)registeredFundrefPackage : new FundrefPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		RelationsPackageImpl theRelationsPackage = (RelationsPackageImpl)(registeredPackage instanceof RelationsPackageImpl ? registeredPackage : RelationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);
		IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(registeredPackage instanceof IndicatorsPackageImpl ? registeredPackage : IndicatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClinicaltrialsPackage.eNS_URI);
		ClinicaltrialsPackageImpl theClinicaltrialsPackage = (ClinicaltrialsPackageImpl)(registeredPackage instanceof ClinicaltrialsPackageImpl ? registeredPackage : ClinicaltrialsPackage.eINSTANCE);

		// Load packages
		the_4Package.loadPackage();
		theJats1Package.loadPackage();
		theMlPackage.loadPackage();

		// Create package meta-data objects
		theFundrefPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package.createPackageContents();
		theRelationsPackage.createPackageContents();
		theIndicatorsPackage.createPackageContents();
		theClinicaltrialsPackage.createPackageContents();

		// Initialize created meta-data
		theFundrefPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theIndicatorsPackage.initializePackageContents();
		theClinicaltrialsPackage.initializePackageContents();

		// Fix loaded packages
		the_4Package.fixPackageContents();
		theJats1Package.fixPackageContents();
		theMlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFundrefPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FundrefPackage.eNS_URI, theFundrefPackage);
		return theFundrefPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertionType() {
		return assertionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Mixed() {
		return (EAttribute)assertionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Assertion() {
		return (EReference)assertionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Name() {
		return (EAttribute)assertionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Provider() {
		return (EAttribute)assertionTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_Assertion() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Program() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
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
	public EReference getProgramType_Assertion() {
		return (EReference)programTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramType_Name() {
		return (EAttribute)programTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameType() {
		return nameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProviderType() {
		return providerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameTypeObject() {
		return nameTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProviderTypeObject() {
		return providerTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FundrefFactory getFundrefFactory() {
		return (FundrefFactory)getEFactoryInstance();
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
		assertionTypeEClass = createEClass(ASSERTION_TYPE);
		createEAttribute(assertionTypeEClass, ASSERTION_TYPE__MIXED);
		createEReference(assertionTypeEClass, ASSERTION_TYPE__ASSERTION);
		createEAttribute(assertionTypeEClass, ASSERTION_TYPE__NAME);
		createEAttribute(assertionTypeEClass, ASSERTION_TYPE__PROVIDER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSERTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROGRAM);

		programTypeEClass = createEClass(PROGRAM_TYPE);
		createEReference(programTypeEClass, PROGRAM_TYPE__ASSERTION);
		createEAttribute(programTypeEClass, PROGRAM_TYPE__NAME);

		// Create enums
		nameTypeEEnum = createEEnum(NAME_TYPE);
		providerTypeEEnum = createEEnum(PROVIDER_TYPE);

		// Create data types
		nameTypeObjectEDataType = createEDataType(NAME_TYPE_OBJECT);
		providerTypeObjectEDataType = createEDataType(PROVIDER_TYPE_OBJECT);
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
		initEClass(assertionTypeEClass, AssertionType.class, "AssertionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertionType_Assertion(), this.getAssertionType(), null, "assertion", null, 0, -1, AssertionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertionType_Name(), this.getNameType(), "name", null, 1, 1, AssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertionType_Provider(), this.getProviderType(), "provider", "publisher", 0, 1, AssertionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Assertion(), this.getAssertionType(), null, "assertion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Program(), this.getProgramType(), null, "program", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(programTypeEClass, ProgramType.class, "ProgramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramType_Assertion(), this.getAssertionType(), null, "assertion", null, 0, -1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramType_Name(), theXMLTypePackage.getString(), "name", "fundref", 0, 1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nameTypeEEnum, NameType.class, "NameType");
		addEEnumLiteral(nameTypeEEnum, NameType.FUNDGROUP);
		addEEnumLiteral(nameTypeEEnum, NameType.FUNDER_IDENTIFIER);
		addEEnumLiteral(nameTypeEEnum, NameType.FUNDER_NAME);
		addEEnumLiteral(nameTypeEEnum, NameType.AWARD_NUMBER);

		initEEnum(providerTypeEEnum, ProviderType.class, "ProviderType");
		addEEnumLiteral(providerTypeEEnum, ProviderType.PUBLISHER);
		addEEnumLiteral(providerTypeEEnum, ProviderType.CROSSREF);

		// Initialize data types
		initEDataType(nameTypeObjectEDataType, NameType.class, "NameTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(providerTypeObjectEDataType, ProviderType.class, "ProviderTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (assertionTypeEClass,
		   source,
		   new String[] {
			   "name", "assertion_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAssertionType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getAssertionType_Assertion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "assertion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssertionType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getAssertionType_Provider(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "provider"
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
		  (getDocumentRoot_Assertion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "assertion",
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
		addAnnotation
		  (nameTypeEEnum,
		   source,
		   new String[] {
			   "name", "name_._type"
		   });
		addAnnotation
		  (nameTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "name_._type:Object",
			   "baseType", "name_._type"
		   });
		addAnnotation
		  (programTypeEClass,
		   source,
		   new String[] {
			   "name", "program_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProgramType_Assertion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "assertion",
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
		  (providerTypeEEnum,
		   source,
		   new String[] {
			   "name", "provider_._type"
		   });
		addAnnotation
		  (providerTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "provider_._type:Object",
			   "baseType", "provider_._type"
		   });
	}

} //FundrefPackageImpl
