/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.GlyphDataType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xml._1998.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glyph Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getFontchar <em>Fontchar</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getFontname <em>Fontname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getXSize <em>XSize</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.GlyphDataTypeImpl#getYSize <em>YSize</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlyphDataTypeImpl extends MinimalEObjectImpl.Container implements GlyphDataType {
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
	 * The default value of the '{@link #getFontchar() <em>Fontchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontchar()
	 * @generated
	 * @ordered
	 */
	protected static final String FONTCHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontchar() <em>Fontchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontchar()
	 * @generated
	 * @ordered
	 */
	protected String fontchar = FONTCHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontname() <em>Fontname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontname()
	 * @generated
	 * @ordered
	 */
	protected static final String FONTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontname() <em>Fontname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontname()
	 * @generated
	 * @ordered
	 */
	protected String fontname = FONTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.PRESERVE;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

	/**
	 * The default value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected static final String XSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected String xSize = XSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected static final String YSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected String ySize = YSIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlyphDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getGlyphDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Jats1Package.GLYPH_DATA_TYPE__MIXED);
		}
		return mixed;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontchar() {
		return fontchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontchar(String newFontchar) {
		String oldFontchar = fontchar;
		fontchar = newFontchar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__FONTCHAR, oldFontchar, fontchar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontname() {
		return fontname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontname(String newFontname) {
		String oldFontname = fontname;
		fontname = newFontname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__FONTNAME, oldFontname, fontname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__FORMAT, oldFormat, format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.GLYPH_DATA_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXSize() {
		return xSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXSize(String newXSize) {
		String oldXSize = xSize;
		xSize = newXSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__XSIZE, oldXSize, xSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYSize() {
		return ySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYSize(String newYSize) {
		String oldYSize = ySize;
		ySize = newYSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.GLYPH_DATA_TYPE__YSIZE, oldYSize, ySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.GLYPH_DATA_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.GLYPH_DATA_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Jats1Package.GLYPH_DATA_TYPE__BASE:
				return getBase();
			case Jats1Package.GLYPH_DATA_TYPE__FONTCHAR:
				return getFontchar();
			case Jats1Package.GLYPH_DATA_TYPE__FONTNAME:
				return getFontname();
			case Jats1Package.GLYPH_DATA_TYPE__FORMAT:
				return getFormat();
			case Jats1Package.GLYPH_DATA_TYPE__ID:
				return getId();
			case Jats1Package.GLYPH_DATA_TYPE__RESOLUTION:
				return getResolution();
			case Jats1Package.GLYPH_DATA_TYPE__SPACE:
				return getSpace();
			case Jats1Package.GLYPH_DATA_TYPE__XSIZE:
				return getXSize();
			case Jats1Package.GLYPH_DATA_TYPE__YSIZE:
				return getYSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Jats1Package.GLYPH_DATA_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__FONTCHAR:
				setFontchar((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__FONTNAME:
				setFontname((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__FORMAT:
				setFormat((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__RESOLUTION:
				setResolution((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__XSIZE:
				setXSize((String)newValue);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__YSIZE:
				setYSize((String)newValue);
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
			case Jats1Package.GLYPH_DATA_TYPE__MIXED:
				getMixed().clear();
				return;
			case Jats1Package.GLYPH_DATA_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__FONTCHAR:
				setFontchar(FONTCHAR_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__FONTNAME:
				setFontname(FONTNAME_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__SPACE:
				unsetSpace();
				return;
			case Jats1Package.GLYPH_DATA_TYPE__XSIZE:
				setXSize(XSIZE_EDEFAULT);
				return;
			case Jats1Package.GLYPH_DATA_TYPE__YSIZE:
				setYSize(YSIZE_EDEFAULT);
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
			case Jats1Package.GLYPH_DATA_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Jats1Package.GLYPH_DATA_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.GLYPH_DATA_TYPE__FONTCHAR:
				return FONTCHAR_EDEFAULT == null ? fontchar != null : !FONTCHAR_EDEFAULT.equals(fontchar);
			case Jats1Package.GLYPH_DATA_TYPE__FONTNAME:
				return FONTNAME_EDEFAULT == null ? fontname != null : !FONTNAME_EDEFAULT.equals(fontname);
			case Jats1Package.GLYPH_DATA_TYPE__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case Jats1Package.GLYPH_DATA_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.GLYPH_DATA_TYPE__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case Jats1Package.GLYPH_DATA_TYPE__SPACE:
				return isSetSpace();
			case Jats1Package.GLYPH_DATA_TYPE__XSIZE:
				return XSIZE_EDEFAULT == null ? xSize != null : !XSIZE_EDEFAULT.equals(xSize);
			case Jats1Package.GLYPH_DATA_TYPE__YSIZE:
				return YSIZE_EDEFAULT == null ? ySize != null : !YSIZE_EDEFAULT.equals(ySize);
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
		result.append(", base: ");
		result.append(base);
		result.append(", fontchar: ");
		result.append(fontchar);
		result.append(", fontname: ");
		result.append(fontname);
		result.append(", format: ");
		result.append(format);
		result.append(", id: ");
		result.append(id);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", xSize: ");
		result.append(xSize);
		result.append(", ySize: ");
		result.append(ySize);
		result.append(')');
		return result.toString();
	}

} //GlyphDataTypeImpl
