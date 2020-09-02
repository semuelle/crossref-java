/**
 */
package org.crossref.schema._4._4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pages Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.PagesType#getFirstPage <em>First Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PagesType#getLastPage <em>Last Page</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.PagesType#getOtherPages <em>Other Pages</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getPagesType()
 * @model extendedMetaData="name='pages_._type' kind='elementOnly'"
 * @generated
 */
public interface PagesType extends EObject {
	/**
	 * Returns the value of the '<em><b>First Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First page number where an entity is located. Data may be alpha,
	 * 				numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Page</em>' attribute.
	 * @see #setFirstPage(String)
	 * @see org.crossref.schema._4._4._4Package#getPagesType_FirstPage()
	 * @model dataType="org.crossref.schema._4._4.FirstPageType" required="true"
	 *        extendedMetaData="kind='element' name='first_page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstPage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PagesType#getFirstPage <em>First Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page</em>' attribute.
	 * @see #getFirstPage()
	 * @generated
	 */
	void setFirstPage(String value);

	/**
	 * Returns the value of the '<em><b>Last Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last page number of an entity. last_page should not be used when
	 * 				the last page number is the same as the first page number (i.e. when the entire
	 * 				entity fits on one page). Do not include punctuation for a page range in last_page.
	 * 				If the entity has non-contiguous paging, use last_page for the last page of the
	 * 				first range and place all other page information into other_pages. Data may be
	 * 				alpha, numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Page</em>' attribute.
	 * @see #setLastPage(String)
	 * @see org.crossref.schema._4._4._4Package#getPagesType_LastPage()
	 * @model dataType="org.crossref.schema._4._4.LastPageType"
	 *        extendedMetaData="kind='element' name='last_page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastPage();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PagesType#getLastPage <em>Last Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page</em>' attribute.
	 * @see #getLastPage()
	 * @generated
	 */
	void setLastPage(String value);

	/**
	 * Returns the value of the '<em><b>Other Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to capture additional page information when items do not
	 * 				encompass contiguous page ranges. When an entity has non-contiguous page
	 * 				information, you should capture the first page range in first_page and last_page.
	 * 				Any additional page information should be captured in other_pages. You should
	 * 				include commas or hyphens to express discrete pages or page ranges. endash entities
	 * 				should be converted to ASCII hyphens. Spaces should not be included. Note that
	 * 				punctuation should never appear in first_page and last_page. Data may be alpha,
	 * 				numeric or a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Pages</em>' attribute.
	 * @see #setOtherPages(String)
	 * @see org.crossref.schema._4._4._4Package#getPagesType_OtherPages()
	 * @model dataType="org.crossref.schema._4._4.OtherPagesType"
	 *        extendedMetaData="kind='element' name='other_pages' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOtherPages();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.PagesType#getOtherPages <em>Other Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Pages</em>' attribute.
	 * @see #getOtherPages()
	 * @generated
	 */
	void setOtherPages(String value);

} // PagesType
