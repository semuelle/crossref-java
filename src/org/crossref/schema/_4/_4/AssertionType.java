/**
 */
package org.crossref.schema._4._4;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getMath <em>Math</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getGroupLabel <em>Group Label</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getHref <em>Href</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.AssertionType#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see org.crossref.schema._4._4._4Package#getAssertionType()
 * @model extendedMetaData="name='assertion_._type' kind='mixed'"
 * @generated
 */
public interface AssertionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Face Markup</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Markup</em>' attribute list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_FaceMarkup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='FaceMarkup:1'"
	 * @generated
	 */
	FeatureMap getFaceMarkup();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getB();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getI();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getStrong();

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_U()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getU();

	/**
	 * Returns the value of the '<em><b>Ovl</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ovl</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Ovl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ovl' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getOvl();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getSup();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getSub();

	/**
	 * Returns the value of the '<em><b>Scp</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scp</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Scp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scp' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getScp();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getTt();

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference list.
	 * The list contents are of type {@link org.crossref.schema._4._4.XrefFaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Font()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<XrefFaces> getFont();

	/**
	 * Returns the value of the '<em><b>Math</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1998.math.math.ml.MathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Math</em>' containment reference list.
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Math()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='math' namespace='http://www.w3.org/1998/Math/MathML' group='#FaceMarkup:1'"
	 * @generated
	 */
	EList<MathType> getMath();

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute. If the publisher wants to provide a
	 * 						further explanation of what the particular "assertion" means, they can link
	 * 						to such an explanation by providing an appropriate url on the "explanation"
	 * 						attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Explanation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='explanation'"
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Group Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute. This is the human-readable form of the
	 * 						"group_name" attribute. This is what will be displayed in the group headings
	 * 						on the CrossMark metadata record dialog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Label</em>' attribute.
	 * @see #setGroupLabel(String)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_GroupLabel()
	 * @model dataType="org.crossref.schema._4._4.CmAssertionGroupLabel"
	 *        extendedMetaData="kind='attribute' name='group_label'"
	 * @generated
	 */
	String getGroupLabel();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getGroupLabel <em>Group Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Label</em>' attribute.
	 * @see #getGroupLabel()
	 * @generated
	 */
	void setGroupLabel(String value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute. Some assertions could be logically
	 * 						"grouped" together in the CrossMark dialog. For instance, if the publisher
	 * 						is recording several pieces of metadata related to funding sources (source
	 * 						name, percentage, grant number), they may want to make sure that these three
	 * 						assertions are grouped next to each-other in the CrossMark dialog. The
	 * 						group_name attribute is the machine-readable value that will be used for
	 * 						grouping such assertions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_GroupName()
	 * @model dataType="org.crossref.schema._4._4.CmAssertionGroupName"
	 *        extendedMetaData="kind='attribute' name='group_name'"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute. This is the human-readable version of the
	 * 						name attribute which will be displayed in the CrossMark dialog. If this
	 * 						attribute is missing, then the value of the assertion will *not* be
	 * 						displayed in the dialog. Publishers may want to "hide" assertions this way
	 * 						in cases where the assertion value is too large or too complex to display in
	 * 						the dialog, but where the assertion is nonetheless valuable enough to
	 * 						include in API queries and metadata dumps (e.g. detailed licensing
	 * 						terms)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Label()
	 * @model dataType="org.crossref.schema._4._4.CmAssertionLabel"
	 *        extendedMetaData="kind='attribute' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required attribute. This is the machine-readable name of the
	 * 						assertion. Use the "label" attribute to provide a human-readable version of
	 * 						the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Name()
	 * @model dataType="org.crossref.schema._4._4.CmAssertionName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute. The publisher may want to control the
	 * 						order in which assertions are displayed to the user in the CrossMark dialog.
	 * 						All assertions will be sorted by this element if it is
	 * 						present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(BigInteger)
	 * @see org.crossref.schema._4._4._4Package#getAssertionType_Order()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	BigInteger getOrder();

	/**
	 * Sets the value of the '{@link org.crossref.schema._4._4.AssertionType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(BigInteger value);

} // AssertionType
