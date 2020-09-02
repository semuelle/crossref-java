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

import org.w3._1998.math.math.ml.BevelledType;
import org.w3._1998.math.math.ml.DenomalignType;
import org.w3._1998.math.math.ml.MfracType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.NumalignType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mfrac Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getBevelled <em>Bevelled</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getDenomalign <em>Denomalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getLinethickness <em>Linethickness</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getNumalign <em>Numalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MfracTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MfracTypeImpl extends MinimalEObjectImpl.Container implements MfracType {
	/**
	 * The default value of the '{@link #getBevelled() <em>Bevelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBevelled()
	 * @generated
	 * @ordered
	 */
	protected static final BevelledType BEVELLED_EDEFAULT = BevelledType.TRUE;

	/**
	 * The cached value of the '{@link #getBevelled() <em>Bevelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBevelled()
	 * @generated
	 * @ordered
	 */
	protected BevelledType bevelled = BEVELLED_EDEFAULT;

	/**
	 * This is true if the Bevelled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bevelledESet;

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
	 * The default value of the '{@link #getDenomalign() <em>Denomalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenomalign()
	 * @generated
	 * @ordered
	 */
	protected static final DenomalignType DENOMALIGN_EDEFAULT = DenomalignType.LEFT;

	/**
	 * The cached value of the '{@link #getDenomalign() <em>Denomalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenomalign()
	 * @generated
	 * @ordered
	 */
	protected DenomalignType denomalign = DENOMALIGN_EDEFAULT;

	/**
	 * This is true if the Denomalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean denomalignESet;

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
	 * The default value of the '{@link #getLinethickness() <em>Linethickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinethickness()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINETHICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinethickness() <em>Linethickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinethickness()
	 * @generated
	 * @ordered
	 */
	protected Object linethickness = LINETHICKNESS_EDEFAULT;

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
	 * The default value of the '{@link #getNumalign() <em>Numalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumalign()
	 * @generated
	 * @ordered
	 */
	protected static final NumalignType NUMALIGN_EDEFAULT = NumalignType.LEFT;

	/**
	 * The cached value of the '{@link #getNumalign() <em>Numalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumalign()
	 * @generated
	 * @ordered
	 */
	protected NumalignType numalign = NUMALIGN_EDEFAULT;

	/**
	 * This is true if the Numalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numalignESet;

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
	protected MfracTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMfracType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BevelledType getBevelled() {
		return bevelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBevelled(BevelledType newBevelled) {
		BevelledType oldBevelled = bevelled;
		bevelled = newBevelled == null ? BEVELLED_EDEFAULT : newBevelled;
		boolean oldBevelledESet = bevelledESet;
		bevelledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__BEVELLED, oldBevelled, bevelled, !oldBevelledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBevelled() {
		BevelledType oldBevelled = bevelled;
		boolean oldBevelledESet = bevelledESet;
		bevelled = BEVELLED_EDEFAULT;
		bevelledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MFRAC_TYPE__BEVELLED, oldBevelled, BEVELLED_EDEFAULT, oldBevelledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBevelled() {
		return bevelledESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DenomalignType getDenomalign() {
		return denomalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDenomalign(DenomalignType newDenomalign) {
		DenomalignType oldDenomalign = denomalign;
		denomalign = newDenomalign == null ? DENOMALIGN_EDEFAULT : newDenomalign;
		boolean oldDenomalignESet = denomalignESet;
		denomalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__DENOMALIGN, oldDenomalign, denomalign, !oldDenomalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDenomalign() {
		DenomalignType oldDenomalign = denomalign;
		boolean oldDenomalignESet = denomalignESet;
		denomalign = DENOMALIGN_EDEFAULT;
		denomalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MFRAC_TYPE__DENOMALIGN, oldDenomalign, DENOMALIGN_EDEFAULT, oldDenomalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDenomalign() {
		return denomalignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLinethickness() {
		return linethickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinethickness(Object newLinethickness) {
		Object oldLinethickness = linethickness;
		linethickness = newLinethickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__LINETHICKNESS, oldLinethickness, linethickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumalignType getNumalign() {
		return numalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumalign(NumalignType newNumalign) {
		NumalignType oldNumalign = numalign;
		numalign = newNumalign == null ? NUMALIGN_EDEFAULT : newNumalign;
		boolean oldNumalignESet = numalignESet;
		numalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__NUMALIGN, oldNumalign, numalign, !oldNumalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNumalign() {
		NumalignType oldNumalign = numalign;
		boolean oldNumalignESet = numalignESet;
		numalign = NUMALIGN_EDEFAULT;
		numalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MFRAC_TYPE__NUMALIGN, oldNumalign, NUMALIGN_EDEFAULT, oldNumalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNumalign() {
		return numalignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MFRAC_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MFRAC_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MFRAC_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MFRAC_TYPE__BEVELLED:
				return getBevelled();
			case MlPackage.MFRAC_TYPE__CLASS:
				return getClass_();
			case MlPackage.MFRAC_TYPE__DENOMALIGN:
				return getDenomalign();
			case MlPackage.MFRAC_TYPE__HREF:
				return getHref();
			case MlPackage.MFRAC_TYPE__ID:
				return getId();
			case MlPackage.MFRAC_TYPE__LINETHICKNESS:
				return getLinethickness();
			case MlPackage.MFRAC_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MFRAC_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MFRAC_TYPE__NUMALIGN:
				return getNumalign();
			case MlPackage.MFRAC_TYPE__OTHER:
				return getOther();
			case MlPackage.MFRAC_TYPE__STYLE:
				return getStyle();
			case MlPackage.MFRAC_TYPE__XREF:
				return getXref();
			case MlPackage.MFRAC_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MFRAC_TYPE__BEVELLED:
				setBevelled((BevelledType)newValue);
				return;
			case MlPackage.MFRAC_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MFRAC_TYPE__DENOMALIGN:
				setDenomalign((DenomalignType)newValue);
				return;
			case MlPackage.MFRAC_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MFRAC_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MFRAC_TYPE__LINETHICKNESS:
				setLinethickness(newValue);
				return;
			case MlPackage.MFRAC_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MFRAC_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MFRAC_TYPE__NUMALIGN:
				setNumalign((NumalignType)newValue);
				return;
			case MlPackage.MFRAC_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MFRAC_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MFRAC_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MFRAC_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MFRAC_TYPE__BEVELLED:
				unsetBevelled();
				return;
			case MlPackage.MFRAC_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__DENOMALIGN:
				unsetDenomalign();
				return;
			case MlPackage.MFRAC_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__LINETHICKNESS:
				setLinethickness(LINETHICKNESS_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__NUMALIGN:
				unsetNumalign();
				return;
			case MlPackage.MFRAC_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MFRAC_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MFRAC_TYPE__BEVELLED:
				return isSetBevelled();
			case MlPackage.MFRAC_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MFRAC_TYPE__DENOMALIGN:
				return isSetDenomalign();
			case MlPackage.MFRAC_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MFRAC_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MFRAC_TYPE__LINETHICKNESS:
				return LINETHICKNESS_EDEFAULT == null ? linethickness != null : !LINETHICKNESS_EDEFAULT.equals(linethickness);
			case MlPackage.MFRAC_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MFRAC_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MFRAC_TYPE__NUMALIGN:
				return isSetNumalign();
			case MlPackage.MFRAC_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MFRAC_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MFRAC_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MFRAC_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (bevelled: ");
		if (bevelledESet) result.append(bevelled); else result.append("<unset>");
		result.append(", class: ");
		result.append(class_);
		result.append(", denomalign: ");
		if (denomalignESet) result.append(denomalign); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", linethickness: ");
		result.append(linethickness);
		result.append(", mathbackground: ");
		result.append(mathbackground);
		result.append(", mathcolor: ");
		result.append(mathcolor);
		result.append(", numalign: ");
		if (numalignESet) result.append(numalign); else result.append("<unset>");
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

} //MfracTypeImpl
