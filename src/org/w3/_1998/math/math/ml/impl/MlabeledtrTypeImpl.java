/**
 */
package org.w3._1998.math.math.ml.impl;

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

import org.w3._1998.math.math.ml.Columnalignstyle;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MlabeledtrType;
import org.w3._1998.math.math.ml.RowalignType;
import org.w3._1998.math.math.ml.TableCellExpressionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mlabeledtr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getTableCellExpressionGroup <em>Table Cell Expression Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getTableCellExpression <em>Table Cell Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getColumnalign <em>Columnalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getGroupalign <em>Groupalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getRowalign <em>Rowalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MlabeledtrTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MlabeledtrTypeImpl extends MinimalEObjectImpl.Container implements MlabeledtrType {
	/**
	 * The cached value of the '{@link #getTableCellExpressionGroup() <em>Table Cell Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCellExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap tableCellExpressionGroup;

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
	 * The default value of the '{@link #getColumnalign() <em>Columnalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnalign()
	 * @generated
	 * @ordered
	 */
	protected static final List<Columnalignstyle> COLUMNALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnalign() <em>Columnalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnalign()
	 * @generated
	 * @ordered
	 */
	protected List<Columnalignstyle> columnalign = COLUMNALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupalign() <em>Groupalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupalign()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupalign() <em>Groupalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupalign()
	 * @generated
	 * @ordered
	 */
	protected String groupalign = GROUPALIGN_EDEFAULT;

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
	 * The default value of the '{@link #getRowalign() <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowalign()
	 * @generated
	 * @ordered
	 */
	protected static final RowalignType ROWALIGN_EDEFAULT = RowalignType.TOP;

	/**
	 * The cached value of the '{@link #getRowalign() <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowalign()
	 * @generated
	 * @ordered
	 */
	protected RowalignType rowalign = ROWALIGN_EDEFAULT;

	/**
	 * This is true if the Rowalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowalignESet;

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
	protected MlabeledtrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMlabeledtrType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTableCellExpressionGroup() {
		if (tableCellExpressionGroup == null) {
			tableCellExpressionGroup = new BasicFeatureMap(this, MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION_GROUP);
		}
		return tableCellExpressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableCellExpressionType> getTableCellExpression() {
		return getTableCellExpressionGroup().list(MlPackage.eINSTANCE.getMlabeledtrType_TableCellExpression());
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Columnalignstyle> getColumnalign() {
		return columnalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnalign(List<Columnalignstyle> newColumnalign) {
		List<Columnalignstyle> oldColumnalign = columnalign;
		columnalign = newColumnalign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__COLUMNALIGN, oldColumnalign, columnalign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupalign() {
		return groupalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupalign(String newGroupalign) {
		String oldGroupalign = groupalign;
		groupalign = newGroupalign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__GROUPALIGN, oldGroupalign, groupalign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowalignType getRowalign() {
		return rowalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowalign(RowalignType newRowalign) {
		RowalignType oldRowalign = rowalign;
		rowalign = newRowalign == null ? ROWALIGN_EDEFAULT : newRowalign;
		boolean oldRowalignESet = rowalignESet;
		rowalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__ROWALIGN, oldRowalign, rowalign, !oldRowalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRowalign() {
		RowalignType oldRowalign = rowalign;
		boolean oldRowalignESet = rowalignESet;
		rowalign = ROWALIGN_EDEFAULT;
		rowalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MLABELEDTR_TYPE__ROWALIGN, oldRowalign, ROWALIGN_EDEFAULT, oldRowalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRowalign() {
		return rowalignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MLABELEDTR_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MLABELEDTR_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION_GROUP:
				return ((InternalEList<?>)getTableCellExpressionGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION:
				return ((InternalEList<?>)getTableCellExpression()).basicRemove(otherEnd, msgs);
			case MlPackage.MLABELEDTR_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION_GROUP:
				if (coreType) return getTableCellExpressionGroup();
				return ((FeatureMap.Internal)getTableCellExpressionGroup()).getWrapper();
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION:
				return getTableCellExpression();
			case MlPackage.MLABELEDTR_TYPE__CLASS:
				return getClass_();
			case MlPackage.MLABELEDTR_TYPE__COLUMNALIGN:
				return getColumnalign();
			case MlPackage.MLABELEDTR_TYPE__GROUPALIGN:
				return getGroupalign();
			case MlPackage.MLABELEDTR_TYPE__HREF:
				return getHref();
			case MlPackage.MLABELEDTR_TYPE__ID:
				return getId();
			case MlPackage.MLABELEDTR_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MLABELEDTR_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MLABELEDTR_TYPE__OTHER:
				return getOther();
			case MlPackage.MLABELEDTR_TYPE__ROWALIGN:
				return getRowalign();
			case MlPackage.MLABELEDTR_TYPE__STYLE:
				return getStyle();
			case MlPackage.MLABELEDTR_TYPE__XREF:
				return getXref();
			case MlPackage.MLABELEDTR_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION_GROUP:
				((FeatureMap.Internal)getTableCellExpressionGroup()).set(newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__COLUMNALIGN:
				setColumnalign((List<Columnalignstyle>)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__GROUPALIGN:
				setGroupalign((String)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__ROWALIGN:
				setRowalign((RowalignType)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MLABELEDTR_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION_GROUP:
				getTableCellExpressionGroup().clear();
				return;
			case MlPackage.MLABELEDTR_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__COLUMNALIGN:
				setColumnalign(COLUMNALIGN_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__GROUPALIGN:
				setGroupalign(GROUPALIGN_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__ROWALIGN:
				unsetRowalign();
				return;
			case MlPackage.MLABELEDTR_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MLABELEDTR_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION_GROUP:
				return tableCellExpressionGroup != null && !tableCellExpressionGroup.isEmpty();
			case MlPackage.MLABELEDTR_TYPE__TABLE_CELL_EXPRESSION:
				return !getTableCellExpression().isEmpty();
			case MlPackage.MLABELEDTR_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MLABELEDTR_TYPE__COLUMNALIGN:
				return COLUMNALIGN_EDEFAULT == null ? columnalign != null : !COLUMNALIGN_EDEFAULT.equals(columnalign);
			case MlPackage.MLABELEDTR_TYPE__GROUPALIGN:
				return GROUPALIGN_EDEFAULT == null ? groupalign != null : !GROUPALIGN_EDEFAULT.equals(groupalign);
			case MlPackage.MLABELEDTR_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MLABELEDTR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MLABELEDTR_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MLABELEDTR_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MLABELEDTR_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MLABELEDTR_TYPE__ROWALIGN:
				return isSetRowalign();
			case MlPackage.MLABELEDTR_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MLABELEDTR_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MLABELEDTR_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (tableCellExpressionGroup: ");
		result.append(tableCellExpressionGroup);
		result.append(", class: ");
		result.append(class_);
		result.append(", columnalign: ");
		result.append(columnalign);
		result.append(", groupalign: ");
		result.append(groupalign);
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
		result.append(", rowalign: ");
		if (rowalignESet) result.append(rowalign); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MlabeledtrTypeImpl
