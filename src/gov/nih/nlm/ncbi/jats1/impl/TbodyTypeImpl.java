/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AlignType3;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.TbodyType;
import gov.nih.nlm.ncbi.jats1.TrType;
import gov.nih.nlm.ncbi.jats1.ValignType5;

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
 * An implementation of the model object '<em><b>Tbody Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getTbodyContent <em>Tbody Content</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.TbodyTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TbodyTypeImpl extends MinimalEObjectImpl.Container implements TbodyType {
	/**
	 * The cached value of the '{@link #getTbodyContent() <em>Tbody Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbodyContent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap tbodyContent;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType3 ALIGN_EDEFAULT = AlignType3.CENTER;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType3 align = ALIGN_EDEFAULT;

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
	protected static final ValignType5 VALIGN_EDEFAULT = ValignType5.BASELINE;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType5 valign = VALIGN_EDEFAULT;

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
	protected TbodyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getTbodyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTbodyContent() {
		if (tbodyContent == null) {
			tbodyContent = new BasicFeatureMap(this, Jats1Package.TBODY_TYPE__TBODY_CONTENT);
		}
		return tbodyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrType> getTr() {
		return getTbodyContent().list(Jats1Package.eINSTANCE.getTbodyType_Tr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignType3 getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(AlignType3 newAlign) {
		AlignType3 oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlign() {
		AlignType3 oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TBODY_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__CHAR, oldChar, char_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__CHAROFF, oldCharoff, charoff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValignType5 getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValign(ValignType5 newValign) {
		ValignType5 oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.TBODY_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValign() {
		ValignType5 oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.TBODY_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
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
			case Jats1Package.TBODY_TYPE__TBODY_CONTENT:
				return ((InternalEList<?>)getTbodyContent()).basicRemove(otherEnd, msgs);
			case Jats1Package.TBODY_TYPE__TR:
				return ((InternalEList<?>)getTr()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.TBODY_TYPE__TBODY_CONTENT:
				if (coreType) return getTbodyContent();
				return ((FeatureMap.Internal)getTbodyContent()).getWrapper();
			case Jats1Package.TBODY_TYPE__TR:
				return getTr();
			case Jats1Package.TBODY_TYPE__ALIGN:
				return getAlign();
			case Jats1Package.TBODY_TYPE__BASE:
				return getBase();
			case Jats1Package.TBODY_TYPE__CHAR:
				return getChar();
			case Jats1Package.TBODY_TYPE__CHAROFF:
				return getCharoff();
			case Jats1Package.TBODY_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.TBODY_TYPE__ID:
				return getId();
			case Jats1Package.TBODY_TYPE__STYLE:
				return getStyle();
			case Jats1Package.TBODY_TYPE__VALIGN:
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
			case Jats1Package.TBODY_TYPE__TBODY_CONTENT:
				((FeatureMap.Internal)getTbodyContent()).set(newValue);
				return;
			case Jats1Package.TBODY_TYPE__TR:
				getTr().clear();
				getTr().addAll((Collection<? extends TrType>)newValue);
				return;
			case Jats1Package.TBODY_TYPE__ALIGN:
				setAlign((AlignType3)newValue);
				return;
			case Jats1Package.TBODY_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.TBODY_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case Jats1Package.TBODY_TYPE__CHAROFF:
				setCharoff((String)newValue);
				return;
			case Jats1Package.TBODY_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.TBODY_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.TBODY_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Jats1Package.TBODY_TYPE__VALIGN:
				setValign((ValignType5)newValue);
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
			case Jats1Package.TBODY_TYPE__TBODY_CONTENT:
				getTbodyContent().clear();
				return;
			case Jats1Package.TBODY_TYPE__TR:
				getTr().clear();
				return;
			case Jats1Package.TBODY_TYPE__ALIGN:
				unsetAlign();
				return;
			case Jats1Package.TBODY_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.TBODY_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case Jats1Package.TBODY_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case Jats1Package.TBODY_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.TBODY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.TBODY_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Jats1Package.TBODY_TYPE__VALIGN:
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
			case Jats1Package.TBODY_TYPE__TBODY_CONTENT:
				return tbodyContent != null && !tbodyContent.isEmpty();
			case Jats1Package.TBODY_TYPE__TR:
				return !getTr().isEmpty();
			case Jats1Package.TBODY_TYPE__ALIGN:
				return isSetAlign();
			case Jats1Package.TBODY_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.TBODY_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case Jats1Package.TBODY_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case Jats1Package.TBODY_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.TBODY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.TBODY_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Jats1Package.TBODY_TYPE__VALIGN:
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
		result.append(" (tbodyContent: ");
		result.append(tbodyContent);
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

} //TbodyTypeImpl
