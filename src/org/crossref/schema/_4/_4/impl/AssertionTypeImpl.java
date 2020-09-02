/**
 */
package org.crossref.schema._4._4.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.crossref.schema._4._4.AssertionType;
import org.crossref.schema._4._4.XrefFaces;
import org.crossref.schema._4._4._4Package;

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
 * An implementation of the model object '<em><b>Assertion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getFaceMarkup <em>Face Markup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getOvl <em>Ovl</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getScp <em>Scp</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getGroupLabel <em>Group Label</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.crossref.schema._4._4.impl.AssertionTypeImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionTypeImpl extends MinimalEObjectImpl.Container implements AssertionType {
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
	 * The default value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected String explanation = EXPLANATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupLabel() <em>Group Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupLabel() <em>Group Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupLabel()
	 * @generated
	 * @ordered
	 */
	protected String groupLabel = GROUP_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _4Package.eINSTANCE.getAssertionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _4Package.ASSERTION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFaceMarkup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(_4Package.eINSTANCE.getAssertionType_FaceMarkup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getB() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getI() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getEm() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getStrong() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getU() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_U());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getOvl() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Ovl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSup() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getSub() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getScp() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Scp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getTt() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XrefFaces> getFont() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Font());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MathType> getMath() {
		return getFaceMarkup().list(_4Package.eINSTANCE.getAssertionType_Math());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplanation(String newExplanation) {
		String oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__EXPLANATION, oldExplanation, explanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupLabel() {
		return groupLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupLabel(String newGroupLabel) {
		String oldGroupLabel = groupLabel;
		groupLabel = newGroupLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__GROUP_LABEL, oldGroupLabel, groupLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(BigInteger newOrder) {
		BigInteger oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _4Package.ASSERTION_TYPE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _4Package.ASSERTION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__FACE_MARKUP:
				return ((InternalEList<?>)getFaceMarkup()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__OVL:
				return ((InternalEList<?>)getOvl()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__SCP:
				return ((InternalEList<?>)getScp()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__FONT:
				return ((InternalEList<?>)getFont()).basicRemove(otherEnd, msgs);
			case _4Package.ASSERTION_TYPE__MATH:
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
			case _4Package.ASSERTION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _4Package.ASSERTION_TYPE__FACE_MARKUP:
				if (coreType) return getFaceMarkup();
				return ((FeatureMap.Internal)getFaceMarkup()).getWrapper();
			case _4Package.ASSERTION_TYPE__B:
				return getB();
			case _4Package.ASSERTION_TYPE__I:
				return getI();
			case _4Package.ASSERTION_TYPE__EM:
				return getEm();
			case _4Package.ASSERTION_TYPE__STRONG:
				return getStrong();
			case _4Package.ASSERTION_TYPE__U:
				return getU();
			case _4Package.ASSERTION_TYPE__OVL:
				return getOvl();
			case _4Package.ASSERTION_TYPE__SUP:
				return getSup();
			case _4Package.ASSERTION_TYPE__SUB:
				return getSub();
			case _4Package.ASSERTION_TYPE__SCP:
				return getScp();
			case _4Package.ASSERTION_TYPE__TT:
				return getTt();
			case _4Package.ASSERTION_TYPE__FONT:
				return getFont();
			case _4Package.ASSERTION_TYPE__MATH:
				return getMath();
			case _4Package.ASSERTION_TYPE__EXPLANATION:
				return getExplanation();
			case _4Package.ASSERTION_TYPE__GROUP_LABEL:
				return getGroupLabel();
			case _4Package.ASSERTION_TYPE__GROUP_NAME:
				return getGroupName();
			case _4Package.ASSERTION_TYPE__HREF:
				return getHref();
			case _4Package.ASSERTION_TYPE__LABEL:
				return getLabel();
			case _4Package.ASSERTION_TYPE__NAME:
				return getName();
			case _4Package.ASSERTION_TYPE__ORDER:
				return getOrder();
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
			case _4Package.ASSERTION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _4Package.ASSERTION_TYPE__FACE_MARKUP:
				((FeatureMap.Internal)getFaceMarkup()).set(newValue);
				return;
			case _4Package.ASSERTION_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__U:
				getU().clear();
				getU().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__OVL:
				getOvl().clear();
				getOvl().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__SCP:
				getScp().clear();
				getScp().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__FONT:
				getFont().clear();
				getFont().addAll((Collection<? extends XrefFaces>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__MATH:
				getMath().clear();
				getMath().addAll((Collection<? extends MathType>)newValue);
				return;
			case _4Package.ASSERTION_TYPE__EXPLANATION:
				setExplanation((String)newValue);
				return;
			case _4Package.ASSERTION_TYPE__GROUP_LABEL:
				setGroupLabel((String)newValue);
				return;
			case _4Package.ASSERTION_TYPE__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case _4Package.ASSERTION_TYPE__HREF:
				setHref((String)newValue);
				return;
			case _4Package.ASSERTION_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case _4Package.ASSERTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case _4Package.ASSERTION_TYPE__ORDER:
				setOrder((BigInteger)newValue);
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
			case _4Package.ASSERTION_TYPE__MIXED:
				getMixed().clear();
				return;
			case _4Package.ASSERTION_TYPE__FACE_MARKUP:
				getFaceMarkup().clear();
				return;
			case _4Package.ASSERTION_TYPE__B:
				getB().clear();
				return;
			case _4Package.ASSERTION_TYPE__I:
				getI().clear();
				return;
			case _4Package.ASSERTION_TYPE__EM:
				getEm().clear();
				return;
			case _4Package.ASSERTION_TYPE__STRONG:
				getStrong().clear();
				return;
			case _4Package.ASSERTION_TYPE__U:
				getU().clear();
				return;
			case _4Package.ASSERTION_TYPE__OVL:
				getOvl().clear();
				return;
			case _4Package.ASSERTION_TYPE__SUP:
				getSup().clear();
				return;
			case _4Package.ASSERTION_TYPE__SUB:
				getSub().clear();
				return;
			case _4Package.ASSERTION_TYPE__SCP:
				getScp().clear();
				return;
			case _4Package.ASSERTION_TYPE__TT:
				getTt().clear();
				return;
			case _4Package.ASSERTION_TYPE__FONT:
				getFont().clear();
				return;
			case _4Package.ASSERTION_TYPE__MATH:
				getMath().clear();
				return;
			case _4Package.ASSERTION_TYPE__EXPLANATION:
				setExplanation(EXPLANATION_EDEFAULT);
				return;
			case _4Package.ASSERTION_TYPE__GROUP_LABEL:
				setGroupLabel(GROUP_LABEL_EDEFAULT);
				return;
			case _4Package.ASSERTION_TYPE__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case _4Package.ASSERTION_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case _4Package.ASSERTION_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case _4Package.ASSERTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _4Package.ASSERTION_TYPE__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case _4Package.ASSERTION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _4Package.ASSERTION_TYPE__FACE_MARKUP:
				return !getFaceMarkup().isEmpty();
			case _4Package.ASSERTION_TYPE__B:
				return !getB().isEmpty();
			case _4Package.ASSERTION_TYPE__I:
				return !getI().isEmpty();
			case _4Package.ASSERTION_TYPE__EM:
				return !getEm().isEmpty();
			case _4Package.ASSERTION_TYPE__STRONG:
				return !getStrong().isEmpty();
			case _4Package.ASSERTION_TYPE__U:
				return !getU().isEmpty();
			case _4Package.ASSERTION_TYPE__OVL:
				return !getOvl().isEmpty();
			case _4Package.ASSERTION_TYPE__SUP:
				return !getSup().isEmpty();
			case _4Package.ASSERTION_TYPE__SUB:
				return !getSub().isEmpty();
			case _4Package.ASSERTION_TYPE__SCP:
				return !getScp().isEmpty();
			case _4Package.ASSERTION_TYPE__TT:
				return !getTt().isEmpty();
			case _4Package.ASSERTION_TYPE__FONT:
				return !getFont().isEmpty();
			case _4Package.ASSERTION_TYPE__MATH:
				return !getMath().isEmpty();
			case _4Package.ASSERTION_TYPE__EXPLANATION:
				return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
			case _4Package.ASSERTION_TYPE__GROUP_LABEL:
				return GROUP_LABEL_EDEFAULT == null ? groupLabel != null : !GROUP_LABEL_EDEFAULT.equals(groupLabel);
			case _4Package.ASSERTION_TYPE__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case _4Package.ASSERTION_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case _4Package.ASSERTION_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case _4Package.ASSERTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _4Package.ASSERTION_TYPE__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
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
		result.append(", explanation: ");
		result.append(explanation);
		result.append(", groupLabel: ");
		result.append(groupLabel);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", href: ");
		result.append(href);
		result.append(", label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //AssertionTypeImpl
