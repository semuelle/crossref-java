/**
 */
package org.crossref.clinicaltrials.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;

import gov.nih.nlm.ncbi.jats1.impl.Jats1PackageImpl;

import org.crossref.access.indicators.IndicatorsPackage;

import org.crossref.access.indicators.impl.IndicatorsPackageImpl;

import org.crossref.clinicaltrials.ClinicalTrialNumberType;
import org.crossref.clinicaltrials.ClinicaltrialsFactory;
import org.crossref.clinicaltrials.ClinicaltrialsPackage;
import org.crossref.clinicaltrials.DocumentRoot;
import org.crossref.clinicaltrials.ProgramType;
import org.crossref.clinicaltrials.TypeType;

import org.crossref.clinicaltrials.util.ClinicaltrialsValidator;

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
public class ClinicaltrialsPackageImpl extends EPackageImpl implements ClinicaltrialsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalTrialNumberTypeEClass = null;

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
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

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
	 * @see org.crossref.clinicaltrials.ClinicaltrialsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClinicaltrialsPackageImpl() {
		super(eNS_URI, ClinicaltrialsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClinicaltrialsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClinicaltrialsPackage init() {
		if (isInited) return (ClinicaltrialsPackage)EPackage.Registry.INSTANCE.getEPackage(ClinicaltrialsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredClinicaltrialsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ClinicaltrialsPackageImpl theClinicaltrialsPackage = registeredClinicaltrialsPackage instanceof ClinicaltrialsPackageImpl ? (ClinicaltrialsPackageImpl)registeredClinicaltrialsPackage : new ClinicaltrialsPackageImpl();

		isInited = true;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);
		IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(registeredPackage instanceof IndicatorsPackageImpl ? registeredPackage : IndicatorsPackage.eINSTANCE);

		// Load packages
		the_4Package.loadPackage();
		theJats1Package.loadPackage();
		theMlPackage.loadPackage();

		// Create package meta-data objects
		theClinicaltrialsPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package.createPackageContents();
		theFundrefPackage.createPackageContents();
		theRelationsPackage.createPackageContents();
		theIndicatorsPackage.createPackageContents();

		// Initialize created meta-data
		theClinicaltrialsPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theFundrefPackage.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theIndicatorsPackage.initializePackageContents();

		// Fix loaded packages
		the_4Package.fixPackageContents();
		theJats1Package.fixPackageContents();
		theMlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theClinicaltrialsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ClinicaltrialsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theClinicaltrialsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClinicaltrialsPackage.eNS_URI, theClinicaltrialsPackage);
		return theClinicaltrialsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClinicalTrialNumberType() {
		return clinicalTrialNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClinicalTrialNumberType_Mixed() {
		return (EAttribute)clinicalTrialNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClinicalTrialNumberType_Registry() {
		return (EAttribute)clinicalTrialNumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClinicalTrialNumberType_Type() {
		return (EAttribute)clinicalTrialNumberTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getProgramType_ClinicalTrialNumber() {
		return (EReference)programTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_ClinicalTrialNumber() {
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
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegistryType() {
		return registryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicaltrialsFactory getClinicaltrialsFactory() {
		return (ClinicaltrialsFactory)getEFactoryInstance();
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
		clinicalTrialNumberTypeEClass = createEClass(CLINICAL_TRIAL_NUMBER_TYPE);
		createEAttribute(clinicalTrialNumberTypeEClass, CLINICAL_TRIAL_NUMBER_TYPE__MIXED);
		createEAttribute(clinicalTrialNumberTypeEClass, CLINICAL_TRIAL_NUMBER_TYPE__REGISTRY);
		createEAttribute(clinicalTrialNumberTypeEClass, CLINICAL_TRIAL_NUMBER_TYPE__TYPE);

		programTypeEClass = createEClass(PROGRAM_TYPE);
		createEReference(programTypeEClass, PROGRAM_TYPE__CLINICAL_TRIAL_NUMBER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLINICAL_TRIAL_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROGRAM);

		// Create enums
		typeTypeEEnum = createEEnum(TYPE_TYPE);

		// Create data types
		registryTypeEDataType = createEDataType(REGISTRY_TYPE);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(clinicalTrialNumberTypeEClass, ClinicalTrialNumberType.class, "ClinicalTrialNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClinicalTrialNumberType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ClinicalTrialNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalTrialNumberType_Registry(), this.getRegistryType(), "registry", null, 1, 1, ClinicalTrialNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalTrialNumberType_Type(), this.getTypeType(), "type", null, 0, 1, ClinicalTrialNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programTypeEClass, ProgramType.class, "ProgramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramType_ClinicalTrialNumber(), this.getClinicalTrialNumberType(), null, "clinicalTrialNumber", null, 0, -1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClinicalTrialNumber(), this.getClinicalTrialNumberType(), null, "clinicalTrialNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Program(), this.getProgramType(), null, "program", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.PRE_RESULTS);
		addEEnumLiteral(typeTypeEEnum, TypeType.RESULTS);
		addEEnumLiteral(typeTypeEEnum, TypeType.POST_RESULTS);

		// Initialize data types
		initEDataType(registryTypeEDataType, String.class, "RegistryType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (clinicalTrialNumberTypeEClass,
		   source,
		   new String[] {
			   "name", "clinical-trial-number_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getClinicalTrialNumberType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getClinicalTrialNumberType_Registry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "registry"
		   });
		addAnnotation
		  (getClinicalTrialNumberType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (programTypeEClass,
		   source,
		   new String[] {
			   "name", "program_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProgramType_ClinicalTrialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clinical-trial-number",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (registryTypeEDataType,
		   source,
		   new String[] {
			   "name", "registry_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "200",
			   "minLength", "12",
			   "pattern", "10.18810/[a-z-]+"
		   });
		addAnnotation
		  (typeTypeEEnum,
		   source,
		   new String[] {
			   "name", "type_._type"
		   });
		addAnnotation
		  (typeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "type_._type:Object",
			   "baseType", "type_._type"
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
		  (getDocumentRoot_ClinicalTrialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clinical-trial-number",
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

} //ClinicaltrialsPackageImpl
