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

import org.w3._1998.math.math.ml.CrossoutTypeItem;
import org.w3._1998.math.math.ml.LocationType1;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MscarryType;
import org.w3._1998.math.math.ml.NoneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mscarry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getMsrowExpression <em>Msrow Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getNone <em>None</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getCrossout <em>Crossout</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MscarryTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MscarryTypeImpl extends MinimalEObjectImpl.Container implements MscarryType {
	/**
	 * The cached value of the '{@link #getMsrowExpression() <em>Msrow Expression</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsrowExpression()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap msrowExpression;

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
	 * The default value of the '{@link #getCrossout() <em>Crossout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossout()
	 * @generated
	 * @ordered
	 */
	protected static final List<CrossoutTypeItem> CROSSOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossout() <em>Crossout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossout()
	 * @generated
	 * @ordered
	 */
	protected List<CrossoutTypeItem> crossout = CROSSOUT_EDEFAULT;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final LocationType1 LOCATION_EDEFAULT = LocationType1.W;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationType1 location = LOCATION_EDEFAULT;

	/**
	 * This is true if the Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationESet;

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
	protected MscarryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMscarryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMsrowExpression() {
		if (msrowExpression == null) {
			msrowExpression = new BasicFeatureMap(this, MlPackage.MSCARRY_TYPE__MSROW_EXPRESSION);
		}
		return msrowExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneType> getNone() {
		return getMsrowExpression().list(MlPackage.eINSTANCE.getMscarryType_None());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<CrossoutTypeItem> getCrossout() {
		return crossout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossout(List<CrossoutTypeItem> newCrossout) {
		List<CrossoutTypeItem> oldCrossout = crossout;
		crossout = newCrossout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__CROSSOUT, oldCrossout, crossout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationType1 getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(LocationType1 newLocation) {
		LocationType1 oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		boolean oldLocationESet = locationESet;
		locationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__LOCATION, oldLocation, location, !oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLocation() {
		LocationType1 oldLocation = location;
		boolean oldLocationESet = locationESet;
		location = LOCATION_EDEFAULT;
		locationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSCARRY_TYPE__LOCATION, oldLocation, LOCATION_EDEFAULT, oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLocation() {
		return locationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSCARRY_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MSCARRY_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MSCARRY_TYPE__MSROW_EXPRESSION:
				return ((InternalEList<?>)getMsrowExpression()).basicRemove(otherEnd, msgs);
			case MlPackage.MSCARRY_TYPE__NONE:
				return ((InternalEList<?>)getNone()).basicRemove(otherEnd, msgs);
			case MlPackage.MSCARRY_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSCARRY_TYPE__MSROW_EXPRESSION:
				if (coreType) return getMsrowExpression();
				return ((FeatureMap.Internal)getMsrowExpression()).getWrapper();
			case MlPackage.MSCARRY_TYPE__NONE:
				return getNone();
			case MlPackage.MSCARRY_TYPE__CLASS:
				return getClass_();
			case MlPackage.MSCARRY_TYPE__CROSSOUT:
				return getCrossout();
			case MlPackage.MSCARRY_TYPE__HREF:
				return getHref();
			case MlPackage.MSCARRY_TYPE__ID:
				return getId();
			case MlPackage.MSCARRY_TYPE__LOCATION:
				return getLocation();
			case MlPackage.MSCARRY_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MSCARRY_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MSCARRY_TYPE__OTHER:
				return getOther();
			case MlPackage.MSCARRY_TYPE__STYLE:
				return getStyle();
			case MlPackage.MSCARRY_TYPE__XREF:
				return getXref();
			case MlPackage.MSCARRY_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSCARRY_TYPE__MSROW_EXPRESSION:
				((FeatureMap.Internal)getMsrowExpression()).set(newValue);
				return;
			case MlPackage.MSCARRY_TYPE__NONE:
				getNone().clear();
				getNone().addAll((Collection<? extends NoneType>)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__CROSSOUT:
				setCrossout((List<CrossoutTypeItem>)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__LOCATION:
				setLocation((LocationType1)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MSCARRY_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MSCARRY_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MSCARRY_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MSCARRY_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSCARRY_TYPE__MSROW_EXPRESSION:
				getMsrowExpression().clear();
				return;
			case MlPackage.MSCARRY_TYPE__NONE:
				getNone().clear();
				return;
			case MlPackage.MSCARRY_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__CROSSOUT:
				setCrossout(CROSSOUT_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__LOCATION:
				unsetLocation();
				return;
			case MlPackage.MSCARRY_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MSCARRY_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSCARRY_TYPE__MSROW_EXPRESSION:
				return msrowExpression != null && !msrowExpression.isEmpty();
			case MlPackage.MSCARRY_TYPE__NONE:
				return !getNone().isEmpty();
			case MlPackage.MSCARRY_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MSCARRY_TYPE__CROSSOUT:
				return CROSSOUT_EDEFAULT == null ? crossout != null : !CROSSOUT_EDEFAULT.equals(crossout);
			case MlPackage.MSCARRY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MSCARRY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MSCARRY_TYPE__LOCATION:
				return isSetLocation();
			case MlPackage.MSCARRY_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MSCARRY_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MSCARRY_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MSCARRY_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MSCARRY_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MSCARRY_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (msrowExpression: ");
		result.append(msrowExpression);
		result.append(", class: ");
		result.append(class_);
		result.append(", crossout: ");
		result.append(crossout);
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", location: ");
		if (locationESet) result.append(location); else result.append("<unset>");
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

} //MscarryTypeImpl
