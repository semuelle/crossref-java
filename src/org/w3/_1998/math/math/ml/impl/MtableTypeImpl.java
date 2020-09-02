/**
 */
package org.w3._1998.math.math.ml.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.AlignmentscopeTypeBaseItem;
import org.w3._1998.math.math.ml.Columnalignstyle;
import org.w3._1998.math.math.ml.DisplaystyleType;
import org.w3._1998.math.math.ml.EqualcolumnsType;
import org.w3._1998.math.math.ml.EqualrowsType;
import org.w3._1998.math.math.ml.Linestyle;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MtableType;
import org.w3._1998.math.math.ml.SideType;
import org.w3._1998.math.math.ml.Verticalalign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mtable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getTableRowExpressionGroup <em>Table Row Expression Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getTableRowExpression <em>Table Row Expression</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getAlignmentscope <em>Alignmentscope</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getColumnalign <em>Columnalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getColumnlines <em>Columnlines</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getColumnspacing <em>Columnspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getColumnwidth <em>Columnwidth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getDisplaystyle <em>Displaystyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getEqualcolumns <em>Equalcolumns</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getEqualrows <em>Equalrows</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getFramespacing <em>Framespacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getGroupalign <em>Groupalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getMinlabelspacing <em>Minlabelspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getRowalign <em>Rowalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getRowlines <em>Rowlines</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getRowspacing <em>Rowspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getSide <em>Side</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MtableTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MtableTypeImpl extends MinimalEObjectImpl.Container implements MtableType {
	/**
	 * The cached value of the '{@link #getTableRowExpressionGroup() <em>Table Row Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableRowExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap tableRowExpressionGroup;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected String align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignmentscope() <em>Alignmentscope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentscope()
	 * @generated
	 * @ordered
	 */
	protected static final List<AlignmentscopeTypeBaseItem> ALIGNMENTSCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignmentscope() <em>Alignmentscope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentscope()
	 * @generated
	 * @ordered
	 */
	protected List<AlignmentscopeTypeBaseItem> alignmentscope = ALIGNMENTSCOPE_EDEFAULT;

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
	 * The default value of the '{@link #getColumnlines() <em>Columnlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnlines()
	 * @generated
	 * @ordered
	 */
	protected static final List<Linestyle> COLUMNLINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnlines() <em>Columnlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnlines()
	 * @generated
	 * @ordered
	 */
	protected List<Linestyle> columnlines = COLUMNLINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnspacing() <em>Columnspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnspacing()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> COLUMNSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnspacing() <em>Columnspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnspacing()
	 * @generated
	 * @ordered
	 */
	protected List<String> columnspacing = COLUMNSPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnwidth() <em>Columnwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnwidth()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> COLUMNWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnwidth() <em>Columnwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnwidth()
	 * @generated
	 * @ordered
	 */
	protected List<Object> columnwidth = COLUMNWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplaystyle() <em>Displaystyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaystyle()
	 * @generated
	 * @ordered
	 */
	protected static final DisplaystyleType DISPLAYSTYLE_EDEFAULT = DisplaystyleType.TRUE;

	/**
	 * The cached value of the '{@link #getDisplaystyle() <em>Displaystyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaystyle()
	 * @generated
	 * @ordered
	 */
	protected DisplaystyleType displaystyle = DISPLAYSTYLE_EDEFAULT;

	/**
	 * This is true if the Displaystyle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displaystyleESet;

	/**
	 * The default value of the '{@link #getEqualcolumns() <em>Equalcolumns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualcolumns()
	 * @generated
	 * @ordered
	 */
	protected static final EqualcolumnsType EQUALCOLUMNS_EDEFAULT = EqualcolumnsType.TRUE;

	/**
	 * The cached value of the '{@link #getEqualcolumns() <em>Equalcolumns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualcolumns()
	 * @generated
	 * @ordered
	 */
	protected EqualcolumnsType equalcolumns = EQUALCOLUMNS_EDEFAULT;

	/**
	 * This is true if the Equalcolumns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equalcolumnsESet;

	/**
	 * The default value of the '{@link #getEqualrows() <em>Equalrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualrows()
	 * @generated
	 * @ordered
	 */
	protected static final EqualrowsType EQUALROWS_EDEFAULT = EqualrowsType.TRUE;

	/**
	 * The cached value of the '{@link #getEqualrows() <em>Equalrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualrows()
	 * @generated
	 * @ordered
	 */
	protected EqualrowsType equalrows = EQUALROWS_EDEFAULT;

	/**
	 * This is true if the Equalrows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equalrowsESet;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final Linestyle FRAME_EDEFAULT = Linestyle.NONE;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Linestyle frame = FRAME_EDEFAULT;

	/**
	 * This is true if the Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameESet;

	/**
	 * The default value of the '{@link #getFramespacing() <em>Framespacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramespacing()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> FRAMESPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramespacing() <em>Framespacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramespacing()
	 * @generated
	 * @ordered
	 */
	protected List<String> framespacing = FRAMESPACING_EDEFAULT;

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
	 * The default value of the '{@link #getMinlabelspacing() <em>Minlabelspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinlabelspacing()
	 * @generated
	 * @ordered
	 */
	protected static final String MINLABELSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinlabelspacing() <em>Minlabelspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinlabelspacing()
	 * @generated
	 * @ordered
	 */
	protected String minlabelspacing = MINLABELSPACING_EDEFAULT;

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
	protected static final List<Verticalalign> ROWALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowalign() <em>Rowalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowalign()
	 * @generated
	 * @ordered
	 */
	protected List<Verticalalign> rowalign = ROWALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowlines() <em>Rowlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowlines()
	 * @generated
	 * @ordered
	 */
	protected static final List<Linestyle> ROWLINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowlines() <em>Rowlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowlines()
	 * @generated
	 * @ordered
	 */
	protected List<Linestyle> rowlines = ROWLINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowspacing() <em>Rowspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspacing()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> ROWSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowspacing() <em>Rowspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspacing()
	 * @generated
	 * @ordered
	 */
	protected List<String> rowspacing = ROWSPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final SideType SIDE_EDEFAULT = SideType.LEFT;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected SideType side = SIDE_EDEFAULT;

	/**
	 * This is true if the Side attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sideESet;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width = WIDTH_EDEFAULT;

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
	protected MtableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMtableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTableRowExpressionGroup() {
		if (tableRowExpressionGroup == null) {
			tableRowExpressionGroup = new BasicFeatureMap(this, MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION_GROUP);
		}
		return tableRowExpressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTableRowExpression() {
		return getTableRowExpressionGroup().list(MlPackage.eINSTANCE.getMtableType_TableRowExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(String newAlign) {
		String oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<AlignmentscopeTypeBaseItem> getAlignmentscope() {
		return alignmentscope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignmentscope(List<AlignmentscopeTypeBaseItem> newAlignmentscope) {
		List<AlignmentscopeTypeBaseItem> oldAlignmentscope = alignmentscope;
		alignmentscope = newAlignmentscope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__ALIGNMENTSCOPE, oldAlignmentscope, alignmentscope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__COLUMNALIGN, oldColumnalign, columnalign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Linestyle> getColumnlines() {
		return columnlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnlines(List<Linestyle> newColumnlines) {
		List<Linestyle> oldColumnlines = columnlines;
		columnlines = newColumnlines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__COLUMNLINES, oldColumnlines, columnlines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getColumnspacing() {
		return columnspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnspacing(List<String> newColumnspacing) {
		List<String> oldColumnspacing = columnspacing;
		columnspacing = newColumnspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__COLUMNSPACING, oldColumnspacing, columnspacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Object> getColumnwidth() {
		return columnwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnwidth(List<Object> newColumnwidth) {
		List<Object> oldColumnwidth = columnwidth;
		columnwidth = newColumnwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__COLUMNWIDTH, oldColumnwidth, columnwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplaystyleType getDisplaystyle() {
		return displaystyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplaystyle(DisplaystyleType newDisplaystyle) {
		DisplaystyleType oldDisplaystyle = displaystyle;
		displaystyle = newDisplaystyle == null ? DISPLAYSTYLE_EDEFAULT : newDisplaystyle;
		boolean oldDisplaystyleESet = displaystyleESet;
		displaystyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__DISPLAYSTYLE, oldDisplaystyle, displaystyle, !oldDisplaystyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplaystyle() {
		DisplaystyleType oldDisplaystyle = displaystyle;
		boolean oldDisplaystyleESet = displaystyleESet;
		displaystyle = DISPLAYSTYLE_EDEFAULT;
		displaystyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MTABLE_TYPE__DISPLAYSTYLE, oldDisplaystyle, DISPLAYSTYLE_EDEFAULT, oldDisplaystyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDisplaystyle() {
		return displaystyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualcolumnsType getEqualcolumns() {
		return equalcolumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualcolumns(EqualcolumnsType newEqualcolumns) {
		EqualcolumnsType oldEqualcolumns = equalcolumns;
		equalcolumns = newEqualcolumns == null ? EQUALCOLUMNS_EDEFAULT : newEqualcolumns;
		boolean oldEqualcolumnsESet = equalcolumnsESet;
		equalcolumnsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__EQUALCOLUMNS, oldEqualcolumns, equalcolumns, !oldEqualcolumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEqualcolumns() {
		EqualcolumnsType oldEqualcolumns = equalcolumns;
		boolean oldEqualcolumnsESet = equalcolumnsESet;
		equalcolumns = EQUALCOLUMNS_EDEFAULT;
		equalcolumnsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MTABLE_TYPE__EQUALCOLUMNS, oldEqualcolumns, EQUALCOLUMNS_EDEFAULT, oldEqualcolumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEqualcolumns() {
		return equalcolumnsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualrowsType getEqualrows() {
		return equalrows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualrows(EqualrowsType newEqualrows) {
		EqualrowsType oldEqualrows = equalrows;
		equalrows = newEqualrows == null ? EQUALROWS_EDEFAULT : newEqualrows;
		boolean oldEqualrowsESet = equalrowsESet;
		equalrowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__EQUALROWS, oldEqualrows, equalrows, !oldEqualrowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEqualrows() {
		EqualrowsType oldEqualrows = equalrows;
		boolean oldEqualrowsESet = equalrowsESet;
		equalrows = EQUALROWS_EDEFAULT;
		equalrowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MTABLE_TYPE__EQUALROWS, oldEqualrows, EQUALROWS_EDEFAULT, oldEqualrowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEqualrows() {
		return equalrowsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linestyle getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(Linestyle newFrame) {
		Linestyle oldFrame = frame;
		frame = newFrame == null ? FRAME_EDEFAULT : newFrame;
		boolean oldFrameESet = frameESet;
		frameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__FRAME, oldFrame, frame, !oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrame() {
		Linestyle oldFrame = frame;
		boolean oldFrameESet = frameESet;
		frame = FRAME_EDEFAULT;
		frameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MTABLE_TYPE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrame() {
		return frameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFramespacing() {
		return framespacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramespacing(List<String> newFramespacing) {
		List<String> oldFramespacing = framespacing;
		framespacing = newFramespacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__FRAMESPACING, oldFramespacing, framespacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__GROUPALIGN, oldGroupalign, groupalign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinlabelspacing() {
		return minlabelspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinlabelspacing(String newMinlabelspacing) {
		String oldMinlabelspacing = minlabelspacing;
		minlabelspacing = newMinlabelspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__MINLABELSPACING, oldMinlabelspacing, minlabelspacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Verticalalign> getRowalign() {
		return rowalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowalign(List<Verticalalign> newRowalign) {
		List<Verticalalign> oldRowalign = rowalign;
		rowalign = newRowalign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__ROWALIGN, oldRowalign, rowalign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Linestyle> getRowlines() {
		return rowlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowlines(List<Linestyle> newRowlines) {
		List<Linestyle> oldRowlines = rowlines;
		rowlines = newRowlines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__ROWLINES, oldRowlines, rowlines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRowspacing() {
		return rowspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowspacing(List<String> newRowspacing) {
		List<String> oldRowspacing = rowspacing;
		rowspacing = newRowspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__ROWSPACING, oldRowspacing, rowspacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideType getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSide(SideType newSide) {
		SideType oldSide = side;
		side = newSide == null ? SIDE_EDEFAULT : newSide;
		boolean oldSideESet = sideESet;
		sideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__SIDE, oldSide, side, !oldSideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSide() {
		SideType oldSide = side;
		boolean oldSideESet = sideESet;
		side = SIDE_EDEFAULT;
		sideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MTABLE_TYPE__SIDE, oldSide, SIDE_EDEFAULT, oldSideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSide() {
		return sideESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MTABLE_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MTABLE_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION_GROUP:
				return ((InternalEList<?>)getTableRowExpressionGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION:
				return ((InternalEList<?>)getTableRowExpression()).basicRemove(otherEnd, msgs);
			case MlPackage.MTABLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION_GROUP:
				if (coreType) return getTableRowExpressionGroup();
				return ((FeatureMap.Internal)getTableRowExpressionGroup()).getWrapper();
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION:
				return getTableRowExpression();
			case MlPackage.MTABLE_TYPE__ALIGN:
				return getAlign();
			case MlPackage.MTABLE_TYPE__ALIGNMENTSCOPE:
				return getAlignmentscope();
			case MlPackage.MTABLE_TYPE__CLASS:
				return getClass_();
			case MlPackage.MTABLE_TYPE__COLUMNALIGN:
				return getColumnalign();
			case MlPackage.MTABLE_TYPE__COLUMNLINES:
				return getColumnlines();
			case MlPackage.MTABLE_TYPE__COLUMNSPACING:
				return getColumnspacing();
			case MlPackage.MTABLE_TYPE__COLUMNWIDTH:
				return getColumnwidth();
			case MlPackage.MTABLE_TYPE__DISPLAYSTYLE:
				return getDisplaystyle();
			case MlPackage.MTABLE_TYPE__EQUALCOLUMNS:
				return getEqualcolumns();
			case MlPackage.MTABLE_TYPE__EQUALROWS:
				return getEqualrows();
			case MlPackage.MTABLE_TYPE__FRAME:
				return getFrame();
			case MlPackage.MTABLE_TYPE__FRAMESPACING:
				return getFramespacing();
			case MlPackage.MTABLE_TYPE__GROUPALIGN:
				return getGroupalign();
			case MlPackage.MTABLE_TYPE__HREF:
				return getHref();
			case MlPackage.MTABLE_TYPE__ID:
				return getId();
			case MlPackage.MTABLE_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MTABLE_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MTABLE_TYPE__MINLABELSPACING:
				return getMinlabelspacing();
			case MlPackage.MTABLE_TYPE__OTHER:
				return getOther();
			case MlPackage.MTABLE_TYPE__ROWALIGN:
				return getRowalign();
			case MlPackage.MTABLE_TYPE__ROWLINES:
				return getRowlines();
			case MlPackage.MTABLE_TYPE__ROWSPACING:
				return getRowspacing();
			case MlPackage.MTABLE_TYPE__SIDE:
				return getSide();
			case MlPackage.MTABLE_TYPE__STYLE:
				return getStyle();
			case MlPackage.MTABLE_TYPE__WIDTH:
				return getWidth();
			case MlPackage.MTABLE_TYPE__XREF:
				return getXref();
			case MlPackage.MTABLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION_GROUP:
				((FeatureMap.Internal)getTableRowExpressionGroup()).set(newValue);
				return;
			case MlPackage.MTABLE_TYPE__ALIGN:
				setAlign((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__ALIGNMENTSCOPE:
				setAlignmentscope((List<AlignmentscopeTypeBaseItem>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNALIGN:
				setColumnalign((List<Columnalignstyle>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNLINES:
				setColumnlines((List<Linestyle>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNSPACING:
				setColumnspacing((List<String>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNWIDTH:
				setColumnwidth((List<Object>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__DISPLAYSTYLE:
				setDisplaystyle((DisplaystyleType)newValue);
				return;
			case MlPackage.MTABLE_TYPE__EQUALCOLUMNS:
				setEqualcolumns((EqualcolumnsType)newValue);
				return;
			case MlPackage.MTABLE_TYPE__EQUALROWS:
				setEqualrows((EqualrowsType)newValue);
				return;
			case MlPackage.MTABLE_TYPE__FRAME:
				setFrame((Linestyle)newValue);
				return;
			case MlPackage.MTABLE_TYPE__FRAMESPACING:
				setFramespacing((List<String>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__GROUPALIGN:
				setGroupalign((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MTABLE_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__MINLABELSPACING:
				setMinlabelspacing((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MTABLE_TYPE__ROWALIGN:
				setRowalign((List<Verticalalign>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__ROWLINES:
				setRowlines((List<Linestyle>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__ROWSPACING:
				setRowspacing((List<String>)newValue);
				return;
			case MlPackage.MTABLE_TYPE__SIDE:
				setSide((SideType)newValue);
				return;
			case MlPackage.MTABLE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MTABLE_TYPE__WIDTH:
				setWidth(newValue);
				return;
			case MlPackage.MTABLE_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MTABLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION_GROUP:
				getTableRowExpressionGroup().clear();
				return;
			case MlPackage.MTABLE_TYPE__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__ALIGNMENTSCOPE:
				setAlignmentscope(ALIGNMENTSCOPE_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNALIGN:
				setColumnalign(COLUMNALIGN_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNLINES:
				setColumnlines(COLUMNLINES_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNSPACING:
				setColumnspacing(COLUMNSPACING_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__COLUMNWIDTH:
				setColumnwidth(COLUMNWIDTH_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__DISPLAYSTYLE:
				unsetDisplaystyle();
				return;
			case MlPackage.MTABLE_TYPE__EQUALCOLUMNS:
				unsetEqualcolumns();
				return;
			case MlPackage.MTABLE_TYPE__EQUALROWS:
				unsetEqualrows();
				return;
			case MlPackage.MTABLE_TYPE__FRAME:
				unsetFrame();
				return;
			case MlPackage.MTABLE_TYPE__FRAMESPACING:
				setFramespacing(FRAMESPACING_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__GROUPALIGN:
				setGroupalign(GROUPALIGN_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__MINLABELSPACING:
				setMinlabelspacing(MINLABELSPACING_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__ROWALIGN:
				setRowalign(ROWALIGN_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__ROWLINES:
				setRowlines(ROWLINES_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__ROWSPACING:
				setRowspacing(ROWSPACING_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__SIDE:
				unsetSide();
				return;
			case MlPackage.MTABLE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MTABLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION_GROUP:
				return tableRowExpressionGroup != null && !tableRowExpressionGroup.isEmpty();
			case MlPackage.MTABLE_TYPE__TABLE_ROW_EXPRESSION:
				return !getTableRowExpression().isEmpty();
			case MlPackage.MTABLE_TYPE__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case MlPackage.MTABLE_TYPE__ALIGNMENTSCOPE:
				return ALIGNMENTSCOPE_EDEFAULT == null ? alignmentscope != null : !ALIGNMENTSCOPE_EDEFAULT.equals(alignmentscope);
			case MlPackage.MTABLE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MTABLE_TYPE__COLUMNALIGN:
				return COLUMNALIGN_EDEFAULT == null ? columnalign != null : !COLUMNALIGN_EDEFAULT.equals(columnalign);
			case MlPackage.MTABLE_TYPE__COLUMNLINES:
				return COLUMNLINES_EDEFAULT == null ? columnlines != null : !COLUMNLINES_EDEFAULT.equals(columnlines);
			case MlPackage.MTABLE_TYPE__COLUMNSPACING:
				return COLUMNSPACING_EDEFAULT == null ? columnspacing != null : !COLUMNSPACING_EDEFAULT.equals(columnspacing);
			case MlPackage.MTABLE_TYPE__COLUMNWIDTH:
				return COLUMNWIDTH_EDEFAULT == null ? columnwidth != null : !COLUMNWIDTH_EDEFAULT.equals(columnwidth);
			case MlPackage.MTABLE_TYPE__DISPLAYSTYLE:
				return isSetDisplaystyle();
			case MlPackage.MTABLE_TYPE__EQUALCOLUMNS:
				return isSetEqualcolumns();
			case MlPackage.MTABLE_TYPE__EQUALROWS:
				return isSetEqualrows();
			case MlPackage.MTABLE_TYPE__FRAME:
				return isSetFrame();
			case MlPackage.MTABLE_TYPE__FRAMESPACING:
				return FRAMESPACING_EDEFAULT == null ? framespacing != null : !FRAMESPACING_EDEFAULT.equals(framespacing);
			case MlPackage.MTABLE_TYPE__GROUPALIGN:
				return GROUPALIGN_EDEFAULT == null ? groupalign != null : !GROUPALIGN_EDEFAULT.equals(groupalign);
			case MlPackage.MTABLE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MTABLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MTABLE_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MTABLE_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MTABLE_TYPE__MINLABELSPACING:
				return MINLABELSPACING_EDEFAULT == null ? minlabelspacing != null : !MINLABELSPACING_EDEFAULT.equals(minlabelspacing);
			case MlPackage.MTABLE_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MTABLE_TYPE__ROWALIGN:
				return ROWALIGN_EDEFAULT == null ? rowalign != null : !ROWALIGN_EDEFAULT.equals(rowalign);
			case MlPackage.MTABLE_TYPE__ROWLINES:
				return ROWLINES_EDEFAULT == null ? rowlines != null : !ROWLINES_EDEFAULT.equals(rowlines);
			case MlPackage.MTABLE_TYPE__ROWSPACING:
				return ROWSPACING_EDEFAULT == null ? rowspacing != null : !ROWSPACING_EDEFAULT.equals(rowspacing);
			case MlPackage.MTABLE_TYPE__SIDE:
				return isSetSide();
			case MlPackage.MTABLE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MTABLE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case MlPackage.MTABLE_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MTABLE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (tableRowExpressionGroup: ");
		result.append(tableRowExpressionGroup);
		result.append(", align: ");
		result.append(align);
		result.append(", alignmentscope: ");
		result.append(alignmentscope);
		result.append(", class: ");
		result.append(class_);
		result.append(", columnalign: ");
		result.append(columnalign);
		result.append(", columnlines: ");
		result.append(columnlines);
		result.append(", columnspacing: ");
		result.append(columnspacing);
		result.append(", columnwidth: ");
		result.append(columnwidth);
		result.append(", displaystyle: ");
		if (displaystyleESet) result.append(displaystyle); else result.append("<unset>");
		result.append(", equalcolumns: ");
		if (equalcolumnsESet) result.append(equalcolumns); else result.append("<unset>");
		result.append(", equalrows: ");
		if (equalrowsESet) result.append(equalrows); else result.append("<unset>");
		result.append(", frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(", framespacing: ");
		result.append(framespacing);
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
		result.append(", minlabelspacing: ");
		result.append(minlabelspacing);
		result.append(", other: ");
		result.append(other);
		result.append(", rowalign: ");
		result.append(rowalign);
		result.append(", rowlines: ");
		result.append(rowlines);
		result.append(", rowspacing: ");
		result.append(rowspacing);
		result.append(", side: ");
		if (sideESet) result.append(side); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", width: ");
		result.append(width);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MtableTypeImpl
