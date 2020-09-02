/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AlignType1;
import gov.nih.nlm.ncbi.jats1.ColType;
import gov.nih.nlm.ncbi.jats1.ColgroupType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.ValignType3;

import java.util.Collection;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colgroup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getColgroupContent <em>Colgroup Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getCol <em>Col</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.ColgroupTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColgroupTypeImpl extends MinimalEObjectImpl.Container implements ColgroupType {
	/**
	 * The cached value of the '{@link #getColgroupContent() <em>Colgroup Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColgroupContent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap colgroupContent;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType1 ALIGN_EDEFAULT = AlignType1.CENTER;

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
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected String charoff = CHAROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final String SPAN_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected String span = SPAN_EDEFAULT;

	/**
	 * This is true if the Span attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spanESet;

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
	protected static final ValignType3 VALIGN_EDEFAULT = ValignType3.BASELINE;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType3 valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColgroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getColgroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getColgroupContent() {
		if (colgroupContent == null) {
			colgroupContent = new BasicFeatureMap(this, Jats1Package.COLGROUP_TYPE__COLGROUP_CONTENT);
		}
		return colgroupContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColType> getCol() {
		return getColgroupContent().list(Jats1Package.eINSTANCE.getColgroupType_Col());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.COLGROUP_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
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
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharoff(String newCharoff) {
		String oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__CHAROFF, oldCharoff, charoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpan(String newSpan) {
		String oldSpan = span;
		span = newSpan;
		boolean oldSpanESet = spanESet;
		spanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__SPAN, oldSpan, span, !oldSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpan() {
		String oldSpan = span;
		boolean oldSpanESet = spanESet;
		span = SPAN_EDEFAULT;
		spanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.COLGROUP_TYPE__SPAN, oldSpan, SPAN_EDEFAULT, oldSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpan() {
		return spanESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValignType3 getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValign(ValignType3 newValign) {
		ValignType3 oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValign() {
		ValignType3 oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.COLGROUP_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValign() {
		return valignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.COLGROUP_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.COLGROUP_TYPE__COLGROUP_CONTENT:
				return ((InternalEList<?>)getColgroupContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.COLGROUP_TYPE__COL:
				return ((InternalEList<?>)getCol()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.COLGROUP_TYPE__COLGROUP_CONTENT:
				if (coreType) return getColgroupContent();
				return ((FeatureMap.Internal)getColgroupContent()).getWrapper();
			case Jats1Package.COLGROUP_TYPE__COL:
				return getCol();
			case Jats1Package.COLGROUP_TYPE__ALIGN:
				return getAlign();
			case Jats1Package.COLGROUP_TYPE__BASE:
				return getBase();
			case Jats1Package.COLGROUP_TYPE__CHAR:
				return getChar();
			case Jats1Package.COLGROUP_TYPE__CHAROFF:
				return getCharoff();
			case Jats1Package.COLGROUP_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.COLGROUP_TYPE__ID:
				return getId();
			case Jats1Package.COLGROUP_TYPE__SPAN:
				return getSpan();
			case Jats1Package.COLGROUP_TYPE__STYLE:
				return getStyle();
			case Jats1Package.COLGROUP_TYPE__VALIGN:
				return getValign();
			case Jats1Package.COLGROUP_TYPE__WIDTH:
				return getWidth();
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
			case Jats1Package.COLGROUP_TYPE__COLGROUP_CONTENT:
				((FeatureMap.Internal)getColgroupContent()).set(newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__COL:
				getCol().clear();
				getCol().addAll((Collection<? extends ColType>)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__ALIGN:
				setAlign((AlignType1)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__CHAROFF:
				setCharoff((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__SPAN:
				setSpan((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__VALIGN:
				setValign((ValignType3)newValue);
				return;
			case Jats1Package.COLGROUP_TYPE__WIDTH:
				setWidth((String)newValue);
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
			case Jats1Package.COLGROUP_TYPE__COLGROUP_CONTENT:
				getColgroupContent().clear();
				return;
			case Jats1Package.COLGROUP_TYPE__COL:
				getCol().clear();
				return;
			case Jats1Package.COLGROUP_TYPE__ALIGN:
				unsetAlign();
				return;
			case Jats1Package.COLGROUP_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.COLGROUP_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case Jats1Package.COLGROUP_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case Jats1Package.COLGROUP_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.COLGROUP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.COLGROUP_TYPE__SPAN:
				unsetSpan();
				return;
			case Jats1Package.COLGROUP_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.COLGROUP_TYPE__VALIGN:
				unsetValign();
				return;
			case Jats1Package.COLGROUP_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case Jats1Package.COLGROUP_TYPE__COLGROUP_CONTENT:
				return colgroupContent != null && !colgroupContent.isEmpty();
			case Jats1Package.COLGROUP_TYPE__COL:
				return !getCol().isEmpty();
			case Jats1Package.COLGROUP_TYPE__ALIGN:
				return isSetAlign();
			case Jats1Package.COLGROUP_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.COLGROUP_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case Jats1Package.COLGROUP_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case Jats1Package.COLGROUP_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.COLGROUP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.COLGROUP_TYPE__SPAN:
				return isSetSpan();
			case Jats1Package.COLGROUP_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.COLGROUP_TYPE__VALIGN:
				return isSetValign();
			case Jats1Package.COLGROUP_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (colgroupContent: ");
		result.append(colgroupContent);
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", base: ");
		result.append(base);
		result.append(", char: ");
		result.append(char_);
		result.append(", charoff: ");
		result.append(charoff);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", span: ");
		if (spanESet) result.append(span); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ColgroupTypeImpl
