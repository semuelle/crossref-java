/**
 */
package org.w3._1998.math.math.ml.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.Columnalignstyle;
import org.w3._1998.math.math.ml.GroupAlignment;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.RowalignType2;
import org.w3._1998.math.math.ml.TableCellExpressionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getColumnalign <em>Columnalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getColumnspan <em>Columnspan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getGroupalign <em>Groupalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getRowalign <em>Rowalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.TableCellExpressionTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellExpressionTypeImpl extends ImpliedMrowImpl implements TableCellExpressionType {
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
	protected static final Columnalignstyle COLUMNALIGN_EDEFAULT = Columnalignstyle.LEFT;

	/**
	 * The cached value of the '{@link #getColumnalign() <em>Columnalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnalign()
	 * @generated
	 * @ordered
	 */
	protected Columnalignstyle columnalign = COLUMNALIGN_EDEFAULT;

	/**
	 * This is true if the Columnalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean columnalignESet;

	/**
	 * The default value of the '{@link #getColumnspan() <em>Columnspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnspan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMNSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnspan() <em>Columnspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnspan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger columnspan = COLUMNSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupalign() <em>Groupalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupalign()
	 * @generated
	 * @ordered
	 */
	protected static final List<GroupAlignment> GROUPALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupalign() <em>Groupalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupalign()
	 * @generated
	 * @ordered
	 */
	protected List<GroupAlignment> groupalign = GROUPALIGN_EDEFAULT;

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
	protected static final RowalignType2 ROWALIGN_EDEFAULT = RowalignType2.TOP;

	/**
	 * The cached value of the '{@link #getRowalign() <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowalign()
	 * @generated
	 * @ordered
	 */
	protected RowalignType2 rowalign = ROWALIGN_EDEFAULT;

	/**
	 * This is true if the Rowalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowalignESet;

	/**
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROWSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rowspan = ROWSPAN_EDEFAULT;

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
	protected TableCellExpressionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getTableCellExpressionType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Columnalignstyle getColumnalign() {
		return columnalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnalign(Columnalignstyle newColumnalign) {
		Columnalignstyle oldColumnalign = columnalign;
		columnalign = newColumnalign == null ? COLUMNALIGN_EDEFAULT : newColumnalign;
		boolean oldColumnalignESet = columnalignESet;
		columnalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNALIGN, oldColumnalign, columnalign, !oldColumnalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColumnalign() {
		Columnalignstyle oldColumnalign = columnalign;
		boolean oldColumnalignESet = columnalignESet;
		columnalign = COLUMNALIGN_EDEFAULT;
		columnalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNALIGN, oldColumnalign, COLUMNALIGN_EDEFAULT, oldColumnalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColumnalign() {
		return columnalignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getColumnspan() {
		return columnspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnspan(BigInteger newColumnspan) {
		BigInteger oldColumnspan = columnspan;
		columnspan = newColumnspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNSPAN, oldColumnspan, columnspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<GroupAlignment> getGroupalign() {
		return groupalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupalign(List<GroupAlignment> newGroupalign) {
		List<GroupAlignment> oldGroupalign = groupalign;
		groupalign = newGroupalign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__GROUPALIGN, oldGroupalign, groupalign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowalignType2 getRowalign() {
		return rowalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowalign(RowalignType2 newRowalign) {
		RowalignType2 oldRowalign = rowalign;
		rowalign = newRowalign == null ? ROWALIGN_EDEFAULT : newRowalign;
		boolean oldRowalignESet = rowalignESet;
		rowalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWALIGN, oldRowalign, rowalign, !oldRowalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRowalign() {
		RowalignType2 oldRowalign = rowalign;
		boolean oldRowalignESet = rowalignESet;
		rowalign = ROWALIGN_EDEFAULT;
		rowalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWALIGN, oldRowalign, ROWALIGN_EDEFAULT, oldRowalignESet));
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
	public BigInteger getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowspan(BigInteger newRowspan) {
		BigInteger oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWSPAN, oldRowspan, rowspan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.TABLE_CELL_EXPRESSION_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.TABLE_CELL_EXPRESSION_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__CLASS:
				return getClass_();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNALIGN:
				return getColumnalign();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNSPAN:
				return getColumnspan();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__GROUPALIGN:
				return getGroupalign();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__HREF:
				return getHref();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ID:
				return getId();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__OTHER:
				return getOther();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWALIGN:
				return getRowalign();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWSPAN:
				return getRowspan();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__STYLE:
				return getStyle();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__XREF:
				return getXref();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNALIGN:
				setColumnalign((Columnalignstyle)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNSPAN:
				setColumnspan((BigInteger)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__GROUPALIGN:
				setGroupalign((List<GroupAlignment>)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWALIGN:
				setRowalign((RowalignType2)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWSPAN:
				setRowspan((BigInteger)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNALIGN:
				unsetColumnalign();
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNSPAN:
				setColumnspan(COLUMNSPAN_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__GROUPALIGN:
				setGroupalign(GROUPALIGN_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWALIGN:
				unsetRowalign();
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNALIGN:
				return isSetColumnalign();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__COLUMNSPAN:
				return COLUMNSPAN_EDEFAULT == null ? columnspan != null : !COLUMNSPAN_EDEFAULT.equals(columnspan);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__GROUPALIGN:
				return GROUPALIGN_EDEFAULT == null ? groupalign != null : !GROUPALIGN_EDEFAULT.equals(groupalign);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWALIGN:
				return isSetRowalign();
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ROWSPAN:
				return ROWSPAN_EDEFAULT == null ? rowspan != null : !ROWSPAN_EDEFAULT.equals(rowspan);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.TABLE_CELL_EXPRESSION_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", columnalign: ");
		if (columnalignESet) result.append(columnalign); else result.append("<unset>");
		result.append(", columnspan: ");
		result.append(columnspan);
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
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", style: ");
		result.append(style);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TableCellExpressionTypeImpl
