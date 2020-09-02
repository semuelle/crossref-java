/**
 */
package gov.nih.nlm.ncbi.jats1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.niso.schemas.ali._1._0.FreeToReadType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getCopyrightStatement <em>Copyright Statement</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getCopyrightYear <em>Copyright Year</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getCopyrightHolder <em>Copyright Holder</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getLicenseClass <em>License Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getLicense <em>License</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType()
 * @model extendedMetaData="name='permissions_._type' kind='elementOnly'"
 * @generated
 */
public interface PermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Copyright Statement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CopyrightStatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Copyright Statement</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Statement</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_CopyrightStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CopyrightStatementType> getCopyrightStatement();

	/**
	 * Returns the value of the '<em><b>Copyright Year</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CopyrightYearType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Copyright Year</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Year</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_CopyrightYear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright-year' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CopyrightYearType> getCopyrightYear();

	/**
	 * Returns the value of the '<em><b>Copyright Holder</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.CopyrightHolderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>Copyright Holder</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Holder</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_CopyrightHolder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright-holder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CopyrightHolderType> getCopyrightHolder();

	/**
	 * Returns the value of the '<em><b>License Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Class</em>' attribute list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_LicenseClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LicenseClass:3'"
	 * @generated
	 */
	FeatureMap getLicenseClass();

	/**
	 * Returns the value of the '<em><b>Free To Read</b></em>' containment reference list.
	 * The list contents are of type {@link org.niso.schemas.ali._1._0.FreeToReadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free To Read</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_FreeToRead()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='free_to_read' namespace='http://www.niso.org/schemas/ali/1.0/' group='#LicenseClass:3'"
	 * @generated
	 */
	EList<FreeToReadType> getFreeToRead();

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nih.nlm.ncbi.jats1.LicenseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *                    
	 *     <h3>License Information</h3>
	 *                 
	 *   </div>
	 *            
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' containment reference list.
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_License()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace' group='#LicenseClass:3'"
	 * @generated
	 */
	EList<LicenseType> getLicense();

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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getBase <em>Base</em>}' attribute.
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
	 * @see gov.nih.nlm.ncbi.jats1.Jats1Package#getPermissionsType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nih.nlm.ncbi.jats1.PermissionsType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PermissionsType
