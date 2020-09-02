/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crossmark Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkDomainType#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.CrossmarkDomainType#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getCrossmarkDomainType()
 * @model extendedMetaData="name='crossmark_domain_._type' kind='elementOnly'"
 * @generated
 */
public interface CrossmarkDomainType extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required element. This should be a simple Internet domain name or
	 * 				subdomain name (e.g. www.psychoceramics.org or psychoceramics.org). It is used to
	 * 				identify when a referring URL is coming from a CrossMark domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkDomainType_Domain()
	 * @model dataType="org.crossref.schema._4._4.CmDomain" required="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkDomainType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional element. The filter element is used to disambiguate content
	 * 				in situations where multiple publishers share the same host (e.g. when on an
	 * 				aggregated platform). It should contain a substring of the path that can be used to
	 * 				uniquely identify a publisher's or publication's content. For instance, using the
	 * 				string "alpsp" here would help the CrossMark system distinguish between ALPSP
	 * 				publications on the ingentaconnect host and other publications on the same
	 * 				host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.crossref.schema._4._4._4Package#getCrossmarkDomainType_Filter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.CrossmarkDomainType#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // CrossmarkDomainType
