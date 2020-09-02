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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1998.math.math.ml.FontstyleType;
import org.w3._1998.math.math.ml.FontweightType;
import org.w3._1998.math.math.ml.MathvariantType1;
import org.w3._1998.math.math.ml.MglyphType;
import org.w3._1998.math.math.ml.MlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mglyph Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getFontstyle <em>Fontstyle</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getFontweight <em>Fontweight</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getMathbackground <em>Mathbackground</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getMathcolor <em>Mathcolor</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getMathsize <em>Mathsize</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getMathvariant <em>Mathvariant</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.w3._1998.math.math.ml.impl.MglyphTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MglyphTypeImpl extends MinimalEObjectImpl.Container implements MglyphType {
	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final Object ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected Object alt = ALT_EDEFAULT;

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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger index = INDEX_EDEFAULT;

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
	protected static final MathvariantType1 MATHVARIANT_EDEFAULT = MathvariantType1.NORMAL;

	/**
	 * The cached value of the '{@link #getMathvariant() <em>Mathvariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathvariant()
	 * @generated
	 * @ordered
	 */
	protected MathvariantType1 mathvariant = MATHVARIANT_EDEFAULT;

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
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

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
	protected MglyphTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlPackage.eINSTANCE.getMglyphType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlt(Object newAlt) {
		Object oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__ALT, oldAlt, alt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__FONTFAMILY, oldFontfamily, fontfamily));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__FONTSIZE, oldFontsize, fontsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__FONTSTYLE, oldFontstyle, fontstyle, !oldFontstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MGLYPH_TYPE__FONTSTYLE, oldFontstyle, FONTSTYLE_EDEFAULT, oldFontstyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__FONTWEIGHT, oldFontweight, fontweight, !oldFontweightESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MGLYPH_TYPE__FONTWEIGHT, oldFontweight, FONTWEIGHT_EDEFAULT, oldFontweightESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(BigInteger newIndex) {
		BigInteger oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__INDEX, oldIndex, index));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__MATHBACKGROUND, oldMathbackground, mathbackground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__MATHCOLOR, oldMathcolor, mathcolor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__MATHSIZE, oldMathsize, mathsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathvariantType1 getMathvariant() {
		return mathvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMathvariant(MathvariantType1 newMathvariant) {
		MathvariantType1 oldMathvariant = mathvariant;
		mathvariant = newMathvariant == null ? MATHVARIANT_EDEFAULT : newMathvariant;
		boolean oldMathvariantESet = mathvariantESet;
		mathvariantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__MATHVARIANT, oldMathvariant, mathvariant, !oldMathvariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMathvariant() {
		MathvariantType1 oldMathvariant = mathvariant;
		boolean oldMathvariantESet = mathvariantESet;
		mathvariant = MATHVARIANT_EDEFAULT;
		mathvariantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MlPackage.MGLYPH_TYPE__MATHVARIANT, oldMathvariant, MATHVARIANT_EDEFAULT, oldMathvariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__VALIGN, oldValign, valign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MlPackage.MGLYPH_TYPE__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, MlPackage.MGLYPH_TYPE__ANY_ATTRIBUTE);
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
			case MlPackage.MGLYPH_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MGLYPH_TYPE__ALT:
				return getAlt();
			case MlPackage.MGLYPH_TYPE__BACKGROUND:
				return getBackground();
			case MlPackage.MGLYPH_TYPE__CLASS:
				return getClass_();
			case MlPackage.MGLYPH_TYPE__COLOR:
				return getColor();
			case MlPackage.MGLYPH_TYPE__FONTFAMILY:
				return getFontfamily();
			case MlPackage.MGLYPH_TYPE__FONTSIZE:
				return getFontsize();
			case MlPackage.MGLYPH_TYPE__FONTSTYLE:
				return getFontstyle();
			case MlPackage.MGLYPH_TYPE__FONTWEIGHT:
				return getFontweight();
			case MlPackage.MGLYPH_TYPE__HEIGHT:
				return getHeight();
			case MlPackage.MGLYPH_TYPE__HREF:
				return getHref();
			case MlPackage.MGLYPH_TYPE__ID:
				return getId();
			case MlPackage.MGLYPH_TYPE__INDEX:
				return getIndex();
			case MlPackage.MGLYPH_TYPE__MATHBACKGROUND:
				return getMathbackground();
			case MlPackage.MGLYPH_TYPE__MATHCOLOR:
				return getMathcolor();
			case MlPackage.MGLYPH_TYPE__MATHSIZE:
				return getMathsize();
			case MlPackage.MGLYPH_TYPE__MATHVARIANT:
				return getMathvariant();
			case MlPackage.MGLYPH_TYPE__OTHER:
				return getOther();
			case MlPackage.MGLYPH_TYPE__SRC:
				return getSrc();
			case MlPackage.MGLYPH_TYPE__STYLE:
				return getStyle();
			case MlPackage.MGLYPH_TYPE__VALIGN:
				return getValign();
			case MlPackage.MGLYPH_TYPE__WIDTH:
				return getWidth();
			case MlPackage.MGLYPH_TYPE__XREF:
				return getXref();
			case MlPackage.MGLYPH_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MGLYPH_TYPE__ALT:
				setAlt(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__BACKGROUND:
				setBackground(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__FONTFAMILY:
				setFontfamily(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__FONTSIZE:
				setFontsize((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__FONTSTYLE:
				setFontstyle((FontstyleType)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__FONTWEIGHT:
				setFontweight((FontweightType)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__HREF:
				setHref((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__ID:
				setId((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__INDEX:
				setIndex((BigInteger)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__MATHBACKGROUND:
				setMathbackground(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__MATHCOLOR:
				setMathcolor((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__MATHSIZE:
				setMathsize(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__MATHVARIANT:
				setMathvariant((MathvariantType1)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__OTHER:
				setOther(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__SRC:
				setSrc((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__VALIGN:
				setValign((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case MlPackage.MGLYPH_TYPE__XREF:
				setXref(newValue);
				return;
			case MlPackage.MGLYPH_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MGLYPH_TYPE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__FONTFAMILY:
				setFontfamily(FONTFAMILY_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__FONTSIZE:
				setFontsize(FONTSIZE_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__FONTSTYLE:
				unsetFontstyle();
				return;
			case MlPackage.MGLYPH_TYPE__FONTWEIGHT:
				unsetFontweight();
				return;
			case MlPackage.MGLYPH_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__MATHBACKGROUND:
				setMathbackground(MATHBACKGROUND_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__MATHCOLOR:
				setMathcolor(MATHCOLOR_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__MATHSIZE:
				setMathsize(MATHSIZE_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__MATHVARIANT:
				unsetMathvariant();
				return;
			case MlPackage.MGLYPH_TYPE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__VALIGN:
				setValign(VALIGN_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case MlPackage.MGLYPH_TYPE__ANY_ATTRIBUTE:
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
			case MlPackage.MGLYPH_TYPE__ALT:
				return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
			case MlPackage.MGLYPH_TYPE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case MlPackage.MGLYPH_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MlPackage.MGLYPH_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case MlPackage.MGLYPH_TYPE__FONTFAMILY:
				return FONTFAMILY_EDEFAULT == null ? fontfamily != null : !FONTFAMILY_EDEFAULT.equals(fontfamily);
			case MlPackage.MGLYPH_TYPE__FONTSIZE:
				return FONTSIZE_EDEFAULT == null ? fontsize != null : !FONTSIZE_EDEFAULT.equals(fontsize);
			case MlPackage.MGLYPH_TYPE__FONTSTYLE:
				return isSetFontstyle();
			case MlPackage.MGLYPH_TYPE__FONTWEIGHT:
				return isSetFontweight();
			case MlPackage.MGLYPH_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case MlPackage.MGLYPH_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case MlPackage.MGLYPH_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlPackage.MGLYPH_TYPE__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case MlPackage.MGLYPH_TYPE__MATHBACKGROUND:
				return MATHBACKGROUND_EDEFAULT == null ? mathbackground != null : !MATHBACKGROUND_EDEFAULT.equals(mathbackground);
			case MlPackage.MGLYPH_TYPE__MATHCOLOR:
				return MATHCOLOR_EDEFAULT == null ? mathcolor != null : !MATHCOLOR_EDEFAULT.equals(mathcolor);
			case MlPackage.MGLYPH_TYPE__MATHSIZE:
				return MATHSIZE_EDEFAULT == null ? mathsize != null : !MATHSIZE_EDEFAULT.equals(mathsize);
			case MlPackage.MGLYPH_TYPE__MATHVARIANT:
				return isSetMathvariant();
			case MlPackage.MGLYPH_TYPE__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
			case MlPackage.MGLYPH_TYPE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case MlPackage.MGLYPH_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case MlPackage.MGLYPH_TYPE__VALIGN:
				return VALIGN_EDEFAULT == null ? valign != null : !VALIGN_EDEFAULT.equals(valign);
			case MlPackage.MGLYPH_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case MlPackage.MGLYPH_TYPE__XREF:
				return XREF_EDEFAULT == null ? xref != null : !XREF_EDEFAULT.equals(xref);
			case MlPackage.MGLYPH_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (alt: ");
		result.append(alt);
		result.append(", background: ");
		result.append(background);
		result.append(", class: ");
		result.append(class_);
		result.append(", color: ");
		result.append(color);
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
		result.append(", index: ");
		result.append(index);
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
		result.append(", src: ");
		result.append(src);
		result.append(", style: ");
		result.append(style);
		result.append(", valign: ");
		result.append(valign);
		result.append(", width: ");
		result.append(width);
		result.append(", xref: ");
		result.append(xref);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MglyphTypeImpl
