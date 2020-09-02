/**
 */
package org.w3._1998.math.math.ml.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

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

import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MscarriesType;
import org.w3._1998.math.math.ml.MsgroupType;
import org.w3._1998.math.math.ml.MslineType;
import org.w3._1998.math.math.ml.MsrowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msgroup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMstackExpression <em>Mstack Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMscarries <em>Mscarries</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMsline <em>Msline</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMsrow <em>Msrow</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMsgroup <em>Msgroup</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MsgroupTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MsgroupTypeImpl extends MinimalEObjectImpl.Container implements MsgroupType {
	/**
	 * The cached value of the '{@link #getMstackExpression() <em>Mstack Expression</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMstackExpression()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mstackExpression;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected List<String> class_ = CLASS_EDEFAULT;

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
	 * The default value of the '{@link #getMathbackground() <em>Mathbackground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathbackground()
	 * @generated
	 * @ordered
	 */
	protected static final Object MATHBACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMathbackground() <em>Mathbackground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathbackground()
	 * @generated
	 * @ordered
	 */
	protected Object mathbackground = MATHBACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMathcolor() <em>Mathcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathcolor()
	 * @generated
	 * @ordered
	 */
	protected static final String MATHCOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMathcolor() <em>Mathcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathcolor()
	 * @generated
	 * @ordered
	 */
	protected String mathcolor = MATHCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final Object OTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected Object other = OTHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected BigInteger shift = SHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXref()
	 * @generated
	 * @ordered
	 */
	protected static final Object XREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXref()
	 * @generated
	 * @ordered
	 */
	protected Object xref = XREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMsgroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMstackExpression() {
		if (mstackExpression == null) {
			mstackExpression = new BasicFeatureMap(this, MlPackage.MSGROUP_TYPE__MSTACK_EXPRESSION);
		}
		return mstackExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MscarriesType> getMscarries() {
		return getMstackExpression().list(MlPackage.eINSTANCE.getMsgroupType_Mscarries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MslineType> getMsline() {
		return getMstackExpression().list(MlPackage.eINSTANCE.getMsgroupType_Msline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsrowType> getMsrow() {
		return getMstackExpression().list(MlPackage.eINSTANCE.getMsgroupType_Msrow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MsgroupType> getMsgroup() {
		return getMstackExpression().list(MlPackage.eINSTANCE.getMsgroupType_Msgroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(List<String> newClass) {
		List<String> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMathbackground() {
		return mathbackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathbackground(Object newMathbackground) {
		Object oldMathbackground = mathbackground;
		mathbackground = newMathbackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMathcolor() {
		return mathcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathcolor(String newMathcolor) {
		String oldMathcolor = mathcolor;
		mathcolor = newMathcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(Object newOther) {
		Object oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(BigInteger newPosition) {
		BigInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShift(BigInteger newShift) {
		BigInteger oldShift = shift;
		shift = newShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__SHIFT, oldShift, shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getXref() {
		return xref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXref(Object newXref) {
		Object oldXref = xref;
		xref = newXref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSGROUP_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MSGROUP_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlPackage.MSGROUP_TYPE__MSTACK_EXPRESSION:
				return ((InternalEList<?>)getMstackExpression()).basicRemove(otherEnd, msgs);
			case MlPackage.MSGROUP_TYPE__MSCARRIES:
				return ((InternalEList<?>)getMscarries()).basicRemove(otherEnd, msgs);
			case MlPackage.MSGROUP_TYPE__MSLINE:
				return ((InternalEList<?>)getMsline()).basicRemove(otherEnd, msgs);
			case MlPackage.MSGROUP_TYPE__MSROW:
				return ((InternalEList<?>)getMsrow()).basicRemove(otherEnd, msgs);
			case MlPackage.MSGROUP_TYPE__MSGROUP:
				return ((InternalEList<?>)getMsgroup()).basicRemove(otherEnd, msgs);
			case MlPackage.MSGROUP_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case MlPackage.MSGROUP_TYPE__MSTACK_EXPRESSION:
				if (coreType) return getMstackExpression();
				return ((FeatureMap.Internal)getMstackExpression()).getWrapper();
			case MlPackage.MSGROUP_TYPE__MSCARRIES:
				return getMscarries();
			case MlPackage.MSGROUP_TYPE__MSLINE:
				return getMsline();
			case MlPackage.MSGROUP_TYPE__MSROW:
				return getMsrow();
			case MlPackage.MSGROUP_TYPE__MSGROUP:
				return getMsgroup();
			case MlPackage.MSGROUP_TYPE__CLASS:
				return getClass_();
			case MlPackage.MSGROUP_TYPE__HREF:
				return getHref();
			case MlPackage.MSGROUP_TYPE__ID:
				return getId();
			case MlPackage.MSGROUP_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MSGROUP_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MSGROUP_TYPE__OTHER:
				return getOther();
			case MlPackage.MSGROUP_TYPE__POSITION:
				return getPosition();
			case MlPackage.MSGROUP_TYPE__SHIFT:
				return getShift();
			case MlPackage.MSGROUP_TYPE__STYLE:
				return getStyle();
			case MlPackage.MSGROUP_TYPE__XREF:
				return getXref();
			case MlPackage.MSGROUP_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case MlPackage.MSGROUP_TYPE__MSTACK_EXPRESSION:
				((FeatureMap.Internal)getMstackExpression()).set(newValue);
				return;
			case MlPackage.MSGROUP_TYPE__MSCARRIES:
				getMscarries().clear();
				getMscarries().addAll((Collection<? extends MscarriesType>)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__MSLINE:
				getMsline().clear();
				getMsline().addAll((Collection<? extends MslineType>)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__MSROW:
				getMsrow().clear();
				getMsrow().addAll((Collection<? extends MsrowType>)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__MSGROUP:
				getMsgroup().clear();
				getMsgroup().addAll((Collection<? extends MsgroupType>)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MSGROUP_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MSGROUP_TYPE__POSITION:
				setPosition((BigInteger)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__SHIFT:
				setShift((BigInteger)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MSGROUP_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MSGROUP_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case MlPackage.MSGROUP_TYPE__MSTACK_EXPRESSION:
				getMstackExpression().clear();
				return;
			case MlPackage.MSGROUP_TYPE__MSCARRIES:
				getMscarries().clear();
				return;
			case MlPackage.MSGROUP_TYPE__MSLINE:
				getMsline().clear();
				return;
			case MlPackage.MSGROUP_TYPE__MSROW:
				getMsrow().clear();
				return;
			case MlPackage.MSGROUP_TYPE__MSGROUP:
				getMsgroup().clear();
				return;
			case MlPackage.MSGROUP_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__SHIFT:
				setShift(SHIFT_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MSGROUP_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case MlPackage.MSGROUP_TYPE__MSTACK_EXPRESSION:
				return mstackExpression != null && !mstackExpression.isEmpty();
			case MlPackage.MSGROUP_TYPE__MSCARRIES:
				return !getMscarries().isEmpty();
			case MlPackage.MSGROUP_TYPE__MSLINE:
				return !getMsline().isEmpty();
			case MlPackage.MSGROUP_TYPE__MSROW:
				return !getMsrow().isEmpty();
			case MlPackage.MSGROUP_TYPE__MSGROUP:
				return !getMsgroup().isEmpty();
			case MlPackage.MSGROUP_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MSGROUP_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MSGROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MSGROUP_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MSGROUP_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MSGROUP_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MSGROUP_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case MlPackage.MSGROUP_TYPE__SHIFT:
				return SHIFT_EDEFAULT == null ? shift != null : !SHIFT_EDEFAULT.equals(shift);
			case MlPackage.MSGROUP_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MSGROUP_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MSGROUP_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (mstackExpression: ");
		result.append(mstackExpression);
		result.append(", class: ");
		result.append(class_);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", mathbackground: ");
		result.append(mathbackground);
		result.append(", mathcolor: ");
		result.append(mathcolor);
		result.append(", other: ");
		result.append(other);
		result.append(", position: ");
		result.append(position);
		result.append(", shift: ");
		result.append(shift);
		result.append(", style: ");
		result.append(style);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MsgroupTypeImpl
