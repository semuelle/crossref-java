/**
 */
package org.crossref.schema._4._4.impl;

import gov.nih.nlm.ncbi.jats1.Jats1Package;

import gov.nih.nlm.ncbi.jats1.impl.Jats1PackageImpl;

import java.io.IOException;

import java.net.URL;

import org.crossref.access.indicators.IndicatorsPackage;

import org.crossref.access.indicators.impl.IndicatorsPackageImpl;

import org.crossref.clinicaltrials.ClinicaltrialsPackage;

import org.crossref.clinicaltrials.impl.ClinicaltrialsPackageImpl;

import org.crossref.fundref.FundrefPackage;

import org.crossref.fundref.impl.FundrefPackageImpl;

import org.crossref.relations.RelationsPackage;

import org.crossref.relations.impl.RelationsPackageImpl;

import org.crossref.schema._4._4._4Factory;
import org.crossref.schema._4._4._4Package;

import org.crossref.schema._4._4.util._4Validator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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
public class _4PackageImpl extends EPackageImpl implements _4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "_4.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptanceDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveLocationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveTypeEClass = null;

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
	private EClass aTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookSeriesMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookSetMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competingInterestStatementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferencePaperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossmarkDomainsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossmarkDomainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossmarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depositorTypeEClass = null;

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
	private EClass designatorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dissertationTypeEClass = null;

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
	private EClass doiBatchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doiDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass institutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentStatementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isbnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalArticleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalIssueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalVolumeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noisbnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orcidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originalLanguageTitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peerReviewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pendingPublicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postedContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postedDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceedingsMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceedingsSeriesMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportPaperMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportPaperSeriesMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportPaperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scnPoliciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scnPolicyRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scnPolicySetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardsBodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdAltAsPublishedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdAsPublishedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdDesignatorTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdSetDesignatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdUndatedDesignatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titlesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unassignedContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredCitationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTypeEClass = null;

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
	private EEnum bookTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmUpdateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentVersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contributorRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum countryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum crawlerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datasetTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum idTypeTypeEEnum = null;

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
	private EEnum linkHeaderRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mimeTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiResolutionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameStyleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameStyleType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameStyleType2EEnum = null;

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
	private EEnum parentRelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicationStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicationTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonTypeItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recommendationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceDistributionOptsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sequenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stageTypeEEnum = null;

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
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abbrevTitleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType affiliationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType approvedMonthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType approvedYearTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bookTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmAssertionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmAssertionGroupLabelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmAssertionGroupNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmAssertionLabelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmAssertionNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmDomainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmUpdateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codenTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentSizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceAcronymTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceDateTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceLocationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceSponsorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conferenceThemeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentVersionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contractNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contributorRoleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType crawlerTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datasetTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType degreeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType depositorNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doiBatchIdTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doiTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doiTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType editionNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emailAddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType firstPageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fullTitleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType givenNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType groupTitleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType institutionAcronymTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType institutionDepartmentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType institutionNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType institutionPlaceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isbnTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType issnTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType issueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType itemNumberTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType labelTypeEDataType = null;

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
	private EDataType lastPageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelSequenceNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType linkHeaderRelationshipTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mediaTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mediaTypeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mimeTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiResolutionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameStyleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameStyleTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameStyleTypeObject2EDataType = null;

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
	private EDataType orcidTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType organizationTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType otherPagesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parentDoiTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parentRelationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType proceedingsSubjectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType proceedingsTitleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType publicationStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType publicationTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType publisherNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType publisherPlaceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reasonTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reasonTypeItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reasonTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType recommendationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceDistributionOptsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regAgencyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registrantTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sequenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seriesNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specialNumberingTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stdDesignatorvalueTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType suffixTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType surnameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xrefDayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xrefMonthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xrefYearEDataType = null;

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
	 * @see org.crossref.schema._4._4._4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _4PackageImpl() {
		super(eNS_URI, _4Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static _4Package init() {
		if (isInited) return (_4Package)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI);

		// Obtain or create and register package
		Object registered_4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		_4PackageImpl the_4Package = registered_4Package instanceof _4PackageImpl ? (_4PackageImpl)registered_4Package : new _4PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Jats1Package.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClinicaltrialsPackage.eNS_URI);
		ClinicaltrialsPackageImpl theClinicaltrialsPackage = (ClinicaltrialsPackageImpl)(registeredPackage instanceof ClinicaltrialsPackageImpl ? registeredPackage : ClinicaltrialsPackage.eINSTANCE);

		// Load packages
		the_4Package.loadPackage();
		theJats1Package.loadPackage();
		theMlPackage.loadPackage();

		// Create package meta-data objects
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package.createPackageContents();
		theFundrefPackage.createPackageContents();
		theRelationsPackage.createPackageContents();
		theIndicatorsPackage.createPackageContents();
		theClinicaltrialsPackage.createPackageContents();

		// Initialize created meta-data
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package.initializePackageContents();
		theFundrefPackage.initializePackageContents();
		theRelationsPackage.initializePackageContents();
		theIndicatorsPackage.initializePackageContents();
		theClinicaltrialsPackage.initializePackageContents();

		// Fix loaded packages
		the_4Package.fixPackageContents();
		theJats1Package.fixPackageContents();
		theMlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_4Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return _4Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_4Package.eNS_URI, the_4Package);
		return the_4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptanceDateType() {
		if (acceptanceDateTypeEClass == null) {
			acceptanceDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(1);
		}
		return acceptanceDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAltNameType() {
		if (altNameTypeEClass == null) {
			altNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(3);
		}
		return altNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltNameType_Group() {
        return (EAttribute)getAltNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAltNameType_Name() {
        return (EReference)getAltNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAltNameType_StringName() {
        return (EReference)getAltNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousType() {
		if (anonymousTypeEClass == null) {
			anonymousTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(4);
		}
		return anonymousTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymousType_Affiliation() {
        return (EAttribute)getAnonymousType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymousType_ContributorRole() {
        return (EAttribute)getAnonymousType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymousType_Language() {
        return (EAttribute)getAnonymousType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymousType_NameStyle() {
        return (EAttribute)getAnonymousType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnonymousType_Sequence() {
        return (EAttribute)getAnonymousType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApprovalDateType() {
		if (approvalDateTypeEClass == null) {
			approvalDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(5);
		}
		return approvalDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchiveLocationsType() {
		if (archiveLocationsTypeEClass == null) {
			archiveLocationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(8);
		}
		return archiveLocationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchiveLocationsType_Archive() {
        return (EReference)getArchiveLocationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchiveType() {
		if (archiveTypeEClass == null) {
			archiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(9);
		}
		return archiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchiveType_Name() {
        return (EAttribute)getArchiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertionType() {
		if (assertionTypeEClass == null) {
			assertionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(10);
		}
		return assertionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Mixed() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_FaceMarkup() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_B() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_I() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Em() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Strong() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_U() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Ovl() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Sup() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Sub() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Scp() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Tt() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Font() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionType_Math() {
        return (EReference)getAssertionType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Explanation() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_GroupLabel() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_GroupName() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Href() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Label() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Name() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertionType_Order() {
        return (EAttribute)getAssertionType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAType() {
		if (aTypeEClass == null) {
			aTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(11);
		}
		return aTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Value() {
        return (EAttribute)getAType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAType_Href() {
        return (EAttribute)getAType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBodyType() {
		if (bodyTypeEClass == null) {
			bodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(12);
		}
		return bodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_Journal() {
        return (EReference)getBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_Book() {
        return (EReference)getBodyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_Conference() {
        return (EReference)getBodyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_SaComponent() {
        return (EReference)getBodyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_Dissertation() {
        return (EReference)getBodyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_ReportPaper() {
        return (EReference)getBodyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_Standard() {
        return (EReference)getBodyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_Database() {
        return (EReference)getBodyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_PeerReview() {
        return (EReference)getBodyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_PendingPublication() {
        return (EReference)getBodyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyType_PostedContent() {
        return (EReference)getBodyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBookMetadataType() {
		if (bookMetadataTypeEClass == null) {
			bookMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(13);
		}
		return bookMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Contributors() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Titles() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Abstract() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookMetadataType_EditionNumber() {
        return (EAttribute)getBookMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_PublicationDate() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_AcceptanceDate() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Isbn() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Noisbn() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Publisher() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_PublisherItem() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Crossmark() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Program() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Program1() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_Program2() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_ArchiveLocations() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_DoiData() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookMetadataType_CitationList() {
        return (EReference)getBookMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookMetadataType_Language() {
        return (EAttribute)getBookMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getBookMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBookSeriesMetadataType() {
		if (bookSeriesMetadataTypeEClass == null) {
			bookSeriesMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(14);
		}
		return bookSeriesMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_SeriesMetadata() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Contributors() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Titles() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Abstract() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSeriesMetadataType_Volume() {
        return (EAttribute)getBookSeriesMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSeriesMetadataType_Volume1() {
        return (EAttribute)getBookSeriesMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSeriesMetadataType_EditionNumber() {
        return (EAttribute)getBookSeriesMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_PublicationDate() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Isbn() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Noisbn() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_PublicationDate1() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Publisher() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_PublisherItem() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Crossmark() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Program() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Program1() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_Program2() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_ArchiveLocations() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_DoiData() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSeriesMetadataType_CitationList() {
        return (EReference)getBookSeriesMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSeriesMetadataType_Language() {
        return (EAttribute)getBookSeriesMetadataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSeriesMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getBookSeriesMetadataType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBookSetMetadataType() {
		if (bookSetMetadataTypeEClass == null) {
			bookSetMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(15);
		}
		return bookSetMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_SetMetadata() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Contributors() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Titles() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Abstract() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSetMetadataType_Volume() {
        return (EAttribute)getBookSetMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSetMetadataType_Volume1() {
        return (EAttribute)getBookSetMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSetMetadataType_EditionNumber() {
        return (EAttribute)getBookSetMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_PublicationDate() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Isbn() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Noisbn() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Publisher() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_PublisherItem() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Crossmark() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Program() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Program1() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_Program2() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_ArchiveLocations() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_DoiData() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookSetMetadataType_CitationList() {
        return (EReference)getBookSetMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSetMetadataType_Language() {
        return (EAttribute)getBookSetMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookSetMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getBookSetMetadataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBookType() {
		if (bookTypeEClass == null) {
			bookTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(16);
		}
		return bookTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookType_BookMetadata() {
        return (EReference)getBookType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookType_BookSeriesMetadata() {
        return (EReference)getBookType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookType_BookSetMetadata() {
        return (EReference)getBookType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBookType_ContentItem() {
        return (EReference)getBookType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBookType_BookType() {
        return (EAttribute)getBookType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCitationListType() {
		if (citationListTypeEClass == null) {
			citationListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(19);
		}
		return citationListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitationListType_Citation() {
        return (EReference)getCitationListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCitationT() {
		if (citationTEClass == null) {
			citationTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(20);
		}
		return citationTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitationT_Issn() {
        return (EReference)getCitationT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_JournalTitle() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_Author() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_Volume() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_Issue() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_FirstPage() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_ElocationId() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_CYear() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_Doi() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitationT_Isbn() {
        return (EReference)getCitationT().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_SeriesTitle() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_VolumeTitle() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_EditionNumber() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_ComponentNumber() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_ArticleTitle() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationT_StdDesignator() {
        return (EAttribute)getCitationT().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitationT_StandardsBody() {
        return (EReference)getCitationT().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCitationT_UnstructuredCitation() {
        return (EReference)getCitationT().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCitationType() {
		if (citationTypeEClass == null) {
			citationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(21);
		}
		return citationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCitationType_Key() {
        return (EAttribute)getCitationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionType() {
		if (collectionTypeEClass == null) {
			collectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(31);
		}
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionType_Item() {
        return (EReference)getCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionType_MultiResolution() {
        return (EAttribute)getCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionType_Property() {
        return (EAttribute)getCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompetingInterestStatementType() {
		if (competingInterestStatementTypeEClass == null) {
			competingInterestStatementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(32);
		}
		return competingInterestStatementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetingInterestStatementType_Mixed() {
        return (EAttribute)getCompetingInterestStatementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetingInterestStatementType_FaceMarkup() {
        return (EAttribute)getCompetingInterestStatementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_B() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_I() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Em() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Strong() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_U() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Ovl() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Sup() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Sub() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Scp() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Tt() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Font() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingInterestStatementType_Math() {
        return (EReference)getCompetingInterestStatementType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetingInterestStatementType_Language() {
        return (EAttribute)getCompetingInterestStatementType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentListType() {
		if (componentListTypeEClass == null) {
			componentListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(33);
		}
		return componentListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentListType_Component() {
        return (EReference)getComponentListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentType() {
		if (componentTypeEClass == null) {
			componentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(36);
		}
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Titles() {
        return (EReference)getComponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Contributors() {
        return (EReference)getComponentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_PublicationDate() {
        return (EReference)getComponentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Description() {
        return (EReference)getComponentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Format() {
        return (EReference)getComponentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Program() {
        return (EReference)getComponentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_DoiData() {
        return (EReference)getComponentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_Doi() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_ComponentSize() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_Language() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_ParentRelation() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_RegAgency() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConferenceDateType() {
		if (conferenceDateTypeEClass == null) {
			conferenceDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(41);
		}
		return conferenceDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_Value() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_EndDay() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_EndMonth() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_EndYear() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_StartDay() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_StartMonth() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferenceDateType_StartYear() {
        return (EAttribute)getConferenceDateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConferencePaperType() {
		if (conferencePaperTypeEClass == null) {
			conferencePaperTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(45);
		}
		return conferencePaperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Contributors() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Titles() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Abstract() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_PublicationDate() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_AcceptanceDate() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Pages() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_PublisherItem() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Crossmark() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Program() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Program1() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Program2() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_Program3() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_ArchiveLocations() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_ScnPolicies() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_DoiData() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_CitationList() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferencePaperType_ComponentList() {
        return (EReference)getConferencePaperType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferencePaperType_Language() {
        return (EAttribute)getConferencePaperType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferencePaperType_PublicationType() {
        return (EAttribute)getConferencePaperType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConferencePaperType_ReferenceDistributionOpts() {
        return (EAttribute)getConferencePaperType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConferenceType() {
		if (conferenceTypeEClass == null) {
			conferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(48);
		}
		return conferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferenceType_Contributors() {
        return (EReference)getConferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferenceType_EventMetadata() {
        return (EReference)getConferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferenceType_ProceedingsSeriesMetadata() {
        return (EReference)getConferenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferenceType_ProceedingsMetadata() {
        return (EReference)getConferenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConferenceType_ConferencePaper() {
        return (EReference)getConferenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentDateType() {
		if (contentDateTypeEClass == null) {
			contentDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(49);
		}
		return contentDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentItemType() {
		if (contentItemTypeEClass == null) {
			contentItemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(50);
		}
		return contentItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Contributors() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Titles() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Abstract() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentItemType_ComponentNumber() {
        return (EAttribute)getContentItemType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_PublicationDate() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_AcceptanceDate() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Pages() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_PublisherItem() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Crossmark() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Program() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Program1() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Program2() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_Program3() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_ArchiveLocations() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_ScnPolicies() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_DoiData() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_CitationList() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentItemType_ComponentList() {
        return (EReference)getContentItemType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentItemType_ComponentType() {
        return (EAttribute)getContentItemType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentItemType_Language() {
        return (EAttribute)getContentItemType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentItemType_LevelSequenceNumber() {
        return (EAttribute)getContentItemType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentItemType_PublicationType() {
        return (EAttribute)getContentItemType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentItemType_ReferenceDistributionOpts() {
        return (EAttribute)getContentItemType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContributorsType() {
		if (contributorsTypeEClass == null) {
			contributorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(56);
		}
		return contributorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContributorsType_Group() {
        return (EAttribute)getContributorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributorsType_Organization() {
        return (EReference)getContributorsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributorsType_PersonName() {
        return (EReference)getContributorsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributorsType_Anonymous() {
        return (EReference)getContributorsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreationDateType() {
		if (creationDateTypeEClass == null) {
			creationDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(61);
		}
		return creationDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossmarkDomainsType() {
		if (crossmarkDomainsTypeEClass == null) {
			crossmarkDomainsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(62);
		}
		return crossmarkDomainsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossmarkDomainsType_CrossmarkDomain() {
        return (EReference)getCrossmarkDomainsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossmarkDomainType() {
		if (crossmarkDomainTypeEClass == null) {
			crossmarkDomainTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(63);
		}
		return crossmarkDomainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossmarkDomainType_Domain() {
        return (EAttribute)getCrossmarkDomainType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossmarkDomainType_Filter() {
        return (EAttribute)getCrossmarkDomainType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossmarkType() {
		if (crossmarkTypeEClass == null) {
			crossmarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(64);
		}
		return crossmarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossmarkType_CrossmarkVersion() {
        return (EAttribute)getCrossmarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossmarkType_CrossmarkPolicy() {
        return (EAttribute)getCrossmarkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossmarkType_CrossmarkDomains() {
        return (EReference)getCrossmarkType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossmarkType_CrossmarkDomainExclusive() {
        return (EAttribute)getCrossmarkType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossmarkType_Updates() {
        return (EReference)getCrossmarkType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossmarkType_CustomMetadata() {
        return (EReference)getCrossmarkType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomMetadataType() {
		if (customMetadataTypeEClass == null) {
			customMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(65);
		}
		return customMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Assertion() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program1() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program2() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program3() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program4() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program5() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program6() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program7() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomMetadataType_Program8() {
        return (EReference)getCustomMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseDateType() {
		if (databaseDateTypeEClass == null) {
			databaseDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(66);
		}
		return databaseDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseDateType_CreationDate() {
        return (EReference)getDatabaseDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseDateType_PublicationDate() {
        return (EReference)getDatabaseDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseDateType_UpdateDate() {
        return (EReference)getDatabaseDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseMetadataType() {
		if (databaseMetadataTypeEClass == null) {
			databaseMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(67);
		}
		return databaseMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_Contributors() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_Titles() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_Description() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_DatabaseDate() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_Publisher() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_Institution() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_PublisherItem() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_ArchiveLocations() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_DoiData() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseMetadataType_Program() {
        return (EReference)getDatabaseMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseMetadataType_Language() {
        return (EAttribute)getDatabaseMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getDatabaseMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseType() {
		if (databaseTypeEClass == null) {
			databaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(68);
		}
		return databaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseType_DatabaseMetadata() {
        return (EReference)getDatabaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseType_Dataset() {
        return (EReference)getDatabaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseType_ComponentList() {
        return (EReference)getDatabaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetType() {
		if (datasetTypeEClass == null) {
			datasetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(69);
		}
		return datasetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Contributors() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Titles() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_DatabaseDate() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_PublisherItem() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Description() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Format() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Crossmark() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Program() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Program1() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_Program2() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_ArchiveLocations() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_DoiData() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_CitationList() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_ComponentList() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_DatasetType() {
        return (EAttribute)getDatasetType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateT() {
		if (dateTEClass == null) {
			dateTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(72);
		}
		return dateTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateT_Month() {
        return (EAttribute)getDateT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateT_Day() {
        return (EAttribute)getDateT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateT_Year() {
        return (EAttribute)getDateT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateT_MediaType() {
        return (EAttribute)getDateT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreesType() {
		if (degreesTypeEClass == null) {
			degreesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(73);
		}
		return degreesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreesType_Mixed() {
        return (EAttribute)getDegreesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreesType_ContentType() {
        return (EAttribute)getDegreesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreesType_Language() {
        return (EAttribute)getDegreesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreesType_SpecificUse() {
        return (EAttribute)getDegreesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepositorType() {
		if (depositorTypeEClass == null) {
			depositorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(76);
		}
		return depositorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepositorType_DepositorName() {
        return (EAttribute)getDepositorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepositorType_EmailAddress() {
        return (EAttribute)getDepositorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(77);
		}
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionType_Mixed() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionType_FaceMarkup() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_B() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_I() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Em() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Strong() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_U() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Ovl() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Sup() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Sub() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Scp() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Tt() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Font() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionType_Math() {
        return (EReference)getDescriptionType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionType_Language() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignatorsType() {
		if (designatorsTypeEClass == null) {
			designatorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(78);
		}
		return designatorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignatorsType_StdFamilyDesignator() {
        return (EReference)getDesignatorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignatorsType_StdSetDesignator() {
        return (EReference)getDesignatorsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignatorsType_StdUndatedDesignator() {
        return (EReference)getDesignatorsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignatorsType_StdAsPublished() {
        return (EReference)getDesignatorsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignatorsType_StdAltAsPublished() {
        return (EReference)getDesignatorsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignatorsType_StdSupersedes() {
        return (EAttribute)getDesignatorsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignatorsType_StdAdoptedFrom() {
        return (EAttribute)getDesignatorsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignatorsType_StdRevisionOf() {
        return (EAttribute)getDesignatorsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDissertationType() {
		if (dissertationTypeEClass == null) {
			dissertationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(79);
		}
		return dissertationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_PersonName() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Contributors() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Titles() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Abstract() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_ApprovalDate() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Institution() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDissertationType_Degree() {
        return (EAttribute)getDissertationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Isbn() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_PublisherItem() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Crossmark() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Program() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Program1() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_Program2() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_ArchiveLocations() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_ScnPolicies() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_DoiData() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_CitationList() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDissertationType_ComponentList() {
        return (EReference)getDissertationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDissertationType_Language() {
        return (EAttribute)getDissertationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDissertationType_PublicationType() {
        return (EAttribute)getDissertationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDissertationType_ReferenceDistributionOpts() {
        return (EAttribute)getDissertationType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(80);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_A() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AbbrevTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AcceptanceDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Affiliation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AltName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Anonymous() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ApprovalDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Archive() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ArchiveLocations() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ArticleTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Assertion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Author() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_B() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Body() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Book() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BookMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BookSeriesMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BookSetMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Citation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CitationList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Coden() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Collection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CompetingInterestStatement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Component() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ComponentList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ComponentNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Conference() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ConferenceAcronym() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ConferenceDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ConferenceLocation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ConferenceName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ConferenceNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ConferencePaper() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ConferenceSponsor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ConferenceTheme() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ContentDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ContentItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ContractNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Contributors() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CreationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Crossmark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CrossmarkDomain() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CrossmarkDomainExclusive() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CrossmarkDomains() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CrossmarkPolicy() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CrossmarkVersion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CustomMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_CYear() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Database() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DatabaseDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DatabaseMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dataset() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Day() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Degree() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Degrees() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Depositor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DepositorName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Description() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Designators() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dissertation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Doi() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DoiBatch() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DoiBatchId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DoiData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Domain() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_EditionNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ElocationId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Em() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_EmailAddress() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EventMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Filter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_FirstPage() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Font() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Format() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_FullTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_GivenName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_GroupTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Head() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_I() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Identifier() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Institution() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_InstitutionAcronym() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_InstitutionDepartment() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_InstitutionName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_InstitutionPlace() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IntentStatement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Isbn() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Issn() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Issue() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Item() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ItemNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Journal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_JournalArticle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_JournalIssue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_JournalMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_JournalTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_JournalVolume() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_LastPage() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Month() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Name() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Noisbn() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ORCID() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Organization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_OriginalLanguageTitle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_OtherPages() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Ovl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Pages() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_PartNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PeerReview() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PendingPublication() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PersonName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PostedContent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PostedDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Prefix() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ProceedingsMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ProceedingsSeriesMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ProceedingsSubject() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ProceedingsTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Property() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Publication() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PublicationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Publisher() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PublisherItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_PublisherName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_PublisherPlace() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Registrant() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReportPaper() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReportPaperMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReportPaperSeriesMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Resource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReviewDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_RunningNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SaComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ScnPolicies() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ScnPolicyRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ScnPolicySet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Scp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SeriesMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_SeriesNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_SeriesTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SetMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_SpecialNumbering() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Standard() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StandardMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StandardsBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StandardsBodyAcronym() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StandardsBodyName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StdAdoptedFrom() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StdAltAsPublished() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StdAltScript() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StdAsPublished() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StdDesignator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StdFamilyDesignator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StdRevisionOf() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StdSetDesignator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StdSupersedes() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StdUndatedDesignator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StdVariantForm() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StringName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Strong() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Subtitle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Suffix() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Sup() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Surname() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Timestamp() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Title() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Titles() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tt() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_U() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnassignedContent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnstructuredCitation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Update() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UpdateDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Updates() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Volume() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_VolumeTitle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Year() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoiBatchType() {
		if (doiBatchTypeEClass == null) {
			doiBatchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(82);
		}
		return doiBatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoiBatchType_Head() {
        return (EReference)getDoiBatchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoiBatchType_Body() {
        return (EReference)getDoiBatchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoiBatchType_Version() {
        return (EAttribute)getDoiBatchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoiDataType() {
		if (doiDataTypeEClass == null) {
			doiDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(83);
		}
		return doiDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoiDataType_Doi() {
        return (EAttribute)getDoiDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoiDataType_Timestamp() {
        return (EAttribute)getDoiDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoiDataType_Resource() {
        return (EReference)getDoiDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoiDataType_Collection() {
        return (EReference)getDoiDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventMetadataType() {
		if (eventMetadataTypeEClass == null) {
			eventMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(88);
		}
		return eventMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventMetadataType_ConferenceName() {
        return (EAttribute)getEventMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventMetadataType_ConferenceTheme() {
        return (EAttribute)getEventMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventMetadataType_ConferenceAcronym() {
        return (EAttribute)getEventMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventMetadataType_ConferenceSponsor() {
        return (EAttribute)getEventMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventMetadataType_ConferenceNumber() {
        return (EAttribute)getEventMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventMetadataType_ConferenceLocation() {
        return (EAttribute)getEventMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventMetadataType_ConferenceDate() {
        return (EReference)getEventMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormatType() {
		if (formatTypeEClass == null) {
			formatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(91);
		}
		return formatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormatType_Value() {
        return (EAttribute)getFormatType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormatType_MimeType() {
        return (EAttribute)getFormatType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeadType() {
		if (headTypeEClass == null) {
			headTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(95);
		}
		return headTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeadType_DoiBatchId() {
        return (EAttribute)getHeadType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeadType_Timestamp() {
        return (EAttribute)getHeadType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadType_Depositor() {
        return (EReference)getHeadType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeadType_Registrant() {
        return (EAttribute)getHeadType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifierType() {
		if (identifierTypeEClass == null) {
			identifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(97);
		}
		return identifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierType_Value() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifierType_IdType() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstitutionType() {
		if (institutionTypeEClass == null) {
			institutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(104);
		}
		return institutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstitutionType_InstitutionName() {
        return (EAttribute)getInstitutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstitutionType_InstitutionAcronym() {
        return (EAttribute)getInstitutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstitutionType_InstitutionPlace() {
        return (EAttribute)getInstitutionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstitutionType_InstitutionDepartment() {
        return (EAttribute)getInstitutionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntentStatementType() {
		if (intentStatementTypeEClass == null) {
			intentStatementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(105);
		}
		return intentStatementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntentStatementType_Mixed() {
        return (EAttribute)getIntentStatementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntentStatementType_Group() {
        return (EAttribute)getIntentStatementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntentStatementType_B() {
        return (EReference)getIntentStatementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntentStatementType_I() {
        return (EReference)getIntentStatementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntentStatementType_U() {
        return (EReference)getIntentStatementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntentStatementType_A() {
        return (EReference)getIntentStatementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntentStatementType_Language() {
        return (EAttribute)getIntentStatementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsbnType() {
		if (isbnTypeEClass == null) {
			isbnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(107);
		}
		return isbnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsbnType_Value() {
        return (EAttribute)getIsbnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIsbnType_MediaType() {
        return (EAttribute)getIsbnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssnType() {
		if (issnTypeEClass == null) {
			issnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(109);
		}
		return issnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssnType_Value() {
        return (EAttribute)getIssnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssnType_MediaType() {
        return (EAttribute)getIssnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemNumberType() {
		if (itemNumberTypeEClass == null) {
			itemNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(112);
		}
		return itemNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemNumberType_Value() {
        return (EAttribute)getItemNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemNumberType_ItemNumberType() {
        return (EAttribute)getItemNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemType() {
		if (itemTypeEClass == null) {
			itemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(113);
		}
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Doi() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Resource() {
        return (EReference)getItemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Country() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Crawler() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Label() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_LinkHeaderRelationship() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJournalArticleType() {
		if (journalArticleTypeEClass == null) {
			journalArticleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(114);
		}
		return journalArticleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Titles() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Contributors() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Abstract() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_PublicationDate() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_AcceptanceDate() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Pages() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_PublisherItem() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Crossmark() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Program() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Program1() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Program2() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_Program3() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_ArchiveLocations() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_ScnPolicies() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_DoiData() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_CitationList() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalArticleType_ComponentList() {
        return (EReference)getJournalArticleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalArticleType_Language() {
        return (EAttribute)getJournalArticleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalArticleType_PublicationType() {
        return (EAttribute)getJournalArticleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalArticleType_ReferenceDistributionOpts() {
        return (EAttribute)getJournalArticleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJournalIssueType() {
		if (journalIssueTypeEClass == null) {
			journalIssueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(115);
		}
		return journalIssueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalIssueType_Contributors() {
        return (EReference)getJournalIssueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalIssueType_Titles() {
        return (EReference)getJournalIssueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalIssueType_PublicationDate() {
        return (EReference)getJournalIssueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalIssueType_JournalVolume() {
        return (EReference)getJournalIssueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalIssueType_Issue() {
        return (EAttribute)getJournalIssueType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalIssueType_SpecialNumbering() {
        return (EAttribute)getJournalIssueType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalIssueType_ArchiveLocations() {
        return (EReference)getJournalIssueType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalIssueType_DoiData() {
        return (EReference)getJournalIssueType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJournalMetadataType() {
		if (journalMetadataTypeEClass == null) {
			journalMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(116);
		}
		return journalMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalMetadataType_FullTitle() {
        return (EAttribute)getJournalMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalMetadataType_AbbrevTitle() {
        return (EAttribute)getJournalMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalMetadataType_Issn() {
        return (EReference)getJournalMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalMetadataType_Coden() {
        return (EAttribute)getJournalMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalMetadataType_ArchiveLocations() {
        return (EReference)getJournalMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalMetadataType_DoiData() {
        return (EReference)getJournalMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalMetadataType_Language() {
        return (EAttribute)getJournalMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getJournalMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJournalType() {
		if (journalTypeEClass == null) {
			journalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(117);
		}
		return journalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalType_JournalMetadata() {
        return (EReference)getJournalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalType_JournalIssue() {
        return (EReference)getJournalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalType_JournalArticle() {
        return (EReference)getJournalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJournalVolumeType() {
		if (journalVolumeTypeEClass == null) {
			journalVolumeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(118);
		}
		return journalVolumeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJournalVolumeType_Volume() {
        return (EAttribute)getJournalVolumeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalVolumeType_PublisherItem() {
        return (EReference)getJournalVolumeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalVolumeType_ArchiveLocations() {
        return (EReference)getJournalVolumeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJournalVolumeType_DoiData() {
        return (EReference)getJournalVolumeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameType1() {
		if (nameType1EClass == null) {
			nameType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(142);
		}
		return nameType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_Surname() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_GivenName() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_GivenName1() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameType1_Prefix() {
        return (EReference)getNameType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_Suffix() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_ContentType() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_Language() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_NameStyle() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameType1_SpecificUse() {
        return (EAttribute)getNameType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoisbnType() {
		if (noisbnTypeEClass == null) {
			noisbnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(144);
		}
		return noisbnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoisbnType_Reason() {
        return (EAttribute)getNoisbnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getORCIDType() {
		if (orcidTypeEClass == null) {
			orcidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(146);
		}
		return orcidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORCIDType_Value() {
        return (EAttribute)getORCIDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getORCIDType_Authenticated() {
        return (EAttribute)getORCIDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationType() {
		if (organizationTypeEClass == null) {
			organizationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(148);
		}
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationType_Value() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationType_ContributorRole() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationType_Language() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationType_NameStyle() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationType_Sequence() {
        return (EAttribute)getOrganizationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOriginalLanguageTitleType() {
		if (originalLanguageTitleTypeEClass == null) {
			originalLanguageTitleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(149);
		}
		return originalLanguageTitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOriginalLanguageTitleType_Mixed() {
        return (EAttribute)getOriginalLanguageTitleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOriginalLanguageTitleType_FaceMarkup() {
        return (EAttribute)getOriginalLanguageTitleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_B() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_I() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Em() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Strong() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_U() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Ovl() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Sup() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Sub() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Scp() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Tt() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Font() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOriginalLanguageTitleType_Math() {
        return (EReference)getOriginalLanguageTitleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOriginalLanguageTitleType_Language() {
        return (EAttribute)getOriginalLanguageTitleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPagesType() {
		if (pagesTypeEClass == null) {
			pagesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(151);
		}
		return pagesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPagesType_FirstPage() {
        return (EAttribute)getPagesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPagesType_LastPage() {
        return (EAttribute)getPagesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPagesType_OtherPages() {
        return (EAttribute)getPagesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeerReviewType() {
		if (peerReviewTypeEClass == null) {
			peerReviewTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(156);
		}
		return peerReviewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_Contributors() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_Titles() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_ReviewDate() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_Institution() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_CompetingInterestStatement() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeerReviewType_RunningNumber() {
        return (EAttribute)getPeerReviewType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_Program() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_Program1() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_ScnPolicies() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeerReviewType_DoiData() {
        return (EReference)getPeerReviewType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeerReviewType_Language() {
        return (EAttribute)getPeerReviewType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeerReviewType_Recommendation() {
        return (EAttribute)getPeerReviewType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeerReviewType_RevisionRound() {
        return (EAttribute)getPeerReviewType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeerReviewType_Stage() {
        return (EAttribute)getPeerReviewType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeerReviewType_Type() {
        return (EAttribute)getPeerReviewType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPendingPublicationType() {
		if (pendingPublicationTypeEClass == null) {
			pendingPublicationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(157);
		}
		return pendingPublicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Contributors() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Publication() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Titles() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_AcceptanceDate() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Institution() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_ItemNumber() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_IntentStatement() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Abstract() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Crossmark() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Program() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Program1() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPendingPublicationType_Program2() {
        return (EReference)getPendingPublicationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPendingPublicationType_Doi() {
        return (EAttribute)getPendingPublicationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPendingPublicationType_Language() {
        return (EAttribute)getPendingPublicationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonNameType() {
		if (personNameTypeEClass == null) {
			personNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(158);
		}
		return personNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_GivenName() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_Surname() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_Suffix() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_Affiliation() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonNameType_ORCID() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonNameType_AltName() {
        return (EReference)getPersonNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_ContributorRole() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_Language() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_NameStyle() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonNameType_Sequence() {
        return (EAttribute)getPersonNameType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostedContentType() {
		if (postedContentTypeEClass == null) {
			postedContentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(159);
		}
		return postedContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostedContentType_GroupTitle() {
        return (EAttribute)getPostedContentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Contributors() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Titles() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_PostedDate() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_AcceptanceDate() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Institution() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_ItemNumber() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Abstract() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Program() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Program1() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_Program2() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_ScnPolicies() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_DoiData() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostedContentType_CitationList() {
        return (EReference)getPostedContentType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostedContentType_Language() {
        return (EAttribute)getPostedContentType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostedContentType_Type() {
        return (EAttribute)getPostedContentType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostedDateType() {
		if (postedDateTypeEClass == null) {
			postedDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(160);
		}
		return postedDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrefixType() {
		if (prefixTypeEClass == null) {
			prefixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(161);
		}
		return prefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrefixType_Mixed() {
        return (EAttribute)getPrefixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrefixType_ContentType() {
        return (EAttribute)getPrefixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrefixType_Language() {
        return (EAttribute)getPrefixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrefixType_SpecificUse() {
        return (EAttribute)getPrefixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProceedingsMetadataType() {
		if (proceedingsMetadataTypeEClass == null) {
			proceedingsMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(162);
		}
		return proceedingsMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsMetadataType_ProceedingsTitle() {
        return (EAttribute)getProceedingsMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsMetadataType_ProceedingsSubject() {
        return (EAttribute)getProceedingsMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_Publisher() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_PublicationDate() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_Isbn() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_Noisbn() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_PublisherItem() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_ArchiveLocations() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsMetadataType_DoiData() {
        return (EReference)getProceedingsMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsMetadataType_Language() {
        return (EAttribute)getProceedingsMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getProceedingsMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProceedingsSeriesMetadataType() {
		if (proceedingsSeriesMetadataTypeEClass == null) {
			proceedingsSeriesMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(163);
		}
		return proceedingsSeriesMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_SeriesMetadata() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsSeriesMetadataType_ProceedingsTitle() {
        return (EAttribute)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsSeriesMetadataType_Volume() {
        return (EAttribute)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsSeriesMetadataType_Volume1() {
        return (EAttribute)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsSeriesMetadataType_ProceedingsSubject() {
        return (EAttribute)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_Publisher() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_PublicationDate() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_Isbn() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_Noisbn() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsSeriesMetadataType_ProceedingsSubject1() {
        return (EAttribute)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_Publisher1() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_PublicationDate1() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_PublisherItem() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_ArchiveLocations() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProceedingsSeriesMetadataType_DoiData() {
        return (EReference)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProceedingsSeriesMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getProceedingsSeriesMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(167);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Value() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Type() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicationDateType() {
		if (publicationDateTypeEClass == null) {
			publicationDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(170);
		}
		return publicationDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicationType() {
		if (publicationTypeEClass == null) {
			publicationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(173);
		}
		return publicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicationType_FullTitle() {
        return (EAttribute)getPublicationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicationType_Issn() {
        return (EReference)getPublicationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicationType_Isbn() {
        return (EReference)getPublicationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicationType_Doi() {
        return (EAttribute)getPublicationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicationType_Issn1() {
        return (EReference)getPublicationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicationType_Isbn1() {
        return (EReference)getPublicationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublisherItemType() {
		if (publisherItemTypeEClass == null) {
			publisherItemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(176);
		}
		return publisherItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublisherItemType_ItemNumber() {
        return (EReference)getPublisherItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublisherItemType_Identifier() {
        return (EReference)getPublisherItemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublisherType() {
		if (publisherTypeEClass == null) {
			publisherTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(179);
		}
		return publisherTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisherType_PublisherName() {
        return (EAttribute)getPublisherType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisherType_PublisherPlace() {
        return (EAttribute)getPublisherType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReportPaperMetadataType() {
		if (reportPaperMetadataTypeEClass == null) {
			reportPaperMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(191);
		}
		return reportPaperMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Contributors() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Titles() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperMetadataType_EditionNumber() {
        return (EAttribute)getReportPaperMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Abstract() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_PublicationDate() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_ApprovalDate() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Isbn() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Publisher() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Institution() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_PublisherItem() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperMetadataType_ContractNumber() {
        return (EAttribute)getReportPaperMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Crossmark() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Program() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Program1() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_Program2() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_ArchiveLocations() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_ScnPolicies() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_DoiData() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperMetadataType_CitationList() {
        return (EReference)getReportPaperMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperMetadataType_Language() {
        return (EAttribute)getReportPaperMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getReportPaperMetadataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReportPaperSeriesMetadataType() {
		if (reportPaperSeriesMetadataTypeEClass == null) {
			reportPaperSeriesMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(192);
		}
		return reportPaperSeriesMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_SeriesMetadata() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Contributors() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Titles() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Abstract() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperSeriesMetadataType_Volume() {
        return (EAttribute)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperSeriesMetadataType_Volume1() {
        return (EAttribute)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperSeriesMetadataType_EditionNumber() {
        return (EAttribute)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_PublicationDate() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_ApprovalDate() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Isbn() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Publisher() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Institution() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_PublisherItem() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperSeriesMetadataType_ContractNumber() {
        return (EAttribute)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_ArchiveLocations() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_DoiData() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_CitationList() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperSeriesMetadataType_Program() {
        return (EReference)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperSeriesMetadataType_Language() {
        return (EAttribute)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperSeriesMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getReportPaperSeriesMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReportPaperType() {
		if (reportPaperTypeEClass == null) {
			reportPaperTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(193);
		}
		return reportPaperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperType_ReportPaperMetadata() {
        return (EReference)getReportPaperType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperType_ReportPaperSeriesMetadata() {
        return (EReference)getReportPaperType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperType_ContentItem() {
        return (EReference)getReportPaperType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReportPaperType_ComponentList() {
        return (EReference)getReportPaperType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReportPaperType_PublicationType() {
        return (EAttribute)getReportPaperType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceType() {
		if (resourceTypeEClass == null) {
			resourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(195);
		}
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_Value() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_ContentVersion() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_MimeType() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReviewDateType() {
		if (reviewDateTypeEClass == null) {
			reviewDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(196);
		}
		return reviewDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReviewDateType_Month() {
        return (EAttribute)getReviewDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReviewDateType_Day() {
        return (EAttribute)getReviewDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReviewDateType_Year() {
        return (EAttribute)getReviewDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSaComponentType() {
		if (saComponentTypeEClass == null) {
			saComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(197);
		}
		return saComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSaComponentType_ComponentList() {
        return (EReference)getSaComponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaComponentType_ParentDoi() {
        return (EAttribute)getSaComponentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScnPoliciesType() {
		if (scnPoliciesTypeEClass == null) {
			scnPoliciesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(198);
		}
		return scnPoliciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScnPoliciesType_ScnPolicySet() {
        return (EReference)getScnPoliciesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScnPolicyRefType() {
		if (scnPolicyRefTypeEClass == null) {
			scnPolicyRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(199);
		}
		return scnPolicyRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScnPolicyRefType_Value() {
        return (EAttribute)getScnPolicyRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScnPolicySetType() {
		if (scnPolicySetTypeEClass == null) {
			scnPolicySetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(200);
		}
		return scnPolicySetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScnPolicySetType_ScnPolicyRef() {
        return (EReference)getScnPolicySetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScnPolicySetType_StartDate() {
        return (EAttribute)getScnPolicySetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeriesMetadataType() {
		if (seriesMetadataTypeEClass == null) {
			seriesMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(203);
		}
		return seriesMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Contributors() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Titles() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Abstract() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Issn() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeriesMetadataType_Coden() {
        return (EAttribute)getSeriesMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeriesMetadataType_SeriesNumber() {
        return (EAttribute)getSeriesMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_PublisherItem() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Crossmark() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Program() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_Program1() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_ArchiveLocations() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesMetadataType_DoiData() {
        return (EReference)getSeriesMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetMetadataType() {
		if (setMetadataTypeEClass == null) {
			setMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(205);
		}
		return setMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_Titles() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_Isbn() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_Noisbn() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_Contributors() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetMetadataType_PartNumber() {
        return (EAttribute)getSetMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_PublisherItem() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_ArchiveLocations() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetMetadataType_DoiData() {
        return (EReference)getSetMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardMetadataType() {
		if (standardMetadataTypeEClass == null) {
			standardMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(209);
		}
		return standardMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Contributors() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Titles() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Abstract() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Designators() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardMetadataType_EditionNumber() {
        return (EAttribute)getStandardMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_ApprovalDate() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Isbn() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Publisher() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_StandardsBody() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_PublisherItem() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Crossmark() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Program() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Program1() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_Program2() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_ArchiveLocations() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_DoiData() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardMetadataType_CitationList() {
        return (EReference)getStandardMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardMetadataType_Language() {
        return (EAttribute)getStandardMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardMetadataType_PublicationStatus() {
        return (EAttribute)getStandardMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardMetadataType_ReferenceDistributionOpts() {
        return (EAttribute)getStandardMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardsBodyType() {
		if (standardsBodyTypeEClass == null) {
			standardsBodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(210);
		}
		return standardsBodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardsBodyType_StandardsBodyName() {
        return (EReference)getStandardsBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardsBodyType_StandardsBodyAcronym() {
        return (EReference)getStandardsBodyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardType() {
		if (standardTypeEClass == null) {
			standardTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(211);
		}
		return standardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_StandardMetadata() {
        return (EReference)getStandardType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_ContentItem() {
        return (EReference)getStandardType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_ComponentList() {
        return (EReference)getStandardType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardType_PublicationType() {
        return (EAttribute)getStandardType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStdAltAsPublishedType() {
		if (stdAltAsPublishedTypeEClass == null) {
			stdAltAsPublishedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(212);
		}
		return stdAltAsPublishedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdAltAsPublishedType_ApprovedMonth() {
        return (EAttribute)getStdAltAsPublishedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdAltAsPublishedType_ApprovedYear() {
        return (EAttribute)getStdAltAsPublishedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdAltAsPublishedType_Reason() {
        return (EAttribute)getStdAltAsPublishedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStdAsPublishedType() {
		if (stdAsPublishedTypeEClass == null) {
			stdAsPublishedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(213);
		}
		return stdAsPublishedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdAsPublishedType_Family() {
        return (EAttribute)getStdAsPublishedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdAsPublishedType_Set() {
        return (EAttribute)getStdAsPublishedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdAsPublishedType_Undated() {
        return (EAttribute)getStdAsPublishedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStdDesignatorT() {
		if (stdDesignatorTEClass == null) {
			stdDesignatorTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(214);
		}
		return stdDesignatorTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdDesignatorT_StdDesignator() {
        return (EAttribute)getStdDesignatorT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdDesignatorT_StdAltScript() {
        return (EAttribute)getStdDesignatorT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdDesignatorT_StdVariantForm() {
        return (EAttribute)getStdDesignatorT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStdSetDesignatorType() {
		if (stdSetDesignatorTypeEClass == null) {
			stdSetDesignatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(216);
		}
		return stdSetDesignatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdSetDesignatorType_Family() {
        return (EAttribute)getStdSetDesignatorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStdUndatedDesignatorType() {
		if (stdUndatedDesignatorTypeEClass == null) {
			stdUndatedDesignatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(217);
		}
		return stdUndatedDesignatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdUndatedDesignatorType_Family() {
        return (EAttribute)getStdUndatedDesignatorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStdUndatedDesignatorType_Set() {
        return (EAttribute)getStdUndatedDesignatorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringNameType() {
		if (stringNameTypeEClass == null) {
			stringNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(218);
		}
		return stringNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_Mixed() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_Group() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringNameType_Degrees() {
        return (EReference)getStringNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_GivenName() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringNameType_Prefix() {
        return (EReference)getStringNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_Surname() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_Suffix() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_ContentType() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_Language() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_NameStyle() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringNameType_SpecificUse() {
        return (EAttribute)getStringNameType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtitleType() {
		if (subtitleTypeEClass == null) {
			subtitleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(219);
		}
		return subtitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubtitleType_Mixed() {
        return (EAttribute)getSubtitleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubtitleType_FaceMarkup() {
        return (EAttribute)getSubtitleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_B() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_I() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Em() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Strong() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_U() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Ovl() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Sup() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Sub() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Scp() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Tt() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Font() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtitleType_Math() {
        return (EReference)getSubtitleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitlesType() {
		if (titlesTypeEClass == null) {
			titlesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(222);
		}
		return titlesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitlesType_Title() {
        return (EReference)getTitlesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitlesType_Subtitle() {
        return (EReference)getTitlesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitlesType_OriginalLanguageTitle() {
        return (EReference)getTitlesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitlesType_Subtitle1() {
        return (EReference)getTitlesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitleType() {
		if (titleTypeEClass == null) {
			titleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(223);
		}
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitleType_Mixed() {
        return (EAttribute)getTitleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitleType_FaceMarkup() {
        return (EAttribute)getTitleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_B() {
        return (EReference)getTitleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_I() {
        return (EReference)getTitleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Em() {
        return (EReference)getTitleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Strong() {
        return (EReference)getTitleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_U() {
        return (EReference)getTitleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Ovl() {
        return (EReference)getTitleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Sup() {
        return (EReference)getTitleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Sub() {
        return (EReference)getTitleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Scp() {
        return (EReference)getTitleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Tt() {
        return (EReference)getTitleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Font() {
        return (EReference)getTitleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitleType_Math() {
        return (EReference)getTitleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnassignedContentType() {
		if (unassignedContentTypeEClass == null) {
			unassignedContentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(230);
		}
		return unassignedContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnassignedContentType_Type() {
        return (EAttribute)getUnassignedContentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnstructuredCitationType() {
		if (unstructuredCitationTypeEClass == null) {
			unstructuredCitationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(231);
		}
		return unstructuredCitationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstructuredCitationType_Mixed() {
        return (EAttribute)getUnstructuredCitationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstructuredCitationType_FaceMarkup() {
        return (EAttribute)getUnstructuredCitationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_B() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_I() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Em() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Strong() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_U() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Ovl() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Sup() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Sub() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Scp() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Tt() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Font() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstructuredCitationType_Math() {
        return (EReference)getUnstructuredCitationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateDateType() {
		if (updateDateTypeEClass == null) {
			updateDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(232);
		}
		return updateDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdatesType() {
		if (updatesTypeEClass == null) {
			updatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(233);
		}
		return updatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdatesType_Update() {
        return (EReference)getUpdatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateType() {
		if (updateTypeEClass == null) {
			updateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(234);
		}
		return updateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateType_Value() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateType_Date() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateType_Type() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXrefFaces() {
		if (xrefFacesEClass == null) {
			xrefFacesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(237);
		}
		return xrefFacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXrefFaces_Mixed() {
        return (EAttribute)getXrefFaces().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXrefFaces_FaceMarkup() {
        return (EAttribute)getXrefFaces().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_B() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_I() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Em() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Strong() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_U() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Ovl() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Sup() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Sub() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Scp() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Tt() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Font() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXrefFaces_Math() {
        return (EReference)getXrefFaces().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBookTypeType() {
		if (bookTypeTypeEEnum == null) {
			bookTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(17);
		}
		return bookTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCmUpdateType() {
		if (cmUpdateTypeEEnum == null) {
			cmUpdateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(28);
		}
		return cmUpdateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentTypeType() {
		if (componentTypeTypeEEnum == null) {
			componentTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(37);
		}
		return componentTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContentVersionType() {
		if (contentVersionTypeEEnum == null) {
			contentVersionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(51);
		}
		return contentVersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContributorRoleType() {
		if (contributorRoleTypeEEnum == null) {
			contributorRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(54);
		}
		return contributorRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCountryType() {
		if (countryTypeEEnum == null) {
			countryTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(57);
		}
		return countryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCrawlerType() {
		if (crawlerTypeEEnum == null) {
			crawlerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(59);
		}
		return crawlerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatasetTypeType() {
		if (datasetTypeTypeEEnum == null) {
			datasetTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(70);
		}
		return datasetTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdTypeType() {
		if (idTypeTypeEEnum == null) {
			idTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(98);
		}
		return idTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageType() {
		if (languageTypeEEnum == null) {
			languageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(121);
		}
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinkHeaderRelationshipType() {
		if (linkHeaderRelationshipTypeEEnum == null) {
			linkHeaderRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(125);
		}
		return linkHeaderRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediaTypeType() {
		if (mediaTypeTypeEEnum == null) {
			mediaTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(127);
		}
		return mediaTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediaTypeType1() {
		if (mediaTypeType1EEnum == null) {
			mediaTypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(128);
		}
		return mediaTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMimeTypeType() {
		if (mimeTypeTypeEEnum == null) {
			mimeTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(131);
		}
		return mimeTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiResolutionType() {
		if (multiResolutionTypeEEnum == null) {
			multiResolutionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(133);
		}
		return multiResolutionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameStyleType() {
		if (nameStyleTypeEEnum == null) {
			nameStyleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(135);
		}
		return nameStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameStyleType1() {
		if (nameStyleType1EEnum == null) {
			nameStyleType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(136);
		}
		return nameStyleType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameStyleType2() {
		if (nameStyleType2EEnum == null) {
			nameStyleType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(137);
		}
		return nameStyleType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNameType() {
		if (nameTypeEEnum == null) {
			nameTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(141);
		}
		return nameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParentRelationType() {
		if (parentRelationTypeEEnum == null) {
			parentRelationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(153);
		}
		return parentRelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyType1() {
		if (propertyType1EEnum == null) {
			propertyType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(168);
		}
		return propertyType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPublicationStatusType() {
		if (publicationStatusTypeEEnum == null) {
			publicationStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(171);
		}
		return publicationStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPublicationTypeType() {
		if (publicationTypeTypeEEnum == null) {
			publicationTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(174);
		}
		return publicationTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReasonType1() {
		if (reasonType1EEnum == null) {
			reasonType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(181);
		}
		return reasonType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReasonTypeItem() {
		if (reasonTypeItemEEnum == null) {
			reasonTypeItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(182);
		}
		return reasonTypeItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRecommendationType() {
		if (recommendationTypeEEnum == null) {
			recommendationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(185);
		}
		return recommendationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReferenceDistributionOptsType() {
		if (referenceDistributionOptsTypeEEnum == null) {
			referenceDistributionOptsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(187);
		}
		return referenceDistributionOptsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSequenceType() {
		if (sequenceTypeEEnum == null) {
			sequenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(201);
		}
		return sequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStageType() {
		if (stageTypeEEnum == null) {
			stageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(207);
		}
		return stageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType() {
		if (typeTypeEEnum == null) {
			typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(224);
		}
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType1() {
		if (typeType1EEnum == null) {
			typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(225);
		}
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType2() {
		if (typeType2EEnum == null) {
			typeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(226);
		}
		return typeType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAbbrevTitleType() {
		if (abbrevTitleTypeEDataType == null) {
			abbrevTitleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(0);
		}
		return abbrevTitleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAffiliationType() {
		if (affiliationTypeEDataType == null) {
			affiliationTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(2);
		}
		return affiliationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getApprovedMonthType() {
		if (approvedMonthTypeEDataType == null) {
			approvedMonthTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(6);
		}
		return approvedMonthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getApprovedYearType() {
		if (approvedYearTypeEDataType == null) {
			approvedYearTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(7);
		}
		return approvedYearTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBookTypeTypeObject() {
		if (bookTypeTypeObjectEDataType == null) {
			bookTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(18);
		}
		return bookTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmAssertion() {
		if (cmAssertionEDataType == null) {
			cmAssertionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(22);
		}
		return cmAssertionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmAssertionGroupLabel() {
		if (cmAssertionGroupLabelEDataType == null) {
			cmAssertionGroupLabelEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(23);
		}
		return cmAssertionGroupLabelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmAssertionGroupName() {
		if (cmAssertionGroupNameEDataType == null) {
			cmAssertionGroupNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(24);
		}
		return cmAssertionGroupNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmAssertionLabel() {
		if (cmAssertionLabelEDataType == null) {
			cmAssertionLabelEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(25);
		}
		return cmAssertionLabelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmAssertionName() {
		if (cmAssertionNameEDataType == null) {
			cmAssertionNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(26);
		}
		return cmAssertionNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmDomain() {
		if (cmDomainEDataType == null) {
			cmDomainEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(27);
		}
		return cmDomainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCmUpdateTypeObject() {
		if (cmUpdateTypeObjectEDataType == null) {
			cmUpdateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(29);
		}
		return cmUpdateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCodenType() {
		if (codenTypeEDataType == null) {
			codenTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(30);
		}
		return codenTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComponentNumberType() {
		if (componentNumberTypeEDataType == null) {
			componentNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(34);
		}
		return componentNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComponentSizeType() {
		if (componentSizeTypeEDataType == null) {
			componentSizeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(35);
		}
		return componentSizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComponentTypeTypeObject() {
		if (componentTypeTypeObjectEDataType == null) {
			componentTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(38);
		}
		return componentTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceAcronymType() {
		if (conferenceAcronymTypeEDataType == null) {
			conferenceAcronymTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(39);
		}
		return conferenceAcronymTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceDateT() {
		if (conferenceDateTEDataType == null) {
			conferenceDateTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(40);
		}
		return conferenceDateTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceLocationType() {
		if (conferenceLocationTypeEDataType == null) {
			conferenceLocationTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(42);
		}
		return conferenceLocationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceNameType() {
		if (conferenceNameTypeEDataType == null) {
			conferenceNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(43);
		}
		return conferenceNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceNumberType() {
		if (conferenceNumberTypeEDataType == null) {
			conferenceNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(44);
		}
		return conferenceNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceSponsorType() {
		if (conferenceSponsorTypeEDataType == null) {
			conferenceSponsorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(46);
		}
		return conferenceSponsorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConferenceThemeType() {
		if (conferenceThemeTypeEDataType == null) {
			conferenceThemeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(47);
		}
		return conferenceThemeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getContentVersionTypeObject() {
		if (contentVersionTypeObjectEDataType == null) {
			contentVersionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(52);
		}
		return contentVersionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getContractNumberType() {
		if (contractNumberTypeEDataType == null) {
			contractNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(53);
		}
		return contractNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getContributorRoleTypeObject() {
		if (contributorRoleTypeObjectEDataType == null) {
			contributorRoleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(55);
		}
		return contributorRoleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCountryTypeObject() {
		if (countryTypeObjectEDataType == null) {
			countryTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(58);
		}
		return countryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCrawlerTypeObject() {
		if (crawlerTypeObjectEDataType == null) {
			crawlerTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(60);
		}
		return crawlerTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatasetTypeTypeObject() {
		if (datasetTypeTypeObjectEDataType == null) {
			datasetTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(71);
		}
		return datasetTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDegreeType() {
		if (degreeTypeEDataType == null) {
			degreeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(74);
		}
		return degreeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDepositorNameType() {
		if (depositorNameTypeEDataType == null) {
			depositorNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(75);
		}
		return depositorNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoiBatchIdType() {
		if (doiBatchIdTypeEDataType == null) {
			doiBatchIdTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(81);
		}
		return doiBatchIdTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoiT() {
		if (doiTEDataType == null) {
			doiTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(84);
		}
		return doiTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDoiType() {
		if (doiTypeEDataType == null) {
			doiTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(85);
		}
		return doiTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEditionNumberType() {
		if (editionNumberTypeEDataType == null) {
			editionNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(86);
		}
		return editionNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEmailAddressType() {
		if (emailAddressTypeEDataType == null) {
			emailAddressTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(87);
		}
		return emailAddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFirstPageType() {
		if (firstPageTypeEDataType == null) {
			firstPageTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(89);
		}
		return firstPageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFormatT() {
		if (formatTEDataType == null) {
			formatTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(90);
		}
		return formatTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFullTitleType() {
		if (fullTitleTypeEDataType == null) {
			fullTitleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(92);
		}
		return fullTitleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGivenNameType() {
		if (givenNameTypeEDataType == null) {
			givenNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(93);
		}
		return givenNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGroupTitleType() {
		if (groupTitleTypeEDataType == null) {
			groupTitleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(94);
		}
		return groupTitleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdentifierT() {
		if (identifierTEDataType == null) {
			identifierTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(96);
		}
		return identifierTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdTypeTypeObject() {
		if (idTypeTypeObjectEDataType == null) {
			idTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(99);
		}
		return idTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstitutionAcronymType() {
		if (institutionAcronymTypeEDataType == null) {
			institutionAcronymTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(100);
		}
		return institutionAcronymTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstitutionDepartmentType() {
		if (institutionDepartmentTypeEDataType == null) {
			institutionDepartmentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(101);
		}
		return institutionDepartmentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstitutionNameType() {
		if (institutionNameTypeEDataType == null) {
			institutionNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(102);
		}
		return institutionNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstitutionPlaceType() {
		if (institutionPlaceTypeEDataType == null) {
			institutionPlaceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(103);
		}
		return institutionPlaceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIsbnT() {
		if (isbnTEDataType == null) {
			isbnTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(106);
		}
		return isbnTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIssnT() {
		if (issnTEDataType == null) {
			issnTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(108);
		}
		return issnTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIssueType() {
		if (issueTypeEDataType == null) {
			issueTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(110);
		}
		return issueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getItemNumberT() {
		if (itemNumberTEDataType == null) {
			itemNumberTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(111);
		}
		return itemNumberTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKeyType() {
		if (keyTypeEDataType == null) {
			keyTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(119);
		}
		return keyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLabelType() {
		if (labelTypeEDataType == null) {
			labelTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(120);
		}
		return labelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLanguageTypeObject() {
		if (languageTypeObjectEDataType == null) {
			languageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(122);
		}
		return languageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLastPageType() {
		if (lastPageTypeEDataType == null) {
			lastPageTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(123);
		}
		return lastPageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLevelSequenceNumberType() {
		if (levelSequenceNumberTypeEDataType == null) {
			levelSequenceNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(124);
		}
		return levelSequenceNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLinkHeaderRelationshipTypeObject() {
		if (linkHeaderRelationshipTypeObjectEDataType == null) {
			linkHeaderRelationshipTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(126);
		}
		return linkHeaderRelationshipTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMediaTypeTypeObject() {
		if (mediaTypeTypeObjectEDataType == null) {
			mediaTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(129);
		}
		return mediaTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMediaTypeTypeObject1() {
		if (mediaTypeTypeObject1EDataType == null) {
			mediaTypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(130);
		}
		return mediaTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMimeTypeTypeObject() {
		if (mimeTypeTypeObjectEDataType == null) {
			mimeTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(132);
		}
		return mimeTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMultiResolutionTypeObject() {
		if (multiResolutionTypeObjectEDataType == null) {
			multiResolutionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(134);
		}
		return multiResolutionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameStyleTypeObject() {
		if (nameStyleTypeObjectEDataType == null) {
			nameStyleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(138);
		}
		return nameStyleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameStyleTypeObject1() {
		if (nameStyleTypeObject1EDataType == null) {
			nameStyleTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(139);
		}
		return nameStyleTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameStyleTypeObject2() {
		if (nameStyleTypeObject2EDataType == null) {
			nameStyleTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(140);
		}
		return nameStyleTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNameTypeObject() {
		if (nameTypeObjectEDataType == null) {
			nameTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(143);
		}
		return nameTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOrcidT() {
		if (orcidTEDataType == null) {
			orcidTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(145);
		}
		return orcidTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOrganizationT() {
		if (organizationTEDataType == null) {
			organizationTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(147);
		}
		return organizationTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOtherPagesType() {
		if (otherPagesTypeEDataType == null) {
			otherPagesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(150);
		}
		return otherPagesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getParentDoiType() {
		if (parentDoiTypeEDataType == null) {
			parentDoiTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(152);
		}
		return parentDoiTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getParentRelationTypeObject() {
		if (parentRelationTypeObjectEDataType == null) {
			parentRelationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(154);
		}
		return parentRelationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPartNumberType() {
		if (partNumberTypeEDataType == null) {
			partNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(155);
		}
		return partNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProceedingsSubjectType() {
		if (proceedingsSubjectTypeEDataType == null) {
			proceedingsSubjectTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(164);
		}
		return proceedingsSubjectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProceedingsTitleType() {
		if (proceedingsTitleTypeEDataType == null) {
			proceedingsTitleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(165);
		}
		return proceedingsTitleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPropertyT() {
		if (propertyTEDataType == null) {
			propertyTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(166);
		}
		return propertyTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPropertyTypeObject() {
		if (propertyTypeObjectEDataType == null) {
			propertyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(169);
		}
		return propertyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPublicationStatusTypeObject() {
		if (publicationStatusTypeObjectEDataType == null) {
			publicationStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(172);
		}
		return publicationStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPublicationTypeTypeObject() {
		if (publicationTypeTypeObjectEDataType == null) {
			publicationTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(175);
		}
		return publicationTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPublisherNameType() {
		if (publisherNameTypeEDataType == null) {
			publisherNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(177);
		}
		return publisherNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPublisherPlaceType() {
		if (publisherPlaceTypeEDataType == null) {
			publisherPlaceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(178);
		}
		return publisherPlaceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReasonType() {
		if (reasonTypeEDataType == null) {
			reasonTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(180);
		}
		return reasonTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReasonTypeItemObject() {
		if (reasonTypeItemObjectEDataType == null) {
			reasonTypeItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(183);
		}
		return reasonTypeItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReasonTypeObject() {
		if (reasonTypeObjectEDataType == null) {
			reasonTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(184);
		}
		return reasonTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRecommendationTypeObject() {
		if (recommendationTypeObjectEDataType == null) {
			recommendationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(186);
		}
		return recommendationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReferenceDistributionOptsTypeObject() {
		if (referenceDistributionOptsTypeObjectEDataType == null) {
			referenceDistributionOptsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(188);
		}
		return referenceDistributionOptsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegAgencyType() {
		if (regAgencyTypeEDataType == null) {
			regAgencyTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(189);
		}
		return regAgencyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegistrantType() {
		if (registrantTypeEDataType == null) {
			registrantTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(190);
		}
		return registrantTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getResourceT() {
		if (resourceTEDataType == null) {
			resourceTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(194);
		}
		return resourceTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSequenceTypeObject() {
		if (sequenceTypeObjectEDataType == null) {
			sequenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(202);
		}
		return sequenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSeriesNumberType() {
		if (seriesNumberTypeEDataType == null) {
			seriesNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(204);
		}
		return seriesNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpecialNumberingType() {
		if (specialNumberingTypeEDataType == null) {
			specialNumberingTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(206);
		}
		return specialNumberingTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStageTypeObject() {
		if (stageTypeObjectEDataType == null) {
			stageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(208);
		}
		return stageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStdDesignatorvalueT() {
		if (stdDesignatorvalueTEDataType == null) {
			stdDesignatorvalueTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(215);
		}
		return stdDesignatorvalueTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSuffixType() {
		if (suffixTypeEDataType == null) {
			suffixTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(220);
		}
		return suffixTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSurnameType() {
		if (surnameTypeEDataType == null) {
			surnameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(221);
		}
		return surnameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(227);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject1() {
		if (typeTypeObject1EDataType == null) {
			typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(228);
		}
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject2() {
		if (typeTypeObject2EDataType == null) {
			typeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(229);
		}
		return typeTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVolumeType() {
		if (volumeTypeEDataType == null) {
			volumeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(235);
		}
		return volumeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getXrefDay() {
		if (xrefDayEDataType == null) {
			xrefDayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(236);
		}
		return xrefDayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getXrefMonth() {
		if (xrefMonthEDataType == null) {
			xrefMonthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(238);
		}
		return xrefMonthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getXrefYear() {
		if (xrefYearEDataType == null) {
			xrefYearEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_4Package.eNS_URI).getEClassifiers().get(239);
		}
		return xrefYearEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _4Factory get_4Factory() {
		return (_4Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.crossref.schema._4._4." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //_4PackageImpl
