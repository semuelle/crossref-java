/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AlternativesType;
import gov.nih.nlm.ncbi.jats1.BoxedTextType;
import gov.nih.nlm.ncbi.jats1.ChemStructWrapType;
import gov.nih.nlm.ncbi.jats1.CodeType;
import gov.nih.nlm.ncbi.jats1.FigGroupType;
import gov.nih.nlm.ncbi.jats1.FigType;
import gov.nih.nlm.ncbi.jats1.FloatsGroupType;
import gov.nih.nlm.ncbi.jats1.GraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MediaType;
import gov.nih.nlm.ncbi.jats1.PreformatType;
import gov.nih.nlm.ncbi.jats1.SupplementaryMaterialType;
import gov.nih.nlm.ncbi.jats1.TableWrapGroupType;
import gov.nih.nlm.ncbi.jats1.TableWrapType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floats Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getFloatsDisplayClass <em>Floats Display Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getBoxedText <em>Boxed Text</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getChemStructWrap <em>Chem Struct Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getFig <em>Fig</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getFigGroup <em>Fig Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getPreformat <em>Preformat</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getSupplementaryMaterial <em>Supplementary Material</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getTableWrap <em>Table Wrap</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getTableWrapGroup <em>Table Wrap Group</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.FloatsGroupTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatsGroupTypeImpl extends MinimalEObjectImpl.Container implements FloatsGroupType {
	/**
	 * The cached value of the '{@link #getFloatsDisplayClass() <em>Floats Display Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatsDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap floatsDisplayClass;

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
	protected FloatsGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getFloatsGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFloatsDisplayClass() {
		if (floatsDisplayClass == null) {
			floatsDisplayClass = new BasicFeatureMap(this, Jats1Package.FLOATS_GROUP_TYPE__FLOATS_DISPLAY_CLASS);
		}
		return floatsDisplayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativesType> getAlternatives() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_Alternatives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxedTextType> getBoxedText() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_BoxedText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChemStructWrapType> getChemStructWrap() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_ChemStructWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigType> getFig() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_Fig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigGroupType> getFigGroup() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_FigGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicType> getGraphic() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_Graphic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaType> getMedia() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_Media());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreformatType> getPreformat() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_Preformat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementaryMaterialType> getSupplementaryMaterial() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_SupplementaryMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapType> getTableWrap() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_TableWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableWrapGroupType> getTableWrapGroup() {
		return getFloatsDisplayClass().list(Jats1Package.eINSTANCE.getFloatsGroupType_TableWrapGroup());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FLOATS_GROUP_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.FLOATS_GROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.FLOATS_GROUP_TYPE__FLOATS_DISPLAY_CLASS:
				return ((InternalEList<?>)getFloatsDisplayClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__BOXED_TEXT:
				return ((InternalEList<?>)getBoxedText()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__CHEM_STRUCT_WRAP:
				return ((InternalEList<?>)getChemStructWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__FIG:
				return ((InternalEList<?>)getFig()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__FIG_GROUP:
				return ((InternalEList<?>)getFigGroup()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__GRAPHIC:
				return ((InternalEList<?>)getGraphic()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__PREFORMAT:
				return ((InternalEList<?>)getPreformat()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__SUPPLEMENTARY_MATERIAL:
				return ((InternalEList<?>)getSupplementaryMaterial()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP:
				return ((InternalEList<?>)getTableWrap()).basicRemove(otherEnd, msgs);
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP_GROUP:
				return ((InternalEList<?>)getTableWrapGroup()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.FLOATS_GROUP_TYPE__FLOATS_DISPLAY_CLASS:
				if (coreType) return getFloatsDisplayClass();
				return ((FeatureMap.Internal)getFloatsDisplayClass()).getWrapper();
			case Jats1Package.FLOATS_GROUP_TYPE__ALTERNATIVES:
				return getAlternatives();
			case Jats1Package.FLOATS_GROUP_TYPE__BOXED_TEXT:
				return getBoxedText();
			case Jats1Package.FLOATS_GROUP_TYPE__CHEM_STRUCT_WRAP:
				return getChemStructWrap();
			case Jats1Package.FLOATS_GROUP_TYPE__CODE:
				return getCode();
			case Jats1Package.FLOATS_GROUP_TYPE__FIG:
				return getFig();
			case Jats1Package.FLOATS_GROUP_TYPE__FIG_GROUP:
				return getFigGroup();
			case Jats1Package.FLOATS_GROUP_TYPE__GRAPHIC:
				return getGraphic();
			case Jats1Package.FLOATS_GROUP_TYPE__MEDIA:
				return getMedia();
			case Jats1Package.FLOATS_GROUP_TYPE__PREFORMAT:
				return getPreformat();
			case Jats1Package.FLOATS_GROUP_TYPE__SUPPLEMENTARY_MATERIAL:
				return getSupplementaryMaterial();
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP:
				return getTableWrap();
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP_GROUP:
				return getTableWrapGroup();
			case Jats1Package.FLOATS_GROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.FLOATS_GROUP_TYPE__ID:
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
			case Jats1Package.FLOATS_GROUP_TYPE__FLOATS_DISPLAY_CLASS:
				((FeatureMap.Internal)getFloatsDisplayClass()).set(newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends AlternativesType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				getBoxedText().addAll((Collection<? extends BoxedTextType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				getChemStructWrap().addAll((Collection<? extends ChemStructWrapType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__FIG:
				getFig().clear();
				getFig().addAll((Collection<? extends FigType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__FIG_GROUP:
				getFigGroup().clear();
				getFigGroup().addAll((Collection<? extends FigGroupType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__GRAPHIC:
				getGraphic().clear();
				getGraphic().addAll((Collection<? extends GraphicType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__PREFORMAT:
				getPreformat().clear();
				getPreformat().addAll((Collection<? extends PreformatType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				getSupplementaryMaterial().addAll((Collection<? extends SupplementaryMaterialType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				getTableWrap().addAll((Collection<? extends TableWrapType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				getTableWrapGroup().addAll((Collection<? extends TableWrapGroupType>)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__ID:
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
			case Jats1Package.FLOATS_GROUP_TYPE__FLOATS_DISPLAY_CLASS:
				getFloatsDisplayClass().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__BOXED_TEXT:
				getBoxedText().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__CHEM_STRUCT_WRAP:
				getChemStructWrap().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__CODE:
				getCode().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__FIG:
				getFig().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__FIG_GROUP:
				getFigGroup().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__GRAPHIC:
				getGraphic().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__MEDIA:
				getMedia().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__PREFORMAT:
				getPreformat().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__SUPPLEMENTARY_MATERIAL:
				getSupplementaryMaterial().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP:
				getTableWrap().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP_GROUP:
				getTableWrapGroup().clear();
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.FLOATS_GROUP_TYPE__ID:
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
			case Jats1Package.FLOATS_GROUP_TYPE__FLOATS_DISPLAY_CLASS:
				return floatsDisplayClass != null && !floatsDisplayClass.isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__BOXED_TEXT:
				return !getBoxedText().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__CHEM_STRUCT_WRAP:
				return !getChemStructWrap().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__CODE:
				return !getCode().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__FIG:
				return !getFig().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__FIG_GROUP:
				return !getFigGroup().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__GRAPHIC:
				return !getGraphic().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__MEDIA:
				return !getMedia().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__PREFORMAT:
				return !getPreformat().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__SUPPLEMENTARY_MATERIAL:
				return !getSupplementaryMaterial().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP:
				return !getTableWrap().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__TABLE_WRAP_GROUP:
				return !getTableWrapGroup().isEmpty();
			case Jats1Package.FLOATS_GROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.FLOATS_GROUP_TYPE__ID:
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
		result.append(" (floatsDisplayClass: ");
		result.append(floatsDisplayClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FloatsGroupTypeImpl
