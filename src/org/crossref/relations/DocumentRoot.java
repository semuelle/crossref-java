/**
 */
package org.crossref.relations;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.relations.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getInterWorkRelation <em>Inter Work Relation</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getIntraWorkRelation <em>Intra Work Relation</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.relations.DocumentRoot#getU <em>U</em>}</li>
 * </ul>
 *
 * @see org.crossref.relations.RelationsPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_B()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getB();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of the relationship target item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference.
	 * @see #setEm(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Em()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getEm();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getEm <em>Em</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Em</em>' containment reference.
	 * @see #getEm()
	 * @generated
	 */
	void setEm(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Font()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getFont();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference.
	 * @see #setI(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_I()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getI();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getI <em>I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' containment reference.
	 * @see #getI()
	 * @generated
	 */
	void setI(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Inter Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Work Relation</em>' containment reference.
	 * @see #setInterWorkRelation(InterWorkRelationType)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_InterWorkRelation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inter_work_relation' namespace='##targetNamespace'"
	 * @generated
	 */
	InterWorkRelationType getInterWorkRelation();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getInterWorkRelation <em>Inter Work Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Work Relation</em>' containment reference.
	 * @see #getInterWorkRelation()
	 * @generated
	 */
	void setInterWorkRelation(InterWorkRelationType value);

	/**
	 * Returns the value of the '<em><b>Intra Work Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intra Work Relation</em>' containment reference.
	 * @see #setIntraWorkRelation(IntraWorkRelationType)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_IntraWorkRelation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intra_work_relation' namespace='##targetNamespace'"
	 * @generated
	 */
	IntraWorkRelationType getIntraWorkRelation();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getIntraWorkRelation <em>Intra Work Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intra Work Relation</em>' containment reference.
	 * @see #getIntraWorkRelation()
	 * @generated
	 */
	void setIntraWorkRelation(IntraWorkRelationType value);

	/**
	 * Returns the value of the '<em><b>Ovl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ovl</em>' containment reference.
	 * @see #setOvl(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Ovl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ovl' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getOvl();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getOvl <em>Ovl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ovl</em>' containment reference.
	 * @see #getOvl()
	 * @generated
	 */
	void setOvl(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wrapper element for relationship metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(ProgramType)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Program()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramType getProgram();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramType value);

	/**
	 * Returns the value of the '<em><b>Related Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Item</em>' containment reference.
	 * @see #setRelatedItem(RelatedItemType)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_RelatedItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='related_item' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedItemType getRelatedItem();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getRelatedItem <em>Related Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Item</em>' containment reference.
	 * @see #getRelatedItem()
	 * @generated
	 */
	void setRelatedItem(RelatedItemType value);

	/**
	 * Returns the value of the '<em><b>Scp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scp</em>' containment reference.
	 * @see #setScp(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Scp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scp' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getScp();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getScp <em>Scp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scp</em>' containment reference.
	 * @see #getScp()
	 * @generated
	 */
	void setScp(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference.
	 * @see #setStrong(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Strong()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getStrong();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getStrong <em>Strong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong</em>' containment reference.
	 * @see #getStrong()
	 * @generated
	 */
	void setStrong(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Sub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getSub();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference.
	 * @see #setSup(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Sup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getSup();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getSup <em>Sup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup</em>' containment reference.
	 * @see #getSup()
	 * @generated
	 */
	void setSup(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference.
	 * @see #setTt(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_Tt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getTt();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getTt <em>Tt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tt</em>' containment reference.
	 * @see #getTt()
	 * @generated
	 */
	void setTt(XrefFaces value);

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference.
	 * @see #setU(XrefFaces)
	 * @see org.crossref.relations.RelationsPackage#getDocumentRoot_U()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace'"
	 * @generated
	 */
	XrefFaces getU();

	/**
	 * Sets the value of the '{@link org.crossref.relations.DocumentRoot#getU <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' containment reference.
	 * @see #getU()
	 * @generated
	 */
	void setU(XrefFaces value);

} // DocumentRoot
