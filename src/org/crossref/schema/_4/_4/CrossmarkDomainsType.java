/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crossmark Domains Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkDomainsType#getCrossmarkDomain <em>Crossmark Domain</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCrossmarkDomainsType()
 * @model extendedMetaData="name='crossmark_domains_._type' kind='elementOnly'"
 * @generated
 */
public interface CrossmarkDomainsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Crossmark Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.CrossmarkDomainType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This should be a simple Internet domain name or subdomain name (e.g.
	 * 				www.psychoceramics.org or psychoceramics.org). It is used to identify when a
	 * 				referring URL is coming from a CrossMark domain. A "crossmark_domain" is made up of
	 * 				two subelements; a "domain" and a "filter". The domain is required but the filter is
	 * 				optional and is only needed for use in situations where content from multiple
	 * 				publishers/publications is on the same host with the same domain name (e.g. an
	 * 				aggregator) and one needs to use the referrer's URI "path" to further determine
	 * 				whether the content in a crossmark domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crossmark Domain</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkDomainsType_CrossmarkDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='crossmark_domain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrossmarkDomainType> getCrossmarkDomain();

} // CrossmarkDomainsType
