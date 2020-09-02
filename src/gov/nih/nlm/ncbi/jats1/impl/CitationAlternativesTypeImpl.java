/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.CitationAlternativesType;
import gov.nih.nlm.ncbi.jats1.ElementCitationType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.MixedCitationType;
import gov.nih.nlm.ncbi.jats1.NlmCitationType;

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
 * An implementation of the model object '<em><b>Citation Alternatives Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CitationAlternativesTypeImpl#getCitationMinusAltClass <em>Citation Minus Alt Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CitationAlternativesTypeImpl#getElementCitation <em>Element Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CitationAlternativesTypeImpl#getMixedCitation <em>Mixed Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CitationAlternativesTypeImpl#getNlmCitation <em>Nlm Citation</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CitationAlternativesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.CitationAlternativesTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationAlternativesTypeImpl extends MinimalEObjectImpl.Container implements CitationAlternativesType {
	/**
	 * The cached value of the '{@link #getCitationMinusAltClass() <em>Citation Minus Alt Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationMinusAltClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap citationMinusAltClass;

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
	protected CitationAlternativesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getCitationAlternativesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCitationMinusAltClass() {
		if (citationMinusAltClass == null) {
			citationMinusAltClass = new BasicFeatureMap(this, Jats1Package.CITATION_ALTERNATIVES_TYPE__CITATION_MINUS_ALT_CLASS);
		}
		return citationMinusAltClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementCitationType> getElementCitation() {
		return getCitationMinusAltClass().list(Jats1Package.eINSTANCE.getCitationAlternativesType_ElementCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MixedCitationType> getMixedCitation() {
		return getCitationMinusAltClass().list(Jats1Package.eINSTANCE.getCitationAlternativesType_MixedCitation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NlmCitationType> getNlmCitation() {
		return getCitationMinusAltClass().list(Jats1Package.eINSTANCE.getCitationAlternativesType_NlmCitation());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CITATION_ALTERNATIVES_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.CITATION_ALTERNATIVES_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__CITATION_MINUS_ALT_CLASS:
				return ((InternalEList<?>)getCitationMinusAltClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ELEMENT_CITATION:
				return ((InternalEList<?>)getElementCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__MIXED_CITATION:
				return ((InternalEList<?>)getMixedCitation()).basicRemove(otherEnd, msgs);
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__NLM_CITATION:
				return ((InternalEList<?>)getNlmCitation()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__CITATION_MINUS_ALT_CLASS:
				if (coreType) return getCitationMinusAltClass();
				return ((FeatureMap.Internal)getCitationMinusAltClass()).getWrapper();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ELEMENT_CITATION:
				return getElementCitation();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__MIXED_CITATION:
				return getMixedCitation();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__NLM_CITATION:
				return getNlmCitation();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__BASE:
				return getBase();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__CITATION_MINUS_ALT_CLASS:
				((FeatureMap.Internal)getCitationMinusAltClass()).set(newValue);
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				getElementCitation().addAll((Collection<? extends ElementCitationType>)newValue);
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__MIXED_CITATION:
				getMixedCitation().clear();
				getMixedCitation().addAll((Collection<? extends MixedCitationType>)newValue);
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__NLM_CITATION:
				getNlmCitation().clear();
				getNlmCitation().addAll((Collection<? extends NlmCitationType>)newValue);
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__CITATION_MINUS_ALT_CLASS:
				getCitationMinusAltClass().clear();
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ELEMENT_CITATION:
				getElementCitation().clear();
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__MIXED_CITATION:
				getMixedCitation().clear();
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__NLM_CITATION:
				getNlmCitation().clear();
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ID:
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
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__CITATION_MINUS_ALT_CLASS:
				return citationMinusAltClass != null && !citationMinusAltClass.isEmpty();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ELEMENT_CITATION:
				return !getElementCitation().isEmpty();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__MIXED_CITATION:
				return !getMixedCitation().isEmpty();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__NLM_CITATION:
				return !getNlmCitation().isEmpty();
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.CITATION_ALTERNATIVES_TYPE__ID:
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
		result.append(" (citationMinusAltClass: ");
		result.append(citationMinusAltClass);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CitationAlternativesTypeImpl
