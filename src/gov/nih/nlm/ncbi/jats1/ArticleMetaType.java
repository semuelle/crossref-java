/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article Meta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleId <em>Article Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleVersion <em>Article Version</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleVersionAlternatives <em>Article Version Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleCategories <em>Article Categories</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getTitleGroup <em>Title Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getContribGroup <em>Contrib Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getAff <em>Aff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getAffAlternatives <em>Aff Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getAuthorNotes <em>Author Notes</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPubDateClass <em>Pub Date Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPubDate <em>Pub Date</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPubDateNotAvailable <em>Pub Date Not Available</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getVolume <em>Volume</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getVolumeId <em>Volume Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getVolumeSeries <em>Volume Series</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIssue <em>Issue</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIssueId <em>Issue Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIssueTitle <em>Issue Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIssueSponsor <em>Issue Sponsor</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIssuePart <em>Issue Part</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getVolumeIssueGroup <em>Volume Issue Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getFpage <em>Fpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getLpage <em>Lpage</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPageRange <em>Page Range</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getElocationId <em>Elocation Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getEmail <em>Email</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getExtLink <em>Ext Link</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getUri <em>Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getProduct <em>Product</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getHistory <em>History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPubHistory <em>Pub History</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getSelfUri <em>Self Uri</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getRelatedArticleClass <em>Related Article Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getRelatedArticle <em>Related Article</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getAbstractClass <em>Abstract Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getTransAbstract <em>Trans Abstract</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getKwdGroupClass <em>Kwd Group Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getKwdGroup <em>Kwd Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getFundingGroup <em>Funding Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getSupportGroup <em>Support Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getConference <em>Conference</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getCounts <em>Counts</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getCustomMetaGroup <em>Custom Meta Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType()
 * @model extendedMetaData="name='article-meta_._type' kind='elementOnly'"
 * @generated
 */
