/**
 */
package org.crossref.access.indicators.impl;

import org.crossref.access.indicators.DocumentRoot;
import org.crossref.access.indicators.FreeToReadType;
import org.crossref.access.indicators.IndicatorsPackage;
import org.crossref.access.indicators.LicenseRefType;
import org.crossref.access.indicators.ProgramType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.access.indicators.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.DocumentRootImpl#getFreeToRead <em>Free To Read</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.DocumentRootImpl#getLicenseRef <em>License Ref</em>}</li>
 *   <li>{@link org.crossref.access.indicators.impl.DocumentRootImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndicatorsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, IndicatorsPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, IndicatorsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, IndicatorsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeToReadType getFreeToRead() {
		return (FreeToReadType)getMixed().get(IndicatorsPackage.Literals.DOCUMENT_ROOT__FREE_TO_READ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreeToRead(FreeToReadType newFreeToRead, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IndicatorsPackage.Literals.DOCUMENT_ROOT__FREE_TO_READ, newFreeToRead, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeToRead(FreeToReadType newFreeToRead) {
		((FeatureMap.Internal)getMixed()).set(IndicatorsPackage.Literals.DOCUMENT_ROOT__FREE_TO_READ, newFreeToRead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseRefType getLicenseRef() {
		return (LicenseRefType)getMixed().get(IndicatorsPackage.Literals.DOCUMENT_ROOT__LICENSE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseRef(LicenseRefType newLicenseRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IndicatorsPackage.Literals.DOCUMENT_ROOT__LICENSE_REF, newLicenseRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseRef(LicenseRefType newLicenseRef) {
		((FeatureMap.Internal)getMixed()).set(IndicatorsPackage.Literals.DOCUMENT_ROOT__LICENSE_REF, newLicenseRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType getProgram() {
		return (ProgramType)getMixed().get(IndicatorsPackage.Literals.DOCUMENT_ROOT__PROGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(ProgramType newProgram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IndicatorsPackage.Literals.DOCUMENT_ROOT__PROGRAM, newProgram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(ProgramType newProgram) {
		((FeatureMap.Internal)getMixed()).set(IndicatorsPackage.Literals.DOCUMENT_ROOT__PROGRAM, newProgram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IndicatorsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case IndicatorsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case IndicatorsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case IndicatorsPackage.DOCUMENT_ROOT__FREE_TO_READ:
				return basicSetFreeToRead(null, msgs);
			case IndicatorsPackage.DOCUMENT_ROOT__LICENSE_REF:
				return basicSetLicenseRef(null, msgs);
			case IndicatorsPackage.DOCUMENT_ROOT__PROGRAM:
				return basicSetProgram(null, msgs);
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
			case IndicatorsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case IndicatorsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case IndicatorsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case IndicatorsPackage.DOCUMENT_ROOT__FREE_TO_READ:
				return getFreeToRead();
			case IndicatorsPackage.DOCUMENT_ROOT__LICENSE_REF:
				return getLicenseRef();
			case IndicatorsPackage.DOCUMENT_ROOT__PROGRAM:
				return getProgram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IndicatorsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__FREE_TO_READ:
				setFreeToRead((FreeToReadType)newValue);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__LICENSE_REF:
				setLicenseRef((LicenseRefType)newValue);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__PROGRAM:
				setProgram((ProgramType)newValue);
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
			case IndicatorsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__FREE_TO_READ:
				setFreeToRead((FreeToReadType)null);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__LICENSE_REF:
				setLicenseRef((LicenseRefType)null);
				return;
			case IndicatorsPackage.DOCUMENT_ROOT__PROGRAM:
				setProgram((ProgramType)null);
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
			case IndicatorsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case IndicatorsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case IndicatorsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case IndicatorsPackage.DOCUMENT_ROOT__FREE_TO_READ:
				return getFreeToRead() != null;
			case IndicatorsPackage.DOCUMENT_ROOT__LICENSE_REF:
				return getLicenseRef() != null;
			case IndicatorsPackage.DOCUMENT_ROOT__PROGRAM:
				return getProgram() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
