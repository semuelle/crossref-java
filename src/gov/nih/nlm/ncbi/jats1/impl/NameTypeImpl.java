/**
 */
package gov.nih.nlm.ncbi.jats1.impl;

import gov.nih.nlm.ncbi.jats1.GivenNamesType;
import gov.nih.nlm.ncbi.jats1.Jats1Package;
import gov.nih.nlm.ncbi.jats1.NameStyleType1;
import gov.nih.nlm.ncbi.jats1.NameType;
import gov.nih.nlm.ncbi.jats1.PrefixType;
import gov.nih.nlm.ncbi.jats1.SuffixType;
import gov.nih.nlm.ncbi.jats1.SurnameType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getGivenNames <em>Given Names</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getGivenNames1 <em>Given Names1</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link gov.nih.nlm.ncbi.jats1.impl.NameTypeImpl#getSpecificUse <em>Specific Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameTypeImpl extends MinimalEObjectImpl.Container implements NameType {
	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected SurnameType surname;

	/**
	 * The cached value of the '{@link #getGivenNames() <em>Given Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenNames()
	 * @generated
	 * @ordered
	 */
	protected GivenNamesType givenNames;

	/**
	 * The cached value of the '{@link #getGivenNames1() <em>Given Names1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenNames1()
	 * @generated
	 * @ordered
	 */
	protected GivenNamesType givenNames1;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected PrefixType prefix;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected SuffixType suffix;

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
	 * The default value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final NameStyleType1 NAME_STYLE_EDEFAULT = NameStyleType1.WESTERN;

	/**
	 * The cached value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected NameStyleType1 nameStyle = NAME_STYLE_EDEFAULT;

	/**
	 * This is true if the Name Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameStyleESet;

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
	protected NameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jats1Package.eINSTANCE.getNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurnameType getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurname(SurnameType newSurname, NotificationChain msgs) {
		SurnameType oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__SURNAME, oldSurname, newSurname);
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
	public void setSurname(SurnameType newSurname) {
		if (newSurname != surname) {
			NotificationChain msgs = null;
			if (surname != null)
				msgs = ((InternalEObject)surname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__SURNAME, null, msgs);
			if (newSurname != null)
				msgs = ((InternalEObject)newSurname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__SURNAME, null, msgs);
			msgs = basicSetSurname(newSurname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__SURNAME, newSurname, newSurname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GivenNamesType getGivenNames() {
		return givenNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGivenNames(GivenNamesType newGivenNames, NotificationChain msgs) {
		GivenNamesType oldGivenNames = givenNames;
		givenNames = newGivenNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__GIVEN_NAMES, oldGivenNames, newGivenNames);
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
	public void setGivenNames(GivenNamesType newGivenNames) {
		if (newGivenNames != givenNames) {
			NotificationChain msgs = null;
			if (givenNames != null)
				msgs = ((InternalEObject)givenNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__GIVEN_NAMES, null, msgs);
			if (newGivenNames != null)
				msgs = ((InternalEObject)newGivenNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__GIVEN_NAMES, null, msgs);
			msgs = basicSetGivenNames(newGivenNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__GIVEN_NAMES, newGivenNames, newGivenNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GivenNamesType getGivenNames1() {
		return givenNames1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGivenNames1(GivenNamesType newGivenNames1, NotificationChain msgs) {
		GivenNamesType oldGivenNames1 = givenNames1;
		givenNames1 = newGivenNames1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__GIVEN_NAMES1, oldGivenNames1, newGivenNames1);
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
	public void setGivenNames1(GivenNamesType newGivenNames1) {
		if (newGivenNames1 != givenNames1) {
			NotificationChain msgs = null;
			if (givenNames1 != null)
				msgs = ((InternalEObject)givenNames1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__GIVEN_NAMES1, null, msgs);
			if (newGivenNames1 != null)
				msgs = ((InternalEObject)newGivenNames1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__GIVEN_NAMES1, null, msgs);
			msgs = basicSetGivenNames1(newGivenNames1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__GIVEN_NAMES1, newGivenNames1, newGivenNames1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixType getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(PrefixType newPrefix, NotificationChain msgs) {
		PrefixType oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__PREFIX, oldPrefix, newPrefix);
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
	public void setPrefix(PrefixType newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuffixType getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffix(SuffixType newSuffix, NotificationChain msgs) {
		SuffixType oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__SUFFIX, oldSuffix, newSuffix);
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
	public void setSuffix(SuffixType newSuffix) {
		if (newSuffix != suffix) {
			NotificationChain msgs = null;
			if (suffix != null)
				msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__SUFFIX, null, msgs);
			if (newSuffix != null)
				msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Jats1Package.NAME_TYPE__SUFFIX, null, msgs);
			msgs = basicSetSuffix(newSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__SUFFIX, newSuffix, newSuffix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameStyleType1 getNameStyle() {
		return nameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameStyle(NameStyleType1 newNameStyle) {
		NameStyleType1 oldNameStyle = nameStyle;
		nameStyle = newNameStyle == null ? NAME_STYLE_EDEFAULT : newNameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__NAME_STYLE, oldNameStyle, nameStyle, !oldNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNameStyle() {
		NameStyleType1 oldNameStyle = nameStyle;
		boolean oldNameStyleESet = nameStyleESet;
		nameStyle = NAME_STYLE_EDEFAULT;
		nameStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Jats1Package.NAME_TYPE__NAME_STYLE, oldNameStyle, NAME_STYLE_EDEFAULT, oldNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNameStyle() {
		return nameStyleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jats1Package.NAME_TYPE__SPECIFIC_USE, oldSpecificUse, specificUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Jats1Package.NAME_TYPE__SURNAME:
				return basicSetSurname(null, msgs);
			case Jats1Package.NAME_TYPE__GIVEN_NAMES:
				return basicSetGivenNames(null, msgs);
			case Jats1Package.NAME_TYPE__GIVEN_NAMES1:
				return basicSetGivenNames1(null, msgs);
			case Jats1Package.NAME_TYPE__PREFIX:
				return basicSetPrefix(null, msgs);
			case Jats1Package.NAME_TYPE__SUFFIX:
				return basicSetSuffix(null, msgs);
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
			case Jats1Package.NAME_TYPE__SURNAME:
				return getSurname();
			case Jats1Package.NAME_TYPE__GIVEN_NAMES:
				return getGivenNames();
			case Jats1Package.NAME_TYPE__GIVEN_NAMES1:
				return getGivenNames1();
			case Jats1Package.NAME_TYPE__PREFIX:
				return getPrefix();
			case Jats1Package.NAME_TYPE__SUFFIX:
				return getSuffix();
			case Jats1Package.NAME_TYPE__BASE:
				return getBase();
			case Jats1Package.NAME_TYPE__CONTENT_TYPE:
				return getContentType();
			case Jats1Package.NAME_TYPE__ID:
				return getId();
			case Jats1Package.NAME_TYPE__LANG:
				return getLang();
			case Jats1Package.NAME_TYPE__NAME_STYLE:
				return getNameStyle();
			case Jats1Package.NAME_TYPE__SPECIFIC_USE:
				return getSpecificUse();
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
			case Jats1Package.NAME_TYPE__SURNAME:
				setSurname((SurnameType)newValue);
				return;
			case Jats1Package.NAME_TYPE__GIVEN_NAMES:
				setGivenNames((GivenNamesType)newValue);
				return;
			case Jats1Package.NAME_TYPE__GIVEN_NAMES1:
				setGivenNames1((GivenNamesType)newValue);
				return;
			case Jats1Package.NAME_TYPE__PREFIX:
				setPrefix((PrefixType)newValue);
				return;
			case Jats1Package.NAME_TYPE__SUFFIX:
				setSuffix((SuffixType)newValue);
				return;
			case Jats1Package.NAME_TYPE__BASE:
				setBase((String)newValue);
				return;
			case Jats1Package.NAME_TYPE__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Jats1Package.NAME_TYPE__ID:
				setId((String)newValue);
				return;
			case Jats1Package.NAME_TYPE__LANG:
				setLang(newValue);
				return;
			case Jats1Package.NAME_TYPE__NAME_STYLE:
				setNameStyle((NameStyleType1)newValue);
				return;
			case Jats1Package.NAME_TYPE__SPECIFIC_USE:
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
			case Jats1Package.NAME_TYPE__SURNAME:
				setSurname((SurnameType)null);
				return;
			case Jats1Package.NAME_TYPE__GIVEN_NAMES:
				setGivenNames((GivenNamesType)null);
				return;
			case Jats1Package.NAME_TYPE__GIVEN_NAMES1:
				setGivenNames1((GivenNamesType)null);
				return;
			case Jats1Package.NAME_TYPE__PREFIX:
				setPrefix((PrefixType)null);
				return;
			case Jats1Package.NAME_TYPE__SUFFIX:
				setSuffix((SuffixType)null);
				return;
			case Jats1Package.NAME_TYPE__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case Jats1Package.NAME_TYPE__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Jats1Package.NAME_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Jats1Package.NAME_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Jats1Package.NAME_TYPE__NAME_STYLE:
				unsetNameStyle();
				return;
			case Jats1Package.NAME_TYPE__SPECIFIC_USE:
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
			case Jats1Package.NAME_TYPE__SURNAME:
				return surname != null;
			case Jats1Package.NAME_TYPE__GIVEN_NAMES:
				return givenNames != null;
			case Jats1Package.NAME_TYPE__GIVEN_NAMES1:
				return givenNames1 != null;
			case Jats1Package.NAME_TYPE__PREFIX:
				return prefix != null;
			case Jats1Package.NAME_TYPE__SUFFIX:
				return suffix != null;
			case Jats1Package.NAME_TYPE__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case Jats1Package.NAME_TYPE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Jats1Package.NAME_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Jats1Package.NAME_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Jats1Package.NAME_TYPE__NAME_STYLE:
				return isSetNameStyle();
			case Jats1Package.NAME_TYPE__SPECIFIC_USE:
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
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", nameStyle: ");
		if (nameStyleESet) result.append(nameStyle); else result.append("<unset>");
		result.append(", specificUse: ");
		result.append(specificUse);
		result.append(')');
		return result.toString();
	}

} //NameTypeImpl
