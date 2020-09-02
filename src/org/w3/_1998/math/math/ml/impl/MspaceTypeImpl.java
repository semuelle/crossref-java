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

import org.w3._1998.math.math.ml.DirType1;
import org.w3._1998.math.math.ml.FontstyleType;
import org.w3._1998.math.math.ml.FontweightType;
import org.w3._1998.math.math.ml.IndentalignType1;
import org.w3._1998.math.math.ml.IndentalignfirstType1;
import org.w3._1998.math.math.ml.IndentalignlastType;
import org.w3._1998.math.math.ml.LinebreakType;
import org.w3._1998.math.math.ml.MathvariantType;
import org.w3._1998.math.math.ml.MlPackage;
import org.w3._1998.math.math.ml.MspaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mspace Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndentalign <em>Indentalign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndentalignfirst <em>Indentalignfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndentalignlast <em>Indentalignlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndentshift <em>Indentshift</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndentshiftfirst <em>Indentshiftfirst</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndentshiftlast <em>Indentshiftlast</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getIndenttarget <em>Indenttarget</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getLinebreak <em>Linebreak</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MspaceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MspaceTypeImpl extends MinimalEObjectImpl.Container implements MspaceType {
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
	protected static final IndentalignType1 INDENTALIGN_EDEFAULT = IndentalignType1.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalign() <em>Indentalign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalign()
	 * @generated
	 * @ordered
	 */
	protected IndentalignType1 indentalign = INDENTALIGN_EDEFAULT;

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
	protected static final IndentalignfirstType1 INDENTALIGNFIRST_EDEFAULT = IndentalignfirstType1.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalignfirst() <em>Indentalignfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignfirst()
	 * @generated
	 * @ordered
	 */
	protected IndentalignfirstType1 indentalignfirst = INDENTALIGNFIRST_EDEFAULT;

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
	protected static final IndentalignlastType INDENTALIGNLAST_EDEFAULT = IndentalignlastType.LEFT;

	/**
	 * The cached value of the '{@link #getIndentalignlast() <em>Indentalignlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentalignlast()
	 * @generated
	 * @ordered
	 */
	protected IndentalignlastType indentalignlast = INDENTALIGNLAST_EDEFAULT;

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
	 * The default value of the '{@link #getLinebreak() <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreak()
	 * @generated
	 * @ordered
	 */
	protected static final LinebreakType LINEBREAK_EDEFAULT = LinebreakType.AUTO;

	/**
	 * The cached value of the '{@link #getLinebreak() <em>Linebreak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinebreak()
	 * @generated
	 * @ordered
	 */
	protected LinebreakType linebreak = LINEBREAK_EDEFAULT;

	/**
	 * This is true if the Linebreak attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linebreakESet;

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
	protected MspaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMspaceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__FONTFAMILY, oldFontfamily, fontfamily));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__FONTSIZE, oldFontsize, fontsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__FONTSTYLE, oldFontstyle, fontstyle, !oldFontstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__FONTSTYLE, oldFontstyle, FONTSTYLE_EDEFAULT, oldFontstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__FONTWEIGHT, oldFontweight, fontweight, !oldFontweightESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__FONTWEIGHT, oldFontweight, FONTWEIGHT_EDEFAULT, oldFontweightESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndentalignType1 getIndentalign() {
		return indentalign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalign(IndentalignType1 newIndentalign) {
		IndentalignType1 oldIndentalign = indentalign;
		indentalign = newIndentalign == null ? INDENTALIGN_EDEFAULT : newIndentalign;
		boolean oldIndentalignESet = indentalignESet;
		indentalignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTALIGN, oldIndentalign, indentalign, !oldIndentalignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalign() {
		IndentalignType1 oldIndentalign = indentalign;
		boolean oldIndentalignESet = indentalignESet;
		indentalign = INDENTALIGN_EDEFAULT;
		indentalignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__INDENTALIGN, oldIndentalign, INDENTALIGN_EDEFAULT, oldIndentalignESet));
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
	public IndentalignfirstType1 getIndentalignfirst() {
		return indentalignfirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalignfirst(IndentalignfirstType1 newIndentalignfirst) {
		IndentalignfirstType1 oldIndentalignfirst = indentalignfirst;
		indentalignfirst = newIndentalignfirst == null ? INDENTALIGNFIRST_EDEFAULT : newIndentalignfirst;
		boolean oldIndentalignfirstESet = indentalignfirstESet;
		indentalignfirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTALIGNFIRST, oldIndentalignfirst, indentalignfirst, !oldIndentalignfirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalignfirst() {
		IndentalignfirstType1 oldIndentalignfirst = indentalignfirst;
		boolean oldIndentalignfirstESet = indentalignfirstESet;
		indentalignfirst = INDENTALIGNFIRST_EDEFAULT;
		indentalignfirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__INDENTALIGNFIRST, oldIndentalignfirst, INDENTALIGNFIRST_EDEFAULT, oldIndentalignfirstESet));
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
	public IndentalignlastType getIndentalignlast() {
		return indentalignlast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndentalignlast(IndentalignlastType newIndentalignlast) {
		IndentalignlastType oldIndentalignlast = indentalignlast;
		indentalignlast = newIndentalignlast == null ? INDENTALIGNLAST_EDEFAULT : newIndentalignlast;
		boolean oldIndentalignlastESet = indentalignlastESet;
		indentalignlastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTALIGNLAST, oldIndentalignlast, indentalignlast, !oldIndentalignlastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIndentalignlast() {
		IndentalignlastType oldIndentalignlast = indentalignlast;
		boolean oldIndentalignlastESet = indentalignlastESet;
		indentalignlast = INDENTALIGNLAST_EDEFAULT;
		indentalignlastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__INDENTALIGNLAST, oldIndentalignlast, INDENTALIGNLAST_EDEFAULT, oldIndentalignlastESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTSHIFT, oldIndentshift, indentshift));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTSHIFTFIRST, oldIndentshiftfirst, indentshiftfirst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTSHIFTLAST, oldIndentshiftlast, indentshiftlast));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__INDENTTARGET, oldIndenttarget, indenttarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinebreakType getLinebreak() {
		return linebreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinebreak(LinebreakType newLinebreak) {
		LinebreakType oldLinebreak = linebreak;
		linebreak = newLinebreak == null ? LINEBREAK_EDEFAULT : newLinebreak;
		boolean oldLinebreakESet = linebreakESet;
		linebreakESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__LINEBREAK, oldLinebreak, linebreak, !oldLinebreakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLinebreak() {
		LinebreakType oldLinebreak = linebreak;
		boolean oldLinebreakESet = linebreakESet;
		linebreak = LINEBREAK_EDEFAULT;
		linebreakESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__LINEBREAK, oldLinebreak, LINEBREAK_EDEFAULT, oldLinebreakESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__MATHSIZE, oldMathsize, mathsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__MATHVARIANT, oldMathvariant, mathvariant, !oldMathvariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MSPACE_TYPE__MATHVARIANT, oldMathvariant, MATHVARIANT_EDEFAULT, oldMathvariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MSPACE_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MSPACE_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MSPACE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSPACE_TYPE__BACKGROUND:
				return getBackground();
			case MlPackage.MSPACE_TYPE__CLASS:
				return getClass_();
			case MlPackage.MSPACE_TYPE__COLOR:
				return getColor();
			case MlPackage.MSPACE_TYPE__DEPTH:
				return getDepth();
			case MlPackage.MSPACE_TYPE__DIR:
				return getDir();
			case MlPackage.MSPACE_TYPE__FONTFAMILY:
				return getFontfamily();
			case MlPackage.MSPACE_TYPE__FONTSIZE:
				return getFontsize();
			case MlPackage.MSPACE_TYPE__FONTSTYLE:
				return getFontstyle();
			case MlPackage.MSPACE_TYPE__FONTWEIGHT:
				return getFontweight();
			case MlPackage.MSPACE_TYPE__HEIGHT:
				return getHeight();
			case MlPackage.MSPACE_TYPE__HREF:
				return getHref();
			case MlPackage.MSPACE_TYPE__ID:
				return getId();
			case MlPackage.MSPACE_TYPE__INDENTALIGN:
				return getIndentalign();
			case MlPackage.MSPACE_TYPE__INDENTALIGNFIRST:
				return getIndentalignfirst();
			case MlPackage.MSPACE_TYPE__INDENTALIGNLAST:
				return getIndentalignlast();
			case MlPackage.MSPACE_TYPE__INDENTSHIFT:
				return getIndentshift();
			case MlPackage.MSPACE_TYPE__INDENTSHIFTFIRST:
				return getIndentshiftfirst();
			case MlPackage.MSPACE_TYPE__INDENTSHIFTLAST:
				return getIndentshiftlast();
			case MlPackage.MSPACE_TYPE__INDENTTARGET:
				return getIndenttarget();
			case MlPackage.MSPACE_TYPE__LINEBREAK:
				return getLinebreak();
			case MlPackage.MSPACE_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MSPACE_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MSPACE_TYPE__MATHSIZE:
				return getMathsize();
			case MlPackage.MSPACE_TYPE__MATHVARIANT:
				return getMathvariant();
			case MlPackage.MSPACE_TYPE__OTHER:
				return getOther();
			case MlPackage.MSPACE_TYPE__STYLE:
				return getStyle();
			case MlPackage.MSPACE_TYPE__WIDTH:
				return getWidth();
			case MlPackage.MSPACE_TYPE__XREF:
				return getXref();
			case MlPackage.MSPACE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSPACE_TYPE__BACKGROUND:
				setBackground(newValue);
				return;
			case MlPackage.MSPACE_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MSPACE_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__DEPTH:
				setDepth((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__DIR:
				setDir((DirType1)newValue);
				return;
			case MlPackage.MSPACE_TYPE__FONTFAMILY:
				setFontfamily(newValue);
				return;
			case MlPackage.MSPACE_TYPE__FONTSIZE:
				setFontsize((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__FONTSTYLE:
				setFontstyle((FontstyleType)newValue);
				return;
			case MlPackage.MSPACE_TYPE__FONTWEIGHT:
				setFontweight((FontweightType)newValue);
				return;
			case MlPackage.MSPACE_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTALIGN:
				setIndentalign((IndentalignType1)newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTALIGNFIRST:
				setIndentalignfirst((IndentalignfirstType1)newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTALIGNLAST:
				setIndentalignlast((IndentalignlastType)newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTSHIFT:
				setIndentshift((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTSHIFTFIRST:
				setIndentshiftfirst(newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTSHIFTLAST:
				setIndentshiftlast(newValue);
				return;
			case MlPackage.MSPACE_TYPE__INDENTTARGET:
				setIndenttarget(newValue);
				return;
			case MlPackage.MSPACE_TYPE__LINEBREAK:
				setLinebreak((LinebreakType)newValue);
				return;
			case MlPackage.MSPACE_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MSPACE_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__MATHSIZE:
				setMathsize(newValue);
				return;
			case MlPackage.MSPACE_TYPE__MATHVARIANT:
				setMathvariant((MathvariantType)newValue);
				return;
			case MlPackage.MSPACE_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MSPACE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case MlPackage.MSPACE_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MSPACE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSPACE_TYPE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__DIR:
				unsetDir();
				return;
			case MlPackage.MSPACE_TYPE__FONTFAMILY:
				setFontfamily(FONTFAMILY_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__FONTSIZE:
				setFontsize(FONTSIZE_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__FONTSTYLE:
				unsetFontstyle();
				return;
			case MlPackage.MSPACE_TYPE__FONTWEIGHT:
				unsetFontweight();
				return;
			case MlPackage.MSPACE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__INDENTALIGN:
				unsetIndentalign();
				return;
			case MlPackage.MSPACE_TYPE__INDENTALIGNFIRST:
				unsetIndentalignfirst();
				return;
			case MlPackage.MSPACE_TYPE__INDENTALIGNLAST:
				unsetIndentalignlast();
				return;
			case MlPackage.MSPACE_TYPE__INDENTSHIFT:
				setIndentshift(INDENTSHIFT_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__INDENTSHIFTFIRST:
				setIndentshiftfirst(INDENTSHIFTFIRST_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__INDENTSHIFTLAST:
				setIndentshiftlast(INDENTSHIFTLAST_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__INDENTTARGET:
				setIndenttarget(INDENTTARGET_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__LINEBREAK:
				unsetLinebreak();
				return;
			case MlPackage.MSPACE_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__MATHSIZE:
				setMathsize(MATHSIZE_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__MATHVARIANT:
				unsetMathvariant();
				return;
			case MlPackage.MSPACE_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MSPACE_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MSPACE_TYPE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case MlPackage.MSPACE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MSPACE_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case MlPackage.MSPACE_TYPE__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case MlPackage.MSPACE_TYPE__DIR:
				return isSetDir();
			case MlPackage.MSPACE_TYPE__FONTFAMILY:
				return FONTFAMILY_EDEFAULT == null ? fontfamily != null : !FONTFAMILY_EDEFAULT.equals(fontfamily);
			case MlPackage.MSPACE_TYPE__FONTSIZE:
				return FONTSIZE_EDEFAULT == null ? fontsize != null : !FONTSIZE_EDEFAULT.equals(fontsize);
			case MlPackage.MSPACE_TYPE__FONTSTYLE:
				return isSetFontstyle();
			case MlPackage.MSPACE_TYPE__FONTWEIGHT:
				return isSetFontweight();
			case MlPackage.MSPACE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case MlPackage.MSPACE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MSPACE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MSPACE_TYPE__INDENTALIGN:
				return isSetIndentalign();
			case MlPackage.MSPACE_TYPE__INDENTALIGNFIRST:
				return isSetIndentalignfirst();
			case MlPackage.MSPACE_TYPE__INDENTALIGNLAST:
				return isSetIndentalignlast();
			case MlPackage.MSPACE_TYPE__INDENTSHIFT:
				return INDENTSHIFT_EDEFAULT == null ? indentshift != null : !INDENTSHIFT_EDEFAULT.equals(indentshift);
			case MlPackage.MSPACE_TYPE__INDENTSHIFTFIRST:
				return INDENTSHIFTFIRST_EDEFAULT == null ? indentshiftfirst != null : !INDENTSHIFTFIRST_EDEFAULT.equals(indentshiftfirst);
			case MlPackage.MSPACE_TYPE__INDENTSHIFTLAST:
				return INDENTSHIFTLAST_EDEFAULT == null ? indentshiftlast != null : !INDENTSHIFTLAST_EDEFAULT.equals(indentshiftlast);
			case MlPackage.MSPACE_TYPE__INDENTTARGET:
				return INDENTTARGET_EDEFAULT == null ? indenttarget != null : !INDENTTARGET_EDEFAULT.equals(indenttarget);
			case MlPackage.MSPACE_TYPE__LINEBREAK:
				return isSetLinebreak();
			case MlPackage.MSPACE_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MSPACE_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MSPACE_TYPE__MATHSIZE:
				return MATHSIZE_EDEFAULT == null ? mathsize != null : !MATHSIZE_EDEFAULT.equals(mathsize);
			case MlPackage.MSPACE_TYPE__MATHVARIANT:
				return isSetMathvariant();
			case MlPackage.MSPACE_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MSPACE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MSPACE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case MlPackage.MSPACE_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MSPACE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (background: ");
		result.append(background);
		result.append(", class: ");
		result.append(class_);
		result.append(", color: ");
		result.append(color);
		result.append(", depth: ");
		result.append(depth);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", fontfamily: ");
		result.append(fontfamily);
		result.append(", fontsize: ");
		result.append(fontsize);
		result.append(", fontstyle: ");
		if (fontstyleESet) result.append(fontstyle); else result.append("<unset>");
		result.append(", fontweight: ");
		if (fontweightESet) result.append(fontweight); else result.append("<unset>");
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
		result.append(", linebreak: ");
		if (linebreakESet) result.append(linebreak); else result.append("<unset>");
		result.append(", mathbackground: ");
		result.append(mathbackground);
		result.append(", mathcolor: ");
		result.append(mathcolor);
		result.append(", mathsize: ");
		result.append(mathsize);
		result.append(", mathvariant: ");
		if (mathvariantESet) result.append(mathvariant); else result.append("<unset>");
		result.append(", other: ");
		result.append(other);
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

} //MspaceTypeImpl