public interface ArticleMetaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Article Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ArticleIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ArticleId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArticleIdType> getArticleId();

	/**
	 * Returns the value of the '<em><b>Article Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Version</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Version</em>' containment reference.
	 * @see #setArticleVersion(ArticleVersionType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ArticleVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-version' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleVersionType getArticleVersion();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleVersion <em>Article Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Version</em>' containment reference.
	 * @see #getArticleVersion()
	 * @generated
	 */
	void setArticleVersion(ArticleVersionType value);

	/**
	 * Returns the value of the '<em><b>Article Version Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Version Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Version Alternatives</em>' containment reference.
	 * @see #setArticleVersionAlternatives(ArticleVersionAlternativesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ArticleVersionAlternatives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-version-alternatives' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleVersionAlternativesType getArticleVersionAlternatives();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleVersionAlternatives <em>Article Version Alternatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Version Alternatives</em>' containment reference.
	 * @see #getArticleVersionAlternatives()
	 * @generated
	 */
	void setArticleVersionAlternatives(ArticleVersionAlternativesType value);

	/**
	 * Returns the value of the '<em><b>Article Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Article Grouping Data</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Article Categories</em>' containment reference.
	 * @see #setArticleCategories(ArticleCategoriesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ArticleCategories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='article-categories' namespace='##targetNamespace'"
	 * @generated
	 */
	ArticleCategoriesType getArticleCategories();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getArticleCategories <em>Article Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article Categories</em>' containment reference.
	 * @see #getArticleCategories()
	 * @generated
	 */
	void setArticleCategories(ArticleCategoriesType value);

	/**
	 * Returns the value of the '<em><b>Title Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title Group</em>' containment reference.
	 * @see #setTitleGroup(TitleGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_TitleGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title-group' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleGroupType getTitleGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getTitleGroup <em>Title Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Group</em>' containment reference.
	 * @see #getTitleGroup()
	 * @generated
	 */
	void setTitleGroup(TitleGroupType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Contrib Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ContribGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Contributor Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contrib Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ContribGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contrib-group' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<ContribGroupType> getContribGroup();

	/**
	 * Returns the value of the '<em><b>Aff</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AffType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Affiliation</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aff</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Aff()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aff' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<AffType> getAff();

	/**
	 * Returns the value of the '<em><b>Aff Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AffAlternativesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Affiliation Alternatives</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aff Alternatives</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_AffAlternatives()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aff-alternatives' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<AffAlternativesType> getAffAlternatives();

	/**
	 * Returns the value of the '<em><b>Author Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Author Note Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Notes</em>' containment reference.
	 * @see #setAuthorNotes(AuthorNotesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_AuthorNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author-notes' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorNotesType getAuthorNotes();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getAuthorNotes <em>Author Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Notes</em>' containment reference.
	 * @see #getAuthorNotes()
	 * @generated
	 */
	void setAuthorNotes(AuthorNotesType value);

	/**
	 * Returns the value of the '<em><b>Pub Date Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Date Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_PubDateClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PubDateClass:10'"
	 * @generated
	 */
	FeatureMap getPubDateClass();

	/**
	 * Returns the value of the '<em><b>Pub Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.PubDateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication Date</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Date</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_PubDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pub-date' namespace='##targetNamespace' group='#PubDateClass:10'"
	 * @generated
	 */
	EList<PubDateType> getPubDate();

	/**
	 * Returns the value of the '<em><b>Pub Date Not Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Date Not Available Flag</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub Date Not Available</em>' containment reference.
	 * @see #setPubDateNotAvailable(PubDateNotAvailableType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_PubDateNotAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pub-date-not-available' namespace='##targetNamespace'"
	 * @generated
	 */
	PubDateNotAvailableType getPubDateNotAvailable();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPubDateNotAvailable <em>Pub Date Not Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Date Not Available</em>' containment reference.
	 * @see #getPubDateNotAvailable()
	 * @generated
	 */
	void setPubDateNotAvailable(PubDateNotAvailableType value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VolumeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Volume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VolumeType> getVolume();

	/**
	 * Returns the value of the '<em><b>Volume Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VolumeIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_VolumeId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volume-id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VolumeIdType> getVolumeId();

	/**
	 * Returns the value of the '<em><b>Volume Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Volume Series</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Series</em>' containment reference.
	 * @see #setVolumeSeries(VolumeSeriesType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_VolumeSeries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volume-series' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeSeriesType getVolumeSeries();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getVolumeSeries <em>Volume Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Series</em>' containment reference.
	 * @see #getVolumeSeries()
	 * @generated
	 */
	void setVolumeSeries(VolumeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Number</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Issue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IssueType> getIssue();

	/**
	 * Returns the value of the '<em><b>Issue Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Id</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_IssueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issue-id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IssueIdType> getIssueId();

	/**
	 * Returns the value of the '<em><b>Issue Title</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Title</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_IssueTitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issue-title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IssueTitleType> getIssueTitle();

	/**
	 * Returns the value of the '<em><b>Issue Sponsor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IssueSponsorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Title</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Sponsor</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_IssueSponsor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issue-sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IssueSponsorType> getIssueSponsor();

	/**
	 * Returns the value of the '<em><b>Issue Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Issue Part</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Part</em>' containment reference.
	 * @see #setIssuePart(IssuePartType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_IssuePart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issue-part' namespace='##targetNamespace'"
	 * @generated
	 */
	IssuePartType getIssuePart();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getIssuePart <em>Issue Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Part</em>' containment reference.
	 * @see #getIssuePart()
	 * @generated
	 */
	void setIssuePart(IssuePartType value);

	/**
	 * Returns the value of the '<em><b>Volume Issue Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.VolumeIssueGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Title Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Issue Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_VolumeIssueGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volume-issue-group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VolumeIssueGroupType> getVolumeIssueGroup();

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.IsbnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Isbn</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isbn</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Isbn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IsbnType> getIsbn();

	/**
	 * Returns the value of the '<em><b>Supplement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement</em>' containment reference.
	 * @see #setSupplement(SupplementType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Supplement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplement' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplementType getSupplement();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getSupplement <em>Supplement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplement</em>' containment reference.
	 * @see #getSupplement()
	 * @generated
	 */
	void setSupplement(SupplementType value);

	/**
	 * Returns the value of the '<em><b>Fpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>First Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fpage</em>' containment reference.
	 * @see #setFpage(FpageType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Fpage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpage' namespace='##targetNamespace'"
	 * @generated
	 */
	FpageType getFpage();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getFpage <em>Fpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpage</em>' containment reference.
	 * @see #getFpage()
	 * @generated
	 */
	void setFpage(FpageType value);

	/**
	 * Returns the value of the '<em><b>Lpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Last Page</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lpage</em>' containment reference.
	 * @see #setLpage(LpageType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Lpage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lpage' namespace='##targetNamespace'"
	 * @generated
	 */
	LpageType getLpage();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getLpage <em>Lpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lpage</em>' containment reference.
	 * @see #getLpage()
	 * @generated
	 */
	void setLpage(LpageType value);

	/**
	 * Returns the value of the '<em><b>Page Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Page Ranges</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Range</em>' containment reference.
	 * @see #setPageRange(PageRangeType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_PageRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page-range' namespace='##targetNamespace'"
	 * @generated
	 */
	PageRangeType getPageRange();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPageRange <em>Page Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Range</em>' containment reference.
	 * @see #getPageRange()
	 * @generated
	 */
	void setPageRange(PageRangeType value);

	/**
	 * Returns the value of the '<em><b>Elocation Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Electronic Location Identifier</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elocation Id</em>' containment reference.
	 * @see #setElocationId(ElocationIdType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ElocationId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elocation-id' namespace='##targetNamespace'"
	 * @generated
	 */
	ElocationIdType getElocationId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getElocationId <em>Elocation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elocation Id</em>' containment reference.
	 * @see #getElocationId()
	 * @generated
	 */
	void setElocationId(ElocationIdType value);

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:28'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.EmailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Email Address</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Email()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace' group='#group:28'"
	 * @generated
	 */
	EList<EmailType> getEmail();

	/**
	 * Returns the value of the '<em><b>Ext Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ExtLinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>External Link</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Link</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_ExtLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ext-link' namespace='##targetNamespace' group='#group:28'"
	 * @generated
	 */
	EList<ExtLinkType> getExtLink();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.UriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:28'"
	 * @generated
	 */
	EList<UriType> getUri();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ProductType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Product Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Product()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace' group='#group:28'"
	 * @generated
	 */
	EList<ProductType> getProduct();

	/**
	 * Returns the value of the '<em><b>Supplementary Material</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Supplementary Material</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplementary Material</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_SupplementaryMaterial()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supplementary-material' namespace='##targetNamespace' group='#group:28'"
	 * @generated
	 */
	EList<SupplementaryMaterialType> getSupplementaryMaterial();

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>History: Document History</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(HistoryType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_History()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='history' namespace='##targetNamespace'"
	 * @generated
	 */
	HistoryType getHistory();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryType value);

	/**
	 * Returns the value of the '<em><b>Pub History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Publication History</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pub History</em>' containment reference.
	 * @see #setPubHistory(PubHistoryType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_PubHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pub-history' namespace='##targetNamespace'"
	 * @generated
	 */
	PubHistoryType getPubHistory();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPubHistory <em>Pub History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub History</em>' containment reference.
	 * @see #getPubHistory()
	 * @generated
	 */
	void setPubHistory(PubHistoryType value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Permissions</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(PermissionsType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Permissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionsType getPermissions();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(PermissionsType value);

	/**
	 * Returns the value of the '<em><b>Self Uri</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SelfUriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Uri For This Same Article Online</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Uri</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_SelfUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='self-uri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SelfUriType> getSelfUri();

	/**
	 * Returns the value of the '<em><b>Related Article Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Article Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_RelatedArticleClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RelatedArticleClass:38'"
	 * @generated
	 */
	FeatureMap getRelatedArticleClass();

	/**
	 * Returns the value of the '<em><b>Related Article</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RelatedArticleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Related Article Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Article</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_RelatedArticle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related-article' namespace='##targetNamespace' group='#RelatedArticleClass:38'"
	 * @generated
	 */
	EList<RelatedArticleType> getRelatedArticle();

	/**
	 * Returns the value of the '<em><b>Related Object</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.RelatedObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Related Object Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Object</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_RelatedObject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related-object' namespace='##targetNamespace' group='#RelatedArticleClass:38'"
	 * @generated
	 */
	EList<RelatedObjectType> getRelatedObject();

	/**
	 * Returns the value of the '<em><b>Abstract Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_AbstractClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractClass:41'"
	 * @generated
	 */
	FeatureMap getAbstractClass();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Abstract</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Abstract()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace' group='#AbstractClass:41'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Trans Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.TransAbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Translated Abstract</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trans Abstract</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_TransAbstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trans-abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransAbstractType> getTransAbstract();

	/**
	 * Returns the value of the '<em><b>Kwd Group Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kwd Group Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_KwdGroupClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='KwdGroupClass:44'"
	 * @generated
	 */
	FeatureMap getKwdGroupClass();

	/**
	 * Returns the value of the '<em><b>Kwd Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.KwdGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Keyword Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kwd Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_KwdGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kwd-group' namespace='##targetNamespace' group='#KwdGroupClass:44'"
	 * @generated
	 */
	EList<KwdGroupType> getKwdGroup();

	/**
	 * Returns the value of the '<em><b>Funding Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.FundingGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Funding Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funding Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_FundingGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='funding-group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FundingGroupType> getFundingGroup();

	/**
	 * Returns the value of the '<em><b>Support Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.SupportGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Support Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Group</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_SupportGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='support-group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportGroupType> getSupportGroup();

	/**
	 * Returns the value of the '<em><b>Conference</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.ConferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Conference Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conference</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Conference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConferenceType> getConference();

	/**
	 * Returns the value of the '<em><b>Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Counts</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counts</em>' containment reference.
	 * @see #setCounts(CountsType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Counts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='counts' namespace='##targetNamespace'"
	 * @generated
	 */
	CountsType getCounts();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getCounts <em>Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counts</em>' containment reference.
	 * @see #getCounts()
	 * @generated
	 */
	void setCounts(CountsType value);

	/**
	 * Returns the value of the '<em><b>Custom Meta Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Custom Metadata Group</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Meta Group</em>' containment reference.
	 * @see #setCustomMetaGroup(CustomMetaGroupType)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_CustomMetaGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom-meta-group' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomMetaGroupType getCustomMetaGroup();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getCustomMetaGroup <em>Custom Meta Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Meta Group</em>' containment reference.
	 * @see #getCustomMetaGroup()
	 * @generated
	 */
	void setCustomMetaGroup(CustomMetaGroupType value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *          
	 *       
	 *     <h3>base (as an attribute name)</h3>
	 *           
	 *     <p>
	 *        denotes an attribute whose value
	 *        provides a URI to be used as the base for interpreting any
	 *        relative URIs in the scope of the element on which it
	 *        appears; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML Base specification.</p>
	 *          
	 *      
	 *     <p>
	 *             See 
	 *       <a href="http://www.w3.org/TR/xmlbase/">http://www.w3.org/TR/xmlbase/</a>
	 *             for information about this attribute.
	 *      
	 *     </p>
	 *         
	 *   </div>
	 *      
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getArticleMetaType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.ArticleMetaType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ArticleMetaType
