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

import org.w3._1998.math.math.ml.AccentType2;
import org.w3._1998.math.math.ml.DirType1;
import org.w3._1998.math.math.ml.FenceType;
import org.w3._1998.math.math.ml.FontstyleType;
import org.w3._1998.math.math.ml.FontweightType;
import org.w3._1998.math.math.ml.FormType;
import org.w3._1998.math.math.ml.IndentalignType;
import org.w3._1998.math.math.ml.IndentalignfirstType;
import org.w3._1998.math.math.ml.IndentalignlastType1;
import org.w3._1998.math.math.ml.LargeopType;
import org.w3._1998.math.math.ml.LinebreakType1;
import org.w3._1998.math.math.ml.LinebreakstyleType;
import org.w3._1998.math.math.ml.MalignmarkType;
import org.w3._1998.math.math.ml.MathvariantType;
import org.w3._1998.math.math.ml.MglyphType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MoType;
import org.w3._1998.math.math.ml.MovablelimitsType;
import org.w3._1998.math.math.ml.SeparatorType;
import org.w3._1998.math.math.ml.StretchyType;
import org.w3._1998.math.math.ml.SymmetricType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mo Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMglyph <em>Mglyph</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMalignmark <em>Malignmark</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getAccent <em>Accent</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getFence <em>Fence</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndentalign <em>Indentalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndentalignfirst <em>Indentalignfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndentalignlast <em>Indentalignlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndentshift <em>Indentshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndentshiftfirst <em>Indentshiftfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndentshiftlast <em>Indentshiftlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getIndenttarget <em>Indenttarget</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getLargeop <em>Largeop</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getLinebreak <em>Linebreak</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getLinebreakmultchar <em>Linebreakmultchar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getLinebreakstyle <em>Linebreakstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getLineleading <em>Lineleading</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getLspace <em>Lspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMaxsize <em>Maxsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMinsize <em>Minsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getMovablelimits <em>Movablelimits</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getRspace <em>Rspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getStretchy <em>Stretchy</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getSymmetric <em>Symmetric</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MoTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoTypeImpl extends MinimalEObjectImpl.Container implements MoType {
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
	 * The default value of the '{@link #getAccent() <em>Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccent()
	 * @generated
	 * @ordered
	 */
	protected static final AccentType2 ACCENT_EDEFAULT = AccentType2.TRUE;

	/**
	 * The cached value of the '{@link #getAccent() <em>Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccent()
	 * @generated
	 * @ordered
	 */
	protected AccentType2 accent = ACCENT_EDEFAULT;

	/**
	 * This is true if the Accent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accentESet;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final Object BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Object background = BACKGROUND_EDEFAULT;

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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType1 DIR_EDEFAULT = DirType1.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType1 dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getFence() <em>Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFence()
	 * @generated
	 * @ordered
	 */
	protected static final FenceType FENCE_EDEFAULT = FenceType.TRUE;

	/**
	 * The cached value of the '{@link #getFence() <em>Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFence()
	 * @generated
	 * @ordered
	 */
	protected FenceType fence = FENCE_EDEFAULT;

	/**
	 * This is true if the Fence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fenceESet;

	/**
	 * The default value of the '{@link #getFontfamily() <em>Fontfamily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontfamily()
	 * @generated
	 * @ordered
	 */
	protected static final Object FONTFAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontfamily() <em>Fontfamily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontfamily()
	 * @generated
	 * @ordered
	 */
	protected Object fontfamily = FONTFAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontsize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONTSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontsize()
	 * @generated
	 * @ordered
	 */
	protected String fontsize = FONTSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontstyle() <em>Fontstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontstyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontstyleType FONTSTYLE_EDEFAULT = FontstyleType.NORMAL;

	/**
	 * The cached value of the '{@link #getFontstyle() <em>Fontstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontstyle()
	 * @generated
	 * @ordered
	 */
	protected FontstyleType fontstyle = FONTSTYLE_EDEFAULT;

	/**
	 * This is true if the Fontstyle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontstyleESet;

	/**
	 * The default value of the '{@link #getFontweight() <em>Fontweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontweight()
	 * @generated
	 * @ordered
	 */
	protected static final FontweightType FONTWEIGHT_EDEFAULT = FontweightType.NORMAL;

	/**
	 * The cached value of the '{@link #getFontweight() <em>Fontweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontweight()
	 * @generated
	 * @ordered
	 */
	protected FontweightType fontweight = FONTWEIGHT_EDEFAULT;

	/**
	 * This is true if the Fontweight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontweightESet;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final FormType FORM_EDEFAULT = FormType.PREFIX;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected FormType form = FORM_EDEFAULT;

	/**
	 * This is true if the Form attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formESet;

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
	 * The default value of the '{@link #getIndentalign() <em>Indentalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalign()
	 * @generated
	 * @ordered
	 */
	protected static final IndentalignType INDENTALIGN_EDEFAULT = IndentalignType.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalign() <em>Indentalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalign()
	 * @generated
	 * @ordered
	 */
	protected IndentalignType indentalign = INDENTALIGN_EDEFAULT;

	/**
	 * This is true if the Indentalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indentalignESet;

	/**
	 * The default value of the '{@link #getIndentalignfirst() <em>Indentalignfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignfirst()
	 * @generated
	 * @ordered
	 */
	protected static final IndentalignfirstType INDENTALIGNFIRST_EDEFAULT = IndentalignfirstType.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalignfirst() <em>Indentalignfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignfirst()
	 * @generated
	 * @ordered
	 */
	protected IndentalignfirstType indentalignfirst = INDENTALIGNFIRST_EDEFAULT;

	/**
	 * This is true if the Indentalignfirst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indentalignfirstESet;

	/**
	 * The default value of the '{@link #getIndentalignlast() <em>Indentalignlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignlast()
	 * @generated
	 * @ordered
	 */
	protected static final IndentalignlastType1 INDENTALIGNLAST_EDEFAULT = IndentalignlastType1.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalignlast() <em>Indentalignlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignlast()
	 * @generated
	 * @ordered
	 */
	protected IndentalignlastType1 indentalignlast = INDENTALIGNLAST_EDEFAULT;

	/**
	 * This is true if the Indentalignlast attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indentalignlastESet;

	/**
	 * The default value of the '{@link #getIndentshift() <em>Indentshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentshift()
	 * @generated
	 * @ordered
	 */
	protected static final String INDENTSHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndentshift() <em>Indentshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentshift()
	 * @generated
	 * @ordered
	 */
	protected String indentshift = INDENTSHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndentshiftfirst() <em>Indentshiftfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentshiftfirst()
	 * @generated
	 * @ordered
	 */
	protected static final Object INDENTSHIFTFIRST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndentshiftfirst() <em>Indentshiftfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentshiftfirst()
	 * @generated
	 * @ordered
	 */
	protected Object indentshiftfirst = INDENTSHIFTFIRST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndentshiftlast() <em>Indentshiftlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentshiftlast()
	 * @generated
	 * @ordered
	 */
	protected static final Object INDENTSHIFTLAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndentshiftlast() <em>Indentshiftlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentshiftlast()
	 * @generated
	 * @ordered
	 */
	protected Object indentshiftlast = INDENTSHIFTLAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndenttarget() <em>Indenttarget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndenttarget()
	 * @generated
	 * @ordered
	 */
	protected static final Object INDENTTARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndenttarget() <em>Indenttarget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndenttarget()
	 * @generated
	 * @ordered
	 */
	protected Object indenttarget = INDENTTARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeop() <em>Largeop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeop()
	 * @generated
	 * @ordered
	 */
	protected static final LargeopType LARGEOP_EDEFAULT = LargeopType.TRUE;

	/**
	 * The cached value of the '{@link #getLargeop() <em>Largeop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeop()
	 * @generated
	 * @ordered
	 */
	protected LargeopType largeop = LARGEOP_EDEFAULT;

	/**
	 * This is true if the Largeop attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean largeopESet;

	/**
	 * The default value of the '{@link #getLinebreak() <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreak()
	 * @generated
	 * @ordered
	 */
	protected static final LinebreakType1 LINEBREAK_EDEFAULT = LinebreakType1.AUTO;

	/**
	 * The cached value of the '{@link #getLinebreak() <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreak()
	 * @generated
	 * @ordered
	 */
	protected LinebreakType1 linebreak = LINEBREAK_EDEFAULT;

	/**
	 * This is true if the Linebreak attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linebreakESet;

	/**
	 * The default value of the '{@link #getLinebreakmultchar() <em>Linebreakmultchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreakmultchar()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINEBREAKMULTCHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinebreakmultchar() <em>Linebreakmultchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreakmultchar()
	 * @generated
	 * @ordered
	 */
	protected Object linebreakmultchar = LINEBREAKMULTCHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinebreakstyle() <em>Linebreakstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreakstyle()
	 * @generated
	 * @ordered
	 */
	protected static final LinebreakstyleType LINEBREAKSTYLE_EDEFAULT = LinebreakstyleType.BEFORE;

	/**
	 * The cached value of the '{@link #getLinebreakstyle() <em>Linebreakstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreakstyle()
	 * @generated
	 * @ordered
	 */
	protected LinebreakstyleType linebreakstyle = LINEBREAKSTYLE_EDEFAULT;

	/**
	 * This is true if the Linebreakstyle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linebreakstyleESet;

	/**
	 * The default value of the '{@link #getLineleading() <em>Lineleading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineleading()
	 * @generated
	 * @ordered
	 */
	protected static final String LINELEADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineleading() <em>Lineleading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineleading()
	 * @generated
	 * @ordered
	 */
	protected String lineleading = LINELEADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLspace() <em>Lspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLspace()
	 * @generated
	 * @ordered
	 */
	protected static final String LSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLspace() <em>Lspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLspace()
	 * @generated
	 * @ordered
	 */
	protected String lspace = LSPACE_EDEFAULT;

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
	 * The default value of the '{@link #getMathsize() <em>Mathsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathsize()
	 * @generated
	 * @ordered
	 */
	protected static final Object MATHSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMathsize() <em>Mathsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathsize()
	 * @generated
	 * @ordered
	 */
	protected Object mathsize = MATHSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMathvariant() <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathvariant()
	 * @generated
	 * @ordered
	 */
	protected static final MathvariantType MATHVARIANT_EDEFAULT = MathvariantType.NORMAL;

	/**
	 * The cached value of the '{@link #getMathvariant() <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathvariant()
	 * @generated
	 * @ordered
	 */
	protected MathvariantType mathvariant = MATHVARIANT_EDEFAULT;

	/**
	 * This is true if the Mathvariant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mathvariantESet;

	/**
	 * The default value of the '{@link #getMaxsize() <em>Maxsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxsize()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAXSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxsize() <em>Maxsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxsize()
	 * @generated
	 * @ordered
	 */
	protected Object maxsize = MAXSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinsize() <em>Minsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinsize()
	 * @generated
	 * @ordered
	 */
	protected static final String MINSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinsize() <em>Minsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinsize()
	 * @generated
	 * @ordered
	 */
	protected String minsize = MINSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMovablelimits() <em>Movablelimits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovablelimits()
	 * @generated
	 * @ordered
	 */
	protected static final MovablelimitsType MOVABLELIMITS_EDEFAULT = MovablelimitsType.TRUE;

	/**
	 * The cached value of the '{@link #getMovablelimits() <em>Movablelimits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovablelimits()
	 * @generated
	 * @ordered
	 */
	protected MovablelimitsType movablelimits = MOVABLELIMITS_EDEFAULT;

	/**
	 * This is true if the Movablelimits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean movablelimitsESet;

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
	 * The default value of the '{@link #getRspace() <em>Rspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRspace()
	 * @generated
	 * @ordered
	 */
	protected static final String RSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRspace() <em>Rspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRspace()
	 * @generated
	 * @ordered
	 */
	protected String rspace = RSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final SeparatorType SEPARATOR_EDEFAULT = SeparatorType.TRUE;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected SeparatorType separator = SEPARATOR_EDEFAULT;

	/**
	 * This is true if the Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean separatorESet;

	/**
	 * The default value of the '{@link #getStretchy() <em>Stretchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchy()
	 * @generated
	 * @ordered
	 */
	protected static final StretchyType STRETCHY_EDEFAULT = StretchyType.TRUE;

	/**
	 * The cached value of the '{@link #getStretchy() <em>Stretchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchy()
	 * @generated
	 * @ordered
	 */
	protected StretchyType stretchy = STRETCHY_EDEFAULT;

	/**
	 * This is true if the Stretchy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stretchyESet;

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
	 * The default value of the '{@link #getSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetricType SYMMETRIC_EDEFAULT = SymmetricType.TRUE;

	/**
	 * The cached value of the '{@link #getSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetric()
	 * @generated
	 * @ordered
	 */
	protected SymmetricType symmetric = SYMMETRIC_EDEFAULT;

	/**
	 * This is true if the Symmetric attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetricESet;

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
	protected MoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MlPackage.MO_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(MlPackage.eINSTANCE.getMoType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MglyphType> getMglyph() {
		return getGroup().list(MlPackage.eINSTANCE.getMoType_Mglyph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MalignmarkType> getMalignmark() {
		return getGroup().list(MlPackage.eINSTANCE.getMoType_Malignmark());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccentType2 getAccent() {
		return accent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccent(AccentType2 newAccent) {
		AccentType2 oldAccent = accent;
		accent = newAccent == null ? ACCENT_EDEFAULT : newAccent;
		boolean oldAccentESet = accentESet;
		accentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__ACCENT, oldAccent, accent, !oldAccentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAccent() {
		AccentType2 oldAccent = accent;
		boolean oldAccentESet = accentESet;
		accent = ACCENT_EDEFAULT;
		accentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__ACCENT, oldAccent, ACCENT_EDEFAULT, oldAccentESet));
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
	public Object getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Object newBackground) {
		Object oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirType1 getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(DirType1 newDir) {
		DirType1 oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDir() {
		DirType1 oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDir() {
		return dirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FenceType getFence() {
		return fence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFence(FenceType newFence) {
		FenceType oldFence = fence;
		fence = newFence == null ? FENCE_EDEFAULT : newFence;
		boolean oldFenceESet = fenceESet;
		fenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__FENCE, oldFence, fence, !oldFenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFence() {
		FenceType oldFence = fence;
		boolean oldFenceESet = fenceESet;
		fence = FENCE_EDEFAULT;
		fenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__FENCE, oldFence, FENCE_EDEFAULT, oldFenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFence() {
		return fenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFontfamily() {
		return fontfamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontfamily(Object newFontfamily) {
		Object oldFontfamily = fontfamily;
		fontfamily = newFontfamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__FONTFAMILY, oldFontfamily, fontfamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontsize() {
		return fontsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontsize(String newFontsize) {
		String oldFontsize = fontsize;
		fontsize = newFontsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__FONTSIZE, oldFontsize, fontsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontstyleType getFontstyle() {
		return fontstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontstyle(FontstyleType newFontstyle) {
		FontstyleType oldFontstyle = fontstyle;
		fontstyle = newFontstyle == null ? FONTSTYLE_EDEFAULT : newFontstyle;
		boolean oldFontstyleESet = fontstyleESet;
		fontstyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__FONTSTYLE, oldFontstyle, fontstyle, !oldFontstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontstyle() {
		FontstyleType oldFontstyle = fontstyle;
		boolean oldFontstyleESet = fontstyleESet;
		fontstyle = FONTSTYLE_EDEFAULT;
		fontstyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__FONTSTYLE, oldFontstyle, FONTSTYLE_EDEFAULT, oldFontstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontstyle() {
		return fontstyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontweightType getFontweight() {
		return fontweight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontweight(FontweightType newFontweight) {
		FontweightType oldFontweight = fontweight;
		fontweight = newFontweight == null ? FONTWEIGHT_EDEFAULT : newFontweight;
		boolean oldFontweightESet = fontweightESet;
		fontweightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__FONTWEIGHT, oldFontweight, fontweight, !oldFontweightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFontweight() {
		FontweightType oldFontweight = fontweight;
		boolean oldFontweightESet = fontweightESet;
		fontweight = FONTWEIGHT_EDEFAULT;
		fontweightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__FONTWEIGHT, oldFontweight, FONTWEIGHT_EDEFAULT, oldFontweightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFontweight() {
		return fontweightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormType getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForm(FormType newForm) {
		FormType oldForm = form;
		form = newForm == null ? FORM_EDEFAULT : newForm;
		boolean oldFormESet = formESet;
		formESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__FORM, oldForm, form, !oldFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetForm() {
		FormType oldForm = form;
		boolean oldFormESet = formESet;
		form = FORM_EDEFAULT;
		formESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__FORM, oldForm, FORM_EDEFAULT, oldFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetForm() {
		return formESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndentalignType getIndentalign() {
		return indentalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalign(IndentalignType newIndentalign) {
		IndentalignType oldIndentalign = indentalign;
		indentalign = newIndentalign == null ? INDENTALIGN_EDEFAULT : newIndentalign;
		boolean oldIndentalignESet = indentalignESet;
		indentalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTALIGN, oldIndentalign, indentalign, !oldIndentalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalign() {
		IndentalignType oldIndentalign = indentalign;
		boolean oldIndentalignESet = indentalignESet;
		indentalign = INDENTALIGN_EDEFAULT;
		indentalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__INDENTALIGN, oldIndentalign, INDENTALIGN_EDEFAULT, oldIndentalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIndentalign() {
		return indentalignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndentalignfirstType getIndentalignfirst() {
		return indentalignfirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalignfirst(IndentalignfirstType newIndentalignfirst) {
		IndentalignfirstType oldIndentalignfirst = indentalignfirst;
		indentalignfirst = newIndentalignfirst == null ? INDENTALIGNFIRST_EDEFAULT : newIndentalignfirst;
		boolean oldIndentalignfirstESet = indentalignfirstESet;
		indentalignfirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTALIGNFIRST, oldIndentalignfirst, indentalignfirst, !oldIndentalignfirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalignfirst() {
		IndentalignfirstType oldIndentalignfirst = indentalignfirst;
		boolean oldIndentalignfirstESet = indentalignfirstESet;
		indentalignfirst = INDENTALIGNFIRST_EDEFAULT;
		indentalignfirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__INDENTALIGNFIRST, oldIndentalignfirst, INDENTALIGNFIRST_EDEFAULT, oldIndentalignfirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIndentalignfirst() {
		return indentalignfirstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndentalignlastType1 getIndentalignlast() {
		return indentalignlast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalignlast(IndentalignlastType1 newIndentalignlast) {
		IndentalignlastType1 oldIndentalignlast = indentalignlast;
		indentalignlast = newIndentalignlast == null ? INDENTALIGNLAST_EDEFAULT : newIndentalignlast;
		boolean oldIndentalignlastESet = indentalignlastESet;
		indentalignlastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTALIGNLAST, oldIndentalignlast, indentalignlast, !oldIndentalignlastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalignlast() {
		IndentalignlastType1 oldIndentalignlast = indentalignlast;
		boolean oldIndentalignlastESet = indentalignlastESet;
		indentalignlast = INDENTALIGNLAST_EDEFAULT;
		indentalignlastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__INDENTALIGNLAST, oldIndentalignlast, INDENTALIGNLAST_EDEFAULT, oldIndentalignlastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIndentalignlast() {
		return indentalignlastESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndentshift() {
		return indentshift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentshift(String newIndentshift) {
		String oldIndentshift = indentshift;
		indentshift = newIndentshift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTSHIFT, oldIndentshift, indentshift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIndentshiftfirst() {
		return indentshiftfirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentshiftfirst(Object newIndentshiftfirst) {
		Object oldIndentshiftfirst = indentshiftfirst;
		indentshiftfirst = newIndentshiftfirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTSHIFTFIRST, oldIndentshiftfirst, indentshiftfirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIndentshiftlast() {
		return indentshiftlast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentshiftlast(Object newIndentshiftlast) {
		Object oldIndentshiftlast = indentshiftlast;
		indentshiftlast = newIndentshiftlast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTSHIFTLAST, oldIndentshiftlast, indentshiftlast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIndenttarget() {
		return indenttarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndenttarget(Object newIndenttarget) {
		Object oldIndenttarget = indenttarget;
		indenttarget = newIndenttarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__INDENTTARGET, oldIndenttarget, indenttarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeopType getLargeop() {
		return largeop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLargeop(LargeopType newLargeop) {
		LargeopType oldLargeop = largeop;
		largeop = newLargeop == null ? LARGEOP_EDEFAULT : newLargeop;
		boolean oldLargeopESet = largeopESet;
		largeopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__LARGEOP, oldLargeop, largeop, !oldLargeopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLargeop() {
		LargeopType oldLargeop = largeop;
		boolean oldLargeopESet = largeopESet;
		largeop = LARGEOP_EDEFAULT;
		largeopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__LARGEOP, oldLargeop, LARGEOP_EDEFAULT, oldLargeopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLargeop() {
		return largeopESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinebreakType1 getLinebreak() {
		return linebreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinebreak(LinebreakType1 newLinebreak) {
		LinebreakType1 oldLinebreak = linebreak;
		linebreak = newLinebreak == null ? LINEBREAK_EDEFAULT : newLinebreak;
		boolean oldLinebreakESet = linebreakESet;
		linebreakESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__LINEBREAK, oldLinebreak, linebreak, !oldLinebreakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinebreak() {
		LinebreakType1 oldLinebreak = linebreak;
		boolean oldLinebreakESet = linebreakESet;
		linebreak = LINEBREAK_EDEFAULT;
		linebreakESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__LINEBREAK, oldLinebreak, LINEBREAK_EDEFAULT, oldLinebreakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLinebreak() {
		return linebreakESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLinebreakmultchar() {
		return linebreakmultchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinebreakmultchar(Object newLinebreakmultchar) {
		Object oldLinebreakmultchar = linebreakmultchar;
		linebreakmultchar = newLinebreakmultchar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__LINEBREAKMULTCHAR, oldLinebreakmultchar, linebreakmultchar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinebreakstyleType getLinebreakstyle() {
		return linebreakstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinebreakstyle(LinebreakstyleType newLinebreakstyle) {
		LinebreakstyleType oldLinebreakstyle = linebreakstyle;
		linebreakstyle = newLinebreakstyle == null ? LINEBREAKSTYLE_EDEFAULT : newLinebreakstyle;
		boolean oldLinebreakstyleESet = linebreakstyleESet;
		linebreakstyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__LINEBREAKSTYLE, oldLinebreakstyle, linebreakstyle, !oldLinebreakstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinebreakstyle() {
		LinebreakstyleType oldLinebreakstyle = linebreakstyle;
		boolean oldLinebreakstyleESet = linebreakstyleESet;
		linebreakstyle = LINEBREAKSTYLE_EDEFAULT;
		linebreakstyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__LINEBREAKSTYLE, oldLinebreakstyle, LINEBREAKSTYLE_EDEFAULT, oldLinebreakstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLinebreakstyle() {
		return linebreakstyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineleading() {
		return lineleading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineleading(String newLineleading) {
		String oldLineleading = lineleading;
		lineleading = newLineleading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__LINELEADING, oldLineleading, lineleading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLspace() {
		return lspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLspace(String newLspace) {
		String oldLspace = lspace;
		lspace = newLspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__LSPACE, oldLspace, lspace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMathsize() {
		return mathsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathsize(Object newMathsize) {
		Object oldMathsize = mathsize;
		mathsize = newMathsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MATHSIZE, oldMathsize, mathsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathvariantType getMathvariant() {
		return mathvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathvariant(MathvariantType newMathvariant) {
		MathvariantType oldMathvariant = mathvariant;
		mathvariant = newMathvariant == null ? MATHVARIANT_EDEFAULT : newMathvariant;
		boolean oldMathvariantESet = mathvariantESet;
		mathvariantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MATHVARIANT, oldMathvariant, mathvariant, !oldMathvariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMathvariant() {
		MathvariantType oldMathvariant = mathvariant;
		boolean oldMathvariantESet = mathvariantESet;
		mathvariant = MATHVARIANT_EDEFAULT;
		mathvariantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__MATHVARIANT, oldMathvariant, MATHVARIANT_EDEFAULT, oldMathvariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMathvariant() {
		return mathvariantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMaxsize() {
		return maxsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxsize(Object newMaxsize) {
		Object oldMaxsize = maxsize;
		maxsize = newMaxsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MAXSIZE, oldMaxsize, maxsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinsize() {
		return minsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinsize(String newMinsize) {
		String oldMinsize = minsize;
		minsize = newMinsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MINSIZE, oldMinsize, minsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovablelimitsType getMovablelimits() {
		return movablelimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMovablelimits(MovablelimitsType newMovablelimits) {
		MovablelimitsType oldMovablelimits = movablelimits;
		movablelimits = newMovablelimits == null ? MOVABLELIMITS_EDEFAULT : newMovablelimits;
		boolean oldMovablelimitsESet = movablelimitsESet;
		movablelimitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__MOVABLELIMITS, oldMovablelimits, movablelimits, !oldMovablelimitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMovablelimits() {
		MovablelimitsType oldMovablelimits = movablelimits;
		boolean oldMovablelimitsESet = movablelimitsESet;
		movablelimits = MOVABLELIMITS_EDEFAULT;
		movablelimitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__MOVABLELIMITS, oldMovablelimits, MOVABLELIMITS_EDEFAULT, oldMovablelimitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMovablelimits() {
		return movablelimitsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRspace() {
		return rspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRspace(String newRspace) {
		String oldRspace = rspace;
		rspace = newRspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__RSPACE, oldRspace, rspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeparatorType getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparator(SeparatorType newSeparator) {
		SeparatorType oldSeparator = separator;
		separator = newSeparator == null ? SEPARATOR_EDEFAULT : newSeparator;
		boolean oldSeparatorESet = separatorESet;
		separatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__SEPARATOR, oldSeparator, separator, !oldSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSeparator() {
		SeparatorType oldSeparator = separator;
		boolean oldSeparatorESet = separatorESet;
		separator = SEPARATOR_EDEFAULT;
		separatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__SEPARATOR, oldSeparator, SEPARATOR_EDEFAULT, oldSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSeparator() {
		return separatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StretchyType getStretchy() {
		return stretchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStretchy(StretchyType newStretchy) {
		StretchyType oldStretchy = stretchy;
		stretchy = newStretchy == null ? STRETCHY_EDEFAULT : newStretchy;
		boolean oldStretchyESet = stretchyESet;
		stretchyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__STRETCHY, oldStretchy, stretchy, !oldStretchyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStretchy() {
		StretchyType oldStretchy = stretchy;
		boolean oldStretchyESet = stretchyESet;
		stretchy = STRETCHY_EDEFAULT;
		stretchyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__STRETCHY, oldStretchy, STRETCHY_EDEFAULT, oldStretchyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStretchy() {
		return stretchyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetricType getSymmetric() {
		return symmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetric(SymmetricType newSymmetric) {
		SymmetricType oldSymmetric = symmetric;
		symmetric = newSymmetric == null ? SYMMETRIC_EDEFAULT : newSymmetric;
		boolean oldSymmetricESet = symmetricESet;
		symmetricESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__SYMMETRIC, oldSymmetric, symmetric, !oldSymmetricESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetric() {
		SymmetricType oldSymmetric = symmetric;
		boolean oldSymmetricESet = symmetricESet;
		symmetric = SYMMETRIC_EDEFAULT;
		symmetricESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MO_TYPE__SYMMETRIC, oldSymmetric, SYMMETRIC_EDEFAULT, oldSymmetricESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSymmetric() {
		return symmetricESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MO_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MO_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MO_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MlPackage.MO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MlPackage.MO_TYPE__MGLYPH:
				return ((InternalEList<?>)getMglyph()).basicRemove(otherEnd, msgs);
			case MlPackage.MO_TYPE__MALIGNMARK:
				return ((InternalEList<?>)getMalignmark()).basicRemove(otherEnd, msgs);
			case MlPackage.MO_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MO_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MlPackage.MO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MlPackage.MO_TYPE__MGLYPH:
				return getMglyph();
			case MlPackage.MO_TYPE__MALIGNMARK:
				return getMalignmark();
			case MlPackage.MO_TYPE__ACCENT:
				return getAccent();
			case MlPackage.MO_TYPE__BACKGROUND:
				return getBackground();
			case MlPackage.MO_TYPE__CLASS:
				return getClass_();
			case MlPackage.MO_TYPE__COLOR:
				return getColor();
			case MlPackage.MO_TYPE__DIR:
				return getDir();
			case MlPackage.MO_TYPE__FENCE:
				return getFence();
			case MlPackage.MO_TYPE__FONTFAMILY:
				return getFontfamily();
			case MlPackage.MO_TYPE__FONTSIZE:
				return getFontsize();
			case MlPackage.MO_TYPE__FONTSTYLE:
				return getFontstyle();
			case MlPackage.MO_TYPE__FONTWEIGHT:
				return getFontweight();
			case MlPackage.MO_TYPE__FORM:
				return getForm();
			case MlPackage.MO_TYPE__HREF:
				return getHref();
			case MlPackage.MO_TYPE__ID:
				return getId();
			case MlPackage.MO_TYPE__INDENTALIGN:
				return getIndentalign();
			case MlPackage.MO_TYPE__INDENTALIGNFIRST:
				return getIndentalignfirst();
			case MlPackage.MO_TYPE__INDENTALIGNLAST:
				return getIndentalignlast();
			case MlPackage.MO_TYPE__INDENTSHIFT:
				return getIndentshift();
			case MlPackage.MO_TYPE__INDENTSHIFTFIRST:
				return getIndentshiftfirst();
			case MlPackage.MO_TYPE__INDENTSHIFTLAST:
				return getIndentshiftlast();
			case MlPackage.MO_TYPE__INDENTTARGET:
				return getIndenttarget();
			case MlPackage.MO_TYPE__LARGEOP:
				return getLargeop();
			case MlPackage.MO_TYPE__LINEBREAK:
				return getLinebreak();
			case MlPackage.MO_TYPE__LINEBREAKMULTCHAR:
				return getLinebreakmultchar();
			case MlPackage.MO_TYPE__LINEBREAKSTYLE:
				return getLinebreakstyle();
			case MlPackage.MO_TYPE__LINELEADING:
				return getLineleading();
			case MlPackage.MO_TYPE__LSPACE:
				return getLspace();
			case MlPackage.MO_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MO_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MO_TYPE__MATHSIZE:
				return getMathsize();
			case MlPackage.MO_TYPE__MATHVARIANT:
				return getMathvariant();
			case MlPackage.MO_TYPE__MAXSIZE:
				return getMaxsize();
			case MlPackage.MO_TYPE__MINSIZE:
				return getMinsize();
			case MlPackage.MO_TYPE__MOVABLELIMITS:
				return getMovablelimits();
			case MlPackage.MO_TYPE__OTHER:
				return getOther();
			case MlPackage.MO_TYPE__RSPACE:
				return getRspace();
			case MlPackage.MO_TYPE__SEPARATOR:
				return getSeparator();
			case MlPackage.MO_TYPE__STRETCHY:
				return getStretchy();
			case MlPackage.MO_TYPE__STYLE:
				return getStyle();
			case MlPackage.MO_TYPE__SYMMETRIC:
				return getSymmetric();
			case MlPackage.MO_TYPE__XREF:
				return getXref();
			case MlPackage.MO_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MO_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MlPackage.MO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MlPackage.MO_TYPE__MGLYPH:
				getMglyph().clear();
				getMglyph().addAll((Collection<? extends MglyphType>)newValue);
				return;
			case MlPackage.MO_TYPE__MALIGNMARK:
				getMalignmark().clear();
				getMalignmark().addAll((Collection<? extends MalignmarkType>)newValue);
				return;
			case MlPackage.MO_TYPE__ACCENT:
				setAccent((AccentType2)newValue);
				return;
			case MlPackage.MO_TYPE__BACKGROUND:
				setBackground(newValue);
				return;
			case MlPackage.MO_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MO_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case MlPackage.MO_TYPE__DIR:
				setDir((DirType1)newValue);
				return;
			case MlPackage.MO_TYPE__FENCE:
				setFence((FenceType)newValue);
				return;
			case MlPackage.MO_TYPE__FONTFAMILY:
				setFontfamily(newValue);
				return;
			case MlPackage.MO_TYPE__FONTSIZE:
				setFontsize((String)newValue);
				return;
			case MlPackage.MO_TYPE__FONTSTYLE:
				setFontstyle((FontstyleType)newValue);
				return;
			case MlPackage.MO_TYPE__FONTWEIGHT:
				setFontweight((FontweightType)newValue);
				return;
			case MlPackage.MO_TYPE__FORM:
				setForm((FormType)newValue);
				return;
			case MlPackage.MO_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MO_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MO_TYPE__INDENTALIGN:
				setIndentalign((IndentalignType)newValue);
				return;
			case MlPackage.MO_TYPE__INDENTALIGNFIRST:
				setIndentalignfirst((IndentalignfirstType)newValue);
				return;
			case MlPackage.MO_TYPE__INDENTALIGNLAST:
				setIndentalignlast((IndentalignlastType1)newValue);
				return;
			case MlPackage.MO_TYPE__INDENTSHIFT:
				setIndentshift((String)newValue);
				return;
			case MlPackage.MO_TYPE__INDENTSHIFTFIRST:
				setIndentshiftfirst(newValue);
				return;
			case MlPackage.MO_TYPE__INDENTSHIFTLAST:
				setIndentshiftlast(newValue);
				return;
			case MlPackage.MO_TYPE__INDENTTARGET:
				setIndenttarget(newValue);
				return;
			case MlPackage.MO_TYPE__LARGEOP:
				setLargeop((LargeopType)newValue);
				return;
			case MlPackage.MO_TYPE__LINEBREAK:
				setLinebreak((LinebreakType1)newValue);
				return;
			case MlPackage.MO_TYPE__LINEBREAKMULTCHAR:
				setLinebreakmultchar(newValue);
				return;
			case MlPackage.MO_TYPE__LINEBREAKSTYLE:
				setLinebreakstyle((LinebreakstyleType)newValue);
				return;
			case MlPackage.MO_TYPE__LINELEADING:
				setLineleading((String)newValue);
				return;
			case MlPackage.MO_TYPE__LSPACE:
				setLspace((String)newValue);
				return;
			case MlPackage.MO_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MO_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MO_TYPE__MATHSIZE:
				setMathsize(newValue);
				return;
			case MlPackage.MO_TYPE__MATHVARIANT:
				setMathvariant((MathvariantType)newValue);
				return;
			case MlPackage.MO_TYPE__MAXSIZE:
				setMaxsize(newValue);
				return;
			case MlPackage.MO_TYPE__MINSIZE:
				setMinsize((String)newValue);
				return;
			case MlPackage.MO_TYPE__MOVABLELIMITS:
				setMovablelimits((MovablelimitsType)newValue);
				return;
			case MlPackage.MO_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MO_TYPE__RSPACE:
				setRspace((String)newValue);
				return;
			case MlPackage.MO_TYPE__SEPARATOR:
				setSeparator((SeparatorType)newValue);
				return;
			case MlPackage.MO_TYPE__STRETCHY:
				setStretchy((StretchyType)newValue);
				return;
			case MlPackage.MO_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MO_TYPE__SYMMETRIC:
				setSymmetric((SymmetricType)newValue);
				return;
			case MlPackage.MO_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MO_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MO_TYPE__MIXED:
				getMixed().clear();
				return;
			case MlPackage.MO_TYPE__GROUP:
				getGroup().clear();
				return;
			case MlPackage.MO_TYPE__MGLYPH:
				getMglyph().clear();
				return;
			case MlPackage.MO_TYPE__MALIGNMARK:
				getMalignmark().clear();
				return;
			case MlPackage.MO_TYPE__ACCENT:
				unsetAccent();
				return;
			case MlPackage.MO_TYPE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__DIR:
				unsetDir();
				return;
			case MlPackage.MO_TYPE__FENCE:
				unsetFence();
				return;
			case MlPackage.MO_TYPE__FONTFAMILY:
				setFontfamily(FONTFAMILY_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__FONTSIZE:
				setFontsize(FONTSIZE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__FONTSTYLE:
				unsetFontstyle();
				return;
			case MlPackage.MO_TYPE__FONTWEIGHT:
				unsetFontweight();
				return;
			case MlPackage.MO_TYPE__FORM:
				unsetForm();
				return;
			case MlPackage.MO_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__INDENTALIGN:
				unsetIndentalign();
				return;
			case MlPackage.MO_TYPE__INDENTALIGNFIRST:
				unsetIndentalignfirst();
				return;
			case MlPackage.MO_TYPE__INDENTALIGNLAST:
				unsetIndentalignlast();
				return;
			case MlPackage.MO_TYPE__INDENTSHIFT:
				setIndentshift(INDENTSHIFT_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__INDENTSHIFTFIRST:
				setIndentshiftfirst(INDENTSHIFTFIRST_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__INDENTSHIFTLAST:
				setIndentshiftlast(INDENTSHIFTLAST_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__INDENTTARGET:
				setIndenttarget(INDENTTARGET_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__LARGEOP:
				unsetLargeop();
				return;
			case MlPackage.MO_TYPE__LINEBREAK:
				unsetLinebreak();
				return;
			case MlPackage.MO_TYPE__LINEBREAKMULTCHAR:
				setLinebreakmultchar(LINEBREAKMULTCHAR_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__LINEBREAKSTYLE:
				unsetLinebreakstyle();
				return;
			case MlPackage.MO_TYPE__LINELEADING:
				setLineleading(LINELEADING_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__LSPACE:
				setLspace(LSPACE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__MATHSIZE:
				setMathsize(MATHSIZE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__MATHVARIANT:
				unsetMathvariant();
				return;
			case MlPackage.MO_TYPE__MAXSIZE:
				setMaxsize(MAXSIZE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__MINSIZE:
				setMinsize(MINSIZE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__MOVABLELIMITS:
				unsetMovablelimits();
				return;
			case MlPackage.MO_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__RSPACE:
				setRspace(RSPACE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__SEPARATOR:
				unsetSeparator();
				return;
			case MlPackage.MO_TYPE__STRETCHY:
				unsetStretchy();
				return;
			case MlPackage.MO_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__SYMMETRIC:
				unsetSymmetric();
				return;
			case MlPackage.MO_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MO_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MO_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MlPackage.MO_TYPE__GROUP:
				return !getGroup().isEmpty();
			case MlPackage.MO_TYPE__MGLYPH:
				return !getMglyph().isEmpty();
			case MlPackage.MO_TYPE__MALIGNMARK:
				return !getMalignmark().isEmpty();
			case MlPackage.MO_TYPE__ACCENT:
				return isSetAccent();
			case MlPackage.MO_TYPE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case MlPackage.MO_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MO_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case MlPackage.MO_TYPE__DIR:
				return isSetDir();
			case MlPackage.MO_TYPE__FENCE:
				return isSetFence();
			case MlPackage.MO_TYPE__FONTFAMILY:
				return FONTFAMILY_EDEFAULT == null ? fontfamily != null : !FONTFAMILY_EDEFAULT.equals(fontfamily);
			case MlPackage.MO_TYPE__FONTSIZE:
				return FONTSIZE_EDEFAULT == null ? fontsize != null : !FONTSIZE_EDEFAULT.equals(fontsize);
			case MlPackage.MO_TYPE__FONTSTYLE:
				return isSetFontstyle();
			case MlPackage.MO_TYPE__FONTWEIGHT:
				return isSetFontweight();
			case MlPackage.MO_TYPE__FORM:
				return isSetForm();
			case MlPackage.MO_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MO_TYPE__INDENTALIGN:
				return isSetIndentalign();
			case MlPackage.MO_TYPE__INDENTALIGNFIRST:
				return isSetIndentalignfirst();
			case MlPackage.MO_TYPE__INDENTALIGNLAST:
				return isSetIndentalignlast();
			case MlPackage.MO_TYPE__INDENTSHIFT:
				return INDENTSHIFT_EDEFAULT == null ? indentshift != null : !INDENTSHIFT_EDEFAULT.equals(indentshift);
			case MlPackage.MO_TYPE__INDENTSHIFTFIRST:
				return INDENTSHIFTFIRST_EDEFAULT == null ? indentshiftfirst != null : !INDENTSHIFTFIRST_EDEFAULT.equals(indentshiftfirst);
			case MlPackage.MO_TYPE__INDENTSHIFTLAST:
				return INDENTSHIFTLAST_EDEFAULT == null ? indentshiftlast != null : !INDENTSHIFTLAST_EDEFAULT.equals(indentshiftlast);
			case MlPackage.MO_TYPE__INDENTTARGET:
				return INDENTTARGET_EDEFAULT == null ? indenttarget != null : !INDENTTARGET_EDEFAULT.equals(indenttarget);
			case MlPackage.MO_TYPE__LARGEOP:
				return isSetLargeop();
			case MlPackage.MO_TYPE__LINEBREAK:
				return isSetLinebreak();
			case MlPackage.MO_TYPE__LINEBREAKMULTCHAR:
				return LINEBREAKMULTCHAR_EDEFAULT == null ? linebreakmultchar != null : !LINEBREAKMULTCHAR_EDEFAULT.equals(linebreakmultchar);
			case MlPackage.MO_TYPE__LINEBREAKSTYLE:
				return isSetLinebreakstyle();
			case MlPackage.MO_TYPE__LINELEADING:
				return LINELEADING_EDEFAULT == null ? lineleading != null : !LINELEADING_EDEFAULT.equals(lineleading);
			case MlPackage.MO_TYPE__LSPACE:
				return LSPACE_EDEFAULT == null ? lspace != null : !LSPACE_EDEFAULT.equals(lspace);
			case MlPackage.MO_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MO_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MO_TYPE__MATHSIZE:
				return MATHSIZE_EDEFAULT == null ? mathsize != null : !MATHSIZE_EDEFAULT.equals(mathsize);
			case MlPackage.MO_TYPE__MATHVARIANT:
				return isSetMathvariant();
			case MlPackage.MO_TYPE__MAXSIZE:
				return MAXSIZE_EDEFAULT == null ? maxsize != null : !MAXSIZE_EDEFAULT.equals(maxsize);
			case MlPackage.MO_TYPE__MINSIZE:
				return MINSIZE_EDEFAULT == null ? minsize != null : !MINSIZE_EDEFAULT.equals(minsize);
			case MlPackage.MO_TYPE__MOVABLELIMITS:
				return isSetMovablelimits();
			case MlPackage.MO_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MO_TYPE__RSPACE:
				return RSPACE_EDEFAULT == null ? rspace != null : !RSPACE_EDEFAULT.equals(rspace);
			case MlPackage.MO_TYPE__SEPARATOR:
				return isSetSeparator();
			case MlPackage.MO_TYPE__STRETCHY:
				return isSetStretchy();
			case MlPackage.MO_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MO_TYPE__SYMMETRIC:
				return isSetSymmetric();
			case MlPackage.MO_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MO_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", accent: ");
		if (accentESet) result.append(accent); else result.append("<unset>");
		result.append(", background: ");
		result.append(background);
		result.append(", class: ");
		result.append(class_);
		result.append(", color: ");
		result.append(color);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", fence: ");
		if (fenceESet) result.append(fence); else result.append("<unset>");
		result.append(", fontfamily: ");
		result.append(fontfamily);
		result.append(", fontsize: ");
		result.append(fontsize);
		result.append(", fontstyle: ");
		if (fontstyleESet) result.append(fontstyle); else result.append("<unset>");
		result.append(", fontweight: ");
		if (fontweightESet) result.append(fontweight); else result.append("<unset>");
		result.append(", form: ");
		if (formESet) result.append(form); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", indentalign: ");
		if (indentalignESet) result.append(indentalign); else result.append("<unset>");
		result.append(", indentalignfirst: ");
		if (indentalignfirstESet) result.append(indentalignfirst); else result.append("<unset>");
		result.append(", indentalignlast: ");
		if (indentalignlastESet) result.append(indentalignlast); else result.append("<unset>");
		result.append(", indentshift: ");
		result.append(indentshift);
		result.append(", indentshiftfirst: ");
		result.append(indentshiftfirst);
		result.append(", indentshiftlast: ");
		result.append(indentshiftlast);
		result.append(", indenttarget: ");
		result.append(indenttarget);
		result.append(", largeop: ");
		if (largeopESet) result.append(largeop); else result.append("<unset>");
		result.append(", linebreak: ");
		if (linebreakESet) result.append(linebreak); else result.append("<unset>");
		result.append(", linebreakmultchar: ");
		result.append(linebreakmultchar);
		result.append(", linebreakstyle: ");
		if (linebreakstyleESet) result.append(linebreakstyle); else result.append("<unset>");
		result.append(", lineleading: ");
		result.append(lineleading);
		result.append(", lspace: ");
		result.append(lspace);
		result.append(", mathbackground: ");
		result.append(mathbackground);
		result.append(", mathcolor: ");
		result.append(mathcolor);
		result.append(", mathsize: ");
		result.append(mathsize);
		result.append(", mathvariant: ");
		if (mathvariantESet) result.append(mathvariant); else result.append("<unset>");
		result.append(", maxsize: ");
		result.append(maxsize);
		result.append(", minsize: ");
		result.append(minsize);
		result.append(", movablelimits: ");
		if (movablelimitsESet) result.append(movablelimits); else result.append("<unset>");
		result.append(", other: ");
		result.append(other);
		result.append(", rspace: ");
		result.append(rspace);
		result.append(", separator: ");
		if (separatorESet) result.append(separator); else result.append("<unset>");
		result.append(", stretchy: ");
		if (stretchyESet) result.append(stretchy); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", symmetric: ");
		if (symmetricESet) result.append(symmetric); else result.append("<unset>");
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MoTypeImpl
