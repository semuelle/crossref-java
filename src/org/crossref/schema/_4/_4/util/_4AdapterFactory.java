/**
 */
package org.crossref.schema._4._4.util;

import org.crossref.schema._4._4.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.crossref.schema._4._4._4Package
 * @generated
 */
public class _4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _4Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _4Switch<Adapter> modelSwitch =
		new _4Switch<Adapter>() {
			@Override
			public Adapter caseAcceptanceDateType(AcceptanceDateType object) {
				return createAcceptanceDateTypeAdapter();
			}
			@Override
			public Adapter caseAltNameType(AltNameType object) {
				return createAltNameTypeAdapter();
			}
			@Override
			public Adapter caseAnonymousType(AnonymousType object) {
				return createAnonymousTypeAdapter();
			}
			@Override
			public Adapter caseApprovalDateType(ApprovalDateType object) {
				return createApprovalDateTypeAdapter();
			}
			@Override
			public Adapter caseArchiveLocationsType(ArchiveLocationsType object) {
				return createArchiveLocationsTypeAdapter();
			}
			@Override
			public Adapter caseArchiveType(ArchiveType object) {
				return createArchiveTypeAdapter();
			}
			@Override
			public Adapter caseAssertionType(AssertionType object) {
				return createAssertionTypeAdapter();
			}
			@Override
			public Adapter caseAType(AType object) {
				return createATypeAdapter();
			}
			@Override
			public Adapter caseBodyType(BodyType object) {
				return createBodyTypeAdapter();
			}
			@Override
			public Adapter caseBookMetadataType(BookMetadataType object) {
				return createBookMetadataTypeAdapter();
			}
			@Override
			public Adapter caseBookSeriesMetadataType(BookSeriesMetadataType object) {
				return createBookSeriesMetadataTypeAdapter();
			}
			@Override
			public Adapter caseBookSetMetadataType(BookSetMetadataType object) {
				return createBookSetMetadataTypeAdapter();
			}
			@Override
			public Adapter caseBookType(BookType object) {
				return createBookTypeAdapter();
			}
			@Override
			public Adapter caseCitationListType(CitationListType object) {
				return createCitationListTypeAdapter();
			}
			@Override
			public Adapter caseCitationT(CitationT object) {
				return createCitationTAdapter();
			}
			@Override
			public Adapter caseCitationType(CitationType object) {
				return createCitationTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseCompetingInterestStatementType(CompetingInterestStatementType object) {
				return createCompetingInterestStatementTypeAdapter();
			}
			@Override
			public Adapter caseComponentListType(ComponentListType object) {
				return createComponentListTypeAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseConferenceDateType(ConferenceDateType object) {
				return createConferenceDateTypeAdapter();
			}
			@Override
			public Adapter caseConferencePaperType(ConferencePaperType object) {
				return createConferencePaperTypeAdapter();
			}
			@Override
			public Adapter caseConferenceType(ConferenceType object) {
				return createConferenceTypeAdapter();
			}
			@Override
			public Adapter caseContentDateType(ContentDateType object) {
				return createContentDateTypeAdapter();
			}
			@Override
			public Adapter caseContentItemType(ContentItemType object) {
				return createContentItemTypeAdapter();
			}
			@Override
			public Adapter caseContributorsType(ContributorsType object) {
				return createContributorsTypeAdapter();
			}
			@Override
			public Adapter caseCreationDateType(CreationDateType object) {
				return createCreationDateTypeAdapter();
			}
			@Override
			public Adapter caseCrossmarkDomainsType(CrossmarkDomainsType object) {
				return createCrossmarkDomainsTypeAdapter();
			}
			@Override
			public Adapter caseCrossmarkDomainType(CrossmarkDomainType object) {
				return createCrossmarkDomainTypeAdapter();
			}
			@Override
			public Adapter caseCrossmarkType(CrossmarkType object) {
				return createCrossmarkTypeAdapter();
			}
			@Override
			public Adapter caseCustomMetadataType(CustomMetadataType object) {
				return createCustomMetadataTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseDateType(DatabaseDateType object) {
				return createDatabaseDateTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseMetadataType(DatabaseMetadataType object) {
				return createDatabaseMetadataTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseType(DatabaseType object) {
				return createDatabaseTypeAdapter();
			}
			@Override
			public Adapter caseDatasetType(DatasetType object) {
				return createDatasetTypeAdapter();
			}
			@Override
			public Adapter caseDateT(DateT object) {
				return createDateTAdapter();
			}
			@Override
			public Adapter caseDegreesType(DegreesType object) {
				return createDegreesTypeAdapter();
			}
			@Override
			public Adapter caseDepositorType(DepositorType object) {
				return createDepositorTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDesignatorsType(DesignatorsType object) {
				return createDesignatorsTypeAdapter();
			}
			@Override
			public Adapter caseDissertationType(DissertationType object) {
				return createDissertationTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoiBatchType(DoiBatchType object) {
				return createDoiBatchTypeAdapter();
			}
			@Override
			public Adapter caseDoiDataType(DoiDataType object) {
				return createDoiDataTypeAdapter();
			}
			@Override
			public Adapter caseEventMetadataType(EventMetadataType object) {
				return createEventMetadataTypeAdapter();
			}
			@Override
			public Adapter caseFormatType(FormatType object) {
				return createFormatTypeAdapter();
			}
			@Override
			public Adapter caseHeadType(HeadType object) {
				return createHeadTypeAdapter();
			}
			@Override
			public Adapter caseIdentifierType(IdentifierType object) {
				return createIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseInstitutionType(InstitutionType object) {
				return createInstitutionTypeAdapter();
			}
			@Override
			public Adapter caseIntentStatementType(IntentStatementType object) {
				return createIntentStatementTypeAdapter();
			}
			@Override
			public Adapter caseIsbnType(IsbnType object) {
				return createIsbnTypeAdapter();
			}
			@Override
			public Adapter caseIssnType(IssnType object) {
				return createIssnTypeAdapter();
			}
			@Override
			public Adapter caseItemNumberType(ItemNumberType object) {
				return createItemNumberTypeAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseJournalArticleType(JournalArticleType object) {
				return createJournalArticleTypeAdapter();
			}
			@Override
			public Adapter caseJournalIssueType(JournalIssueType object) {
				return createJournalIssueTypeAdapter();
			}
			@Override
			public Adapter caseJournalMetadataType(JournalMetadataType object) {
				return createJournalMetadataTypeAdapter();
			}
			@Override
			public Adapter caseJournalType(JournalType object) {
				return createJournalTypeAdapter();
			}
			@Override
			public Adapter caseJournalVolumeType(JournalVolumeType object) {
				return createJournalVolumeTypeAdapter();
			}
			@Override
			public Adapter caseNameType1(NameType1 object) {
				return createNameType1Adapter();
			}
			@Override
			public Adapter caseNoisbnType(NoisbnType object) {
				return createNoisbnTypeAdapter();
			}
			@Override
			public Adapter caseORCIDType(ORCIDType object) {
				return createORCIDTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationType(OrganizationType object) {
				return createOrganizationTypeAdapter();
			}
			@Override
			public Adapter caseOriginalLanguageTitleType(OriginalLanguageTitleType object) {
				return createOriginalLanguageTitleTypeAdapter();
			}
			@Override
			public Adapter casePagesType(PagesType object) {
				return createPagesTypeAdapter();
			}
			@Override
			public Adapter casePeerReviewType(PeerReviewType object) {
				return createPeerReviewTypeAdapter();
			}
			@Override
			public Adapter casePendingPublicationType(PendingPublicationType object) {
				return createPendingPublicationTypeAdapter();
			}
			@Override
			public Adapter casePersonNameType(PersonNameType object) {
				return createPersonNameTypeAdapter();
			}
			@Override
			public Adapter casePostedContentType(PostedContentType object) {
				return createPostedContentTypeAdapter();
			}
			@Override
			public Adapter casePostedDateType(PostedDateType object) {
				return createPostedDateTypeAdapter();
			}
			@Override
			public Adapter casePrefixType(PrefixType object) {
				return createPrefixTypeAdapter();
			}
			@Override
			public Adapter caseProceedingsMetadataType(ProceedingsMetadataType object) {
				return createProceedingsMetadataTypeAdapter();
			}
			@Override
			public Adapter caseProceedingsSeriesMetadataType(ProceedingsSeriesMetadataType object) {
				return createProceedingsSeriesMetadataTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter casePublicationDateType(PublicationDateType object) {
				return createPublicationDateTypeAdapter();
			}
			@Override
			public Adapter casePublicationType(PublicationType object) {
				return createPublicationTypeAdapter();
			}
			@Override
			public Adapter casePublisherItemType(PublisherItemType object) {
				return createPublisherItemTypeAdapter();
			}
			@Override
			public Adapter casePublisherType(PublisherType object) {
				return createPublisherTypeAdapter();
			}
			@Override
			public Adapter caseReportPaperMetadataType(ReportPaperMetadataType object) {
				return createReportPaperMetadataTypeAdapter();
			}
			@Override
			public Adapter caseReportPaperSeriesMetadataType(ReportPaperSeriesMetadataType object) {
				return createReportPaperSeriesMetadataTypeAdapter();
			}
			@Override
			public Adapter caseReportPaperType(ReportPaperType object) {
				return createReportPaperTypeAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseReviewDateType(ReviewDateType object) {
				return createReviewDateTypeAdapter();
			}
			@Override
			public Adapter caseSaComponentType(SaComponentType object) {
				return createSaComponentTypeAdapter();
			}
			@Override
			public Adapter caseScnPoliciesType(ScnPoliciesType object) {
				return createScnPoliciesTypeAdapter();
			}
			@Override
			public Adapter caseScnPolicyRefType(ScnPolicyRefType object) {
				return createScnPolicyRefTypeAdapter();
			}
			@Override
			public Adapter caseScnPolicySetType(ScnPolicySetType object) {
				return createScnPolicySetTypeAdapter();
			}
			@Override
			public Adapter caseSeriesMetadataType(SeriesMetadataType object) {
				return createSeriesMetadataTypeAdapter();
			}
			@Override
			public Adapter caseSetMetadataType(SetMetadataType object) {
				return createSetMetadataTypeAdapter();
			}
			@Override
			public Adapter caseStandardMetadataType(StandardMetadataType object) {
				return createStandardMetadataTypeAdapter();
			}
			@Override
			public Adapter caseStandardsBodyType(StandardsBodyType object) {
				return createStandardsBodyTypeAdapter();
			}
			@Override
			public Adapter caseStandardType(StandardType object) {
				return createStandardTypeAdapter();
			}
			@Override
			public Adapter caseStdAltAsPublishedType(StdAltAsPublishedType object) {
				return createStdAltAsPublishedTypeAdapter();
			}
			@Override
			public Adapter caseStdAsPublishedType(StdAsPublishedType object) {
				return createStdAsPublishedTypeAdapter();
			}
			@Override
			public Adapter caseStdDesignatorT(StdDesignatorT object) {
				return createStdDesignatorTAdapter();
			}
			@Override
			public Adapter caseStdSetDesignatorType(StdSetDesignatorType object) {
				return createStdSetDesignatorTypeAdapter();
			}
			@Override
			public Adapter caseStdUndatedDesignatorType(StdUndatedDesignatorType object) {
				return createStdUndatedDesignatorTypeAdapter();
			}
			@Override
			public Adapter caseStringNameType(StringNameType object) {
				return createStringNameTypeAdapter();
			}
			@Override
			public Adapter caseSubtitleType(SubtitleType object) {
				return createSubtitleTypeAdapter();
			}
			@Override
			public Adapter caseTitlesType(TitlesType object) {
				return createTitlesTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseUnassignedContentType(UnassignedContentType object) {
				return createUnassignedContentTypeAdapter();
			}
			@Override
			public Adapter caseUnstructuredCitationType(UnstructuredCitationType object) {
				return createUnstructuredCitationTypeAdapter();
			}
			@Override
			public Adapter caseUpdateDateType(UpdateDateType object) {
				return createUpdateDateTypeAdapter();
			}
			@Override
			public Adapter caseUpdatesType(UpdatesType object) {
				return createUpdatesTypeAdapter();
			}
			@Override
			public Adapter caseUpdateType(UpdateType object) {
				return createUpdateTypeAdapter();
			}
			@Override
			public Adapter caseXrefFaces(XrefFaces object) {
				return createXrefFacesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.AcceptanceDateType <em>Acceptance Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.AcceptanceDateType
	 * @generated
	 */
	public Adapter createAcceptanceDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.AltNameType <em>Alt Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.AltNameType
	 * @generated
	 */
	public Adapter createAltNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.AnonymousType <em>Anonymous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.AnonymousType
	 * @generated
	 */
	public Adapter createAnonymousTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ApprovalDateType <em>Approval Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ApprovalDateType
	 * @generated
	 */
	public Adapter createApprovalDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ArchiveLocationsType <em>Archive Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ArchiveLocationsType
	 * @generated
	 */
	public Adapter createArchiveLocationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ArchiveType <em>Archive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ArchiveType
	 * @generated
	 */
	public Adapter createArchiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.AssertionType <em>Assertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.AssertionType
	 * @generated
	 */
	public Adapter createAssertionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.AType
	 * @generated
	 */
	public Adapter createATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.BodyType
	 * @generated
	 */
	public Adapter createBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.BookMetadataType <em>Book Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.BookMetadataType
	 * @generated
	 */
	public Adapter createBookMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.BookSeriesMetadataType <em>Book Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.BookSeriesMetadataType
	 * @generated
	 */
	public Adapter createBookSeriesMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.BookSetMetadataType <em>Book Set Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.BookSetMetadataType
	 * @generated
	 */
	public Adapter createBookSetMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.BookType
	 * @generated
	 */
	public Adapter createBookTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CitationListType <em>Citation List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CitationListType
	 * @generated
	 */
	public Adapter createCitationListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CitationT <em>Citation T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CitationT
	 * @generated
	 */
	public Adapter createCitationTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CitationType <em>Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CitationType
	 * @generated
	 */
	public Adapter createCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CompetingInterestStatementType <em>Competing Interest Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CompetingInterestStatementType
	 * @generated
	 */
	public Adapter createCompetingInterestStatementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ComponentListType <em>Component List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ComponentListType
	 * @generated
	 */
	public Adapter createComponentListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ConferenceDateType <em>Conference Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ConferenceDateType
	 * @generated
	 */
	public Adapter createConferenceDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ConferencePaperType <em>Conference Paper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ConferencePaperType
	 * @generated
	 */
	public Adapter createConferencePaperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ConferenceType <em>Conference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ConferenceType
	 * @generated
	 */
	public Adapter createConferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ContentDateType <em>Content Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ContentDateType
	 * @generated
	 */
	public Adapter createContentDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ContentItemType <em>Content Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ContentItemType
	 * @generated
	 */
	public Adapter createContentItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ContributorsType <em>Contributors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ContributorsType
	 * @generated
	 */
	public Adapter createContributorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CreationDateType <em>Creation Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CreationDateType
	 * @generated
	 */
	public Adapter createCreationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CrossmarkDomainsType <em>Crossmark Domains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CrossmarkDomainsType
	 * @generated
	 */
	public Adapter createCrossmarkDomainsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CrossmarkDomainType <em>Crossmark Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CrossmarkDomainType
	 * @generated
	 */
	public Adapter createCrossmarkDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CrossmarkType <em>Crossmark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CrossmarkType
	 * @generated
	 */
	public Adapter createCrossmarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.CustomMetadataType <em>Custom Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.CustomMetadataType
	 * @generated
	 */
	public Adapter createCustomMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DatabaseDateType <em>Database Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DatabaseDateType
	 * @generated
	 */
	public Adapter createDatabaseDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DatabaseMetadataType <em>Database Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DatabaseMetadataType
	 * @generated
	 */
	public Adapter createDatabaseMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DatabaseType
	 * @generated
	 */
	public Adapter createDatabaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DatasetType
	 * @generated
	 */
	public Adapter createDatasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DateT <em>Date T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DateT
	 * @generated
	 */
	public Adapter createDateTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DegreesType <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DegreesType
	 * @generated
	 */
	public Adapter createDegreesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DepositorType <em>Depositor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DepositorType
	 * @generated
	 */
	public Adapter createDepositorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DesignatorsType <em>Designators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DesignatorsType
	 * @generated
	 */
	public Adapter createDesignatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DissertationType <em>Dissertation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DissertationType
	 * @generated
	 */
	public Adapter createDissertationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DoiBatchType <em>Doi Batch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DoiBatchType
	 * @generated
	 */
	public Adapter createDoiBatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.DoiDataType <em>Doi Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.DoiDataType
	 * @generated
	 */
	public Adapter createDoiDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.EventMetadataType <em>Event Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.EventMetadataType
	 * @generated
	 */
	public Adapter createEventMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.FormatType
	 * @generated
	 */
	public Adapter createFormatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.HeadType <em>Head Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.HeadType
	 * @generated
	 */
	public Adapter createHeadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.IdentifierType
	 * @generated
	 */
	public Adapter createIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.InstitutionType <em>Institution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.InstitutionType
	 * @generated
	 */
	public Adapter createInstitutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.IntentStatementType <em>Intent Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.IntentStatementType
	 * @generated
	 */
	public Adapter createIntentStatementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.IsbnType <em>Isbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.IsbnType
	 * @generated
	 */
	public Adapter createIsbnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.IssnType <em>Issn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.IssnType
	 * @generated
	 */
	public Adapter createIssnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ItemNumberType <em>Item Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ItemNumberType
	 * @generated
	 */
	public Adapter createItemNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.JournalArticleType <em>Journal Article Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.JournalArticleType
	 * @generated
	 */
	public Adapter createJournalArticleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.JournalIssueType <em>Journal Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.JournalIssueType
	 * @generated
	 */
	public Adapter createJournalIssueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.JournalMetadataType <em>Journal Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.JournalMetadataType
	 * @generated
	 */
	public Adapter createJournalMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.JournalType <em>Journal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.JournalType
	 * @generated
	 */
	public Adapter createJournalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.JournalVolumeType <em>Journal Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.JournalVolumeType
	 * @generated
	 */
	public Adapter createJournalVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.NameType1 <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.NameType1
	 * @generated
	 */
	public Adapter createNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.NoisbnType <em>Noisbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.NoisbnType
	 * @generated
	 */
	public Adapter createNoisbnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ORCIDType <em>ORCID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ORCIDType
	 * @generated
	 */
	public Adapter createORCIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.OrganizationType
	 * @generated
	 */
	public Adapter createOrganizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.OriginalLanguageTitleType <em>Original Language Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.OriginalLanguageTitleType
	 * @generated
	 */
	public Adapter createOriginalLanguageTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PagesType <em>Pages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PagesType
	 * @generated
	 */
	public Adapter createPagesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PeerReviewType <em>Peer Review Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PeerReviewType
	 * @generated
	 */
	public Adapter createPeerReviewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PendingPublicationType <em>Pending Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PendingPublicationType
	 * @generated
	 */
	public Adapter createPendingPublicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PersonNameType
	 * @generated
	 */
	public Adapter createPersonNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PostedContentType <em>Posted Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PostedContentType
	 * @generated
	 */
	public Adapter createPostedContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PostedDateType <em>Posted Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PostedDateType
	 * @generated
	 */
	public Adapter createPostedDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PrefixType <em>Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PrefixType
	 * @generated
	 */
	public Adapter createPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ProceedingsMetadataType <em>Proceedings Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ProceedingsMetadataType
	 * @generated
	 */
	public Adapter createProceedingsMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ProceedingsSeriesMetadataType <em>Proceedings Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ProceedingsSeriesMetadataType
	 * @generated
	 */
	public Adapter createProceedingsSeriesMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PublicationDateType <em>Publication Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PublicationDateType
	 * @generated
	 */
	public Adapter createPublicationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PublicationType <em>Publication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PublicationType
	 * @generated
	 */
	public Adapter createPublicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PublisherItemType <em>Publisher Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PublisherItemType
	 * @generated
	 */
	public Adapter createPublisherItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.PublisherType <em>Publisher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.PublisherType
	 * @generated
	 */
	public Adapter createPublisherTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ReportPaperMetadataType <em>Report Paper Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ReportPaperMetadataType
	 * @generated
	 */
	public Adapter createReportPaperMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ReportPaperSeriesMetadataType <em>Report Paper Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ReportPaperSeriesMetadataType
	 * @generated
	 */
	public Adapter createReportPaperSeriesMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ReportPaperType <em>Report Paper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ReportPaperType
	 * @generated
	 */
	public Adapter createReportPaperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ReviewDateType <em>Review Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ReviewDateType
	 * @generated
	 */
	public Adapter createReviewDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.SaComponentType <em>Sa Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.SaComponentType
	 * @generated
	 */
	public Adapter createSaComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ScnPoliciesType <em>Scn Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ScnPoliciesType
	 * @generated
	 */
	public Adapter createScnPoliciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ScnPolicyRefType <em>Scn Policy Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ScnPolicyRefType
	 * @generated
	 */
	public Adapter createScnPolicyRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.ScnPolicySetType <em>Scn Policy Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.ScnPolicySetType
	 * @generated
	 */
	public Adapter createScnPolicySetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.SeriesMetadataType <em>Series Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.SeriesMetadataType
	 * @generated
	 */
	public Adapter createSeriesMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.SetMetadataType <em>Set Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.SetMetadataType
	 * @generated
	 */
	public Adapter createSetMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StandardMetadataType <em>Standard Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StandardMetadataType
	 * @generated
	 */
	public Adapter createStandardMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StandardsBodyType <em>Standards Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StandardsBodyType
	 * @generated
	 */
	public Adapter createStandardsBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StandardType <em>Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StandardType
	 * @generated
	 */
	public Adapter createStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StdAltAsPublishedType <em>Std Alt As Published Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StdAltAsPublishedType
	 * @generated
	 */
	public Adapter createStdAltAsPublishedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StdAsPublishedType <em>Std As Published Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StdAsPublishedType
	 * @generated
	 */
	public Adapter createStdAsPublishedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StdDesignatorT <em>Std Designator T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StdDesignatorT
	 * @generated
	 */
	public Adapter createStdDesignatorTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StdSetDesignatorType <em>Std Set Designator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StdSetDesignatorType
	 * @generated
	 */
	public Adapter createStdSetDesignatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StdUndatedDesignatorType <em>Std Undated Designator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StdUndatedDesignatorType
	 * @generated
	 */
	public Adapter createStdUndatedDesignatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.StringNameType <em>String Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.StringNameType
	 * @generated
	 */
	public Adapter createStringNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.SubtitleType <em>Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.SubtitleType
	 * @generated
	 */
	public Adapter createSubtitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.TitlesType <em>Titles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.TitlesType
	 * @generated
	 */
	public Adapter createTitlesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.UnassignedContentType <em>Unassigned Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.UnassignedContentType
	 * @generated
	 */
	public Adapter createUnassignedContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.UnstructuredCitationType <em>Unstructured Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.UnstructuredCitationType
	 * @generated
	 */
	public Adapter createUnstructuredCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.UpdateDateType <em>Update Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.UpdateDateType
	 * @generated
	 */
	public Adapter createUpdateDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.UpdatesType <em>Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.UpdatesType
	 * @generated
	 */
	public Adapter createUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.UpdateType
	 * @generated
	 */
	public Adapter createUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.crossref.schema._4._4.XrefFaces <em>Xref Faces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.crossref.schema._4._4.XrefFaces
	 * @generated
	 */
	public Adapter createXrefFacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_4AdapterFactory
