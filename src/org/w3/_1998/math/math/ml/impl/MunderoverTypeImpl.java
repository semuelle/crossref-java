/**
 */
package org.w3._1998.math.math.ml.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.AccentType1;
import org.w3._1998.math.math.ml.AccentunderType;
import org.w3._1998.math.math.ml.AlignType1;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MunderoverType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Munderover Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getAccent <em>Accent</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getAccentunder <em>Accentunder</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MunderoverTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MunderoverTypeImpl extends MinimalEObjectImpl.Container implements MunderoverType {
	/**
	 * The default value of the '{@link #getAccent() <em>Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccent()
	 * @generated
	 * @ordered
	 */
	protected static final AccentType1 ACCENT_EDEFAULT = AccentType1.TRUE;

	/**
	 * The cached value of the '{@link #getAccent() <em>Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccent()
	 * @generated
	 * @ordered
	 */
	protected AccentType1 accent = ACCENT_EDEFAULT;

	/**
	 * This is true if the Accent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accentESet;

	/**
	 * The default value of the '{@link #getAccentunder() <em>Accentunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentunder()
	 * @generated
	 * @ordered
	 */
	protected static final AccentunderType ACCENTUNDER_EDEFAULT = AccentunderType.TRUE;

	/**
	 * The cached value of the '{@link #getAccentunder() <em>Accentunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentunder()
	 * @generated
	 * @ordered
	 */
	protected AccentunderType accentunder = ACCENTUNDER_EDEFAULT;

	/**
	 * This is true if the Accentunder attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accentunderESet;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType1 ALIGN_EDEFAULT = AlignType1.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType1 align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

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
	protected MunderoverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMunderoverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccentType1 getAccent() {
		return accent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccent(AccentType1 newAccent) {
		AccentType1 oldAccent = accent;
		accent = newAccent == null ? ACCENT_EDEFAULT : newAccent;
		boolean oldAccentESet = accentESet;
		accentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__ACCENT, oldAccent, accent, !oldAccentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAccent() {
		AccentType1 oldAccent = accent;
		boolean oldAccentESet = accentESet;
		accent = ACCENT_EDEFAULT;
		accentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MUNDEROVER_TYPE__ACCENT, oldAccent, ACCENT_EDEFAULT, oldAccentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAccent() {
		return accentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccentunderType getAccentunder() {
		return accentunder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccentunder(AccentunderType newAccentunder) {
		AccentunderType oldAccentunder = accentunder;
		accentunder = newAccentunder == null ? ACCENTUNDER_EDEFAULT : newAccentunder;
		boolean oldAccentunderESet = accentunderESet;
		accentunderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__ACCENTUNDER, oldAccentunder, accentunder, !oldAccentunderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAccentunder() {
		AccentunderType oldAccentunder = accentunder;
		boolean oldAccentunderESet = accentunderESet;
		accentunder = ACCENTUNDER_EDEFAULT;
		accentunderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MUNDEROVER_TYPE__ACCENTUNDER, oldAccentunder, ACCENTUNDER_EDEFAULT, oldAccentunderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAccentunder() {
		return accentunderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignType1 getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(AlignType1 newAlign) {
		AlignType1 oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlign() {
		AlignType1 oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MUNDEROVER_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAlign() {
		return alignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MUNDEROVER_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MUNDEROVER_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MUNDEROVER_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MUNDEROVER_TYPE__ACCENT:
				return getAccent();
			case MlPackage.MUNDEROVER_TYPE__ACCENTUNDER:
				return getAccentunder();
			case MlPackage.MUNDEROVER_TYPE__ALIGN:
				return getAlign();
			case MlPackage.MUNDEROVER_TYPE__CLASS:
				return getClass_();
			case MlPackage.MUNDEROVER_TYPE__HREF:
				return getHref();
			case MlPackage.MUNDEROVER_TYPE__ID:
				return getId();
			case MlPackage.MUNDEROVER_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MUNDEROVER_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MUNDEROVER_TYPE__OTHER:
				return getOther();
			case MlPackage.MUNDEROVER_TYPE__STYLE:
				return getStyle();
			case MlPackage.MUNDEROVER_TYPE__XREF:
				return getXref();
			case MlPackage.MUNDEROVER_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MUNDEROVER_TYPE__ACCENT:
				setAccent((AccentType1)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__ACCENTUNDER:
				setAccentunder((AccentunderType)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__ALIGN:
				setAlign((AlignType1)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MUNDEROVER_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MUNDEROVER_TYPE__ACCENT:
				unsetAccent();
				return;
			case MlPackage.MUNDEROVER_TYPE__ACCENTUNDER:
				unsetAccentunder();
				return;
			case MlPackage.MUNDEROVER_TYPE__ALIGN:
				unsetAlign();
				return;
			case MlPackage.MUNDEROVER_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MUNDEROVER_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MUNDEROVER_TYPE__ACCENT:
				return isSetAccent();
			case MlPackage.MUNDEROVER_TYPE__ACCENTUNDER:
				return isSetAccentunder();
			case MlPackage.MUNDEROVER_TYPE__ALIGN:
				return isSetAlign();
			case MlPackage.MUNDEROVER_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MUNDEROVER_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MUNDEROVER_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MUNDEROVER_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MUNDEROVER_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MUNDEROVER_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MUNDEROVER_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MUNDEROVER_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MUNDEROVER_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (accent: ");
		if (accentESet) result.append(accent); else result.append("<unset>");
		result.append(", accentunder: ");
		if (accentunderESet) result.append(accentunder); else result.append("<unset>");
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
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
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MunderoverTypeImpl
