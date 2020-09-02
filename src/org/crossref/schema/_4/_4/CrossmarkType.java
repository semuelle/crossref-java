/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crossmark Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkVersion <em>Crossmark Version</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkPolicy <em>Crossmark Policy</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkDomains <em>Crossmark Domains</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkType#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkType#getUpdates <em>Updates</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkType#getCustomMetadata <em>Custom Metadata</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCrossmarkType()
 * @model extendedMetaData="name='crossmark_._type' kind='elementOnly'"
 * @generated
 */
public interface CrossmarkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Crossmark Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossmark Version</em>' attribute.
	 * @see #setCrossmarkVersion(String)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkType_CrossmarkVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='crossmark_version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCrossmarkVersion();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkVersion <em>Crossmark Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Version</em>' attribute.
	 * @see #getCrossmarkVersion()
	 * @generated
	 */
	void setCrossmarkVersion(String value);

	/**
	 * Returns the value of the '<em><b>Crossmark Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A DOI which points to a publisher's CrossMark policy document.
	 * 				Publishers might have different policies for different
	 * 				publications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Policy</em>' attribute.
	 * @see #setCrossmarkPolicy(String)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkType_CrossmarkPolicy()
	 * @model dataType="org.crossref.schema._4._4.DoiT"
	 *        extendedMetaData="kind='element' name='crossmark_policy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCrossmarkPolicy();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkType#getCrossmarkPolicy <em>Crossmark Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Policy</em>' attribute.
	 * @see #getCrossmarkPolicy()
	 * @generated
	 */
	void setCrossmarkPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Crossmark Domains</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.CrossmarkDomainsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for crossmark_domain. A list of domains where the
	 * 				publisher maintains updates and corrections to their content. Minimally, one of
	 * 				these should include the Internet domain name of the publisher's web site(s), but
	 * 				the publisher might also decide to include 3rd party aggregators (e.g. Ebsco,
	 * 				IngentaConnect) or archives with which the publisher has agreements to update the
	 * 				content 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Domains</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkType_CrossmarkDomains()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossmark_domains' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrossmarkDomainsType> getCrossmarkDomains();

	/**
	 * Returns the value of the '<em><b>Crossmark Domain Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some publishers encourage broad third party hosting of
	 * 							the publisher's content. Other publishers do not. And still others vary
	 * 							their policy depending on whether a particular article has been
	 * 							published under an OA policy or not. This boolean flag allows the
	 * 							publisher to indicate whether the Crossmarked content will only
	 * 							legitimately be updated on the Crossmark domain (true) or whether the
	 * 							publisher encourages updating the content on other sites as well
	 * 							(false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Domain Exclusive</em>' attribute.
	 * @see #isSetCrossmarkDomainExclusive()
	 * @see #unsetCrossmarkDomainExclusive()
	 * @see #setCrossmarkDomainExclusive(boolean)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkType_CrossmarkDomainExclusive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='crossmark_domain_exclusive' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCrossmarkDomainExclusive();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkType#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossmark Domain Exclusive</em>' attribute.
	 * @see #isSetCrossmarkDomainExclusive()
	 * @see #unsetCrossmarkDomainExclusive()
	 * @see #isCrossmarkDomainExclusive()
	 * @generated
	 */
	void setCrossmarkDomainExclusive(boolean value);

	/**
	 * Unsets the value of the '{@link org.crossref.schema._4._4.CrossmarkType#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossmarkDomainExclusive()
	 * @see #isCrossmarkDomainExclusive()
	 * @see #setCrossmarkDomainExclusive(boolean)
	 * @generated
	 */
	void unsetCrossmarkDomainExclusive();

	/**
	 * Returns whether the value of the '{@link org.crossref.schema._4._4.CrossmarkType#isCrossmarkDomainExclusive <em>Crossmark Domain Exclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crossmark Domain Exclusive</em>' attribute is set.
	 * @see #unsetCrossmarkDomainExclusive()
	 * @see #isCrossmarkDomainExclusive()
	 * @see #setCrossmarkDomainExclusive(boolean)
	 * @generated
	 */
	boolean isSetCrossmarkDomainExclusive();

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional element. A document might provide updates (e.g. corrections,
	 * 				clarifications, retractions) to several other documents. When this is the case, the
	 * 				DOIs of the documents that are being *updated* should be listed
	 * 				here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference.
	 * @see #setUpdates(UpdatesType)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkType_Updates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updates' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatesType getUpdates();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkType#getUpdates <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updates</em>' containment reference.
	 * @see #getUpdates()
	 * @generated
	 */
	void setUpdates(UpdatesType value);

	/**
	 * Returns the value of the '<em><b>Custom Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional element. Publishers are encouraged to provided any
	 * 				non-bibliographical metadata that they feel might help the researcher evaluate and
	 * 				make better use of the content that the Crossmark record refers to. For example,
	 * 				publishers might want to provide funding information, clinical trial numbers,
	 * 				information about the peer-review process or a summary of the publication history of
	 * 				the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Metadata</em>' containment reference.
	 * @see #setCustomMetadata(CustomMetadataType)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkType_CustomMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom_metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomMetadataType getCustomMetadata();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkType#getCustomMetadata <em>Custom Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Metadata</em>' containment reference.
	 * @see #getCustomMetadata()
	 * @generated
	 */
	void setCustomMetadata(CustomMetadataType value);

} // CrossmarkType
