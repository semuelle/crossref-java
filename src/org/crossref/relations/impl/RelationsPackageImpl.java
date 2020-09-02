/**
 */
package org.crossref.relations.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;

import gov.nih.nlm.ncbi.jats1.impl.Jats1PackageImpl;

import org.crossref.access.indicators.IndicatorsPackage;

import org.crossref.access.indicators.impl.IndicatorsPackageImpl;

import org.crossref.clinicaltrials.ClinicaltrialsPackage;

import org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl;

import org.crossref.fundref.FundrefPackage;

import org.crossref.fundref.impl.FundrefPackageImpl;

import org.crossref.relations.DescriptionType;
import org.crossref.relations.DocumentRoot;
import org.crossref.relations.IdentifierTypeType;
import org.crossref.relations.InterWorkRelationType;
import org.crossref.relations.IntraWorkRelationType;
import org.crossref.relations.LanguageType;
import org.crossref.relations.ProgramType;
import org.crossref.relations.RelatedItemType;
import org.crossref.relations.RelationsFactory;
import org.crossref.relations.RelationsPackage;
import org.crossref.relations.RelationshipTypeType;
import org.crossref.relations.RelationshipTypeType1;
import org.crossref.relations.XrefFaces;

import org.crossref.relations.util.RelationsValidator;

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
public class RelationsPackageImpl extends EPackageImpl implements RelationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

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
	private EClass interWorkRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraWorkRelationTypeEClass = null;

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
	private EClass relatedItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xrefFacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namespaceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTypeTypeObject1EDataType = null;

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
	 * @see org.crossref.relations.RelationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationsPackageImpl() {
		super(eNS_URI, RelationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationsPackage init() {
		if (isInited) return (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationsPackageImpl theRelationsPackage = registeredRelationsPackage instanceof RelationsPackageImpl ? (RelationsPackageImpl)registeredRelationsPackage : new RelationsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);
		IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(registeredPackage instanceof IndicatorsPackageImpl ? registeredPackage : IndicatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClinicaltrialsPackage.eNS_URI);
		ClinicaltrialsPackageImpl theClinicaltrialsPackage = (ClinicaltrialsPackageImpl)(registeredPackage instanceof ClinicaltrialsPackageImpl ? registeredPackage : ClinicaltrialsPackage.eINSTANCE);

		// Load packages
		the_4Package.loadPackage();
		theJats1Package.loadPackage();
		theMlPackage.loadPackage();

		// Create package meta-data objects
		theRelationsPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package.createPackageContents();
		theFundrefPackage.createPackageContents();
		theIndicatorsPackage.createPackageContents();
		theClinicaltrialsPackage.createPackageContents();

		// Initialize created meta-data
		theRelationsPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theFundrefPackage.initializePackageContents();
		theIndicatorsPackage.initializePackageContents();
		theClinicaltrialsPackage.initializePackageContents();

		// Fix loaded packages
		the_4Package.fixPackageContents();
		theJats1Package.fixPackageContents();
		theMlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRelationsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RelationsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRelationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationsPackage.eNS_URI, theRelationsPackage);
		return theRelationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionType() {
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionType_Mixed() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionType_FaceMarkup() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_B() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_I() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Em() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Strong() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_U() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Ovl() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Sup() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Sub() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Scp() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Tt() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Font() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionType_Language() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(13);
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
	public EReference getDocumentRoot_B() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Em() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Font() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_I() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InterWorkRelation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IntraWorkRelation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Ovl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Program() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RelatedItem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Scp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Strong() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sub() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_U() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterWorkRelationType() {
		return interWorkRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterWorkRelationType_Mixed() {
		return (EAttribute)interWorkRelationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterWorkRelationType_IdentifierType() {
		return (EAttribute)interWorkRelationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterWorkRelationType_Namespace() {
		return (EAttribute)interWorkRelationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterWorkRelationType_RelationshipType() {
		return (EAttribute)interWorkRelationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntraWorkRelationType() {
		return intraWorkRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntraWorkRelationType_Mixed() {
		return (EAttribute)intraWorkRelationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntraWorkRelationType_IdentifierType() {
		return (EAttribute)intraWorkRelationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntraWorkRelationType_Namespace() {
		return (EAttribute)intraWorkRelationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntraWorkRelationType_RelationshipType() {
		return (EAttribute)intraWorkRelationTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getProgramType_RelatedItem() {
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
	public EClass getRelatedItemType() {
		return relatedItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedItemType_Description() {
		return (EReference)relatedItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedItemType_InterWorkRelation() {
		return (EReference)relatedItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedItemType_IntraWorkRelation() {
		return (EReference)relatedItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXrefFaces() {
		return xrefFacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXrefFaces_Mixed() {
		return (EAttribute)xrefFacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXrefFaces_FaceMarkup() {
		return (EAttribute)xrefFacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_B() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_I() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Em() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Strong() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_U() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Ovl() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Sup() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Sub() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Scp() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Tt() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Font() {
		return (EReference)xrefFacesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifierTypeType() {
		return identifierTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationshipTypeType() {
		return relationshipTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationshipTypeType1() {
		return relationshipTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdentifierTypeTypeObject() {
		return identifierTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLanguageTypeObject() {
		return languageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNamespaceType() {
		return namespaceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRelationshipTypeTypeObject() {
		return relationshipTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRelationshipTypeTypeObject1() {
		return relationshipTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationsFactory getRelationsFactory() {
		return (RelationsFactory)getEFactoryInstance();
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
		descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__MIXED);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__FACE_MARKUP);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__B);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__I);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__EM);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__STRONG);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__U);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__OVL);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__SUP);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__SUB);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__SCP);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__TT);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__FONT);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__LANGUAGE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__B);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FONT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__I);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTER_WORK_RELATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTRA_WORK_RELATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OVL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROGRAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATED_ITEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRONG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUB);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__U);

		interWorkRelationTypeEClass = createEClass(INTER_WORK_RELATION_TYPE);
		createEAttribute(interWorkRelationTypeEClass, INTER_WORK_RELATION_TYPE__MIXED);
		createEAttribute(interWorkRelationTypeEClass, INTER_WORK_RELATION_TYPE__IDENTIFIER_TYPE);
		createEAttribute(interWorkRelationTypeEClass, INTER_WORK_RELATION_TYPE__NAMESPACE);
		createEAttribute(interWorkRelationTypeEClass, INTER_WORK_RELATION_TYPE__RELATIONSHIP_TYPE);

		intraWorkRelationTypeEClass = createEClass(INTRA_WORK_RELATION_TYPE);
		createEAttribute(intraWorkRelationTypeEClass, INTRA_WORK_RELATION_TYPE__MIXED);
		createEAttribute(intraWorkRelationTypeEClass, INTRA_WORK_RELATION_TYPE__IDENTIFIER_TYPE);
		createEAttribute(intraWorkRelationTypeEClass, INTRA_WORK_RELATION_TYPE__NAMESPACE);
		createEAttribute(intraWorkRelationTypeEClass, INTRA_WORK_RELATION_TYPE__RELATIONSHIP_TYPE);

		programTypeEClass = createEClass(PROGRAM_TYPE);
		createEReference(programTypeEClass, PROGRAM_TYPE__RELATED_ITEM);
		createEAttribute(programTypeEClass, PROGRAM_TYPE__NAME);

		relatedItemTypeEClass = createEClass(RELATED_ITEM_TYPE);
		createEReference(relatedItemTypeEClass, RELATED_ITEM_TYPE__DESCRIPTION);
		createEReference(relatedItemTypeEClass, RELATED_ITEM_TYPE__INTER_WORK_RELATION);
		createEReference(relatedItemTypeEClass, RELATED_ITEM_TYPE__INTRA_WORK_RELATION);

		xrefFacesEClass = createEClass(XREF_FACES);
		createEAttribute(xrefFacesEClass, XREF_FACES__MIXED);
		createEAttribute(xrefFacesEClass, XREF_FACES__FACE_MARKUP);
		createEReference(xrefFacesEClass, XREF_FACES__B);
		createEReference(xrefFacesEClass, XREF_FACES__I);
		createEReference(xrefFacesEClass, XREF_FACES__EM);
		createEReference(xrefFacesEClass, XREF_FACES__STRONG);
		createEReference(xrefFacesEClass, XREF_FACES__U);
		createEReference(xrefFacesEClass, XREF_FACES__OVL);
		createEReference(xrefFacesEClass, XREF_FACES__SUP);
		createEReference(xrefFacesEClass, XREF_FACES__SUB);
		createEReference(xrefFacesEClass, XREF_FACES__SCP);
		createEReference(xrefFacesEClass, XREF_FACES__TT);
		createEReference(xrefFacesEClass, XREF_FACES__FONT);

		// Create enums
		identifierTypeTypeEEnum = createEEnum(IDENTIFIER_TYPE_TYPE);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
		relationshipTypeTypeEEnum = createEEnum(RELATIONSHIP_TYPE_TYPE);
		relationshipTypeType1EEnum = createEEnum(RELATIONSHIP_TYPE_TYPE1);

		// Create data types
		identifierTypeTypeObjectEDataType = createEDataType(IDENTIFIER_TYPE_TYPE_OBJECT);
		languageTypeObjectEDataType = createEDataType(LANGUAGE_TYPE_OBJECT);
		namespaceTypeEDataType = createEDataType(NAMESPACE_TYPE);
		relationshipTypeTypeObjectEDataType = createEDataType(RELATIONSHIP_TYPE_TYPE_OBJECT);
		relationshipTypeTypeObject1EDataType = createEDataType(RELATIONSHIP_TYPE_TYPE_OBJECT1);
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
		initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionType_FaceMarkup(), ecorePackage.getEFeatureMapEntry(), "faceMarkup", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_B(), this.getXrefFaces(), null, "b", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_I(), this.getXrefFaces(), null, "i", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Em(), this.getXrefFaces(), null, "em", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Strong(), this.getXrefFaces(), null, "strong", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_U(), this.getXrefFaces(), null, "u", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Ovl(), this.getXrefFaces(), null, "ovl", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Sup(), this.getXrefFaces(), null, "sup", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Sub(), this.getXrefFaces(), null, "sub", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Scp(), this.getXrefFaces(), null, "scp", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Tt(), this.getXrefFaces(), null, "tt", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Font(), this.getXrefFaces(), null, "font", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionType_Language(), this.getLanguageType(), "language", null, 0, 1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_B(), this.getXrefFaces(), null, "b", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), this.getDescriptionType(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Em(), this.getXrefFaces(), null, "em", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Font(), this.getXrefFaces(), null, "font", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_I(), this.getXrefFaces(), null, "i", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InterWorkRelation(), this.getInterWorkRelationType(), null, "interWorkRelation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IntraWorkRelation(), this.getIntraWorkRelationType(), null, "intraWorkRelation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ovl(), this.getXrefFaces(), null, "ovl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Program(), this.getProgramType(), null, "program", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelatedItem(), this.getRelatedItemType(), null, "relatedItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scp(), this.getXrefFaces(), null, "scp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Strong(), this.getXrefFaces(), null, "strong", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sub(), this.getXrefFaces(), null, "sub", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sup(), this.getXrefFaces(), null, "sup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tt(), this.getXrefFaces(), null, "tt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_U(), this.getXrefFaces(), null, "u", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interWorkRelationTypeEClass, InterWorkRelationType.class, "InterWorkRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterWorkRelationType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, InterWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterWorkRelationType_IdentifierType(), this.getIdentifierTypeType(), "identifierType", null, 1, 1, InterWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterWorkRelationType_Namespace(), this.getNamespaceType(), "namespace", null, 0, 1, InterWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterWorkRelationType_RelationshipType(), this.getRelationshipTypeType1(), "relationshipType", null, 1, 1, InterWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intraWorkRelationTypeEClass, IntraWorkRelationType.class, "IntraWorkRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntraWorkRelationType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, IntraWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntraWorkRelationType_IdentifierType(), this.getIdentifierTypeType(), "identifierType", null, 1, 1, IntraWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntraWorkRelationType_Namespace(), this.getNamespaceType(), "namespace", null, 0, 1, IntraWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntraWorkRelationType_RelationshipType(), this.getRelationshipTypeType(), "relationshipType", null, 1, 1, IntraWorkRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programTypeEClass, ProgramType.class, "ProgramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramType_RelatedItem(), this.getRelatedItemType(), null, "relatedItem", null, 0, -1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramType_Name(), theXMLTypePackage.getString(), "name", "relations", 0, 1, ProgramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedItemTypeEClass, RelatedItemType.class, "RelatedItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedItemType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, RelatedItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedItemType_InterWorkRelation(), this.getInterWorkRelationType(), null, "interWorkRelation", null, 0, 1, RelatedItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedItemType_IntraWorkRelation(), this.getIntraWorkRelationType(), null, "intraWorkRelation", null, 0, 1, RelatedItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xrefFacesEClass, XrefFaces.class, "XrefFaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXrefFaces_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, XrefFaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXrefFaces_FaceMarkup(), ecorePackage.getEFeatureMapEntry(), "faceMarkup", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_B(), this.getXrefFaces(), null, "b", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_I(), this.getXrefFaces(), null, "i", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Em(), this.getXrefFaces(), null, "em", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Strong(), this.getXrefFaces(), null, "strong", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_U(), this.getXrefFaces(), null, "u", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Ovl(), this.getXrefFaces(), null, "ovl", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Sup(), this.getXrefFaces(), null, "sup", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Sub(), this.getXrefFaces(), null, "sub", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Scp(), this.getXrefFaces(), null, "scp", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Tt(), this.getXrefFaces(), null, "tt", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getXrefFaces_Font(), this.getXrefFaces(), null, "font", null, 0, -1, XrefFaces.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(identifierTypeTypeEEnum, IdentifierTypeType.class, "IdentifierTypeType");
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.DOI);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.ISSN);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.ISBN);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.URI);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.PMID);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.PMCID);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.PURL);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.ARXIV);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.ARK);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.HANDLE);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.UUID);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.ECLI);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.ACCESSION);
		addEEnumLiteral(identifierTypeTypeEEnum, IdentifierTypeType.OTHER);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.AA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AB);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AF);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AM);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.AZ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BH);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BM);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.BS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CH);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.DA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.DE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.DV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.DZ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ES);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ET);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FF);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FJ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.GA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.GD);
		addEEnumLiteral(languageTypeEEnum, LanguageType.GL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.GN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.GU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.GV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HZ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ID);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.II);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.IU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.JA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.JW);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KJ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KM);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KW);
		addEEnumLiteral(languageTypeEEnum, LanguageType.KY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LB);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ML);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.MY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NB);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ND);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.OC);
		addEEnumLiteral(languageTypeEEnum, LanguageType.OJ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.OM);
		addEEnumLiteral(languageTypeEEnum, LanguageType.OR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.OS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.PA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.PI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.PL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.PS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.PT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.QU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.RM);
		addEEnumLiteral(languageTypeEEnum, LanguageType.RN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.RO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.RU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.RW);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SC);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SD);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SM);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SQ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ST);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SU);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SV);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SW);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TH);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TS);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TW);
		addEEnumLiteral(languageTypeEEnum, LanguageType.TY);
		addEEnumLiteral(languageTypeEEnum, LanguageType.UG);
		addEEnumLiteral(languageTypeEEnum, LanguageType.UK);
		addEEnumLiteral(languageTypeEEnum, LanguageType.UR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.UZ);
		addEEnumLiteral(languageTypeEEnum, LanguageType.VE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.VI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.VO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.WA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.WO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.XH);
		addEEnumLiteral(languageTypeEEnum, LanguageType.YI);
		addEEnumLiteral(languageTypeEEnum, LanguageType.YO);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ZA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ZH);

		initEEnum(relationshipTypeTypeEEnum, RelationshipTypeType.class, "RelationshipTypeType");
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_TRANSLATION_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_TRANSLATION);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_PREPRINT_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_PREPRINT);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_MANUSCRIPT_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_MANUSCRIPT);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_EXPRESSION_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_EXPRESSION);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_MANIFESTATION_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_MANIFESTATION);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_REPLACED_BY);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.REPLACES);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_SAME_AS);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_IDENTICAL_TO);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_VARIANT_FORM_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_ORIGINAL_FORM_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_VERSION_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_VERSION);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.IS_FORMAT_OF);
		addEEnumLiteral(relationshipTypeTypeEEnum, RelationshipTypeType.HAS_FORMAT);

		initEEnum(relationshipTypeType1EEnum, RelationshipTypeType1.class, "RelationshipTypeType1");
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_DERIVED_FROM);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.HAS_DERIVATION);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_REVIEW_OF);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.HAS_REVIEW);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_COMMENT_ON);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.HAS_COMMENT);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_REPLY_TO);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.HAS_REPLY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.BASED_ON_DATA);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_DATA_BASIS_FOR);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.HAS_RELATED_MATERIAL);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_RELATED_MATERIAL);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_COMPILED_BY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.COMPILES);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_DOCUMENTED_BY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.DOCUMENTS);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_SUPPLEMENT_TO);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_SUPPLEMENTED_BY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_CONTINUED_BY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.CONTINUES);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_PART_OF);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.HAS_PART);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.REFERENCES);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_REFERENCED_BY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_BASED_ON);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_BASIS_FOR);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.REQUIRES);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_REQUIRED_BY);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.FINANCES);
		addEEnumLiteral(relationshipTypeType1EEnum, RelationshipTypeType1.IS_FINANCED_BY);

		// Initialize data types
		initEDataType(identifierTypeTypeObjectEDataType, IdentifierTypeType.class, "IdentifierTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languageTypeObjectEDataType, LanguageType.class, "LanguageTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(namespaceTypeEDataType, String.class, "NamespaceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeTypeObjectEDataType, RelationshipTypeType.class, "RelationshipTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipTypeTypeObject1EDataType, RelationshipTypeType1.class, "RelationshipTypeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (descriptionTypeEClass,
		   source,
		   new String[] {
			   "name", "description_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDescriptionType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDescriptionType_FaceMarkup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_U(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "u",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Ovl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ovl",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Scp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scp",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Font(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "font",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getDescriptionType_Language(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "language"
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
		  (getDocumentRoot_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Font(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "font",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InterWorkRelation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inter_work_relation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IntraWorkRelation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intra_work_relation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Ovl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ovl",
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
		  (getDocumentRoot_RelatedItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "related_item",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Scp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_U(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "u",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifierTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "identifier-type_._type"
		   });
		addAnnotation
		  (identifierTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "identifier-type_._type:Object",
			   "baseType", "identifier-type_._type"
		   });
		addAnnotation
		  (interWorkRelationTypeEClass,
		   source,
		   new String[] {
			   "name", "inter_work_relation_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getInterWorkRelationType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getInterWorkRelationType_IdentifierType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "identifier-type"
		   });
		addAnnotation
		  (getInterWorkRelationType_Namespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "namespace"
		   });
		addAnnotation
		  (getInterWorkRelationType_RelationshipType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "relationship-type"
		   });
		addAnnotation
		  (intraWorkRelationTypeEClass,
		   source,
		   new String[] {
			   "name", "intra_work_relation_._type",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getIntraWorkRelationType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getIntraWorkRelationType_IdentifierType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "identifier-type"
		   });
		addAnnotation
		  (getIntraWorkRelationType_Namespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "namespace"
		   });
		addAnnotation
		  (getIntraWorkRelationType_RelationshipType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "relationship-type"
		   });
		addAnnotation
		  (languageTypeEEnum,
		   source,
		   new String[] {
			   "name", "language_._type"
		   });
		addAnnotation
		  (languageTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "language_._type:Object",
			   "baseType", "language_._type"
		   });
		addAnnotation
		  (namespaceTypeEDataType,
		   source,
		   new String[] {
			   "name", "namespace_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "1024",
			   "minLength", "4"
		   });
		addAnnotation
		  (programTypeEClass,
		   source,
		   new String[] {
			   "name", "program_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProgramType_RelatedItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "related_item",
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
		  (relatedItemTypeEClass,
		   source,
		   new String[] {
			   "name", "related_item_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelatedItemType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedItemType_InterWorkRelation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inter_work_relation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRelatedItemType_IntraWorkRelation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intra_work_relation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (relationshipTypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "relationship-type_._type"
		   });
		addAnnotation
		  (relationshipTypeType1EEnum,
		   source,
		   new String[] {
			   "name", "relationship-type_._1_._type"
		   });
		addAnnotation
		  (relationshipTypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "relationship-type_._type:Object",
			   "baseType", "relationship-type_._type"
		   });
		addAnnotation
		  (relationshipTypeTypeObject1EDataType,
		   source,
		   new String[] {
			   "name", "relationship-type_._1_._type:Object",
			   "baseType", "relationship-type_._1_._type"
		   });
		addAnnotation
		  (xrefFacesEClass,
		   source,
		   new String[] {
			   "name", "xrefFaces",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getXrefFaces_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getXrefFaces_FaceMarkup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_B(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "b",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_I(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "i",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Em(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "em",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Strong(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strong",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_U(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "u",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Ovl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ovl",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Sup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sup",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Sub(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sub",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Scp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scp",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Tt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tt",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
		addAnnotation
		  (getXrefFaces_Font(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "font",
			   "namespace", "##targetNamespace",
			   "group", "#FaceMarkup:1"
		   });
	}

} //RelationsPackageImpl
