/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.GlyphDataType;
import gov.nih.nlm.ncbi.jats1.GlyphRefType;
import gov.nih.nlm.ncbi.jats1.InlineGraphicType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.PrivateCharType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Char Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getGlyphData <em>Glyph Data</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getGlyphRef <em>Glyph Ref</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getInlineGraphic <em>Inline Graphic</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.PrivateCharTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateCharTypeImpl extends MinimalEObjectImpl.Container implements PrivateCharType {
	/**
	 * The cached value of the '{@link #getGlyphData() <em>Glyph Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyphData()
	 * @generated
	 * @ordered
	 */
	protected GlyphDataType glyphData;

	/**
	 * The cached value of the '{@link #getGlyphRef() <em>Glyph Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyphRef()
	 * @generated
	 * @ordered
	 */
	protected GlyphRefType glyphRef;

	/**
	 * The cached value of the '{@link #getInlineGraphic() <em>Inline Graphic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineGraphic()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineGraphicType> inlineGraphic;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificUse() <em>Specific Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUse()
	 * @generated
	 * @ordered
	 */
	protected String specificUse = SPECIFIC_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateCharTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getPrivateCharType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphDataType getGlyphData() {
		return glyphData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlyphData(GlyphDataType newGlyphData, NotificationChain msgs) {
		GlyphDataType oldGlyphData = glyphData;
		glyphData = newGlyphData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA, oldGlyphData, newGlyphData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlyphData(GlyphDataType newGlyphData) {
		if (newGlyphData != glyphData) {
			NotificationChain msgs = null;
			if (glyphData != null)
				msgs = ((InternalEObject)glyphData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA, null, msgs);
			if (newGlyphData != null)
				msgs = ((InternalEObject)newGlyphData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA, null, msgs);
			msgs = basicSetGlyphData(newGlyphData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA, newGlyphData, newGlyphData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphRefType getGlyphRef() {
		return glyphRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlyphRef(GlyphRefType newGlyphRef, NotificationChain msgs) {
		GlyphRefType oldGlyphRef = glyphRef;
		glyphRef = newGlyphRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF, oldGlyphRef, newGlyphRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlyphRef(GlyphRefType newGlyphRef) {
		if (newGlyphRef != glyphRef) {
			NotificationChain msgs = null;
			if (glyphRef != null)
				msgs = ((InternalEObject)glyphRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF, null, msgs);
			if (newGlyphRef != null)
				msgs = ((InternalEObject)newGlyphRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF, null, msgs);
			msgs = basicSetGlyphRef(newGlyphRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF, newGlyphRef, newGlyphRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineGraphicType> getInlineGraphic() {
		if (inlineGraphic == null) {
			inlineGraphic = new EObjectContainmentEList<InlineGraphicType>(InlineGraphicType.class, this, Jats1Package.PRIVATE_CHAR_TYPE__INLINE_GRAPHIC);
		}
		return inlineGraphic;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecificUse() {
		return specificUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificUse(String newSpecificUse) {
		String oldSpecificUse = specificUse;
		specificUse = newSpecificUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.PRIVATE_CHAR_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA:
				return basicSetGlyphData(null, msgs);
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF:
				return basicSetGlyphRef(null, msgs);
			case Jats1Package.PRIVATE_CHAR_TYPE__INLINE_GRAPHIC:
				return ((InternalEList<?>)getInlineGraphic()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA:
				return getGlyphData();
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF:
				return getGlyphRef();
			case Jats1Package.PRIVATE_CHAR_TYPE__INLINE_GRAPHIC:
				return getInlineGraphic();
			case Jats1Package.PRIVATE_CHAR_TYPE__BASE:
				return getBase();
			case Jats1Package.PRIVATE_CHAR_TYPE__DESCRIPTION:
				return getDescription();
			case Jats1Package.PRIVATE_CHAR_TYPE__ID:
				return getId();
			case Jats1Package.PRIVATE_CHAR_TYPE__NAME:
				return getName();
			case Jats1Package.PRIVATE_CHAR_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA:
				setGlyphData((GlyphDataType)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF:
				setGlyphRef((GlyphRefType)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				getInlineGraphic().addAll((Collection<? extends InlineGraphicType>)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__NAME:
				setName((String)newValue);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__SPECIFIC_USE:
				setSpecificUse((String)newValue);
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
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA:
				setGlyphData((GlyphDataType)null);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF:
				setGlyphRef((GlyphRefType)null);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__INLINE_GRAPHIC:
				getInlineGraphic().clear();
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Jats1Package.PRIVATE_CHAR_TYPE__SPECIFIC_USE:
				setSpecificUse(SPECIFIC_USE_EDEFAULT);
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
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_DATA:
				return glyphData != null;
			case Jats1Package.PRIVATE_CHAR_TYPE__GLYPH_REF:
				return glyphRef != null;
			case Jats1Package.PRIVATE_CHAR_TYPE__INLINE_GRAPHIC:
				return inlineGraphic != null && !inlineGraphic.isEmpty();
			case Jats1Package.PRIVATE_CHAR_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.PRIVATE_CHAR_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Jats1Package.PRIVATE_CHAR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.PRIVATE_CHAR_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Jats1Package.PRIVATE_CHAR_TYPE__SPECIFIC_USE:
				return SPECIFIC_USE_EDEFAULT == null ? specificUse != null : !SPECIFIC_USE_EDEFAULT.equals(specificUse);
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
		result.append(" (base: ");
		result.append(base);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //PrivateCharTypeImpl
