/**
 */
package org.crossref.relations.impl;

import org.crossref.relations.DescriptionType;
import org.crossref.relations.DocumentRoot;
import org.crossref.relations.InterWorkRelationType;
import org.crossref.relations.IntraWorkRelationType;
import org.crossref.relations.ProgramType;
import org.crossref.relations.RelatedItemType;
import org.crossref.relations.RelationsPackage;
import org.crossref.relations.XrefFaces;

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
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getInterWorkRelation <em>Inter Work Relation</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getIntraWorkRelation <em>Intra Work Relation</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.relations.impl.DocumentRootImpl#getU <em>U</em>}</li>
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
		return RelationsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RelationsPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RelationsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RelationsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getB() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(XrefFaces newB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__B, newB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setB(XrefFaces newB) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__B, newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getEm() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__EM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEm(XrefFaces newEm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__EM, newEm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEm(XrefFaces newEm) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__EM, newEm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getFont() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__FONT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(XrefFaces newFont, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__FONT, newFont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont(XrefFaces newFont) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__FONT, newFont);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getI() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__I, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetI(XrefFaces newI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__I, newI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setI(XrefFaces newI) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__I, newI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterWorkRelationType getInterWorkRelation() {
		return (InterWorkRelationType)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__INTER_WORK_RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterWorkRelation(InterWorkRelationType newInterWorkRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__INTER_WORK_RELATION, newInterWorkRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterWorkRelation(InterWorkRelationType newInterWorkRelation) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__INTER_WORK_RELATION, newInterWorkRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntraWorkRelationType getIntraWorkRelation() {
		return (IntraWorkRelationType)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__INTRA_WORK_RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntraWorkRelation(IntraWorkRelationType newIntraWorkRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__INTRA_WORK_RELATION, newIntraWorkRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntraWorkRelation(IntraWorkRelationType newIntraWorkRelation) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__INTRA_WORK_RELATION, newIntraWorkRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getOvl() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__OVL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOvl(XrefFaces newOvl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__OVL, newOvl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOvl(XrefFaces newOvl) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__OVL, newOvl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType getProgram() {
		return (ProgramType)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__PROGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(ProgramType newProgram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__PROGRAM, newProgram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(ProgramType newProgram) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__PROGRAM, newProgram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedItemType getRelatedItem() {
		return (RelatedItemType)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__RELATED_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedItem(RelatedItemType newRelatedItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__RELATED_ITEM, newRelatedItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedItem(RelatedItemType newRelatedItem) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__RELATED_ITEM, newRelatedItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getScp() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__SCP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScp(XrefFaces newScp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__SCP, newScp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScp(XrefFaces newScp) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__SCP, newScp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getStrong() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__STRONG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrong(XrefFaces newStrong, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__STRONG, newStrong, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrong(XrefFaces newStrong) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__STRONG, newStrong);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getSub() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__SUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(XrefFaces newSub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__SUB, newSub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSub(XrefFaces newSub) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__SUB, newSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getSup() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__SUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSup(XrefFaces newSup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__SUP, newSup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSup(XrefFaces newSup) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__SUP, newSup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getTt() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__TT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTt(XrefFaces newTt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__TT, newTt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTt(XrefFaces newTt) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__TT, newTt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XrefFaces getU() {
		return (XrefFaces)getMixed().get(RelationsPackage.Literals.DOCUMENT_ROOT__U, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetU(XrefFaces newU, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RelationsPackage.Literals.DOCUMENT_ROOT__U, newU, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setU(XrefFaces newU) {
		((FeatureMap.Internal)getMixed()).set(RelationsPackage.Literals.DOCUMENT_ROOT__U, newU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case RelationsPackage.DOCUMENT_ROOT__B:
				return basicSetB(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__EM:
				return basicSetEm(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__FONT:
				return basicSetFont(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__I:
				return basicSetI(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__INTER_WORK_RELATION:
				return basicSetInterWorkRelation(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__INTRA_WORK_RELATION:
				return basicSetIntraWorkRelation(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__OVL:
				return basicSetOvl(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__PROGRAM:
				return basicSetProgram(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__RELATED_ITEM:
				return basicSetRelatedItem(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__SCP:
				return basicSetScp(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__STRONG:
				return basicSetStrong(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__SUB:
				return basicSetSub(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__SUP:
				return basicSetSup(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__TT:
				return basicSetTt(null, msgs);
			case RelationsPackage.DOCUMENT_ROOT__U:
				return basicSetU(null, msgs);
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
			case RelationsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RelationsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case RelationsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case RelationsPackage.DOCUMENT_ROOT__B:
				return getB();
			case RelationsPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case RelationsPackage.DOCUMENT_ROOT__EM:
				return getEm();
			case RelationsPackage.DOCUMENT_ROOT__FONT:
				return getFont();
			case RelationsPackage.DOCUMENT_ROOT__I:
				return getI();
			case RelationsPackage.DOCUMENT_ROOT__INTER_WORK_RELATION:
				return getInterWorkRelation();
			case RelationsPackage.DOCUMENT_ROOT__INTRA_WORK_RELATION:
				return getIntraWorkRelation();
			case RelationsPackage.DOCUMENT_ROOT__OVL:
				return getOvl();
			case RelationsPackage.DOCUMENT_ROOT__PROGRAM:
				return getProgram();
			case RelationsPackage.DOCUMENT_ROOT__RELATED_ITEM:
				return getRelatedItem();
			case RelationsPackage.DOCUMENT_ROOT__SCP:
				return getScp();
			case RelationsPackage.DOCUMENT_ROOT__STRONG:
				return getStrong();
			case RelationsPackage.DOCUMENT_ROOT__SUB:
				return getSub();
			case RelationsPackage.DOCUMENT_ROOT__SUP:
				return getSup();
			case RelationsPackage.DOCUMENT_ROOT__TT:
				return getTt();
			case RelationsPackage.DOCUMENT_ROOT__U:
				return getU();
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
			case RelationsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__B:
				setB((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__EM:
				setEm((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__FONT:
				setFont((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__I:
				setI((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__INTER_WORK_RELATION:
				setInterWorkRelation((InterWorkRelationType)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__INTRA_WORK_RELATION:
				setIntraWorkRelation((IntraWorkRelationType)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__OVL:
				setOvl((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__PROGRAM:
				setProgram((ProgramType)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__RELATED_ITEM:
				setRelatedItem((RelatedItemType)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__SCP:
				setScp((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__STRONG:
				setStrong((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__SUB:
				setSub((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__SUP:
				setSup((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__TT:
				setTt((XrefFaces)newValue);
				return;
			case RelationsPackage.DOCUMENT_ROOT__U:
				setU((XrefFaces)newValue);
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
			case RelationsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case RelationsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case RelationsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case RelationsPackage.DOCUMENT_ROOT__B:
				setB((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__EM:
				setEm((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__FONT:
				setFont((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__I:
				setI((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__INTER_WORK_RELATION:
				setInterWorkRelation((InterWorkRelationType)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__INTRA_WORK_RELATION:
				setIntraWorkRelation((IntraWorkRelationType)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__OVL:
				setOvl((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__PROGRAM:
				setProgram((ProgramType)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__RELATED_ITEM:
				setRelatedItem((RelatedItemType)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__SCP:
				setScp((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__STRONG:
				setStrong((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__SUB:
				setSub((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__SUP:
				setSup((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__TT:
				setTt((XrefFaces)null);
				return;
			case RelationsPackage.DOCUMENT_ROOT__U:
				setU((XrefFaces)null);
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
			case RelationsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RelationsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case RelationsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case RelationsPackage.DOCUMENT_ROOT__B:
				return getB() != null;
			case RelationsPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case RelationsPackage.DOCUMENT_ROOT__EM:
				return getEm() != null;
			case RelationsPackage.DOCUMENT_ROOT__FONT:
				return getFont() != null;
			case RelationsPackage.DOCUMENT_ROOT__I:
				return getI() != null;
			case RelationsPackage.DOCUMENT_ROOT__INTER_WORK_RELATION:
				return getInterWorkRelation() != null;
			case RelationsPackage.DOCUMENT_ROOT__INTRA_WORK_RELATION:
				return getIntraWorkRelation() != null;
			case RelationsPackage.DOCUMENT_ROOT__OVL:
				return getOvl() != null;
			case RelationsPackage.DOCUMENT_ROOT__PROGRAM:
				return getProgram() != null;
			case RelationsPackage.DOCUMENT_ROOT__RELATED_ITEM:
				return getRelatedItem() != null;
			case RelationsPackage.DOCUMENT_ROOT__SCP:
				return getScp() != null;
			case RelationsPackage.DOCUMENT_ROOT__STRONG:
				return getStrong() != null;
			case RelationsPackage.DOCUMENT_ROOT__SUB:
				return getSub() != null;
			case RelationsPackage.DOCUMENT_ROOT__SUP:
				return getSup() != null;
			case RelationsPackage.DOCUMENT_ROOT__TT:
				return getTt() != null;
			case RelationsPackage.DOCUMENT_ROOT__U:
				return getU() != null;
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
