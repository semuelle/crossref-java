/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.ArrayType;
import gov.nih.nlm.ncbi.jats1.ChemStructType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.InlineMediaType;
import gov.nih.nlm.ncbi.jats1.InlineSupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;
import gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.TableType;
import gov.nih.nlm.ncbi.jats1.TexMathType;
import gov.nih.nlm.ncbi.jats1.TextualFormType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.MathType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternatives Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getAlternativesModel <em>Alternatives Model</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getChemStruct <em>Chem Struct</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getInlineMedia <em>Inline Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getInlineSupplementaryMaterial <em>Inline Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getPrivateChar <em>Private Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getTextualForm <em>Textual Form</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getTexMath <em>Tex Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AlternativesTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativesTypeImpl extends MinimalEObjectImpl.Container implements AlternativesType {
	/**
	 * The cached value of the '{@link #getAlternativesModel() <em>Alternatives Model</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativesModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap alternativesModel;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getAlternativesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAlternativesModel() {
		if (alternativesModel == null) {
			alternativesModel = new BasicFeatureMap(this, Jats1Package.ALTERNATIVES_TYPE__ALTERNATIVES_MODEL);
		}
		return alternativesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType> getArray() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructType> getChemStruct() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_ChemStruct());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_InlineGraphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMediaType> getInlineMedia() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_InlineMedia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineSupplementaryMaterialType> getInlineSupplementaryMaterial() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_InlineSupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateCharType> getPrivateChar() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_PrivateChar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableType> getTable() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextualFormType> getTextualForm() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_TextualForm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TexMathType> getTexMath() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_TexMath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getAlternativesModel().list(Jats1Package.eINSTANCE.getAlternativesType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ALTERNATIVES_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ALTERNATIVES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ALTERNATIVES_TYPE__ALTERNATIVES_MODEL:
				return ((InternalEList<?>)getAlternativesModel()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__CHEM_STRUCT:
				return ((InternalEList<?>)getChemStruct()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_MEDIA:
				return ((InternalEList<?>)getInlineMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getInlineSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__PRIVATE_CHAR:
				return ((InternalEList<?>)getPrivateChar()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__TEXTUAL_FORM:
				return ((InternalEList<?>)getTextualForm()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__TEX_MATH:
				return ((InternalEList<?>)getTexMath()).basicRemove(otherEnd, msgs);
			case Jats1Package.ALTERNATIVES_TYPE__MATH:
				return ((InternalEList<?>)getMath()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Jats1Package.ALTERNATIVES_TYPE__ALTERNATIVES_MODEL:
				if (coreType) return getAlternativesModel();
				return ((FeatureMap.Internal)getAlternativesModel()).getWrapper();
			case Jats1Package.ALTERNATIVES_TYPE__ARRAY:
				return getArray();
			case Jats1Package.ALTERNATIVES_TYPE__CHEM_STRUCT:
				return getChemStruct();
			case Jats1Package.ALTERNATIVES_TYPE__CODE:
				return getCode();
			case Jats1Package.ALTERNATIVES_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_MEDIA:
				return getInlineMedia();
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return getInlineSupplementaryMaterial();
			case Jats1Package.ALTERNATIVES_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.ALTERNATIVES_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.ALTERNATIVES_TYPE__PRIVATE_CHAR:
				return getPrivateChar();
			case Jats1Package.ALTERNATIVES_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.ALTERNATIVES_TYPE__TABLE:
				return getTable();
			case Jats1Package.ALTERNATIVES_TYPE__TEXTUAL_FORM:
				return getTextualForm();
			case Jats1Package.ALTERNATIVES_TYPE__TEX_MATH:
				return getTexMath();
			case Jats1Package.ALTERNATIVES_TYPE__MATH:
				return getMath();
			case Jats1Package.ALTERNATIVES_TYPE__BASE:
				return getBase();
			case Jats1Package.ALTERNATIVES_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.ALTERNATIVES_TYPE__ALTERNATIVES_MODEL:
				((FeatureMap.Internal)getAlternativesModel()).set(newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				getChemStruct().addAll((Collection<? extends ChemStructType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				getInlineMedia().addAll((Collection<? extends InlineMediaType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				getInlineSupplementaryMaterial().addAll((Collection<? extends InlineSupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				getPrivateChar().addAll((Collection<? extends PrivateCharType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__TEXTUAL_FORM:
				getTextualForm().clear();
				getTextualForm().addAll((Collection<? extends TextualFormType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__TEX_MATH:
				getTexMath().clear();
				getTexMath().addAll((Collection<? extends TexMathType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Jats1Package.ALTERNATIVES_TYPE__ALTERNATIVES_MODEL:
				getAlternativesModel().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__ARRAY:
				getArray().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__CHEM_STRUCT:
				getChemStruct().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_MEDIA:
				getInlineMedia().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				getInlineSupplementaryMaterial().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__PRIVATE_CHAR:
				getPrivateChar().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__TABLE:
				getTable().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__TEXTUAL_FORM:
				getTextualForm().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__TEX_MATH:
				getTexMath().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__MATH:
				getMath().clear();
				return;
			case Jats1Package.ALTERNATIVES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ALTERNATIVES_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Jats1Package.ALTERNATIVES_TYPE__ALTERNATIVES_MODEL:
				return alternativesModel != null && !alternativesModel.isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__ARRAY:
				return !getArray().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__CHEM_STRUCT:
				return !getChemStruct().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_GRAPHIC:
				return !getInlineGraphic().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_MEDIA:
				return !getInlineMedia().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__INLINE_SUPPLEMENTARY_MATERIAL:
				return !getInlineSupplementaryMaterial().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__PRIVATE_CHAR:
				return !getPrivateChar().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__TABLE:
				return !getTable().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__TEXTUAL_FORM:
				return !getTextualForm().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__TEX_MATH:
				return !getTexMath().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__MATH:
				return !getMath().isEmpty();
			case Jats1Package.ALTERNATIVES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ALTERNATIVES_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (alternativesModel: ");
		result.append(alternativesModel);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AlternativesTypeImpl
