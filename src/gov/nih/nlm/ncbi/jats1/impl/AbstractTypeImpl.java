/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.AbstractType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.LabelType;
import gov.nih.nlm.ncbi.jats1.PType;
import gov.nih.nlm.ncbi.jats1.SecType;
import gov.nih.nlm.ncbi.jats1.TitleType;

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
 * An implementation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getJustParaClass <em>Just Para Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getSecClass <em>Sec Class</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getSec <em>Sec</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.AbstractTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTypeImpl extends MinimalEObjectImpl.Container implements AbstractType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getJustParaClass() <em>Just Para Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustParaClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap justParaClass;

	/**
	 * The cached value of the '{@link #getSecClass() <em>Sec Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecClass()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap secClass;

	/**
	 * The default value of the '{@link #getAbstractType() <em>Abstract Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractType()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractType() <em>Abstract Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractType()
	 * @generated
	 * @ordered
	 */
	protected String abstractType = ABSTRACT_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

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
	protected AbstractTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getAbstractType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		LabelType oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__LABEL, oldLabel, newLabel);
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
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ABSTRACT_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ABSTRACT_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ABSTRACT_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.ABSTRACT_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getJustParaClass() {
		if (justParaClass == null) {
			justParaClass = new BasicFeatureMap(this, Jats1Package.ABSTRACT_TYPE__JUST_PARA_CLASS);
		}
		return justParaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PType> getP() {
		return getJustParaClass().list(Jats1Package.eINSTANCE.getAbstractType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSecClass() {
		if (secClass == null) {
			secClass = new BasicFeatureMap(this, Jats1Package.ABSTRACT_TYPE__SEC_CLASS);
		}
		return secClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecType> getSec() {
		return getSecClass().list(Jats1Package.eINSTANCE.getAbstractType_Sec());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstractType() {
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractType(String newAbstractType) {
		String oldAbstractType = abstractType;
		abstractType = newAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__ABSTRACT_TYPE, oldAbstractType, abstractType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.ABSTRACT_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.ABSTRACT_TYPE__LABEL:
				return basicSetLabel(null, msgs);
			case Jats1Package.ABSTRACT_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Jats1Package.ABSTRACT_TYPE__JUST_PARA_CLASS:
				return ((InternalEList<?>)getJustParaClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ABSTRACT_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Jats1Package.ABSTRACT_TYPE__SEC_CLASS:
				return ((InternalEList<?>)getSecClass()).basicRemove(otherEnd, msgs);
			case Jats1Package.ABSTRACT_TYPE__SEC:
				return ((InternalEList<?>)getSec()).basicRemove(otherEnd, msgs);
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
			case Jats1Package.ABSTRACT_TYPE__LABEL:
				return getLabel();
			case Jats1Package.ABSTRACT_TYPE__TITLE:
				return getTitle();
			case Jats1Package.ABSTRACT_TYPE__JUST_PARA_CLASS:
				if (coreType) return getJustParaClass();
				return ((FeatureMap.Internal)getJustParaClass()).getWrapper();
			case Jats1Package.ABSTRACT_TYPE__P:
				return getP();
			case Jats1Package.ABSTRACT_TYPE__SEC_CLASS:
				if (coreType) return getSecClass();
				return ((FeatureMap.Internal)getSecClass()).getWrapper();
			case Jats1Package.ABSTRACT_TYPE__SEC:
				return getSec();
			case Jats1Package.ABSTRACT_TYPE__ABSTRACT_TYPE:
				return getAbstractType();
			case Jats1Package.ABSTRACT_TYPE__BASE:
				return getBase();
			case Jats1Package.ABSTRACT_TYPE__ID:
				return getId();
			case Jats1Package.ABSTRACT_TYPE__LANG:
				return getLang();
			case Jats1Package.ABSTRACT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ABSTRACT_TYPE__LABEL:
				setLabel((LabelType)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__JUST_PARA_CLASS:
				((FeatureMap.Internal)getJustParaClass()).set(newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__SEC_CLASS:
				((FeatureMap.Internal)getSecClass()).set(newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__SEC:
				getSec().clear();
				getSec().addAll((Collection<? extends SecType>)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__ABSTRACT_TYPE:
				setAbstractType((String)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.ABSTRACT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ABSTRACT_TYPE__LABEL:
				setLabel((LabelType)null);
				return;
			case Jats1Package.ABSTRACT_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Jats1Package.ABSTRACT_TYPE__JUST_PARA_CLASS:
				getJustParaClass().clear();
				return;
			case Jats1Package.ABSTRACT_TYPE__P:
				getP().clear();
				return;
			case Jats1Package.ABSTRACT_TYPE__SEC_CLASS:
				getSecClass().clear();
				return;
			case Jats1Package.ABSTRACT_TYPE__SEC:
				getSec().clear();
				return;
			case Jats1Package.ABSTRACT_TYPE__ABSTRACT_TYPE:
				setAbstractType(ABSTRACT_TYPE_EDEFAULT);
				return;
			case Jats1Package.ABSTRACT_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.ABSTRACT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.ABSTRACT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.ABSTRACT_TYPE__SPECIFIC_USE:
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
			case Jats1Package.ABSTRACT_TYPE__LABEL:
				return label != null;
			case Jats1Package.ABSTRACT_TYPE__TITLE:
				return title != null;
			case Jats1Package.ABSTRACT_TYPE__JUST_PARA_CLASS:
				return justParaClass != null && !justParaClass.isEmpty();
			case Jats1Package.ABSTRACT_TYPE__P:
				return !getP().isEmpty();
			case Jats1Package.ABSTRACT_TYPE__SEC_CLASS:
				return secClass != null && !secClass.isEmpty();
			case Jats1Package.ABSTRACT_TYPE__SEC:
				return !getSec().isEmpty();
			case Jats1Package.ABSTRACT_TYPE__ABSTRACT_TYPE:
				return ABSTRACT_TYPE_EDEFAULT == null ? abstractType != null : !ABSTRACT_TYPE_EDEFAULT.equals(abstractType);
			case Jats1Package.ABSTRACT_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.ABSTRACT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.ABSTRACT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.ABSTRACT_TYPE__SPECIFIC_USE:
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
		result.append(" (justParaClass: ");
		result.append(justParaClass);
		result.append(", secClass: ");
		result.append(secClass);
		result.append(", abstractType: ");
		result.append(abstractType);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //AbstractTypeImpl
