/**
 */
package org.w3._1998.math.math.ml.impl;

import java.math.BigDecimal;
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

import org.w3._1998.math.math.ml.AccentType3;
import org.w3._1998.math.math.ml.AccentunderType2;
import org.w3._1998.math.math.ml.AlignType5;
import org.w3._1998.math.math.ml.AlignmentscopeTypeBaseItem1;
import org.w3._1998.math.math.ml.BevelledType1;
import org.w3._1998.math.math.ml.CharalignType1;
import org.w3._1998.math.math.ml.Columnalignstyle;
import org.w3._1998.math.math.ml.CrossoutTypeItem2;
import org.w3._1998.math.math.ml.DenomalignType1;
import org.w3._1998.math.math.ml.DirType2;
import org.w3._1998.math.math.ml.DisplaystyleType1;
import org.w3._1998.math.math.ml.EdgeType1;
import org.w3._1998.math.math.ml.EqualcolumnsType1;
import org.w3._1998.math.math.ml.EqualrowsType1;
import org.w3._1998.math.math.ml.FenceType1;
import org.w3._1998.math.math.ml.FontstyleType;
import org.w3._1998.math.math.ml.FontweightType;
import org.w3._1998.math.math.ml.FormType1;
import org.w3._1998.math.math.ml.IndentalignType2;
import org.w3._1998.math.math.ml.IndentalignfirstType2;
import org.w3._1998.math.math.ml.IndentalignlastType2;
import org.w3._1998.math.math.ml.InfixlinebreakstyleType;
import org.w3._1998.math.math.ml.LargeopType1;
import org.w3._1998.math.math.ml.LinebreakType2;
import org.w3._1998.math.math.ml.LinebreakstyleType1;
import org.w3._1998.math.math.ml.Linestyle;
import org.w3._1998.math.math.ml.LocationType2;
import org.w3._1998.math.math.ml.LongdivstyleType1;
import org.w3._1998.math.math.ml.MathvariantType2;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MovablelimitsType1;
import org.w3._1998.math.math.ml.MstyleType;
import org.w3._1998.math.math.ml.NumalignType1;
import org.w3._1998.math.math.ml.SeparatorType1;
import org.w3._1998.math.math.ml.SideType1;
import org.w3._1998.math.math.ml.StackalignType1;
import org.w3._1998.math.math.ml.StretchyType1;
import org.w3._1998.math.math.ml.SymmetricType1;
import org.w3._1998.math.math.ml.Verticalalign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mstyle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getAccent <em>Accent</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getAccentunder <em>Accentunder</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getAlignmentscope <em>Alignmentscope</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getBevelled <em>Bevelled</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getCharalign <em>Charalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getCharspacing <em>Charspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getClose <em>Close</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getColumnalign <em>Columnalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getColumnlines <em>Columnlines</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getColumnspacing <em>Columnspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getColumnspan <em>Columnspan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getColumnwidth <em>Columnwidth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getCrossout <em>Crossout</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getDecimalpoint <em>Decimalpoint</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getDenomalign <em>Denomalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getDisplaystyle <em>Displaystyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getEqualcolumns <em>Equalcolumns</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getEqualrows <em>Equalrows</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFence <em>Fence</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getFramespacing <em>Framespacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getGroupalign <em>Groupalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndentalign <em>Indentalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndentalignfirst <em>Indentalignfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndentalignlast <em>Indentalignlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndentshift <em>Indentshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndentshiftfirst <em>Indentshiftfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndentshiftlast <em>Indentshiftlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getIndenttarget <em>Indenttarget</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getInfixlinebreakstyle <em>Infixlinebreakstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLargeop <em>Largeop</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLeftoverhang <em>Leftoverhang</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLinebreak <em>Linebreak</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLinebreakmultchar <em>Linebreakmultchar</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLinebreakstyle <em>Linebreakstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLineleading <em>Lineleading</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLinethickness <em>Linethickness</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLongdivstyle <em>Longdivstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLquote <em>Lquote</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getLspace <em>Lspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMaxsize <em>Maxsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMediummathspace <em>Mediummathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMinlabelspacing <em>Minlabelspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMinsize <em>Minsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMovablelimits <em>Movablelimits</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getMslinethickness <em>Mslinethickness</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getNumalign <em>Numalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRightoverhang <em>Rightoverhang</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRowalign <em>Rowalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRowlines <em>Rowlines</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRowspacing <em>Rowspacing</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRquote <em>Rquote</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getRspace <em>Rspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getScriptlevel <em>Scriptlevel</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getScriptminsize <em>Scriptminsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getScriptsizemultiplier <em>Scriptsizemultiplier</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSeparators <em>Separators</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSide <em>Side</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getStackalign <em>Stackalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getStretchy <em>Stretchy</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSubscriptshift <em>Subscriptshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSuperscriptshift <em>Superscriptshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getSymmetric <em>Symmetric</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getThickmathspace <em>Thickmathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getThinmathspace <em>Thinmathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getVerythickmathspace <em>Verythickmathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getVerythinmathspace <em>Verythinmathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getVeryverythickmathspace <em>Veryverythickmathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getVeryverythinmathspace <em>Veryverythinmathspace</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MstyleTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MstyleTypeImpl extends ImpliedMrowImpl implements MstyleType {
	/**
	 * The default value of the '{@link #getAccent() <em>Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccent()
	 * @generated
	 * @ordered
	 */
	protected static final AccentType3 ACCENT_EDEFAULT = AccentType3.TRUE;

	/**
	 * The cached value of the '{@link #getAccent() <em>Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccent()
	 * @generated
	 * @ordered
	 */
	protected AccentType3 accent = ACCENT_EDEFAULT;

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
	protected static final AccentunderType2 ACCENTUNDER_EDEFAULT = AccentunderType2.TRUE;

	/**
	 * The cached value of the '{@link #getAccentunder() <em>Accentunder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentunder()
	 * @generated
	 * @ordered
	 */
	protected AccentunderType2 accentunder = ACCENTUNDER_EDEFAULT;

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
	protected static final AlignType5 ALIGN_EDEFAULT = AlignType5.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType5 align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getAlignmentscope() <em>Alignmentscope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentscope()
	 * @generated
	 * @ordered
	 */
	protected static final List<AlignmentscopeTypeBaseItem1> ALIGNMENTSCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignmentscope() <em>Alignmentscope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentscope()
	 * @generated
	 * @ordered
	 */
	protected List<AlignmentscopeTypeBaseItem1> alignmentscope = ALIGNMENTSCOPE_EDEFAULT;

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
	 * The default value of the '{@link #getBevelled() <em>Bevelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBevelled()
	 * @generated
	 * @ordered
	 */
	protected static final BevelledType1 BEVELLED_EDEFAULT = BevelledType1.TRUE;

	/**
	 * The cached value of the '{@link #getBevelled() <em>Bevelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBevelled()
	 * @generated
	 * @ordered
	 */
	protected BevelledType1 bevelled = BEVELLED_EDEFAULT;

	/**
	 * This is true if the Bevelled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bevelledESet;

	/**
	 * The default value of the '{@link #getCharalign() <em>Charalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharalign()
	 * @generated
	 * @ordered
	 */
	protected static final CharalignType1 CHARALIGN_EDEFAULT = CharalignType1.LEFT;

	/**
	 * The cached value of the '{@link #getCharalign() <em>Charalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharalign()
	 * @generated
	 * @ordered
	 */
	protected CharalignType1 charalign = CHARALIGN_EDEFAULT;

	/**
	 * This is true if the Charalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean charalignESet;

	/**
	 * The default value of the '{@link #getCharspacing() <em>Charspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharspacing()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHARSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharspacing() <em>Charspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharspacing()
	 * @generated
	 * @ordered
	 */
	protected Object charspacing = CHARSPACING_EDEFAULT;

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
	 * The default value of the '{@link #getClose() <em>Close</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClose()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClose() <em>Close</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClose()
	 * @generated
	 * @ordered
	 */
	protected Object close = CLOSE_EDEFAULT;

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
	 * The default value of the '{@link #getCrossout() <em>Crossout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossout()
	 * @generated
	 * @ordered
	 */
	protected static final List<CrossoutTypeItem2> CROSSOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossout() <em>Crossout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossout()
	 * @generated
	 * @ordered
	 */
	protected List<CrossoutTypeItem2> crossout = CROSSOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalpoint() <em>Decimalpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMALPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalpoint() <em>Decimalpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalpoint()
	 * @generated
	 * @ordered
	 */
	protected String decimalpoint = DECIMALPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenomalign() <em>Denomalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenomalign()
	 * @generated
	 * @ordered
	 */
	protected static final DenomalignType1 DENOMALIGN_EDEFAULT = DenomalignType1.LEFT;

	/**
	 * The cached value of the '{@link #getDenomalign() <em>Denomalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenomalign()
	 * @generated
	 * @ordered
	 */
	protected DenomalignType1 denomalign = DENOMALIGN_EDEFAULT;

	/**
	 * This is true if the Denomalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean denomalignESet;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected String depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType2 DIR_EDEFAULT = DirType2.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType2 dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getDisplaystyle() <em>Displaystyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaystyle()
	 * @generated
	 * @ordered
	 */
	protected static final DisplaystyleType1 DISPLAYSTYLE_EDEFAULT = DisplaystyleType1.TRUE;

	/**
	 * The cached value of the '{@link #getDisplaystyle() <em>Displaystyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaystyle()
	 * @generated
	 * @ordered
	 */
	protected DisplaystyleType1 displaystyle = DISPLAYSTYLE_EDEFAULT;

	/**
	 * This is true if the Displaystyle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displaystyleESet;

	/**
	 * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeType1 EDGE_EDEFAULT = EdgeType1.LEFT;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EdgeType1 edge = EDGE_EDEFAULT;

	/**
	 * This is true if the Edge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeESet;

	/**
	 * The default value of the '{@link #getEqualcolumns() <em>Equalcolumns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualcolumns()
	 * @generated
	 * @ordered
	 */
	protected static final EqualcolumnsType1 EQUALCOLUMNS_EDEFAULT = EqualcolumnsType1.TRUE;

	/**
	 * The cached value of the '{@link #getEqualcolumns() <em>Equalcolumns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualcolumns()
	 * @generated
	 * @ordered
	 */
	protected EqualcolumnsType1 equalcolumns = EQUALCOLUMNS_EDEFAULT;

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
	protected static final EqualrowsType1 EQUALROWS_EDEFAULT = EqualrowsType1.TRUE;

	/**
	 * The cached value of the '{@link #getEqualrows() <em>Equalrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualrows()
	 * @generated
	 * @ordered
	 */
	protected EqualrowsType1 equalrows = EQUALROWS_EDEFAULT;

	/**
	 * This is true if the Equalrows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equalrowsESet;

	/**
	 * The default value of the '{@link #getFence() <em>Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFence()
	 * @generated
	 * @ordered
	 */
	protected static final FenceType1 FENCE_EDEFAULT = FenceType1.TRUE;

	/**
	 * The cached value of the '{@link #getFence() <em>Fence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFence()
	 * @generated
	 * @ordered
	 */
	protected FenceType1 fence = FENCE_EDEFAULT;

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
	protected static final FormType1 FORM_EDEFAULT = FormType1.PREFIX;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected FormType1 form = FORM_EDEFAULT;

	/**
	 * This is true if the Form attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formESet;

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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

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
	protected static final IndentalignType2 INDENTALIGN_EDEFAULT = IndentalignType2.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalign() <em>Indentalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalign()
	 * @generated
	 * @ordered
	 */
	protected IndentalignType2 indentalign = INDENTALIGN_EDEFAULT;

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
	protected static final IndentalignfirstType2 INDENTALIGNFIRST_EDEFAULT = IndentalignfirstType2.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalignfirst() <em>Indentalignfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignfirst()
	 * @generated
	 * @ordered
	 */
	protected IndentalignfirstType2 indentalignfirst = INDENTALIGNFIRST_EDEFAULT;

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
	protected static final IndentalignlastType2 INDENTALIGNLAST_EDEFAULT = IndentalignlastType2.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalignlast() <em>Indentalignlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignlast()
	 * @generated
	 * @ordered
	 */
	protected IndentalignlastType2 indentalignlast = INDENTALIGNLAST_EDEFAULT;

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
	 * The default value of the '{@link #getInfixlinebreakstyle() <em>Infixlinebreakstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfixlinebreakstyle()
	 * @generated
	 * @ordered
	 */
	protected static final InfixlinebreakstyleType INFIXLINEBREAKSTYLE_EDEFAULT = InfixlinebreakstyleType.BEFORE;

	/**
	 * The cached value of the '{@link #getInfixlinebreakstyle() <em>Infixlinebreakstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfixlinebreakstyle()
	 * @generated
	 * @ordered
	 */
	protected InfixlinebreakstyleType infixlinebreakstyle = INFIXLINEBREAKSTYLE_EDEFAULT;

	/**
	 * This is true if the Infixlinebreakstyle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean infixlinebreakstyleESet;

	/**
	 * The default value of the '{@link #getLargeop() <em>Largeop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeop()
	 * @generated
	 * @ordered
	 */
	protected static final LargeopType1 LARGEOP_EDEFAULT = LargeopType1.TRUE;

	/**
	 * The cached value of the '{@link #getLargeop() <em>Largeop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeop()
	 * @generated
	 * @ordered
	 */
	protected LargeopType1 largeop = LARGEOP_EDEFAULT;

	/**
	 * This is true if the Largeop attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean largeopESet;

	/**
	 * The default value of the '{@link #getLeftoverhang() <em>Leftoverhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftoverhang()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFTOVERHANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftoverhang() <em>Leftoverhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftoverhang()
	 * @generated
	 * @ordered
	 */
	protected String leftoverhang = LEFTOVERHANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinebreak() <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreak()
	 * @generated
	 * @ordered
	 */
	protected static final LinebreakType2 LINEBREAK_EDEFAULT = LinebreakType2.AUTO;

	/**
	 * The cached value of the '{@link #getLinebreak() <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreak()
	 * @generated
	 * @ordered
	 */
	protected LinebreakType2 linebreak = LINEBREAK_EDEFAULT;

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
	protected static final LinebreakstyleType1 LINEBREAKSTYLE_EDEFAULT = LinebreakstyleType1.BEFORE;

	/**
	 * The cached value of the '{@link #getLinebreakstyle() <em>Linebreakstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreakstyle()
	 * @generated
	 * @ordered
	 */
	protected LinebreakstyleType1 linebreakstyle = LINEBREAKSTYLE_EDEFAULT;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final LocationType2 LOCATION_EDEFAULT = LocationType2.W;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationType2 location = LOCATION_EDEFAULT;

	/**
	 * This is true if the Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationESet;

	/**
	 * The default value of the '{@link #getLongdivstyle() <em>Longdivstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongdivstyle()
	 * @generated
	 * @ordered
	 */
	protected static final LongdivstyleType1 LONGDIVSTYLE_EDEFAULT = LongdivstyleType1.LEFTTOP;

	/**
	 * The cached value of the '{@link #getLongdivstyle() <em>Longdivstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongdivstyle()
	 * @generated
	 * @ordered
	 */
	protected LongdivstyleType1 longdivstyle = LONGDIVSTYLE_EDEFAULT;

	/**
	 * This is true if the Longdivstyle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longdivstyleESet;

	/**
	 * The default value of the '{@link #getLquote() <em>Lquote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLquote()
	 * @generated
	 * @ordered
	 */
	protected static final Object LQUOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLquote() <em>Lquote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLquote()
	 * @generated
	 * @ordered
	 */
	protected Object lquote = LQUOTE_EDEFAULT;

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
	protected static final MathvariantType2 MATHVARIANT_EDEFAULT = MathvariantType2.NORMAL;

	/**
	 * The cached value of the '{@link #getMathvariant() <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathvariant()
	 * @generated
	 * @ordered
	 */
	protected MathvariantType2 mathvariant = MATHVARIANT_EDEFAULT;

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
	 * The default value of the '{@link #getMediummathspace() <em>Mediummathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediummathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIUMMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediummathspace() <em>Mediummathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediummathspace()
	 * @generated
	 * @ordered
	 */
	protected String mediummathspace = MEDIUMMATHSPACE_EDEFAULT;

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
	protected static final MovablelimitsType1 MOVABLELIMITS_EDEFAULT = MovablelimitsType1.TRUE;

	/**
	 * The cached value of the '{@link #getMovablelimits() <em>Movablelimits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovablelimits()
	 * @generated
	 * @ordered
	 */
	protected MovablelimitsType1 movablelimits = MOVABLELIMITS_EDEFAULT;

	/**
	 * This is true if the Movablelimits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean movablelimitsESet;

	/**
	 * The default value of the '{@link #getMslinethickness() <em>Mslinethickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMslinethickness()
	 * @generated
	 * @ordered
	 */
	protected static final Object MSLINETHICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMslinethickness() <em>Mslinethickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMslinethickness()
	 * @generated
	 * @ordered
	 */
	protected Object mslinethickness = MSLINETHICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected static final Object NOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected Object notation = NOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumalign() <em>Numalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumalign()
	 * @generated
	 * @ordered
	 */
	protected static final NumalignType1 NUMALIGN_EDEFAULT = NumalignType1.LEFT;

	/**
	 * The cached value of the '{@link #getNumalign() <em>Numalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumalign()
	 * @generated
	 * @ordered
	 */
	protected NumalignType1 numalign = NUMALIGN_EDEFAULT;

	/**
	 * This is true if the Numalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numalignESet;

	/**
	 * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected static final Object OPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected Object open = OPEN_EDEFAULT;

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
	 * The default value of the '{@link #getRightoverhang() <em>Rightoverhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightoverhang()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTOVERHANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightoverhang() <em>Rightoverhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightoverhang()
	 * @generated
	 * @ordered
	 */
	protected String rightoverhang = RIGHTOVERHANG_EDEFAULT;

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
	 * The default value of the '{@link #getRquote() <em>Rquote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRquote()
	 * @generated
	 * @ordered
	 */
	protected static final Object RQUOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRquote() <em>Rquote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRquote()
	 * @generated
	 * @ordered
	 */
	protected Object rquote = RQUOTE_EDEFAULT;

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
	 * The default value of the '{@link #getScriptlevel() <em>Scriptlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptlevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SCRIPTLEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptlevel() <em>Scriptlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptlevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger scriptlevel = SCRIPTLEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptminsize() <em>Scriptminsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptminsize()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPTMINSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptminsize() <em>Scriptminsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptminsize()
	 * @generated
	 * @ordered
	 */
	protected String scriptminsize = SCRIPTMINSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptsizemultiplier() <em>Scriptsizemultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptsizemultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCRIPTSIZEMULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptsizemultiplier() <em>Scriptsizemultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptsizemultiplier()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal scriptsizemultiplier = SCRIPTSIZEMULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected BigInteger selection = SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final SeparatorType1 SEPARATOR_EDEFAULT = SeparatorType1.TRUE;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected SeparatorType1 separator = SEPARATOR_EDEFAULT;

	/**
	 * This is true if the Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean separatorESet;

	/**
	 * The default value of the '{@link #getSeparators() <em>Separators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparators()
	 * @generated
	 * @ordered
	 */
	protected static final Object SEPARATORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparators() <em>Separators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparators()
	 * @generated
	 * @ordered
	 */
	protected Object separators = SEPARATORS_EDEFAULT;

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
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final SideType1 SIDE_EDEFAULT = SideType1.LEFT;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected SideType1 side = SIDE_EDEFAULT;

	/**
	 * This is true if the Side attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sideESet;

	/**
	 * The default value of the '{@link #getStackalign() <em>Stackalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackalign()
	 * @generated
	 * @ordered
	 */
	protected static final StackalignType1 STACKALIGN_EDEFAULT = StackalignType1.LEFT;

	/**
	 * The cached value of the '{@link #getStackalign() <em>Stackalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackalign()
	 * @generated
	 * @ordered
	 */
	protected StackalignType1 stackalign = STACKALIGN_EDEFAULT;

	/**
	 * This is true if the Stackalign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stackalignESet;

	/**
	 * The default value of the '{@link #getStretchy() <em>Stretchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchy()
	 * @generated
	 * @ordered
	 */
	protected static final StretchyType1 STRETCHY_EDEFAULT = StretchyType1.TRUE;

	/**
	 * The cached value of the '{@link #getStretchy() <em>Stretchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretchy()
	 * @generated
	 * @ordered
	 */
	protected StretchyType1 stretchy = STRETCHY_EDEFAULT;

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
	 * The default value of the '{@link #getSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetricType1 SYMMETRIC_EDEFAULT = SymmetricType1.TRUE;

	/**
	 * The cached value of the '{@link #getSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetric()
	 * @generated
	 * @ordered
	 */
	protected SymmetricType1 symmetric = SYMMETRIC_EDEFAULT;

	/**
	 * This is true if the Symmetric attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetricESet;

	/**
	 * The default value of the '{@link #getThickmathspace() <em>Thickmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickmathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String THICKMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThickmathspace() <em>Thickmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickmathspace()
	 * @generated
	 * @ordered
	 */
	protected String thickmathspace = THICKMATHSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinmathspace() <em>Thinmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinmathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String THINMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThinmathspace() <em>Thinmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinmathspace()
	 * @generated
	 * @ordered
	 */
	protected String thinmathspace = THINMATHSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected String valign = VALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerythickmathspace() <em>Verythickmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerythickmathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String VERYTHICKMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerythickmathspace() <em>Verythickmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerythickmathspace()
	 * @generated
	 * @ordered
	 */
	protected String verythickmathspace = VERYTHICKMATHSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerythinmathspace() <em>Verythinmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerythinmathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String VERYTHINMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerythinmathspace() <em>Verythinmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerythinmathspace()
	 * @generated
	 * @ordered
	 */
	protected String verythinmathspace = VERYTHINMATHSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVeryverythickmathspace() <em>Veryverythickmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeryverythickmathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String VERYVERYTHICKMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVeryverythickmathspace() <em>Veryverythickmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeryverythickmathspace()
	 * @generated
	 * @ordered
	 */
	protected String veryverythickmathspace = VERYVERYTHICKMATHSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVeryverythinmathspace() <em>Veryverythinmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeryverythinmathspace()
	 * @generated
	 * @ordered
	 */
	protected static final String VERYVERYTHINMATHSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVeryverythinmathspace() <em>Veryverythinmathspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeryverythinmathspace()
	 * @generated
	 * @ordered
	 */
	protected String veryverythinmathspace = VERYVERYTHINMATHSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

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
	protected MstyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMstyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccentType3 getAccent() {
		return accent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccent(AccentType3 newAccent) {
		AccentType3 oldAccent = accent;
		accent = newAccent == null ? ACCENT_EDEFAULT : newAccent;
		boolean oldAccentESet = accentESet;
		accentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ACCENT, oldAccent, accent, !oldAccentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAccent() {
		AccentType3 oldAccent = accent;
		boolean oldAccentESet = accentESet;
		accent = ACCENT_EDEFAULT;
		accentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__ACCENT, oldAccent, ACCENT_EDEFAULT, oldAccentESet));
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
	public AccentunderType2 getAccentunder() {
		return accentunder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccentunder(AccentunderType2 newAccentunder) {
		AccentunderType2 oldAccentunder = accentunder;
		accentunder = newAccentunder == null ? ACCENTUNDER_EDEFAULT : newAccentunder;
		boolean oldAccentunderESet = accentunderESet;
		accentunderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ACCENTUNDER, oldAccentunder, accentunder, !oldAccentunderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAccentunder() {
		AccentunderType2 oldAccentunder = accentunder;
		boolean oldAccentunderESet = accentunderESet;
		accentunder = ACCENTUNDER_EDEFAULT;
		accentunderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__ACCENTUNDER, oldAccentunder, ACCENTUNDER_EDEFAULT, oldAccentunderESet));
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
	public AlignType5 getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(AlignType5 newAlign) {
		AlignType5 oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlign() {
		AlignType5 oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
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
	public List<AlignmentscopeTypeBaseItem1> getAlignmentscope() {
		return alignmentscope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignmentscope(List<AlignmentscopeTypeBaseItem1> newAlignmentscope) {
		List<AlignmentscopeTypeBaseItem1> oldAlignmentscope = alignmentscope;
		alignmentscope = newAlignmentscope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ALIGNMENTSCOPE, oldAlignmentscope, alignmentscope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BevelledType1 getBevelled() {
		return bevelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBevelled(BevelledType1 newBevelled) {
		BevelledType1 oldBevelled = bevelled;
		bevelled = newBevelled == null ? BEVELLED_EDEFAULT : newBevelled;
		boolean oldBevelledESet = bevelledESet;
		bevelledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__BEVELLED, oldBevelled, bevelled, !oldBevelledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBevelled() {
		BevelledType1 oldBevelled = bevelled;
		boolean oldBevelledESet = bevelledESet;
		bevelled = BEVELLED_EDEFAULT;
		bevelledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__BEVELLED, oldBevelled, BEVELLED_EDEFAULT, oldBevelledESet));
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
	public CharalignType1 getCharalign() {
		return charalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharalign(CharalignType1 newCharalign) {
		CharalignType1 oldCharalign = charalign;
		charalign = newCharalign == null ? CHARALIGN_EDEFAULT : newCharalign;
		boolean oldCharalignESet = charalignESet;
		charalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__CHARALIGN, oldCharalign, charalign, !oldCharalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCharalign() {
		CharalignType1 oldCharalign = charalign;
		boolean oldCharalignESet = charalignESet;
		charalign = CHARALIGN_EDEFAULT;
		charalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__CHARALIGN, oldCharalign, CHARALIGN_EDEFAULT, oldCharalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCharalign() {
		return charalignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCharspacing() {
		return charspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharspacing(Object newCharspacing) {
		Object oldCharspacing = charspacing;
		charspacing = newCharspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__CHARSPACING, oldCharspacing, charspacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getClose() {
		return close;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClose(Object newClose) {
		Object oldClose = close;
		close = newClose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__CLOSE, oldClose, close));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__COLUMNALIGN, oldColumnalign, columnalign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__COLUMNLINES, oldColumnlines, columnlines));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__COLUMNSPACING, oldColumnspacing, columnspacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__COLUMNSPAN, oldColumnspan, columnspan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__COLUMNWIDTH, oldColumnwidth, columnwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<CrossoutTypeItem2> getCrossout() {
		return crossout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossout(List<CrossoutTypeItem2> newCrossout) {
		List<CrossoutTypeItem2> oldCrossout = crossout;
		crossout = newCrossout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__CROSSOUT, oldCrossout, crossout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecimalpoint() {
		return decimalpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalpoint(String newDecimalpoint) {
		String oldDecimalpoint = decimalpoint;
		decimalpoint = newDecimalpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__DECIMALPOINT, oldDecimalpoint, decimalpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DenomalignType1 getDenomalign() {
		return denomalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDenomalign(DenomalignType1 newDenomalign) {
		DenomalignType1 oldDenomalign = denomalign;
		denomalign = newDenomalign == null ? DENOMALIGN_EDEFAULT : newDenomalign;
		boolean oldDenomalignESet = denomalignESet;
		denomalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__DENOMALIGN, oldDenomalign, denomalign, !oldDenomalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDenomalign() {
		DenomalignType1 oldDenomalign = denomalign;
		boolean oldDenomalignESet = denomalignESet;
		denomalign = DENOMALIGN_EDEFAULT;
		denomalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__DENOMALIGN, oldDenomalign, DENOMALIGN_EDEFAULT, oldDenomalignESet));
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
	public String getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepth(String newDepth) {
		String oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirType2 getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(DirType2 newDir) {
		DirType2 oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDir() {
		DirType2 oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
	public DisplaystyleType1 getDisplaystyle() {
		return displaystyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplaystyle(DisplaystyleType1 newDisplaystyle) {
		DisplaystyleType1 oldDisplaystyle = displaystyle;
		displaystyle = newDisplaystyle == null ? DISPLAYSTYLE_EDEFAULT : newDisplaystyle;
		boolean oldDisplaystyleESet = displaystyleESet;
		displaystyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__DISPLAYSTYLE, oldDisplaystyle, displaystyle, !oldDisplaystyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplaystyle() {
		DisplaystyleType1 oldDisplaystyle = displaystyle;
		boolean oldDisplaystyleESet = displaystyleESet;
		displaystyle = DISPLAYSTYLE_EDEFAULT;
		displaystyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__DISPLAYSTYLE, oldDisplaystyle, DISPLAYSTYLE_EDEFAULT, oldDisplaystyleESet));
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
	public EdgeType1 getEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdge(EdgeType1 newEdge) {
		EdgeType1 oldEdge = edge;
		edge = newEdge == null ? EDGE_EDEFAULT : newEdge;
		boolean oldEdgeESet = edgeESet;
		edgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__EDGE, oldEdge, edge, !oldEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEdge() {
		EdgeType1 oldEdge = edge;
		boolean oldEdgeESet = edgeESet;
		edge = EDGE_EDEFAULT;
		edgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__EDGE, oldEdge, EDGE_EDEFAULT, oldEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEdge() {
		return edgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualcolumnsType1 getEqualcolumns() {
		return equalcolumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualcolumns(EqualcolumnsType1 newEqualcolumns) {
		EqualcolumnsType1 oldEqualcolumns = equalcolumns;
		equalcolumns = newEqualcolumns == null ? EQUALCOLUMNS_EDEFAULT : newEqualcolumns;
		boolean oldEqualcolumnsESet = equalcolumnsESet;
		equalcolumnsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__EQUALCOLUMNS, oldEqualcolumns, equalcolumns, !oldEqualcolumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEqualcolumns() {
		EqualcolumnsType1 oldEqualcolumns = equalcolumns;
		boolean oldEqualcolumnsESet = equalcolumnsESet;
		equalcolumns = EQUALCOLUMNS_EDEFAULT;
		equalcolumnsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__EQUALCOLUMNS, oldEqualcolumns, EQUALCOLUMNS_EDEFAULT, oldEqualcolumnsESet));
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
	public EqualrowsType1 getEqualrows() {
		return equalrows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualrows(EqualrowsType1 newEqualrows) {
		EqualrowsType1 oldEqualrows = equalrows;
		equalrows = newEqualrows == null ? EQUALROWS_EDEFAULT : newEqualrows;
		boolean oldEqualrowsESet = equalrowsESet;
		equalrowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__EQUALROWS, oldEqualrows, equalrows, !oldEqualrowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEqualrows() {
		EqualrowsType1 oldEqualrows = equalrows;
		boolean oldEqualrowsESet = equalrowsESet;
		equalrows = EQUALROWS_EDEFAULT;
		equalrowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__EQUALROWS, oldEqualrows, EQUALROWS_EDEFAULT, oldEqualrowsESet));
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
	public FenceType1 getFence() {
		return fence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFence(FenceType1 newFence) {
		FenceType1 oldFence = fence;
		fence = newFence == null ? FENCE_EDEFAULT : newFence;
		boolean oldFenceESet = fenceESet;
		fenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FENCE, oldFence, fence, !oldFenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFence() {
		FenceType1 oldFence = fence;
		boolean oldFenceESet = fenceESet;
		fence = FENCE_EDEFAULT;
		fenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__FENCE, oldFence, FENCE_EDEFAULT, oldFenceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FONTFAMILY, oldFontfamily, fontfamily));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FONTSIZE, oldFontsize, fontsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FONTSTYLE, oldFontstyle, fontstyle, !oldFontstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__FONTSTYLE, oldFontstyle, FONTSTYLE_EDEFAULT, oldFontstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FONTWEIGHT, oldFontweight, fontweight, !oldFontweightESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__FONTWEIGHT, oldFontweight, FONTWEIGHT_EDEFAULT, oldFontweightESet));
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
	public FormType1 getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForm(FormType1 newForm) {
		FormType1 oldForm = form;
		form = newForm == null ? FORM_EDEFAULT : newForm;
		boolean oldFormESet = formESet;
		formESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FORM, oldForm, form, !oldFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetForm() {
		FormType1 oldForm = form;
		boolean oldFormESet = formESet;
		form = FORM_EDEFAULT;
		formESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__FORM, oldForm, FORM_EDEFAULT, oldFormESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FRAME, oldFrame, frame, !oldFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__FRAMESPACING, oldFramespacing, framespacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__GROUPALIGN, oldGroupalign, groupalign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndentalignType2 getIndentalign() {
		return indentalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalign(IndentalignType2 newIndentalign) {
		IndentalignType2 oldIndentalign = indentalign;
		indentalign = newIndentalign == null ? INDENTALIGN_EDEFAULT : newIndentalign;
		boolean oldIndentalignESet = indentalignESet;
		indentalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTALIGN, oldIndentalign, indentalign, !oldIndentalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalign() {
		IndentalignType2 oldIndentalign = indentalign;
		boolean oldIndentalignESet = indentalignESet;
		indentalign = INDENTALIGN_EDEFAULT;
		indentalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__INDENTALIGN, oldIndentalign, INDENTALIGN_EDEFAULT, oldIndentalignESet));
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
	public IndentalignfirstType2 getIndentalignfirst() {
		return indentalignfirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalignfirst(IndentalignfirstType2 newIndentalignfirst) {
		IndentalignfirstType2 oldIndentalignfirst = indentalignfirst;
		indentalignfirst = newIndentalignfirst == null ? INDENTALIGNFIRST_EDEFAULT : newIndentalignfirst;
		boolean oldIndentalignfirstESet = indentalignfirstESet;
		indentalignfirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTALIGNFIRST, oldIndentalignfirst, indentalignfirst, !oldIndentalignfirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalignfirst() {
		IndentalignfirstType2 oldIndentalignfirst = indentalignfirst;
		boolean oldIndentalignfirstESet = indentalignfirstESet;
		indentalignfirst = INDENTALIGNFIRST_EDEFAULT;
		indentalignfirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__INDENTALIGNFIRST, oldIndentalignfirst, INDENTALIGNFIRST_EDEFAULT, oldIndentalignfirstESet));
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
	public IndentalignlastType2 getIndentalignlast() {
		return indentalignlast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalignlast(IndentalignlastType2 newIndentalignlast) {
		IndentalignlastType2 oldIndentalignlast = indentalignlast;
		indentalignlast = newIndentalignlast == null ? INDENTALIGNLAST_EDEFAULT : newIndentalignlast;
		boolean oldIndentalignlastESet = indentalignlastESet;
		indentalignlastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTALIGNLAST, oldIndentalignlast, indentalignlast, !oldIndentalignlastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalignlast() {
		IndentalignlastType2 oldIndentalignlast = indentalignlast;
		boolean oldIndentalignlastESet = indentalignlastESet;
		indentalignlast = INDENTALIGNLAST_EDEFAULT;
		indentalignlastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__INDENTALIGNLAST, oldIndentalignlast, INDENTALIGNLAST_EDEFAULT, oldIndentalignlastESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTSHIFT, oldIndentshift, indentshift));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTSHIFTFIRST, oldIndentshiftfirst, indentshiftfirst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTSHIFTLAST, oldIndentshiftlast, indentshiftlast));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INDENTTARGET, oldIndenttarget, indenttarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixlinebreakstyleType getInfixlinebreakstyle() {
		return infixlinebreakstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfixlinebreakstyle(InfixlinebreakstyleType newInfixlinebreakstyle) {
		InfixlinebreakstyleType oldInfixlinebreakstyle = infixlinebreakstyle;
		infixlinebreakstyle = newInfixlinebreakstyle == null ? INFIXLINEBREAKSTYLE_EDEFAULT : newInfixlinebreakstyle;
		boolean oldInfixlinebreakstyleESet = infixlinebreakstyleESet;
		infixlinebreakstyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__INFIXLINEBREAKSTYLE, oldInfixlinebreakstyle, infixlinebreakstyle, !oldInfixlinebreakstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInfixlinebreakstyle() {
		InfixlinebreakstyleType oldInfixlinebreakstyle = infixlinebreakstyle;
		boolean oldInfixlinebreakstyleESet = infixlinebreakstyleESet;
		infixlinebreakstyle = INFIXLINEBREAKSTYLE_EDEFAULT;
		infixlinebreakstyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__INFIXLINEBREAKSTYLE, oldInfixlinebreakstyle, INFIXLINEBREAKSTYLE_EDEFAULT, oldInfixlinebreakstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInfixlinebreakstyle() {
		return infixlinebreakstyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeopType1 getLargeop() {
		return largeop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLargeop(LargeopType1 newLargeop) {
		LargeopType1 oldLargeop = largeop;
		largeop = newLargeop == null ? LARGEOP_EDEFAULT : newLargeop;
		boolean oldLargeopESet = largeopESet;
		largeopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LARGEOP, oldLargeop, largeop, !oldLargeopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLargeop() {
		LargeopType1 oldLargeop = largeop;
		boolean oldLargeopESet = largeopESet;
		largeop = LARGEOP_EDEFAULT;
		largeopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__LARGEOP, oldLargeop, LARGEOP_EDEFAULT, oldLargeopESet));
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
	public String getLeftoverhang() {
		return leftoverhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftoverhang(String newLeftoverhang) {
		String oldLeftoverhang = leftoverhang;
		leftoverhang = newLeftoverhang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LEFTOVERHANG, oldLeftoverhang, leftoverhang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(BigInteger newLength) {
		BigInteger oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinebreakType2 getLinebreak() {
		return linebreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinebreak(LinebreakType2 newLinebreak) {
		LinebreakType2 oldLinebreak = linebreak;
		linebreak = newLinebreak == null ? LINEBREAK_EDEFAULT : newLinebreak;
		boolean oldLinebreakESet = linebreakESet;
		linebreakESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LINEBREAK, oldLinebreak, linebreak, !oldLinebreakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinebreak() {
		LinebreakType2 oldLinebreak = linebreak;
		boolean oldLinebreakESet = linebreakESet;
		linebreak = LINEBREAK_EDEFAULT;
		linebreakESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__LINEBREAK, oldLinebreak, LINEBREAK_EDEFAULT, oldLinebreakESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LINEBREAKMULTCHAR, oldLinebreakmultchar, linebreakmultchar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinebreakstyleType1 getLinebreakstyle() {
		return linebreakstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinebreakstyle(LinebreakstyleType1 newLinebreakstyle) {
		LinebreakstyleType1 oldLinebreakstyle = linebreakstyle;
		linebreakstyle = newLinebreakstyle == null ? LINEBREAKSTYLE_EDEFAULT : newLinebreakstyle;
		boolean oldLinebreakstyleESet = linebreakstyleESet;
		linebreakstyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LINEBREAKSTYLE, oldLinebreakstyle, linebreakstyle, !oldLinebreakstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinebreakstyle() {
		LinebreakstyleType1 oldLinebreakstyle = linebreakstyle;
		boolean oldLinebreakstyleESet = linebreakstyleESet;
		linebreakstyle = LINEBREAKSTYLE_EDEFAULT;
		linebreakstyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__LINEBREAKSTYLE, oldLinebreakstyle, LINEBREAKSTYLE_EDEFAULT, oldLinebreakstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LINELEADING, oldLineleading, lineleading));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LINETHICKNESS, oldLinethickness, linethickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationType2 getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(LocationType2 newLocation) {
		LocationType2 oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		boolean oldLocationESet = locationESet;
		locationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LOCATION, oldLocation, location, !oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLocation() {
		LocationType2 oldLocation = location;
		boolean oldLocationESet = locationESet;
		location = LOCATION_EDEFAULT;
		locationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__LOCATION, oldLocation, LOCATION_EDEFAULT, oldLocationESet));
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
	public LongdivstyleType1 getLongdivstyle() {
		return longdivstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongdivstyle(LongdivstyleType1 newLongdivstyle) {
		LongdivstyleType1 oldLongdivstyle = longdivstyle;
		longdivstyle = newLongdivstyle == null ? LONGDIVSTYLE_EDEFAULT : newLongdivstyle;
		boolean oldLongdivstyleESet = longdivstyleESet;
		longdivstyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LONGDIVSTYLE, oldLongdivstyle, longdivstyle, !oldLongdivstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLongdivstyle() {
		LongdivstyleType1 oldLongdivstyle = longdivstyle;
		boolean oldLongdivstyleESet = longdivstyleESet;
		longdivstyle = LONGDIVSTYLE_EDEFAULT;
		longdivstyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__LONGDIVSTYLE, oldLongdivstyle, LONGDIVSTYLE_EDEFAULT, oldLongdivstyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLongdivstyle() {
		return longdivstyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLquote() {
		return lquote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLquote(Object newLquote) {
		Object oldLquote = lquote;
		lquote = newLquote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LQUOTE, oldLquote, lquote));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__LSPACE, oldLspace, lspace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MATHSIZE, oldMathsize, mathsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathvariantType2 getMathvariant() {
		return mathvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathvariant(MathvariantType2 newMathvariant) {
		MathvariantType2 oldMathvariant = mathvariant;
		mathvariant = newMathvariant == null ? MATHVARIANT_EDEFAULT : newMathvariant;
		boolean oldMathvariantESet = mathvariantESet;
		mathvariantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MATHVARIANT, oldMathvariant, mathvariant, !oldMathvariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMathvariant() {
		MathvariantType2 oldMathvariant = mathvariant;
		boolean oldMathvariantESet = mathvariantESet;
		mathvariant = MATHVARIANT_EDEFAULT;
		mathvariantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__MATHVARIANT, oldMathvariant, MATHVARIANT_EDEFAULT, oldMathvariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MAXSIZE, oldMaxsize, maxsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediummathspace() {
		return mediummathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediummathspace(String newMediummathspace) {
		String oldMediummathspace = mediummathspace;
		mediummathspace = newMediummathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MEDIUMMATHSPACE, oldMediummathspace, mediummathspace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MINLABELSPACING, oldMinlabelspacing, minlabelspacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MINSIZE, oldMinsize, minsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovablelimitsType1 getMovablelimits() {
		return movablelimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMovablelimits(MovablelimitsType1 newMovablelimits) {
		MovablelimitsType1 oldMovablelimits = movablelimits;
		movablelimits = newMovablelimits == null ? MOVABLELIMITS_EDEFAULT : newMovablelimits;
		boolean oldMovablelimitsESet = movablelimitsESet;
		movablelimitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MOVABLELIMITS, oldMovablelimits, movablelimits, !oldMovablelimitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMovablelimits() {
		MovablelimitsType1 oldMovablelimits = movablelimits;
		boolean oldMovablelimitsESet = movablelimitsESet;
		movablelimits = MOVABLELIMITS_EDEFAULT;
		movablelimitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__MOVABLELIMITS, oldMovablelimits, MOVABLELIMITS_EDEFAULT, oldMovablelimitsESet));
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
	public Object getMslinethickness() {
		return mslinethickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMslinethickness(Object newMslinethickness) {
		Object oldMslinethickness = mslinethickness;
		mslinethickness = newMslinethickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__MSLINETHICKNESS, oldMslinethickness, mslinethickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotation(Object newNotation) {
		Object oldNotation = notation;
		notation = newNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__NOTATION, oldNotation, notation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumalignType1 getNumalign() {
		return numalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumalign(NumalignType1 newNumalign) {
		NumalignType1 oldNumalign = numalign;
		numalign = newNumalign == null ? NUMALIGN_EDEFAULT : newNumalign;
		boolean oldNumalignESet = numalignESet;
		numalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__NUMALIGN, oldNumalign, numalign, !oldNumalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNumalign() {
		NumalignType1 oldNumalign = numalign;
		boolean oldNumalignESet = numalignESet;
		numalign = NUMALIGN_EDEFAULT;
		numalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__NUMALIGN, oldNumalign, NUMALIGN_EDEFAULT, oldNumalignESet));
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
	public Object getOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen(Object newOpen) {
		Object oldOpen = open;
		open = newOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__OPEN, oldOpen, open));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightoverhang() {
		return rightoverhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightoverhang(String newRightoverhang) {
		String oldRightoverhang = rightoverhang;
		rightoverhang = newRightoverhang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__RIGHTOVERHANG, oldRightoverhang, rightoverhang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ROWALIGN, oldRowalign, rowalign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ROWLINES, oldRowlines, rowlines));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ROWSPACING, oldRowspacing, rowspacing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRquote() {
		return rquote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRquote(Object newRquote) {
		Object oldRquote = rquote;
		rquote = newRquote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__RQUOTE, oldRquote, rquote));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__RSPACE, oldRspace, rspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getScriptlevel() {
		return scriptlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptlevel(BigInteger newScriptlevel) {
		BigInteger oldScriptlevel = scriptlevel;
		scriptlevel = newScriptlevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SCRIPTLEVEL, oldScriptlevel, scriptlevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptminsize() {
		return scriptminsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptminsize(String newScriptminsize) {
		String oldScriptminsize = scriptminsize;
		scriptminsize = newScriptminsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SCRIPTMINSIZE, oldScriptminsize, scriptminsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScriptsizemultiplier() {
		return scriptsizemultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptsizemultiplier(BigDecimal newScriptsizemultiplier) {
		BigDecimal oldScriptsizemultiplier = scriptsizemultiplier;
		scriptsizemultiplier = newScriptsizemultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SCRIPTSIZEMULTIPLIER, oldScriptsizemultiplier, scriptsizemultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelection(BigInteger newSelection) {
		BigInteger oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeparatorType1 getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparator(SeparatorType1 newSeparator) {
		SeparatorType1 oldSeparator = separator;
		separator = newSeparator == null ? SEPARATOR_EDEFAULT : newSeparator;
		boolean oldSeparatorESet = separatorESet;
		separatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SEPARATOR, oldSeparator, separator, !oldSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSeparator() {
		SeparatorType1 oldSeparator = separator;
		boolean oldSeparatorESet = separatorESet;
		separator = SEPARATOR_EDEFAULT;
		separatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__SEPARATOR, oldSeparator, SEPARATOR_EDEFAULT, oldSeparatorESet));
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
	public Object getSeparators() {
		return separators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparators(Object newSeparators) {
		Object oldSeparators = separators;
		separators = newSeparators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SEPARATORS, oldSeparators, separators));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SHIFT, oldShift, shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideType1 getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSide(SideType1 newSide) {
		SideType1 oldSide = side;
		side = newSide == null ? SIDE_EDEFAULT : newSide;
		boolean oldSideESet = sideESet;
		sideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SIDE, oldSide, side, !oldSideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSide() {
		SideType1 oldSide = side;
		boolean oldSideESet = sideESet;
		side = SIDE_EDEFAULT;
		sideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__SIDE, oldSide, SIDE_EDEFAULT, oldSideESet));
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
	public StackalignType1 getStackalign() {
		return stackalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackalign(StackalignType1 newStackalign) {
		StackalignType1 oldStackalign = stackalign;
		stackalign = newStackalign == null ? STACKALIGN_EDEFAULT : newStackalign;
		boolean oldStackalignESet = stackalignESet;
		stackalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__STACKALIGN, oldStackalign, stackalign, !oldStackalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStackalign() {
		StackalignType1 oldStackalign = stackalign;
		boolean oldStackalignESet = stackalignESet;
		stackalign = STACKALIGN_EDEFAULT;
		stackalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__STACKALIGN, oldStackalign, STACKALIGN_EDEFAULT, oldStackalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStackalign() {
		return stackalignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StretchyType1 getStretchy() {
		return stretchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStretchy(StretchyType1 newStretchy) {
		StretchyType1 oldStretchy = stretchy;
		stretchy = newStretchy == null ? STRETCHY_EDEFAULT : newStretchy;
		boolean oldStretchyESet = stretchyESet;
		stretchyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__STRETCHY, oldStretchy, stretchy, !oldStretchyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStretchy() {
		StretchyType1 oldStretchy = stretchy;
		boolean oldStretchyESet = stretchyESet;
		stretchy = STRETCHY_EDEFAULT;
		stretchyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__STRETCHY, oldStretchy, STRETCHY_EDEFAULT, oldStretchyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SUBSCRIPTSHIFT, oldSubscriptshift, subscriptshift));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SUPERSCRIPTSHIFT, oldSuperscriptshift, superscriptshift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetricType1 getSymmetric() {
		return symmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetric(SymmetricType1 newSymmetric) {
		SymmetricType1 oldSymmetric = symmetric;
		symmetric = newSymmetric == null ? SYMMETRIC_EDEFAULT : newSymmetric;
		boolean oldSymmetricESet = symmetricESet;
		symmetricESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__SYMMETRIC, oldSymmetric, symmetric, !oldSymmetricESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetric() {
		SymmetricType1 oldSymmetric = symmetric;
		boolean oldSymmetricESet = symmetricESet;
		symmetric = SYMMETRIC_EDEFAULT;
		symmetricESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSTYLE_TYPE__SYMMETRIC, oldSymmetric, SYMMETRIC_EDEFAULT, oldSymmetricESet));
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
	public String getThickmathspace() {
		return thickmathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThickmathspace(String newThickmathspace) {
		String oldThickmathspace = thickmathspace;
		thickmathspace = newThickmathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__THICKMATHSPACE, oldThickmathspace, thickmathspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThinmathspace() {
		return thinmathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinmathspace(String newThinmathspace) {
		String oldThinmathspace = thinmathspace;
		thinmathspace = newThinmathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__THINMATHSPACE, oldThinmathspace, thinmathspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValign(String newValign) {
		String oldValign = valign;
		valign = newValign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__VALIGN, oldValign, valign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerythickmathspace() {
		return verythickmathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerythickmathspace(String newVerythickmathspace) {
		String oldVerythickmathspace = verythickmathspace;
		verythickmathspace = newVerythickmathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__VERYTHICKMATHSPACE, oldVerythickmathspace, verythickmathspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerythinmathspace() {
		return verythinmathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerythinmathspace(String newVerythinmathspace) {
		String oldVerythinmathspace = verythinmathspace;
		verythinmathspace = newVerythinmathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__VERYTHINMATHSPACE, oldVerythinmathspace, verythinmathspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVeryverythickmathspace() {
		return veryverythickmathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVeryverythickmathspace(String newVeryverythickmathspace) {
		String oldVeryverythickmathspace = veryverythickmathspace;
		veryverythickmathspace = newVeryverythickmathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__VERYVERYTHICKMATHSPACE, oldVeryverythickmathspace, veryverythickmathspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVeryverythinmathspace() {
		return veryverythinmathspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVeryverythinmathspace(String newVeryverythinmathspace) {
		String oldVeryverythinmathspace = veryverythinmathspace;
		veryverythinmathspace = newVeryverythinmathspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__VERYVERYTHINMATHSPACE, oldVeryverythinmathspace, veryverythinmathspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSTYLE_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MSTYLE_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MSTYLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSTYLE_TYPE__ACCENT:
				return getAccent();
			case MlPackage.MSTYLE_TYPE__ACCENTUNDER:
				return getAccentunder();
			case MlPackage.MSTYLE_TYPE__ALIGN:
				return getAlign();
			case MlPackage.MSTYLE_TYPE__ALIGNMENTSCOPE:
				return getAlignmentscope();
			case MlPackage.MSTYLE_TYPE__BACKGROUND:
				return getBackground();
			case MlPackage.MSTYLE_TYPE__BEVELLED:
				return getBevelled();
			case MlPackage.MSTYLE_TYPE__CHARALIGN:
				return getCharalign();
			case MlPackage.MSTYLE_TYPE__CHARSPACING:
				return getCharspacing();
			case MlPackage.MSTYLE_TYPE__CLASS:
				return getClass_();
			case MlPackage.MSTYLE_TYPE__CLOSE:
				return getClose();
			case MlPackage.MSTYLE_TYPE__COLOR:
				return getColor();
			case MlPackage.MSTYLE_TYPE__COLUMNALIGN:
				return getColumnalign();
			case MlPackage.MSTYLE_TYPE__COLUMNLINES:
				return getColumnlines();
			case MlPackage.MSTYLE_TYPE__COLUMNSPACING:
				return getColumnspacing();
			case MlPackage.MSTYLE_TYPE__COLUMNSPAN:
				return getColumnspan();
			case MlPackage.MSTYLE_TYPE__COLUMNWIDTH:
				return getColumnwidth();
			case MlPackage.MSTYLE_TYPE__CROSSOUT:
				return getCrossout();
			case MlPackage.MSTYLE_TYPE__DECIMALPOINT:
				return getDecimalpoint();
			case MlPackage.MSTYLE_TYPE__DENOMALIGN:
				return getDenomalign();
			case MlPackage.MSTYLE_TYPE__DEPTH:
				return getDepth();
			case MlPackage.MSTYLE_TYPE__DIR:
				return getDir();
			case MlPackage.MSTYLE_TYPE__DISPLAYSTYLE:
				return getDisplaystyle();
			case MlPackage.MSTYLE_TYPE__EDGE:
				return getEdge();
			case MlPackage.MSTYLE_TYPE__EQUALCOLUMNS:
				return getEqualcolumns();
			case MlPackage.MSTYLE_TYPE__EQUALROWS:
				return getEqualrows();
			case MlPackage.MSTYLE_TYPE__FENCE:
				return getFence();
			case MlPackage.MSTYLE_TYPE__FONTFAMILY:
				return getFontfamily();
			case MlPackage.MSTYLE_TYPE__FONTSIZE:
				return getFontsize();
			case MlPackage.MSTYLE_TYPE__FONTSTYLE:
				return getFontstyle();
			case MlPackage.MSTYLE_TYPE__FONTWEIGHT:
				return getFontweight();
			case MlPackage.MSTYLE_TYPE__FORM:
				return getForm();
			case MlPackage.MSTYLE_TYPE__FRAME:
				return getFrame();
			case MlPackage.MSTYLE_TYPE__FRAMESPACING:
				return getFramespacing();
			case MlPackage.MSTYLE_TYPE__GROUPALIGN:
				return getGroupalign();
			case MlPackage.MSTYLE_TYPE__HEIGHT:
				return getHeight();
			case MlPackage.MSTYLE_TYPE__HREF:
				return getHref();
			case MlPackage.MSTYLE_TYPE__ID:
				return getId();
			case MlPackage.MSTYLE_TYPE__INDENTALIGN:
				return getIndentalign();
			case MlPackage.MSTYLE_TYPE__INDENTALIGNFIRST:
				return getIndentalignfirst();
			case MlPackage.MSTYLE_TYPE__INDENTALIGNLAST:
				return getIndentalignlast();
			case MlPackage.MSTYLE_TYPE__INDENTSHIFT:
				return getIndentshift();
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTFIRST:
				return getIndentshiftfirst();
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTLAST:
				return getIndentshiftlast();
			case MlPackage.MSTYLE_TYPE__INDENTTARGET:
				return getIndenttarget();
			case MlPackage.MSTYLE_TYPE__INFIXLINEBREAKSTYLE:
				return getInfixlinebreakstyle();
			case MlPackage.MSTYLE_TYPE__LARGEOP:
				return getLargeop();
			case MlPackage.MSTYLE_TYPE__LEFTOVERHANG:
				return getLeftoverhang();
			case MlPackage.MSTYLE_TYPE__LENGTH:
				return getLength();
			case MlPackage.MSTYLE_TYPE__LINEBREAK:
				return getLinebreak();
			case MlPackage.MSTYLE_TYPE__LINEBREAKMULTCHAR:
				return getLinebreakmultchar();
			case MlPackage.MSTYLE_TYPE__LINEBREAKSTYLE:
				return getLinebreakstyle();
			case MlPackage.MSTYLE_TYPE__LINELEADING:
				return getLineleading();
			case MlPackage.MSTYLE_TYPE__LINETHICKNESS:
				return getLinethickness();
			case MlPackage.MSTYLE_TYPE__LOCATION:
				return getLocation();
			case MlPackage.MSTYLE_TYPE__LONGDIVSTYLE:
				return getLongdivstyle();
			case MlPackage.MSTYLE_TYPE__LQUOTE:
				return getLquote();
			case MlPackage.MSTYLE_TYPE__LSPACE:
				return getLspace();
			case MlPackage.MSTYLE_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MSTYLE_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MSTYLE_TYPE__MATHSIZE:
				return getMathsize();
			case MlPackage.MSTYLE_TYPE__MATHVARIANT:
				return getMathvariant();
			case MlPackage.MSTYLE_TYPE__MAXSIZE:
				return getMaxsize();
			case MlPackage.MSTYLE_TYPE__MEDIUMMATHSPACE:
				return getMediummathspace();
			case MlPackage.MSTYLE_TYPE__MINLABELSPACING:
				return getMinlabelspacing();
			case MlPackage.MSTYLE_TYPE__MINSIZE:
				return getMinsize();
			case MlPackage.MSTYLE_TYPE__MOVABLELIMITS:
				return getMovablelimits();
			case MlPackage.MSTYLE_TYPE__MSLINETHICKNESS:
				return getMslinethickness();
			case MlPackage.MSTYLE_TYPE__NOTATION:
				return getNotation();
			case MlPackage.MSTYLE_TYPE__NUMALIGN:
				return getNumalign();
			case MlPackage.MSTYLE_TYPE__OPEN:
				return getOpen();
			case MlPackage.MSTYLE_TYPE__OTHER:
				return getOther();
			case MlPackage.MSTYLE_TYPE__POSITION:
				return getPosition();
			case MlPackage.MSTYLE_TYPE__RIGHTOVERHANG:
				return getRightoverhang();
			case MlPackage.MSTYLE_TYPE__ROWALIGN:
				return getRowalign();
			case MlPackage.MSTYLE_TYPE__ROWLINES:
				return getRowlines();
			case MlPackage.MSTYLE_TYPE__ROWSPACING:
				return getRowspacing();
			case MlPackage.MSTYLE_TYPE__ROWSPAN:
				return getRowspan();
			case MlPackage.MSTYLE_TYPE__RQUOTE:
				return getRquote();
			case MlPackage.MSTYLE_TYPE__RSPACE:
				return getRspace();
			case MlPackage.MSTYLE_TYPE__SCRIPTLEVEL:
				return getScriptlevel();
			case MlPackage.MSTYLE_TYPE__SCRIPTMINSIZE:
				return getScriptminsize();
			case MlPackage.MSTYLE_TYPE__SCRIPTSIZEMULTIPLIER:
				return getScriptsizemultiplier();
			case MlPackage.MSTYLE_TYPE__SELECTION:
				return getSelection();
			case MlPackage.MSTYLE_TYPE__SEPARATOR:
				return getSeparator();
			case MlPackage.MSTYLE_TYPE__SEPARATORS:
				return getSeparators();
			case MlPackage.MSTYLE_TYPE__SHIFT:
				return getShift();
			case MlPackage.MSTYLE_TYPE__SIDE:
				return getSide();
			case MlPackage.MSTYLE_TYPE__STACKALIGN:
				return getStackalign();
			case MlPackage.MSTYLE_TYPE__STRETCHY:
				return getStretchy();
			case MlPackage.MSTYLE_TYPE__STYLE:
				return getStyle();
			case MlPackage.MSTYLE_TYPE__SUBSCRIPTSHIFT:
				return getSubscriptshift();
			case MlPackage.MSTYLE_TYPE__SUPERSCRIPTSHIFT:
				return getSuperscriptshift();
			case MlPackage.MSTYLE_TYPE__SYMMETRIC:
				return getSymmetric();
			case MlPackage.MSTYLE_TYPE__THICKMATHSPACE:
				return getThickmathspace();
			case MlPackage.MSTYLE_TYPE__THINMATHSPACE:
				return getThinmathspace();
			case MlPackage.MSTYLE_TYPE__VALIGN:
				return getValign();
			case MlPackage.MSTYLE_TYPE__VERYTHICKMATHSPACE:
				return getVerythickmathspace();
			case MlPackage.MSTYLE_TYPE__VERYTHINMATHSPACE:
				return getVerythinmathspace();
			case MlPackage.MSTYLE_TYPE__VERYVERYTHICKMATHSPACE:
				return getVeryverythickmathspace();
			case MlPackage.MSTYLE_TYPE__VERYVERYTHINMATHSPACE:
				return getVeryverythinmathspace();
			case MlPackage.MSTYLE_TYPE__WIDTH:
				return getWidth();
			case MlPackage.MSTYLE_TYPE__XREF:
				return getXref();
			case MlPackage.MSTYLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSTYLE_TYPE__ACCENT:
				setAccent((AccentType3)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ACCENTUNDER:
				setAccentunder((AccentunderType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ALIGN:
				setAlign((AlignType5)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ALIGNMENTSCOPE:
				setAlignmentscope((List<AlignmentscopeTypeBaseItem1>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__BACKGROUND:
				setBackground(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__BEVELLED:
				setBevelled((BevelledType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__CHARALIGN:
				setCharalign((CharalignType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__CHARSPACING:
				setCharspacing(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__CLOSE:
				setClose(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNALIGN:
				setColumnalign((List<Columnalignstyle>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNLINES:
				setColumnlines((List<Linestyle>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNSPACING:
				setColumnspacing((List<String>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNSPAN:
				setColumnspan((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNWIDTH:
				setColumnwidth((List<Object>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__CROSSOUT:
				setCrossout((List<CrossoutTypeItem2>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__DECIMALPOINT:
				setDecimalpoint((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__DENOMALIGN:
				setDenomalign((DenomalignType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__DEPTH:
				setDepth((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__DIR:
				setDir((DirType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__DISPLAYSTYLE:
				setDisplaystyle((DisplaystyleType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__EDGE:
				setEdge((EdgeType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__EQUALCOLUMNS:
				setEqualcolumns((EqualcolumnsType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__EQUALROWS:
				setEqualrows((EqualrowsType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FENCE:
				setFence((FenceType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FONTFAMILY:
				setFontfamily(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FONTSIZE:
				setFontsize((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FONTSTYLE:
				setFontstyle((FontstyleType)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FONTWEIGHT:
				setFontweight((FontweightType)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FORM:
				setForm((FormType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FRAME:
				setFrame((Linestyle)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__FRAMESPACING:
				setFramespacing((List<String>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__GROUPALIGN:
				setGroupalign((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTALIGN:
				setIndentalign((IndentalignType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTALIGNFIRST:
				setIndentalignfirst((IndentalignfirstType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTALIGNLAST:
				setIndentalignlast((IndentalignlastType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTSHIFT:
				setIndentshift((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTFIRST:
				setIndentshiftfirst(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTLAST:
				setIndentshiftlast(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTTARGET:
				setIndenttarget(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__INFIXLINEBREAKSTYLE:
				setInfixlinebreakstyle((InfixlinebreakstyleType)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LARGEOP:
				setLargeop((LargeopType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LEFTOVERHANG:
				setLeftoverhang((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LENGTH:
				setLength((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LINEBREAK:
				setLinebreak((LinebreakType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LINEBREAKMULTCHAR:
				setLinebreakmultchar(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LINEBREAKSTYLE:
				setLinebreakstyle((LinebreakstyleType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LINELEADING:
				setLineleading((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LINETHICKNESS:
				setLinethickness(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LOCATION:
				setLocation((LocationType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LONGDIVSTYLE:
				setLongdivstyle((LongdivstyleType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LQUOTE:
				setLquote(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__LSPACE:
				setLspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MATHSIZE:
				setMathsize(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MATHVARIANT:
				setMathvariant((MathvariantType2)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MAXSIZE:
				setMaxsize(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MEDIUMMATHSPACE:
				setMediummathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MINLABELSPACING:
				setMinlabelspacing((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MINSIZE:
				setMinsize((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MOVABLELIMITS:
				setMovablelimits((MovablelimitsType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__MSLINETHICKNESS:
				setMslinethickness(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__NOTATION:
				setNotation(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__NUMALIGN:
				setNumalign((NumalignType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__OPEN:
				setOpen(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__POSITION:
				setPosition((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__RIGHTOVERHANG:
				setRightoverhang((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ROWALIGN:
				setRowalign((List<Verticalalign>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ROWLINES:
				setRowlines((List<Linestyle>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ROWSPACING:
				setRowspacing((List<String>)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ROWSPAN:
				setRowspan((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__RQUOTE:
				setRquote(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__RSPACE:
				setRspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SCRIPTLEVEL:
				setScriptlevel((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SCRIPTMINSIZE:
				setScriptminsize((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SCRIPTSIZEMULTIPLIER:
				setScriptsizemultiplier((BigDecimal)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SELECTION:
				setSelection((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SEPARATOR:
				setSeparator((SeparatorType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SEPARATORS:
				setSeparators(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SHIFT:
				setShift((BigInteger)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SIDE:
				setSide((SideType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__STACKALIGN:
				setStackalign((StackalignType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__STRETCHY:
				setStretchy((StretchyType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SUBSCRIPTSHIFT:
				setSubscriptshift((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SUPERSCRIPTSHIFT:
				setSuperscriptshift((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__SYMMETRIC:
				setSymmetric((SymmetricType1)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__THICKMATHSPACE:
				setThickmathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__THINMATHSPACE:
				setThinmathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__VALIGN:
				setValign((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__VERYTHICKMATHSPACE:
				setVerythickmathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__VERYTHINMATHSPACE:
				setVerythinmathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__VERYVERYTHICKMATHSPACE:
				setVeryverythickmathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__VERYVERYTHINMATHSPACE:
				setVeryverythinmathspace((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case MlPackage.MSTYLE_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MSTYLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSTYLE_TYPE__ACCENT:
				unsetAccent();
				return;
			case MlPackage.MSTYLE_TYPE__ACCENTUNDER:
				unsetAccentunder();
				return;
			case MlPackage.MSTYLE_TYPE__ALIGN:
				unsetAlign();
				return;
			case MlPackage.MSTYLE_TYPE__ALIGNMENTSCOPE:
				setAlignmentscope(ALIGNMENTSCOPE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__BEVELLED:
				unsetBevelled();
				return;
			case MlPackage.MSTYLE_TYPE__CHARALIGN:
				unsetCharalign();
				return;
			case MlPackage.MSTYLE_TYPE__CHARSPACING:
				setCharspacing(CHARSPACING_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__CLOSE:
				setClose(CLOSE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNALIGN:
				setColumnalign(COLUMNALIGN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNLINES:
				setColumnlines(COLUMNLINES_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNSPACING:
				setColumnspacing(COLUMNSPACING_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNSPAN:
				setColumnspan(COLUMNSPAN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__COLUMNWIDTH:
				setColumnwidth(COLUMNWIDTH_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__CROSSOUT:
				setCrossout(CROSSOUT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__DECIMALPOINT:
				setDecimalpoint(DECIMALPOINT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__DENOMALIGN:
				unsetDenomalign();
				return;
			case MlPackage.MSTYLE_TYPE__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__DIR:
				unsetDir();
				return;
			case MlPackage.MSTYLE_TYPE__DISPLAYSTYLE:
				unsetDisplaystyle();
				return;
			case MlPackage.MSTYLE_TYPE__EDGE:
				unsetEdge();
				return;
			case MlPackage.MSTYLE_TYPE__EQUALCOLUMNS:
				unsetEqualcolumns();
				return;
			case MlPackage.MSTYLE_TYPE__EQUALROWS:
				unsetEqualrows();
				return;
			case MlPackage.MSTYLE_TYPE__FENCE:
				unsetFence();
				return;
			case MlPackage.MSTYLE_TYPE__FONTFAMILY:
				setFontfamily(FONTFAMILY_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__FONTSIZE:
				setFontsize(FONTSIZE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__FONTSTYLE:
				unsetFontstyle();
				return;
			case MlPackage.MSTYLE_TYPE__FONTWEIGHT:
				unsetFontweight();
				return;
			case MlPackage.MSTYLE_TYPE__FORM:
				unsetForm();
				return;
			case MlPackage.MSTYLE_TYPE__FRAME:
				unsetFrame();
				return;
			case MlPackage.MSTYLE_TYPE__FRAMESPACING:
				setFramespacing(FRAMESPACING_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__GROUPALIGN:
				setGroupalign(GROUPALIGN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTALIGN:
				unsetIndentalign();
				return;
			case MlPackage.MSTYLE_TYPE__INDENTALIGNFIRST:
				unsetIndentalignfirst();
				return;
			case MlPackage.MSTYLE_TYPE__INDENTALIGNLAST:
				unsetIndentalignlast();
				return;
			case MlPackage.MSTYLE_TYPE__INDENTSHIFT:
				setIndentshift(INDENTSHIFT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTFIRST:
				setIndentshiftfirst(INDENTSHIFTFIRST_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTLAST:
				setIndentshiftlast(INDENTSHIFTLAST_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__INDENTTARGET:
				setIndenttarget(INDENTTARGET_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__INFIXLINEBREAKSTYLE:
				unsetInfixlinebreakstyle();
				return;
			case MlPackage.MSTYLE_TYPE__LARGEOP:
				unsetLargeop();
				return;
			case MlPackage.MSTYLE_TYPE__LEFTOVERHANG:
				setLeftoverhang(LEFTOVERHANG_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__LINEBREAK:
				unsetLinebreak();
				return;
			case MlPackage.MSTYLE_TYPE__LINEBREAKMULTCHAR:
				setLinebreakmultchar(LINEBREAKMULTCHAR_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__LINEBREAKSTYLE:
				unsetLinebreakstyle();
				return;
			case MlPackage.MSTYLE_TYPE__LINELEADING:
				setLineleading(LINELEADING_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__LINETHICKNESS:
				setLinethickness(LINETHICKNESS_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__LOCATION:
				unsetLocation();
				return;
			case MlPackage.MSTYLE_TYPE__LONGDIVSTYLE:
				unsetLongdivstyle();
				return;
			case MlPackage.MSTYLE_TYPE__LQUOTE:
				setLquote(LQUOTE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__LSPACE:
				setLspace(LSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MATHSIZE:
				setMathsize(MATHSIZE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MATHVARIANT:
				unsetMathvariant();
				return;
			case MlPackage.MSTYLE_TYPE__MAXSIZE:
				setMaxsize(MAXSIZE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MEDIUMMATHSPACE:
				setMediummathspace(MEDIUMMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MINLABELSPACING:
				setMinlabelspacing(MINLABELSPACING_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MINSIZE:
				setMinsize(MINSIZE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__MOVABLELIMITS:
				unsetMovablelimits();
				return;
			case MlPackage.MSTYLE_TYPE__MSLINETHICKNESS:
				setMslinethickness(MSLINETHICKNESS_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__NOTATION:
				setNotation(NOTATION_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__NUMALIGN:
				unsetNumalign();
				return;
			case MlPackage.MSTYLE_TYPE__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__RIGHTOVERHANG:
				setRightoverhang(RIGHTOVERHANG_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__ROWALIGN:
				setRowalign(ROWALIGN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__ROWLINES:
				setRowlines(ROWLINES_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__ROWSPACING:
				setRowspacing(ROWSPACING_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__RQUOTE:
				setRquote(RQUOTE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__RSPACE:
				setRspace(RSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SCRIPTLEVEL:
				setScriptlevel(SCRIPTLEVEL_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SCRIPTMINSIZE:
				setScriptminsize(SCRIPTMINSIZE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SCRIPTSIZEMULTIPLIER:
				setScriptsizemultiplier(SCRIPTSIZEMULTIPLIER_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SEPARATOR:
				unsetSeparator();
				return;
			case MlPackage.MSTYLE_TYPE__SEPARATORS:
				setSeparators(SEPARATORS_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SHIFT:
				setShift(SHIFT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SIDE:
				unsetSide();
				return;
			case MlPackage.MSTYLE_TYPE__STACKALIGN:
				unsetStackalign();
				return;
			case MlPackage.MSTYLE_TYPE__STRETCHY:
				unsetStretchy();
				return;
			case MlPackage.MSTYLE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SUBSCRIPTSHIFT:
				setSubscriptshift(SUBSCRIPTSHIFT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SUPERSCRIPTSHIFT:
				setSuperscriptshift(SUPERSCRIPTSHIFT_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__SYMMETRIC:
				unsetSymmetric();
				return;
			case MlPackage.MSTYLE_TYPE__THICKMATHSPACE:
				setThickmathspace(THICKMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__THINMATHSPACE:
				setThinmathspace(THINMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__VALIGN:
				setValign(VALIGN_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__VERYTHICKMATHSPACE:
				setVerythickmathspace(VERYTHICKMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__VERYTHINMATHSPACE:
				setVerythinmathspace(VERYTHINMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__VERYVERYTHICKMATHSPACE:
				setVeryverythickmathspace(VERYVERYTHICKMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__VERYVERYTHINMATHSPACE:
				setVeryverythinmathspace(VERYVERYTHINMATHSPACE_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MSTYLE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSTYLE_TYPE__ACCENT:
				return isSetAccent();
			case MlPackage.MSTYLE_TYPE__ACCENTUNDER:
				return isSetAccentunder();
			case MlPackage.MSTYLE_TYPE__ALIGN:
				return isSetAlign();
			case MlPackage.MSTYLE_TYPE__ALIGNMENTSCOPE:
				return ALIGNMENTSCOPE_EDEFAULT == null ? alignmentscope != null : !ALIGNMENTSCOPE_EDEFAULT.equals(alignmentscope);
			case MlPackage.MSTYLE_TYPE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case MlPackage.MSTYLE_TYPE__BEVELLED:
				return isSetBevelled();
			case MlPackage.MSTYLE_TYPE__CHARALIGN:
				return isSetCharalign();
			case MlPackage.MSTYLE_TYPE__CHARSPACING:
				return CHARSPACING_EDEFAULT == null ? charspacing != null : !CHARSPACING_EDEFAULT.equals(charspacing);
			case MlPackage.MSTYLE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MSTYLE_TYPE__CLOSE:
				return CLOSE_EDEFAULT == null ? close != null : !CLOSE_EDEFAULT.equals(close);
			case MlPackage.MSTYLE_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case MlPackage.MSTYLE_TYPE__COLUMNALIGN:
				return COLUMNALIGN_EDEFAULT == null ? columnalign != null : !COLUMNALIGN_EDEFAULT.equals(columnalign);
			case MlPackage.MSTYLE_TYPE__COLUMNLINES:
				return COLUMNLINES_EDEFAULT == null ? columnlines != null : !COLUMNLINES_EDEFAULT.equals(columnlines);
			case MlPackage.MSTYLE_TYPE__COLUMNSPACING:
				return COLUMNSPACING_EDEFAULT == null ? columnspacing != null : !COLUMNSPACING_EDEFAULT.equals(columnspacing);
			case MlPackage.MSTYLE_TYPE__COLUMNSPAN:
				return COLUMNSPAN_EDEFAULT == null ? columnspan != null : !COLUMNSPAN_EDEFAULT.equals(columnspan);
			case MlPackage.MSTYLE_TYPE__COLUMNWIDTH:
				return COLUMNWIDTH_EDEFAULT == null ? columnwidth != null : !COLUMNWIDTH_EDEFAULT.equals(columnwidth);
			case MlPackage.MSTYLE_TYPE__CROSSOUT:
				return CROSSOUT_EDEFAULT == null ? crossout != null : !CROSSOUT_EDEFAULT.equals(crossout);
			case MlPackage.MSTYLE_TYPE__DECIMALPOINT:
				return DECIMALPOINT_EDEFAULT == null ? decimalpoint != null : !DECIMALPOINT_EDEFAULT.equals(decimalpoint);
			case MlPackage.MSTYLE_TYPE__DENOMALIGN:
				return isSetDenomalign();
			case MlPackage.MSTYLE_TYPE__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case MlPackage.MSTYLE_TYPE__DIR:
				return isSetDir();
			case MlPackage.MSTYLE_TYPE__DISPLAYSTYLE:
				return isSetDisplaystyle();
			case MlPackage.MSTYLE_TYPE__EDGE:
				return isSetEdge();
			case MlPackage.MSTYLE_TYPE__EQUALCOLUMNS:
				return isSetEqualcolumns();
			case MlPackage.MSTYLE_TYPE__EQUALROWS:
				return isSetEqualrows();
			case MlPackage.MSTYLE_TYPE__FENCE:
				return isSetFence();
			case MlPackage.MSTYLE_TYPE__FONTFAMILY:
				return FONTFAMILY_EDEFAULT == null ? fontfamily != null : !FONTFAMILY_EDEFAULT.equals(fontfamily);
			case MlPackage.MSTYLE_TYPE__FONTSIZE:
				return FONTSIZE_EDEFAULT == null ? fontsize != null : !FONTSIZE_EDEFAULT.equals(fontsize);
			case MlPackage.MSTYLE_TYPE__FONTSTYLE:
				return isSetFontstyle();
			case MlPackage.MSTYLE_TYPE__FONTWEIGHT:
				return isSetFontweight();
			case MlPackage.MSTYLE_TYPE__FORM:
				return isSetForm();
			case MlPackage.MSTYLE_TYPE__FRAME:
				return isSetFrame();
			case MlPackage.MSTYLE_TYPE__FRAMESPACING:
				return FRAMESPACING_EDEFAULT == null ? framespacing != null : !FRAMESPACING_EDEFAULT.equals(framespacing);
			case MlPackage.MSTYLE_TYPE__GROUPALIGN:
				return GROUPALIGN_EDEFAULT == null ? groupalign != null : !GROUPALIGN_EDEFAULT.equals(groupalign);
			case MlPackage.MSTYLE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case MlPackage.MSTYLE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MSTYLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MSTYLE_TYPE__INDENTALIGN:
				return isSetIndentalign();
			case MlPackage.MSTYLE_TYPE__INDENTALIGNFIRST:
				return isSetIndentalignfirst();
			case MlPackage.MSTYLE_TYPE__INDENTALIGNLAST:
				return isSetIndentalignlast();
			case MlPackage.MSTYLE_TYPE__INDENTSHIFT:
				return INDENTSHIFT_EDEFAULT == null ? indentshift != null : !INDENTSHIFT_EDEFAULT.equals(indentshift);
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTFIRST:
				return INDENTSHIFTFIRST_EDEFAULT == null ? indentshiftfirst != null : !INDENTSHIFTFIRST_EDEFAULT.equals(indentshiftfirst);
			case MlPackage.MSTYLE_TYPE__INDENTSHIFTLAST:
				return INDENTSHIFTLAST_EDEFAULT == null ? indentshiftlast != null : !INDENTSHIFTLAST_EDEFAULT.equals(indentshiftlast);
			case MlPackage.MSTYLE_TYPE__INDENTTARGET:
				return INDENTTARGET_EDEFAULT == null ? indenttarget != null : !INDENTTARGET_EDEFAULT.equals(indenttarget);
			case MlPackage.MSTYLE_TYPE__INFIXLINEBREAKSTYLE:
				return isSetInfixlinebreakstyle();
			case MlPackage.MSTYLE_TYPE__LARGEOP:
				return isSetLargeop();
			case MlPackage.MSTYLE_TYPE__LEFTOVERHANG:
				return LEFTOVERHANG_EDEFAULT == null ? leftoverhang != null : !LEFTOVERHANG_EDEFAULT.equals(leftoverhang);
			case MlPackage.MSTYLE_TYPE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case MlPackage.MSTYLE_TYPE__LINEBREAK:
				return isSetLinebreak();
			case MlPackage.MSTYLE_TYPE__LINEBREAKMULTCHAR:
				return LINEBREAKMULTCHAR_EDEFAULT == null ? linebreakmultchar != null : !LINEBREAKMULTCHAR_EDEFAULT.equals(linebreakmultchar);
			case MlPackage.MSTYLE_TYPE__LINEBREAKSTYLE:
				return isSetLinebreakstyle();
			case MlPackage.MSTYLE_TYPE__LINELEADING:
				return LINELEADING_EDEFAULT == null ? lineleading != null : !LINELEADING_EDEFAULT.equals(lineleading);
			case MlPackage.MSTYLE_TYPE__LINETHICKNESS:
				return LINETHICKNESS_EDEFAULT == null ? linethickness != null : !LINETHICKNESS_EDEFAULT.equals(linethickness);
			case MlPackage.MSTYLE_TYPE__LOCATION:
				return isSetLocation();
			case MlPackage.MSTYLE_TYPE__LONGDIVSTYLE:
				return isSetLongdivstyle();
			case MlPackage.MSTYLE_TYPE__LQUOTE:
				return LQUOTE_EDEFAULT == null ? lquote != null : !LQUOTE_EDEFAULT.equals(lquote);
			case MlPackage.MSTYLE_TYPE__LSPACE:
				return LSPACE_EDEFAULT == null ? lspace != null : !LSPACE_EDEFAULT.equals(lspace);
			case MlPackage.MSTYLE_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MSTYLE_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MSTYLE_TYPE__MATHSIZE:
				return MATHSIZE_EDEFAULT == null ? mathsize != null : !MATHSIZE_EDEFAULT.equals(mathsize);
			case MlPackage.MSTYLE_TYPE__MATHVARIANT:
				return isSetMathvariant();
			case MlPackage.MSTYLE_TYPE__MAXSIZE:
				return MAXSIZE_EDEFAULT == null ? maxsize != null : !MAXSIZE_EDEFAULT.equals(maxsize);
			case MlPackage.MSTYLE_TYPE__MEDIUMMATHSPACE:
				return MEDIUMMATHSPACE_EDEFAULT == null ? mediummathspace != null : !MEDIUMMATHSPACE_EDEFAULT.equals(mediummathspace);
			case MlPackage.MSTYLE_TYPE__MINLABELSPACING:
				return MINLABELSPACING_EDEFAULT == null ? minlabelspacing != null : !MINLABELSPACING_EDEFAULT.equals(minlabelspacing);
			case MlPackage.MSTYLE_TYPE__MINSIZE:
				return MINSIZE_EDEFAULT == null ? minsize != null : !MINSIZE_EDEFAULT.equals(minsize);
			case MlPackage.MSTYLE_TYPE__MOVABLELIMITS:
				return isSetMovablelimits();
			case MlPackage.MSTYLE_TYPE__MSLINETHICKNESS:
				return MSLINETHICKNESS_EDEFAULT == null ? mslinethickness != null : !MSLINETHICKNESS_EDEFAULT.equals(mslinethickness);
			case MlPackage.MSTYLE_TYPE__NOTATION:
				return NOTATION_EDEFAULT == null ? notation != null : !NOTATION_EDEFAULT.equals(notation);
			case MlPackage.MSTYLE_TYPE__NUMALIGN:
				return isSetNumalign();
			case MlPackage.MSTYLE_TYPE__OPEN:
				return OPEN_EDEFAULT == null ? open != null : !OPEN_EDEFAULT.equals(open);
			case MlPackage.MSTYLE_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MSTYLE_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case MlPackage.MSTYLE_TYPE__RIGHTOVERHANG:
				return RIGHTOVERHANG_EDEFAULT == null ? rightoverhang != null : !RIGHTOVERHANG_EDEFAULT.equals(rightoverhang);
			case MlPackage.MSTYLE_TYPE__ROWALIGN:
				return ROWALIGN_EDEFAULT == null ? rowalign != null : !ROWALIGN_EDEFAULT.equals(rowalign);
			case MlPackage.MSTYLE_TYPE__ROWLINES:
				return ROWLINES_EDEFAULT == null ? rowlines != null : !ROWLINES_EDEFAULT.equals(rowlines);
			case MlPackage.MSTYLE_TYPE__ROWSPACING:
				return ROWSPACING_EDEFAULT == null ? rowspacing != null : !ROWSPACING_EDEFAULT.equals(rowspacing);
			case MlPackage.MSTYLE_TYPE__ROWSPAN:
				return ROWSPAN_EDEFAULT == null ? rowspan != null : !ROWSPAN_EDEFAULT.equals(rowspan);
			case MlPackage.MSTYLE_TYPE__RQUOTE:
				return RQUOTE_EDEFAULT == null ? rquote != null : !RQUOTE_EDEFAULT.equals(rquote);
			case MlPackage.MSTYLE_TYPE__RSPACE:
				return RSPACE_EDEFAULT == null ? rspace != null : !RSPACE_EDEFAULT.equals(rspace);
			case MlPackage.MSTYLE_TYPE__SCRIPTLEVEL:
				return SCRIPTLEVEL_EDEFAULT == null ? scriptlevel != null : !SCRIPTLEVEL_EDEFAULT.equals(scriptlevel);
			case MlPackage.MSTYLE_TYPE__SCRIPTMINSIZE:
				return SCRIPTMINSIZE_EDEFAULT == null ? scriptminsize != null : !SCRIPTMINSIZE_EDEFAULT.equals(scriptminsize);
			case MlPackage.MSTYLE_TYPE__SCRIPTSIZEMULTIPLIER:
				return SCRIPTSIZEMULTIPLIER_EDEFAULT == null ? scriptsizemultiplier != null : !SCRIPTSIZEMULTIPLIER_EDEFAULT.equals(scriptsizemultiplier);
			case MlPackage.MSTYLE_TYPE__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case MlPackage.MSTYLE_TYPE__SEPARATOR:
				return isSetSeparator();
			case MlPackage.MSTYLE_TYPE__SEPARATORS:
				return SEPARATORS_EDEFAULT == null ? separators != null : !SEPARATORS_EDEFAULT.equals(separators);
			case MlPackage.MSTYLE_TYPE__SHIFT:
				return SHIFT_EDEFAULT == null ? shift != null : !SHIFT_EDEFAULT.equals(shift);
			case MlPackage.MSTYLE_TYPE__SIDE:
				return isSetSide();
			case MlPackage.MSTYLE_TYPE__STACKALIGN:
				return isSetStackalign();
			case MlPackage.MSTYLE_TYPE__STRETCHY:
				return isSetStretchy();
			case MlPackage.MSTYLE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MSTYLE_TYPE__SUBSCRIPTSHIFT:
				return SUBSCRIPTSHIFT_EDEFAULT == null ? subscriptshift != null : !SUBSCRIPTSHIFT_EDEFAULT.equals(subscriptshift);
			case MlPackage.MSTYLE_TYPE__SUPERSCRIPTSHIFT:
				return SUPERSCRIPTSHIFT_EDEFAULT == null ? superscriptshift != null : !SUPERSCRIPTSHIFT_EDEFAULT.equals(superscriptshift);
			case MlPackage.MSTYLE_TYPE__SYMMETRIC:
				return isSetSymmetric();
			case MlPackage.MSTYLE_TYPE__THICKMATHSPACE:
				return THICKMATHSPACE_EDEFAULT == null ? thickmathspace != null : !THICKMATHSPACE_EDEFAULT.equals(thickmathspace);
			case MlPackage.MSTYLE_TYPE__THINMATHSPACE:
				return THINMATHSPACE_EDEFAULT == null ? thinmathspace != null : !THINMATHSPACE_EDEFAULT.equals(thinmathspace);
			case MlPackage.MSTYLE_TYPE__VALIGN:
				return VALIGN_EDEFAULT == null ? valign != null : !VALIGN_EDEFAULT.equals(valign);
			case MlPackage.MSTYLE_TYPE__VERYTHICKMATHSPACE:
				return VERYTHICKMATHSPACE_EDEFAULT == null ? verythickmathspace != null : !VERYTHICKMATHSPACE_EDEFAULT.equals(verythickmathspace);
			case MlPackage.MSTYLE_TYPE__VERYTHINMATHSPACE:
				return VERYTHINMATHSPACE_EDEFAULT == null ? verythinmathspace != null : !VERYTHINMATHSPACE_EDEFAULT.equals(verythinmathspace);
			case MlPackage.MSTYLE_TYPE__VERYVERYTHICKMATHSPACE:
				return VERYVERYTHICKMATHSPACE_EDEFAULT == null ? veryverythickmathspace != null : !VERYVERYTHICKMATHSPACE_EDEFAULT.equals(veryverythickmathspace);
			case MlPackage.MSTYLE_TYPE__VERYVERYTHINMATHSPACE:
				return VERYVERYTHINMATHSPACE_EDEFAULT == null ? veryverythinmathspace != null : !VERYVERYTHINMATHSPACE_EDEFAULT.equals(veryverythinmathspace);
			case MlPackage.MSTYLE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case MlPackage.MSTYLE_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MSTYLE_TYPE__ANY_ATTRIBUTE:
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
		result.append(", alignmentscope: ");
		result.append(alignmentscope);
		result.append(", background: ");
		result.append(background);
		result.append(", bevelled: ");
		if (bevelledESet) result.append(bevelled); else result.append("<unset>");
		result.append(", charalign: ");
		if (charalignESet) result.append(charalign); else result.append("<unset>");
		result.append(", charspacing: ");
		result.append(charspacing);
		result.append(", class: ");
		result.append(class_);
		result.append(", close: ");
		result.append(close);
		result.append(", color: ");
		result.append(color);
		result.append(", columnalign: ");
		result.append(columnalign);
		result.append(", columnlines: ");
		result.append(columnlines);
		result.append(", columnspacing: ");
		result.append(columnspacing);
		result.append(", columnspan: ");
		result.append(columnspan);
		result.append(", columnwidth: ");
		result.append(columnwidth);
		result.append(", crossout: ");
		result.append(crossout);
		result.append(", decimalpoint: ");
		result.append(decimalpoint);
		result.append(", denomalign: ");
		if (denomalignESet) result.append(denomalign); else result.append("<unset>");
		result.append(", depth: ");
		result.append(depth);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", displaystyle: ");
		if (displaystyleESet) result.append(displaystyle); else result.append("<unset>");
		result.append(", edge: ");
		if (edgeESet) result.append(edge); else result.append("<unset>");
		result.append(", equalcolumns: ");
		if (equalcolumnsESet) result.append(equalcolumns); else result.append("<unset>");
		result.append(", equalrows: ");
		if (equalrowsESet) result.append(equalrows); else result.append("<unset>");
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
		result.append(", frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(", framespacing: ");
		result.append(framespacing);
		result.append(", groupalign: ");
		result.append(groupalign);
		result.append(", height: ");
		result.append(height);
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
		result.append(", infixlinebreakstyle: ");
		if (infixlinebreakstyleESet) result.append(infixlinebreakstyle); else result.append("<unset>");
		result.append(", largeop: ");
		if (largeopESet) result.append(largeop); else result.append("<unset>");
		result.append(", leftoverhang: ");
		result.append(leftoverhang);
		result.append(", length: ");
		result.append(length);
		result.append(", linebreak: ");
		if (linebreakESet) result.append(linebreak); else result.append("<unset>");
		result.append(", linebreakmultchar: ");
		result.append(linebreakmultchar);
		result.append(", linebreakstyle: ");
		if (linebreakstyleESet) result.append(linebreakstyle); else result.append("<unset>");
		result.append(", lineleading: ");
		result.append(lineleading);
		result.append(", linethickness: ");
		result.append(linethickness);
		result.append(", location: ");
		if (locationESet) result.append(location); else result.append("<unset>");
		result.append(", longdivstyle: ");
		if (longdivstyleESet) result.append(longdivstyle); else result.append("<unset>");
		result.append(", lquote: ");
		result.append(lquote);
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
		result.append(", mediummathspace: ");
		result.append(mediummathspace);
		result.append(", minlabelspacing: ");
		result.append(minlabelspacing);
		result.append(", minsize: ");
		result.append(minsize);
		result.append(", movablelimits: ");
		if (movablelimitsESet) result.append(movablelimits); else result.append("<unset>");
		result.append(", mslinethickness: ");
		result.append(mslinethickness);
		result.append(", notation: ");
		result.append(notation);
		result.append(", numalign: ");
		if (numalignESet) result.append(numalign); else result.append("<unset>");
		result.append(", open: ");
		result.append(open);
		result.append(", other: ");
		result.append(other);
		result.append(", position: ");
		result.append(position);
		result.append(", rightoverhang: ");
		result.append(rightoverhang);
		result.append(", rowalign: ");
		result.append(rowalign);
		result.append(", rowlines: ");
		result.append(rowlines);
		result.append(", rowspacing: ");
		result.append(rowspacing);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", rquote: ");
		result.append(rquote);
		result.append(", rspace: ");
		result.append(rspace);
		result.append(", scriptlevel: ");
		result.append(scriptlevel);
		result.append(", scriptminsize: ");
		result.append(scriptminsize);
		result.append(", scriptsizemultiplier: ");
		result.append(scriptsizemultiplier);
		result.append(", selection: ");
		result.append(selection);
		result.append(", separator: ");
		if (separatorESet) result.append(separator); else result.append("<unset>");
		result.append(", separators: ");
		result.append(separators);
		result.append(", shift: ");
		result.append(shift);
		result.append(", side: ");
		if (sideESet) result.append(side); else result.append("<unset>");
		result.append(", stackalign: ");
		if (stackalignESet) result.append(stackalign); else result.append("<unset>");
		result.append(", stretchy: ");
		if (stretchyESet) result.append(stretchy); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", subscriptshift: ");
		result.append(subscriptshift);
		result.append(", superscriptshift: ");
		result.append(superscriptshift);
		result.append(", symmetric: ");
		if (symmetricESet) result.append(symmetric); else result.append("<unset>");
		result.append(", thickmathspace: ");
		result.append(thickmathspace);
		result.append(", thinmathspace: ");
		result.append(thinmathspace);
		result.append(", valign: ");
		result.append(valign);
		result.append(", verythickmathspace: ");
		result.append(verythickmathspace);
		result.append(", verythinmathspace: ");
		result.append(verythinmathspace);
		result.append(", veryverythickmathspace: ");
		result.append(veryverythickmathspace);
		result.append(", veryverythinmathspace: ");
		result.append(veryverythinmathspace);
		result.append(", width: ");
		result.append(width);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MstyleTypeImpl
