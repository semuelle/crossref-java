/**
 */
package org.w3._1998.math.math.ml.impl;

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
import org.w3._1998.math.math.ml.MmultiscriptsType;
import org.w3._1998.math.math.ml.MprescriptsType;
import org.w3._1998.math.math.ml.NoneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mmultiscripts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getMultiScriptExpression <em>Multi Script Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getNone <em>None</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getNone1 <em>None1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getMprescripts <em>Mprescripts</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getMultiScriptExpression1 <em>Multi Script Expression1</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getNone2 <em>None2</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getNone3 <em>None3</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getSubscriptshift <em>Subscriptshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getSuperscriptshift <em>Superscriptshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MmultiscriptsTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MmultiscriptsTypeImpl extends MinimalEObjectImpl.Container implements MmultiscriptsType {
	/**
	 * The cached value of the '{@link #getMultiScriptExpression() <em>Multi Script Expression</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiScriptExpression()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap multiScriptExpression;

	/**
	 * The cached value of the '{@link #getMprescripts() <em>Mprescripts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMprescripts()
	 * @generated
	 * @ordered
	 */
	protected MprescriptsType mprescripts;

	/**
	 * The cached value of the '{@link #getMultiScriptExpression1() <em>Multi Script Expression1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiScriptExpression1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap multiScriptExpression1;

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
	 * The default value of the '{@link #getSubscriptshift() <em>Subscriptshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptshift()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTSHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptshift() <em>Subscriptshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptshift()
	 * @generated
	 * @ordered
	 */
	protected String subscriptshift = SUBSCRIPTSHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuperscriptshift() <em>Superscriptshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperscriptshift()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPERSCRIPTSHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperscriptshift() <em>Superscriptshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperscriptshift()
	 * @generated
	 * @ordered
	 */
	protected String superscriptshift = SUPERSCRIPTSHIFT_EDEFAULT;

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
	protected MmultiscriptsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMmultiscriptsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMultiScriptExpression() {
		if (multiScriptExpression == null) {
			multiScriptExpression = new BasicFeatureMap(this, MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION);
		}
		return multiScriptExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneType> getNone() {
		return getMultiScriptExpression().list(MlPackage.eINSTANCE.getMmultiscriptsType_None());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneType> getNone1() {
		return getMultiScriptExpression().list(MlPackage.eINSTANCE.getMmultiscriptsType_None1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MprescriptsType getMprescripts() {
		return mprescripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMprescripts(MprescriptsType newMprescripts, NotificationChain msgs) {
		MprescriptsType oldMprescripts = mprescripts;
		mprescripts = newMprescripts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS, oldMprescripts, newMprescripts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMprescripts(MprescriptsType newMprescripts) {
		if (newMprescripts != mprescripts) {
			NotificationChain msgs = null;
			if (mprescripts != null)
				msgs = ((InternalEObject)mprescripts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS, null, msgs);
			if (newMprescripts != null)
				msgs = ((InternalEObject)newMprescripts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS, null, msgs);
			msgs = basicSetMprescripts(newMprescripts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS, newMprescripts, newMprescripts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMultiScriptExpression1() {
		if (multiScriptExpression1 == null) {
			multiScriptExpression1 = new BasicFeatureMap(this, MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION1);
		}
		return multiScriptExpression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneType> getNone2() {
		return getMultiScriptExpression1().list(MlPackage.eINSTANCE.getMmultiscriptsType_None2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneType> getNone3() {
		return getMultiScriptExpression1().list(MlPackage.eINSTANCE.getMmultiscriptsType_None3());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptshift() {
		return subscriptshift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptshift(String newSubscriptshift) {
		String oldSubscriptshift = subscriptshift;
		subscriptshift = newSubscriptshift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__SUBSCRIPTSHIFT, oldSubscriptshift, subscriptshift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuperscriptshift() {
		return superscriptshift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperscriptshift(String newSuperscriptshift) {
		String oldSuperscriptshift = superscriptshift;
		superscriptshift = newSuperscriptshift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__SUPERSCRIPTSHIFT, oldSuperscriptshift, superscriptshift));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MMULTISCRIPTS_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MMULTISCRIPTS_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION:
				return ((InternalEList<?>)getMultiScriptExpression()).basicRemove(otherEnd, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__NONE:
				return ((InternalEList<?>)getNone()).basicRemove(otherEnd, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__NONE1:
				return ((InternalEList<?>)getNone1()).basicRemove(otherEnd, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS:
				return basicSetMprescripts(null, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION1:
				return ((InternalEList<?>)getMultiScriptExpression1()).basicRemove(otherEnd, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__NONE2:
				return ((InternalEList<?>)getNone2()).basicRemove(otherEnd, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__NONE3:
				return ((InternalEList<?>)getNone3()).basicRemove(otherEnd, msgs);
			case MlPackage.MMULTISCRIPTS_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION:
				if (coreType) return getMultiScriptExpression();
				return ((FeatureMap.Internal)getMultiScriptExpression()).getWrapper();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE:
				return getNone();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE1:
				return getNone1();
			case MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS:
				return getMprescripts();
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION1:
				if (coreType) return getMultiScriptExpression1();
				return ((FeatureMap.Internal)getMultiScriptExpression1()).getWrapper();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE2:
				return getNone2();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE3:
				return getNone3();
			case MlPackage.MMULTISCRIPTS_TYPE__CLASS:
				return getClass_();
			case MlPackage.MMULTISCRIPTS_TYPE__HREF:
				return getHref();
			case MlPackage.MMULTISCRIPTS_TYPE__ID:
				return getId();
			case MlPackage.MMULTISCRIPTS_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MMULTISCRIPTS_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MMULTISCRIPTS_TYPE__OTHER:
				return getOther();
			case MlPackage.MMULTISCRIPTS_TYPE__STYLE:
				return getStyle();
			case MlPackage.MMULTISCRIPTS_TYPE__SUBSCRIPTSHIFT:
				return getSubscriptshift();
			case MlPackage.MMULTISCRIPTS_TYPE__SUPERSCRIPTSHIFT:
				return getSuperscriptshift();
			case MlPackage.MMULTISCRIPTS_TYPE__XREF:
				return getXref();
			case MlPackage.MMULTISCRIPTS_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION:
				((FeatureMap.Internal)getMultiScriptExpression()).set(newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE:
				getNone().clear();
				getNone().addAll((Collection<? extends NoneType>)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE1:
				getNone1().clear();
				getNone1().addAll((Collection<? extends NoneType>)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS:
				setMprescripts((MprescriptsType)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION1:
				((FeatureMap.Internal)getMultiScriptExpression1()).set(newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE2:
				getNone2().clear();
				getNone2().addAll((Collection<? extends NoneType>)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE3:
				getNone3().clear();
				getNone3().addAll((Collection<? extends NoneType>)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__SUBSCRIPTSHIFT:
				setSubscriptshift((String)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__SUPERSCRIPTSHIFT:
				setSuperscriptshift((String)newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION:
				getMultiScriptExpression().clear();
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE:
				getNone().clear();
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE1:
				getNone1().clear();
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS:
				setMprescripts((MprescriptsType)null);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION1:
				getMultiScriptExpression1().clear();
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE2:
				getNone2().clear();
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__NONE3:
				getNone3().clear();
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__SUBSCRIPTSHIFT:
				setSubscriptshift(SUBSCRIPTSHIFT_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__SUPERSCRIPTSHIFT:
				setSuperscriptshift(SUPERSCRIPTSHIFT_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MMULTISCRIPTS_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION:
				return multiScriptExpression != null && !multiScriptExpression.isEmpty();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE:
				return !getNone().isEmpty();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE1:
				return !getNone1().isEmpty();
			case MlPackage.MMULTISCRIPTS_TYPE__MPRESCRIPTS:
				return mprescripts != null;
			case MlPackage.MMULTISCRIPTS_TYPE__MULTI_SCRIPT_EXPRESSION1:
				return multiScriptExpression1 != null && !multiScriptExpression1.isEmpty();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE2:
				return !getNone2().isEmpty();
			case MlPackage.MMULTISCRIPTS_TYPE__NONE3:
				return !getNone3().isEmpty();
			case MlPackage.MMULTISCRIPTS_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MMULTISCRIPTS_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MMULTISCRIPTS_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MMULTISCRIPTS_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MMULTISCRIPTS_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MMULTISCRIPTS_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MMULTISCRIPTS_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MMULTISCRIPTS_TYPE__SUBSCRIPTSHIFT:
				return SUBSCRIPTSHIFT_EDEFAULT == null ? subscriptshift != null : !SUBSCRIPTSHIFT_EDEFAULT.equals(subscriptshift);
			case MlPackage.MMULTISCRIPTS_TYPE__SUPERSCRIPTSHIFT:
				return SUPERSCRIPTSHIFT_EDEFAULT == null ? superscriptshift != null : !SUPERSCRIPTSHIFT_EDEFAULT.equals(superscriptshift);
			case MlPackage.MMULTISCRIPTS_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MMULTISCRIPTS_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (multiScriptExpression: ");
		result.append(multiScriptExpression);
		result.append(", multiScriptExpression1: ");
		result.append(multiScriptExpression1);
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
		result.append(", style: ");
		result.append(style);
		result.append(", subscriptshift: ");
		result.append(subscriptshift);
		result.append(", superscriptshift: ");
		result.append(superscriptshift);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MmultiscriptsTypeImpl
