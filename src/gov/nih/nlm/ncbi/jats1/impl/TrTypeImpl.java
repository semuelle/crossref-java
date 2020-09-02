/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AlignType6;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.TdType;
import gov.nih.nlm.ncbi.jats1.ThType;
import gov.nih.nlm.ncbi.jats1.TrType;
import gov.nih.nlm.ncbi.jats1.ValignType;

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
 * An implementation of the model object '<em><b>Tr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getTrContent <em>Tr Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getTh <em>Th</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getTd <em>Td</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TrTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrTypeImpl extends MinimalEObjectImpl.Container implements TrType {
	/**
	 * The cached value of the '{@link #getTrContent() <em>Tr Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrContent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap trContent;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType6 ALIGN_EDEFAULT = AlignType6.CENTER;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType6 align = ALIGN_EDEFAULT;

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
	protected static final ValignType VALIGN_EDEFAULT = ValignType.BASELINE;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTrType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTrContent() {
		if (trContent == null) {
			trContent = new BasicFeatureMap(this, Jats1Package.TR_TYPE__TR_CONTENT);
		}
		return trContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThType> getTh() {
		return getTrContent().list(Jats1Package.eINSTANCE.getTrType_Th());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TdType> getTd() {
		return getTrContent().list(Jats1Package.eINSTANCE.getTrType_Td());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignType6 getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(AlignType6 newAlign) {
		AlignType6 oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlign() {
		AlignType6 oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TR_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__CHAR, oldChar, char_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__CHAROFF, oldCharoff, charoff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValignType getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValign(ValignType newValign) {
		ValignType oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TR_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValign() {
		ValignType oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TR_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.TR_TYPE__TR_CONTENT:
				return ((InternalEList<?>)getTrContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.TR_TYPE__TH:
				return ((InternalEList<?>)getTh()).basicRemove(otherEnd, msgs);
			case Jats1Package.TR_TYPE__TD:
				return ((InternalEList<?>)getTd()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.TR_TYPE__TR_CONTENT:
				if (coreType) return getTrContent();
				return ((FeatureMap.Internal)getTrContent()).getWrapper();
			case Jats1Package.TR_TYPE__TH:
				return getTh();
			case Jats1Package.TR_TYPE__TD:
				return getTd();
			case Jats1Package.TR_TYPE__ALIGN:
				return getAlign();
			case Jats1Package.TR_TYPE__BASE:
				return getBase();
			case Jats1Package.TR_TYPE__CHAR:
				return getChar();
			case Jats1Package.TR_TYPE__CHAROFF:
				return getCharoff();
			case Jats1Package.TR_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.TR_TYPE__ID:
				return getId();
			case Jats1Package.TR_TYPE__STYLE:
				return getStyle();
			case Jats1Package.TR_TYPE__VALIGN:
				return getValign();
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
			case Jats1Package.TR_TYPE__TR_CONTENT:
				((FeatureMap.Internal)getTrContent()).set(newValue);
				return;
			case Jats1Package.TR_TYPE__TH:
				getTh().clear();
				getTh().addAll((Collection<? extends ThType>)newValue);
				return;
			case Jats1Package.TR_TYPE__TD:
				getTd().clear();
				getTd().addAll((Collection<? extends TdType>)newValue);
				return;
			case Jats1Package.TR_TYPE__ALIGN:
				setAlign((AlignType6)newValue);
				return;
			case Jats1Package.TR_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TR_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case Jats1Package.TR_TYPE__CHAROFF:
				setCharoff((String)newValue);
				return;
			case Jats1Package.TR_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.TR_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TR_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.TR_TYPE__VALIGN:
				setValign((ValignType)newValue);
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
			case Jats1Package.TR_TYPE__TR_CONTENT:
				getTrContent().clear();
				return;
			case Jats1Package.TR_TYPE__TH:
				getTh().clear();
				return;
			case Jats1Package.TR_TYPE__TD:
				getTd().clear();
				return;
			case Jats1Package.TR_TYPE__ALIGN:
				unsetAlign();
				return;
			case Jats1Package.TR_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TR_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case Jats1Package.TR_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case Jats1Package.TR_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.TR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TR_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.TR_TYPE__VALIGN:
				unsetValign();
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
			case Jats1Package.TR_TYPE__TR_CONTENT:
				return trContent != null && !trContent.isEmpty();
			case Jats1Package.TR_TYPE__TH:
				return !getTh().isEmpty();
			case Jats1Package.TR_TYPE__TD:
				return !getTd().isEmpty();
			case Jats1Package.TR_TYPE__ALIGN:
				return isSetAlign();
			case Jats1Package.TR_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TR_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case Jats1Package.TR_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case Jats1Package.TR_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.TR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TR_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.TR_TYPE__VALIGN:
				return isSetValign();
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
		result.append(" (trContent: ");
		result.append(trContent);
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
		result.append(", style: ");
		result.append(style);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TrTypeImpl
